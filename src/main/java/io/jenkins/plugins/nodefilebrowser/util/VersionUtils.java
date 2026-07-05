package io.jenkins.plugins.nodefilebrowser.util;

import hudson.util.VersionNumber;
import jenkins.model.Jenkins;

public final class VersionUtils {
    private VersionUtils() {
        /* utility class */
    }

    public static boolean isSupportSymbolIcon() {
        VersionNumber current = Jenkins.getVersion();
        if (current == null) {
            return false;
        }
        // Jenkins supports symbol-icon starting from version 2.335
        VersionNumber comparison = new VersionNumber("2.335");
        return current.compareTo(comparison) >= 0;
    }
}
