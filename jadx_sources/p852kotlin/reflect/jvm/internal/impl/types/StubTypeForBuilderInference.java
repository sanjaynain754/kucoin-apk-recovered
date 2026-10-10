package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;

/* JADX INFO: compiled from: StubTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    @NotNull
    private final TypeConstructor constructor;

    @NotNull
    private final MemberScope memberScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(@NotNull NewTypeVariableConstructor originalTypeVariable, boolean z11, @NotNull TypeConstructor constructor) {
        super(originalTypeVariable, z11);
        Intrinsics.checkNotNullParameter(originalTypeVariable, "originalTypeVariable");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        this.constructor = constructor;
        this.memberScope = originalTypeVariable.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeConstructor getConstructor() {
        return this.constructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractStubType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    @NotNull
    public AbstractStubType materialize(boolean z11) {
        return new StubTypeForBuilderInference(getOriginalTypeVariable(), z11, getConstructor());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.SimpleType
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(getOriginalTypeVariable());
        sb2.append(isMarkedNullable() ? "?" : "");
        return sb2.toString();
    }
}
