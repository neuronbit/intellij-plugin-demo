package com.github.ziscloud.intellijplugindemo.services

import com.intellij.openapi.project.Project
import com.github.ziscloud.intellijplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
