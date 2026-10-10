package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Readers.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReadContext {

    @NotNull
    private final List<Object> contextExtensions;

    @NotNull
    private final List<MetadataExtensions> extensions;
    private final boolean ignoreUnknownVersionRequirements;

    @Nullable
    private final ReadContext parent;

    @NotNull
    private final NameResolver strings;

    @NotNull
    private final Map<Integer, Integer> typeParameterNameToId;

    @NotNull
    private final TypeTable types;

    @NotNull
    private final VersionRequirementTable versionRequirements;

    public ReadContext(@NotNull NameResolver strings, @NotNull TypeTable types, @NotNull VersionRequirementTable versionRequirements, boolean z11, @Nullable ReadContext readContext, @NotNull List<? extends Object> contextExtensions) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(versionRequirements, "versionRequirements");
        Intrinsics.checkNotNullParameter(contextExtensions, "contextExtensions");
        this.strings = strings;
        this.types = types;
        this.versionRequirements = versionRequirements;
        this.ignoreUnknownVersionRequirements = z11;
        this.parent = readContext;
        this.contextExtensions = contextExtensions;
        this.typeParameterNameToId = new LinkedHashMap();
        this.extensions = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
    }

    @NotNull
    public final String className$kotlin_metadata(int i11) {
        return ReadUtilsKt.getClassName(this.strings, i11);
    }

    @NotNull
    public final String get(int i11) {
        return this.strings.getString(i11);
    }

    @NotNull
    public final List<MetadataExtensions> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final boolean getIgnoreUnknownVersionRequirements$kotlin_metadata() {
        return this.ignoreUnknownVersionRequirements;
    }

    @NotNull
    public final NameResolver getStrings() {
        return this.strings;
    }

    @Nullable
    public final Integer getTypeParameterId$kotlin_metadata(int i11) {
        Integer num = this.typeParameterNameToId.get(Integer.valueOf(i11));
        if (num != null) {
            return num;
        }
        ReadContext readContext = this.parent;
        if (readContext != null) {
            return readContext.getTypeParameterId$kotlin_metadata(i11);
        }
        return null;
    }

    @NotNull
    public final TypeTable getTypes() {
        return this.types;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirements$kotlin_metadata() {
        return this.versionRequirements;
    }

    @NotNull
    public final ReadContext withTypeParameters$kotlin_metadata(@NotNull List<ProtoBuf.TypeParameter> typeParameters) {
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        ReadContext readContext = new ReadContext(this.strings, this.types, this.versionRequirements, this.ignoreUnknownVersionRequirements, this, this.contextExtensions);
        for (ProtoBuf.TypeParameter typeParameter : typeParameters) {
            readContext.typeParameterNameToId.put(Integer.valueOf(typeParameter.getName()), Integer.valueOf(typeParameter.getId()));
        }
        return readContext;
    }

    public /* synthetic */ ReadContext(NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, boolean z11, ReadContext readContext, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, versionRequirementTable, z11, (i11 & 16) != 0 ? null : readContext, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list);
    }
}
