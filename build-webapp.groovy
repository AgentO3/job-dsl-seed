def project = 'webapp'

job {
    name "${project}-build"

    parameters {
        stringParam("BRANCH")
        stringParam("VARS")
    }

    scm {
        git("git@github.com:VividCortex/${project}.git", 'origin/$BRANCH')

    }
    steps {
        shell('ansible-playbook build.yml -e "$VARS"')
    }
}

job {
    name "${project}-release"

    parameters {
        stringParam("ENV")
        stringParam("VARS")
        stringParam("BRANCH")
    }

    scm {
        git('git@github.com:VividCortex/ansible-playbook.git', 'origin/$BRANCH')
    }
    steps {
        shell('ansible-playbook -i $ENV ${name}.yml -e "$VARS"')
    }
}