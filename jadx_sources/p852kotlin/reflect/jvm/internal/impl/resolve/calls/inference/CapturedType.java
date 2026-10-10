package p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    @NotNull
    private final TypeAttributes attributes;

    @NotNull
    private final CapturedTypeConstructor constructor;
    private final boolean isMarkedNullable;

    @NotNull
    private final TypeProjection typeProjection;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z11, TypeAttributes typeAttributes, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i11 & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public CapturedTypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new CapturedType(this.typeProjection, getConstructor(), isMarkedNullable(), newAttributes);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.typeProjection);
        sb2.append(')');
        sb2.append(isMarkedNullable() ? "?" : "");
        return sb2.toString();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public CapturedType makeNullableAsSpecified(boolean z11) {
        return z11 == isMarkedNullable() ? this : new CapturedType(this.typeProjection, getConstructor(), z11, getAttributes());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public CapturedType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = this.typeProjection.refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeProjectionRefine, "refine(...)");
        return new CapturedType(typeProjectionRefine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    public CapturedType(@NotNull TypeProjection typeProjection, @NotNull CapturedTypeConstructor constructor, boolean z11, @NotNull TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.typeProjection = typeProjection;
        this.constructor = constructor;
        this.isMarkedNullable = z11;
        this.attributes = attributes;
    }
}
