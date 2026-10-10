package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes61.dex */
final class EnhancedTypeAnnotationDescriptor implements AnnotationDescriptor {

    @NotNull
    public static final EnhancedTypeAnnotationDescriptor INSTANCE = new EnhancedTypeAnnotationDescriptor();

    private final Void throwError() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @NotNull
    public String toString() {
        return "[EnhancedType]";
    }

    private EnhancedTypeAnnotationDescriptor() {
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        throwError();
        throw new KotlinNothingValueException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return AnnotationDescriptor.DefaultImpls.getFqName(this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        throwError();
        throw new KotlinNothingValueException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        throwError();
        throw new KotlinNothingValueException();
    }
}
