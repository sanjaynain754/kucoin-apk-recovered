package p852kotlin.reflect.jvm.internal.impl.types.model;

import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class TypeSystemContextKt {

    /* JADX INFO: compiled from: TypeSystemContext.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TypeVariance convertVariance(@NotNull Variance variance) {
        Intrinsics.checkNotNullParameter(variance, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i11 == 1) {
            return TypeVariance.INV;
        }
        if (i11 == 2) {
            return TypeVariance.IN;
        }
        if (i11 == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
