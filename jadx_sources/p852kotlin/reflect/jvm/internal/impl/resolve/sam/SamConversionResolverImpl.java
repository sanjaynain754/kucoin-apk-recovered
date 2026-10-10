package p852kotlin.reflect.jvm.internal.impl.resolve.sam;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: SamConversionResolverImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nSamConversionResolverImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SamConversionResolverImpl.kt\norg/jetbrains/kotlin/resolve/sam/SamConversionResolverImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n1761#2,3:181\n*S KotlinDebug\n*F\n+ 1 SamConversionResolverImpl.kt\norg/jetbrains/kotlin/resolve/sam/SamConversionResolverImpl\n*L\n39#1:181,3\n*E\n"})
public final class SamConversionResolverImpl implements SamConversionResolver {

    @NotNull
    private final CacheWithNullableValues<ClassDescriptor, SimpleType> functionTypesForSamInterfaces;

    @NotNull
    private final Iterable<Object> samWithReceiverResolvers;

    public SamConversionResolverImpl(@NotNull StorageManager storageManager, @NotNull Iterable<? extends Object> samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.samWithReceiverResolvers = samWithReceiverResolvers;
        this.functionTypesForSamInterfaces = storageManager.createCacheWithNullableValues();
    }
}
