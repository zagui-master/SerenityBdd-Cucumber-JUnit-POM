# Plantilla para Automatizar Pruebas Web Con Serenity BDD

## Descripción General

Bienvenido a la plantilla para automatizar pruebas web con tecnologías modernas:
- **Serenity BDD**
- **Cucumber**
- **JUnit**
- **Page Object Model (POM)**

Esta plantilla está diseñada para ayudarte a escribir y ejecutar pruebas de manera eficiente y estructurada, facilitando la integración de pruebas automatizadas en tu flujo de trabajo.

## Por Qué Automatizar Pruebas

La automatización de pruebas ofrece múltiples beneficios:
- Asegura la calidad del software
- Acelera los ciclos de desarrollo
- Reduce errores manuales
- Proporciona pruebas consistentes y repetibles

## Stack Tecnológico

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| Java | 17.0.2 | Lenguaje de programación base |
| Gradle | 8.10.2 | Gestor de dependencias y builds |
| Serenity BDD | 4.1.0 | Generación de informes y gestión de pruebas |
| Cucumber | 7.20.1 | Framework BDD |
| JUnit | 5.10.0 | Framework de pruebas unitarias |
| AssertJ  | 3.26.3 |  Biblioteca para aserciones fluidas en Java |
| Logback  | 1.5.12 | Framework de logging para Java |
| SLF4J  | 2.0.15 |  Fachada de logging simple para Java |

## Requisitos Previos

### Software Necesario
- Java 17.0.2
- Gradle 8.10.2
- *Nota*: Si no tienes Gradle instalado, puedes usar el `gradle-wrapper.properties` incluido en el proyecto
- Ruta: `gradle/wrapper/gradle-wrapper.properties`

## Solución de Problemas Comunes

## Conflictos con Java
### 1. Verifica tu versión actual:
  ```bash
  java --version
```
### 2. Posibles errores y soluciones:

- Error: "Java version mismatch"
 ```bash
 Exception in thread "main" java.lang.UnsupportedClassVersionError: class.java.lang.throwError/Could-launch-starter
```
- Solución: Actualiza tu versión de Java a 17.0.2

### 3. Error: "JAVA_HOME no configurado"
 ```bash
'JAVA_HOME' is not recognized as an internal or external command
```
- Solución: Configura la variable de entorno JAVA_HOME:
- Windows:
 ```bash
set JAVA_HOME=C:\Program Files\Java\jdk-17.0.2
```
- Linux/Mac:
 ```bash
export JAVA_HOME=/usr/lib/jvm/java-17.0.2
```
## Conflictos con Gradle
- Si encuentras errores de compilación:
1. Localiza el archivo gradle-wrapper.properties
2. Modifica la línea distributionUrl según tu versión instalada : 
`distributionUrl=https\://services.gradle.org/distributions/gradle-[tu-version]-bin.zip`

# Comandos de Ejecución

### Ejecutar pruebas : 
 ```bash
gradle test
```

### Ejecutar pruebas especificas usando las tags:
````bash
gradle test -D cucumber.options.tags="@Tag_name"
````

### Limpiar y ejecutar pruebas : 
````bash
gradle clean test
````


### Generar informes : ruta `target/site/serenity-report/index.html`
````bash
gradle test aggregate
````


## Estructura del Proyecto
````
📁 root
├── 📁 .idea
├── 📁 build
├── 📁 gradle
│   └── 📁 history
├── 📁 src
│   ├── 📁 main
│   └── 📁 test
│       ├── 📁 java
│       │   └── 📁 com.company.co
│       │       ├── 📁 browser
│       │       ├── 📁 definitions
│       │       ├── 📁 pages
│       │       │   ├── 📁 login
│       │       │   ├── 📁 products
│       │       │   └── 📁 validations
│       │       ├── 📁 runner
│       │       ├── 📁 steps
│       │       │   ├── 📁 login
│       │       │   ├── 📁 products
│       │       │   └── 📁 validations
│       │       └── 📁 utils
│       └── 📁 resources
│           └── 📁 features
│               └── 📄 01-Login.feature
├── 📁 target
├── 📄 .gitignore
├── 📄 build.gradle
├── 📄 gradlew
├── 📄 gradlew.bat
├── 📄 README.md
├── 📄 serenity.properties
└── 📄 settings.gradle
````
## Configuración de Serenity (serenity.properties)

Este archivo de configuración define:
- El nombre del proyecto
- La configuración del navegador Chrome
- La URL base para las pruebas
- El comportamiento del navegador durante las pruebas
- La ubicación y configuración de los reportes
- El nivel de logging y captura de pantallas

### Configuración del Proyecto
````

serenity.project.name = Template Serenity Cucumber JUni POM
webdriver.driver = chrome
webdriver.autodownload = true

base.url=https://www.saucedemo.com

serenity.browser.maximized = true
serenity.use.unique.browser = false
serenity.restart.browser.each.scenario = true

serenity.outputDirectory = target/site/serenity-report
serenity.report.show.total.features = true
serenity.report.show.total.stories = true

logging.level = INFO

serenity.take.screenshots = AFTER_EACH_STEP

````
