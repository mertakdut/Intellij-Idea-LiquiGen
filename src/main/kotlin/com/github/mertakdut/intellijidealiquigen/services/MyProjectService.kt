package com.github.mertakdut.intellijidealiquigen.services

import com.github.mertakdut.intellijidealiquigen.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
