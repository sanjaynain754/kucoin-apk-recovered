package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* JADX INFO: loaded from: classes61.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    @Nullable
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    ClassDescriptor mo105115getCompanionObjectDescriptor();

    @NotNull
    Collection<ClassConstructorDescriptor> getConstructors();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    List<ReceiverParameterDescriptor> getContextReceivers();

    @NotNull
    List<TypeParameterDescriptor> getDeclaredTypeParameters();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    SimpleType getDefaultType();

    @NotNull
    ClassKind getKind();

    @NotNull
    MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution);

    @NotNull
    Modality getModality();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassDescriptor getOriginal();

    @NotNull
    MemberScope getStaticScope();

    @NotNull
    ReceiverParameterDescriptor getThisAsReceiverParameter();

    @NotNull
    MemberScope getUnsubstitutedInnerClassesScope();

    @NotNull
    MemberScope getUnsubstitutedMemberScope();

    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    ClassConstructorDescriptor mo105116getUnsubstitutedPrimaryConstructor();

    @Nullable
    ValueClassRepresentation<SimpleType> getValueClassRepresentation();

    @NotNull
    DescriptorVisibility getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isFun();

    boolean isInline();

    boolean isValue();
}
