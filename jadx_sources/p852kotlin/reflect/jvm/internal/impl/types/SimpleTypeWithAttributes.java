package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {

    @NotNull
    private final TypeAttributes attributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(@NotNull SimpleType delegate, @NotNull TypeAttributes attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.attributes = attributes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleTypeWithAttributes replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new SimpleTypeWithAttributes(delegate, getAttributes());
    }
}
