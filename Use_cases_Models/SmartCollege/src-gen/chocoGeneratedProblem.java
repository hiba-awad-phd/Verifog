//Add the imports here
//créer une IntVar avec cpuCores
IntVar VM-VM1_cpuCores = new IntVar();
// etc.
// Il ne sera pas nécessaire d'Ajouter IntVar au dictionnaire des variable car son nom est identifiant

//Create a Choco constraint with 
// right hand expression : 3
// comparaison operator : greater
// left hand expression : VM-VM1_cpuCores
