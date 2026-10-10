package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public class AssociatedFileT {
    private String name = null;
    private String description = null;
    private byte type = 0;
    private String locale = null;
    private String version = null;

    public String getDescription() {
        return this.description;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getName() {
        return this.name;
    }

    public byte getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(byte b11) {
        this.type = b11;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
