package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import p852kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes61.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Annotations annotations;
    private final NotNullLazyValue<Set<Name>> enumMemberNames;
    private final MemberScope scope;
    private final TypeConstructor typeConstructor;

    public class EnumEntryScope extends MemberScopeImpl {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;
        private final MemoizedFunctionToNotNull<Name, Collection<? extends SimpleFunctionDescriptor>> functions;
        private final MemoizedFunctionToNotNull<Name, Collection<? extends PropertyDescriptor>> properties;
        final /* synthetic */ EnumEntrySyntheticClassDescriptor this$0;

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str;
            int i12;
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i12 = 2;
                        break;
                    default:
                        i12 = 3;
                        break;
                }
            } else {
                i12 = 2;
            }
            Object[] objArr = new Object[i12];
            switch (i11) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = FirebaseAnalytics.Param.LOCATION;
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i11 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i11 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i11 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i11 != 12) {
                switch (i11) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        public EnumEntryScope(@NotNull final EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                $$$reportNull$$$0(0);
            }
            this.this$0 = enumEntrySyntheticClassDescriptor;
            this.functions = storageManager.createMemoizedFunction(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                @Override // p852kotlin.jvm.functions.Function1
                public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                    return EnumEntryScope.this.computeFunctions(name);
                }
            });
            this.properties = storageManager.createMemoizedFunction(new Function1<Name, Collection<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.2
                @Override // p852kotlin.jvm.functions.Function1
                public Collection<? extends PropertyDescriptor> invoke(Name name) {
                    return EnumEntryScope.this.computeProperties(name);
                }
            });
            this.allDescriptors = storageManager.createLazyValue(new Function0<Collection<DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.3
                @Override // p852kotlin.jvm.functions.Function0
                public Collection<DeclarationDescriptor> invoke() {
                    return EnumEntryScope.this.computeAllDeclarations();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public Collection<DeclarationDescriptor> computeAllDeclarations() {
            HashSet hashSet = new HashSet();
            for (Name name : (Set) this.this$0.enumMemberNames.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(getContributedFunctions(name, noLookupLocation));
                hashSet.addAll(getContributedVariables(name, noLookupLocation));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public Collection<? extends SimpleFunctionDescriptor> computeFunctions(@NotNull Name name) {
            if (name == null) {
                $$$reportNull$$$0(8);
            }
            return resolveFakeOverrides(name, getSupertypeScope().getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public Collection<? extends PropertyDescriptor> computeProperties(@NotNull Name name) {
            if (name == null) {
                $$$reportNull$$$0(4);
            }
            return resolveFakeOverrides(name, getSupertypeScope().getContributedVariables(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        @NotNull
        private MemberScope getSupertypeScope() {
            MemberScope memberScope = this.this$0.getTypeConstructor().mo105127getSupertypes().iterator().next().getMemberScope();
            if (memberScope == null) {
                $$$reportNull$$$0(9);
            }
            return memberScope;
        }

        @NotNull
        private <D extends CallableMemberDescriptor> Collection<? extends D> resolveFakeOverrides(@NotNull Name name, @NotNull Collection<? extends D> collection) {
            if (name == null) {
                $$$reportNull$$$0(10);
            }
            if (collection == null) {
                $$$reportNull$$$0(11);
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name, collection, Collections.EMPTY_SET, this.this$0, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.4
                private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                    Object[] objArr = new Object[3];
                    if (i11 == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i11 != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i11 == 1 || i11 == 2) {
                        objArr[2] = "conflict";
                    } else {
                        objArr[2] = "addFakeOverride";
                    }
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
                    if (callableMemberDescriptor == null) {
                        $$$reportNull$$$0(0);
                    }
                    OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
                }

                @Override // p852kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public void conflict(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull CallableMemberDescriptor callableMemberDescriptor2) {
                    if (callableMemberDescriptor == null) {
                        $$$reportNull$$$0(1);
                    }
                    if (callableMemberDescriptor2 == null) {
                        $$$reportNull$$$0(2);
                    }
                }
            });
            return linkedHashSet;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getClassifierNames() {
            Set<Name> set = Collections.EMPTY_SET;
            if (set == null) {
                $$$reportNull$$$0(18);
            }
            return set;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(13);
            }
            if (function1 == null) {
                $$$reportNull$$$0(14);
            }
            Collection<DeclarationDescriptor> collectionInvoke = this.allDescriptors.invoke();
            if (collectionInvoke == null) {
                $$$reportNull$$$0(15);
            }
            return collectionInvoke;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        @NotNull
        public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
            }
            Collection<? extends SimpleFunctionDescriptor> collectionInvoke = this.functions.invoke(name);
            if (collectionInvoke == null) {
                $$$reportNull$$$0(7);
            }
            return collectionInvoke;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
            }
            Collection<? extends PropertyDescriptor> collectionInvoke = this.properties.invoke(name);
            if (collectionInvoke == null) {
                $$$reportNull$$$0(3);
            }
            return collectionInvoke;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getFunctionNames() {
            Set<Name> set = (Set) this.this$0.enumMemberNames.invoke();
            if (set == null) {
                $$$reportNull$$$0(17);
            }
            return set;
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getVariableNames() {
            Set<Name> set = (Set) this.this$0.enumMemberNames.invoke();
            if (set == null) {
                $$$reportNull$$$0(19);
            }
            return set;
        }
    }

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

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EnumEntrySyntheticClassDescriptor(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull KotlinType kotlinType, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        if (storageManager == null) {
            $$$reportNull$$$0(6);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(8);
        }
        if (name == null) {
            $$$reportNull$$$0(9);
        }
        if (notNullLazyValue == null) {
            $$$reportNull$$$0(10);
        }
        if (annotations == null) {
            $$$reportNull$$$0(11);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(12);
        }
        this.annotations = annotations;
        this.typeConstructor = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(kotlinType), storageManager);
        this.scope = new EnumEntryScope(this, storageManager);
        this.enumMemberNames = notNullLazyValue;
    }

    @NotNull
    public static EnumEntrySyntheticClassDescriptor create(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull NotNullLazyValue<Set<Name>> notNullLazyValue, @NotNull Annotations annotations, @NotNull SourceElement sourceElement) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (notNullLazyValue == null) {
            $$$reportNull$$$0(3);
        }
        if (annotations == null) {
            $$$reportNull$$$0(4);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(5);
        }
        return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.getDefaultType(), name, notNullLazyValue, annotations, sourceElement);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        Annotations annotations = this.annotations;
        if (annotations == null) {
            $$$reportNull$$$0(21);
        }
        return annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(22);
        }
        return list;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            $$$reportNull$$$0(18);
        }
        return classKind;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    @NotNull
    public Modality getModality() {
        Modality modality = Modality.FINAL;
        if (modality == null) {
            $$$reportNull$$$0(19);
        }
        return modality;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    @NotNull
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty == null) {
            $$$reportNull$$$0(15);
        }
        return empty;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.typeConstructor;
        if (typeConstructor == null) {
            $$$reportNull$$$0(17);
        }
        return typeConstructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    @NotNull
    public MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(13);
        }
        MemberScope memberScope = this.scope;
        if (memberScope == null) {
            $$$reportNull$$$0(14);
        }
        return memberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    @NotNull
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(20);
        }
        return descriptorVisibility;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }
}
