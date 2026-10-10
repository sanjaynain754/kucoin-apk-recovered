package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class StarProjectionForAbsentTypeParameter extends TypeProjectionBase {

    @NotNull
    private final KotlinType nullableAnyType;

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeProjection
    public boolean isStarProjection() {
        return true;
    }

    public StarProjectionForAbsentTypeParameter(@NotNull KotlinBuiltIns kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        SimpleType nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
        this.nullableAnyType = nullableAnyType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public Variance getProjectionKind() {
        return Variance.OUT_VARIANCE;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        return this.nullableAnyType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
