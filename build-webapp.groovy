job {
    name 'build-webapp'

    stringParam("BRANCH")

    scm {
        name('origin')
        git('git@github.com:VividCortex/webapp.git')
        branch('origin/$BRANCH')
    }
}

job {
    name 'release-webapp'

    scm {
        origin('origin')
        git('git@github.com:VividCortex/ansible-playbook.git')
        branch('origin/master')
    }
}