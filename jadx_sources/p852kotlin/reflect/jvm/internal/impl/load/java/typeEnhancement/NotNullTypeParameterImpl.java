package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    @NotNull
    private final SimpleType delegate;

    private final SimpleType prepareReplacement(SimpleType simpleType) {
        SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(false);
        return !TypeUtilsKt.isTypeParameter(simpleType) ? simpleTypeMakeNullableAsSpecified : new NotNullTypeParameterImpl(simpleTypeMakeNullableAsSpecified);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean isTypeParameter() {
        return true;
    }

    public NotNullTypeParameterImpl(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public SimpleType getDelegate() {
        return this.delegate;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    @NotNull
    public NotNullTypeParameterImpl replaceDelegate(@NotNull SimpleType delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new NotNullTypeParameterImpl(delegate);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    @NotNull
    public KotlinType substitutionResult(@NotNull KotlinType replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        UnwrappedType unwrappedTypeUnwrap = replacement.unwrap();
        if (!TypeUtilsKt.isTypeParameter(unwrappedTypeUnwrap) && !TypeUtils.isNullableType(unwrappedTypeUnwrap)) {
            return unwrappedTypeUnwrap;
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return prepareReplacement((SimpleType) unwrappedTypeUnwrap);
        }
        if (!(unwrappedTypeUnwrap instanceof FlexibleType)) {
            throw new NoWhenBranchMatchedException();
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
        return TypeWithEnhancementKt.wrapEnhancement(KotlinTypeFactory.flexibleType(prepareReplacement(flexibleType.getLowerBound()), prepareReplacement(flexibleType.getUpperBound())), TypeWithEnhancementKt.getEnhancement(unwrappedTypeUnwrap));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public NotNullTypeParameterImpl replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(getDelegate().replaceAttributes(newAttributes));
    }
}
