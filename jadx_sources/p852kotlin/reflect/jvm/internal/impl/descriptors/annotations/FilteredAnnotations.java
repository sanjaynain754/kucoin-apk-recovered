package p852kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n774#2:124\n865#2,2:125\n1761#2,3:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n*L\n69#1:124\n69#1:125,2\n72#1:127,3\n*E\n"})
public final class FilteredAnnotations implements Annotations {

    @NotNull
    private final Annotations delegate;

    @NotNull
    private final Function1<FqName, Boolean> fqNameFilter;
    private final boolean isDefinitelyNewInference;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(@NotNull Annotations delegate, boolean z11, @NotNull Function1<? super FqName, Boolean> fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.delegate = delegate;
        this.isDefinitelyNewInference = z11;
        this.fqNameFilter = fqNameFilter;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo105117findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.fqNameFilter.invoke(fqName).booleanValue()) {
            return this.delegate.mo105117findAnnotation(fqName);
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.fqNameFilter.invoke(fqName).booleanValue()) {
            return this.delegate.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z11;
        Annotations annotations = this.delegate;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if (shouldBeReturned(it.next())) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (this.isDefinitelyNewInference) {
            return !z11;
        }
        return z11;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        Annotations annotations = this.delegate;
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            if (shouldBeReturned(annotationDescriptor)) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    private final boolean shouldBeReturned(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName != null && this.fqNameFilter.invoke(fqName).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(@NotNull Annotations delegate, @NotNull Function1<? super FqName, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
    }
}
