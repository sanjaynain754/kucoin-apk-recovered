package p852kotlin.reflect.jvm.internal.impl.p409km;

import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1563#2:831\n1634#2,3:832\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmType\n*L\n579#1:831\n579#1:832,3\n*E\n"})
public final class KmType {

    @Nullable
    private KmType abbreviatedType;

    @NotNull
    private final List<KmTypeProjection> arguments;
    public KmClassifier classifier;

    @NotNull
    private final List<KmTypeExtension> extensions;
    private int flags;

    @Nullable
    private KmFlexibleTypeUpperBound flexibleTypeUpperBound;

    @Nullable
    private KmType outerType;

    public KmType(int i11) {
        this.flags = i11;
        this.arguments = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((MetadataExtensions) it.next()).createTypeExtension());
        }
        this.extensions = arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(KmType.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.metadata.KmType");
        KmType kmType = (KmType) obj;
        return this.flags == kmType.flags && Intrinsics.areEqual(getClassifier(), kmType.getClassifier()) && Intrinsics.areEqual(this.arguments, kmType.arguments) && Intrinsics.areEqual(this.outerType, kmType.outerType) && Intrinsics.areEqual(this.abbreviatedType, kmType.abbreviatedType) && Intrinsics.areEqual(this.flexibleTypeUpperBound, kmType.flexibleTypeUpperBound) && Intrinsics.areEqual(this.extensions, kmType.extensions);
    }

    @Nullable
    public final KmType getAbbreviatedType() {
        return this.abbreviatedType;
    }

    @NotNull
    public final List<KmTypeProjection> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final KmClassifier getClassifier() {
        KmClassifier kmClassifier = this.classifier;
        if (kmClassifier != null) {
            return kmClassifier;
        }
        Intrinsics.throwUninitializedPropertyAccessException(DocumentClassifier.KEY_SIDE);
        return null;
    }

    @NotNull
    public final List<KmTypeExtension> getExtensions$kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    @Nullable
    public final KmFlexibleTypeUpperBound getFlexibleTypeUpperBound() {
        return this.flexibleTypeUpperBound;
    }

    @Nullable
    public final KmType getOuterType() {
        return this.outerType;
    }

    public int hashCode() {
        return (((this.flags * 31) + getClassifier().hashCode()) * 31) + this.arguments.hashCode();
    }

    public final void setAbbreviatedType(@Nullable KmType kmType) {
        this.abbreviatedType = kmType;
    }

    public final void setClassifier(@NotNull KmClassifier kmClassifier) {
        Intrinsics.checkNotNullParameter(kmClassifier, "<set-?>");
        this.classifier = kmClassifier;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }

    public final void setFlexibleTypeUpperBound(@Nullable KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound) {
        this.flexibleTypeUpperBound = kmFlexibleTypeUpperBound;
    }

    public final void setOuterType(@Nullable KmType kmType) {
        this.outerType = kmType;
    }

    public KmType() {
        this(0);
    }
}
