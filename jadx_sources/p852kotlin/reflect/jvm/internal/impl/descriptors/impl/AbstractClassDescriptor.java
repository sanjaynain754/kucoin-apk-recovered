package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected final NotNullLazyValue<SimpleType> defaultType;
    private final Name name;
    private final NotNullLazyValue<ReceiverParameterDescriptor> thisAsReceiverParameter;
    private final NotNullLazyValue<MemberScope> unsubstitutedInnerClassesScope;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(10);
        }
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(11);
        }
        if (!typeSubstitution.isEmpty()) {
            return new SubstitutingScope(getUnsubstitutedMemberScope(kotlinTypeRefiner), TypeSubstitutor.create(typeSubstitution));
        }
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public ClassDescriptor getOriginal() {
        return this;
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i11 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i11 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i11 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i11 == 19) {
            objArr[1] = "substitute";
        } else if (i11 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 9 && i11 != 12 && i11 != 14 && i11 != 16 && i11 != 17 && i11 != 19 && i11 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AbstractClassDescriptor(@NotNull StorageManager storageManager, @NotNull Name name) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (name == null) {
            $$$reportNull$$$0(1);
        }
        this.name = name;
        this.defaultType = storageManager.createLazyValue(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1
            @Override // p852kotlin.jvm.functions.Function0
            public SimpleType invoke() {
                AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
                return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.1.1
                    @Override // p852kotlin.jvm.functions.Function1
                    public SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                        ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(AbstractClassDescriptor.this);
                        if (classifierDescriptorRefineDescriptor == null) {
                            return AbstractClassDescriptor.this.defaultType.invoke();
                        }
                        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
                            return KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, TypeUtils.getDefaultTypeProjections(classifierDescriptorRefineDescriptor.getTypeConstructor().getParameters()));
                        }
                        return classifierDescriptorRefineDescriptor instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorRefineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner), this) : classifierDescriptorRefineDescriptor.getDefaultType();
                    }
                });
            }
        });
        this.unsubstitutedInnerClassesScope = storageManager.createLazyValue(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.2
            @Override // p852kotlin.jvm.functions.Function0
            public MemberScope invoke() {
                return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
            }
        });
        this.thisAsReceiverParameter = storageManager.createLazyValue(new Function0<ReceiverParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor.3
            @Override // p852kotlin.jvm.functions.Function0
            public ReceiverParameterDescriptor invoke() {
                return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
            }
        });
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(6);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public SimpleType getDefaultType() {
        SimpleType simpleTypeInvoke = this.defaultType.invoke();
        if (simpleTypeInvoke == null) {
            $$$reportNull$$$0(20);
        }
        return simpleTypeInvoke;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Named
    @NotNull
    public Name getName() {
        Name name = this.name;
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        return name;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        ReceiverParameterDescriptor receiverParameterDescriptorInvoke = this.thisAsReceiverParameter.invoke();
        if (receiverParameterDescriptorInvoke == null) {
            $$$reportNull$$$0(5);
        }
        return receiverParameterDescriptorInvoke;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScopeInvoke = this.unsubstitutedInnerClassesScope.invoke();
        if (memberScopeInvoke == null) {
            $$$reportNull$$$0(4);
        }
        return memberScopeInvoke;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @NotNull
    public ClassDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(18);
        }
        return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(17);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(15);
        }
        MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            $$$reportNull$$$0(16);
        }
        return memberScope;
    }
}
