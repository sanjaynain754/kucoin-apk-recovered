package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.tencent.bugly.proguard.C33612dh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes61.dex */
public class MutableClassDescriptor extends ClassDescriptorBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean isInner;
    private final ClassKind kind;
    private Modality modality;
    private final StorageManager storageManager;
    private final Collection<KotlinType> supertypes;
    private TypeConstructor typeConstructor;
    private List<TypeParameterDescriptor> typeParameters;
    private DescriptorVisibility visibility;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo105115getCompanionObjectDescriptor() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo105116getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableClassDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull ClassKind classKind, boolean z11, boolean z12, @NotNull Name name, @NotNull SourceElement sourceElement, @NotNull StorageManager storageManager) {
        super(storageManager, declarationDescriptor, name, sourceElement, z12);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (classKind == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        if (storageManager == null) {
            $$$reportNull$$$0(4);
        }
        this.supertypes = new ArrayList();
        this.storageManager = storageManager;
        this.kind = classKind;
        this.isInner = z11;
    }

    public void createTypeConstructor() {
        this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeParameters, this.supertypes, this.storageManager);
        Iterator<ClassConstructorDescriptor> it = getConstructors().iterator();
        while (it.hasNext()) {
            ((ClassConstructorDescriptorImpl) it.next()).setReturnType(getDefaultType());
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations empty = Annotations.Companion.getEMPTY();
        if (empty == null) {
            $$$reportNull$$$0(5);
        }
        return empty;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Set<ClassConstructorDescriptor> getConstructors() {
        Set<ClassConstructorDescriptor> set = Collections.EMPTY_SET;
        if (set == null) {
            $$$reportNull$$$0(13);
        }
        return set;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = this.typeParameters;
        if (list == null) {
            $$$reportNull$$$0(15);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind = this.kind;
        if (classKind == null) {
            $$$reportNull$$$0(8);
        }
        return classKind;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.modality;
        if (modality == null) {
            $$$reportNull$$$0(7);
        }
        return modality;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty == null) {
            $$$reportNull$$$0(18);
        }
        return empty;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.typeConstructor;
        if (typeConstructor == null) {
            $$$reportNull$$$0(11);
        }
        return typeConstructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(16);
        }
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty == null) {
            $$$reportNull$$$0(17);
        }
        return empty;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.visibility;
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(10);
        }
        return descriptorVisibility;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.isInner;
    }

    public void setModality(@NotNull Modality modality) {
        if (modality == null) {
            $$$reportNull$$$0(6);
        }
        this.modality = modality;
    }

    public void setTypeParameterDescriptors(@NotNull List<TypeParameterDescriptor> list) {
        if (list == null) {
            $$$reportNull$$$0(14);
        }
        if (this.typeParameters == null) {
            this.typeParameters = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void setVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(9);
        }
        this.visibility = descriptorVisibility;
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i12 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = C33612dh.f69618m;
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i11) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public String toString() {
        return DeclarationDescriptorImpl.toString(this);
    }
}
