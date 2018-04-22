package acdlab.lt;

import java.io.Serializable;

class Configuration implements Serializable{
    private boolean initialized;

    void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }
}
