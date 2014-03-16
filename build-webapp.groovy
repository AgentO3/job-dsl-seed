def project = 'webapp'

job {
    name 'build-${project}'

    scm {
        name('origin')
        git('git@github.com:VividCortex/webapp.git')
        branch('origin/BRANCH')
    }
}

job {
    name 'release-${project}'

    scm {
        origin('origin')
        git('git@github.com:VividCortex/ansible-playbook.git')
        branch('origin/master')
    }
}