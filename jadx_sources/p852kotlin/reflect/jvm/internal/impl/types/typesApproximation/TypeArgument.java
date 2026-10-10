package p852kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes61.dex */
final class TypeArgument {

    @NotNull
    private final KotlinType inProjection;

    @NotNull
    private final KotlinType outProjection;

    @NotNull
    private final TypeParameterDescriptor typeParameter;

    @NotNull
    public final KotlinType getInProjection() {
        return this.inProjection;
    }

    @NotNull
    public final KotlinType getOutProjection() {
        return this.outProjection;
    }

    @NotNull
    public final TypeParameterDescriptor getTypeParameter() {
        return this.typeParameter;
    }

    public final boolean isConsistent() {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(this.inProjection, this.outProjection);
    }

    public TypeArgument(@NotNull TypeParameterDescriptor typeParameter, @NotNull KotlinType inProjection, @NotNull KotlinType outProjection) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(inProjection, "inProjection");
        Intrinsics.checkNotNullParameter(outProjection, "outProjection");
        this.typeParameter = typeParameter;
        this.inProjection = inProjection;
        this.outProjection = outProjection;
    }
}
