package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: DeserializedAnnotations.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NonEmptyDeserializedAnnotations extends DeserializedAnnotations {
    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations, p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonEmptyDeserializedAnnotations(@NotNull StorageManager storageManager, @NotNull Function0<? extends List<? extends AnnotationDescriptor>> compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }
}
