package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p852kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import p852kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p852kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p852kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import p852kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: compiled from: AbstractSignatureParts.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1#2:235\n1#2:258\n1#2:281\n774#3:236\n865#3,2:237\n1740#3,3:239\n1761#3,3:242\n1761#3,3:245\n1617#3,9:248\n1869#3:257\n1870#3:259\n1626#3:260\n1740#3,3:261\n1563#3:264\n1634#3,3:265\n1761#3,3:268\n1617#3,9:271\n1869#3:280\n1870#3:282\n1626#3:283\n1869#3,2:284\n3544#3,7:286\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n162#1:258\n188#1:281\n90#1:236\n90#1:237,2\n159#1:239,3\n161#1:242,3\n162#1:245,3\n162#1:248,9\n162#1:257\n162#1:259\n162#1:260\n165#1:261,3\n175#1:264\n175#1:265,3\n183#1:268,3\n188#1:271,9\n188#1:280\n188#1:282\n188#1:283\n201#1:284,2\n215#1:286,7\n*E\n"})
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: compiled from: AbstractSignatureParts.kt */
    public static final class TypeAndDefaultQualifiers {

        @Nullable
        private final JavaTypeQualifiersByElementType defaultQualifiers;

        @Nullable
        private final KotlinTypeMarker type;

        @Nullable
        private final TypeParameterMarker typeParameterForArgument;

        @Nullable
        public final JavaTypeQualifiersByElementType getDefaultQualifiers() {
            return this.defaultQualifiers;
        }

        @Nullable
        public final KotlinTypeMarker getType() {
            return this.type;
        }

        @Nullable
        public final TypeParameterMarker getTypeParameterForArgument() {
            return this.typeParameterForArgument;
        }

        public TypeAndDefaultQualifiers(@Nullable KotlinTypeMarker kotlinTypeMarker, @Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @Nullable TypeParameterMarker typeParameterMarker) {
            this.type = kotlinTypeMarker;
            this.defaultQualifiers = javaTypeQualifiersByElementType;
            this.typeParameterForArgument = typeParameterMarker;
        }
    }

    private final <T> void flattenTree(T t11, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t11);
        Iterable<? extends T> iterableInvoke = function1.invoke(t11);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), list, function1);
            }
        }
    }

    public abstract boolean forceWarning(@NotNull TAnnotation tannotation, @Nullable KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    @NotNull
    public abstract Iterable<TAnnotation> getAnnotations(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract Iterable<TAnnotation> getContainerAnnotations();

    @NotNull
    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    @Nullable
    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    @Nullable
    public abstract NullabilityQualifierWithMigrationStatus getDefaultNullability(@Nullable NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, @Nullable JavaDefaultQualifiers javaDefaultQualifiers);

    public abstract boolean getEnableImprovementsInStrictMode();

    @Nullable
    public abstract KotlinTypeMarker getEnhancedForWarnings(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    @Nullable
    public abstract FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    @NotNull
    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(@NotNull TypeParameterMarker typeParameterMarker);

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiers computeIndexedQualifiers$lambda$18(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr, int i11) {
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        if (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(Integer.valueOf(i11))) == null) {
            return (i11 < 0 || i11 >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i11];
        }
        return javaTypeQualifiers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean extractQualifiersFromAnnotations$lambda$6(AbstractSignatureParts abstractSignatureParts, TypeAndDefaultQualifiers typeAndDefaultQualifiers, Object extractNullability) {
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        return abstractSignatureParts.forceWarning(extractNullability, typeAndDefaultQualifiers.getType());
    }

    private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        return (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) || ((nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) && (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0 || nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable toIndexed$lambda$23$lambda$22(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext, TypeAndDefaultQualifiers it) {
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        KotlinTypeMarker type2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((abstractSignatureParts.getSkipRawTypeArguments() && (type2 = it.getType()) != null && typeSystemContext.isRawType(type2)) || (type = it.getType()) == null || (typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(type)) == null || (parameters = typeSystemContext.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
            return null;
        }
        List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(it.getType());
        Iterator<T> it2 = parameters.iterator();
        Iterator<T> it3 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(parameters, 10), CollectionsKt.collectionSizeOrDefault(arguments, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it2.next();
            KotlinTypeMarker type3 = typeSystemContext.getType((TypeArgumentMarker) it3.next());
            arrayList.add(type3 == null ? new TypeAndDefaultQualifiers(null, it.getDefaultQualifiers(), typeParameterMarker) : new TypeAndDefaultQualifiers(type3, abstractSignatureParts.extractAndMergeDefaultQualifiers(type3, it.getDefaultQualifiers()), typeParameterMarker));
        }
        return arrayList;
    }

    @NotNull
    public final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiers(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull Iterable<? extends KotlinTypeMarker> overrides, @Nullable final TypeEnhancementInfo typeEnhancementInfo, boolean z11) {
        int size;
        KotlinTypeMarker type;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List<TypeAndDefaultQualifiers> indexed = toIndexed(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overrides, 10));
        Iterator<? extends KotlinTypeMarker> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(toIndexed(it.next()));
        }
        if (getForceOnlyHeadTypeConstructor()) {
            size = 1;
        } else {
            if (isCovariant() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                Iterator<? extends KotlinTypeMarker> it2 = overrides.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!isEqual(kotlinTypeMarker, it2.next())) {
                            size = 1;
                        }
                    }
                }
            }
            size = indexed.size();
        }
        final JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i11 = 0;
        while (i11 < size) {
            JavaTypeQualifiers javaTypeQualifiersExtractQualifiersFromAnnotations = extractQualifiersFromAnnotations(indexed.get(i11));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) CollectionsKt.getOrNull((List) it3.next(), i11);
                JavaTypeQualifiers javaTypeQualifiersExtractQualifiers = (typeAndDefaultQualifiers == null || (type = typeAndDefaultQualifiers.getType()) == null) ? null : extractQualifiers(type);
                if (javaTypeQualifiersExtractQualifiers != null) {
                    arrayList2.add(javaTypeQualifiersExtractQualifiers);
                }
            }
            javaTypeQualifiersArr[i11] = TypeEnhancementUtilsKt.computeQualifiersForOverride(javaTypeQualifiersExtractQualifiersFromAnnotations, arrayList2, i11 == 0 && isCovariant(), i11 == 0 && getContainerIsVarargParameter(), z11);
            i11++;
        }
        return new Function1(typeEnhancementInfo, javaTypeQualifiersArr) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$1
            private final TypeEnhancementInfo arg$0;
            private final JavaTypeQualifiers[] arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractSignatureParts.computeIndexedQualifiers$lambda$18(this.arg$0, this.arg$1, ((Number) obj).intValue());
            }

            {
                this.arg$0 = typeEnhancementInfo;
                this.arg$1 = javaTypeQualifiersArr;
            }
        };
    }

    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }

    private final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers extractQualifiers(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifier;
        boolean z11;
        NullabilityQualifier nullabilityQualifier2 = getNullabilityQualifier(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            if (enhancedForWarnings != null) {
                nullabilityQualifier = getNullabilityQualifier(enhancedForWarnings);
            } else {
                nullabilityQualifier = null;
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        boolean z12 = true;
        if (!getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) && !isNotNullTypeParameterCompat(kotlinTypeMarker)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (nullabilityQualifier == nullabilityQualifier2) {
            z12 = false;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z11, z12);
    }

    private final JavaTypeQualifiers extractQualifiersFromAnnotations(final TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        boolean z11;
        Iterable<? extends TAnnotation> iterableEmptyList;
        TypeParameterMarker typeParameterClassifier;
        boolean z12;
        AnnotationQualifierApplicabilityType containerApplicabilityType;
        JavaDefaultQualifiers javaDefaultQualifiers;
        NullabilityQualifierWithMigrationStatus boundsNullability;
        NullabilityQualifier qualifier;
        boolean z13;
        NullabilityQualifierWithMigrationStatus boundsNullability2;
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        TypeVariance variance;
        NullabilityQualifier qualifier2 = null;
        if (typeAndDefaultQualifiers.getType() == null) {
            TypeSystemContext typeSystem = getTypeSystem();
            TypeParameterMarker typeParameterForArgument = typeAndDefaultQualifiers.getTypeParameterForArgument();
            if (typeParameterForArgument != null) {
                variance = typeSystem.getVariance(typeParameterForArgument);
            } else {
                variance = null;
            }
            if (variance == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z14 = false;
        if (typeAndDefaultQualifiers.getTypeParameterForArgument() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        KotlinTypeMarker type2 = typeAndDefaultQualifiers.getType();
        if (type2 == null || (iterableEmptyList = getAnnotations(type2)) == null) {
            iterableEmptyList = CollectionsKt.emptyList();
        }
        TypeSystemContext typeSystem2 = getTypeSystem();
        KotlinTypeMarker type3 = typeAndDefaultQualifiers.getType();
        if (type3 != null && (typeConstructorMarkerTypeConstructor = typeSystem2.typeConstructor(type3)) != null) {
            typeParameterClassifier = typeSystem2.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
        } else {
            typeParameterClassifier = null;
        }
        if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            if (!z12 && getEnableImprovementsInStrictMode() && (type = typeAndDefaultQualifiers.getType()) != null && isArrayOrPrimitiveArray(type)) {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                iterableEmptyList = CollectionsKt.plus((Collection) arrayList, (Iterable) iterableEmptyList);
            } else {
                iterableEmptyList = CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) iterableEmptyList);
            }
        }
        MutabilityQualifier mutabilityQualifierExtractMutability = getAnnotationTypeQualifierResolver().extractMutability(iterableEmptyList);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability = getAnnotationTypeQualifierResolver().extractNullability((Iterable) iterableEmptyList, (Function1) new Function1(this, typeAndDefaultQualifiers) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$0
            private final AbstractSignatureParts arg$0;
            private final AbstractSignatureParts.TypeAndDefaultQualifiers arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(AbstractSignatureParts.extractQualifiersFromAnnotations$lambda$6(this.arg$0, this.arg$1, obj));
            }

            {
                this.arg$0 = this;
                this.arg$1 = typeAndDefaultQualifiers;
            }
        });
        if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
            NullabilityQualifier qualifier3 = nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier();
            if (nullabilityQualifierWithMigrationStatusExtractNullability.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterClassifier != null) {
                z14 = true;
            }
            return new JavaTypeQualifiers(qualifier3, mutabilityQualifierExtractMutability, z14, nullabilityQualifierWithMigrationStatusExtractNullability.isForWarningOnly());
        }
        if (!z11 && !z12) {
            containerApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
        } else {
            containerApplicabilityType = getContainerApplicabilityType();
        }
        JavaTypeQualifiersByElementType defaultQualifiers = typeAndDefaultQualifiers.getDefaultQualifiers();
        if (defaultQualifiers != null) {
            javaDefaultQualifiers = defaultQualifiers.get(containerApplicabilityType);
        } else {
            javaDefaultQualifiers = null;
        }
        if (typeParameterClassifier != null) {
            boundsNullability = getBoundsNullability(typeParameterClassifier);
        } else {
            boundsNullability = null;
        }
        NullabilityQualifierWithMigrationStatus defaultNullability = getDefaultNullability(boundsNullability, javaDefaultQualifiers);
        if (boundsNullability != null) {
            qualifier = boundsNullability.getQualifier();
        } else {
            qualifier = null;
        }
        if (qualifier != NullabilityQualifier.NOT_NULL && (typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull())) {
            z13 = false;
        } else {
            z13 = true;
        }
        TypeParameterMarker typeParameterForArgument2 = typeAndDefaultQualifiers.getTypeParameterForArgument();
        if (typeParameterForArgument2 != null && (boundsNullability2 = getBoundsNullability(typeParameterForArgument2)) != null) {
            if (boundsNullability2.getQualifier() == NullabilityQualifier.NULLABLE) {
                boundsNullability2 = NullabilityQualifierWithMigrationStatus.copy$default(boundsNullability2, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
            }
        } else {
            boundsNullability2 = null;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusMostSpecific = mostSpecific(boundsNullability2, defaultNullability);
        if (nullabilityQualifierWithMigrationStatusMostSpecific != null) {
            qualifier2 = nullabilityQualifierWithMigrationStatusMostSpecific.getQualifier();
        }
        if (nullabilityQualifierWithMigrationStatusMostSpecific != null && nullabilityQualifierWithMigrationStatusMostSpecific.isForWarningOnly()) {
            z14 = true;
        }
        return new JavaTypeQualifiers(qualifier2, mutabilityQualifierExtractMutability, z13, z14);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:1: B:30:0x005e->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:3: B:45:0x009c->B:70:?, LOOP_END, SYNTHETIC] */
    private final NullabilityQualifierWithMigrationStatus getBoundsNullability(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> arrayList;
        Iterator<T> it;
        NullabilityQualifier nullabilityQualifier;
        boolean z11;
        Iterator<T> it2;
        Iterator<T> it3;
        KotlinTypeMarker enhancedForWarnings;
        TypeSystemContext typeSystem = getTypeSystem();
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        if (upperBounds == null || !upperBounds.isEmpty()) {
            Iterator<T> it4 = upperBounds.iterator();
            while (it4.hasNext()) {
                if (!typeSystem.isError((KotlinTypeMarker) it4.next())) {
                    if (upperBounds == null || !upperBounds.isEmpty()) {
                        Iterator<T> it5 = upperBounds.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (getNullabilityQualifier((KotlinTypeMarker) it5.next()) != null) {
                                    arrayList = upperBounds;
                                }
                            } else {
                                if (upperBounds != null || !upperBounds.isEmpty()) {
                                    it2 = upperBounds.iterator();
                                    while (it2.hasNext()) {
                                        if (getEnhancedForWarnings((KotlinTypeMarker) it2.next()) != null) {
                                            arrayList = new ArrayList<>();
                                            it3 = upperBounds.iterator();
                                            while (it3.hasNext()) {
                                                enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it3.next());
                                                if (enhancedForWarnings != null) {
                                                    arrayList.add(enhancedForWarnings);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            if (arrayList != null || !arrayList.isEmpty()) {
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    } else {
                                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                        break;
                                    }
                                }
                            } else {
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                break;
                            }
                            if (arrayList != upperBounds) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z11);
                            break;
                        }
                    }
                    if (upperBounds != null) {
                        it2 = upperBounds.iterator();
                        while (it2.hasNext()) {
                            if (getEnhancedForWarnings((KotlinTypeMarker) it2.next()) != null) {
                                arrayList = new ArrayList<>();
                                it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it3.next());
                                    if (enhancedForWarnings != null) {
                                        arrayList.add(enhancedForWarnings);
                                    }
                                }
                                if (arrayList != null) {
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                                break;
                                            }
                                        } else {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                    }
                                } else {
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                                nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                                break;
                                            }
                                        } else {
                                            nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                            break;
                                        }
                                    }
                                }
                                if (arrayList != upperBounds) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z11);
                                break;
                            }
                        }
                        break;
                        break;
                    }
                    it2 = upperBounds.iterator();
                    while (it2.hasNext()) {
                        if (getEnhancedForWarnings((KotlinTypeMarker) it2.next()) != null) {
                            arrayList = new ArrayList<>();
                            it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                enhancedForWarnings = getEnhancedForWarnings((KotlinTypeMarker) it3.next());
                                if (enhancedForWarnings != null) {
                                    arrayList.add(enhancedForWarnings);
                                }
                            }
                            if (arrayList != null) {
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    } else {
                                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                        break;
                                    }
                                }
                            } else {
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!typeSystem.isNullableType((KotlinTypeMarker) it.next())) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    } else {
                                        nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                        break;
                                    }
                                }
                            }
                            if (arrayList != upperBounds) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            nullabilityQualifierWithMigrationStatus = new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z11);
                            break;
                        }
                    }
                    break;
                    break;
                }
            }
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    private final NullabilityQualifier getNullabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (!typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NOT_NULL;
        }
        return null;
    }

    private final List<TypeAndDefaultQualifiers> toIndexed(KotlinTypeMarker kotlinTypeMarker) {
        final TypeSystemContext typeSystem = getTypeSystem();
        return flattenTree(new TypeAndDefaultQualifiers(kotlinTypeMarker, extractAndMergeDefaultQualifiers(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new Function1(this, typeSystem) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$2
            private final AbstractSignatureParts arg$0;
            private final TypeSystemContext arg$1;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractSignatureParts.toIndexed$lambda$23$lambda$22(this.arg$0, this.arg$1, (AbstractSignatureParts.TypeAndDefaultQualifiers) obj);
            }

            {
                this.arg$0 = this;
                this.arg$1 = typeSystem;
            }
        });
    }

    private final <T> List<T> flattenTree(T t11, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        flattenTree(t11, arrayList, function1);
        return arrayList;
    }
}
