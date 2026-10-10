package p852kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import p852kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p852kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p852kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 TypeSystemContext.kt\norg/jetbrains/kotlin/types/model/TypeSystemContextKt\n*L\n1#1,884:1\n1#2:885\n1#2:899\n1#2:951\n1#2:986\n140#3,13:886\n153#3,13:900\n54#3,8:924\n140#3,13:938\n153#3,13:952\n140#3,13:973\n153#3,13:987\n1634#4,3:913\n1563#4:916\n1634#4,3:917\n1563#4:920\n1634#4,3:921\n1740#4,3:932\n1740#4,3:935\n774#4:965\n865#4:966\n866#4:972\n1374#4:1000\n1460#4,5:1001\n1761#4,3:1006\n1761#4,3:1009\n635#5,5:967\n*S KotlinDebug\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/AbstractTypeChecker\n*L\n383#1:899\n671#1:951\n741#1:986\n383#1:886,13\n383#1:900,13\n527#1:924,8\n671#1:938,13\n671#1:952,13\n741#1:973,13\n741#1:987,13\n426#1:913,3\n429#1:916\n429#1:917,3\n442#1:920\n442#1:921,3\n609#1:932,3\n620#1:935,3\n716#1:965\n716#1:966\n716#1:972\n750#1:1000\n750#1:1001,5\n336#1:1006,3\n344#1:1009,3\n717#1:967,5\n*E\n"})
public final class AbstractTypeChecker {

    @NotNull
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();

    @JvmField
    public static boolean RUN_SLOW_ASSERTIONS;

