package p852kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.RawType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p852kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1#2:262\n3544#3,7:263\n1740#3,3:270\n3544#3,7:273\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:263,7\n143#1:270,3\n155#1:273,7\n*E\n"})
public final class JavaTypeEnhancement {

    @NotNull
    private final JavaResolverSettings javaResolverSettings;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class Result {
        private final int subtreeSize;

        @Nullable
        private final KotlinType type;

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        @Nullable
        public final KotlinType getType() {
            return this.type;
        }

        public Result(@Nullable KotlinType kotlinType, int i11) {
            this.type = kotlinType;
            this.subtreeSize = i11;
        }
    }

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;

        @Nullable
        private final SimpleType type;

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        @Nullable
        public final SimpleType getType() {
            return this.type;
        }

        public SimpleResult(@Nullable SimpleType simpleType, int i11, boolean z11) {
            this.type = simpleType;
            this.subtreeSize = i11;
            this.forWarnings = z11;
        }
    }

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i11, TypeComponentPosition typeComponentPosition, boolean z11, boolean z12) {
        TypeConstructor constructor;
        Boolean bool;
        Result result;
        TypeProjection typeProjectionMakeStarProjection;
        Function1<? super Integer, JavaTypeQualifiers> function2 = function1;
        boolean zShouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z13 = (z12 && z11) ? false : true;
        KotlinType kotlinType = null;
        if (!zShouldEnhance && simpleType.getArguments().isEmpty()) {
            return new SimpleResult(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = simpleType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor == null) {
            return new SimpleResult(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function2.invoke(Integer.valueOf(i11));
        ClassifierDescriptor classifierDescriptorEnhanceMutability = TypeEnhancementKt.enhanceMutability(classifierDescriptorMo105126getDeclarationDescriptor, javaTypeQualifiersInvoke, typeComponentPosition);
        Boolean enhancedNullability = TypeEnhancementKt.getEnhancedNullability(javaTypeQualifiersInvoke, typeComponentPosition);
        if (classifierDescriptorEnhanceMutability == null || (constructor = classifierDescriptorEnhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        int subtreeSize = i11 + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arguments, 10), CollectionsKt.collectionSizeOrDefault(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z13) {
                bool = enhancedNullability;
                if (!typeProjection.isStarProjection()) {
                    result = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function2, subtreeSize, z12);
                } else if (function2.invoke(Integer.valueOf(subtreeSize)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
                    result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new Result(null, 1);
                }
            } else {
                bool = enhancedNullability;
                result = new Result(kotlinType, 0);
            }
            subtreeSize += result.getSubtreeSize();
            if (result.getType() != null) {
                KotlinType type = result.getType();
                Variance projectionKind = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
            } else if (classifierDescriptorEnhanceMutability == null || typeProjection.isStarProjection()) {
                typeProjectionMakeStarProjection = classifierDescriptorEnhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type2 = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                Variance projectionKind2 = typeProjection.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionMakeStarProjection);
            function2 = function1;
            enhancedNullability = bool;
            kotlinType = null;
        }
        Boolean bool2 = enhancedNullability;
        int i12 = subtreeSize - i11;
        if (classifierDescriptorEnhanceMutability == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new SimpleResult(null, i12, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        EnhancedTypeAnnotations enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
        if (classifierDescriptorEnhanceMutability == null) {
            enhancedTypeAnnotations = null;
        }
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((Object[]) new Annotations[]{annotations, enhancedTypeAnnotations, bool2 != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null})));
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt.collectionSizeOrDefault(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, bool2 != null ? bool2.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (javaTypeQualifiersInvoke.getDefinitelyNotNull()) {
            simpleTypeSimpleType$default = notNullTypeParameter(simpleTypeSimpleType$default);
        }
        return new SimpleResult(simpleTypeSimpleType$default, i12, bool2 != null && javaTypeQualifiersInvoke.isNullabilityQualifierForWarning());
    }

    public static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i11, TypeComponentPosition typeComponentPosition, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        if ((i12 & 16) != 0) {
            z12 = false;
        }
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i11, typeComponentPosition, z11, z12);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    private final Result enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i11, boolean z11) {
        KotlinType type;
        KotlinType kotlinTypeWrapEnhancement = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new Result(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            SimpleResult simpleResultEnhanceInflexible$default = enhanceInflexible$default(this, (SimpleType) unwrappedType, function1, i11, TypeComponentPosition.INFLEXIBLE, false, z11, 8, null);
            return new Result(simpleResultEnhanceInflexible$default.getForWarnings() ? TypeWithEnhancementKt.wrapEnhancement(unwrappedType, simpleResultEnhanceInflexible$default.getType()) : simpleResultEnhanceInflexible$default.getType(), simpleResultEnhanceInflexible$default.getSubtreeSize());
        }
        boolean z12 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        SimpleResult simpleResultEnhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function1, i11, TypeComponentPosition.FLEXIBLE_LOWER, z12, z11);
        SimpleResult simpleResultEnhanceInflexible2 = enhanceInflexible(flexibleType.getUpperBound(), function1, i11, TypeComponentPosition.FLEXIBLE_UPPER, z12, z11);
        simpleResultEnhanceInflexible.getSubtreeSize();
        simpleResultEnhanceInflexible2.getSubtreeSize();
        if (simpleResultEnhanceInflexible.getType() != null || simpleResultEnhanceInflexible2.getType() != null) {
            if (simpleResultEnhanceInflexible.getForWarnings() || simpleResultEnhanceInflexible2.getForWarnings()) {
                SimpleType type2 = simpleResultEnhanceInflexible2.getType();
                if (type2 == null) {
                    type = simpleResultEnhanceInflexible.getType();
                    Intrinsics.checkNotNull(type);
                } else {
                    SimpleType type3 = simpleResultEnhanceInflexible.getType();
                    if (type3 == null) {
                        type3 = type2;
                    }
                    type = KotlinTypeFactory.flexibleType(type3, type2);
                    if (type == null) {
                        type = simpleResultEnhanceInflexible.getType();
                        Intrinsics.checkNotNull(type);
                    }
                }
                kotlinTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, type);
            } else if (z12) {
                SimpleType type4 = simpleResultEnhanceInflexible.getType();
                if (type4 == null) {
                    type4 = flexibleType.getLowerBound();
                }
                SimpleType type5 = simpleResultEnhanceInflexible2.getType();
                if (type5 == null) {
                    type5 = flexibleType.getUpperBound();
                }
                kotlinTypeWrapEnhancement = new RawTypeImpl(type4, type5);
            } else {
                SimpleType type6 = simpleResultEnhanceInflexible.getType();
                if (type6 == null) {
                    type6 = flexibleType.getLowerBound();
                }
                SimpleType type7 = simpleResultEnhanceInflexible2.getType();
                if (type7 == null) {
                    type7 = flexibleType.getUpperBound();
                }
                kotlinTypeWrapEnhancement = KotlinTypeFactory.flexibleType(type6, type7);
            }
        }
        return new Result(kotlinTypeWrapEnhancement, simpleResultEnhanceInflexible.getSubtreeSize());
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        return this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true) : new NotNullTypeParameterImpl(simpleType);
    }

    @Nullable
    public final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z11) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z11).getType();
    }
}
