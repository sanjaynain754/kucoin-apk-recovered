package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.PreReleaseInfo;

/* JADX INFO: compiled from: KotlinJvmBinarySourceElement.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    @NotNull
    private final DeserializedContainerAbiStability abiStability;

    @NotNull
    private final KotlinJvmBinaryClass binaryClass;

    @Nullable
    private final IncompatibleVersionErrorData<MetadataVersion> incompatibility;

    @NotNull
    private final PreReleaseInfo preReleaseInfo;

    public KotlinJvmBinarySourceElement(@NotNull KotlinJvmBinaryClass binaryClass, @Nullable IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, @NotNull PreReleaseInfo preReleaseInfo, @NotNull DeserializedContainerAbiStability abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(preReleaseInfo, "preReleaseInfo");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.binaryClass = binaryClass;
        this.incompatibility = incompatibleVersionErrorData;
        this.preReleaseInfo = preReleaseInfo;
        this.abiStability = abiStability;
    }

    @NotNull
    public final KotlinJvmBinaryClass getBinaryClass() {
        return this.binaryClass;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class '" + this.binaryClass.getClassId().asSingleFqName().asString() + '\'';
    }

    @NotNull
    public String toString() {
        return KotlinJvmBinarySourceElement.class.getSimpleName() + ": " + this.binaryClass;
    }
}
