package org.kohsuke.github;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * Class that wraps the list of GitHub's IP addresses.
 *
 * @author Paulo Miguel Almeida
 * @see GitHub#getMeta() GitHub#getMeta()
 * @see <a href="https://docs.github.com/en/rest/meta/meta?apiVersion=2022-11-28#get-github-meta-information">Get
 *      Meta</a>
 */
public class GHMeta {

    /**
     * Create default GHMeta instance
     */
    public GHMeta() {
    }

    @JsonProperty("verifiable_password_authentication")
    private boolean verifiablePasswordAuthentication;
    @JsonProperty("ssh_key_fingerprints")
    private Map<String, String> sshKeyFingerprints;
    @JsonProperty("ssh_keys")
    private List<String> sshKeys;
    private List<String> hooks;
    private List<String> git;
    private List<String> web;
    private List<String> api;
    private List<String> pages;
    private List<String> importer = new ArrayList<>();
    private List<String> packages;
    private List<String> actions;
    private List<String> dependabot;

    /**
     * Is verifiable password authentication boolean.
     *
     * @return the boolean
     */
    public boolean isVerifiablePasswordAuthentication() {
        return verifiablePasswordAuthentication;
    }

    /**
     * Gets ssh key fingerprints.
     *
     * @return the ssh key fingerprints
     */
    public Map<String, String> getSshKeyFingerprints() {
        return Collections.unmodifiableMap(sshKeyFingerprints);
    }

    /**
     * Gets ssh keys.
     *
     * @return the ssh keys
     */
    public List<String> getSshKeys() {
        return Collections.unmodifiableList(sshKeys);
    }

    /**
     * Gets hooks.
     *
     * @return the hooks
     */
    public List<String> getHooks() {
        return Collections.unmodifiableList(hooks);
    }

    /**
     * Gets git.
     *
     * @return the git
     */
    public List<String> getGit() {
        return Collections.unmodifiableList(git);
    }

    /**
     * Gets web.
     *
     * @return the web
     */
    public List<String> getWeb() {
        return Collections.unmodifiableList(web);
    }

    /**
     * Gets api.
     *
     * @return the api
     */
    public List<String> getApi() {
        return Collections.unmodifiableList(api);
    }

    /**
     * Gets pages.
     *
     * @return the pages
     */
    public List<String> getPages() {
        return Collections.unmodifiableList(pages);
    }

    /**
     * Gets importer.
     *
     * @return the importer
     */
    public List<String> getImporter() {
        return Collections.unmodifiableList(importer);
    }

    /**
     * Gets package.
     *
     * @return the package
     */
    public List<String> getPackages() {
        return Collections.unmodifiableList(packages);
    }

    /**
     * Gets actions.
     *
     * @return the actions
     */
    public List<String> getActions() {
        return Collections.unmodifiableList(actions);
    }

    /**
     * Gets dependabot.
     *
     * @return the dependabot
     */
    public List<String> getDependabot() {
        return Collections.unmodifiableList(dependabot);
    }
}
