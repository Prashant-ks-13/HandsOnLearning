package com.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private final Map<String, BookShop> registry = new HashMap<>();

    public void registerPrototype(String key, BookShop prototype) {
        registry.put(key, prototype);
    }

    public void unregisterPrototype(String key) {
        registry.remove(key);
    }

    public BookShop getClonedBookShop(String key) {
        BookShop prototype = registry.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No BookShop prototype found for key: " + key);
        }

        try {
            return prototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("BookShop cloning failed", e);
        }
    }
}
