package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JavaTypeQualifiersByElementType.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaTypeQualifiersByElementType {

    @NotNull
    private final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers;

    public JavaTypeQualifiersByElementType(@NotNull EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers) {
        Intrinsics.checkNotNullParameter(defaultQualifiers, "defaultQualifiers");
        this.defaultQualifiers = defaultQualifiers;
    }

    @Nullable
    public final JavaDefaultQualifiers get(@Nullable AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.defaultQualifiers.get(annotationQualifierApplicabilityType);
    }

    @NotNull
    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> getDefaultQualifiers() {
        return this.defaultQualifiers;
    }
}
