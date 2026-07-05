package io.jenkins.plugins.nodefilebrowser.icon;

import io.jenkins.plugins.nodefilebrowser.util.WebUtils;
import org.jenkins.ui.icon.Icon;
import org.jenkins.ui.icon.IconSet;

public final class IconRegistration {
    /**
     * Register plugin icons to Jenkins.
     */
    public static void register() {
        String iconUrl = WebUtils.getPluginImageUrl("svgs/node-file-browser.svg");
        // Small icons
        IconSet.icons.addIcon(new Icon("icon-node-file-browser icon-sm", iconUrl, Icon.ICON_SMALL_STYLE));
        // Medium icons
        IconSet.icons.addIcon(new Icon("icon-node-file-browser icon-md", iconUrl, Icon.ICON_MEDIUM_STYLE));
        // Large icons
        IconSet.icons.addIcon(new Icon("icon-node-file-browser icon-lg", iconUrl, Icon.ICON_LARGE_STYLE));
        // Extra-large icons
        IconSet.icons.addIcon(new Icon("icon-node-file-browser icon-xlg", iconUrl, Icon.ICON_XLARGE_STYLE));
    }
}
