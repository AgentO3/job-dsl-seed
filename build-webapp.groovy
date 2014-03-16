def project = 'webapp'

job {
    name '${project}-build'

    scm {
        git('git@github.com:VividCortex/${project}.git')
    }
    steps {
        shell("echo 'Works'")
    }
}

job {
    name '${project}-release'

    scm {
        git('git@github.com:VividCortex/ansible-playbook.git')
    }
    steps {
        shell("echo 'Works'")
    }
}