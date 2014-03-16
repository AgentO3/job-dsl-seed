def project = 'webapp'

job {
    name "${project}-build"
    stringParam("BRANCH")
    scm {
        git('git@github.com:VividCortex/${project}.git', "origin/master")

    }
    steps {
        shell("echo 'Works'")
    }
}

job {
    name "${project}-release"

    scm {
        git('git@github.com:VividCortex/ansible-playbook.git', "origin/master")
    }
    steps {
        shell("ansible-playbook -i stage ${name}.yml")
    }
}


//environmentVariables {
//    scriptFile(String filePath)
//    script(String content)
//    env(Object key, Object value)
//    envs(Map<Object, Object> map)
//    groovy(String groovyScript)
//    propertiesFile(String filePath)
//    loadFilesFromMaster(boolean loadFromMaster)
//    keepSystemVariables(boolean keepSystemVariables)
//    keepBuildVariables(boolean keepBuildVariables)
//}