package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullableSimpleType(@NotNull SimpleType delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public NullableSimpleType replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new NullableSimpleType(delegate);
    }
}
