package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.YogaMeasureMode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MeasureUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/views/view/MeasureUtil;", "", "<init>", "()V", "getMeasureSpec", "", "size", "", "mode", "Lcom/facebook/yoga/YogaMeasureMode;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MeasureUtil {

    @NotNull
    public static final MeasureUtil INSTANCE = new MeasureUtil();

    /* JADX INFO: compiled from: MeasureUtil.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[YogaMeasureMode.values().length];
            try {
                iArr[YogaMeasureMode.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[YogaMeasureMode.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final int getMeasureSpec(float size, @NotNull YogaMeasureMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i11 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) size, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec((int) size, 1073741824);
    }

    private MeasureUtil() {
    }
}
