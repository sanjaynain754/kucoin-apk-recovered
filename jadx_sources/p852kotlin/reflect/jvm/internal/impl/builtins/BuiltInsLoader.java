package p852kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p852kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: BuiltInsLoader.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface BuiltInsLoader {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: BuiltInsLoader.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Lazy<BuiltInsLoader> Instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0() { // from class: kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader$Companion$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return BuiltInsLoader.Companion.Instance_delegate$lambda$0();
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final BuiltInsLoader Instance_delegate$lambda$0() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
            Intrinsics.checkNotNull(serviceLoaderLoad);
            BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt.firstOrNull(serviceLoaderLoad);
            if (builtInsLoader != null) {
                return builtInsLoader;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        @NotNull
        public final BuiltInsLoader getInstance() {
            return Instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    @NotNull
    PackageFragmentProvider createPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Iterable<? extends ClassDescriptorFactory> iterable, @NotNull PlatformDependentDeclarationFilter platformDependentDeclarationFilter, @NotNull AdditionalClassPartsProvider additionalClassPartsProvider, boolean z11);
}
