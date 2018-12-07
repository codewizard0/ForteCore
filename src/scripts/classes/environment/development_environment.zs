zenClass DevelopmentEnvironment {
    var loaded = false as bool;
    val super = CommonEnvironment();

    zenConstructor() {
    }

    function load() {
        if (!loaded) {
            super.load();
            loaded = true;

            // TODO: Implement
        }
    }
}