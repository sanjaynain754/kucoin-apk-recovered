package p852kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: ErrorPropertyDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ErrorPropertyDescriptor implements PropertyDescriptor {
    private final /* synthetic */ PropertyDescriptorImpl $$delegate_0;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public PropertyDescriptor getOriginal() {
        PropertyDescriptor original = this.$$delegate_0.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        return original;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor substitute(@NotNull TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        return this.$$delegate_0.substitute(substitutor);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return (R) this.$$delegate_0.accept(declarationDescriptorVisitor, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z11) {
        PropertyDescriptor propertyDescriptorCopy = this.$$delegate_0.copy(declarationDescriptor, modality, descriptorVisibility, kind, z11);
        Intrinsics.checkNotNullExpressionValue(propertyDescriptorCopy, "copy(...)");
        return propertyDescriptorCopy;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @NotNull
    public List<PropertyAccessorDescriptor> getAccessors() {
        List<PropertyAccessorDescriptor> accessors = this.$$delegate_0.getAccessors();
        Intrinsics.checkNotNullExpressionValue(accessors, "getAccessors(...)");
        return accessors;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.$$delegate_0.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getBackingField() {
        return this.$$delegate_0.getBackingField();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    public ConstantValue<?> mo105118getCompileTimeInitializer() {
        return this.$$delegate_0.mo105118getCompileTimeInitializer();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = this.$$delegate_0.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        return containingDeclaration;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> contextReceiverParameters = this.$$delegate_0.getContextReceiverParameters();
        Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
        return contextReceiverParameters;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public FieldDescriptor getDelegateField() {
        return this.$$delegate_0.getDelegateField();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.$$delegate_0.getDispatchReceiverParameter();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.$$delegate_0.getExtensionReceiverParameter();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertyGetterDescriptor getGetter() {
        return this.$$delegate_0.getGetter();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @NotNull
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.$$delegate_0.getKind();
        Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
        return kind;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.$$delegate_0.getModality();
        Intrinsics.checkNotNullExpressionValue(modality, "getModality(...)");
        return modality;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.$$delegate_0.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends PropertyDescriptor> getOverriddenDescriptors() {
        Collection<? extends PropertyDescriptor> overriddenDescriptors = this.$$delegate_0.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        return overriddenDescriptors;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return this.$$delegate_0.getReturnType();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    @Nullable
    public PropertySetterDescriptor getSetter() {
        return this.$$delegate_0.getSetter();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement source = this.$$delegate_0.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
        return source;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType type = this.$$delegate_0.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> typeParameters = this.$$delegate_0.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return (V) this.$$delegate_0.getUserData(userDataKey);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> valueParameters = this.$$delegate_0.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        return valueParameters;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.$$delegate_0.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.$$delegate_0.hasSynthesizedParameterNames();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.$$delegate_0.isActual();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.$$delegate_0.isConst();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean isDelegated() {
        return this.$$delegate_0.isDelegated();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.$$delegate_0.isExpect();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.$$delegate_0.isExternal();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isLateInit() {
        return this.$$delegate_0.isLateInit();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.$$delegate_0.isVar();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void setOverriddenDescriptors(@NotNull Collection<? extends CallableMemberDescriptor> overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
        this.$$delegate_0.setOverriddenDescriptors(overriddenDescriptors);
    }

    public ErrorPropertyDescriptor() {
        ErrorUtils errorUtils = ErrorUtils.INSTANCE;
        PropertyDescriptorImpl propertyDescriptorImplCreate = PropertyDescriptorImpl.create(errorUtils.getErrorClass(), Annotations.Companion.getEMPTY(), Modality.OPEN, DescriptorVisibilities.PUBLIC, true, Name.special(ErrorEntity.ERROR_PROPERTY.getDebugText()), CallableMemberDescriptor.Kind.DECLARATION, SourceElement.NO_SOURCE, false, false, false, false, false, false);
        propertyDescriptorImplCreate.setType(errorUtils.getErrorPropertyType(), CollectionsKt.emptyList(), null, null, CollectionsKt.emptyList());
        this.$$delegate_0 = propertyDescriptorImplCreate;
    }
}
