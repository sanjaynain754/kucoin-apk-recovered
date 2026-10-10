package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.checker.StrictEqualityTypeChecker;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class KotlinType implements Annotated, KotlinTypeMarker {
    private int cachedHashCode;

    public /* synthetic */ KotlinType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KotlinType)) {
            return false;
        }
        KotlinType kotlinType = (KotlinType) obj;
        return isMarkedNullable() == kotlinType.isMarkedNullable() && StrictEqualityTypeChecker.INSTANCE.strictEqualTypes(unwrap(), kotlinType.unwrap());
    }

    @NotNull
    public abstract List<TypeProjection> getArguments();

    @NotNull
    public abstract TypeAttributes getAttributes();

    @NotNull
    public abstract TypeConstructor getConstructor();

    @NotNull
    public abstract MemberScope getMemberScope();

    public abstract boolean isMarkedNullable();

    @NotNull
    public abstract KotlinType refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @NotNull
    public abstract UnwrappedType unwrap();

    private KotlinType() {
    }

    public final int hashCode() {
        int i11 = this.cachedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int iComputeHashCode = computeHashCode();
        this.cachedHashCode = iComputeHashCode;
        return iComputeHashCode;
    }

    private final int computeHashCode() {
        if (KotlinTypeKt.isError(this)) {
            return super.hashCode();
        }
        return (((getConstructor().hashCode() * 31) + getArguments().hashCode()) * 31) + (isMarkedNullable() ? 1 : 0);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return AnnotationsTypeAttributeKt.getAnnotations(getAttributes());
    }
}
