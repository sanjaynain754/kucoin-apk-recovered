package p852kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1740#2,3:124\n1374#2:129\n1460#2,5:130\n1255#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
public final class CompositeAnnotations implements Annotations {

    @NotNull
    private final List<Annotations> delegates;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.delegates = delegates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor findAnnotation$lambda$2(FqName fqName, Annotations it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.mo105117findAnnotation(fqName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence iterator$lambda$4(Annotations it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.asSequence(it);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo105117findAnnotation(@NotNull final FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (AnnotationDescriptor) SequencesKt.firstOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(this.delegates), new Function1(fqName) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$$Lambda$0
            private final FqName arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return CompositeAnnotations.findAnnotation$lambda$2(this.arg$0, (Annotations) obj);
            }

            {
                this.arg$0 = fqName;
            }
        }));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = CollectionsKt.asSequence(this.delegates).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt.flatMap(CollectionsKt.asSequence(this.delegates), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return CompositeAnnotations.iterator$lambda$4((Annotations) obj);
            }
        }).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... delegates) {
        this((List<? extends Annotations>) ArraysKt.toList(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
