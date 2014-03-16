def project = 'webapp'

job {
    name 'build-${project}'

    scm {
        git('git@github.com:VividCortex/${project}.git')
        name('origin')
        branches('origin/master')
    }
}

job {
    name 'release-${project}'

    scm {
        git('git@github.com:VividCortex/ansible-playbook.git')
        name('origin')
        branches('origin/master')
    }
}