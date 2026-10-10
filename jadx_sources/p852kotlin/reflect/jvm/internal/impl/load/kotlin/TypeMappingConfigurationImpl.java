package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class TypeMappingConfigurationImpl implements TypeMappingConfiguration<JvmType> {

    @NotNull
    public static final TypeMappingConfigurationImpl INSTANCE = new TypeMappingConfigurationImpl();

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public JvmType getPredefinedTypeForClass(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public String getPredefinedFullInternalNameForClass(ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public String getPredefinedInternalNameForClass(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @Nullable
    public KotlinType preprocessType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    public void processErrorType(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    private TypeMappingConfigurationImpl() {
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration
    @NotNull
    public KotlinType commonSupertype(@NotNull Collection<? extends KotlinType> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.joinToString$default(types, null, null, null, 0, null, null, 63, null));
    }
}
