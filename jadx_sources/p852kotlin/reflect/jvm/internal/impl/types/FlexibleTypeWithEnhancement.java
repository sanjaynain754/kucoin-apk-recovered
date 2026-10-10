package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class FlexibleTypeWithEnhancement extends FlexibleType implements TypeWithEnhancement {

    @NotNull
    private final KotlinType enhancement;

    @NotNull
    private final FlexibleType origin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(@NotNull FlexibleType origin, @NotNull KotlinType enhancement) {
        super(origin.getLowerBound(), origin.getUpperBound());
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.origin = origin;
        this.enhancement = enhancement;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    public KotlinType getEnhancement() {
        return this.enhancement;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    @NotNull
    public FlexibleType getOrigin() {
        return this.origin;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String render(@NotNull DescriptorRenderer renderer, @NotNull DescriptorRendererOptions options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        return options.getEnhancedTypes() ? renderer.renderType(getEnhancement()) : getOrigin().render(renderer, options);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAttributes(newAttributes), getEnhancement());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.FlexibleType
    @NotNull
    public SimpleType getDelegate() {
        return getOrigin().getDelegate();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public UnwrappedType makeNullableAsSpecified(boolean z11) {
        return TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z11), getEnhancement().unwrap().makeNullableAsSpecified(z11));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public FlexibleTypeWithEnhancement refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getOrigin());
        Intrinsics.checkNotNull(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new FlexibleTypeWithEnhancement((FlexibleType) kotlinTypeRefineType, kotlinTypeRefiner.refineType((KotlinTypeMarker) getEnhancement()));
    }
}
