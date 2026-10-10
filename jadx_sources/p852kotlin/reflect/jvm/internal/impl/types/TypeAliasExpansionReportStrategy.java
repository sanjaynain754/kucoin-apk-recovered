package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;

/* JADX INFO: compiled from: TypeAliasExpansionReportStrategy.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface TypeAliasExpansionReportStrategy {

    /* JADX INFO: compiled from: TypeAliasExpansionReportStrategy.kt */
    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {

        @NotNull
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void repeatedAnnotation(@NotNull AnnotationDescriptor annotation) {
            Intrinsics.checkNotNullParameter(annotation, "annotation");
        }

        private DO_NOTHING() {
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void boundsViolationInSubstitution(@NotNull TypeSubstitutor substitutor, @NotNull KotlinType unsubstitutedArgument, @NotNull KotlinType argument, @NotNull TypeParameterDescriptor typeParameter) {
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            Intrinsics.checkNotNullParameter(unsubstitutedArgument, "unsubstitutedArgument");
            Intrinsics.checkNotNullParameter(argument, "argument");
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void conflictingProjection(@NotNull TypeAliasDescriptor typeAlias, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType substitutedArgument) {
            Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
            Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy
        public void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAlias) {
            Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        }
    }

    void boundsViolationInSubstitution(@NotNull TypeSubstitutor typeSubstitutor, @NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull TypeParameterDescriptor typeParameterDescriptor);

    void conflictingProjection(@NotNull TypeAliasDescriptor typeAliasDescriptor, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull KotlinType kotlinType);

    void recursiveTypeAlias(@NotNull TypeAliasDescriptor typeAliasDescriptor);

    void repeatedAnnotation(@NotNull AnnotationDescriptor annotationDescriptor);
}
