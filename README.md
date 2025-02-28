# PRJ2019-2gether-MAS4DT
# Installation guide for the MAS4DT plug-in in Eclipse modelling tools

## University of Castilla-La Mancha

### Study and development of a modelling tool for the MAS4DT methodology for the development of digital twins (DTs)

#### Noelia González Sánchez

---

## Index of Contents

1. [JDK installation](#instalación-del-jdk)
   - [Configuration through workspace](#configuración-a-través-del-workspace)
   - [Configuration by eclipse.ini](#configuración-mediante-eclipseini)
2. [Installation of the diagramming software](#instalación-del-software-de-diagramas)
3. [Project creation and dependencies injection](#creación-de-proyecto-e-inyección-de-dependencias)

## Index of Figures

- **Figure 1:** Eclipse JDK Manager
- **Figure 2:** JDK selection
- **Figure 3:** File eclipse.ini
- **Figure 4:** Installation of archive.zip
- **Figure 5:** Selection of components to which to agree to terms
- **Figure 6:** Runtime
- **Figure 7:** Plugin configuration
- **Figure 8:** Plugin selection
- **Figure 9:** representations.aird
- **Figure 10:** Install prometheus_metamodel_system_specification
- **Figure 11:** Methodology diagrams

---

## JDK installation

In order to use the tool developed for the MAS4DT methodology, a Java 18 version is required. It is recommended to use a Java JDK version 18.0.2.1.

### Configuration through workspace

1. Open **Eclipse Modeling Tools** with administrator permissions.
2. Create a workspace and access to **Window > Preferences > Java > Installed JREs**.

![Figure 1: Eclipse JDK Manager](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/1_Gestor%20de%20Eclipse%20para%20JDK.png)

3. Select **Add > Standard VM**. Enter the JDK address and assign a name.

![Figure 2: JDK selection](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/2_Seleccion%20del%20JDK.PNG)

4. Select the added JDK and press **Apply**.
5. Restart the IDE by selecting **File > Restart**.

### Configuration by eclipse.ini

If there is a dependency error, edit the `eclipse.ini` file located in the **Eclipse Modeling Tools** installation folder. Change the line below the `-vm` command to the path of the JDK `bin` folder.

![Figure 3: File eclipse.ini](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/3_Archivo%20eclipse_ini.PNG
)

Restart **Eclipse Modeling Tools** with administrator permissions.

## Installation of the diagramming software

1. Configure the JDK as described above.
2. Access **Help > Install new software...** from the Workspace.
3. Click **Add** and add a name to the plugin (recommended ‘prometheus’). Select the plugin zip file.

![Figure 4: Installation of archive.zip](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/4_Instalacion%20archive_zip.PNG
)

4. Select **feature** and press **Next**.
5. Accept terms and conditions and select required components.

![Figure 5: Selection of components to which to agree to terms](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/5_%20Seleccion%20de%20componentes%20a%20los%20que%20aceptar%20terminos.PNG
)

Restart the Workspace.

## Project creation and dependencies injection

1. Create a new project of type **Viewpoint Specification Project** in **File > New > Project > Viewpoint Specification Project**.
2. Right click on the project folder and select **Run As > Eclipse Application**.

![Figure 6: Runtime](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/6_Runtime.PNG
)

3. Access **File > Import > Plug-ins and Fragments** and select the plugins folder.

![Figura 7: Plugin configuration](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/7_Configuracion%20del%20plugin.PNG
)

4. Select the plugin called **prometheustfgplugin** and click **Add**.

![Figure 8: Plugin selection](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/8_Representations_aird.png
)

5. Create a new project of type **Modeling** in **File > New > Project > Modeling Project**.
6. Select the **representations.aird** file.

![Figure 9: representations.aird](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/9_Seleccion%20del%20plugin.PNG
)

7. Add the file **prometheus_metamodel_system_specification**.

![Figure 10: Install prometheus_metamodel_system_specification](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/10_Instalar%20prometheus_metamodel_system_specification.PNG
)

8. Create the desired diagrams in the **Representations**.

![Figure 11: Methodology diagrams](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/blob/main/Images%20Plugin_Readme/11_Diagramas%20de%20la%20metodologia.PNG
)

For more details on the installation, please refer to the installation pdf on this route: ![Plugin](https://github.com/UCLM-LoUISE/PRJ2019-2gether-Noelia/tree/main/Plugin%20instalable)
