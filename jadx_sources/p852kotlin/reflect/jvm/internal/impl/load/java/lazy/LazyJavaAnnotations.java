package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyJavaAnnotations implements Annotations {

    @NotNull
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> annotationDescriptors;

    @NotNull
    private final JavaAnnotationOwner annotationOwner;
    private final boolean areAnnotationsFreshlySupported;

    /* JADX INFO: renamed from: c */
    @NotNull
    private final LazyJavaResolverContext f91363c;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext c11, @NotNull JavaAnnotationOwner annotationOwner, boolean z11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f91363c = c11;
        this.annotationOwner = annotationOwner;
        this.areAnnotationsFreshlySupported = z11;
        this.annotationDescriptors = c11.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$$Lambda$0
            private final LazyJavaAnnotations arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaAnnotations.annotationDescriptors$lambda$0(this.arg$0, (JavaAnnotation) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor annotationDescriptors$lambda$0(LazyJavaAnnotations lazyJavaAnnotations, JavaAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(annotation, lazyJavaAnnotations.f91363c, lazyJavaAnnotations.areAnnotationsFreshlySupported);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo105117findAnnotation(@NotNull FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        JavaAnnotation javaAnnotationFindAnnotation = this.annotationOwner.findAnnotation(fqName);
        return (javaAnnotationFindAnnotation == null || (annotationDescriptorInvoke = this.annotationDescriptors.invoke(javaAnnotationFindAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f91363c) : annotationDescriptorInvoke;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt.filterNotNull(SequencesKt.plus((Sequence<? extends AnnotationDescriptor>) SequencesKt.map(CollectionsKt.asSequence(this.annotationOwner.getAnnotations()), this.annotationDescriptors), JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, this.annotationOwner, this.f91363c))).iterator();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i11 & 4) != 0 ? false : z11);
    }
}
