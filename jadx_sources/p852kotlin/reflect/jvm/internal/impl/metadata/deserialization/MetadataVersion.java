package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MetadataVersion.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class MetadataVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final MetadataVersion INSTANCE;

    @JvmField
    @NotNull
    public static final MetadataVersion INSTANCE_NEXT;

    @JvmField
    @NotNull
    public static final MetadataVersion INVALID_VERSION;
    private final boolean isStrictSemantics;

    /* JADX INFO: compiled from: MetadataVersion.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int[] versionArray, boolean z11) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        this.isStrictSemantics = z11;
    }

    static {
        MetadataVersion metadataVersion = new MetadataVersion(2, 2, 0);
        INSTANCE = metadataVersion;
        INSTANCE_NEXT = metadataVersion.next();
        INVALID_VERSION = new MetadataVersion(new int[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetadataVersion(@NotNull int... numbers) {
        this(numbers, false);
        Intrinsics.checkNotNullParameter(numbers, "numbers");
    }

    public final boolean isCompatible(@NotNull MetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.checkNotNullParameter(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        return isCompatibleInternal(metadataVersionFromLanguageVersion.lastSupportedVersionWithThisLanguageVersion(this.isStrictSemantics));
    }

    public final boolean isStrictSemantics() {
        return this.isStrictSemantics;
    }

    @NotNull
    public final MetadataVersion lastSupportedVersionWithThisLanguageVersion(boolean z11) {
        MetadataVersion metadataVersion = z11 ? INSTANCE : INSTANCE_NEXT;
        return metadataVersion.newerThan(this) ? metadataVersion : this;
    }

    private final boolean isCompatibleInternal(MetadataVersion metadataVersion) {
        if ((getMajor() == 1 && getMinor() == 0) || getMajor() == 0) {
            return false;
        }
        return !newerThan(metadataVersion);
    }

    private final boolean newerThan(MetadataVersion metadataVersion) {
        if (getMajor() > metadataVersion.getMajor()) {
            return true;
        }
        if (getMajor() >= metadataVersion.getMajor() && getMinor() > metadataVersion.getMinor()) {
            return true;
        }
        return false;
    }

    @NotNull
    public final MetadataVersion next() {
        if (getMajor() == 1 && getMinor() == 9) {
            return new MetadataVersion(2, 0, 0);
        }
        return new MetadataVersion(getMajor(), getMinor() + 1, 0);
    }
}
