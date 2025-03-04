# ProjectEnv

![Build](https://github.com/BredoGen/ProjectEnv/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/17044-projectenv.svg)](https://plugins.jetbrains.com/plugin/17044)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/17044.svg)](https://plugins.jetbrains.com/plugin/17044)


<!-- Plugin description -->
ProjectEnv plugin provides settings to configure project-wide .env (dotenv) files.
Environment variables will be applied to:
* Terminal in all IDEA-based products (tested on Linux, macOS)
* Python Run Configurations, Python / Django Console
* Java Run Configurations (IDEA)
* Go Run Configurations (GoLand)

## Settings
<kbd>Env Files</kbd> tool window > <kbd>Add your .env/json/yaml files</kbd>

You can also enable/disable plugin in Terminal / Run configurations: <kbd>Env Files</kbd> tool window > <kbd>⚙️</kbd> > Enable in Terminal / Enable in Run Configurations

## Credits
Source code mostly based on [FileEnv](https://github.com/ashald/EnvFile) plugin by Borys Pierov. Special thanks for his great work.
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:

  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "ProjectEnv"</kbd> >
  <kbd>Install Plugin</kbd>

- Manually:

  Download the [latest release](https://github.com/BredoGen/ProjectEnv/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
**WARNING:** I'm not a Java/Kotlin developer. The plugin purpose is to solve my own inconvenience while working with 12factor apps in PyCharm.

Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
