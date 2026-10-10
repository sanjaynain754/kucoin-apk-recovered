package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import p852kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p852kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
final class SignatureParts extends AbstractSignatureParts<AnnotationDescriptor> {

    @NotNull
    private final AnnotationQualifierApplicabilityType containerApplicabilityType;

    @NotNull
    private final LazyJavaResolverContext containerContext;
    private final boolean isCovariant;
    private final boolean skipRawTypeArguments;

    @Nullable
    private final Annotated typeContainer;

    public /* synthetic */ SignatureParts(Annotated annotated, boolean z11, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotated, z11, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i11 & 16) != 0 ? false : z12);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    public NullabilityQualifierWithMigrationStatus getDefaultNullability(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusCopy$default;
        if (nullabilityQualifierWithMigrationStatus != null && (nullabilityQualifierWithMigrationStatusCopy$default = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return nullabilityQualifierWithMigrationStatusCopy$default;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.getNullabilityQualifier();
        }
        return null;
    }

    public SignatureParts(@Nullable Annotated annotated, boolean z11, @NotNull LazyJavaResolverContext containerContext, @NotNull AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z12) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.typeContainer = annotated;
        this.isCovariant = z11;
        this.containerContext = containerContext;
        this.containerApplicabilityType = containerApplicabilityType;
        this.skipRawTypeArguments = z12;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean forceWarning(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "<this>");
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) {
            return true;
        }
        if ((annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && !getEnableImprovementsInStrictMode() && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return kotlinTypeMarker != null && KotlinBuiltIns.isPrimitiveArray((KotlinType) kotlinTypeMarker) && getAnnotationTypeQualifierResolver().isTypeUseAnnotation(annotationDescriptor) && !this.containerContext.getComponents().getSettings().getEnhancePrimitiveArrays();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    public AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> getAnnotationTypeQualifierResolver() {
        return this.containerContext.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    public Iterable<AnnotationDescriptor> getAnnotations(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    public Iterable<AnnotationDescriptor> getContainerAnnotations() {
        Annotations annotations;
        Annotated annotated = this.typeContainer;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? CollectionsKt.emptyList() : annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    public AnnotationQualifierApplicabilityType getContainerApplicabilityType() {
        return this.containerApplicabilityType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    public JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers() {
        return this.containerContext.getDefaultTypeQualifiers();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean getContainerIsVarargParameter() {
        Annotated annotated = this.typeContainer;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).getVarargElementType() != null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean getEnableImprovementsInStrictMode() {
        return this.containerContext.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    public KotlinType getEnhancedForWarnings(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.getEnhancement((KotlinType) kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @Nullable
    public FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        ClassDescriptor classDescriptor = TypeUtils.getClassDescriptor((KotlinType) kotlinTypeMarker);
        if (classDescriptor != null) {
            return DescriptorUtils.getFqName(classDescriptor);
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean getSkipRawTypeArguments() {
        return this.skipRawTypeArguments;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    @NotNull
    public TypeSystemInferenceExtensionContext getTypeSystem() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return KotlinBuiltIns.isArrayOrPrimitiveArray((KotlinType) kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isCovariant() {
        return this.isCovariant;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isEqual(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker other) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return this.containerContext.getComponents().getKotlinTypeChecker().equalTypes((KotlinType) kotlinTypeMarker, (KotlinType) other);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isFromJava(@NotNull TypeParameterMarker typeParameterMarker) {
        Intrinsics.checkNotNullParameter(typeParameterMarker, "<this>");
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).unwrap() instanceof NotNullTypeParameterImpl;
    }
}
