package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeAliasExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeAlias\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n1617#2,9:831\n1869#2:840\n1870#2:842\n1626#2:843\n1#3:841\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeAlias\n*L\n435#1:831,9\n435#1:840\n435#1:842\n435#1:843\n435#1:841\n*E\n"})
public final class KmTypeAlias {

    @NotNull
    private final List<KmAnnotation> annotations;
    public KmType expandedType;

    @NotNull
    private final List<KmTypeAliasExtension> extensions;
    private int flags;

    @NotNull
    private String name;

    @NotNull
    private final List<KmTypeParameter> typeParameters;
    public KmType underlyingType;

    @NotNull
    private final List<KmVersionRequirement> versionRequirements;

    public KmTypeAlias(int i11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.flags = i11;
        this.name = name;
        this.typeParameters = new ArrayList(0);
        this.annotations = new ArrayList(0);
        this.versionRequirements = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            KmTypeAliasExtension kmTypeAliasExtensionCreateTypeAliasExtension = ((MetadataExtensions) it.next()).createTypeAliasExtension();
            if (kmTypeAliasExtensionCreateTypeAliasExtension != null) {
                arrayList.add(kmTypeAliasExtensionCreateTypeAliasExtension);
            }
        }
        this.extensions = arrayList;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    @NotNull
    public final List<KmTypeParameter> getTypeParameters() {
        return this.typeParameters;
    }

    @NotNull
    public final List<KmVersionRequirement> getVersionRequirements() {
        return this.versionRequirements;
    }

    public final void setExpandedType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.expandedType = kmType;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }

    public final void setUnderlyingType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.underlyingType = kmType;
    }
}
