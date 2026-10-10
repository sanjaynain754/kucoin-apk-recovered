package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: compiled from: expandedTypeUtils.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ExpandedTypeUtilsKt {
    @Nullable
    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker inlineClassType) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return computeExpandedTypeInner(typeSystemCommonBackendContext, inlineClassType, new HashSet());
    }

    private static final KotlinTypeMarker computeExpandedTypeInner(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet<TypeConstructorMarker> hashSet) {
        KotlinTypeMarker kotlinTypeMarkerComputeExpandedTypeInner;
        boolean z11;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (!hashSet.add(typeConstructorMarkerTypeConstructor)) {
            return null;
        }
        TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        if (typeParameterClassifier != null) {
            KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            KotlinTypeMarker kotlinTypeMarkerComputeExpandedTypeInner2 = computeExpandedTypeInner(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (kotlinTypeMarkerComputeExpandedTypeInner2 == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) && (!(representativeUpperBound instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) representativeUpperBound))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if ((kotlinTypeMarkerComputeExpandedTypeInner2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerComputeExpandedTypeInner2) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && z11) {
                return typeSystemCommonBackendContext.makeNullable(representativeUpperBound);
            }
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerComputeExpandedTypeInner2) && typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) {
                return typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerComputeExpandedTypeInner2);
            }
            return kotlinTypeMarkerComputeExpandedTypeInner2;
        }
        if (typeSystemCommonBackendContext.isInlineClass(typeConstructorMarkerTypeConstructor)) {
            KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
            if (unsubstitutedUnderlyingType == null || (kotlinTypeMarkerComputeExpandedTypeInner = computeExpandedTypeInner(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, hashSet)) == null) {
                return null;
            }
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
                return kotlinTypeMarkerComputeExpandedTypeInner;
            }
            if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerComputeExpandedTypeInner) && (!(kotlinTypeMarkerComputeExpandedTypeInner instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerComputeExpandedTypeInner))) {
                return typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerComputeExpandedTypeInner);
            }
        }
        return kotlinTypeMarker;
    }
}
