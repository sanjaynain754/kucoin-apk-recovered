package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    @NotNull
    private final Annotations annotations;

    public AnnotationsTypeAttribute(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.annotations = annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public AnnotationsTypeAttribute add(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.annotations, annotationsTypeAttribute.annotations));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.areEqual(((AnnotationsTypeAttribute) obj).annotations, this.annotations);
        }
        return false;
    }

    @NotNull
    public final Annotations getAnnotations() {
        return this.annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @NotNull
    public KClass<? extends AnnotationsTypeAttribute> getKey() {
        return Reflection.getOrCreateKotlinClass(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    @Nullable
    public AnnotationsTypeAttribute intersect(@Nullable AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.areEqual(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
