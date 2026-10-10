package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: versionSpecificBehavior.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        if ((version.getMajor() == 1 && version.getMinor() >= 4) || version.getMajor() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isKotlin1Dot4OrLater(version);
    }
}