    @JvmOverloads
    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return isSubtypeOf$default(this, state, subType, superType, false, 8, null);
    }

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: checkSubtypeForIntegerLiteralType$lambda$7$isCapturedIntegerLiteralType */
    private static final boolean m90294xef0f5f3b(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker type;
        RigidTypeMarker rigidTypeMarkerUpperBoundIfFlexible;
        return (rigidTypeMarker instanceof CapturedTypeMarker) && (type = typeSystemContext.getType(typeSystemContext.projection(typeSystemContext.typeConstructor((CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerUpperBoundIfFlexible = typeSystemContext.upperBoundIfFlexible(type)) != null && typeSystemContext.isIntegerLiteralType(rigidTypeMarkerUpperBoundIfFlexible);
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z11);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    private final boolean isSubtypeOfForSingleClassifierType(final TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, final RigidTypeMarker rigidTypeMarker2) {
        final Collection<RigidTypeMarker> arrayList;
        RigidTypeMarker rigidTypeMarkerAsRigidType;
        boolean z11;
        KotlinTypeMarker type;
        final TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(rigidTypeMarker))) {
                typeCheckerState.isAllowedTypeVariable(rigidTypeMarker);
            }
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker2)) {
                typeCheckerState.isAllowedTypeVariable(rigidTypeMarker2);
            }
        }
        boolean z12 = false;
        if (!AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(typeCheckerState, rigidTypeMarker, rigidTypeMarker2)) {
            return false;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        Boolean boolCheckSubtypeForIntegerLiteralType = abstractTypeChecker.checkSubtypeForIntegerLiteralType(typeCheckerState, rigidTypeMarker, rigidTypeMarker2);
        if (boolCheckSubtypeForIntegerLiteralType != null) {
            boolean zBooleanValue = boolCheckSubtypeForIntegerLiteralType.booleanValue();
            TypeCheckerState.addSubtypeConstraint$default(typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false, 4, null);
            return zBooleanValue;
        }
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(rigidTypeMarker2);
        boolean z13 = true;
        if ((typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarkerTypeConstructor) && typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor) == 0) || typeSystemContext.isAnyConstructor(typeSystemContext.typeConstructor(rigidTypeMarker2))) {
            return true;
        }
        List<RigidTypeMarker> listFindCorrespondingSupertypes = abstractTypeChecker.findCorrespondingSupertypes(typeCheckerState, rigidTypeMarker, typeConstructorMarkerTypeConstructor);
        int i11 = 10;
        if (listFindCorrespondingSupertypes.size() > 1) {
            TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
            TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext = typeSystemContext2 instanceof TypeSystemInferenceExtensionContext ? (TypeSystemInferenceExtensionContext) typeSystemContext2 : null;
            if (typeSystemInferenceExtensionContext == null || !typeSystemInferenceExtensionContext.isK2()) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFindCorrespondingSupertypes, 10));
                for (RigidTypeMarker rigidTypeMarker3 : listFindCorrespondingSupertypes) {
                    rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(typeCheckerState.prepareType(rigidTypeMarker3));
                    if (rigidTypeMarkerAsRigidType == null) {
                        rigidTypeMarker3 = rigidTypeMarkerAsRigidType;
                    }
                    arrayList.add(rigidTypeMarker3);
                }
            } else {
                arrayList = new LinkedHashSet();
                for (RigidTypeMarker rigidTypeMarker4 : listFindCorrespondingSupertypes) {
                    RigidTypeMarker rigidTypeMarkerAsRigidType2 = typeSystemContext.asRigidType(typeCheckerState.prepareType(rigidTypeMarker4));
                    if (rigidTypeMarkerAsRigidType2 != null) {
                        rigidTypeMarker4 = rigidTypeMarkerAsRigidType2;
                    }
                    arrayList.add(rigidTypeMarker4);
                }
            }
        } else {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFindCorrespondingSupertypes, 10));
            while (r4.hasNext()) {
                rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(typeCheckerState.prepareType(rigidTypeMarker3));
                if (rigidTypeMarkerAsRigidType == null) {
                    rigidTypeMarker3 = rigidTypeMarkerAsRigidType;
                }
                arrayList.add(rigidTypeMarker3);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return INSTANCE.hasNothingSupertype(typeCheckerState, rigidTypeMarker);
        }
        if (size == 1) {
            return INSTANCE.isSubtypeForSameConstructor(typeCheckerState, typeSystemContext.asArgumentList((RigidTypeMarker) CollectionsKt.first(arrayList)), rigidTypeMarker2);
        }
        ArgumentList argumentList = new ArgumentList(typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor));
        int iParametersCount = typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor);
        int i12 = 0;
        boolean z14 = false;
        while (i12 < iParametersCount) {
            z14 = (z14 || typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructorMarkerTypeConstructor, i12)) != TypeVariance.OUT) ? z13 : z12;
            if (z14) {
                z11 = z13;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, i11));
                for (RigidTypeMarker rigidTypeMarker5 : arrayList) {
                    boolean z15 = z13;
                    TypeArgumentMarker argumentOrNull = typeSystemContext.getArgumentOrNull(rigidTypeMarker5, i12);
                    if (argumentOrNull != null) {
                        if (typeSystemContext.getVariance(argumentOrNull) != TypeVariance.INV) {
                            argumentOrNull = null;
                        }
                        if (argumentOrNull != null && (type = typeSystemContext.getType(argumentOrNull)) != null) {
                            arrayList2.add(type);
                            z13 = z15;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + rigidTypeMarker5 + ", subType: " + rigidTypeMarker + ", superType: " + rigidTypeMarker2).toString());
                }
                z11 = z13;
                argumentList.add(typeSystemContext.asTypeArgument(typeSystemContext.intersectTypes(arrayList2)));
            }
            i12++;
            z13 = z11;
            z12 = false;
            i11 = 10;
        }
        return (z14 || !INSTANCE.isSubtypeForSameConstructor(typeCheckerState, argumentList, rigidTypeMarker2)) ? typeCheckerState.runForkingPoint(new Function1(arrayList, typeCheckerState, typeSystemContext, rigidTypeMarker2) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0
            private final Collection arg$0;
            private final TypeCheckerState arg$1;
            private final TypeSystemContext arg$2;
            private final RigidTypeMarker arg$3;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractTypeChecker.isSubtypeOfForSingleClassifierType$lambda$21$lambda$20(this.arg$0, this.arg$1, this.arg$2, this.arg$3, (TypeCheckerState.ForkPointContext) obj);
            }

            {
                this.arg$0 = arrayList;
                this.arg$1 = typeCheckerState;
                this.arg$2 = typeSystemContext;
                this.arg$3 = rigidTypeMarker2;
            }
        }) : z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isSubtypeOfForSingleClassifierType$lambda$21$lambda$20(Collection collection, final TypeCheckerState typeCheckerState, final TypeSystemContext typeSystemContext, final RigidTypeMarker rigidTypeMarker, TypeCheckerState.ForkPointContext runForkingPoint) {
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            final RigidTypeMarker rigidTypeMarker2 = (RigidTypeMarker) it.next();
            runForkingPoint.fork(new Function0(typeCheckerState, typeSystemContext, rigidTypeMarker2, rigidTypeMarker) { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$1
                private final TypeCheckerState arg$0;
                private final TypeSystemContext arg$1;
                private final RigidTypeMarker arg$2;
                private final RigidTypeMarker arg$3;

                @Override // p852kotlin.jvm.functions.Function0
                public Object invoke() {
                    return Boolean.valueOf(AbstractTypeChecker.isSubtypeOfForSingleClassifierType$lambda$21$lambda$20$lambda$19(this.arg$0, this.arg$1, this.arg$2, this.arg$3));
                }

                {
                    this.arg$0 = typeCheckerState;
                    this.arg$1 = typeSystemContext;
                    this.arg$2 = rigidTypeMarker2;
                    this.arg$3 = rigidTypeMarker;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSubtypeOfForSingleClassifierType$lambda$21$lambda$20$lambda$19(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        return INSTANCE.isSubtypeForSameConstructor(typeCheckerState, typeSystemContext.asArgumentList(rigidTypeMarker), rigidTypeMarker2);
    }

    @Nullable
    public final TypeVariance effectiveVariance(@NotNull TypeVariance declared, @NotNull TypeVariance useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean isSubtypeForSameConstructor(@NotNull TypeCheckerState typeCheckerState, @NotNull TypeArgumentListMarker capturedSubArguments, @NotNull RigidTypeMarker superType) {
        boolean zEqualTypes;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        Intrinsics.checkNotNullParameter(typeCheckerState2, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        TypeSystemContext typeSystemContext = typeCheckerState2.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(superType);
        int size = typeSystemContext.size(capturedSubArguments);
        int iParametersCount = typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor);
        if (size != iParametersCount || size != typeSystemContext.argumentsCount(superType)) {
            return false;
        }
        for (int i11 = 0; i11 < iParametersCount; i11++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(superType, i11);
            KotlinTypeMarker type = typeSystemContext.getType(argument);
            if (type != null) {
                TypeArgumentMarker typeArgumentMarker = typeSystemContext.get(capturedSubArguments, i11);
                typeSystemContext.getVariance(typeArgumentMarker);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker type2 = typeSystemContext.getType(typeArgumentMarker);
                Intrinsics.checkNotNull(type2);
                AbstractTypeChecker abstractTypeChecker = INSTANCE;
                TypeVariance typeVarianceEffectiveVariance = abstractTypeChecker.effectiveVariance(typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructorMarkerTypeConstructor, i11)), typeSystemContext.getVariance(argument));
                if (typeVarianceEffectiveVariance == null) {
                    return typeCheckerState2.isErrorTypeEqualsToAnything();
                }
                if (typeVarianceEffectiveVariance != typeVariance || (!abstractTypeChecker.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type2, type, typeConstructorMarkerTypeConstructor) && !abstractTypeChecker.isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type, type2, typeConstructorMarkerTypeConstructor))) {
                    if (typeCheckerState2.argumentsDepth > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                    typeCheckerState2.argumentsDepth++;
                    int i12 = WhenMappings.$EnumSwitchMapping$0[typeVarianceEffectiveVariance.ordinal()];
                    if (i12 == 1) {
                        zEqualTypes = abstractTypeChecker.equalTypes(typeCheckerState2, type2, type);
                    } else if (i12 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState2, type2, type, false, 8, null);
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState2, type, type2, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    typeCheckerState2.argumentsDepth--;
                    if (!zEqualTypes) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @JvmOverloads
    public final boolean isSubtypeOf(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker subType, @NotNull KotlinTypeMarker superType, boolean z11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.customIsSubtypeOf(subType, superType)) {
            return completeIsSubTypeOf(state, subType, superType, z11);
        }
        return false;
    }

    private AbstractTypeChecker() {
    }

    private final Boolean checkSubtypeForIntegerLiteralType(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (!typeSystemContext.isIntegerLiteralType(rigidTypeMarker) && !typeSystemContext.isIntegerLiteralType(rigidTypeMarker2)) {
            return null;
        }
        if (m90296xdf0fda08(typeSystemContext, rigidTypeMarker) && m90296xdf0fda08(typeSystemContext, rigidTypeMarker2)) {
            return Boolean.TRUE;
        }
        if (typeSystemContext.isIntegerLiteralType(rigidTypeMarker)) {
            if (m90297x5f8d759c(typeSystemContext, typeCheckerState, rigidTypeMarker, rigidTypeMarker2, false)) {
                return Boolean.TRUE;
            }
        } else if (typeSystemContext.isIntegerLiteralType(rigidTypeMarker2) && (m90295x8a873de1(typeSystemContext, rigidTypeMarker) || m90297x5f8d759c(typeSystemContext, typeCheckerState, rigidTypeMarker2, rigidTypeMarker, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeInIntersectionComponents */
    private static final boolean m90295x8a873de1(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(rigidTypeMarker);
        if (typeConstructorMarkerTypeConstructor instanceof IntersectionTypeConstructorMarker) {
            Collection<KotlinTypeMarker> collectionSupertypes = typeSystemContext.supertypes(typeConstructorMarkerTypeConstructor);
            if (collectionSupertypes == null || !collectionSupertypes.isEmpty()) {
                Iterator<T> it = collectionSupertypes.iterator();
                while (it.hasNext()) {
                    RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType((KotlinTypeMarker) it.next());
                    if (rigidTypeMarkerAsRigidType != null && typeSystemContext.isIntegerLiteralType(rigidTypeMarkerAsRigidType)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: checkSubtypeForIntegerLiteralType$lambda$7$isIntegerLiteralTypeOrCapturedOne */
    private static final boolean m90296xdf0fda08(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        if (!typeSystemContext.isIntegerLiteralType(rigidTypeMarker) && !m90294xef0f5f3b(typeSystemContext, rigidTypeMarker)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: checkSubtypeForIntegerLiteralType$lambda$7$isTypeInIntegerLiteralType */
    private static final boolean m90297x5f8d759c(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z11) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> collectionPossibleIntegerTypes = typeSystemContext.possibleIntegerTypes(rigidTypeMarker);
        if (collectionPossibleIntegerTypes != null && collectionPossibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionPossibleIntegerTypes) {
            if (!Intrinsics.areEqual(typeSystemContext.typeConstructor(kotlinTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2))) {
                if (z11) {
                    typeCheckerState2 = typeCheckerState;
                    rigidTypeMarker3 = rigidTypeMarker2;
                    if (isSubtypeOf$default(INSTANCE, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
                        return true;
                    }
                } else {
                    typeCheckerState2 = typeCheckerState;
                    rigidTypeMarker3 = rigidTypeMarker2;
                }
                typeCheckerState = typeCheckerState2;
                rigidTypeMarker2 = rigidTypeMarker3;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    private final Boolean checkSubtypeForSpecialCases(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull;
        TypeParameterMarker typeParameterForArgumentInBaseIfItEqualToTarget;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        boolean z11 = false;
        if (!typeSystemContext.isError(rigidTypeMarker) && !typeSystemContext.isError(rigidTypeMarker2)) {
            if (typeSystemContext.isStubTypeForBuilderInference(rigidTypeMarker) && typeSystemContext.isStubTypeForBuilderInference(rigidTypeMarker2)) {
                if (INSTANCE.isStubTypeSubtypeOfAnother(typeSystemContext, rigidTypeMarker, rigidTypeMarker2) || typeCheckerState.isStubTypeEqualsToAnything()) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
            if (!typeSystemContext.isStubType(rigidTypeMarker) && !typeSystemContext.isStubType(rigidTypeMarker2)) {
                CapturedTypeMarker capturedTypeMarkerAsCapturedTypeUnwrappingDnn = typeSystemContext.asCapturedTypeUnwrappingDnn(rigidTypeMarker2);
                if (capturedTypeMarkerAsCapturedTypeUnwrappingDnn != null) {
                    kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull = typeSystemContext.lowerType(capturedTypeMarkerAsCapturedTypeUnwrappingDnn);
                } else {
                    kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull = null;
                }
                if (capturedTypeMarkerAsCapturedTypeUnwrappingDnn != null && kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull != null) {
                    if (typeSystemContext.isMarkedNullable(rigidTypeMarker2)) {
                        kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull = typeSystemContext.withNullability(kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull, true);
                    } else if (typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2)) {
                        kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull = typeSystemContext.makeDefinitelyNotNullOrNotNull(kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull);
                    }
                    KotlinTypeMarker kotlinTypeMarker = kotlinTypeMarkerMakeDefinitelyNotNullOrNotNull;
                    int i11 = WhenMappings.$EnumSwitchMapping$1[typeCheckerState.getLowerCapturedTypePolicy(rigidTypeMarker, capturedTypeMarkerAsCapturedTypeUnwrappingDnn).ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (isSubtypeOf$default(INSTANCE, typeCheckerState, rigidTypeMarker, kotlinTypeMarker, false, 8, null)) {
                            return Boolean.TRUE;
                        }
                    } else {
                        return Boolean.valueOf(isSubtypeOf$default(INSTANCE, typeCheckerState, rigidTypeMarker, kotlinTypeMarker, false, 8, null));
                    }
                }
                TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(rigidTypeMarker2);
                if (typeSystemContext.isIntersection(typeConstructorMarkerTypeConstructor)) {
                    typeSystemContext.isMarkedNullable(rigidTypeMarker2);
                    Collection<KotlinTypeMarker> collectionSupertypes = typeSystemContext.supertypes(typeConstructorMarkerTypeConstructor);
                    if (collectionSupertypes != null && collectionSupertypes.isEmpty()) {
                        z11 = true;
                    } else {
                        Iterator<T> it = collectionSupertypes.iterator();
                        while (it.hasNext()) {
                            if (!isSubtypeOf$default(INSTANCE, typeCheckerState, rigidTypeMarker, (KotlinTypeMarker) it.next(), false, 8, null)) {
                            }
                        }
                        z11 = true;
                    }
                    return Boolean.valueOf(z11);
                }
                TypeConstructorMarker typeConstructorMarkerTypeConstructor2 = typeSystemContext.typeConstructor(rigidTypeMarker);
                if (!(rigidTypeMarker instanceof CapturedTypeMarker)) {
                    if (typeSystemContext.isIntersection(typeConstructorMarkerTypeConstructor2)) {
                        Collection<KotlinTypeMarker> collectionSupertypes2 = typeSystemContext.supertypes(typeConstructorMarkerTypeConstructor2);
                        if (collectionSupertypes2 == null || !collectionSupertypes2.isEmpty()) {
                            Iterator<T> it2 = collectionSupertypes2.iterator();
                            while (it2.hasNext()) {
                                if (!(((KotlinTypeMarker) it2.next()) instanceof CapturedTypeMarker)) {
                                }
                            }
                            typeParameterForArgumentInBaseIfItEqualToTarget = INSTANCE.getTypeParameterForArgumentInBaseIfItEqualToTarget(typeCheckerState.getTypeSystemContext(), rigidTypeMarker2, rigidTypeMarker);
                            if (typeParameterForArgumentInBaseIfItEqualToTarget != null) {
                                return Boolean.TRUE;
                            }
                        } else {
                            typeParameterForArgumentInBaseIfItEqualToTarget = INSTANCE.getTypeParameterForArgumentInBaseIfItEqualToTarget(typeCheckerState.getTypeSystemContext(), rigidTypeMarker2, rigidTypeMarker);
                            if (typeParameterForArgumentInBaseIfItEqualToTarget != null) {
                                return Boolean.TRUE;
                            }
                        }
                    }
                } else {
                    typeParameterForArgumentInBaseIfItEqualToTarget = INSTANCE.getTypeParameterForArgumentInBaseIfItEqualToTarget(typeCheckerState.getTypeSystemContext(), rigidTypeMarker2, rigidTypeMarker);
                    if (typeParameterForArgumentInBaseIfItEqualToTarget != null && typeSystemContext.hasRecursiveBounds(typeParameterForArgumentInBaseIfItEqualToTarget, typeSystemContext.typeConstructor(rigidTypeMarker2))) {
                        return Boolean.TRUE;
                    }
                }
                return null;
            }
            return Boolean.valueOf(typeCheckerState.isStubTypeEqualsToAnything());
        }
        if (typeCheckerState.isErrorTypeEqualsToAnything()) {
            return Boolean.TRUE;
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker) && !typeSystemContext.isMarkedNullable(rigidTypeMarker2)) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(typeSystemContext, typeSystemContext.withNullability(rigidTypeMarker, false), typeSystemContext.withNullability(rigidTypeMarker2, false)));
    }

    private final List<RigidTypeMarker> collectAllSupertypesWithGivenTypeConstructor(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicySubstitutionSupertypePolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        List<SimpleTypeMarker> listFastCorrespondingSupertypes = typeSystemContext.fastCorrespondingSupertypes(rigidTypeMarker, typeConstructorMarker);
        if (listFastCorrespondingSupertypes != null) {
            return listFastCorrespondingSupertypes;
        }
        if (!typeSystemContext.isClassTypeConstructor(typeConstructorMarker) && typeSystemContext.isClassType(rigidTypeMarker)) {
            return CollectionsKt.emptyList();
        }
        if (typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker)) {
                RigidTypeMarker rigidTypeMarkerCaptureFromArguments = typeSystemContext.captureFromArguments(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerCaptureFromArguments != null) {
                    rigidTypeMarker = rigidTypeMarkerCaptureFromArguments;
                }
                return CollectionsKt.listOf(rigidTypeMarker);
            }
            return CollectionsKt.emptyList();
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerCaptureFromArguments2 = typeSystemContext.captureFromArguments(rigidTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerCaptureFromArguments2 == null) {
                    rigidTypeMarkerCaptureFromArguments2 = rigidTypeMarkerPop;
                }
                if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarkerCaptureFromArguments2), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerCaptureFromArguments2);
                    supertypesPolicySubstitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else if (typeSystemContext.argumentsCount(rigidTypeMarkerCaptureFromArguments2) == 0) {
                    supertypesPolicySubstitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                } else {
                    supertypesPolicySubstitutionSupertypePolicy = typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(rigidTypeMarkerCaptureFromArguments2);
                }
                if (Intrinsics.areEqual(supertypesPolicySubstitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicySubstitutionSupertypePolicy = null;
                }
                if (supertypesPolicySubstitutionSupertypePolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicySubstitutionSupertypePolicy.mo105130transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    private final List<RigidTypeMarker> collectAndFilter(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        return selectOnlyPureKotlinSupertypes(typeCheckerState, collectAllSupertypesWithGivenTypeConstructor(typeCheckerState, rigidTypeMarker, typeConstructorMarker));
    }

    private final boolean completeIsSubTypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z11) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        KotlinTypeMarker kotlinTypeMarkerPrepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
        KotlinTypeMarker kotlinTypeMarkerPrepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
        if (typeCheckerState.isDnnTypesEqualToFlexible() && typeSystemContext.isFlexible(kotlinTypeMarkerPrepareType) && typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarkerPrepareType2)) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarkerPrepareType);
            Intrinsics.checkNotNull(flexibleTypeMarkerAsFlexibleType);
            RigidTypeMarker rigidTypeMarkerLowerBound = typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType);
            RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(kotlinTypeMarkerPrepareType2);
            Intrinsics.checkNotNull(rigidTypeMarkerAsRigidType);
            return abstractTypeChecker.completeIsSubTypeOf(typeCheckerState, rigidTypeMarkerLowerBound, typeSystemContext.originalIfDefinitelyNotNullable(rigidTypeMarkerAsRigidType), z11);
        }
        AbstractTypeChecker abstractTypeChecker2 = INSTANCE;
        Boolean boolCheckSubtypeForSpecialCases = abstractTypeChecker2.checkSubtypeForSpecialCases(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType), typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2));
        if (boolCheckSubtypeForSpecialCases != null) {
            boolean zBooleanValue = boolCheckSubtypeForSpecialCases.booleanValue();
            typeCheckerState.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z11);
            return zBooleanValue;
        }
        Boolean boolAddSubtypeConstraint = typeCheckerState.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z11);
        if (boolAddSubtypeConstraint != null) {
            return boolAddSubtypeConstraint.booleanValue();
        }
        return abstractTypeChecker2.isSubtypeOfForSingleClassifierType(typeCheckerState, typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType), typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2));
    }

    private final TypeParameterMarker getTypeParameterForArgumentInBaseIfItEqualToTarget(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker type;
        boolean z11;
        int iArgumentsCount = typeSystemContext.argumentsCount(kotlinTypeMarker);
        int i11 = 0;
        while (true) {
            TypeArgumentMarker typeArgumentMarker = null;
            if (i11 >= iArgumentsCount) {
                return null;
            }
            TypeArgumentMarker argument = typeSystemContext.getArgument(kotlinTypeMarker, i11);
            if (!typeSystemContext.isStarProjection(argument)) {
                typeArgumentMarker = argument;
            }
            if (typeArgumentMarker != null && (type = typeSystemContext.getType(typeArgumentMarker)) != null) {
                if (typeSystemContext.isCapturedType(typeSystemContext.lowerBoundIfFlexible(type)) && typeSystemContext.isCapturedType(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarker2))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!Intrinsics.areEqual(type, kotlinTypeMarker2) && (!z11 || !Intrinsics.areEqual(typeSystemContext.typeConstructor(type), typeSystemContext.typeConstructor(kotlinTypeMarker2)))) {
                    TypeParameterMarker typeParameterForArgumentInBaseIfItEqualToTarget = getTypeParameterForArgumentInBaseIfItEqualToTarget(typeSystemContext, type, kotlinTypeMarker2);
                    if (typeParameterForArgumentInBaseIfItEqualToTarget != null) {
                        return typeParameterForArgumentInBaseIfItEqualToTarget;
                    }
                } else {
                    return typeSystemContext.getParameter(typeSystemContext.typeConstructor(kotlinTypeMarker), i11);
                }
            }
            i11++;
        }
    }

    private final boolean hasNothingSupertype(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(rigidTypeMarker);
        if (typeSystemContext.isClassTypeConstructor(typeConstructorMarkerTypeConstructor)) {
            return typeSystemContext.isNothingConstructor(typeConstructorMarkerTypeConstructor);
        }
        if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(rigidTypeMarker))) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                if (typeSystemContext.isClassType(rigidTypeMarkerPop)) {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo105130transformType = supertypesPolicy.mo105130transformType(typeCheckerState, it.next());
                        if (typeSystemContext.isNothingConstructor(typeSystemContext.typeConstructor(rigidTypeMarkerMo105130transformType))) {
                            typeCheckerState.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo105130transformType);
                    }
                }
            }
        }
        typeCheckerState.clear();
        return false;
    }

    private final boolean isCommonDenotableType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        if (typeSystemContext.isDenotable(typeSystemContext.typeConstructor(kotlinTypeMarker)) && !typeSystemContext.isDynamic(kotlinTypeMarker) && !typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker) && !typeSystemContext.isNotNullTypeParameter(kotlinTypeMarker) && !typeSystemContext.isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker)) {
            return true;
        }
        return false;
    }

    private final boolean isStubTypeSubtypeOfAnother(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.typeConstructor(rigidTypeMarker) != typeSystemContext.typeConstructor(rigidTypeMarker2)) {
            return false;
        }
        if (!typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) && typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2)) {
            return false;
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker) && !typeSystemContext.isMarkedNullable(rigidTypeMarker2)) {
            return false;
        }
        return true;
    }

    private final boolean isTypeVariableAgainstStarProjectionForSelfType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker;
        TypeParameterMarker typeParameter;
        RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        if (rigidTypeMarkerAsRigidType instanceof CapturedTypeMarker) {
            CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerAsRigidType;
            if (typeSystemContext.isOldCapturedType(capturedTypeMarker) || !typeSystemContext.isStarProjection(typeSystemContext.projection(typeSystemContext.typeConstructor(capturedTypeMarker))) || typeSystemContext.captureStatus(capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2);
            if (typeConstructorMarkerTypeConstructor instanceof TypeVariableTypeConstructorMarker) {
                typeVariableTypeConstructorMarker = (TypeVariableTypeConstructorMarker) typeConstructorMarkerTypeConstructor;
            } else {
                typeVariableTypeConstructorMarker = null;
            }
            if (typeVariableTypeConstructorMarker != null && (typeParameter = typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker)) != null && typeSystemContext.hasRecursiveBounds(typeParameter, typeConstructorMarker)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<RigidTypeMarker> selectOnlyPureKotlinSupertypes(TypeCheckerState typeCheckerState, List<? extends RigidTypeMarker> list) {
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                TypeArgumentListMarker typeArgumentListMarkerAsArgumentList = typeSystemContext.asArgumentList((RigidTypeMarker) obj);
                int size = typeSystemContext.size(typeArgumentListMarkerAsArgumentList);
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        KotlinTypeMarker type = typeSystemContext.getType(typeSystemContext.get(typeArgumentListMarkerAsArgumentList, i11));
                        if (type != null) {
                            flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(type);
                        } else {
                            flexibleTypeMarkerAsFlexibleType = null;
                        }
                        if (flexibleTypeMarkerAsFlexibleType != null) {
                            break;
                        }
                        i11++;
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    public final boolean equalTypes(@NotNull TypeCheckerState state, @NotNull KotlinTypeMarker a11, @NotNull KotlinTypeMarker b11) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (a11 == b11) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        if (abstractTypeChecker.isCommonDenotableType(typeSystemContext, a11) && abstractTypeChecker.isCommonDenotableType(typeSystemContext, b11)) {
            KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(a11));
            KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(b11));
            RigidTypeMarker rigidTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType), typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(rigidTypeMarkerLowerBoundIfFlexible) == 0) {
                if (typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType) || typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType2) || typeSystemContext.isMarkedNullable(rigidTypeMarkerLowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType2))) {
                    return true;
                }
                return false;
            }
        }
        if (isSubtypeOf$default(abstractTypeChecker, state, a11, b11, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, state, b11, a11, false, 8, null)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<RigidTypeMarker> findCorrespondingSupertypes(@NotNull TypeCheckerState state, @NotNull RigidTypeMarker subType, @NotNull TypeConstructorMarker superConstructor) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (typeSystemContext.isClassType(subType)) {
            return INSTANCE.collectAndFilter(state, subType, superConstructor);
        }
        if (!typeSystemContext.isClassTypeConstructor(superConstructor) && !typeSystemContext.isIntegerLiteralTypeConstructor(superConstructor)) {
            return INSTANCE.collectAllSupertypesWithGivenTypeConstructor(state, subType, superConstructor);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(subType);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                if (typeSystemContext.isClassType(rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicy.mo105130transformType(state, it.next()));
                    }
                }
            }
        }
        state.clear();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            Intrinsics.checkNotNull(rigidTypeMarker);
            CollectionsKt.addAll(arrayList, abstractTypeChecker.collectAndFilter(state, rigidTypeMarker, superConstructor));
        }
        return arrayList;
    }
}
