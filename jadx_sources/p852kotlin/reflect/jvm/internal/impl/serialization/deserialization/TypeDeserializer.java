package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: TypeDeserializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nTypeDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1563#2:301\n1634#2,3:302\n1573#2:305\n1604#2,4:306\n1563#2:311\n1634#2,3:312\n1#3:310\n*S KotlinDebug\n*F\n+ 1 TypeDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer\n*L\n76#1:301\n76#1:302,3\n105#1:305\n105#1:306,4\n246#1:311\n246#1:312,3\n*E\n"})
public final class TypeDeserializer {

    /* JADX INFO: renamed from: c */
    @NotNull
    private final DeserializationContext f91379c;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> classifierDescriptors;

    @NotNull
    private final String containerPresentableName;

    @NotNull
    private final String debugName;

    @Nullable
    private final TypeDeserializer parent;

    @NotNull
    private final Function1<Integer, ClassifierDescriptor> typeAliasDescriptors;

    @NotNull
    private final Map<Integer, TypeParameterDescriptor> typeParameterDescriptors;

    public TypeDeserializer(@NotNull DeserializationContext c11, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> typeParameterProtos, @NotNull String debugName, @NotNull String containerPresentableName) {
        Map<Integer, TypeParameterDescriptor> linkedHashMap;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f91379c = c11;
        this.parent = typeDeserializer;
        this.debugName = debugName;
        this.containerPresentableName = containerPresentableName;
        this.classifierDescriptors = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$0
            private final TypeDeserializer arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return this.arg$0.computeClassifierDescriptor(((Number) obj).intValue());
            }

