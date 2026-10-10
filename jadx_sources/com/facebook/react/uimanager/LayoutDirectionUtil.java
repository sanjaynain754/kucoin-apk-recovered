package com.facebook.react.uimanager;

import com.facebook.yoga.YogaDirection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutDirectionUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/uimanager/LayoutDirectionUtil;", "", "<init>", "()V", "toAndroidFromYoga", "", "direction", "Lcom/facebook/yoga/YogaDirection;", "toYogaFromAndroid", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LayoutDirectionUtil {

    @NotNull
    public static final LayoutDirectionUtil INSTANCE = new LayoutDirectionUtil();

    /* JADX INFO: compiled from: LayoutDirectionUtil.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[YogaDirection.values().length];
            try {
                iArr[YogaDirection.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[YogaDirection.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final int toAndroidFromYoga(@NotNull YogaDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i11 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? 2 : 1;
        }
        return 0;
    }

    @JvmStatic
    @NotNull
    public static final YogaDirection toYogaFromAndroid(int direction) {
        if (direction != 0) {
            return direction != 1 ? YogaDirection.INHERIT : YogaDirection.RTL;
        }
        return YogaDirection.LTR;
    }

    private LayoutDirectionUtil() {
    }
}
