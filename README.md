# PRJ2019-2gether-MAS4DT
# Guía de Instalación del Plug-in para MAS4DT en Eclipse Modeling Tools

## Universidad de Castilla-La Mancha

### Estudio y desarrollo de una herramienta de modelado para la metodología MAS4DT para el desarrollo de gemelos digitales

#### Noelia González Sánchez

---

## Índice de Contenidos

1. [Instalación del JDK](#instalación-del-jdk)
   - [Configuración a través del workspace](#configuración-a-través-del-workspace)
   - [Configuración mediante eclipse.ini](#configuración-mediante-eclipseini)
2. [Instalación del software de diagramas](#instalación-del-software-de-diagramas)
3. [Creación de proyecto e inyección de dependencias](#creación-de-proyecto-e-inyección-de-dependencias)

## Índice de Figuras

- **Figura 1:** Gestor de Eclipse para JDK
- **Figura 2:** Selección del JDK
- **Figura 3:** Archivo eclipse.ini
- **Figura 4:** Instalación de archive.zip
- **Figura 5:** Selección de componentes a los que aceptar términos
- **Figura 6:** Runtime
- **Figura 7:** Configuración del plugin
- **Figura 8:** Selección del plugin
- **Figura 9:** representations.aird
- **Figura 10:** Instalar prometheus_metamodel_system_specification
- **Figura 11:** Diagramas de la metodología

---

## Instalación del JDK

Para poder probar la herramienta realizada para la metodología MAS4DT es necesario una versión de Java 18. Se recomienda utilizar un JDK de Java versión 18.0.2.1.

### Configuración a través del workspace

1. Abrir **Eclipse Modeling Tools** con permisos de administrador.
2. Crear un workspace y acceder a **Window > Preferences > Java > Installed JREs**.

![Figura 1: Gestor de Eclipse para JDK](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/1_Gestor%20de%20Eclipse%20para%20JDK.png)

3. Seleccionar **Add > Standard VM**. Introducir la dirección del JDK y asignar un nombre.

![Figura 2: Selección del JDK](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/2_Seleccion%20del%20JDK.PNG)

4. Seleccionar el JDK añadido y pulsar **Apply**.
5. Reiniciar el IDE seleccionando **File > Restart**.

### Configuración mediante eclipse.ini

Si hay un error de dependencias, editar el archivo `eclipse.ini` ubicado en la carpeta de instalación de **Eclipse Modeling Tools**. Cambiar la línea debajo del comando `-vm` por la ruta de la carpeta `bin` del JDK.

![Figura 3: Archivo eclipse.ini](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/3_Archivo%20eclipse_ini.PNG
)

Reiniciar **Eclipse Modeling Tools** con permisos de administrador.

## Instalación del software de diagramas

1. Configurar el JDK como se indicó anteriormente.
2. Acceder a **Help > Install new software…** desde el Workspace.
3. Pulsar **Add** y añadir un nombre al plugin (recomendado "prometheus"). Seleccionar el archivo zip del plugin.

![Figura 4: Instalación de archive.zip](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/4_Instalacion%20archive_zip.PNG
)

4. Seleccionar la opción **feature** y pulsar **Next**.
5. Aceptar términos y condiciones y seleccionar los componentes necesarios.

![Figura 5: Selección de componentes a los que aceptar términos](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/5_%20Seleccion%20de%20componentes%20a%20los%20que%20aceptar%20terminos.PNG
)

Reiniciar el Workspace.

## Creación de proyecto e inyección de dependencias

1. Crear un nuevo proyecto de tipo **Viewpoint Specification Project** en **File > New > Project > Viewpoint Specification Project**.
2. Hacer clic derecho en la carpeta del proyecto y seleccionar **Run As > Eclipse Application**.

![Figura 6: Runtime](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/6_Runtime.PNG
)

3. Acceder a **File > Import > Plug-ins and Fragments** y seleccionar la carpeta de plugins.

![Figura 7: Configuración del plugin](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/7_Configuracion%20del%20plugin.PNG
)

4. Seleccionar el plugin llamado **prometheustfgplugin** y pulsar **Add**.

![Figura 8: Selección del plugin](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/8_Representations_aird.png
)

5. Crear un nuevo proyecto de tipo **Modeling** en **File > New > Project > Modeling Project**.
6. Seleccionar el archivo **representations.aird**.

![Figura 9: representations.aird](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/9_Seleccion%20del%20plugin.PNG
)

7. Añadir el archivo **prometheus_metamodel_system_specification**.

![Figura 10: Instalar prometheus_metamodel_system_specification](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/10_Instalar%20prometheus_metamodel_system_specification.PNG
)

8. Crear los diagramas deseados en la pestaña **Representations**.

![Figura 11: Diagramas de la metodología](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/11_Diagramas%20de%20la%20metodologia.PNG
)

Para más detalles sobre la instalación consulta el pdf de instalación en esta ruta: ![Plugin](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/tree/main/Plugin%20instalable)
