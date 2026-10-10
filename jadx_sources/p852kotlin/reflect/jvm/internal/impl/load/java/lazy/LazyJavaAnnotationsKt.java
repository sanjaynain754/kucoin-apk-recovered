package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyJavaAnnotationsKt {
    @NotNull
    public static final Annotations resolveAnnotations(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotationOwner annotationsOwner) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(lazyJavaResolverContext, annotationsOwner, false, 4, null);
    }
}