            {
                this.arg$0 = this;
            }
        });
        this.typeAliasDescriptors = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$1
            private final TypeDeserializer arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return this.arg$0.computeTypeAliasDescriptor(((Number) obj).intValue());
            }

            {
                this.arg$0 = this;
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = MapsKt.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i11 = 0;
            for (ProtoBuf.TypeParameter typeParameter : typeParameterProtos) {
                linkedHashMap.put(Integer.valueOf(typeParameter.getId()), new DeserializedTypeParameterDescriptor(this.f91379c, typeParameter, i11));
                i11++;
            }
        }
        this.typeParameterDescriptors = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor computeClassifierDescriptor(int i11) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f91379c.getNameResolver(), i11);
        return classId.isLocal() ? this.f91379c.getComponents().deserializeClass(classId) : FindClassInModuleKt.findClassifierAcrossModuleDependencies(this.f91379c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType computeLocalClassifierReplacementType(int i11) {
        if (NameResolverUtilKt.getClassId(this.f91379c.getNameResolver(), i11).isLocal()) {
            return this.f91379c.getComponents().getLocalClassifierTypeSettings().getReplacementTypeForLocalClassifiers();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassifierDescriptor computeTypeAliasDescriptor(int i11) {
        ClassId classId = NameResolverUtilKt.getClassId(this.f91379c.getNameResolver(), i11);
        if (classId.isLocal()) {
            return null;
        }
        return FindClassInModuleKt.findTypeAliasAcrossModuleDependencies(this.f91379c.getComponents().getModuleDescriptor(), classId);
    }

    private final SimpleType createSuspendFunctionTypeForBasicCase(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z11) {
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z11, (KotlinTypeRefiner) null, 16, (Object) null);
        if (FunctionTypesKt.isFunctionType(simpleTypeSimpleType$default)) {
            return transformRuntimeFunctionTypeToSuspendFunction(simpleTypeSimpleType$default);
        }
        return null;
    }

    private final TypeParameterDescriptor loadTypeParameter(int i11) {
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptors.get(Integer.valueOf(i11));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.parent;
        if (typeDeserializer != null) {
            return typeDeserializer.loadTypeParameter(i11);
        }
        return null;
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeDeserializer typeDeserializer, ProtoBuf.Type type, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return typeDeserializer.simpleType(type, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List simpleType$lambda$3(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        return typeDeserializer.f91379c.getComponents().getAnnotationAndConstantLoader().loadTypeAnnotations(type, typeDeserializer.f91379c.getNameResolver());
    }

    private final TypeAttributes toAttributes(List<? extends TypeAttributeTranslator> list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).toAttributes(annotations, typeConstructor, declarationDescriptor));
        }
        return TypeAttributes.Companion.create(CollectionsKt.flatten(arrayList));
    }

    private static final ClassDescriptor typeConstructor$notFoundClass(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i11) {
        ClassId classId = NameResolverUtilKt.getClassId(typeDeserializer.f91379c.getNameResolver(), i11);
        List<Integer> mutableList = SequencesKt.toMutableList(SequencesKt.map(SequencesKt.generateSequence(type, (Function1<? super ProtoBuf.Type, ? extends ProtoBuf.Type>) new Function1(typeDeserializer) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$3
            private final TypeDeserializer arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return TypeDeserializer.typeConstructor$notFoundClass$lambda$8(this.arg$0, (ProtoBuf.Type) obj);
            }

            {
                this.arg$0 = typeDeserializer;
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$4
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Integer.valueOf(TypeDeserializer.typeConstructor$notFoundClass$lambda$9((ProtoBuf.Type) obj));
            }
        }));
        int iCount = SequencesKt.count(SequencesKt.generateSequence(classId, new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }
        }));
        while (mutableList.size() < iCount) {
            mutableList.add(0);
        }
        return typeDeserializer.f91379c.getComponents().getNotFoundClasses().getClass(classId, mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoBuf.Type typeConstructor$notFoundClass$lambda$8(TypeDeserializer typeDeserializer, ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ProtoTypeTableUtilKt.outerType(it, typeDeserializer.f91379c.getTypeTable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int typeConstructor$notFoundClass$lambda$9(ProtoBuf.Type it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getArgumentCount();
    }

    @NotNull
    public final List<TypeParameterDescriptor> getOwnTypeParameters() {
        return CollectionsKt.toList(this.typeParameterDescriptors.values());
    }

    @NotNull
    public final SimpleType simpleType(@NotNull final ProtoBuf.Type proto, boolean z11) {
        SimpleType simpleTypeMakeDefinitelyNotNull$default;
        SimpleType simpleTypeWithAbbreviation;
        Intrinsics.checkNotNullParameter(proto, "proto");
        SimpleType simpleTypeComputeLocalClassifierReplacementType = proto.hasClassName() ? computeLocalClassifierReplacementType(proto.getClassName()) : proto.hasTypeAliasName() ? computeLocalClassifierReplacementType(proto.getTypeAliasName()) : null;
        if (simpleTypeComputeLocalClassifierReplacementType != null) {
            return simpleTypeComputeLocalClassifierReplacementType;
        }
        TypeConstructor typeConstructor = typeConstructor(proto);
        if (ErrorUtils.isError(typeConstructor.mo105126getDeclarationDescriptor())) {
            return ErrorUtils.INSTANCE.createErrorType(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, typeConstructor, typeConstructor.toString());
        }
        DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(this.f91379c.getStorageManager(), new Function0(this, proto) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$$Lambda$2
            private final TypeDeserializer arg$0;
            private final ProtoBuf.Type arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return TypeDeserializer.simpleType$lambda$3(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = this;
                this.arg$1 = proto;
            }
        });
        TypeAttributes attributes = toAttributes(this.f91379c.getComponents().getTypeAttributeTranslators(), deserializedAnnotations, typeConstructor, this.f91379c.getContainingDeclaration());
        List<ProtoBuf.Type.Argument> listSimpleType$collectAllArguments = simpleType$collectAllArguments(proto, this);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSimpleType$collectAllArguments, 10));
        int i11 = 0;
        for (Object obj : listSimpleType$collectAllArguments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            arrayList.add(typeArgument((TypeParameterDescriptor) CollectionsKt.getOrNull(parameters, i11), (ProtoBuf.Type.Argument) obj));
            i11 = i12;
        }
        List<? extends TypeProjection> list = CollectionsKt.toList(arrayList);
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = typeConstructor.mo105126getDeclarationDescriptor();
        if (z11 && (classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeComputeExpandedType = KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorMo105126getDeclarationDescriptor, list);
            simpleTypeMakeDefinitelyNotNull$default = simpleTypeComputeExpandedType.makeNullableAsSpecified(KotlinTypeKt.isNullable(simpleTypeComputeExpandedType) || proto.getNullable()).replaceAttributes(toAttributes(this.f91379c.getComponents().getTypeAttributeTranslators(), Annotations.Companion.create(CollectionsKt.plus((Iterable) deserializedAnnotations, (Iterable) simpleTypeComputeExpandedType.getAnnotations())), typeConstructor, this.f91379c.getContainingDeclaration()));
        } else if (Flags.SUSPEND_TYPE.get(proto.getFlags()).booleanValue()) {
            simpleTypeMakeDefinitelyNotNull$default = createSuspendFunctionType(attributes, typeConstructor, list, proto.getNullable());
        } else {
            SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(attributes, typeConstructor, list, proto.getNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (Flags.DEFINITELY_NOT_NULL_TYPE.get(proto.getFlags()).booleanValue()) {
                simpleTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleTypeSimpleType$default, true, false, 4, null);
                if (simpleTypeMakeDefinitelyNotNull$default == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeSimpleType$default + '\'').toString());
                }
            } else {
                simpleTypeMakeDefinitelyNotNull$default = simpleTypeSimpleType$default;
            }
        }
        ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(proto, this.f91379c.getTypeTable());
        return (typeAbbreviatedType == null || (simpleTypeWithAbbreviation = SpecialTypesKt.withAbbreviation(simpleTypeMakeDefinitelyNotNull$default, simpleType(typeAbbreviatedType, false))) == null) ? simpleTypeMakeDefinitelyNotNull$default : simpleTypeWithAbbreviation;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.debugName);
        if (this.parent == null) {
            str = "";
        } else {
            str = ". Child of " + this.parent.debugName;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @NotNull
    public final KotlinType type(@NotNull ProtoBuf.Type proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        if (!proto.hasFlexibleTypeCapabilitiesId()) {
            return simpleType(proto, true);
        }
        String string = this.f91379c.getNameResolver().getString(proto.getFlexibleTypeCapabilitiesId());
        SimpleType simpleTypeSimpleType$default = simpleType$default(this, proto, false, 2, null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(proto, this.f91379c.getTypeTable());
        Intrinsics.checkNotNull(typeFlexibleUpperBound);
        return this.f91379c.getComponents().getFlexibleTypeDeserializer().create(proto, string, simpleTypeSimpleType$default, simpleType$default(this, typeFlexibleUpperBound, false, 2, null));
    }

    private final SimpleType createSimpleSuspendFunctionType(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(kotlinType);
        List listDropLast = CollectionsKt.dropLast(FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType), 1);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDropLast, 10));
        Iterator it = listDropLast.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, contextReceiverTypesFromFunctionType, arrayList, null, kotlinType2, true).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }

    private final SimpleType createSuspendFunctionType(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z11) {
        List<? extends TypeProjection> list2;
        SimpleType simpleTypeCreateSuspendFunctionTypeForBasicCase;
        int size;
        int size2 = typeConstructor.getParameters().size() - list.size();
        if (size2 != 0) {
            simpleTypeCreateSuspendFunctionTypeForBasicCase = null;
            if (size2 != 1 || (size = list.size() - 1) < 0) {
                list2 = list;
            } else {
                TypeConstructor typeConstructor2 = typeConstructor.getBuiltIns().getSuspendFunction(size).getTypeConstructor();
                Intrinsics.checkNotNullExpressionValue(typeConstructor2, "getTypeConstructor(...)");
                list2 = list;
                simpleTypeCreateSuspendFunctionTypeForBasicCase = KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor2, list2, z11, (KotlinTypeRefiner) null, 16, (Object) null);
            }
        } else {
            list2 = list;
            simpleTypeCreateSuspendFunctionTypeForBasicCase = createSuspendFunctionTypeForBasicCase(typeAttributes, typeConstructor, list2, z11);
        }
        if (simpleTypeCreateSuspendFunctionTypeForBasicCase == null) {
            return ErrorUtils.INSTANCE.createErrorTypeWithArguments(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list2, typeConstructor, new String[0]);
        }
        return simpleTypeCreateSuspendFunctionTypeForBasicCase;
    }

    private static final List<ProtoBuf.Type.Argument> simpleType$collectAllArguments(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List<ProtoBuf.Type.Argument> listEmptyList;
        List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "getArgumentList(...)");
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, typeDeserializer.f91379c.getTypeTable());
        if (typeOuterType != null) {
            listEmptyList = simpleType$collectAllArguments(typeOuterType, typeDeserializer);
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) argumentList, (Iterable) listEmptyList);
    }

    private final SimpleType transformRuntimeFunctionTypeToSuspendFunction(KotlinType kotlinType) {
        KotlinType type;
        FqName fqNameSafe;
        CallableDescriptor callableDescriptor;
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.lastOrNull((List) FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType));
        FqName fqNameFqNameOrNull = null;
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = type.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor != null) {
            fqNameSafe = DescriptorUtilsKt.getFqNameSafe(classifierDescriptorMo105126getDeclarationDescriptor);
        } else {
            fqNameSafe = null;
        }
        if (type.getArguments().size() == 1 && (Intrinsics.areEqual(fqNameSafe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME) || Intrinsics.areEqual(fqNameSafe, TypeDeserializerKt.EXPERIMENTAL_CONTINUATION_FQ_NAME))) {
            KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            DeclarationDescriptor containingDeclaration = this.f91379c.getContainingDeclaration();
            if (containingDeclaration instanceof CallableDescriptor) {
                callableDescriptor = (CallableDescriptor) containingDeclaration;
            } else {
                callableDescriptor = null;
            }
            if (callableDescriptor != null) {
                fqNameFqNameOrNull = DescriptorUtilsKt.fqNameOrNull(callableDescriptor);
            }
            if (Intrinsics.areEqual(fqNameFqNameOrNull, SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME)) {
                return createSimpleSuspendFunctionType(kotlinType, type2);
            }
            return createSimpleSuspendFunctionType(kotlinType, type2);
        }
        return (SimpleType) kotlinType;
    }

    private final TypeProjection typeArgument(TypeParameterDescriptor typeParameterDescriptor, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            if (typeParameterDescriptor == null) {
                return new StarProjectionForAbsentTypeParameter(this.f91379c.getComponents().getModuleDescriptor().getBuiltIns());
            }
            return new StarProjectionImpl(typeParameterDescriptor);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
        Variance variance = protoEnumFlags.variance(projection);
        ProtoBuf.Type type = ProtoTypeTableUtilKt.type(argument, this.f91379c.getTypeTable());
        if (type == null) {
            return new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
        }
        return new TypeProjectionImpl(variance, type(type));
    }

    private final TypeConstructor typeConstructor(ProtoBuf.Type type) {
        ClassifierDescriptor classifierDescriptorInvoke;
        Object next;
        if (type.hasClassName()) {
            classifierDescriptorInvoke = this.classifierDescriptors.invoke(Integer.valueOf(type.getClassName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = typeConstructor$notFoundClass(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            classifierDescriptorInvoke = loadTypeParameter(type.getTypeParameter());
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(type.getTypeParameter()), this.containerPresentableName);
            }
        } else if (type.hasTypeParameterName()) {
            String string = this.f91379c.getNameResolver().getString(type.getTypeParameterName());
            Iterator<T> it = getOwnTypeParameters().iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(((TypeParameterDescriptor) next).getName().asString(), string));
            classifierDescriptorInvoke = (TypeParameterDescriptor) next;
            if (classifierDescriptorInvoke == null) {
                return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f91379c.getContainingDeclaration().toString());
            }
        } else if (type.hasTypeAliasName()) {
            classifierDescriptorInvoke = this.typeAliasDescriptors.invoke(Integer.valueOf(type.getTypeAliasName()));
            if (classifierDescriptorInvoke == null) {
                classifierDescriptorInvoke = typeConstructor$notFoundClass(this, type, type.getTypeAliasName());
            }
        } else {
            return ErrorUtils.INSTANCE.createErrorTypeConstructor(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
        }
        TypeConstructor typeConstructor = classifierDescriptorInvoke.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }
}
