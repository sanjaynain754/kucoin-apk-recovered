package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class PossiblyInnerType {

    @NotNull
    private final List<TypeProjection> arguments;

    @NotNull
    private final ClassifierDescriptorWithTypeParameters classifierDescriptor;

    @Nullable
    private final PossiblyInnerType outerType;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptor, @NotNull List<? extends TypeProjection> arguments, @Nullable PossiblyInnerType possiblyInnerType) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifierDescriptor = classifierDescriptor;
        this.arguments = arguments;
        this.outerType = possiblyInnerType;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.classifierDescriptor;
    }

    @Nullable
    public final PossiblyInnerType getOuterType() {
        return this.outerType;
    }
}
