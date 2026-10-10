package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p852kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import p852kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: MemberDeserializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nMemberDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1563#2:376\n1634#2,3:377\n1573#2:381\n1604#2,4:382\n1583#2,11:386\n1878#2,2:397\n1880#2:400\n1594#2:401\n1563#2:402\n1634#2,3:403\n1573#2:406\n1604#2,4:407\n1#3:380\n1#3:399\n*S KotlinDebug\n*F\n+ 1 MemberDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/MemberDeserializer\n*L\n29#1:376\n29#1:377,3\n67#1:381\n67#1:382,4\n219#1:386,11\n219#1:397,2\n219#1:400\n219#1:401\n247#1:402\n247#1:403,3\n331#1:406\n331#1:407,4\n219#1:399\n*E\n"})
public final class MemberDeserializer {

    @NotNull
    private final AnnotationDeserializer annotationDeserializer;

    /* JADX INFO: renamed from: c */
    @NotNull
    private final DeserializationContext f91378c;

    public MemberDeserializer(@NotNull DeserializationContext c11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        this.f91378c = c11;
        this.annotationDeserializer = new AnnotationDeserializer(c11.getComponents().getModuleDescriptor(), c11.getComponents().getNotFoundClasses());
    }

    private final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f91378c.getNameResolver(), this.f91378c.getTypeTable(), this.f91378c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(final MessageLite messageLite, int i11, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i11).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f91378c.getStorageManager(), new Function0(this, messageLite, annotatedCallableKind) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$2
            private final MemberDeserializer arg$0;
            private final MessageLite arg$1;
            private final AnnotatedCallableKind arg$2;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.getAnnotations$lambda$12(this.arg$0, this.arg$1, this.arg$2);
            }

            {
                this.arg$0 = this;
                this.arg$1 = messageLite;
                this.arg$2 = annotatedCallableKind;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAnnotations$lambda$12(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f91378c.getContainingDeclaration());
        List list = protoContainerAsProtoContainer != null ? CollectionsKt.toList(memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind)) : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f91378c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z11) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f91378c.getStorageManager(), new Function0(this, z11, property) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$3
            private final MemberDeserializer arg$0;
            private final boolean arg$1;
            private final ProtoBuf.Property arg$2;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.getPropertyFieldAnnotations$lambda$14(this.arg$0, this.arg$1, this.arg$2);
            }

            {
                this.arg$0 = this;
                this.arg$1 = z11;
                this.arg$2 = property;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getPropertyFieldAnnotations$lambda$14(MemberDeserializer memberDeserializer, boolean z11, ProtoBuf.Property property) {
        List list;
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f91378c.getContainingDeclaration());
        if (protoContainerAsProtoContainer != null) {
            list = z11 ? CollectionsKt.toList(memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(protoContainerAsProtoContainer, property)) : CollectionsKt.toList(memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(protoContainerAsProtoContainer, property));
        } else {
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final Annotations getReceiverParameterAnnotations(final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f91378c.getStorageManager(), new Function0(this, messageLite, annotatedCallableKind) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$4
            private final MemberDeserializer arg$0;
            private final MessageLite arg$1;
            private final AnnotatedCallableKind arg$2;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.getReceiverParameterAnnotations$lambda$16(this.arg$0, this.arg$1, this.arg$2);
            }

            {
                this.arg$0 = this;
                this.arg$1 = messageLite;
                this.arg$2 = annotatedCallableKind;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getReceiverParameterAnnotations$lambda$16(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f91378c.getContainingDeclaration());
        List<AnnotationDescriptor> listLoadExtensionReceiverParameterAnnotations = protoContainerAsProtoContainer != null ? memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(protoContainerAsProtoContainer, messageLite, annotatedCallableKind) : null;
        return listLoadExtensionReceiverParameterAnnotations == null ? CollectionsKt.emptyList() : listLoadExtensionReceiverParameterAnnotations;
    }

    private final int loadOldFlags(int i11) {
        return (i11 & 63) + ((i11 >> 8) << 6);
    }

    public static /* synthetic */ PropertyDescriptor loadProperty$default(MemberDeserializer memberDeserializer, ProtoBuf.Property property, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return memberDeserializer.loadProperty(property, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue loadProperty$lambda$4(final MemberDeserializer memberDeserializer, final ProtoBuf.Property property, final DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f91378c.getStorageManager().createNullableLazyValue(new Function0(memberDeserializer, property, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$6
            private final MemberDeserializer arg$0;
            private final ProtoBuf.Property arg$1;
            private final DeserializedPropertyDescriptor arg$2;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.loadProperty$lambda$4$lambda$3(this.arg$0, this.arg$1, this.arg$2);
            }

            {
                this.arg$0 = memberDeserializer;
                this.arg$1 = property;
                this.arg$2 = deserializedPropertyDescriptor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue loadProperty$lambda$4$lambda$3(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f91378c.getContainingDeclaration());
        Intrinsics.checkNotNull(protoContainerAsProtoContainer);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return annotationAndConstantLoader.loadPropertyConstant(protoContainerAsProtoContainer, property, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue loadProperty$lambda$6(final MemberDeserializer memberDeserializer, final ProtoBuf.Property property, final DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        return memberDeserializer.f91378c.getStorageManager().createNullableLazyValue(new Function0(memberDeserializer, property, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$7
            private final MemberDeserializer arg$0;
            private final ProtoBuf.Property arg$1;
            private final DeserializedPropertyDescriptor arg$2;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return MemberDeserializer.loadProperty$lambda$6$lambda$5(this.arg$0, this.arg$1, this.arg$2);
            }

            {
                this.arg$0 = memberDeserializer;
                this.arg$1 = property;
                this.arg$2 = deserializedPropertyDescriptor;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue loadProperty$lambda$6$lambda$5(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        ProtoContainer protoContainerAsProtoContainer = memberDeserializer.asProtoContainer(memberDeserializer.f91378c.getContainingDeclaration());
        Intrinsics.checkNotNull(protoContainerAsProtoContainer);
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader();
        KotlinType returnType = deserializedPropertyDescriptor.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return annotationAndConstantLoader.loadAnnotationDefaultValue(protoContainerAsProtoContainer, property, returnType);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor containingDeclaration = this.f91378c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        DeclarationDescriptor containingDeclaration2 = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        final ProtoContainer protoContainerAsProtoContainer = asProtoContainer(containingDeclaration2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        final int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            Annotations empty = (protoContainerAsProtoContainer == null || !Flags.HAS_ANNOTATIONS.get(flags).booleanValue()) ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f91378c.getStorageManager(), new Function0(this, protoContainerAsProtoContainer, messageLite, annotatedCallableKind, i11, valueParameter) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$5
                private final MemberDeserializer arg$0;
                private final ProtoContainer arg$1;
                private final MessageLite arg$2;
                private final AnnotatedCallableKind arg$3;
                private final int arg$4;
                private final ProtoBuf.ValueParameter arg$5;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return MemberDeserializer.valueParameters$lambda$19$lambda$17(this.arg$0, this.arg$1, this.arg$2, this.arg$3, this.arg$4, this.arg$5);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = protoContainerAsProtoContainer;
                    this.arg$2 = messageLite;
                    this.arg$3 = annotatedCallableKind;
                    this.arg$4 = i11;
                    this.arg$5 = valueParameter;
                }
            });
            Name name = NameResolverUtilKt.getName(this.f91378c.getNameResolver(), valueParameter.getName());
            KotlinType kotlinTypeType = this.f91378c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.f91378c.getTypeTable()));
            Boolean bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
            boolean zBooleanValue = bool.booleanValue();
            Boolean bool2 = Flags.IS_CROSSINLINE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
            boolean zBooleanValue2 = bool2.booleanValue();
            Boolean bool3 = Flags.IS_NOINLINE.get(flags);
            Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
            boolean zBooleanValue3 = bool3.booleanValue();
            ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.f91378c.getTypeTable());
            KotlinType kotlinTypeType2 = typeVarargElementType != null ? this.f91378c.getTypeDeserializer().type(typeVarargElementType) : null;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            CallableDescriptor callableDescriptor2 = callableDescriptor;
            arrayList.add(new ValueParameterDescriptorImpl(callableDescriptor2, null, i11, empty, name, kotlinTypeType, zBooleanValue, zBooleanValue2, zBooleanValue3, kotlinTypeType2, NO_SOURCE));
            callableDescriptor = callableDescriptor2;
            i11 = i12;
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List valueParameters$lambda$19$lambda$17(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i11, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt.toList(memberDeserializer.f91378c.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(protoContainer, messageLite, annotatedCallableKind, i11, valueParameter));
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull ProtoBuf.Constructor proto, boolean z11) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        DeclarationDescriptor containingDeclaration = this.f91378c.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(proto, flags, annotatedCallableKind), z11, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f91378c.getNameResolver(), this.f91378c.getTypeTable(), this.f91378c.getVersionRequirementTable(), this.f91378c.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f91378c, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setExpect(classDescriptor.isExpect());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull ProtoBuf.Function proto) {
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(proto, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(proto) ? getReceiverParameterAnnotations(proto, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(this.f91378c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(this.f91378c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(ProtoEnumFlags.INSTANCE, Flags.MEMBER_KIND.get(flags)), proto, this.f91378c.getNameResolver(), this.f91378c.getTypeTable(), Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f91378c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f91378c.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.f91378c.getVersionRequirementTable(), this.f91378c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = this.f91378c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f91378c.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, kotlinTypeType, receiverParameterAnnotations);
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f91378c.getTypeTable());
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ReceiverParameterDescriptor contextReceiver = toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedSimpleFunctionDescriptor, i11);
            if (contextReceiver != null) {
                arrayList.add(contextReceiver);
            }
            i11 = i12;
        }
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = deserializationContextChildContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "getValueParameterList(...)");
        List<ValueParameterDescriptor> listValueParameters = memberDeserializer.valueParameters(valueParameterList, proto, AnnotatedCallableKind.FUNCTION);
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f91378c.getTypeTable()));
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, dispatchReceiverParameter, arrayList, ownTypeParameters, listValueParameters, kotlinTypeType2, protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), MapsKt.emptyMap());
        Boolean bool = Flags.IS_OPERATOR.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> pairDeserializeContractFromFunction = this.f91378c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.f91378c.getTypeTable(), deserializationContextChildContext$default.getTypeDeserializer());
        if (pairDeserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(pairDeserializeContractFromFunction.getFirst(), pairDeserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull final ProtoBuf.Property proto, boolean z11) {
        Annotations annotations;
        Flags.FlagField<ProtoBuf.Modality> flagField;
        String str;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        boolean z12;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        KotlinType kotlinTypeType;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        if (z11) {
            Annotations.Companion companion = Annotations.Companion;
            List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
            Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotationList, 10));
            for (ProtoBuf.Annotation annotation : annotationList) {
                AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
                Intrinsics.checkNotNull(annotation);
                arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.f91378c.getNameResolver()));
            }
            annotations = companion.create(arrayList);
        } else {
            annotations = null;
        }
        DeclarationDescriptor containingDeclaration = this.f91378c.getContainingDeclaration();
        if (annotations == null) {
            annotations = getAnnotations(proto, flags, AnnotatedCallableKind.PROPERTY);
        }
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        Modality modality = protoEnumFlags.modality(Flags.MODALITY.get(flags));
        DescriptorVisibility descriptorVisibility = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags));
        Boolean bool = Flags.IS_VAR.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        Name name = NameResolverUtilKt.getName(this.f91378c.getNameResolver(), proto.getName());
        CallableMemberDescriptor.Kind kindMemberKind = ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags));
        Boolean bool2 = Flags.IS_LATEINIT.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool2, "get(...)");
        boolean zBooleanValue2 = bool2.booleanValue();
        Boolean bool3 = Flags.IS_CONST.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool3, "get(...)");
        boolean zBooleanValue3 = bool3.booleanValue();
        Boolean bool4 = Flags.IS_EXTERNAL_PROPERTY.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool4, "get(...)");
        boolean zBooleanValue4 = bool4.booleanValue();
        Boolean bool5 = Flags.IS_DELEGATED.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool5, "get(...)");
        boolean zBooleanValue5 = bool5.booleanValue();
        Boolean bool6 = Flags.IS_EXPECT_PROPERTY.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool6, "get(...)");
        int i11 = flags;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, modality, descriptorVisibility, zBooleanValue, name, kindMemberKind, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6.booleanValue(), proto, this.f91378c.getNameResolver(), this.f91378c.getTypeTable(), this.f91378c.getVersionRequirementTable(), this.f91378c.getContainerSource());
        DeserializationContext deserializationContext = this.f91378c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedPropertyDescriptor, typeParameterList, null, null, null, null, 60, null);
        Boolean bool7 = Flags.HAS_GETTER.get(i11);
        Intrinsics.checkNotNullExpressionValue(bool7, "get(...)");
        boolean zBooleanValue6 = bool7.booleanValue();
        Annotations receiverParameterAnnotations = (zBooleanValue6 && ProtoTypeTableUtilKt.hasReceiver(proto)) ? getReceiverParameterAnnotations(proto, AnnotatedCallableKind.PROPERTY_GETTER) : Annotations.Companion.getEMPTY();
        KotlinType kotlinTypeType2 = deserializationContextChildContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f91378c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f91378c.getTypeTable());
        ReceiverParameterDescriptor receiverParameterDescriptorCreateExtensionReceiverParameterForCallable = (typeReceiverType == null || (kotlinTypeType = deserializationContextChildContext$default.getTypeDeserializer().type(typeReceiverType)) == null) ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, kotlinTypeType, receiverParameterAnnotations);
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(proto, this.f91378c.getTypeTable());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listContextReceiverTypes, 10));
        int i12 = 0;
        for (Object obj : listContextReceiverTypes) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(toContextReceiver((ProtoBuf.Type) obj, deserializationContextChildContext$default, deserializedPropertyDescriptor, i12));
            i12 = i13;
        }
        deserializedPropertyDescriptor.setType(kotlinTypeType2, ownTypeParameters, dispatchReceiverParameter, receiverParameterDescriptorCreateExtensionReceiverParameterForCallable, arrayList2);
        Boolean bool8 = Flags.HAS_ANNOTATIONS.get(i11);
        Intrinsics.checkNotNullExpressionValue(bool8, "get(...)");
        boolean zBooleanValue7 = bool8.booleanValue();
        Flags.FlagField<ProtoBuf.Visibility> flagField2 = Flags.VISIBILITY;
        ProtoBuf.Visibility visibility = flagField2.get(i11);
        Flags.FlagField<ProtoBuf.Modality> flagField3 = Flags.MODALITY;
        int accessorFlags = Flags.getAccessorFlags(zBooleanValue7, visibility, flagField3.get(i11), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            Boolean bool9 = Flags.IS_NOT_DEFAULT.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool9, "get(...)");
            boolean zBooleanValue8 = bool9.booleanValue();
            Boolean bool10 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool10, "get(...)");
            boolean zBooleanValue9 = bool10.booleanValue();
            Boolean bool11 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
            Intrinsics.checkNotNullExpressionValue(bool11, "get(...)");
            boolean zBooleanValue10 = bool11.booleanValue();
            Annotations annotations2 = getAnnotations(proto, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
                flagField = flagField3;
                str = "get(...)";
                propertyGetterDescriptorImplCreateDefaultGetter = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField3.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField2.get(getterFlags)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                flagField = flagField3;
                str = "get(...)";
                propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations2);
                Intrinsics.checkNotNull(propertyGetterDescriptorImplCreateDefaultGetter);
            }
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            deserializationContextChildContext$default = deserializationContextChildContext$default;
            flagField2 = flagField2;
            flagField = flagField3;
            str = "get(...)";
            propertyGetterDescriptorImplCreateDefaultGetter = null;
        }
        if (Flags.HAS_SETTER.get(i11).booleanValue()) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i14 = accessorFlags;
            Boolean bool12 = Flags.IS_NOT_DEFAULT.get(i14);
            Intrinsics.checkNotNullExpressionValue(bool12, str);
            boolean zBooleanValue11 = bool12.booleanValue();
            Boolean bool13 = Flags.IS_EXTERNAL_ACCESSOR.get(i14);
            Intrinsics.checkNotNullExpressionValue(bool13, str);
            boolean zBooleanValue12 = bool13.booleanValue();
            Boolean bool14 = Flags.IS_INLINE_ACCESSOR.get(i14);
            Intrinsics.checkNotNullExpressionValue(bool14, str);
            boolean zBooleanValue13 = bool14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(proto, i14, annotatedCallableKind);
            if (zBooleanValue11) {
                ProtoEnumFlags protoEnumFlags3 = ProtoEnumFlags.INSTANCE;
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                z12 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, protoEnumFlags3.modality(flagField.get(i14)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField2.get(i14)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) CollectionsKt.single((List) DeserializationContext.childContext$default(deserializationContextChildContext$default, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt.listOf(proto.getSetterValueParameter()), proto, annotatedCallableKind)));
            } else {
                propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
                z12 = true;
                PropertySetterDescriptorImpl propertySetterDescriptorImplCreateDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNull(propertySetterDescriptorImplCreateDefaultSetter);
                propertySetterDescriptorImpl = propertySetterDescriptorImplCreateDefaultSetter;
            }
        } else {
            propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateDefaultGetter;
            z12 = true;
            propertySetterDescriptorImpl = null;
        }
        if (Flags.HAS_CONSTANT.get(i11).booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0(this, proto, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$0
                private final MemberDeserializer arg$0;
                private final ProtoBuf.Property arg$1;
                private final DeserializedPropertyDescriptor arg$2;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return MemberDeserializer.loadProperty$lambda$4(this.arg$0, this.arg$1, this.arg$2);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = proto;
                    this.arg$2 = deserializedPropertyDescriptor;
                }
            });
        }
        DeclarationDescriptor containingDeclaration2 = this.f91378c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration2 instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration2 : null;
        if ((classDescriptor != null ? classDescriptor.getKind() : null) == ClassKind.ANNOTATION_CLASS) {
            deserializedPropertyDescriptor.setCompileTimeInitializerFactory(new Function0(this, proto, deserializedPropertyDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$$Lambda$1
                private final MemberDeserializer arg$0;
                private final ProtoBuf.Property arg$1;
                private final DeserializedPropertyDescriptor arg$2;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return MemberDeserializer.loadProperty$lambda$6(this.arg$0, this.arg$1, this.arg$2);
                }

                {
                    this.arg$0 = this;
                    this.arg$1 = proto;
                    this.arg$2 = deserializedPropertyDescriptor;
                }
            });
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, false), deserializedPropertyDescriptor), new FieldDescriptorImpl(getPropertyFieldAnnotations(proto, z12), deserializedPropertyDescriptor));
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull ProtoBuf.TypeAlias proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "getAnnotationList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotationList, 10));
        for (ProtoBuf.Annotation annotation : annotationList) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            Intrinsics.checkNotNull(annotation);
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, this.f91378c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f91378c.getStorageManager(), this.f91378c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f91378c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, this.f91378c.getNameResolver(), this.f91378c.getTypeTable(), this.f91378c.getVersionRequirementTable(), this.f91378c.getContainerSource());
        DeserializationContext deserializationContext = this.f91378c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        DeserializationContext deserializationContextChildContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(deserializationContextChildContext$default.getTypeDeserializer().getOwnTypeParameters(), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, this.f91378c.getTypeTable()), false), deserializationContextChildContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, this.f91378c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<? extends ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
    }

    private final ReceiverParameterDescriptor toContextReceiver(ProtoBuf.Type type, DeserializationContext deserializationContext, CallableDescriptor callableDescriptor, int i11) {
        return DescriptorFactory.createContextReceiverParameterForCallable(callableDescriptor, deserializationContext.getTypeDeserializer().type(type), null, Annotations.Companion.getEMPTY(), i11);
    }
}
