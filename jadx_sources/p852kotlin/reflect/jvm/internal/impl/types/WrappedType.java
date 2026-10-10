package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    @NotNull
    public abstract KotlinType getDelegate();

    public boolean isComputed() {
        return true;
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

    @NotNull
    public String toString() {
        if (isComputed()) {
            return getDelegate().toString();
        }
        return "<Not computed yet>";
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public final UnwrappedType unwrap() {
        KotlinType delegate = getDelegate();
        while (delegate instanceof WrappedType) {
            delegate = ((WrappedType) delegate).getDelegate();
        }
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) delegate;
    }
}
