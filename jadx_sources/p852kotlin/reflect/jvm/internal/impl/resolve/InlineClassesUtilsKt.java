package p852kotlin.reflect.jvm.internal.impl.resolve;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;

/* JADX INFO: compiled from: inlineClassesUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\ninlineClassesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1563#2:91\n1634#2,3:92\n1563#2:96\n1634#2,3:97\n1761#2,3:100\n1#3:95\n*S KotlinDebug\n*F\n+ 1 inlineClassesUtils.kt\norg/jetbrains/kotlin/resolve/InlineClassesUtilsKt\n*L\n40#1:91\n40#1:92,3\n56#1:96\n56#1:97,3\n67#1:100,3\n*E\n"})
public final class InlineClassesUtilsKt {

    @NotNull
    private static final ClassId JVM_INLINE_ANNOTATION_CLASS_ID;

    @NotNull
    private static final FqName JVM_INLINE_ANNOTATION_FQ_NAME;

    @NotNull
    private static final FqName JVM_NAME_ANNOTATION_FQ_NAME;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmInline");
        JVM_INLINE_ANNOTATION_FQ_NAME = fqName;
        JVM_INLINE_ANNOTATION_CLASS_ID = ClassId.Companion.topLevel(fqName);
        JVM_NAME_ANNOTATION_FQ_NAME = new FqName("kotlin.jvm.JvmName");
    }

    public static final boolean isGetterOfUnderlyingPropertyOfValueClass(@NotNull CallableDescriptor callableDescriptor) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
        if (!(callableDescriptor instanceof PropertyGetterDescriptor)) {
            return false;
        }
        PropertyDescriptor correspondingProperty = ((PropertyGetterDescriptor) callableDescriptor).getCorrespondingProperty();
        Intrinsics.checkNotNullExpressionValue(correspondingProperty, "getCorrespondingProperty(...)");
        return isUnderlyingPropertyOfValueClass(correspondingProperty);
    }

    public static final boolean isInlineClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof InlineClassRepresentation);
    }

    public static final boolean isInlineClassType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor != null) {
            return isInlineClass(classifierDescriptorMo105126getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean isMultiFieldValueClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof MultiFieldValueClassRepresentation);
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(@NotNull VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        Intrinsics.checkNotNullParameter(variableDescriptor, "<this>");
        if (variableDescriptor.getExtensionReceiverParameter() != null) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        Name underlyingPropertyName = null;
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) != null) {
            underlyingPropertyName = inlineClassRepresentation.getUnderlyingPropertyName();
        }
        return Intrinsics.areEqual(underlyingPropertyName, variableDescriptor.getName());
    }

    public static final boolean isUnderlyingPropertyOfValueClass(@NotNull VariableDescriptor variableDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation;
        Intrinsics.checkNotNullParameter(variableDescriptor, "<this>");
        if (variableDescriptor.getExtensionReceiverParameter() != null) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null || (valueClassRepresentation = classDescriptor.getValueClassRepresentation()) == null) {
            return false;
        }
        Name name = variableDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return valueClassRepresentation.containsPropertyWithName(name);
    }

    public static final boolean isValueClass(@NotNull DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return isInlineClass(declarationDescriptor) || isMultiFieldValueClass(declarationDescriptor);
    }

    public static final boolean isValueClassType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor != null) {
            return isValueClass(classifierDescriptorMo105126getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean needsMfvcFlattening(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        return (classifierDescriptorMo105126getDeclarationDescriptor == null || !isMultiFieldValueClass(classifierDescriptorMo105126getDeclarationDescriptor) || SimpleClassicTypeSystemContext.INSTANCE.isNullableType(kotlinType)) ? false : true;
    }

    @Nullable
    public static final KotlinType substitutedUnderlyingType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        KotlinType kotlinTypeUnsubstitutedUnderlyingType = unsubstitutedUnderlyingType(kotlinType);
        if (kotlinTypeUnsubstitutedUnderlyingType != null) {
            return TypeSubstitutor.create(kotlinType).substitute(kotlinTypeUnsubstitutedUnderlyingType, Variance.INVARIANT);
        }
        return null;
    }

    @Nullable
    public static final KotlinType unsubstitutedUnderlyingType(@NotNull KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
        if (classDescriptor == null || (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) == null) {
            return null;
        }
        return (SimpleType) inlineClassRepresentation.getUnderlyingType();
    }
}
