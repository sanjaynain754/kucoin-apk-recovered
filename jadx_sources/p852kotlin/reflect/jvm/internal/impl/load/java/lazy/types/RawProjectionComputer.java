package p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import p852kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p852kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: RawProjectionComputer.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    /* JADX INFO: compiled from: RawProjectionComputer.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    @NotNull
    public TypeProjection computeProjection(@NotNull TypeParameterDescriptor parameter, @NotNull ErasureTypeAttributes typeAttr, @NotNull TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @NotNull KotlinType erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof JavaTypeAttributes)) {
            return super.computeProjection(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        JavaTypeAttributes javaTypeAttributesWithFlexibility = (JavaTypeAttributes) typeAttr;
        if (!javaTypeAttributesWithFlexibility.isRaw()) {
            javaTypeAttributesWithFlexibility = javaTypeAttributesWithFlexibility.withFlexibility(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[javaTypeAttributesWithFlexibility.getFlexibility().ordinal()];
        if (i11 == 1) {
            return new TypeProjectionImpl(Variance.INVARIANT, erasedUpperBound);
        }
        if (i11 != 2 && i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.getVariance().getAllowsOutPosition()) {
            return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.getBuiltIns(parameter).getNothingType());
        }
        List<TypeParameterDescriptor> parameters = erasedUpperBound.getConstructor().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new TypeProjectionImpl(Variance.OUT_VARIANCE, erasedUpperBound);
        }
        TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(parameter, javaTypeAttributesWithFlexibility);
        Intrinsics.checkNotNull(typeProjectionMakeStarProjection);
        return typeProjectionMakeStarProjection;
    }
}
