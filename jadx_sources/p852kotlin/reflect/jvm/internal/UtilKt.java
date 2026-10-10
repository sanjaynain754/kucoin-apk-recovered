package p852kotlin.reflect.jvm.internal;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReference;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference;
import p852kotlin.jvm.internal.RepeatableContainer;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KCallable;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KVisibility;
import p852kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p852kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000Ú\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u0006H\u0000\u001a$\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000\u001a.\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0014\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0005*\u0006\u0012\u0002\b\u00030\u0005H\u0000\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u0014H\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u0018H\u0000\u001a\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\b\u0012\u0004\u0012\u00020\u00170\u0016\u001a\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u001bH\u0002\u001a\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\r\u001a\u00020\bH\u0002\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d*\u00020 2\u0006\u0010\r\u001a\u00020\bH\u0002\u001a%\u0010!\u001a\u0002H\"\"\u0004\b\u0000\u0010\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0$H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010%\u001a\u0010\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010\u001dH\u0000\u001a\u0014\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010)*\u0004\u0018\u00010\u001dH\u0000\u001a\u0014\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\u001dH\u0000\u001al\u00101\u001a\u0002H2\"\b\b\u0000\u00103*\u000204\"\b\b\u0001\u00102*\u00020.2\n\u00105\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u00106\u001a\u0002H32\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u001d\u0010=\u001a\u0019\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u0002H3\u0012\u0004\u0012\u0002H20>¢\u0006\u0002\b@H\u0000¢\u0006\u0002\u0010A\u001a\u0012\u0010H\u001a\u0004\u0018\u00010\u001d2\u0006\u0010I\u001a\u00020JH\u0000\u001a;\u0010K\u001a\u0004\u0018\u00010L*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010M\u001a\u00020\u000f2\u001a\u0010N\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050O\"\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0002\u0010P\u001a\u001a\u0010Q\u001a\u0004\u0018\u00010R*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010M\u001a\u00020\u000fH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010,\u001a\u0004\u0018\u00010-*\u00020.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0018\u0010B\u001a\u00020C*\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010E\"\u0018\u0010F\u001a\u00020C*\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010E\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, m90084d2 = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "toJavaClass", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "loadClass", "Ljava/lang/ClassLoader;", "kotlinClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "arrayDimensions", "", "classLoader", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "className", "createArrayType", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "computeAnnotations", "", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "unwrapRepeatableAnnotations", "toAnnotationInstance", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toRuntimeValue", "", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "arrayToRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "reflectionCall", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "asKCallableImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "moduleAnchor", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "metadataVersion", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "isInlineClassType", "", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)Z", "needsMultiFieldValueClassFlattening", "getNeedsMultiFieldValueClassFlattening", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "getDeclaredMethodOrNull", "Ljava/lang/reflect/Method;", "name", "parameterTypes", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getDeclaredFieldOrNull", "Ljava/lang/reflect/Field;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n1617#2,9:334\n1869#2:343\n1870#2:345\n1626#2:346\n1761#2,3:347\n1374#2:350\n1460#2,5:351\n1617#2,9:356\n1869#2:365\n1870#2:368\n1626#2:369\n1563#2:370\n1634#2,3:371\n1#3:344\n1#3:366\n1#3:367\n1#3:374\n*S KotlinDebug\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n*L\n137#1:334,9\n137#1:343\n137#1:345\n137#1:346\n146#1:347,3\n147#1:350\n147#1:351,5\n167#1:356,9\n167#1:365\n167#1:368\n167#1:369\n197#1:370\n197#1:371,3\n137#1:344\n167#1:367\n*E\n"})
public final class UtilKt {

    @NotNull
    private static final FqName JVM_STATIC = new FqName("kotlin.jvm.JvmStatic");

