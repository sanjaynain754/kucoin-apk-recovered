package p852kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p852kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import p852kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: compiled from: NewKotlinTypeChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class SimpleClassicTypeSystemContext implements ClassicTypeSystemContext {

    @NotNull
    public static final SimpleClassicTypeSystemContext INSTANCE = new SimpleClassicTypeSystemContext();

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public SimpleType captureFromArguments(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull CaptureStatus captureStatus) {
        return ClassicTypeSystemContext.DefaultImpls.captureFromArguments(this, rigidTypeMarker, captureStatus);
    }

    public boolean default$isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerAsRigidType = asRigidType(kotlinTypeMarker);
        return (rigidTypeMarkerAsRigidType != null ? asDefinitelyNotNullType(rigidTypeMarkerAsRigidType) : null) != null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeVariance getVariance(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeArgumentMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDefinitelyNotNullType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$isDefinitelyNotNullType(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$makeDefinitelyNotNullOrNotNull(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public CapturedTypeConstructorMarker typeConstructor(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.typeConstructor((ClassicTypeSystemContext) this, capturedTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker withNullability(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z11) {
        return ClassicTypeSystemContext.DefaultImpls.withNullability(this, kotlinTypeMarker, z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public SimpleTypeMarker asRigidType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asRigidType(this, kotlinTypeMarker);
    }

    @Nullable
    public CapturedTypeMarker default$asCapturedTypeUnwrappingDnn(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return asCapturedType(originalIfDefinitelyNotNullable(rigidTypeMarker));
    }

    @Nullable
    public List<SimpleTypeMarker> default$fastCorrespondingSupertypes(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker constructor) {
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return null;
    }

    @NotNull
    public TypeArgumentMarker default$get(TypeArgumentListMarker typeArgumentListMarker, int i11) {
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return getArgument((KotlinTypeMarker) typeArgumentListMarker, i11);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i11);
            Intrinsics.checkNotNullExpressionValue(typeArgumentMarker, "get(...)");
            return typeArgumentMarker;
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
    }

    @Nullable
    public TypeArgumentMarker default$getArgumentOrNull(RigidTypeMarker rigidTypeMarker, int i11) {
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        if (i11 < 0 || i11 >= argumentsCount(rigidTypeMarker)) {
            return null;
        }
        return getArgument(rigidTypeMarker, i11);
    }

    public boolean default$hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return isMarkedNullable(lowerBoundIfFlexible(kotlinTypeMarker)) != isMarkedNullable(upperBoundIfFlexible(kotlinTypeMarker));
    }

    public boolean default$isCapturedType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerAsRigidType = asRigidType(kotlinTypeMarker);
        return (rigidTypeMarkerAsRigidType != null ? asCapturedTypeUnwrappingDnn(rigidTypeMarkerAsRigidType) : null) != null;
    }

    public boolean default$isClassType(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return isClassTypeConstructor(typeConstructor(rigidTypeMarker));
    }

    public boolean default$isDefinitelyNotNullType(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return asDefinitelyNotNullType(rigidTypeMarker) != null;
    }

    public boolean default$isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = asFlexibleType(kotlinTypeMarker);
        return (flexibleTypeMarkerAsFlexibleType != null ? asDynamicType(flexibleTypeMarkerAsFlexibleType) : null) != null;
    }

    public boolean default$isFlexible(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return asFlexibleType(kotlinTypeMarker) != null;
    }

    public boolean default$isFlexibleWithDifferentTypeConstructors(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return !Intrinsics.areEqual(typeConstructor(lowerBoundIfFlexible(kotlinTypeMarker)), typeConstructor(upperBoundIfFlexible(kotlinTypeMarker)));
    }

    public boolean default$isIntegerLiteralType(RigidTypeMarker rigidTypeMarker) {
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        return isIntegerLiteralTypeConstructor(typeConstructor(rigidTypeMarker));
    }

    public boolean default$isNothing(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return isNothingConstructor(typeConstructor(kotlinTypeMarker)) && !isNullableType(kotlinTypeMarker);
    }

    @NotNull
    public RigidTypeMarker default$lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerLowerBound;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (flexibleTypeMarkerAsFlexibleType != null && (rigidTypeMarkerLowerBound = lowerBound(flexibleTypeMarkerAsFlexibleType)) != null) {
            return rigidTypeMarkerLowerBound;
        }
        RigidTypeMarker rigidTypeMarkerAsRigidType = asRigidType(kotlinTypeMarker);
        Intrinsics.checkNotNull(rigidTypeMarkerAsRigidType);
        return rigidTypeMarkerAsRigidType;
    }

    @NotNull
    public KotlinTypeMarker default$makeDefinitelyNotNullOrNotNull(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return makeDefinitelyNotNullOrNotNull(kotlinTypeMarker, false);
    }

    @NotNull
    public KotlinTypeMarker default$makeNullable(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerWithNullability;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerAsRigidType = asRigidType(kotlinTypeMarker);
        return (rigidTypeMarkerAsRigidType == null || (rigidTypeMarkerWithNullability = withNullability(rigidTypeMarkerAsRigidType, true)) == null) ? kotlinTypeMarker : rigidTypeMarkerWithNullability;
    }

    @NotNull
    public SimpleTypeMarker default$originalIfDefinitelyNotNullable(RigidTypeMarker rigidTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerOriginal;
        Intrinsics.checkNotNullParameter(rigidTypeMarker, "<this>");
        DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerAsDefinitelyNotNullType = asDefinitelyNotNullType(rigidTypeMarker);
        return (definitelyNotNullTypeMarkerAsDefinitelyNotNullType == null || (simpleTypeMarkerOriginal = original(definitelyNotNullTypeMarkerAsDefinitelyNotNullType)) == null) ? (SimpleTypeMarker) rigidTypeMarker : simpleTypeMarkerOriginal;
    }

    public int default$size(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof RigidTypeMarker) {
            return argumentsCount((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
    }

    @NotNull
    public TypeConstructorMarker default$typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        RigidTypeMarker rigidTypeMarkerAsRigidType = asRigidType(kotlinTypeMarker);
        if (rigidTypeMarkerAsRigidType == null) {
            rigidTypeMarkerAsRigidType = lowerBoundIfFlexible(kotlinTypeMarker);
        }
        return typeConstructor(rigidTypeMarkerAsRigidType);
    }

    @NotNull
    public RigidTypeMarker default$upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        RigidTypeMarker rigidTypeMarkerUpperBound;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (flexibleTypeMarkerAsFlexibleType != null && (rigidTypeMarkerUpperBound = upperBound(flexibleTypeMarkerAsFlexibleType)) != null) {
            return rigidTypeMarkerUpperBound;
        }
        RigidTypeMarker rigidTypeMarkerAsRigidType = asRigidType(kotlinTypeMarker);
        Intrinsics.checkNotNull(rigidTypeMarkerAsRigidType);
        return rigidTypeMarkerAsRigidType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeVariance getVariance(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeParameterMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDefinitelyNotNullType(@NotNull RigidTypeMarker rigidTypeMarker) {
        return default$isDefinitelyNotNullType(rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.lowerBound(this, flexibleTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z11) {
        return ClassicTypeSystemContext.DefaultImpls.makeDefinitelyNotNullOrNotNull(this, kotlinTypeMarker, z11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeConstructorMarker typeConstructor(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$typeConstructor(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.upperBound(this, flexibleTypeMarker);
    }

    private SimpleClassicTypeSystemContext() {
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean areEqualTypeConstructors(@NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.areEqualTypeConstructors(this, typeConstructorMarker, typeConstructorMarker2);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int argumentsCount(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.argumentsCount(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentListMarker asArgumentList(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asArgumentList(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asCapturedType(this, simpleTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public CapturedTypeMarker asCapturedTypeUnwrappingDnn(@NotNull RigidTypeMarker rigidTypeMarker) {
        return default$asCapturedTypeUnwrappingDnn(rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asDefinitelyNotNullType(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public DynamicTypeMarker asDynamicType(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asDynamicType(this, flexibleTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public FlexibleTypeMarker asFlexibleType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asFlexibleType(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker asTypeArgument(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asTypeArgument(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public CaptureStatus captureStatus(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.captureStatus(this, capturedTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    @NotNull
    public KotlinTypeMarker createFlexibleType(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.createFlexibleType(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public List<SimpleTypeMarker> fastCorrespondingSupertypes(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull TypeConstructorMarker typeConstructorMarker) {
        return default$fastCorrespondingSupertypes(rigidTypeMarker, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker get(@NotNull TypeArgumentListMarker typeArgumentListMarker, int i11) {
        return default$get(typeArgumentListMarker, i11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker getArgument(@NotNull KotlinTypeMarker kotlinTypeMarker, int i11) {
        return ClassicTypeSystemContext.DefaultImpls.getArgument(this, kotlinTypeMarker, i11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public TypeArgumentMarker getArgumentOrNull(@NotNull RigidTypeMarker rigidTypeMarker, int i11) {
        return default$getArgumentOrNull(rigidTypeMarker, i11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public List<TypeArgumentMarker> getArguments(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getArguments(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    public FqNameUnsafe getClassFqNameUnsafe(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getClassFqNameUnsafe(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeParameterMarker getParameter(@NotNull TypeConstructorMarker typeConstructorMarker, int i11) {
        return ClassicTypeSystemContext.DefaultImpls.getParameter(this, typeConstructorMarker, i11);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public List<TypeParameterMarker> getParameters(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getParameters(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    public PrimitiveType getPrimitiveArrayType(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getPrimitiveArrayType(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    public PrimitiveType getPrimitiveType(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getPrimitiveType(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    public KotlinTypeMarker getRepresentativeUpperBound(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getRepresentativeUpperBound(this, typeParameterMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public KotlinTypeMarker getType(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getType(this, typeArgumentMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public TypeParameterMarker getTypeParameter(@NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getTypeParameter(this, typeVariableTypeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public TypeParameterMarker getTypeParameterClassifier(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getTypeParameterClassifier(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    public KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getUnsubstitutedUnderlyingType(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public List<KotlinTypeMarker> getUpperBounds(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getUpperBounds(this, typeParameterMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean hasAnnotation(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
        return ClassicTypeSystemContext.DefaultImpls.hasAnnotation(this, kotlinTypeMarker, fqName);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean hasFlexibleNullability(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$hasFlexibleNullability(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean hasRecursiveBounds(@NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.hasRecursiveBounds(this, typeParameterMarker, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean identicalArguments(@NotNull RigidTypeMarker rigidTypeMarker, @NotNull RigidTypeMarker rigidTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.identicalArguments(this, rigidTypeMarker, rigidTypeMarker2);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker intersectTypes(@NotNull Collection<? extends KotlinTypeMarker> collection) {
        return ClassicTypeSystemContext.DefaultImpls.intersectTypes(this, collection);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isAnyConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isAnyConstructor(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCapturedType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$isCapturedType(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassType(@NotNull RigidTypeMarker rigidTypeMarker) {
        return default$isClassType(rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassTypeConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isClassTypeConstructor(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCommonFinalClassConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isCommonFinalClassConstructor(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDenotable(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isDenotable(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDynamic(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$isDynamic(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isError(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isError(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isFlexible(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$isFlexible(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isFlexibleWithDifferentTypeConstructors(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean isInlineClass(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isInlineClass(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralType(@NotNull RigidTypeMarker rigidTypeMarker) {
        return default$isIntegerLiteralType(rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralTypeConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isIntegerLiteralTypeConstructor(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntersection(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isIntersection(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext
    public boolean isK2() {
        return ClassicTypeSystemContext.DefaultImpls.isK2(this);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isMarkedNullable(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isMarkedNullable(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNotNullTypeParameter(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNotNullTypeParameter(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNothing(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$isNothing(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNothingConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNothingConstructor(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNullableType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNullableType(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isOldCapturedType(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isOldCapturedType(this, capturedTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isPrimitiveType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isPrimitiveType(this, simpleTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isProjectionNotNull(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isProjectionNotNull(this, capturedTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isRawType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isRawType(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isSingleClassifierType(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isSingleClassifierType(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStarProjection(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStarProjection(this, typeArgumentMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubType(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStubType(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubTypeForBuilderInference(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStubTypeForBuilderInference(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isTypeVariableType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isTypeVariableType(this, kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean isUnderKotlinPackage(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isUnderKotlinPackage(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public RigidTypeMarker lowerBoundIfFlexible(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$lowerBoundIfFlexible(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public KotlinTypeMarker lowerType(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.lowerType(this, capturedTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    public KotlinTypeMarker makeNullable(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$makeNullable(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeCheckerProviderContext
    @NotNull
    public TypeCheckerState newTypeCheckerState(boolean z11, boolean z12, boolean z13) {
        return ClassicTypeSystemContext.DefaultImpls.newTypeCheckerState(this, z11, z12, z13);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker original(@NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.original(this, definitelyNotNullTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker originalIfDefinitelyNotNullable(@NotNull RigidTypeMarker rigidTypeMarker) {
        return default$originalIfDefinitelyNotNullable(rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int parametersCount(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.parametersCount(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.possibleIntegerTypes(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker projection(@NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.projection(this, capturedTypeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int size(@NotNull TypeArgumentListMarker typeArgumentListMarker) {
        return default$size(typeArgumentListMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.substitutionSupertypePolicy(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public Collection<KotlinTypeMarker> supertypes(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.supertypes(this, typeConstructorMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeConstructorMarker typeConstructor(@NotNull RigidTypeMarker rigidTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.typeConstructor(this, rigidTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public RigidTypeMarker upperBoundIfFlexible(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return default$upperBoundIfFlexible(kotlinTypeMarker);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker withNullability(@NotNull RigidTypeMarker rigidTypeMarker, boolean z11) {
        return ClassicTypeSystemContext.DefaultImpls.withNullability((ClassicTypeSystemContext) this, rigidTypeMarker, z11);
    }
}
