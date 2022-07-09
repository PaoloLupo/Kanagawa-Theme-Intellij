package com.github.paololupo.kanagawatheme.services

import com.intellij.openapi.project.Project
import com.github.paololupo.kanagawatheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
