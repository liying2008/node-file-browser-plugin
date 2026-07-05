package io.jenkins.plugins.nodefilebrowser.icon;

import hudson.init.InitMilestone;
import hudson.init.Initializer;

public class IconInitializer {
    @Initializer(before = InitMilestone.PLUGINS_STARTED)
    public static void init() {
        IconRegistration.register();
    }
}
