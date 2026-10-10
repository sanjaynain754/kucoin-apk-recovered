package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nBuiltInsLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1617#2,9:94\n1869#2:103\n1870#2:106\n1626#2:107\n1#3:104\n1#3:105\n*S KotlinDebug\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n*L\n57#1:94,9\n57#1:103\n57#1:106\n57#1:107\n57#1:105\n*E\n"})
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    @NotNull
    private final BuiltInsResourceLoader resourceLoader = new BuiltInsResourceLoader();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsLoaderImpl$createPackageFragmentProvider$1 */
    /* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
    public static final /* synthetic */ class C414211 extends FunctionReferenceImpl implements Function1<String, InputStream> {
        @Override // p852kotlin.jvm.functions.Function1
        public final InputStream invoke(String p11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return ((BuiltInsResourceLoader) this.receiver).loadResource(p11);
        }

        public C414211(Object obj) {
            super(1, obj, BuiltInsResourceLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }
    }

    @NotNull
    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Set<FqName> packageFqNames, @NotNull Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z11, @NotNull Function1<? super String, ? extends InputStream> loadResource) {
        BuiltInsPackageFragmentImpl builtInsPackageFragmentImplCreate;
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor module = moduleDescriptor;
        Intrinsics.checkNotNullParameter(storageManager2, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(packageFqNames, "packageFqNames");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(loadResource, "loadResource");
        ArrayList arrayList = new ArrayList();
        for (FqName fqName : packageFqNames) {
            InputStream inputStreamInvoke = loadResource.invoke(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
            if (inputStreamInvoke != null) {
                ModuleDescriptor moduleDescriptor2 = module;
                builtInsPackageFragmentImplCreate = BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, moduleDescriptor2, inputStreamInvoke, z11);
                storageManager2 = storageManager;
                module = moduleDescriptor2;
            } else {
                builtInsPackageFragmentImplCreate = null;
            }
            if (builtInsPackageFragmentImplCreate != null) {
                arrayList.add(builtInsPackageFragmentImplCreate);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager2, module);
        DeserializationConfiguration.Default r11 = DeserializationConfiguration.Default.INSTANCE;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(module, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r12 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter DO_NOTHING = ErrorReporter.DO_NOTHING;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager2, moduleDescriptor, r11, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, r12, DO_NOTHING, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, classDescriptorFactories, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), null, new SamConversionResolverImpl(storageManager2, CollectionsKt.emptyList()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    @NotNull
    public PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor builtInsModule, @NotNull Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z11) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtInsModule, "builtInsModule");
        Intrinsics.checkNotNullParameter(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        return createBuiltInPackageFragmentProvider(storageManager, builtInsModule, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z11, new C414211(this.resourceLoader));
    }
}
