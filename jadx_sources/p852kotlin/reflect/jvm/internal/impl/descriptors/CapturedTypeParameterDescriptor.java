package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
final class CapturedTypeParameterDescriptor implements TypeParameterDescriptor {

    @NotNull
    private final DeclarationDescriptor declarationDescriptor;
    private final int declaredTypeParametersCount;

    @NotNull
    private final TypeParameterDescriptor originalDescriptor;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    public CapturedTypeParameterDescriptor(@NotNull TypeParameterDescriptor originalDescriptor, @NotNull DeclarationDescriptor declarationDescriptor, int i11) {
        Intrinsics.checkNotNullParameter(originalDescriptor, "originalDescriptor");
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        this.originalDescriptor = originalDescriptor;
        this.declarationDescriptor = declarationDescriptor;
        this.declaredTypeParametersCount = i11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return (R) this.originalDescriptor.accept(declarationDescriptorVisitor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.originalDescriptor.getAnnotations();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.declarationDescriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType defaultType = this.originalDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.declaredTypeParametersCount + this.originalDescriptor.getIndex();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.originalDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement source = this.originalDescriptor.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
        return source;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.originalDescriptor.getStorageManager();
        Intrinsics.checkNotNullExpressionValue(storageManager, "getStorageManager(...)");
        return storageManager;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.originalDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> upperBounds = this.originalDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    @NotNull
    public Variance getVariance() {
        Variance variance = this.originalDescriptor.getVariance();
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        return variance;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.originalDescriptor.isReified();
    }

    @NotNull
    public String toString() {
        return this.originalDescriptor + "[inner-copy]";
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor original = this.originalDescriptor.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        return original;
    }
}
