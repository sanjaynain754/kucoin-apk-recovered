package p852kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: DescriptorEquivalenceForOverrides.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$1(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areTypeParametersEquivalent$lambda$0(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a11, @NotNull TypeParameterDescriptor b11, boolean z11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        return areTypeParametersEquivalent$default(this, a11, b11, z11, null, 8, null);
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z11, boolean z12, boolean z13, KotlinTypeRefiner kotlinTypeRefiner, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            z13 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z11, z14, z13, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$3(boolean z11, final CallableDescriptor callableDescriptor, final CallableDescriptor callableDescriptor2, TypeConstructor c11, TypeConstructor c12) {
        Intrinsics.checkNotNullParameter(c11, "c1");
        Intrinsics.checkNotNullParameter(c12, "c2");
        if (Intrinsics.areEqual(c11, c12)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = c11.mo105126getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor2 = c12.mo105126getDeclarationDescriptor();
        if ((classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor) && (classifierDescriptorMo105126getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor2, z11, new Function2(callableDescriptor, callableDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$3
                private final CallableDescriptor arg$0;
                private final CallableDescriptor arg$1;

                @Override // p852kotlin.jvm.functions.Function2
                public Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$3$lambda$2(this.arg$0, this.arg$1, (DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
                }

                {
                    this.arg$0 = callableDescriptor;
                    this.arg$1 = callableDescriptor2;
                }
            });
        }
        return false;
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function2 = new Function2() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0
                @Override // p852kotlin.jvm.functions.Function2
                public Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(DescriptorEquivalenceForOverrides.areTypeParametersEquivalent$lambda$0((DeclarationDescriptor) obj2, (DeclarationDescriptor) obj3));
                }
            };
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z11, function2);
    }

    private final SourceElement singleSource(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull final CallableDescriptor a11, @NotNull final CallableDescriptor b11, final boolean z11, boolean z12, boolean z13, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (Intrinsics.areEqual(a11, b11)) {
            return true;
        }
        if (!Intrinsics.areEqual(a11.getName(), b11.getName())) {
            return false;
        }
        if (z12 && (a11 instanceof MemberDescriptor) && (b11 instanceof MemberDescriptor) && ((MemberDescriptor) a11).isExpect() != ((MemberDescriptor) b11).isExpect()) {
            return false;
        }
        if ((Intrinsics.areEqual(a11.getContainingDeclaration(), b11.getContainingDeclaration()) && (!z11 || !Intrinsics.areEqual(singleSource(a11), singleSource(b11)))) || DescriptorUtils.isLocal(a11) || DescriptorUtils.isLocal(b11) || !ownersEquivalent(a11, b11, new Function2() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$1
            @Override // p852kotlin.jvm.functions.Function2
            public Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$1((DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
            }
        }, z11)) {
            return false;
        }
        OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, new KotlinTypeChecker.TypeConstructorEquality(z11, a11, b11) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$2
            private final boolean arg$0;
            private final CallableDescriptor arg$1;
            private final CallableDescriptor arg$2;

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                return DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$3(this.arg$0, this.arg$1, this.arg$2, typeConstructor, typeConstructor2);
            }

            {
                this.arg$0 = z11;
                this.arg$1 = a11;
                this.arg$2 = b11;
            }
        });
        Intrinsics.checkNotNullExpressionValue(overridingUtilCreate, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a11, b11, null, !z13).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && overridingUtilCreate.isOverridableBy(b11, a11, null, z13 ^ true).getResult() == result2;
    }

    public final boolean areEquivalent(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2, boolean z11, boolean z12) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return areClassesEquivalent((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z11, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z11, z12, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? Intrinsics.areEqual(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
    }

    @JvmOverloads
    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a11, @NotNull TypeParameterDescriptor b11, boolean z11, @NotNull Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(equivalentCallables, "equivalentCallables");
        if (Intrinsics.areEqual(a11, b11)) {
            return true;
        }
        return !Intrinsics.areEqual(a11.getContainingDeclaration(), b11.getContainingDeclaration()) && ownersEquivalent(a11, b11, equivalentCallables, z11) && a11.getIndex() == b11.getIndex();
    }

    private DescriptorEquivalenceForOverrides() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$3$lambda$2(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (Intrinsics.areEqual(declarationDescriptor, callableDescriptor) && Intrinsics.areEqual(declarationDescriptor2, callableDescriptor2)) {
            return true;
        }
        return false;
    }

    private final boolean areClassesEquivalent(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return Intrinsics.areEqual(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    private final boolean ownersEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, Function2<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> function2, boolean z11) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        if (!(containingDeclaration instanceof CallableMemberDescriptor) && !(containingDeclaration2 instanceof CallableMemberDescriptor)) {
            return areEquivalent$default(this, containingDeclaration, containingDeclaration2, z11, false, 8, null);
        }
        return function2.invoke(containingDeclaration, containingDeclaration2).booleanValue();
    }
}
