package androidx.camera.extensions.internal;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_Version extends Version {
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    @Override // androidx.camera.extensions.internal.Version
    public String getDescription() {
        return this.description;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.major;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMinor() {
        return this.minor;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getPatch() {
        return this.patch;
    }

    public AutoValue_Version(int i11, int i12, int i13, String str) {
        this.major = i11;
        this.minor = i12;
        this.patch = i13;
        if (str != null) {
            this.description = str;
            return;
        }
        throw new NullPointerException("Null description");
    }
}
