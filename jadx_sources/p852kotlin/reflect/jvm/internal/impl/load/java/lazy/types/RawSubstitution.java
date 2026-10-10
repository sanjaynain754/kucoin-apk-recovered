package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import p852kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: RawSubstitution.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nRawSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1563#2:96\n1634#2,3:97\n*S KotlinDebug\n*F\n+ 1 RawSubstitution.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawSubstitution\n*L\n73#1:96\n73#1:97,3\n*E\n"})
public final class RawSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final JavaTypeAttributes lowerTypeAttr;

    @NotNull
    private static final JavaTypeAttributes upperTypeAttr;

    @NotNull
    private final RawProjectionComputer projectionComputer;

    @NotNull
    private final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;

    /* JADX INFO: compiled from: RawSubstitution.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        lowerTypeAttr = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        upperTypeAttr = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution(@Nullable TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.projectionComputer = rawProjectionComputer;
        this.typeParameterUpperBoundEraser = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, null) : typeParameterUpperBoundEraser;
    }

    private final Pair<SimpleType, Boolean> eraseInflexibleBasedOnClassDescriptor(final SimpleType simpleType, final ClassDescriptor classDescriptor, final JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return TuplesKt.m90091to(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return TuplesKt.m90091to(KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), CollectionsKt.listOf(new TypeProjectionImpl(projectionKind, eraseType(type, javaTypeAttributes))), simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null), Boolean.FALSE);
        }
        if (KotlinTypeKt.isError(simpleType)) {
            return TuplesKt.m90091to(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        Intrinsics.checkNotNullExpressionValue(memberScope, "getMemberScope(...)");
        TypeAttributes attributes = simpleType.getAttributes();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : parameters) {
            RawProjectionComputer rawProjectionComputer = this.projectionComputer;
            Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(ErasureProjectionComputer.computeProjection$default(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.typeParameterUpperBoundEraser, null, 8, null));
        }
        return TuplesKt.m90091to(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new Function1(classDescriptor, this, simpleType, javaTypeAttributes) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$$Lambda$0
            private final ClassDescriptor arg$0;
            private final RawSubstitution arg$1;
            private final SimpleType arg$2;
            private final JavaTypeAttributes arg$3;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return RawSubstitution.eraseInflexibleBasedOnClassDescriptor$lambda$2(this.arg$0, this.arg$1, this.arg$2, this.arg$3, (KotlinTypeRefiner) obj);
            }

            {
                this.arg$0 = classDescriptor;
                this.arg$1 = this;
                this.arg$2 = simpleType;
                this.arg$3 = javaTypeAttributes;
            }
        }), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType eraseInflexibleBasedOnClassDescriptor$lambda$2(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null || (classDescriptorFindClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || Intrinsics.areEqual(classDescriptorFindClassAcrossModuleDependencies, classDescriptor)) {
            return null;
        }
        return rawSubstitution.eraseInflexibleBasedOnClassDescriptor(simpleType, classDescriptorFindClassAcrossModuleDependencies, javaTypeAttributes).getFirst();
    }

    public static /* synthetic */ KotlinType eraseType$default(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.eraseType(kotlinType, javaTypeAttributes);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: get */
    public TypeProjectionImpl mo105131get(@NotNull KotlinType key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new TypeProjectionImpl(eraseType$default(this, key, null, 2, null));
    }

    private final KotlinType eraseType(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor = kotlinType.getConstructor().mo105126getDeclarationDescriptor();
        if (classifierDescriptorMo105126getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return eraseType(this.typeParameterUpperBoundEraser.getErasedUpperBound((TypeParameterDescriptor) classifierDescriptorMo105126getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true)), javaTypeAttributes);
        }
        if (classifierDescriptorMo105126getDeclarationDescriptor instanceof ClassDescriptor) {
            ClassifierDescriptor classifierDescriptorMo105126getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo105126getDeclarationDescriptor();
            if (classifierDescriptorMo105126getDeclarationDescriptor2 instanceof ClassDescriptor) {
                Pair<SimpleType, Boolean> pairEraseInflexibleBasedOnClassDescriptor = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor, lowerTypeAttr);
                SimpleType simpleTypeComponent1 = pairEraseInflexibleBasedOnClassDescriptor.component1();
                boolean zBooleanValue = pairEraseInflexibleBasedOnClassDescriptor.component2().booleanValue();
                Pair<SimpleType, Boolean> pairEraseInflexibleBasedOnClassDescriptor2 = eraseInflexibleBasedOnClassDescriptor(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo105126getDeclarationDescriptor2, upperTypeAttr);
                SimpleType simpleTypeComponent2 = pairEraseInflexibleBasedOnClassDescriptor2.component1();
                boolean zBooleanValue2 = pairEraseInflexibleBasedOnClassDescriptor2.component2().booleanValue();
                if (!zBooleanValue && !zBooleanValue2) {
                    return KotlinTypeFactory.flexibleType(simpleTypeComponent1, simpleTypeComponent2);
                }
                return new RawTypeImpl(simpleTypeComponent1, simpleTypeComponent2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo105126getDeclarationDescriptor2 + "\" while for lower it's \"" + classifierDescriptorMo105126getDeclarationDescriptor + '\"').toString());
        }
        throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorMo105126getDeclarationDescriptor).toString());
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
