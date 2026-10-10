package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: dynamicTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {

    @NotNull
    private final TypeAttributes attributes;

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public DynamicType makeNullableAsSpecified(boolean z11) {
        return this;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public DynamicType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicType(@NotNull KotlinBuiltIns builtIns, @NotNull TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        SimpleType nothingType = builtIns.getNothingType();
        Intrinsics.checkNotNullExpressionValue(nothingType, "getNothingType(...)");
        SimpleType nullableAnyType = builtIns.getNullableAnyType();
        Intrinsics.checkNotNullExpressionValue(nullableAnyType, "getNullableAnyType(...)");
        super(nothingType, nullableAnyType);
        this.attributes = attributes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer renderer, @NotNull DescriptorRendererOptions options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return "dynamic";
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public DynamicType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new DynamicType(TypeUtilsKt.getBuiltIns(getDelegate()), newAttributes);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return getUpperBound();
    }
}
