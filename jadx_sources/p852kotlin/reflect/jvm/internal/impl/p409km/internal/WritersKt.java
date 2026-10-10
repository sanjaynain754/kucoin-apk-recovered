package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import p852kotlin.reflect.jvm.internal.impl.metadata.serialization.MutableVersionRequirementTable;
import p852kotlin.reflect.jvm.internal.impl.p409km.Attributes;
import p852kotlin.reflect.jvm.internal.impl.p409km.InconsistentKotlinMetadataException;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmClassifier;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmEffectInvocationKind;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmEffectType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmFlexibleTypeUpperBound;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmPropertyAccessorAttributes;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeProjection;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmValueParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmVariance;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmVersion;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmVersionRequirement;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmVersionRequirementLevel;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmVersionRequirementVersionKind;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.MetadataExtensions;

/* JADX INFO: compiled from: Writers.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nWriters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Writers.kt\nkotlin/metadata/internal/WritersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1869#2,2:428\n1869#2,2:430\n1869#2,2:432\n1869#2,2:435\n1869#2,2:437\n1617#2,9:439\n1869#2:448\n1870#2:450\n1626#2:451\n1869#2,2:452\n1563#2:454\n1634#2,3:455\n1563#2:458\n1634#2,3:459\n1563#2:462\n1634#2,3:463\n1617#2,9:466\n1869#2:475\n1870#2:477\n1626#2:478\n1869#2,2:479\n1869#2,2:481\n1563#2:483\n1634#2,3:484\n1617#2,9:487\n1869#2:496\n1870#2:498\n1626#2:499\n1869#2,2:500\n1869#2,2:502\n1563#2:504\n1634#2,3:505\n1563#2:508\n1634#2,3:509\n1617#2,9:512\n1869#2:521\n1870#2:523\n1626#2:524\n1869#2,2:525\n1869#2,2:527\n1563#2:529\n1634#2,3:530\n1563#2:533\n1634#2,3:534\n1563#2:537\n1634#2,3:538\n1563#2:541\n1634#2,3:542\n1#3:434\n1#3:449\n1#3:476\n1#3:497\n1#3:522\n*S KotlinDebug\n*F\n+ 1 Writers.kt\nkotlin/metadata/internal/WritersKt\n*L\n39#1:428,2\n42#1:430,2\n85#1:432,2\n97#1:435,2\n112#1:437,2\n115#1:439,9\n115#1:448\n115#1:450\n115#1:451\n116#1:452,2\n129#1:454\n129#1:455,3\n133#1:458\n133#1:459,3\n134#1:462\n134#1:463,3\n136#1:466,9\n136#1:475\n136#1:477\n136#1:478\n141#1:479,2\n156#1:481,2\n162#1:483\n162#1:484,3\n165#1:487,9\n165#1:496\n165#1:498\n165#1:499\n167#1:500,2\n196#1:502,2\n210#1:504\n210#1:505,3\n213#1:508\n213#1:509,3\n214#1:512,9\n214#1:521\n214#1:523\n214#1:524\n215#1:525,2\n271#1:527,2\n280#1:529\n280#1:530,3\n290#1:533\n290#1:534,3\n325#1:537\n325#1:538,3\n326#1:541\n326#1:542,3\n115#1:449\n136#1:476\n165#1:497\n214#1:522\n*E\n"})
public final class WritersKt {

    /* JADX INFO: compiled from: Writers.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[KmVersionRequirementVersionKind.values().length];
            try {
                iArr[KmVersionRequirementVersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KmVersionRequirementLevel.values().length];
            try {
                iArr2[KmVersionRequirementLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KmVersionRequirementLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KmVersionRequirementLevel.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[KmEffectType.values().length];
            try {
                iArr3[KmEffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[KmEffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[KmEffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[KmEffectInvocationKind.values().length];
            try {
                iArr4[KmEffectInvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[KmEffectInvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[KmEffectInvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @NotNull
    public static final ProtoBuf.Property.Builder writeProperty(@NotNull WriteContext writeContext, @NotNull KmProperty kmProperty) {
        Intrinsics.checkNotNullParameter(writeContext, "<this>");
        Intrinsics.checkNotNullParameter(kmProperty, "kmProperty");
        ProtoBuf.Property.Builder builderNewBuilder = ProtoBuf.Property.newBuilder();
        Iterator<T> it = kmProperty.getTypeParameters().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addTypeParameter(writeTypeParameter(writeContext, (KmTypeParameter) it.next()).build());
        }
        KmType receiverParameterType = kmProperty.getReceiverParameterType();
        if (receiverParameterType != null) {
            builderNewBuilder.setReceiverType(writeType(writeContext, receiverParameterType).build());
        }
        List<KmType> contextReceiverTypes = kmProperty.getContextReceiverTypes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contextReceiverTypes, 10));
        Iterator<T> it2 = contextReceiverTypes.iterator();
        while (it2.hasNext()) {
            arrayList.add(writeType(writeContext, (KmType) it2.next()).build());
        }
        builderNewBuilder.addAllContextReceiverType(arrayList);
        KmValueParameter setterParameter = kmProperty.getSetterParameter();
        if (setterParameter != null) {
            builderNewBuilder.setSetterValueParameter(writeValueParameter(writeContext, setterParameter).build());
        }
        builderNewBuilder.setReturnType(writeType(writeContext, kmProperty.getReturnType()).build());
        List<KmVersionRequirement> versionRequirements = kmProperty.getVersionRequirements();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = versionRequirements.iterator();
        while (it3.hasNext()) {
            Integer numWriteVersionRequirement = writeVersionRequirement(writeContext, (KmVersionRequirement) it3.next());
            if (numWriteVersionRequirement != null) {
                arrayList2.add(numWriteVersionRequirement);
            }
        }
        builderNewBuilder.addAllVersionRequirement(arrayList2);
        for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            Intrinsics.checkNotNull(builderNewBuilder);
            metadataExtensions.writePropertyExtensions(kmProperty, builderNewBuilder, writeContext);
        }
        builderNewBuilder.setName(writeContext.get(kmProperty.getName()));
        int flags$kotlin_metadata = kmProperty.getFlags$kotlin_metadata();
        Flags.BooleanFlagField booleanFlagField = Flags.HAS_ANNOTATIONS;
        int flags = flags$kotlin_metadata | booleanFlagField.toFlags(Boolean.valueOf(!kmProperty.getAnnotations().isEmpty()));
        if (flags != ProtoBuf.Property.getDefaultInstance().getFlags()) {
            builderNewBuilder.setFlags(flags);
        }
        builderNewBuilder.setGetterFlags(kmProperty.getGetter().getFlags$kotlin_metadata() | booleanFlagField.toFlags(Boolean.valueOf(!kmProperty.getGetter().getAnnotations().isEmpty())));
        KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            builderNewBuilder.setSetterFlags(booleanFlagField.toFlags(Boolean.valueOf(!setter.getAnnotations().isEmpty())) | setter.getFlags$kotlin_metadata());
        }
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder;
    }

    private static final ProtoBuf.Type.Builder writeType(WriteContext writeContext, KmType kmType) {
        ProtoBuf.Type.Builder builderNewBuilder = ProtoBuf.Type.newBuilder();
        KmClassifier classifier = kmType.getClassifier();
        if (classifier instanceof KmClassifier.Class) {
            builderNewBuilder.setClassName(writeContext.getClassName$kotlin_metadata(((KmClassifier.Class) classifier).getName()));
        } else if (classifier instanceof KmClassifier.TypeAlias) {
            builderNewBuilder.setTypeAliasName(writeContext.getClassName$kotlin_metadata(((KmClassifier.TypeAlias) classifier).getName()));
        } else if (classifier instanceof KmClassifier.TypeParameter) {
            builderNewBuilder.setTypeParameter(((KmClassifier.TypeParameter) classifier).getId());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it = kmType.getArguments().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addArgument(writeTypeProjection(writeContext, (KmTypeProjection) it.next()));
        }
        KmType abbreviatedType = kmType.getAbbreviatedType();
        if (abbreviatedType != null) {
            builderNewBuilder.setAbbreviatedType(writeType(writeContext, abbreviatedType).build());
        }
        KmType outerType = kmType.getOuterType();
        if (outerType != null) {
            builderNewBuilder.setOuterType(writeType(writeContext, outerType).build());
        }
        KmFlexibleTypeUpperBound flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
        if (flexibleTypeUpperBound != null) {
            ProtoBuf.Type.Builder builderWriteType = writeType(writeContext, flexibleTypeUpperBound.getType());
            String typeFlexibilityId = flexibleTypeUpperBound.getTypeFlexibilityId();
            if (typeFlexibilityId != null) {
                builderNewBuilder.setFlexibleTypeCapabilitiesId(writeContext.get(typeFlexibilityId));
            }
            builderNewBuilder.setFlexibleUpperBound(builderWriteType.build());
        }
        for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            Intrinsics.checkNotNull(builderNewBuilder);
            metadataExtensions.writeTypeExtensions(kmType, builderNewBuilder, writeContext);
        }
        if (Attributes.isNullable(kmType)) {
            builderNewBuilder.setNullable(true);
        }
        int flags$kotlin_metadata = kmType.getFlags$kotlin_metadata() >> 1;
        if (flags$kotlin_metadata != ProtoBuf.Type.getDefaultInstance().getFlags()) {
            builderNewBuilder.setFlags(flags$kotlin_metadata);
        }
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder;
    }

    private static final ProtoBuf.TypeParameter.Builder writeTypeParameter(WriteContext writeContext, KmTypeParameter kmTypeParameter) {
        ProtoBuf.TypeParameter.Builder builderNewBuilder = ProtoBuf.TypeParameter.newBuilder();
        Iterator<T> it = kmTypeParameter.getUpperBounds().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addUpperBound(writeType(writeContext, (KmType) it.next()).build());
        }
        for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            Intrinsics.checkNotNull(builderNewBuilder);
            metadataExtensions.writeTypeParameterExtensions(kmTypeParameter, builderNewBuilder, writeContext);
        }
        builderNewBuilder.setName(writeContext.get(kmTypeParameter.getName()));
        builderNewBuilder.setId(kmTypeParameter.getId());
        boolean zIsReified = Attributes.isReified(kmTypeParameter);
        if (zIsReified != ProtoBuf.TypeParameter.getDefaultInstance().getReified()) {
            builderNewBuilder.setReified(zIsReified);
        }
        if (kmTypeParameter.getVariance() == KmVariance.IN) {
            builderNewBuilder.setVariance(ProtoBuf.TypeParameter.Variance.IN);
        } else if (kmTypeParameter.getVariance() == KmVariance.OUT) {
            builderNewBuilder.setVariance(ProtoBuf.TypeParameter.Variance.OUT);
        }
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder;
    }

    private static final ProtoBuf.Type.Argument.Builder writeTypeProjection(WriteContext writeContext, KmTypeProjection kmTypeProjection) {
        ProtoBuf.Type.Argument.Builder builderNewBuilder = ProtoBuf.Type.Argument.newBuilder();
        if (Intrinsics.areEqual(kmTypeProjection, KmTypeProjection.STAR)) {
            builderNewBuilder.setProjection(ProtoBuf.Type.Argument.Projection.STAR);
        } else {
            KmVariance kmVarianceComponent1 = kmTypeProjection.component1();
            KmType kmTypeComponent2 = kmTypeProjection.component2();
            if (kmVarianceComponent1 != null && kmTypeComponent2 != null) {
                if (kmVarianceComponent1 == KmVariance.IN) {
                    builderNewBuilder.setProjection(ProtoBuf.Type.Argument.Projection.IN);
                } else if (kmVarianceComponent1 == KmVariance.OUT) {
                    builderNewBuilder.setProjection(ProtoBuf.Type.Argument.Projection.OUT);
                }
                builderNewBuilder.setType(writeType(writeContext, kmTypeComponent2).build());
            } else {
                throw new InconsistentKotlinMetadataException("Variance and type must be set for non-star type projection", null, 2, null);
            }
        }
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder;
    }

    private static final ProtoBuf.ValueParameter.Builder writeValueParameter(WriteContext writeContext, KmValueParameter kmValueParameter) {
        ProtoBuf.ValueParameter.Builder builderNewBuilder = ProtoBuf.ValueParameter.newBuilder();
        builderNewBuilder.setType(writeType(writeContext, kmValueParameter.getType()).build());
        KmType varargElementType = kmValueParameter.getVarargElementType();
        if (varargElementType != null) {
            builderNewBuilder.setVarargElementType(writeType(writeContext, varargElementType).build());
        }
        KmAnnotationArgument annotationParameterDefaultValue = kmValueParameter.getAnnotationParameterDefaultValue();
        if (annotationParameterDefaultValue != null) {
            builderNewBuilder.setAnnotationParameterDefaultValue(WriteUtilsKt.writeAnnotationArgument(annotationParameterDefaultValue, writeContext.getStrings()).build());
        }
        for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            Intrinsics.checkNotNull(builderNewBuilder);
            metadataExtensions.writeValueParameterExtensions(kmValueParameter, builderNewBuilder, writeContext);
        }
        int flags$kotlin_metadata = kmValueParameter.getFlags$kotlin_metadata() | Flags.HAS_ANNOTATIONS.toFlags(Boolean.valueOf(!kmValueParameter.getAnnotations().isEmpty()));
        if (flags$kotlin_metadata != ProtoBuf.ValueParameter.getDefaultInstance().getFlags()) {
            builderNewBuilder.setFlags(flags$kotlin_metadata);
        }
        builderNewBuilder.setName(writeContext.get(kmValueParameter.getName()));
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder;
    }

    private static final Integer writeVersionRequirement(WriteContext writeContext, KmVersionRequirement kmVersionRequirement) {
        ProtoBuf.VersionRequirement.VersionKind versionKind;
        ProtoBuf.VersionRequirement.Level level;
        KmVersionRequirementVersionKind kind = kmVersionRequirement.getKind();
        KmVersionRequirementLevel level2 = kmVersionRequirement.getLevel();
        Integer errorCode = kmVersionRequirement.getErrorCode();
        String message = kmVersionRequirement.getMessage();
        final ProtoBuf.VersionRequirement.Builder builderNewBuilder = ProtoBuf.VersionRequirement.newBuilder();
        int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                versionKind = ProtoBuf.VersionRequirement.VersionKind.API_VERSION;
            } else {
                versionKind = ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION;
            }
        } else {
            versionKind = ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION;
        }
        if (versionKind != builderNewBuilder.getDefaultInstanceForType().getVersionKind()) {
            builderNewBuilder.setVersionKind(versionKind);
        }
        int i12 = WhenMappings.$EnumSwitchMapping$1[level2.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    level = ProtoBuf.VersionRequirement.Level.HIDDEN;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                level = ProtoBuf.VersionRequirement.Level.ERROR;
            }
        } else {
            level = ProtoBuf.VersionRequirement.Level.WARNING;
        }
        if (level != builderNewBuilder.getDefaultInstanceForType().getLevel()) {
            builderNewBuilder.setLevel(level);
        }
        if (errorCode != null) {
            builderNewBuilder.setErrorCode(errorCode.intValue());
        }
        if (message != null) {
            builderNewBuilder.setMessage(writeContext.get(message));
        }
        KmVersion version = kmVersionRequirement.getVersion();
        new VersionRequirement.Version(version.component1(), version.component2(), version.component3()).encode(new Function1(builderNewBuilder) { // from class: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt$$Lambda$0
            private final ProtoBuf.VersionRequirement.Builder arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return WritersKt.writeVersionRequirement$lambda$32(this.arg$0, ((Number) obj).intValue());
            }

            {
                this.arg$0 = builderNewBuilder;
            }
        }, new Function1(builderNewBuilder) { // from class: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt$$Lambda$1
            private final ProtoBuf.VersionRequirement.Builder arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return WritersKt.writeVersionRequirement$lambda$33(this.arg$0, ((Number) obj).intValue());
            }

            {
                this.arg$0 = builderNewBuilder;
            }
        });
        MutableVersionRequirementTable versionRequirements$kotlin_metadata = writeContext.getVersionRequirements$kotlin_metadata();
        Intrinsics.checkNotNull(builderNewBuilder);
        return Integer.valueOf(versionRequirements$kotlin_metadata.get(builderNewBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeVersionRequirement$lambda$32(ProtoBuf.VersionRequirement.Builder builder, int i11) {
        Intrinsics.checkNotNull(builder);
        builder.setVersion(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeVersionRequirement$lambda$33(ProtoBuf.VersionRequirement.Builder builder, int i11) {
        Intrinsics.checkNotNull(builder);
        builder.setVersionFull(i11);
        return Unit.INSTANCE;
    }
}