    @Nullable
    public static final Class<?> loadClass(@NotNull ClassLoader classLoader, @NotNull ClassId kotlinClassId, int i11) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(kotlinClassId, "kotlinClassId");
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(kotlinClassId.asSingleFqName().toUnsafe());
        if (classIdMapKotlinToJava == null) {
            classIdMapKotlinToJava = kotlinClassId;
        }
        if (!Intrinsics.areEqual(classIdMapKotlinToJava, kotlinClassId)) {
            classLoader = ReflectClassUtilKt.getSafeClassLoader(Unit.class);
        }
        return loadClass(classLoader, classIdMapKotlinToJava.getPackageFqName().asString(), classIdMapKotlinToJava.getRelativeClassName().asString(), i11);
    }

    /* JADX INFO: compiled from: util.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object arrayToRuntimeValue(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType type;
        Class clsLoadClass$default;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue == null || (type = typedArrayValue.getType()) == null) {
            return null;
        }
        List<? extends ConstantValue<?>> value = arrayValue.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(toRuntimeValue((ConstantValue) it.next(), classLoader));
        }
        PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
        int i11 = 0;
        switch (primitiveArrayElementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[primitiveArrayElementType.ordinal()]) {
            case -1:
                if (!KotlinBuiltIns.isArray(type)) {
                    throw new IllegalStateException(("Not an array type: " + type).toString());
                }
                KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = type2.getConstructor().mo105126getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
                if (classDescriptor == null) {
                    throw new IllegalStateException(("Not a class type: " + type2).toString());
                }
                if (KotlinBuiltIns.isString(type2)) {
                    int size = arrayValue.getValue().size();
                    String[] strArr = new String[size];
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i11] = obj;
                        i11++;
                    }
                    return strArr;
                }
                if (KotlinBuiltIns.isKClass(classDescriptor)) {
                    int size2 = arrayValue.getValue().size();
                    Class[] clsArr = new Class[size2];
                    while (i11 < size2) {
                        Object obj2 = arrayList.get(i11);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i11] = obj2;
                        i11++;
                    }
                    return clsArr;
                }
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (clsLoadClass$default = loadClass$default(classLoader, classId, 0, 2, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsLoadClass$default, arrayValue.getValue().size());
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i11 < size3) {
                    objArr[i11] = arrayList.get(i11);
                    i11++;
                }
                return objArr;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int size4 = arrayValue.getValue().size();
                boolean[] zArr = new boolean[size4];
                while (i11 < size4) {
                    Object obj3 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i11] = ((Boolean) obj3).booleanValue();
                    i11++;
                }
                return zArr;
            case 2:
                int size5 = arrayValue.getValue().size();
                char[] cArr = new char[size5];
                while (i11 < size5) {
                    Object obj4 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i11] = ((Character) obj4).charValue();
                    i11++;
                }
                return cArr;
            case 3:
                int size6 = arrayValue.getValue().size();
                byte[] bArr = new byte[size6];
                while (i11 < size6) {
                    Object obj5 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i11] = ((Byte) obj5).byteValue();
                    i11++;
                }
                return bArr;
            case 4:
                int size7 = arrayValue.getValue().size();
                short[] sArr = new short[size7];
                while (i11 < size7) {
                    Object obj6 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i11] = ((Short) obj6).shortValue();
                    i11++;
                }
                return sArr;
            case 5:
                int size8 = arrayValue.getValue().size();
                int[] iArr = new int[size8];
                while (i11 < size8) {
                    Object obj7 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i11] = ((Integer) obj7).intValue();
                    i11++;
                }
                return iArr;
            case 6:
                int size9 = arrayValue.getValue().size();
                float[] fArr = new float[size9];
                while (i11 < size9) {
                    Object obj8 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i11] = ((Float) obj8).floatValue();
                    i11++;
                }
                return fArr;
            case 7:
                int size10 = arrayValue.getValue().size();
                long[] jArr = new long[size10];
                while (i11 < size10) {
                    Object obj9 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i11] = ((Long) obj9).longValue();
                    i11++;
                }
                return jArr;
            case 8:
                int size11 = arrayValue.getValue().size();
                double[] dArr = new double[size11];
                while (i11 < size11) {
                    Object obj10 = arrayList.get(i11);
                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i11] = ((Double) obj10).doubleValue();
                    i11++;
                }
                return dArr;
        }
    }

    @Nullable
    public static final KCallableImpl<?> asKCallableImpl(@Nullable Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplAsKFunctionImpl = asKFunctionImpl(obj);
        return kFunctionImplAsKFunctionImpl != null ? kFunctionImplAsKFunctionImpl : asKPropertyImpl(obj);
    }

    @Nullable
    public static final KFunctionImpl asKFunctionImpl(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    @Nullable
    public static final KPropertyImpl<?> asKPropertyImpl(@Nullable Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    @NotNull
    public static final List<Annotation> computeAnnotations(@NotNull Annotated annotated) {
        Annotation annotationInstance;
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationInstance = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                annotationInstance = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                annotationInstance = toAnnotationInstance(annotationDescriptor);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return unwrapRepeatableAnnotations(arrayList);
    }

    @NotNull
    public static final Class<?> createArrayType(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    @NotNull
    public static final <M extends MessageLite, D extends CallableDescriptor> D deserializeToDescriptor(@NotNull Class<?> moduleAnchor, @NotNull M proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion metadataVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        RuntimeModuleData orCreateModule = ModuleByClassLoaderKt.getOrCreateModule(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf.Property) proto).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = orCreateModule.getDeserialization();
        ModuleDescriptor module = orCreateModule.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        Intrinsics.checkNotNull(list);
        return createDescriptor.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, metadataVersion, null, null, list)), proto);
    }

    @Nullable
    public static final Field getDeclaredFieldOrNull(@NotNull Class<?> cls, @NotNull String name) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return cls.getDeclaredField(name);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Nullable
    public static final Method getDeclaredMethodOrNull(@NotNull Class<?> cls, @NotNull String name, @NotNull Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return cls.getDeclaredMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    public static final ReceiverParameterDescriptor getInstanceReceiverParameter(@NotNull CallableDescriptor callableDescriptor) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
        if (callableDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    @NotNull
    public static final FqName getJVM_STATIC() {
        return JVM_STATIC;
    }

    public static final boolean getNeedsMultiFieldValueClassFlattening(@NotNull KType kType) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.needsMfvcFlattening(type)) ? false : true;
    }

    public static final boolean isInlineClassType(@NotNull KType kType) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(type)) ? false : true;
    }

    public static /* synthetic */ Class loadClass$default(ClassLoader classLoader, ClassId classId, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return loadClass(classLoader, classId, i11);
    }

    @Nullable
    public static final Class<?> toJavaClass(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        SourceElement source = classDescriptor.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            Intrinsics.checkNotNull(binaryClass, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            Intrinsics.checkNotNull(javaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return loadClass$default(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0, 2, null);
    }

    @Nullable
    public static final KVisibility toKVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        Intrinsics.checkNotNullParameter(descriptorVisibility, "<this>");
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE) || Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    private static final Object toRuntimeValue(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return toAnnotationInstance(((AnnotationValue) constantValue).getValue());
        }
        if (constantValue instanceof ArrayValue) {
            return arrayToRuntimeValue((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value = ((EnumValue) constantValue).getValue();
            ClassId classIdComponent1 = value.component1();
            Name nameComponent2 = value.component2();
            Class clsLoadClass$default = loadClass$default(classLoader, classIdComponent1, 0, 2, null);
            if (clsLoadClass$default != null) {
                return Util.getEnumConstantByName(clsLoadClass$default, nameComponent2.asString());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.getValue();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
            return loadClass(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
        }
        if (!(value2 instanceof KClassValue.Value.LocalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((KClassValue.Value.LocalClass) value2).getType().getConstructor().mo105126getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor : null;
        if (classDescriptor != null) {
            return toJavaClass(classDescriptor);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<Annotation> unwrapRepeatableAnnotations(@NotNull List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listListOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list != 0 && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : list) {
                    Class javaClass = JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation));
                    if (!Intrinsics.areEqual(javaClass.getSimpleName(), "Container") || javaClass.getAnnotation(RepeatableContainer.class) == null) {
                        listListOf = CollectionsKt.listOf(annotation);
                    } else {
                        Object objInvoke = javaClass.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listListOf = ArraysKt.asList((Annotation[]) objInvoke);
                    }
                    CollectionsKt.addAll(arrayList, listListOf);
                }
                return arrayList;
            }
        }
        return list;
    }

    @Nullable
    public static final Object defaultPrimitiveValue(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (Intrinsics.areEqual(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (Intrinsics.areEqual(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (Intrinsics.areEqual(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (Intrinsics.areEqual(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (Intrinsics.areEqual(cls, Integer.TYPE)) {
                    return 0;
                }
                if (Intrinsics.areEqual(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (Intrinsics.areEqual(cls, Long.TYPE)) {
                    return 0L;
                }
                if (Intrinsics.areEqual(cls, Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (Intrinsics.areEqual(cls, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
            return null;
        }
        return null;
    }

    private static final Annotation toAnnotationInstance(AnnotationDescriptor annotationDescriptor) {
        Class<?> javaClass;
        Pair pairM90091to;
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass != null) {
            javaClass = toJavaClass(annotationClass);
        } else {
            javaClass = null;
        }
        if (javaClass == null) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = javaClass.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object runtimeValue = toRuntimeValue(constantValue, classLoader);
            if (runtimeValue != null) {
                pairM90091to = TuplesKt.m90091to(name.asString(), runtimeValue);
            } else {
                pairM90091to = null;
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.createAnnotationInstance$default(javaClass, MapsKt.toMap(arrayList), null, 4, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> loadClass(ClassLoader classLoader, String str, String str2, int i11) {
        if (Intrinsics.areEqual(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i11 > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(StringsKt.replace$default(str2, '.', Typography.dollar, false, 4, (Object) null));
        if (i11 > 0) {
            sb2.append(";");
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb2.toString());
    }
}
