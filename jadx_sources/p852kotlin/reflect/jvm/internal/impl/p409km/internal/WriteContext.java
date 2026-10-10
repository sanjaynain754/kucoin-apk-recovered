package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.serialization.MutableVersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.serialization.StringTable;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Writers.kt */
/* JADX INFO: loaded from: classes61.dex */
public class WriteContext {

    @NotNull
    private final List<MetadataExtensions> extensions;

    @NotNull
    private final StringTable strings;

    @NotNull
    private final MutableVersionRequirementTable versionRequirements;

    public final int getClassName$kotlin_metadata(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return WriteUtilsKt.getClassNameIndex(this.strings, name);
    }

    @NotNull
    public final List<MetadataExtensions> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    @NotNull
    public final StringTable getStrings() {
        return this.strings;
    }

    @NotNull
    public final MutableVersionRequirementTable getVersionRequirements$kotlin_metadata() {
        return this.versionRequirements;
    }

    public final int get(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return this.strings.getStringIndex(string);
    }
}
