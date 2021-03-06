package com.tundem.aboutlibraries.entity;

public class Library {

    private String definedName = "";

    private boolean internal = false;

    private String author = "";
    private String authorWebsite = "";
    private String libraryName = "";
    private String libraryDescription = "";
    private String libraryVersion = "";
    private String libraryWebsite = "";
    private String licenseVersion = "";
    private String licenseLink = "";
    private String licenseContent = "";

    private boolean isOpenSource = true;
    private String repositoryLink = "";

    public Library() {

    }

    public Library(String author, String libraryName, String libraryDescription) {
        this.author = author;
        this.libraryName = libraryName;
        this.libraryDescription = libraryDescription;
    }

    public Library(String author, String libraryName, String libraryDescription, String libraryVersion) {
        this.author = author;
        this.libraryName = libraryName;
        this.libraryDescription = libraryDescription;
        this.libraryVersion = libraryVersion;
    }

    public Library(String author, String libraryName, String libraryDescription, String libraryVersion, String licenseVersion, String licenseContent) {
        this.author = author;
        this.libraryName = libraryName;
        this.libraryDescription = libraryDescription;
        this.libraryVersion = libraryVersion;
        this.licenseVersion = licenseVersion;
        this.licenseContent = licenseContent;
    }

    public Library(String author, String authorWebsite, String libraryName, String libraryDescription, String libraryVersion, String libraryWebsite, String licenseVersion, String licenseContent) {
        this.author = author;
        this.authorWebsite = authorWebsite;
        this.libraryName = libraryName;
        this.libraryDescription = libraryDescription;
        this.libraryVersion = libraryVersion;
        this.libraryWebsite = libraryWebsite;
        this.licenseVersion = licenseVersion;
        this.licenseContent = licenseContent;
    }

    public Library(String author, String authorWebsite, String libraryName, String libraryDescription, String libraryVersion, String libraryWebsite, String licenseVersion, String licenseContent,
                   boolean isOpenSource, String repositoryLink) {
        this.author = author;
        this.authorWebsite = authorWebsite;
        this.libraryName = libraryName;
        this.libraryDescription = libraryDescription;
        this.libraryVersion = libraryVersion;
        this.libraryWebsite = libraryWebsite;
        this.licenseVersion = licenseVersion;
        this.licenseContent = licenseContent;
        this.isOpenSource = isOpenSource;
        this.repositoryLink = repositoryLink;
    }

    public String getDefinedName() {
        return definedName;
    }

    public void setDefinedName(String definedName) {
        this.definedName = definedName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorWebsite() {
        return authorWebsite;
    }

    public void setAuthorWebsite(String authorWebsite) {
        this.authorWebsite = authorWebsite;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryDescription() {
        return libraryDescription;
    }

    public void setLibraryDescription(String libraryDescription) {
        this.libraryDescription = libraryDescription;
    }

    public String getLibraryVersion() {
        return libraryVersion;
    }

    public void setLibraryVersion(String libraryVersion) {
        this.libraryVersion = libraryVersion;
    }

    public String getLibraryWebsite() {
        return libraryWebsite;
    }

    public void setLibraryWebsite(String libraryWebsite) {
        this.libraryWebsite = libraryWebsite;
    }

    public String getLicenseVersion() {
        return licenseVersion;
    }

    public void setLicenseVersion(String licenseVersion) {
        this.licenseVersion = licenseVersion;
    }

    public String getLicenseLink() {
        return licenseLink;
    }

    public void setLicenseLink(String licenseLink) {
        this.licenseLink = licenseLink;
    }

    public String getLicenseContent() {
        return licenseContent;
    }

    public void setLicenseContent(String licenseContent) {
        this.licenseContent = licenseContent;
    }

    public boolean isOpenSource() {
        return isOpenSource;
    }

    public void setOpenSource(boolean isOpenSource) {
        this.isOpenSource = isOpenSource;
    }

    public String getRepositoryLink() {
        return repositoryLink;
    }

    public void setRepositoryLink(String repositoryLink) {
        this.repositoryLink = repositoryLink;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }
}
