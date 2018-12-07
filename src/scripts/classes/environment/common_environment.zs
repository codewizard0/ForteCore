zenClass CommonEnvironment {
    var loaded = false as bool;
    val super = Environment();

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