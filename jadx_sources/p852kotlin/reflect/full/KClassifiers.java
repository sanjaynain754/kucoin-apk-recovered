package p852kotlin.reflect.full;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.SinceKotlin;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import p852kotlin.reflect.KTypeProjection;
import p852kotlin.reflect.KVariance;
import p852kotlin.reflect.jvm.internal.KClassifierImpl;
import p852kotlin.reflect.jvm.internal.KTypeImpl;
import p852kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;
import p852kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: KClassifiers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007\u001a.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"createType", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "nullable", "", "annotations", "", "createKotlinType", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", JAnalysisConstants.EVENT_ATTRIBUTES, "Lkotlin/reflect/jvm/internal/impl/types/TypeAttributes;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;", "starProjectedType", "getStarProjectedType$annotations", "(Lkotlin/reflect/KClassifier;)V", "getStarProjectedType", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KType;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "KClassifiers")
@SourceDebugExtension({"SMAP\nKClassifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1573#2:98\n1604#2,4:99\n1563#2:103\n1634#2,3:104\n*S KotlinDebug\n*F\n+ 1 KClassifiers.kt\nkotlin/reflect/full/KClassifiers\n*L\n69#1:98\n69#1:99,4\n95#1:103\n95#1:104,3\n*E\n"})
public final class KClassifiers {

    /* JADX INFO: compiled from: KClassifiers.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final KType createType(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> arguments, boolean z11, @NotNull List<? extends Annotation> annotations) {
        ClassifierDescriptor descriptor;
        Intrinsics.checkNotNullParameter(kClassifier, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        KClassifierImpl kClassifierImpl = kClassifier instanceof KClassifierImpl ? (KClassifierImpl) kClassifier : null;
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + kClassifier + " (" + kClassifier.getClass() + ')');
        }
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new KTypeImpl(createKotlinType(annotations.isEmpty() ? TypeAttributes.Companion.getEmpty() : TypeAttributes.Companion.getEmpty(), typeConstructor, arguments, z11), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }

    public static /* synthetic */ KType createType$default(KClassifier kClassifier, List list, boolean z11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return createType(kClassifier, list, z11, list2);
    }

    @NotNull
    public static final KType getStarProjectedType(@NotNull KClassifier kClassifier) {
        ClassifierDescriptor descriptor;
        Intrinsics.checkNotNullParameter(kClassifier, "<this>");
        KClassifierImpl kClassifierImpl = kClassifier instanceof KClassifierImpl ? (KClassifierImpl) kClassifier : null;
        if (kClassifierImpl == null || (descriptor = kClassifierImpl.getDescriptor()) == null) {
            return createType$default(kClassifier, null, false, null, 7, null);
        }
        List<TypeParameterDescriptor> parameters = descriptor.getTypeConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (parameters.isEmpty()) {
            return createType$default(kClassifier, null, false, null, 7, null);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : parameters) {
            arrayList.add(KTypeProjection.INSTANCE.getSTAR());
        }
        return createType$default(kClassifier, arrayList, false, null, 6, null);
    }

    private static final SimpleType createKotlinType(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<KTypeProjection> list, boolean z11) {
        KotlinType type;
        int i11;
        TypeProjectionBase starProjectionImpl;
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) kTypeProjection.getType();
            if (kTypeImpl != null) {
                type = kTypeImpl.getType();
            } else {
                type = null;
            }
            KVariance variance = kTypeProjection.getVariance();
            if (variance == null) {
                i11 = -1;
            } else {
                i11 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
            }
            if (i11 != -1) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            Variance variance2 = Variance.OUT_VARIANCE;
                            Intrinsics.checkNotNull(type);
                            starProjectionImpl = new TypeProjectionImpl(variance2, type);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        Variance variance3 = Variance.IN_VARIANCE;
                        Intrinsics.checkNotNull(type);
                        starProjectionImpl = new TypeProjectionImpl(variance3, type);
                    }
                } else {
                    Variance variance4 = Variance.INVARIANT;
                    Intrinsics.checkNotNull(type);
                    starProjectionImpl = new TypeProjectionImpl(variance4, type);
                }
            } else {
                TypeParameterDescriptor typeParameterDescriptor = parameters.get(i12);
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "get(...)");
                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            }
            arrayList.add(starProjectionImpl);
            i12 = i13;
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, arrayList, z11, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getStarProjectedType$annotations(KClassifier kClassifier) {
    }
}
