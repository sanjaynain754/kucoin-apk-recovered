package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class BinaryClassAnnotationAndConstantLoaderImplKt {
    @NotNull
    public static final BinaryClassAnnotationAndConstantLoaderImpl createBinaryClassAnnotationAndConstantLoader(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull MetadataVersion metadataVersion) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(module, notFoundClasses, storageManager, kotlinClassFinder);
        binaryClassAnnotationAndConstantLoaderImpl.setMetadataVersion(metadataVersion);
        return binaryClassAnnotationAndConstantLoaderImpl;
    }
}
