package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes61.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        @Nullable
        D build();

        @NotNull
        <V> CopyBuilder<D> putUserData(@NotNull CallableDescriptor.UserDataKey<V> userDataKey, V v11);

        @NotNull
        CopyBuilder<D> setAdditionalAnnotations(@NotNull Annotations annotations);

        @NotNull
        CopyBuilder<D> setCopyOverrides(boolean z11);

        @NotNull
        CopyBuilder<D> setDispatchReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @NotNull
        CopyBuilder<D> setDropOriginalInContainingParts();

        @NotNull
        CopyBuilder<D> setExtensionReceiverParameter(@Nullable ReceiverParameterDescriptor receiverParameterDescriptor);

        @NotNull
        CopyBuilder<D> setHiddenForResolutionEverywhereBesideSupercalls();

        @NotNull
        CopyBuilder<D> setHiddenToOvercomeSignatureClash();

        @NotNull
        CopyBuilder<D> setKind(@NotNull CallableMemberDescriptor.Kind kind);

        @NotNull
        CopyBuilder<D> setModality(@NotNull Modality modality);

        @NotNull
        CopyBuilder<D> setName(@NotNull Name name);

        @NotNull
        CopyBuilder<D> setOriginal(@Nullable CallableMemberDescriptor callableMemberDescriptor);

        @NotNull
        CopyBuilder<D> setOwner(@NotNull DeclarationDescriptor declarationDescriptor);

        @NotNull
        CopyBuilder<D> setPreserveSourceElement();

        @NotNull
        CopyBuilder<D> setReturnType(@NotNull KotlinType kotlinType);

        @NotNull
        CopyBuilder<D> setSignatureChange();

        @NotNull
        CopyBuilder<D> setSubstitution(@NotNull TypeSubstitution typeSubstitution);

        @NotNull
        CopyBuilder<D> setTypeParameters(@NotNull List<TypeParameterDescriptor> list);

        @NotNull
        CopyBuilder<D> setValueParameters(@NotNull List<ValueParameterDescriptor> list);

        @NotNull
        CopyBuilder<D> setVisibility(@NotNull DescriptorVisibility descriptorVisibility);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @Nullable
    FunctionDescriptor getInitialSignatureDescriptor();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    FunctionDescriptor getOriginal();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    Collection<? extends FunctionDescriptor> getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    @NotNull
    CopyBuilder<? extends FunctionDescriptor> newCopyBuilder();

    @Nullable
    FunctionDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
