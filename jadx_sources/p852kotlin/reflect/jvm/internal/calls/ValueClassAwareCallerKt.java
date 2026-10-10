package p852kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmClassMappingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p852kotlin.reflect.jvm.internal.UtilKt;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: ValueClassAwareCaller.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a(\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017¢\u0006\u0002\b\u0019H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0011*\u00020\u0015H\u0002\u001a6\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\r\"\n\b\u0000\u0010\u001c*\u0004\u0018\u00010\u0015*\b\u0012\u0004\u0012\u0002H\u001c0\r2\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\f\u0010\u001d\u001a\u00020\u0011*\u00020\tH\u0002\u001a\u0018\u0010\u001e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0018\u0010 \u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0012\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f*\u00020\u0013H\u0002\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f*\u0004\u0018\u00010\"H\u0000\u001a\u0018\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010'2\u0006\u0010\b\u001a\u00020\tH\u0000\"\u001a\u0010#\u001a\u0004\u0018\u00010\u0013*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, m90084d2 = {"toJvmDescriptor", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "getValueClassUnboxMethods", "", "Ljava/lang/reflect/Method;", "type", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getMfvcUnboxMethods", "checkParametersSize", "", "Lkotlin/reflect/jvm/internal/calls/Caller;", "expectedArgsSize", "", "isDefault", "", "makeKotlinParameterTypes", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "member", "Ljava/lang/reflect/Member;", "isSpecificClass", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/ExtensionFunctionType;", "acceptsBoxedReceiverParameter", "createValueClassAwareCallerIfNeeded", "M", "hasValueClassReceiver", "getInlineClassUnboxMethod", "Ljava/lang/Class;", "getBoxMethod", "toInlineClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "expectedReceiverType", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "coerceToExpectedReceiverType", "", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n1#2:393\n1563#3:394\n1634#3,3:395\n1563#3:398\n1634#3,3:399\n1634#3,3:402\n1761#3,3:405\n1761#3,3:408\n1374#3:411\n1460#3,2:412\n1563#3:414\n1634#3,3:415\n1462#3,3:418\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n*L\n262#1:394\n262#1:395,3\n264#1:398\n264#1:399,3\n308#1:402,3\n328#1:405,3\n329#1:408,3\n257#1:411\n257#1:412,2\n258#1:414\n258#1:415,3\n257#1:418,3\n*E\n"})
public final class ValueClassAwareCallerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> toInlineClass(KotlinType kotlinType) {
        KotlinType kotlinTypeUnsubstitutedUnderlyingType;
        Class<?> inlineClass = toInlineClass(kotlinType.getConstructor().mo105126getDeclarationDescriptor());
        if (inlineClass == null) {
            return null;
        }
        if (TypeUtils.isNullableType(kotlinType) && ((kotlinTypeUnsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType)) == null || TypeUtils.isNullableType(kotlinTypeUnsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(kotlinTypeUnsubstitutedUnderlyingType))) {
            return null;
        }
        return inlineClass;
    }

    @Nullable
    public static final Object coerceToExpectedReceiverType(@Nullable Object obj, @NotNull CallableMemberDescriptor descriptor) {
        KotlinType expectedReceiverType;
        Class<?> inlineClass;
        Method inlineClassUnboxMethod;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) descriptor)) || (expectedReceiverType = getExpectedReceiverType(descriptor)) == null || (inlineClass = toInlineClass(expectedReceiverType)) == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(inlineClass, descriptor)) == null) ? obj : inlineClassUnboxMethod.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x0058->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <M extends Member> Caller<M> createValueClassAwareCallerIfNeeded(@NotNull Caller<? extends M> caller, @NotNull CallableMemberDescriptor descriptor, boolean z11) {
        List<ValueParameterDescriptor> valueParameters;
        Iterator<T> it;
        KotlinType type;
        KotlinType returnType;
        Intrinsics.checkNotNullParameter(caller, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
            Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
            if (contextReceiverParameters != null && contextReceiverParameters.isEmpty()) {
                valueParameters = descriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                if (valueParameters == null) {
                    it = valueParameters.iterator();
                    while (it.hasNext()) {
                        type = ((ValueParameterDescriptor) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (InlineClassesUtilsKt.isValueClassType(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = valueParameters.iterator();
                while (it.hasNext()) {
                    type = ((ValueParameterDescriptor) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (InlineClassesUtilsKt.isValueClassType(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator<T> it2 = contextReceiverParameters.iterator();
            while (it2.hasNext()) {
                KotlinType type2 = ((ReceiverParameterDescriptor) it2.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type2)) {
                }
            }
            valueParameters = descriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            if (valueParameters == null && valueParameters.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? caller : caller;
            }
            it = valueParameters.iterator();
            while (it.hasNext()) {
                type = ((ValueParameterDescriptor) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.isInlineClassType(returnType)) && !hasValueClassReceiver(descriptor)) {
            }
        }
        return new ValueClassAwareCaller(descriptor, caller, z11);
    }

    public static /* synthetic */ Caller createValueClassAwareCallerIfNeeded$default(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return createValueClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getBoxMethod(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", getInlineClassUnboxMethod(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    @NotNull
    public static final Method getInlineClassUnboxMethod(@NotNull Class<?> cls, @NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KotlinType> makeKotlinParameterTypes(CallableMemberDescriptor callableMemberDescriptor, Member member, Function1<? super ClassDescriptor, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor constructedClass = ((ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
            Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
            if (constructedClass.isInner()) {
                DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((ClassDescriptor) containingDeclaration).getDefaultType());
            }
        } else {
            DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
            if ((containingDeclaration2 instanceof ClassDescriptor) && function1.invoke(containingDeclaration2).booleanValue()) {
                if (member == null || !acceptsBoxedReceiverParameter(member)) {
                    arrayList.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
                } else {
                    SimpleType defaultType = ((ClassDescriptor) containingDeclaration2).getDefaultType();
                    Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
                    arrayList.add(TypeUtilsKt.makeNullable(defaultType));
                }
            }
        }
        List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    @NotNull
    public static final String toJvmDescriptor(@NotNull ClassifierDescriptor classifierDescriptor) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "<this>");
        ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptor);
        Intrinsics.checkNotNull(classId);
        return ClassMapperLite.mapClass(classId.asString());
    }

    private static final boolean acceptsBoxedReceiverParameter(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !JvmClassMappingKt.getKotlinClass(declaringClass).isValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkParametersSize(Caller<?> caller, int i11, CallableMemberDescriptor callableMemberDescriptor, boolean z11) {
        if (CallerKt.getArity(caller) == i11) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.getArity(caller) + " != " + i11 + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + caller.getParameterTypes() + ")\nDefault: " + z11);
    }

    private static final KotlinType getExpectedReceiverType(CallableMemberDescriptor callableMemberDescriptor) {
        ClassDescriptor classDescriptor;
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        if (containingDeclaration instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) containingDeclaration;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null) {
            return null;
        }
        return classDescriptor.getDefaultType();
    }

    @Nullable
    public static final List<Method> getMfvcUnboxMethods(@NotNull SimpleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        List<String> mfvcUnboxMethods$getUnboxMethodNameSuffixes = getMfvcUnboxMethods$getUnboxMethodNameSuffixes(TypeSubstitutionKt.asSimpleType(type));
        if (mfvcUnboxMethods$getUnboxMethodNameSuffixes != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mfvcUnboxMethods$getUnboxMethodNameSuffixes, 10));
            Iterator<T> it = mfvcUnboxMethods$getUnboxMethodNameSuffixes.iterator();
            while (it.hasNext()) {
                arrayList.add("unbox-impl-" + ((String) it.next()));
            }
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = type.getConstructor().mo105126getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor);
            Intrinsics.checkNotNull(javaClass);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(javaClass.getDeclaredMethod((String) it2.next(), new Class[0]));
            }
            return arrayList2;
        }
        return null;
    }

    private static final List<String> getMfvcUnboxMethods$getUnboxMethodNameSuffixes(SimpleType simpleType) {
        Collection collectionListOf;
        if (InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = simpleType.getConstructor().mo105126getDeclarationDescriptor();
            Intrinsics.checkNotNull(classifierDescriptorMo105126getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor);
            Intrinsics.checkNotNull(multiFieldValueClassRepresentation);
            Collection<Pair> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
            ArrayList arrayList = new ArrayList();
            for (Pair pair : underlyingPropertyNamesToTypes) {
                Name name = (Name) pair.component1();
                List<String> mfvcUnboxMethods$getUnboxMethodNameSuffixes = getMfvcUnboxMethods$getUnboxMethodNameSuffixes((SimpleType) pair.component2());
                if (mfvcUnboxMethods$getUnboxMethodNameSuffixes != null) {
                    collectionListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(mfvcUnboxMethods$getUnboxMethodNameSuffixes, 10));
                    Iterator<T> it = mfvcUnboxMethods$getUnboxMethodNameSuffixes.iterator();
                    while (it.hasNext()) {
                        collectionListOf.add(name.getIdentifier() + '-' + ((String) it.next()));
                    }
                } else {
                    collectionListOf = CollectionsKt.listOf(name.getIdentifier());
                }
                CollectionsKt.addAll(arrayList, collectionListOf);
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> getValueClassUnboxMethods(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method inlineClassUnboxMethod;
        List<Method> mfvcUnboxMethods = getMfvcUnboxMethods(simpleType);
        if (mfvcUnboxMethods == null) {
            Class<?> inlineClass = toInlineClass(simpleType);
            if (inlineClass != null && (inlineClassUnboxMethod = getInlineClassUnboxMethod(inlineClass, callableMemberDescriptor)) != null) {
                return CollectionsKt.listOf(inlineClassUnboxMethod);
            }
            return null;
        }
        return mfvcUnboxMethods;
    }

    private static final boolean hasValueClassReceiver(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType expectedReceiverType = getExpectedReceiverType(callableMemberDescriptor);
        if (expectedReceiverType == null || !InlineClassesUtilsKt.isValueClassType(expectedReceiverType)) {
            return false;
        }
        return true;
    }

    @Nullable
    public static final Class<?> toInlineClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
        if (javaClass != null) {
            return javaClass;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + ')');
    }
}
