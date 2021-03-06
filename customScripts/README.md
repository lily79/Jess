This folder contains custom python scrips for acessing the different functionalities of Jess.
Use them by navigating into this directory, then write "python3 scriptname.py" into the command line.

The files have the following purposes:
-generateExamples: Generates some example node ids that you can use in the SUI script. 
The project name must be edited inside the script.

-plot: Invoke with "python3 plot.py [ProjectName]". 
Plots all different graph representations (AST, CPG, etc) for all functions of the project. 
Caution: The 'ALL' option may take very long for bigger projects. Use the plotDB script instead.

-plotconfig: This contains configuration options (edge colors, font, etc.) for plotting functionalities that build upon Graphviz. 
It is used by the plot, plotDB and SUI script.

-plotDB: Generates a Graphviz .dot and a png. file for visualizing the selected database. 
The project name must be edited inside the script. 
Furthermore, you can chose between plotting only the AST or the whole code property graph.

-queries: A collection of various queries and their explanations. 
The project name must be edited inside the script.

-SUI: Identifies Semantic Units with the help of variability-aware semantic program slicing. 
This script finds all semantically related lines to a given entry point. 
The entry point must be one (or more) node ids (variable entryPointId) or the name of a configuration option (variable entryFeatureNames). 
You can select the entry point and the project to be analyzed via console input.
The rules for finding semantically related elements can be configured with the configuration options inside the script. 
For more details, read the full documentation: https://jess.readthedocs.io/en/

-codeConverter: Creates a reduced code slice based on the results of SUI.py. 
This slice follows the same structure (e.g., folder and file names and nesting, line numbers of the code statements) as the original project, 
but only contains the lines of code that are part of the identified semantic unit. 
This slice can then be merged (for example via git merge) into the desired project.

-evaluation: Validates the Code Property Graph of a project against the original source code (by converting the graph back to code and diffing it).
The name and project structure must be edited inside the script. 

-workflow: Realizes an interactive workflow for the migration of a Semantic Unit from a donor to a target software.
Contains the functionality of the SUI, codeConverter and evaluation script.
Furthermore, the script clones the necessary Git branches/commits and allows to semi-automate the whole migration process.
Currently, the configuration of the Semantic Unit identification process must still be set manually in the SUI script.
