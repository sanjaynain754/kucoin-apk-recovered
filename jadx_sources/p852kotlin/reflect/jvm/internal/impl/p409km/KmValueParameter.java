package p852kotlin.reflect.jvm.internal.impl.p409km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmValueParameterExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Nodes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nNodes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmValueParameter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,830:1\n1617#2,9:831\n1869#2:840\n1870#2:842\n1626#2:843\n1#3:841\n*S KotlinDebug\n*F\n+ 1 Nodes.kt\nkotlin/metadata/KmValueParameter\n*L\n476#1:831,9\n476#1:840\n476#1:842\n476#1:843\n476#1:841\n*E\n"})
public final class KmValueParameter {

    @Nullable
    private KmAnnotationArgument annotationParameterDefaultValue;

    @NotNull
    private final List<KmAnnotation> annotations;

    @NotNull
    private final List<KmValueParameterExtension> extensions;
    private int flags;

    @NotNull
    private String name;
    public KmType type;

    @Nullable
    private KmType varargElementType;

    public KmValueParameter(int i11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.flags = i11;
        this.name = name;
        this.annotations = new ArrayList(0);
        List<MetadataExtensions> iNSTANCES$kotlin_metadata = MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            KmValueParameterExtension kmValueParameterExtensionCreateValueParameterExtension = ((MetadataExtensions) it.next()).createValueParameterExtension();
            if (kmValueParameterExtensionCreateValueParameterExtension != null) {
                arrayList.add(kmValueParameterExtensionCreateValueParameterExtension);
            }
        }
        this.extensions = arrayList;
    }

    @Nullable
    public final KmAnnotationArgument getAnnotationParameterDefaultValue() {
        return this.annotationParameterDefaultValue;
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final KmType getType() {
        KmType kmType = this.type;
        if (kmType != null) {
            return kmType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    @Nullable
    public final KmType getVarargElementType() {
        return this.varargElementType;
    }

    public final void setAnnotationParameterDefaultValue(@Nullable KmAnnotationArgument kmAnnotationArgument) {
        this.annotationParameterDefaultValue = kmAnnotationArgument;
    }

    public final void setFlags$kotlin_metadata(int i11) {
        this.flags = i11;
    }

    public final void setType(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<set-?>");
        this.type = kmType;
    }

    public final void setVarargElementType(@Nullable KmType kmType) {
        this.varargElementType = kmType;
    }
}
