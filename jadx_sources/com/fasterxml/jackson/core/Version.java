package com.fasterxml.jackson.core;

import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class Version implements Comparable<Version>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final Version f10036b = new Version(0, 0, 0, null, null, null);
    private static final long serialVersionUID = 1;
    protected final String _artifactId;
    protected final String _groupId;
    protected final int _majorVersion;
    protected final int _minorVersion;
    protected final int _patchLevel;
    protected final String _snapshotInfo;

    @Deprecated
    public Version(int i11, int i12, int i13, String str) {
        this(i11, i12, i13, str, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Version version = (Version) obj;
        return version._majorVersion == this._majorVersion && version._minorVersion == this._minorVersion && version._patchLevel == this._patchLevel && version._artifactId.equals(this._artifactId) && version._groupId.equals(this._groupId);
    }

    public Version(int i11, int i12, int i13, String str, String str2, String str3) {
        this._majorVersion = i11;
        this._minorVersion = i12;
        this._patchLevel = i13;
        this._snapshotInfo = str;
        this._groupId = str2 == null ? "" : str2;
        this._artifactId = str3 == null ? "" : str3;
    }

    public static Version unknownVersion() {
        return f10036b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Version version) {
        if (version == this) {
            return 0;
        }
        int iCompareTo = this._groupId.compareTo(version._groupId);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this._artifactId.compareTo(version._artifactId);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int i11 = this._majorVersion - version._majorVersion;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this._minorVersion - version._minorVersion;
        return i12 == 0 ? this._patchLevel - version._patchLevel : i12;
    }

    public String getArtifactId() {
        return this._artifactId;
    }

    public String getGroupId() {
        return this._groupId;
    }

    public int getMajorVersion() {
        return this._majorVersion;
    }

    public int getMinorVersion() {
        return this._minorVersion;
    }

    public int getPatchLevel() {
        return this._patchLevel;
    }

    public int hashCode() {
        return this._artifactId.hashCode() ^ (((this._groupId.hashCode() + this._majorVersion) - this._minorVersion) + this._patchLevel);
    }

    public boolean isSnapshot() {
        String str = this._snapshotInfo;
        return str != null && str.length() > 0;
    }

    public boolean isUnknownVersion() {
        return this == f10036b;
    }

    public String toFullString() {
        return this._groupId + '/' + this._artifactId + '/' + toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this._majorVersion);
        sb2.append('.');
        sb2.append(this._minorVersion);
        sb2.append('.');
        sb2.append(this._patchLevel);
        if (isSnapshot()) {
            sb2.append('-');
            sb2.append(this._snapshotInfo);
        }
        return sb2.toString();
    }

    @Deprecated
    public boolean isUknownVersion() {
        return isUnknownVersion();
    }
}
