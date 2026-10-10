package p852kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes61.dex */
@JvmName(name = "SpecialBuiltinMembers")
@SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/SpecialBuiltinMembers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class SpecialBuiltinMembers {
    public static final boolean doesOverrideBuiltinWithDifferentJvmName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) != null;
    }

    @Nullable
    public static final String getJvmMethodNameIfSpecial(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor propertyIfAccessor;
        Name jvmName;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor overriddenBuiltinThatAffectsJvmName = getOverriddenBuiltinThatAffectsJvmName(callableMemberDescriptor);
        if (overriddenBuiltinThatAffectsJvmName != null && (propertyIfAccessor = DescriptorUtilsKt.getPropertyIfAccessor(overriddenBuiltinThatAffectsJvmName)) != null) {
            if (propertyIfAccessor instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyIfAccessor);
            }
            if ((propertyIfAccessor instanceof SimpleFunctionDescriptor) && (jvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName((SimpleFunctionDescriptor) propertyIfAccessor)) != null) {
                return jvmName.asString();
            }
        }
        return null;
    }

    @Nullable
    public static final <T extends CallableMemberDescriptor> T getOverriddenBuiltinWithDifferentJvmName(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        if (!SpecialGenericSignatures.Companion.getORIGINAL_SHORT_NAMES().contains(t11.getName()) && !BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(DescriptorUtilsKt.getPropertyIfAccessor(t11).getName())) {
            return null;
        }
        if ((t11 instanceof PropertyDescriptor) || (t11 instanceof PropertyAccessorDescriptor)) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t11, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$$Lambda$0
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return Boolean.valueOf(SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName$lambda$0((CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        if (t11 instanceof SimpleFunctionDescriptor) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t11, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$$Lambda$1
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return Boolean.valueOf(SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName$lambda$1((CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenBuiltinWithDifferentJvmName$lambda$0(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(DescriptorUtilsKt.getPropertyIfAccessor(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenBuiltinWithDifferentJvmName$lambda$1(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((SimpleFunctionDescriptor) it);
    }

    @Nullable
    public static final <T extends CallableMemberDescriptor> T getOverriddenSpecialBuiltin(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "<this>");
        T t12 = (T) getOverriddenBuiltinWithDifferentJvmName(t11);
        if (t12 != null) {
            return t12;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = t11.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t11, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$$Lambda$2
                @Override // p852kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return Boolean.valueOf(SpecialBuiltinMembers.getOverriddenSpecialBuiltin$lambda$3((CallableMemberDescriptor) obj));
                }
            }, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOverriddenSpecialBuiltin$lambda$3(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KotlinBuiltIns.isBuiltIn(it) && BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(it) != null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(@NotNull ClassDescriptor classDescriptor, @NotNull CallableDescriptor specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        DeclarationDescriptor containingDeclaration = specialCallableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        SimpleType defaultType = ((ClassDescriptor) containingDeclaration).getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        for (ClassDescriptor superClassDescriptor = DescriptorUtils.getSuperClassDescriptor(classDescriptor); superClassDescriptor != null; superClassDescriptor = DescriptorUtils.getSuperClassDescriptor(superClassDescriptor)) {
            if (!(superClassDescriptor instanceof JavaClassDescriptor) && TypeCheckingProcedure.findCorrespondingSupertype(superClassDescriptor.getDefaultType(), defaultType) != null) {
                return !KotlinBuiltIns.isBuiltIn(superClassDescriptor);
            }
        }
        return false;
    }

    public static final boolean isFromJava(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor).getContainingDeclaration() instanceof JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return isFromJava(callableMemberDescriptor) || KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
    }

    private static final CallableMemberDescriptor getOverriddenBuiltinThatAffectsJvmName(CallableMemberDescriptor callableMemberDescriptor) {
        if (KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor);
        }
        return null;
    }
}
