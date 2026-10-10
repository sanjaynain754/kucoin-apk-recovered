package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.TransientReceiver;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractReceiverParameterDescriptor extends DeclarationDescriptorImpl implements ReceiverParameterDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractReceiverParameterDescriptor(@NotNull Annotations annotations) {
        super(annotations, SpecialNames.THIS);
        if (annotations == null) {
            $$$reportNull$$$0(0);
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ParameterDescriptor getOriginal() {
        return this;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractReceiverParameterDescriptor(@NotNull Annotations annotations, @NotNull Name name) {
        super(annotations, name);
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(4);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends CallableDescriptor> getOverriddenDescriptors() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(8);
        }
        return set;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            $$$reportNull$$$0(11);
        }
        return sourceElement;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(7);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.LOCAL;
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(9);
        }
        return descriptorVisibility;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    public ReceiverParameterDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(3);
        }
        if (!typeSubstitutor.isEmpty()) {
            KotlinType kotlinTypeSubstitute = getContainingDeclaration() instanceof ClassDescriptor ? typeSubstitutor.substitute(getType(), Variance.OUT_VARIANCE) : typeSubstitutor.substitute(getType(), Variance.INVARIANT);
            if (kotlinTypeSubstitute == null) {
                return null;
            }
            if (kotlinTypeSubstitute != getType()) {
                return new ReceiverParameterDescriptorImpl(getContainingDeclaration(), new TransientReceiver(kotlinTypeSubstitute), getAnnotations());
            }
        }
        return this;
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i11) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitReceiverParameterDescriptor(this, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @Nullable
    public KotlinType getReturnType() {
        return getType();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor
    @NotNull
    public KotlinType getType() {
        KotlinType type = getValue().getType();
        if (type == null) {
            $$$reportNull$$$0(6);
        }
        return type;
    }
}
