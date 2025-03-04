package com.bredogen.projectenv.providers.files
import com.bredogen.projectenv.providers.EnvProviderFactory
import com.bredogen.projectenv.providers.EnvSourceException
import com.intellij.openapi.project.Project
import org.yaml.snakeyaml.Yaml
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths


class YamlFileProvider(private val params : Map<String, String>) : EnvFileProvider(params) {

    companion object : EnvProviderFactory {
        override fun newInstance(params : Map<String, String>): YamlFileProvider {
            return YamlFileProvider(params)
        }

        override fun createParams(project: Project): Map<String, String> {
            return EnvFileProvider.createParams(project)
        }
    }

    override fun getEnvValues(): LinkedHashMap<String, String> {
        val path = params["path"] ?: throw EnvSourceException("No valid path to json/yaml file")

        var result: LinkedHashMap<String, String>?
        try {
            result = Yaml().load(Files.readString(Paths.get(path)))
        } catch (ex: IOException) {
            throw EnvSourceException(ex)
        }
        if (result == null) {
            result = linkedMapOf()
        }

        return result
    }
}