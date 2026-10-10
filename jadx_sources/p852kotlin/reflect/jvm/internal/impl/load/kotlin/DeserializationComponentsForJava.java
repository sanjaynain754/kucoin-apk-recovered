package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import p852kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DeserializationComponentsForJava {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DeserializationComponents components;

    /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
        public static final class ModuleData {

            @NotNull
            private final DeserializationComponentsForJava deserializationComponentsForJava;

            @NotNull
            private final DeserializedDescriptorResolver deserializedDescriptorResolver;

            public ModuleData(@NotNull DeserializationComponentsForJava deserializationComponentsForJava, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver) {
                Intrinsics.checkNotNullParameter(deserializationComponentsForJava, "deserializationComponentsForJava");
                Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.deserializationComponentsForJava = deserializationComponentsForJava;
                this.deserializedDescriptorResolver = deserializedDescriptorResolver;
            }

            @NotNull
            public final DeserializationComponentsForJava getDeserializationComponentsForJava() {
                return this.deserializationComponentsForJava;
            }

            @NotNull
            public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
                return this.deserializedDescriptorResolver;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ModuleData createModuleData(@NotNull KotlinClassFinder kotlinClassFinder, @NotNull KotlinClassFinder jvmBuiltInsKotlinClassFinder, @NotNull JavaClassFinder javaClassFinder, @NotNull String moduleName, @NotNull ErrorReporter errorReporter, @NotNull JavaSourceElementFactory javaSourceElementFactory) {
            Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
            Intrinsics.checkNotNullParameter(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            Name nameSpecial = Name.special(Typography.less + moduleName + Typography.greater);
            Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(nameSpecial, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.setBuiltInsModule(moduleDescriptorImpl);
            jvmBuiltIns.initialize(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderMakeLazyJavaPackageFragmentProvider = DeserializationComponentsForJavaKt.makeLazyJavaPackageFragmentProvider(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, singleModuleClassResolver, (512 & 512) != 0 ? PackagePartProvider.Empty.INSTANCE : null);
            DeserializationComponentsForJava deserializationComponentsForJavaMakeDeserializationComponentsForJava = DeserializationComponentsForJavaKt.makeDeserializationComponentsForJava(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderMakeLazyJavaPackageFragmentProvider, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, MetadataVersion.INSTANCE);
            deserializedDescriptorResolver.setComponents(deserializationComponentsForJavaMakeDeserializationComponentsForJava);
            JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProviderMakeLazyJavaPackageFragmentProvider, EMPTY);
            singleModuleClassResolver.setResolver(javaDescriptorResolver);
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, jvmBuiltInsKotlinClassFinder, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.getCustomizer(), jvmBuiltIns.getCustomizer(), DeserializationConfiguration.Default.INSTANCE, NewKotlinTypeChecker.Companion.getDefault(), new SamConversionResolverImpl(lockBasedStorageManager, CollectionsKt.emptyList()));
            moduleDescriptorImpl.setDependencies(moduleDescriptorImpl);
            moduleDescriptorImpl.initialize(new CompositePackageFragmentProvider(CollectionsKt.listOf((Object[]) new PackageFragmentProviderOptimized[]{javaDescriptorResolver.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider}), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new ModuleData(deserializationComponentsForJavaMakeDeserializationComponentsForJava, deserializedDescriptorResolver);
        }
    }

    public DeserializationComponentsForJava(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull DeserializationConfiguration configuration, @NotNull JavaClassDataFinder classDataFinder, @NotNull BinaryClassAnnotationAndConstantLoaderImpl annotationAndConstantLoader, @NotNull LazyJavaPackageFragmentProvider packageFragmentProvider, @NotNull NotFoundClasses notFoundClasses, @NotNull ErrorReporter errorReporter, @NotNull LookupTracker lookupTracker, @NotNull ContractDeserializer contractDeserializer, @NotNull NewKotlinTypeChecker kotlinTypeChecker, @NotNull TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter customizer;
        AdditionalClassPartsProvider customizer2;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        KotlinBuiltIns builtIns = moduleDescriptor.getBuiltIns();
        JvmBuiltIns jvmBuiltIns = builtIns instanceof JvmBuiltIns ? (JvmBuiltIns) builtIns : null;
        this.components = new DeserializationComponents(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, LocalClassifierTypeSettings.Default.INSTANCE, errorReporter, lookupTracker, JavaFlexibleTypeDeserializer.INSTANCE, CollectionsKt.emptyList(), notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (customizer2 = jvmBuiltIns.getCustomizer()) == null) ? AdditionalClassPartsProvider.None.INSTANCE : customizer2, (jvmBuiltIns == null || (customizer = jvmBuiltIns.getCustomizer()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : customizer, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY(), kotlinTypeChecker, new SamConversionResolverImpl(storageManager, CollectionsKt.emptyList()), typeAttributeTranslators.getTranslators(), JvmEnumEntriesDeserializationSupport.INSTANCE);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.components;
    }
}
