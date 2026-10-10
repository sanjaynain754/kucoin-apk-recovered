package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPackageExtension;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmPackage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmPackage\n*L\n160#1:831\n160#1:832,3\n*E\n"})
public final class KmPackage implements KmDeclarationContainer {

    @NotNull
    private final List<KmPackageExtension> extensions;

    @NotNull
    private final List<KmFunction> functions;

    @NotNull
    private final List<KmProperty> properties;

    @NotNull
    private final List<KmTypeAlias> typeAliases;

    @NotNull
    public final List<KmPackageExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmDeclarationContainer
    @NotNull
    public List<KmFunction> getFunctions() {
        return this.functions;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmDeclarationContainer
    @NotNull
    public List<KmProperty> getProperties() {
        return this.properties;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.p409km.KmDeclarationContainer
    @NotNull
    public List<KmTypeAlias> getTypeAliases() {
        return this.typeAliases;
    }
}
