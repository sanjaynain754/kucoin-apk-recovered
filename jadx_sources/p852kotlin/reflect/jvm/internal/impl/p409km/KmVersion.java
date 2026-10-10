package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KmVersion {
    private final int major;
    private final int minor;
    private final int patch;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmVersion)) {
            return false;
        }
        KmVersion kmVersion = (KmVersion) obj;
        return this.major == kmVersion.major && this.minor == kmVersion.minor && this.patch == kmVersion.patch;
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.patch;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    public KmVersion(int i11, int i12, int i13) {
        this.major = i11;
        this.minor = i12;
        this.patch = i13;
    }
}
