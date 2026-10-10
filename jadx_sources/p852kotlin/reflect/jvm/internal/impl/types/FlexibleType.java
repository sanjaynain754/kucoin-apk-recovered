package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p852kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    @NotNull
    private final SimpleType lowerBound;

    @NotNull
    private final SimpleType upperBound;

    @NotNull
    public abstract SimpleType getDelegate();

    @NotNull
    public abstract String render(@NotNull DescriptorRenderer descriptorRenderer, @NotNull DescriptorRendererOptions descriptorRendererOptions);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        super(null);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @NotNull
    public final SimpleType getLowerBound() {
        return this.lowerBound;
    }

    @NotNull
    public final SimpleType getUpperBound() {
        return this.upperBound;
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }
}
