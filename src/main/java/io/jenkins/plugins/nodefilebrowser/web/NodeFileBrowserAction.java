package io.jenkins.plugins.nodefilebrowser.web;

import hudson.Extension;
import hudson.model.RootAction;
import io.jenkins.plugins.nodefilebrowser.util.WebUtils;
import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.HttpResponses;

import java.util.logging.Logger;

@Extension
public class NodeFileBrowserAction implements RootAction {
    private static final Logger LOGGER = Logger.getLogger(NodeFileBrowserAction.class.getName());

    @Override
    public String getUrlName() {
        return "node-file-browser";
    }

    @Override
    public String getDisplayName() {
        return "Node File Browser";
    }

    @Override
    public String getIconFileName() {
        return WebUtils.getPluginImageUrl("svgs/node-file-browser.svg");
    }

    /**
     * redirect to the index page
     */
    public HttpResponse doIndex() {
        return HttpResponses.redirectViaContextPath("/plugin/node-file-browser/browser/index.html");
    }
}
