package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.tencent.bugly.proguard.C33612dh;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes61.dex */
public class PropertyGetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertyGetterDescriptor {

    @NotNull
    private final PropertyGetterDescriptor original;
    private KotlinType returnType;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    @NotNull
    public Collection<? extends PropertyGetterDescriptor> getOverriddenDescriptors() {
        Collection<PropertyAccessorDescriptor> overriddenDescriptors = super.getOverriddenDescriptors(true);
        if (overriddenDescriptors == null) {
            $$$reportNull$$$0(6);
        }
        return overriddenDescriptors;
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 6 || i11 == 7 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 6 || i11 == 7 || i11 == 8) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = C33612dh.f69618m;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i11 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i11 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i11 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 6 && i11 != 7 && i11 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyGetterDescriptorImpl(@NotNull PropertyDescriptor propertyDescriptor, @NotNull Annotations annotations, @NotNull Modality modality, @NotNull DescriptorVisibility descriptorVisibility, boolean z11, boolean z12, boolean z13, @NotNull CallableMemberDescriptor.Kind kind, @Nullable PropertyGetterDescriptor propertyGetterDescriptor, @NotNull SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.special("<get-" + propertyDescriptor.getName() + ">"), z11, z12, z13, kind, sourceElement);
        if (propertyDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (modality == null) {
            $$$reportNull$$$0(2);
        }
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(3);
        }
        if (kind == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        this.original = propertyGetterDescriptor != null ? propertyGetterDescriptor : this;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.returnType;
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

    public void initialize(KotlinType kotlinType) {
        if (kotlinType == null) {
            kotlinType = getCorrespondingProperty().getType();
        }
        this.returnType = kotlinType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitPropertyGetterDescriptor(this, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public PropertyGetterDescriptor getOriginal() {
        PropertyGetterDescriptor propertyGetterDescriptor = this.original;
        if (propertyGetterDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        return propertyGetterDescriptor;
    }
}
