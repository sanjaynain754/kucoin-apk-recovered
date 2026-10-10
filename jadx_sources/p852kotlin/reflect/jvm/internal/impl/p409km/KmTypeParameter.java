package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeParameterExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeParameter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmTypeParameter\n*L\n505#1:831\n505#1:832,3\n*E\n"})
public final class KmTypeParameter {

    @NotNull
    private final List<KmTypeParameterExtension> extensions;
    private int flags;

    /* JADX INFO: renamed from: id */
    private int f91361id;

    @NotNull
    private String name;

    @NotNull
    private final List<KmType> upperBounds;

    @NotNull
    private KmVariance variance;

    public KmTypeParameter(int i11, @NotNull String name, int i12, @NotNull KmVariance variance) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.flags = i11;
        this.name = name;
        this.f91361id = i12;
        this.variance = variance;
        this.upperBounds = new ArrayList(1);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createTypeParameterExtension());
        }
        this.extensions = arrayList;
    }

    @NotNull
    public final List<KmTypeParameterExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final int getId() {
        return this.f91361id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<KmType> getUpperBounds() {
        return this.upperBounds;
    }

    @NotNull
    public final KmVariance getVariance() {
        return this.variance;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }
}
