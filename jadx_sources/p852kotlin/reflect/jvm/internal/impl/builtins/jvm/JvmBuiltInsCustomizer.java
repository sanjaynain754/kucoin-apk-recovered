package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.kubi.otc.entity.OtcAd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p852kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p852kotlin.reflect.jvm.internal.impl.utils.DFS;
import p852kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nJvmBuiltInsCustomizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1761#2,3:377\n1617#2,9:380\n1869#2:389\n1870#2:391\n1626#2:392\n1563#2:393\n1634#2,3:394\n774#2:397\n865#2:398\n1761#2,3:399\n866#2:402\n774#2:403\n865#2:404\n2746#2,3:405\n866#2:408\n1563#2:409\n1634#2,3:410\n1761#2,3:413\n1617#2,9:416\n1869#2:425\n1870#2:427\n1626#2:428\n1#3:390\n1#3:426\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsCustomizer.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer\n*L\n120#1:377,3\n136#1:380,9\n136#1:389\n136#1:391\n136#1:392\n195#1:393\n195#1:394,3\n209#1:397\n209#1:398\n214#1:399,3\n209#1:402\n317#1:403\n317#1:404\n319#1:405,3\n317#1:408\n326#1:409\n326#1:410,3\n353#1:413,3\n257#1:416,9\n257#1:425\n257#1:427\n257#1:428\n136#1:390\n257#1:426\n*E\n"})
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), Reflection.property1(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), Reflection.property1(new PropertyReference1Impl(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    @NotNull
    private final NotNullLazyValue cloneableType$delegate;

    @NotNull
    private final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> deprecationForSomeOfTheListMethods;

    @NotNull
    private final JavaToKotlinClassMapper j2kClassMapper;

    @NotNull
    private final CacheWithNotNullValues<FqName, ClassDescriptor> javaAnalogueClassesWithCustomSupertypeCache;

    @NotNull
    private final KotlinType mockSerializableType;

    @NotNull
    private final ModuleDescriptor moduleDescriptor;

    @NotNull
    private final NotNullLazyValue notConsideredDeprecation$delegate;

    @NotNull
    private final NotNullLazyValue settings$delegate;

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    }

    /* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JDKMemberStatus.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JDKMemberStatus.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JDKMemberStatus.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull final StorageManager storageManager, @NotNull Function0<JvmBuiltIns.Settings> settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.moduleDescriptor = moduleDescriptor;
        this.j2kClassMapper = JavaToKotlinClassMapper.INSTANCE;
        this.settings$delegate = storageManager.createLazyValue(settingsComputation);
        this.mockSerializableType = createMockJavaIoSerializableType(storageManager);
        this.cloneableType$delegate = storageManager.createLazyValue(new Function0(this, storageManager) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$0
            private final JvmBuiltInsCustomizer arg$0;
            private final StorageManager arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltInsCustomizer.cloneableType_delegate$lambda$0(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = this;
                this.arg$1 = storageManager;
            }
        });
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1
            private final JvmBuiltInsCustomizer arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltInsCustomizer.notConsideredDeprecation_delegate$lambda$1(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        });
        this.deprecationForSomeOfTheListMethods = storageManager.createMemoizedFunction(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$2
            private final JvmBuiltInsCustomizer arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return JvmBuiltInsCustomizer.deprecationForSomeOfTheListMethods$lambda$2(this.arg$0, (Pair) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    private final KotlinType createMockJavaIoSerializableType(StorageManager storageManager) {
        final ModuleDescriptor moduleDescriptor = this.moduleDescriptor;
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            public MemberScope.Empty getMemberScope() {
                return MemberScope.Empty.INSTANCE;
            }
        }, Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, CollectionsKt.listOf(new LazyWrappedType(storageManager, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$3
            private final JvmBuiltInsCustomizer arg$0;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltInsCustomizer.createMockJavaIoSerializableType$lambda$3(this.arg$0);
            }

            {
                this.arg$0 = this;
            }
        })), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, SetsKt.emptySet(), null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType createMockJavaIoSerializableType$lambda$3(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        SimpleType anyType = jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns().getAnyType();
        Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
        return anyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations deprecationForSomeOfTheListMethods$lambda$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return Annotations.Companion.create(CollectionsKt.listOf(AnnotationUtilKt.createDeprecatedAnnotation(jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", OtcAd.STATUS_HIDDEN, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor getAdditionalFunctions$lambda$9(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return lazyJavaClassDescriptor.copy$descriptors_jvm(EMPTY, classDescriptor);
    }

    private final SimpleType getCloneableType() {
        return (SimpleType) StorageKt.getValue(this.cloneableType$delegate, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection getFunctions$lambda$5(Name name, MemberScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
    }

    private final Annotations getNotConsideredDeprecation() {
        return (Annotations) StorageKt.getValue(this.notConsideredDeprecation$delegate, this, (KProperty<?>) $$delegatedProperties[2]);
    }

    private final JvmBuiltIns.Settings getSettings() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.settings$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations notConsideredDeprecation_delegate$lambda$1(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        return Annotations.Companion.create(CollectionsKt.listOf(AnnotationUtilKt.createDeprecatedAnnotation$default(jvmBuiltInsCustomizer.moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return CollectionsKt.emptyList();
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return CollectionsKt.emptyList();
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.j2kClassMapper, DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return CollectionsKt.emptyList();
        }
        TypeSubstitutor typeSubstitutorBuildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptorMapJavaToKotlin$default, javaAnalogue).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = javaAnalogue.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = classDescriptorMapJavaToKotlin$default.getConstructors();
                Intrinsics.checkNotNullExpressionValue(constructors2, "getConstructors(...)");
                if (constructors2 == null || !constructors2.isEmpty()) {
                    Iterator<T> it = constructors2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ClassConstructorDescriptor classConstructorDescriptor2 = (ClassConstructorDescriptor) it.next();
                            Intrinsics.checkNotNull(classConstructorDescriptor2);
                            if (getConstructors$isEffectivelyTheSameAs(classConstructorDescriptor2, typeSubstitutorBuildSubstitutor, classConstructorDescriptor)) {
                            }
                        }
                    }
                }
                if (!isTrivialCopyConstructorFor(classConstructorDescriptor, classDescriptor) && !KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaAnalogue, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderNewCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            copyBuilderNewCopyBuilder.setSubstitution(typeSubstitutorBuildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaAnalogue, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderNewCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            Intrinsics.checkNotNull(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<SimpleFunctionDescriptor> getFunctions(@NotNull final Name name, @NotNull ClassDescriptor classDescriptor) {
        Annotations annotationsInvoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (Intrinsics.areEqual(name, CloneableClassScope.Companion.getCLONE_NAME()) && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            if (functionList == null || !functionList.isEmpty()) {
                Iterator<T> it = functionList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return CollectionsKt.emptyList();
                    }
                }
            }
            return CollectionsKt.listOf(createCloneForArray(deserializedClassDescriptor, (SimpleFunctionDescriptor) CollectionsKt.single(getCloneableType().getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return CollectionsKt.emptyList();
        }
        Collection<SimpleFunctionDescriptor> additionalFunctions = getAdditionalFunctions(classDescriptor, new Function1(name) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$4
            private final Name arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return JvmBuiltInsCustomizer.getFunctions$lambda$5(this.arg$0, (MemberScope) obj);
            }

            {
                this.arg$0 = name;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : additionalFunctions) {
            DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorSubstitute = simpleFunctionDescriptor.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration, classDescriptor).buildSubstitutor());
            Intrinsics.checkNotNull(functionDescriptorSubstitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((SimpleFunctionDescriptor) functionDescriptorSubstitute).newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            int i11 = WhenMappings.$EnumSwitchMapping$0[getJdkMethodStatus(simpleFunctionDescriptor).ordinal()];
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
            if (i11 != 1) {
                if (i11 == 2) {
                    Name name2 = simpleFunctionDescriptor.getName();
                    if (Intrinsics.areEqual(name2, JvmBuiltInsCustomizerKt.GET_FIRST_LIST_NAME)) {
                        annotationsInvoke = this.deprecationForSomeOfTheListMethods.invoke(TuplesKt.m90091to(simpleFunctionDescriptor.getName().asString(), "first"));
                    } else {
                        if (!Intrinsics.areEqual(name2, JvmBuiltInsCustomizerKt.GET_LAST_LIST_NAME)) {
                            throw new IllegalStateException(("Unexpected name: " + simpleFunctionDescriptor.getName()).toString());
                        }
                        annotationsInvoke = this.deprecationForSomeOfTheListMethods.invoke(TuplesKt.m90091to(simpleFunctionDescriptor.getName().asString(), "last"));
                    }
                    copyBuilderNewCopyBuilder.setAdditionalAnnotations(annotationsInvoke);
                } else if (i11 == 3) {
                    copyBuilderNewCopyBuilder.setAdditionalAnnotations(getNotConsideredDeprecation());
                } else if (i11 != 4) {
                    if (i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                Intrinsics.checkNotNull(functionDescriptorBuild);
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
            } else if (!ModalityUtilsKt.isFinalClass(classDescriptor)) {
                copyBuilderNewCopyBuilder.setHiddenForResolutionEverywhereBesideSupercalls();
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderNewCopyBuilder.build();
                Intrinsics.checkNotNull(functionDescriptorBuild2);
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            }
            if (simpleFunctionDescriptor2 != null) {
                arrayList.add(simpleFunctionDescriptor2);
            }
        }
        return arrayList;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Set<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return SetsKt.emptySet();
        }
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        return (javaAnalogue == null || (unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? SetsKt.emptySet() : functionNames;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        if (jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return CollectionsKt.listOf((Object[]) new KotlinType[]{getCloneableType(), this.mockSerializableType});
        }
        return jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? CollectionsKt.listOf(this.mockSerializableType) : CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!getSettings().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
        Name name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if (contributedFunctions != null && contributedFunctions.isEmpty()) {
            return false;
        }
        Iterator<T> it = contributedFunctions.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType cloneableType_delegate$lambda$0(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(jvmBuiltInsCustomizer.getSettings().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new NotFoundClasses(storageManager, jvmBuiltInsCustomizer.getSettings().getOwnerModuleDescriptor())).getDefaultType();
    }

    private final SimpleFunctionDescriptor createCloneForArray(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        copyBuilderNewCopyBuilder.setOwner(deserializedClassDescriptor);
        copyBuilderNewCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
        copyBuilderNewCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
        copyBuilderNewCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
        Intrinsics.checkNotNull(functionDescriptorBuild);
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    private final Collection<SimpleFunctionDescriptor> getAdditionalFunctions(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        final LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassDescriptor> collectionMapPlatformClass = this.j2kClassMapper.mapPlatformClass(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance());
        final ClassDescriptor classDescriptor2 = (ClassDescriptor) CollectionsKt.lastOrNull(collectionMapPlatformClass);
        if (classDescriptor2 == null) {
            return CollectionsKt.emptyList();
        }
        SmartSet.Companion companion = SmartSet.Companion;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMapPlatformClass, 10));
        Iterator<T> it = collectionMapPlatformClass.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it.next()));
        }
        SmartSet smartSetCreate = companion.create(arrayList);
        boolean zIsMutable = this.j2kClassMapper.isMutable(classDescriptor);
        MemberScope unsubstitutedMemberScope = this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), new Function0(javaAnalogue, classDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$5
            private final LazyJavaClassDescriptor arg$0;
            private final ClassDescriptor arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return JvmBuiltInsCustomizer.getAdditionalFunctions$lambda$9(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = javaAnalogue;
                this.arg$1 = classDescriptor2;
            }
        }).getUnsubstitutedMemberScope();
        Intrinsics.checkNotNullExpressionValue(unsubstitutedMemberScope, "getUnsubstitutedMemberScope(...)");
        Collection<? extends SimpleFunctionDescriptor> collectionInvoke = function1.invoke(unsubstitutedMemberScope);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor)) {
                Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor.getOverriddenDescriptors();
                Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
                if (overriddenDescriptors == null || !overriddenDescriptors.isEmpty()) {
                    Iterator<T> it2 = overriddenDescriptors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            DeclarationDescriptor containingDeclaration = ((FunctionDescriptor) it2.next()).getContainingDeclaration();
                            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                            if (smartSetCreate.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                            }
                        }
                    }
                }
                if (!isMutabilityViolation(simpleFunctionDescriptor, zIsMutable)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    private static final boolean getConstructors$isEffectivelyTheSameAs(ConstructorDescriptor constructorDescriptor, TypeSubstitutor typeSubstitutor, ConstructorDescriptor constructorDescriptor2) {
        if (OverridingUtil.getBothWaysOverridability(constructorDescriptor, constructorDescriptor2.substitute(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            return true;
        }
        return false;
    }

    private final LazyJavaClassDescriptor getJavaAnalogue(ClassDescriptor classDescriptor) {
        ClassId classIdMapKotlinToJava;
        FqName fqNameAsSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (fqNameUnsafe.isSafe() && (classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) != null && (fqNameAsSingleFqName = classIdMapKotlinToJava.asSingleFqName()) != null) {
            ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getSettings().getOwnerModuleDescriptor(), fqNameAsSingleFqName, NoLookupLocation.FROM_BUILTINS);
            if (classDescriptorResolveClassByFqName instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) classDescriptorResolveClassByFqName;
            }
        }
        return null;
    }

    private final JDKMemberStatus getJdkMethodStatus(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        final String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objDfs = DFS.dfs(CollectionsKt.listOf((ClassDescriptor) containingDeclaration), new DFS.Neighbors(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$8
            private final JvmBuiltInsCustomizer arg$0;

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return JvmBuiltInsCustomizer.getJdkMethodStatus$lambda$16(this.arg$0, (ClassDescriptor) obj);
            }

            {
                this.arg$0 = this;
            }
        }, new DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.getJdkMethodStatus.2
            /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(ClassDescriptor javaClassDescriptor) {
                Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
                String strSignature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaClassDescriptor, strComputeJvmDescriptor$default);
                JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                if (jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(strSignature)) {
                    objectRef.element = JDKMemberStatus.HIDDEN;
                } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(strSignature)) {
                    objectRef.element = JDKMemberStatus.VISIBLE;
                } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(strSignature)) {
                    objectRef.element = JDKMemberStatus.DEPRECATED_LIST_METHODS;
                } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                    objectRef.element = JDKMemberStatus.DROP;
                }
                return objectRef.element == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public JDKMemberStatus result() {
                JDKMemberStatus jDKMemberStatus = objectRef.element;
                return jDKMemberStatus == null ? JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objDfs, "dfs(...)");
        return (JDKMemberStatus) objDfs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getJdkMethodStatus$lambda$16(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, ClassDescriptor classDescriptor) {
        ClassifierDescriptor original;
        ClassDescriptor classDescriptor2;
        Collection<KotlinType> collectionMo105127getSupertypes = classDescriptor.getTypeConstructor().mo105127getSupertypes();
        Intrinsics.checkNotNullExpressionValue(collectionMo105127getSupertypes, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionMo105127getSupertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((KotlinType) it.next()).getConstructor().mo105126getDeclarationDescriptor();
            ClassDescriptor javaAnalogue = null;
            if (classifierDescriptorMo105126getDeclarationDescriptor != null) {
                original = classifierDescriptorMo105126getDeclarationDescriptor.getOriginal();
            } else {
                original = null;
            }
            if (original instanceof ClassDescriptor) {
                classDescriptor2 = (ClassDescriptor) original;
            } else {
                classDescriptor2 = null;
            }
            if (classDescriptor2 != null && (javaAnalogue = jvmBuiltInsCustomizer.getJavaAnalogue(classDescriptor2)) == null) {
                javaAnalogue = classDescriptor2;
            }
            if (javaAnalogue != null) {
                arrayList.add(javaAnalogue);
            }
        }
        return arrayList;
    }

    private final boolean isMutabilityViolation(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z11) {
        DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        if (z11 ^ JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, strComputeJvmDescriptor$default))) {
            return true;
        }
        Boolean boolIfAny = DFS.ifAny(CollectionsKt.listOf(simpleFunctionDescriptor), new DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$6
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public Iterable getNeighbors(Object obj) {
                return JvmBuiltInsCustomizer.isMutabilityViolation$lambda$13((CallableMemberDescriptor) obj);
            }
        }, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$7
            private final JvmBuiltInsCustomizer arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return JvmBuiltInsCustomizer.isMutabilityViolation$lambda$14(this.arg$0, (CallableMemberDescriptor) obj);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable isMutabilityViolation$lambda$13(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.getOriginal().getOverriddenDescriptors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Boolean isMutabilityViolation$lambda$14(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z11;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.j2kClassMapper;
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    private final boolean isTrivialCopyConstructorFor(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafe;
        if (constructorDescriptor.getValueParameters().size() == 1) {
            List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = ((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType().getConstructor().mo105126getDeclarationDescriptor();
            if (classifierDescriptorMo105126getDeclarationDescriptor != null) {
                fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo105126getDeclarationDescriptor);
            } else {
                fqNameUnsafe = null;
            }
            if (Intrinsics.areEqual(fqNameUnsafe, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
