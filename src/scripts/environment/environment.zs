/*
	Set the environment
*/

import scripts.environment.commmon.loadCommon;
import scripts.environment.development.loadDev;
import scripts.environment.production.loadProd;

// Example only
// loadCommon();

loadDev();

// TODO: Switch to prod
// loadProd();