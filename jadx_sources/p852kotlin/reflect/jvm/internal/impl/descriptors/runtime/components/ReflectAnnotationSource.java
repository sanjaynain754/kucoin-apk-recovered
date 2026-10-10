package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

/* JADX INFO: compiled from: ReflectAnnotationSource.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectAnnotationSource implements SourceElement {

    @NotNull
    private final Annotation annotation;

    public ReflectAnnotationSource(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.annotation = annotation;
    }

    @NotNull
    public final Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }
}
