package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean isPrimitiveCompareTo(FunctionDescriptor functionDescriptor) {
            ClassDescriptor classDescriptor;
            if (functionDescriptor.getValueParameters().size() != 1) {
                return false;
            }
            DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
            ClassDescriptor classDescriptor2 = null;
            if (containingDeclaration instanceof ClassDescriptor) {
                classDescriptor = (ClassDescriptor) containingDeclaration;
            } else {
                classDescriptor = null;
            }
            if (classDescriptor == null) {
                return false;
            }
            List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType().getConstructor().mo105126getDeclarationDescriptor();
            if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
                classDescriptor2 = (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor;
            }
            if (classDescriptor2 == null || !KotlinBuiltIns.isPrimitiveClass(classDescriptor) || !Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(classDescriptor), DescriptorUtilsKt.getFqNameSafe(classDescriptor2))) {
                return false;
            }
            return true;
        }

        private final JvmType mapValueParameterType(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (!MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor) && !isPrimitiveCompareTo(functionDescriptor)) {
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return MethodSignatureMappingKt.mapToJvmType(type);
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            return MethodSignatureMappingKt.mapToJvmType(TypeUtilsKt.makeNullable(type2));
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.getValueParameters().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
                functionDescriptor.getValueParameters().size();
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                List<ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                for (Pair pair : CollectionsKt.zip(valueParameters, valueParameters2)) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component1();
                    ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.component2();
                    Intrinsics.checkNotNull(valueParameterDescriptor);
                    boolean z11 = mapValueParameterType((FunctionDescriptor) subDescriptor, valueParameterDescriptor) instanceof JvmType.Primitive;
                    Intrinsics.checkNotNull(valueParameterDescriptor2);
                    if (z11 != (mapValueParameterType(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean isIncompatibleInAccordanceWithBuiltInOverridabilityRules(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
                Name name2 = functionDescriptor.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!companion.getSameAsRenamedInJvmBuiltin(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) callableDescriptor);
            boolean z11 = callableDescriptor instanceof FunctionDescriptor;
            FunctionDescriptor functionDescriptor2 = z11 ? (FunctionDescriptor) callableDescriptor : null;
            if (!(functionDescriptor2 != null && functionDescriptor.isHiddenToOvercomeSignatureClash() == functionDescriptor2.isHiddenToOvercomeSignatureClash()) && (overriddenSpecialBuiltin == null || !functionDescriptor.isHiddenToOvercomeSignatureClash())) {
                return true;
            }
            if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                if ((overriddenSpecialBuiltin instanceof FunctionDescriptor) && z11 && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                    String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 2, null);
                    FunctionDescriptor original = ((FunctionDescriptor) callableDescriptor).getOriginal();
                    Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
                    if (Intrinsics.areEqual(strComputeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Result isOverridable(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor, @Nullable ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (isIncompatibleInAccordanceWithBuiltInOverridabilityRules(superDescriptor, subDescriptor, classDescriptor)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        if (Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(superDescriptor, subDescriptor)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
