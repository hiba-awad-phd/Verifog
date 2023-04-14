# Verifog
VeriFog: A Generic Model-based Approach for Verifying Fog Systems at Design Time

## Before download

- Install Eclipse for modelling via https://www.eclipse.org/modeling/
- Install Papyrus via https://www.eclipse.org/papyrus/
- Install OCL pluggins in Eclipse.
- Make sure that all the properties of EMF/Ecore are added to your eclipse environment.

## Getting Started

- Open ADL_Model in your eclipse window.
*Make sure that there is no error appears.*

- Open the fr.imta.semafor.fogDsl.ui folder and right-click on pluggin -> run as -> Eclipse application.

- In your workspace, import all the Use_cases_Models folders.

> **Prepare your XMI Models**

In your workspace:
1- Right-click on any file in the specific use case folder -> SeMaFoR -> Save the Model
2- A message of the path will appear in the first eclipse window.
3- The model will be saved with .fog extension, you must replace it by .xmi

### JAVA code
To query in JAVA you need to make sure that you are putting the JAVA methods in fr.imta.semafor.fogDsl/src/fr/imta/semafor/handlers/InspectionHandler.java file.

In the workspace right-click on any file existing in your favorite use case -> SeMaFoR -> QueryModel 
The results will appear in the first eclipse window

### OCL code
*To use the existing OCL queries in Models_Tools/Queries/OCL you need to follow the tutorial https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FTutorials.html to convert your ecore to OCL project.*
**You need to use the models with .xmi extensions.**

- Import your xmi model in fr.imta.semafor.fogAdlModel/src/fr/imta/model/ 
- Open it with xmi view
- Select and right-click on any Node file to open OCL console (OCL-> show OCL Console)
- Test your OCL query


