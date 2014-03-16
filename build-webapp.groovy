def project = 'webapp'

job {
    name 'build-${project}'

    scm {
        git('git@github.com:VividCortex/webapp.git')
        name('origin')
    }
}

job {
    name 'release-${project}'

    scm {
        git('git@github.com:VividCortex/ansible-playbook.git')
        name('origin')
    }
}