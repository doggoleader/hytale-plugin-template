package org.doggo;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

/**
 * It is a plugin template.
 * To start using it, do the following steps:
 * 1. Change the name and description of the plugin in manifest.json
 * 2. Change the latest version in manifest.json
 * 3. If you change plugin structure, don't forget to change it as well in manifest.json (e.g. your Main class or group).
 * 4. Create libs folder in the root directory and put HytaleServer.jar file here
 */

public class PluginTemplate extends JavaPlugin {

        public static final HytaleLogger LOGGER = HytaleLogger.getLogger();


        public PluginTemplate(@NonNullDecl JavaPluginInit init) {
            super(init);
        }

        @Override
        protected void setup() {

        }
}
