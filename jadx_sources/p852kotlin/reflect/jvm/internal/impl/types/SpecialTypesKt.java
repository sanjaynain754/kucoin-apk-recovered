package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;

/* JADX INFO: compiled from: SpecialTypes.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nSpecialTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n102#2,2:217\n104#2,6:222\n112#2,7:229\n1563#3:219\n1634#3,2:220\n1636#3:228\n*S KotlinDebug\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n*L\n214#1:217,2\n214#1:222,6\n214#1:229,7\n214#1:219\n214#1:220,2\n214#1:228\n*E\n"})
public final class SpecialTypesKt {
    @NotNull
    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(@NotNull UnwrappedType unwrappedType, boolean z11) {
        Intrinsics.checkNotNullParameter(unwrappedType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, unwrappedType, z11, false, 4, null);
        if (definitelyNotNullTypeMakeDefinitelyNotNull$default != null) {
            return definitelyNotNullTypeMakeDefinitelyNotNull$default;
        }
        SimpleType simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(unwrappedType);
        return simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull != null ? simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull : unwrappedType.makeNullableAsSpecified(false);
    }

    @Nullable
    public static final AbbreviatedType getAbbreviatedType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrappedTypeUnwrap;
        }
        return null;
    }

    @Nullable
    public static final SimpleType getAbbreviation(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        AbbreviatedType abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final boolean isDefinitelyNotNullType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DefinitelyNotNullType;
    }

    public static /* synthetic */ UnwrappedType makeDefinitelyNotNullOrNotNull$default(UnwrappedType unwrappedType, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return makeDefinitelyNotNullOrNotNull(unwrappedType, z11);
    }

    @NotNull
    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(@NotNull SimpleType simpleType, boolean z11) {
        Intrinsics.checkNotNullParameter(simpleType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType, z11, false, 4, null);
        if (definitelyNotNullTypeMakeDefinitelyNotNull$default != null) {
            return definitelyNotNullTypeMakeDefinitelyNotNull$default;
        }
        SimpleType simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(simpleType);
        return simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull == null ? simpleType.makeNullableAsSpecified(false) : simpleTypeMakeIntersectionTypeDefinitelyNotNullOrNotNull;
    }

    public static /* synthetic */ SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull$default(SimpleType simpleType, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, z11);
    }

    @NotNull
    public static final SimpleType withAbbreviation(@NotNull SimpleType simpleType, @NotNull SimpleType abbreviatedType) {
        Intrinsics.checkNotNullParameter(simpleType, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.isError(simpleType) ? simpleType : new AbbreviatedType(simpleType, abbreviatedType);
    }

    @NotNull
    public static final NewCapturedType withNotNullProjection(@NotNull NewCapturedType newCapturedType) {
        Intrinsics.checkNotNullParameter(newCapturedType, "<this>");
        return new NewCapturedType(newCapturedType.getCaptureStatus(), newCapturedType.getConstructor(), newCapturedType.getLowerType(), newCapturedType.getAttributes(), newCapturedType.isMarkedNullable(), true);
    }

    private static final SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        IntersectionTypeConstructor intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull;
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
        } else {
            intersectionTypeConstructor = null;
        }
        if (intersectionTypeConstructor == null || (intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull = makeDefinitelyNotNullOrNotNull(intersectionTypeConstructor)) == null) {
            return null;
        }
        return intersectionTypeConstructorMakeDefinitelyNotNullOrNotNull.createType();
    }

    private static final IntersectionTypeConstructor makeDefinitelyNotNullOrNotNull(IntersectionTypeConstructor intersectionTypeConstructor) {
        KotlinType kotlinType;
        Collection<KotlinType> collectionMo105127getSupertypes = intersectionTypeConstructor.mo105127getSupertypes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo105127getSupertypes, 10));
        Iterator<T> it = collectionMo105127getSupertypes.iterator();
        boolean z11 = false;
        while (true) {
            kotlinType = null;
            if (!it.hasNext()) {
                break;
            }
            KotlinType kotlinTypeMakeDefinitelyNotNullOrNotNull$default = (KotlinType) it.next();
            if (TypeUtils.isNullableType(kotlinTypeMakeDefinitelyNotNullOrNotNull$default)) {
                kotlinTypeMakeDefinitelyNotNullOrNotNull$default = makeDefinitelyNotNullOrNotNull$default(kotlinTypeMakeDefinitelyNotNullOrNotNull$default.unwrap(), false, 1, null);
                z11 = true;
            }
            arrayList.add(kotlinTypeMakeDefinitelyNotNullOrNotNull$default);
        }
        if (!z11) {
            return null;
        }
        KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
        if (alternativeType != null) {
            if (TypeUtils.isNullableType(alternativeType)) {
                alternativeType = makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null);
            }
            kotlinType = alternativeType;
        }
        return new IntersectionTypeConstructor(arrayList).setAlternative(kotlinType);
    }
}
