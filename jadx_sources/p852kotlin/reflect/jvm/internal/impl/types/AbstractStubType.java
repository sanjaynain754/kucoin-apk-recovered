package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: StubTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractStubType extends SimpleType {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isMarkedNullable;

    @NotNull
    private final MemberScope memberScope;

    @NotNull
    private final NewTypeVariableConstructor originalTypeVariable;

    /* JADX INFO: compiled from: StubTypes.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public abstract AbstractStubType materialize(boolean z11);

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public AbstractStubType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType replaceAttributes(@NotNull TypeAttributes newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return this;
    }

    public AbstractStubType(@NotNull NewTypeVariableConstructor originalTypeVariable, boolean z11) {
        Intrinsics.checkNotNullParameter(originalTypeVariable, "originalTypeVariable");
        this.originalTypeVariable = originalTypeVariable;
        this.isMarkedNullable = z11;
        this.memberScope = ErrorUtils.createErrorScope(ErrorScopeKind.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public MemberScope getMemberScope() {
        return this.memberScope;
    }

    @NotNull
    public final NewTypeVariableConstructor getOriginalTypeVariable() {
        return this.originalTypeVariable;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    @NotNull
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 == isMarkedNullable() ? this : materialize(z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public List<TypeProjection> getArguments() {
        return CollectionsKt.emptyList();
    }
}
