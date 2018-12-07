/*
	Prod environment only stuff
*/


import scripts.classes.environment.production_environment.ProductionEnvironment;

function loadProd() {
    ProductionEnvironment().load();
}