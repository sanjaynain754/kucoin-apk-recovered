package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p852kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import p852kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes61.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private List<TypeParameterDescriptor> declaredTypeParameters;
    private TypeSubstitutor newSubstitutor;
    private final ModuleAwareClassDescriptor original;
    private final TypeSubstitutor originalSubstitutor;
    private TypeConstructor typeConstructor;
    private List<TypeParameterDescriptor> typeConstructorParameters;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(5);
        }
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(6);
        }
        MemberScope memberScope = this.original.getMemberScope(typeSubstitution, kotlinTypeRefiner);
        if (!this.originalSubstitutor.isEmpty()) {
            return new SubstitutingScope(memberScope, getSubstitutor());
        }
        if (memberScope == null) {
            $$$reportNull$$$0(7);
        }
        return memberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this.original)));
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return unsubstitutedMemberScope;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 13 || i11 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 13 || i11 == 23) ? 3 : 2];
        if (i11 == 2) {
            objArr[0] = "typeArguments";
        } else if (i11 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i11 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i11 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i11 == 8) {
            objArr[0] = "typeArguments";
        } else if (i11 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i11 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i11 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i11 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i11 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 8 && i11 != 10 && i11 != 13 && i11 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    private TypeSubstitutor getSubstitutor() {
        if (this.newSubstitutor == null) {
            if (this.originalSubstitutor.isEmpty()) {
                this.newSubstitutor = this.originalSubstitutor;
            } else {
                List<TypeParameterDescriptor> parameters = this.original.getTypeConstructor().getParameters();
                this.typeConstructorParameters = new ArrayList(parameters.size());
                this.newSubstitutor = DescriptorSubstitutor.substituteTypeParameters(parameters, this.originalSubstitutor.getSubstitution(), this, this.typeConstructorParameters);
                this.declaredTypeParameters = CollectionsKt.filter(this.typeConstructorParameters, new Function1<TypeParameterDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.1
                    @Override // p852kotlin.jvm.functions.Function1
                    public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
                        return Boolean.valueOf(!typeParameterDescriptor.isCapturedFromOuterDeclaration());
                    }
                });
            }
        }
        return this.newSubstitutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public SimpleType substituteSimpleType(@Nullable SimpleType simpleType) {
        return (simpleType == null || this.originalSubstitutor.isEmpty()) ? simpleType : (SimpleType) getSubstitutor().substitute(simpleType, Variance.INVARIANT);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.original.getAnnotations();
        if (annotations == null) {
            $$$reportNull$$$0(19);
        }
        return annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo105115getCompanionObjectDescriptor() {
        return this.original.mo105115getCompanionObjectDescriptor();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.original.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(getSubstitutor()));
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = this.original.getContainingDeclaration();
        if (containingDeclaration == null) {
            $$$reportNull$$$0(22);
        }
        return containingDeclaration;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(17);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind kind = this.original.getKind();
        if (kind == null) {
            $$$reportNull$$$0(25);
        }
        return kind;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = this.original.getModality();
        if (modality == null) {
            $$$reportNull$$$0(26);
        }
        return modality;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.original.getName();
        if (name == null) {
            $$$reportNull$$$0(20);
        }
        return name;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            $$$reportNull$$$0(29);
        }
        return sourceElement;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope staticScope = this.original.getStaticScope();
        if (staticScope == null) {
            $$$reportNull$$$0(15);
        }
        return staticScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.original.getTypeConstructor();
        if (this.originalSubstitutor.isEmpty()) {
            if (typeConstructor == null) {
                $$$reportNull$$$0(0);
            }
            return typeConstructor;
        }
        if (this.typeConstructor == null) {
            TypeSubstitutor substitutor = getSubstitutor();
            Collection<KotlinType> collectionMo105127getSupertypes = typeConstructor.mo105127getSupertypes();
            ArrayList arrayList = new ArrayList(collectionMo105127getSupertypes.size());
            Iterator<KotlinType> it = collectionMo105127getSupertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(substitutor.substitute(it.next(), Variance.INVARIANT));
            }
            this.typeConstructor = new ClassTypeConstructorImpl(this, this.typeConstructorParameters, arrayList, LockBasedStorageManager.NO_LOCKS);
        }
        TypeConstructor typeConstructor2 = this.typeConstructor;
        if (typeConstructor2 == null) {
            $$$reportNull$$$0(1);
        }
        return typeConstructor2;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope unsubstitutedInnerClassesScope = this.original.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope == null) {
            $$$reportNull$$$0(28);
        }
        return unsubstitutedInnerClassesScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(13);
        }
        MemberScope unsubstitutedMemberScope = this.original.getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (!this.originalSubstitutor.isEmpty()) {
            return new SubstitutingScope(unsubstitutedMemberScope, getSubstitutor());
        }
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(14);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo105116getUnsubstitutedPrimaryConstructor() {
        return this.original.mo105116getUnsubstitutedPrimaryConstructor();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @Nullable
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = this.original.getValueClassRepresentation();
        if (valueClassRepresentation == null) {
            return null;
        }
        return valueClassRepresentation.mapUnderlyingType(new Function1<SimpleType, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.2
            @Override // p852kotlin.jvm.functions.Function1
            public SimpleType invoke(SimpleType simpleType) {
                return LazySubstitutingClassDescriptor.this.substituteSimpleType(simpleType);
            }
        });
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.original.getVisibility();
        if (visibility == null) {
            $$$reportNull$$$0(27);
        }
        return visibility;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.original.isActual();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.original.isCompanionObject();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.original.isData();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.original.isExpect();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.original.isExternal();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return this.original.isFun();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.original.isInner();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return this.original.isValue();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(23);
        }
        return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), getSubstitutor().getSubstitution()));
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.original = moduleAwareClassDescriptor;
        this.originalSubstitutor = typeSubstitutor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        getSubstitutor();
        List<TypeParameterDescriptor> list = this.declaredTypeParameters;
        if (list == null) {
            $$$reportNull$$$0(30);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(DefaultTypeAttributeTranslator.INSTANCE.toAttributes(getAnnotations(), null, null), getTypeConstructor(), TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
        if (simpleTypeSimpleTypeWithNonTrivialMemberScope == null) {
            $$$reportNull$$$0(16);
        }
        return simpleTypeSimpleTypeWithNonTrivialMemberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ClassDescriptor getOriginal() {
        ClassDescriptor original = this.original.getOriginal();
        if (original == null) {
            $$$reportNull$$$0(21);
        }
        return original;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(10);
        }
        MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            $$$reportNull$$$0(11);
        }
        return memberScope;
    }
}
