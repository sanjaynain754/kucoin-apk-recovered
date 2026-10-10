package p852kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import p852kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import p852kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p852kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u0006\u0012\u0002\b\u00030\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "<init>", "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "isKnownBuiltInFunction", "", "descriptor", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "mapName", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapJvmClassToKotlinClassId", "klass", "Ljava/lang/Class;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "kotlin-reflection"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/RuntimeTypeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class RuntimeTypeMapper {

    @NotNull
    public static final RuntimeTypeMapper INSTANCE = new RuntimeTypeMapper();

    @NotNull
    private static final ClassId JAVA_LANG_VOID = ClassId.Companion.topLevel(new FqName("java.lang.Void"));

    private final JvmFunctionSignature.KotlinFunction mapJvmFunctionSignature(FunctionDescriptor descriptor) {
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(mapName(descriptor), MethodSignatureMappingKt.computeJvmDescriptor$default(descriptor, false, false, 1, null)));
    }

    private RuntimeTypeMapper() {
    }

    private final PrimitiveType getPrimitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean isKnownBuiltInFunction(FunctionDescriptor descriptor) {
        if (DescriptorFactory.isEnumValueOfMethod(descriptor) || DescriptorFactory.isEnumValuesMethod(descriptor)) {
            return true;
        }
        if (Intrinsics.areEqual(descriptor.getName(), CloneableClassScope.Companion.getCLONE_NAME()) && descriptor.getValueParameters().isEmpty()) {
            return true;
        }
        return false;
    }

    private final String mapName(CallableMemberDescriptor descriptor) {
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(descriptor);
        if (jvmMethodNameIfSpecial == null) {
            if (descriptor instanceof PropertyGetterDescriptor) {
                String strAsString = DescriptorUtilsKt.getPropertyIfAccessor(descriptor).getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                return JvmAbi.getterName(strAsString);
            }
            if (descriptor instanceof PropertySetterDescriptor) {
                String strAsString2 = DescriptorUtilsKt.getPropertyIfAccessor(descriptor).getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
                return JvmAbi.setterName(strAsString2);
            }
            String strAsString3 = descriptor.getName().asString();
            Intrinsics.checkNotNullExpressionValue(strAsString3, "asString(...)");
            return strAsString3;
        }
        return jvmMethodNameIfSpecial;
    }

    @NotNull
    public final ClassId mapJvmClassToKotlinClassId(@NotNull Class<?> klass) {
        ClassId classIdMapJavaToKotlin;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            PrimitiveType primitiveType = getPrimitiveType(componentType);
            if (primitiveType != null) {
                return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName());
            }
            return ClassId.Companion.topLevel(StandardNames.FqNames.array.toSafe());
        }
        if (Intrinsics.areEqual(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        PrimitiveType primitiveType2 = getPrimitiveType(klass);
        if (primitiveType2 != null) {
            return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType2.getTypeName());
        }
        ClassId classId = ReflectClassUtilKt.getClassId(klass);
        if (!classId.isLocal() && (classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName())) != null) {
            return classIdMapJavaToKotlin;
        }
        return classId;
    }

    @NotNull
    public final JvmPropertySignature mapPropertySignature(@NotNull PropertyDescriptor possiblyOverriddenProperty) {
        JavaSourceElement javaSourceElement;
        JavaElement javaElement;
        SourceElement source;
        JavaSourceElement javaSourceElement2;
        JavaElement javaElement2;
        ReflectJavaMethod reflectJavaMethod;
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor original = ((PropertyDescriptor) DescriptorUtils.unwrapFakeOverride(possiblyOverriddenProperty)).getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        Method member = null;
        JvmFunctionSignature.KotlinFunction kotlinFunctionMapJvmFunctionSignature = null;
        if (original instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) original;
            ProtoBuf.Property proto = deserializedPropertyDescriptor.getProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(original, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
        } else if (original instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) original;
            SourceElement source2 = javaPropertyDescriptor.getSource();
            if (source2 instanceof JavaSourceElement) {
                javaSourceElement = (JavaSourceElement) source2;
            } else {
                javaSourceElement = null;
            }
            if (javaSourceElement != null) {
                javaElement = javaSourceElement.getJavaElement();
            } else {
                javaElement = null;
            }
            if (javaElement instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) javaElement).getMember());
            }
            if (javaElement instanceof ReflectJavaMethod) {
                Method member2 = ((ReflectJavaMethod) javaElement).getMember();
                PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
                if (setter != null) {
                    source = setter.getSource();
                } else {
                    source = null;
                }
                if (source instanceof JavaSourceElement) {
                    javaSourceElement2 = (JavaSourceElement) source;
                } else {
                    javaSourceElement2 = null;
                }
                if (javaSourceElement2 != null) {
                    javaElement2 = javaSourceElement2.getJavaElement();
                } else {
                    javaElement2 = null;
                }
                if (javaElement2 instanceof ReflectJavaMethod) {
                    reflectJavaMethod = (ReflectJavaMethod) javaElement2;
                } else {
                    reflectJavaMethod = null;
                }
                if (reflectJavaMethod != null) {
                    member = reflectJavaMethod.getMember();
                }
                return new JvmPropertySignature.JavaMethodProperty(member2, member);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + original + " (source = " + javaElement + ')');
        }
        PropertyGetterDescriptor getter = original.getGetter();
        Intrinsics.checkNotNull(getter);
        JvmFunctionSignature.KotlinFunction kotlinFunctionMapJvmFunctionSignature2 = mapJvmFunctionSignature(getter);
        PropertySetterDescriptor setter2 = original.getSetter();
        if (setter2 != null) {
            kotlinFunctionMapJvmFunctionSignature = mapJvmFunctionSignature(setter2);
        }
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionMapJvmFunctionSignature2, kotlinFunctionMapJvmFunctionSignature);
    }

    @NotNull
    public final JvmFunctionSignature mapSignature(@NotNull FunctionDescriptor possiblySubstitutedFunction) {
        JavaSourceElement javaSourceElement;
        JavaSourceElement javaSourceElement2;
        JavaElement javaElement;
        Method member;
        JvmMemberSignature.Method jvmConstructorSignature;
        JvmMemberSignature.Method jvmMethodSignature;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor original = ((FunctionDescriptor) DescriptorUtils.unwrapFakeOverride(possiblySubstitutedFunction)).getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        JavaElement javaElement2 = null;
        ReflectJavaMethod reflectJavaMethod = null;
        if (original instanceof DeserializedCallableMemberDescriptor) {
            DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) original;
            MessageLite proto = deserializedMemberDescriptor.getProto();
            if ((proto instanceof ProtoBuf.Function) && (jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) != null) {
                return new JvmFunctionSignature.KotlinFunction(jvmMethodSignature);
            }
            if ((proto instanceof ProtoBuf.Constructor) && (jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) != null) {
                DeclarationDescriptor containingDeclaration = possiblySubstitutedFunction.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                if (InlineClassesUtilsKt.isInlineClass(containingDeclaration)) {
                    return new JvmFunctionSignature.KotlinFunction(jvmConstructorSignature);
                }
                DeclarationDescriptor containingDeclaration2 = possiblySubstitutedFunction.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
                if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration2)) {
                    ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
                    if (constructorDescriptor.isPrimary()) {
                        if (!Intrinsics.areEqual(jvmConstructorSignature.getName(), "constructor-impl") || !StringsKt.endsWith$default(jvmConstructorSignature.getDesc(), ")V", false, 2, (Object) null)) {
                            throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
                        }
                    } else if (Intrinsics.areEqual(jvmConstructorSignature.getName(), "constructor-impl")) {
                        ClassDescriptor constructedClass = constructorDescriptor.getConstructedClass();
                        Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
                        String jvmDescriptor = ValueClassAwareCallerKt.toJvmDescriptor(constructedClass);
                        if (StringsKt.endsWith$default(jvmConstructorSignature.getDesc(), ")V", false, 2, (Object) null)) {
                            jvmConstructorSignature = JvmMemberSignature.Method.copy$default(jvmConstructorSignature, null, StringsKt.removeSuffix(jvmConstructorSignature.getDesc(), (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + jvmDescriptor, 1, null);
                        } else if (!StringsKt.endsWith$default(jvmConstructorSignature.getDesc(), jvmDescriptor, false, 2, (Object) null)) {
                            throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
                        }
                    } else {
                        throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
                    }
                    return new JvmFunctionSignature.KotlinFunction(jvmConstructorSignature);
                }
                return new JvmFunctionSignature.KotlinConstructor(jvmConstructorSignature);
            }
            return mapJvmFunctionSignature(original);
        }
        if (original instanceof JavaMethodDescriptor) {
            SourceElement source = ((JavaMethodDescriptor) original).getSource();
            if (source instanceof JavaSourceElement) {
                javaSourceElement2 = (JavaSourceElement) source;
            } else {
                javaSourceElement2 = null;
            }
            if (javaSourceElement2 != null) {
                javaElement = javaSourceElement2.getJavaElement();
            } else {
                javaElement = null;
            }
            if (javaElement instanceof ReflectJavaMethod) {
                reflectJavaMethod = (ReflectJavaMethod) javaElement;
            }
            if (reflectJavaMethod != null && (member = reflectJavaMethod.getMember()) != null) {
                return new JvmFunctionSignature.JavaMethod(member);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + original);
        }
        if (original instanceof JavaClassConstructorDescriptor) {
            SourceElement source2 = ((JavaClassConstructorDescriptor) original).getSource();
            if (source2 instanceof JavaSourceElement) {
                javaSourceElement = (JavaSourceElement) source2;
            } else {
                javaSourceElement = null;
            }
            if (javaSourceElement != null) {
                javaElement2 = javaSourceElement.getJavaElement();
            }
            if (javaElement2 instanceof ReflectJavaConstructor) {
                return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) javaElement2).getMember());
            }
            if (javaElement2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElement2;
                if (reflectJavaClass.isAnnotationType()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + original + " (" + javaElement2 + ')');
        }
        if (isKnownBuiltInFunction(original)) {
            return mapJvmFunctionSignature(original);
        }
        throw new KotlinReflectionInternalError("Unknown origin of " + original + " (" + original.getClass() + ')');
    }
}
