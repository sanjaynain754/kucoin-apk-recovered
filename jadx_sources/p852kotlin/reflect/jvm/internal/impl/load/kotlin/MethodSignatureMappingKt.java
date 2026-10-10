package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import p852kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n*L\n1#1,200:1\n13#2:201\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/MethodSignatureMappingKt\n*L\n81#1:201\n*E\n"})
public final class MethodSignatureMappingKt {
    @NotNull
    public static final String computeJvmDescriptor(@NotNull FunctionDescriptor functionDescriptor, boolean z11, boolean z12) {
        String strAsString;
        Intrinsics.checkNotNullParameter(functionDescriptor, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            if (functionDescriptor instanceof ConstructorDescriptor) {
                strAsString = "<init>";
            } else {
                strAsString = functionDescriptor.getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            }
            sb2.append(strAsString);
        }
        sb2.append("(");
        ReceiverParameterDescriptor extensionReceiverParameter = functionDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            KotlinType type = extensionReceiverParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            appendErasedType(sb2, type);
        }
        Iterator<ValueParameterDescriptor> it = functionDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            KotlinType type2 = it.next().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            appendErasedType(sb2, type2);
        }
        sb2.append(")");
        if (z11) {
            if (DescriptorBasedTypeSignatureMappingKt.hasVoidReturnType(functionDescriptor)) {
                sb2.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
            } else {
                KotlinType returnType = functionDescriptor.getReturnType();
                Intrinsics.checkNotNull(returnType);
                appendErasedType(sb2, returnType);
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ String computeJvmDescriptor$default(FunctionDescriptor functionDescriptor, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return computeJvmDescriptor(functionDescriptor, z11, z12);
    }

    @Nullable
    public static final String computeJvmSignature(@NotNull CallableDescriptor callableDescriptor) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        if (DescriptorUtils.isLocal(callableDescriptor)) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null || classDescriptor.getName().isSpecial()) {
            return null;
        }
        CallableDescriptor original = callableDescriptor.getOriginal();
        SimpleFunctionDescriptor simpleFunctionDescriptor = original instanceof SimpleFunctionDescriptor ? (SimpleFunctionDescriptor) original : null;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        return MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, classDescriptor, computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null));
    }

    public static final boolean forceSingleValueParameterBoxing(@NotNull CallableDescriptor f11) {
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava;
        Intrinsics.checkNotNullParameter(f11, "f");
        if (!(f11 instanceof FunctionDescriptor)) {
            return false;
        }
        FunctionDescriptor functionDescriptor = (FunctionDescriptor) f11;
        if (Intrinsics.areEqual(functionDescriptor.getName().asString(), "remove") && functionDescriptor.getValueParameters().size() == 1 && !SpecialBuiltinMembers.isFromJavaOrBuiltins((CallableMemberDescriptor) f11)) {
            List<ValueParameterDescriptor> valueParameters = functionDescriptor.getOriginal().getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            KotlinType type = ((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            JvmType jvmTypeMapToJvmType = mapToJvmType(type);
            JvmType.Primitive primitive = jvmTypeMapToJvmType instanceof JvmType.Primitive ? (JvmType.Primitive) jvmTypeMapToJvmType : null;
            if ((primitive != null ? primitive.getJvmPrimitiveType() : null) != JvmPrimitiveType.INT || (overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(functionDescriptor)) == null) {
                return false;
            }
            List<ValueParameterDescriptor> valueParameters2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getOriginal().getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
            KotlinType type2 = ((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters2)).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            JvmType jvmTypeMapToJvmType2 = mapToJvmType(type2);
            DeclarationDescriptor containingDeclaration = overriddenBuiltinFunctionWithErasedValueParametersInJava.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
            if (Intrinsics.areEqual(DescriptorUtilsKt.getFqNameUnsafe(containingDeclaration), StandardNames.FqNames.mutableCollection.toUnsafe()) && (jvmTypeMapToJvmType2 instanceof JvmType.Object) && Intrinsics.areEqual(((JvmType.Object) jvmTypeMapToJvmType2).getInternalName(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final String getInternalName(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(DescriptorUtilsKt.getFqNameSafe(classDescriptor).toUnsafe());
        if (classIdMapKotlinToJava == null) {
            return DescriptorBasedTypeSignatureMappingKt.computeInternalName$default(classDescriptor, null, 2, null);
        }
        String strInternalNameByClassId = JvmClassName.internalNameByClassId(classIdMapKotlinToJava);
        Intrinsics.checkNotNullExpressionValue(strInternalNameByClassId, "internalNameByClassId(...)");
        return strInternalNameByClassId;
    }

    @NotNull
    public static final JvmType mapToJvmType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return (JvmType) DescriptorBasedTypeSignatureMappingKt.mapType$default(kotlinType, JvmTypeFactoryImpl.INSTANCE, TypeMappingMode.DEFAULT, TypeMappingConfigurationImpl.INSTANCE, null, null, 32, null);
    }

    private static final void appendErasedType(StringBuilder sb2, KotlinType kotlinType) {
        sb2.append(mapToJvmType(kotlinType));
    }
}
