package p852kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p852kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmBuiltInsPackageFragmentProvider extends AbstractDeserializedPackageFragmentProvider {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder finder, @NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull DeserializationConfiguration deserializationConfiguration, @NotNull NewKotlinTypeChecker kotlinTypeChecker, @NotNull SamConversionResolver samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(this);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r11 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter DO_NOTHING = ErrorReporter.DO_NOTHING;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        setComponents(new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, deserializedClassDataFinder, annotationAndConstantLoaderImpl, this, r11, DO_NOTHING, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, CollectionsKt.listOf((Object[]) new ClassDescriptorFactory[]{new BuiltInFictitiousFunctionClassFactory(storageManager, moduleDescriptor), new JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)}), notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), kotlinTypeChecker, samConversionResolver, null, JvmEnumEntriesDeserializationSupport.INSTANCE, 262144, null));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    @Nullable
    public DeserializedPackageFragment findPackage(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InputStream inputStreamFindBuiltInsData = getFinder().findBuiltInsData(fqName);
        if (inputStreamFindBuiltInsData != null) {
            return BuiltInsPackageFragmentImpl.Companion.create(fqName, getStorageManager(), getModuleDescriptor(), inputStreamFindBuiltInsData, false);
        }
        return null;
    }
}
