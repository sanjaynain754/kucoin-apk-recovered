package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmFunctionExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmFunction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmFunction\n*L\n263#1:831\n263#1:832,3\n*E\n"})
public final class KmFunction {

    @NotNull
    private final List<KmAnnotation> annotations;

    @NotNull
    private final List<KmType> contextReceiverTypes;

    @Nullable
    private KmContract contract;

    @NotNull
    private final List<KmAnnotation> extensionReceiverParameterAnnotations;

    @NotNull
    private final List<KmFunctionExtension> extensions;
    private int flags;

    @NotNull
    private String name;

    @Nullable
    private KmType receiverParameterType;
    public KmType returnType;

    @NotNull
    private final List<KmTypeParameter> typeParameters;

    @NotNull
    private final List<KmValueParameter> valueParameters;

    @NotNull
    private final List<KmVersionRequirement> versionRequirements;

    public KmFunction(int i11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.flags = i11;
        this.name = name;
        this.typeParameters = new ArrayList(0);
        this.extensionReceiverParameterAnnotations = new ArrayList(0);
        this.contextReceiverTypes = new ArrayList(0);
        this.valueParameters = new ArrayList();
        this.versionRequirements = new ArrayList(0);
        this.annotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createFunctionExtension());
        }
        this.extensions = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final List<KmType> getContextReceiverTypes() {
        return this.contextReceiverTypes;
    }

    @NotNull
    public final List<KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.extensionReceiverParameterAnnotations;
    }

    @NotNull
    public final List<KmFunctionExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    @NotNull
    public final List<KmValueParameter> getValueParameters() {
        return this.valueParameters;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setContract(@Nullable KmContract kmContract) {
        this.contract = kmContract;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }

    public final void setReceiverParameterType(@Nullable KmType kmType) {
        this.receiverParameterType = kmType;
    }

    public final void setReturnType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.returnType = kmType;
    }
}
