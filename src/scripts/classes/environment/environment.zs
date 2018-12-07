// Abstract base class
zenClass Environment {
    var loaded = false as bool;

    zenConstructor() {

    }

    function load() {
        if (!loaded) {
            loaded = true;

            // Do nothing
        }
    }
}