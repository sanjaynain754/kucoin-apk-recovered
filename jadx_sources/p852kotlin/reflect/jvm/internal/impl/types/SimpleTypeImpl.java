package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import p852kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
final class SimpleTypeImpl extends SimpleType {

    @NotNull
    private final List<TypeProjection> arguments;

    @NotNull
    private final TypeConstructor constructor;
    private final boolean isMarkedNullable;

    @NotNull
    private final MemberScope memberScope;

    @NotNull
    private final Function1<KotlinTypeRefiner, SimpleType> refinedTypeFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTypeImpl(@NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z11, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        this.constructor = constructor;
        this.arguments = arguments;
        this.isMarkedNullable = z11;
        this.memberScope = memberScope;
        this.refinedTypeFactory = refinedTypeFactory;
        if (!(getMemberScope() instanceof ErrorScope) || (getMemberScope() instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + getMemberScope() + '\n' + getConstructor());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return this.arguments;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z11) {
        if (z11 == isMarkedNullable()) {
            return this;
        }
        return z11 ? new NullableSimpleType(this) : new NotNullSimpleType(this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new SimpleTypeWithAttributes(this, newAttributes);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public SimpleType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleTypeInvoke = this.refinedTypeFactory.invoke(kotlinTypeRefiner);
        return simpleTypeInvoke == null ? this : simpleTypeInvoke;
    }
}
