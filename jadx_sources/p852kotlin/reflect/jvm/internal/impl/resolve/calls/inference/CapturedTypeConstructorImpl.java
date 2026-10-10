package p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* JADX INFO: compiled from: CapturedTypeConstructor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    @Nullable
    private NewCapturedTypeConstructor newTypeConstructor;

    @NotNull
    private final TypeProjection projection;

    @Nullable
    public Void getDeclarationDescriptor() {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public CapturedTypeConstructorImpl(@NotNull TypeProjection projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.projection = projection;
        getProjection().getProjectionKind();
        Variance variance = Variance.INVARIANT;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo105126getDeclarationDescriptor() {
        return (ClassifierDescriptor) getDeclarationDescriptor();
    }

    @Nullable
    public final NewCapturedTypeConstructor getNewTypeConstructor() {
        return this.newTypeConstructor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    @NotNull
    public TypeProjection getProjection() {
        return this.projection;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public CapturedTypeConstructorImpl refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeProjectionRefine, "refine(...)");
        return new CapturedTypeConstructorImpl(typeProjectionRefine);
    }

    public final void setNewTypeConstructor(@Nullable NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.newTypeConstructor = newCapturedTypeConstructor;
    }

    @NotNull
    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + ')';
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = getProjection().getType().getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getSupertypes */
    public Collection<KotlinType> mo105127getSupertypes() {
        KotlinType nullableAnyType;
        if (getProjection().getProjectionKind() == Variance.OUT_VARIANCE) {
            nullableAnyType = getProjection().getType();
        } else {
            nullableAnyType = getBuiltIns().getNullableAnyType();
        }
        Intrinsics.checkNotNull(nullableAnyType);
        return CollectionsKt.listOf(nullableAnyType);
    }
}
