package io.jenkins.plugins.nodefilebrowser.util;

public final class WebUtils {
    /**
     * The base URL of the plugin. Only used for web resources.
     */
    public static final String PLUGIN_URL = "plugin/node-file-browser/";
    /**
     * The base URL of the plugin images.
     */
    public static final String PLUGIN_IMAGES_URL= PLUGIN_URL + "images/";

    /**
     * Get the URL of the plugin image.
     * @param name the name of the image
     * @return the URL of the plugin image
     */
    public static String getPluginImageUrl(String name) {
        return PLUGIN_IMAGES_URL + name;
    }
}
