package com.bredogen.projectenv.ui.actions

import com.bredogen.projectenv.services.ProjectEnvService
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareToggleAction

internal class EnvRunConfigurationToggleAction : DumbAwareToggleAction("Enable in Run Configurations") {

    override fun isSelected(event: AnActionEvent) = event.project?.let { ProjectEnvService.getInstance(it).enableRunConfiguration } ?: true

    override fun setSelected(event: AnActionEvent, isSelected: Boolean) {
        event.project?.let {
            ProjectEnvService.getInstance(it).enableTerminal = isSelected
        }
    }
}
