package com.google.api.services.drive.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class About extends GenericJson {

    @Key
    private Boolean appInstalled;

    @Key
    private Boolean canCreateDrives;

    @Key
    private Boolean canCreateTeamDrives;

    @Key
    private List<DriveThemes> driveThemes;

    @Key
    private Map<String, List<String>> exportFormats;

    @Key
    private List<String> folderColorPalette;

    @Key
    private Map<String, List<String>> importFormats;

    @Key
    private String kind;

    @JsonString
    @Key
    private Map<String, Long> maxImportSizes;

    @JsonString
    @Key
    private Long maxUploadSize;

    @Key
    private StorageQuota storageQuota;

    @Key
    private List<TeamDriveThemes> teamDriveThemes;

    @Key
    private User user;

    public static final class DriveThemes extends GenericJson {

        @Key
        private String backgroundImageLink;

        @Key
        private String colorRgb;

        /* JADX INFO: renamed from: id */
        @Key
        private String f12185id;

        public String getBackgroundImageLink() {
            return this.backgroundImageLink;
        }

        public String getColorRgb() {
            return this.colorRgb;
        }

        public String getId() {
            return this.f12185id;
        }

        public DriveThemes setBackgroundImageLink(String str) {
            this.backgroundImageLink = str;
            return this;
        }

        public DriveThemes setColorRgb(String str) {
            this.colorRgb = str;
            return this;
        }

        public DriveThemes setId(String str) {
            this.f12185id = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public DriveThemes set(String str, Object obj) {
            return (DriveThemes) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public DriveThemes clone() {
            return (DriveThemes) super.clone();
        }
    }

    public static final class StorageQuota extends GenericJson {

        @JsonString
        @Key
        private Long limit;

        @JsonString
        @Key
        private Long usage;

        @JsonString
        @Key
        private Long usageInDrive;

        @JsonString
        @Key
        private Long usageInDriveTrash;

        public Long getLimit() {
            return this.limit;
        }

        public Long getUsage() {
            return this.usage;
        }

        public Long getUsageInDrive() {
            return this.usageInDrive;
        }

        public Long getUsageInDriveTrash() {
            return this.usageInDriveTrash;
        }

        public StorageQuota setLimit(Long l11) {
            this.limit = l11;
            return this;
        }

        public StorageQuota setUsage(Long l11) {
            this.usage = l11;
            return this;
        }

        public StorageQuota setUsageInDrive(Long l11) {
            this.usageInDrive = l11;
            return this;
        }

        public StorageQuota setUsageInDriveTrash(Long l11) {
            this.usageInDriveTrash = l11;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public StorageQuota set(String str, Object obj) {
            return (StorageQuota) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public StorageQuota clone() {
            return (StorageQuota) super.clone();
        }
    }

    public static final class TeamDriveThemes extends GenericJson {

        @Key
        private String backgroundImageLink;

        @Key
        private String colorRgb;

        /* JADX INFO: renamed from: id */
        @Key
        private String f12186id;

        public String getBackgroundImageLink() {
            return this.backgroundImageLink;
        }

        public String getColorRgb() {
            return this.colorRgb;
        }

        public String getId() {
            return this.f12186id;
        }

        public TeamDriveThemes setBackgroundImageLink(String str) {
            this.backgroundImageLink = str;
            return this;
        }

        public TeamDriveThemes setColorRgb(String str) {
            this.colorRgb = str;
            return this;
        }

        public TeamDriveThemes setId(String str) {
            this.f12186id = str;
            return this;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public TeamDriveThemes set(String str, Object obj) {
            return (TeamDriveThemes) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public TeamDriveThemes clone() {
            return (TeamDriveThemes) super.clone();
        }
    }

    static {
        Data.nullOf(DriveThemes.class);
        Data.nullOf(TeamDriveThemes.class);
    }

    public Boolean getAppInstalled() {
        return this.appInstalled;
    }

    public Boolean getCanCreateDrives() {
        return this.canCreateDrives;
    }

    public Boolean getCanCreateTeamDrives() {
        return this.canCreateTeamDrives;
    }

    public List<DriveThemes> getDriveThemes() {
        return this.driveThemes;
    }

    public Map<String, List<String>> getExportFormats() {
        return this.exportFormats;
    }

    public List<String> getFolderColorPalette() {
        return this.folderColorPalette;
    }

    public Map<String, List<String>> getImportFormats() {
        return this.importFormats;
    }

    public String getKind() {
        return this.kind;
    }

    public Map<String, Long> getMaxImportSizes() {
        return this.maxImportSizes;
    }

    public Long getMaxUploadSize() {
        return this.maxUploadSize;
    }

    public StorageQuota getStorageQuota() {
        return this.storageQuota;
    }

    public List<TeamDriveThemes> getTeamDriveThemes() {
        return this.teamDriveThemes;
    }

    public User getUser() {
        return this.user;
    }

    public About setAppInstalled(Boolean bool) {
        this.appInstalled = bool;
        return this;
    }

    public About setCanCreateDrives(Boolean bool) {
        this.canCreateDrives = bool;
        return this;
    }

    public About setCanCreateTeamDrives(Boolean bool) {
        this.canCreateTeamDrives = bool;
        return this;
    }

    public About setDriveThemes(List<DriveThemes> list) {
        this.driveThemes = list;
        return this;
    }

    public About setExportFormats(Map<String, List<String>> map) {
        this.exportFormats = map;
        return this;
    }

    public About setFolderColorPalette(List<String> list) {
        this.folderColorPalette = list;
        return this;
    }

    public About setImportFormats(Map<String, List<String>> map) {
        this.importFormats = map;
        return this;
    }

    public About setKind(String str) {
        this.kind = str;
        return this;
    }

    public About setMaxImportSizes(Map<String, Long> map) {
        this.maxImportSizes = map;
        return this;
    }

    public About setMaxUploadSize(Long l11) {
        this.maxUploadSize = l11;
        return this;
    }

    public About setStorageQuota(StorageQuota storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }

    public About setTeamDriveThemes(List<TeamDriveThemes> list) {
        this.teamDriveThemes = list;
        return this;
    }

    public About setUser(User user) {
        this.user = user;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public About set(String str, Object obj) {
        return (About) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public About clone() {
        return (About) super.clone();
    }
}
