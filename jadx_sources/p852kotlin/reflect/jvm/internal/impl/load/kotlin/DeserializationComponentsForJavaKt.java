package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.KotlinVersion;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p852kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import p852kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

/* JADX INFO: compiled from: DeserializationComponentsForJava.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DeserializationComponentsForJavaKt {
    @NotNull
    public static final DeserializationComponentsForJava makeDeserializationComponentsForJava(@NotNull ModuleDescriptor module, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, @NotNull KotlinClassFinder reflectKotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ErrorReporter errorReporter, @NotNull MetadataVersion metadataVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new DeserializationComponentsForJava(storageManager, module, DeserializationConfiguration.Default.INSTANCE, new JavaClassDataFinder(reflectKotlinClassFinder, deserializedDescriptorResolver), BinaryClassAnnotationAndConstantLoaderImplKt.createBinaryClassAnnotationAndConstantLoader(module, notFoundClasses, storageManager, reflectKotlinClassFinder, metadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT(), NewKotlinTypeChecker.Companion.getDefault(), new TypeAttributeTranslators(CollectionsKt.listOf(DefaultTypeAttributeTranslator.INSTANCE)));
    }

    @NotNull
    public static final LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider(@NotNull JavaClassFinder javaClassFinder, @NotNull ModuleDescriptor module, @NotNull StorageManager storageManager, @NotNull NotFoundClasses notFoundClasses, @NotNull KotlinClassFinder reflectKotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull ErrorReporter errorReporter, @NotNull JavaSourceElementFactory javaSourceElementFactory, @NotNull ModuleClassResolver singleModuleClassResolver, @NotNull PackagePartProvider packagePartProvider) {
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        JavaTypeEnhancementState javaTypeEnhancementState = JavaTypeEnhancementState.Companion.getDefault(new KotlinVersion(1, 9));
        SignaturePropagator DO_NOTHING = SignaturePropagator.DO_NOTHING;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(storageManager, CollectionsKt.emptyList());
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.INSTANCE;
        ReflectionTypes reflectionTypes = new ReflectionTypes(module, notFoundClasses);
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(javaTypeEnhancementState);
        JavaResolverSettings.Default r11 = JavaResolverSettings.Default.INSTANCE;
        return new LazyJavaPackageFragmentProvider(new JavaResolverComponents(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, doNothing, samConversionResolverImpl, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, empty, do_nothing, module, reflectionTypes, annotationTypeQualifierResolver, new SignatureEnhancement(new JavaTypeEnhancement(r11)), JavaClassesTracker.Default.INSTANCE, r11, NewKotlinTypeChecker.Companion.getDefault(), javaTypeEnhancementState, new JavaModuleAnnotationsProvider() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1
            @Override // p852kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider
            public List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(ClassId classId) {
                Intrinsics.checkNotNullParameter(classId, "classId");
                return null;
            }
        }, null, 8388608, null));
    }
}
