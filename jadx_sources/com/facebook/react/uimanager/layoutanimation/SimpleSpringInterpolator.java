package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SimpleSpringInterpolator.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;", "Landroid/view/animation/Interpolator;", SimpleSpringInterpolator.PARAM_SPRING_DAMPING, "", "<init>", "(F)V", "_springDamping", "getInterpolation", "input", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SimpleSpringInterpolator implements Interpolator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float FACTOR = 0.5f;

    @NotNull
    public static final String PARAM_SPRING_DAMPING = "springDamping";
    private final float _springDamping;

    /* JADX INFO: compiled from: SimpleSpringInterpolator.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator$Companion;", "", "<init>", "()V", "FACTOR", "", "PARAM_SPRING_DAMPING", "", "getSpringDamping", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final float getSpringDamping(@NotNull ReadableMap params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params.getType(SimpleSpringInterpolator.PARAM_SPRING_DAMPING) == ReadableType.Number) {
                return (float) params.getDouble(SimpleSpringInterpolator.PARAM_SPRING_DAMPING);
            }
            return 0.5f;
        }
    }

    @JvmOverloads
    public SimpleSpringInterpolator() {
        this(0.0f, 1, null);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        double dPow = Math.pow(2.0d, (-10) * input);
        float f11 = this._springDamping;
        return (float) (((double) 1) + (dPow * Math.sin(((((double) (input - (f11 / 4))) * 3.141592653589793d) * ((double) 2)) / ((double) f11))));
    }

    public /* synthetic */ SimpleSpringInterpolator(float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.5f : f11);
    }

    @JvmStatic
    public static final float getSpringDamping(@NotNull ReadableMap readableMap) {
        return INSTANCE.getSpringDamping(readableMap);
    }

    @JvmOverloads
    public SimpleSpringInterpolator(float f11) {
        this._springDamping = f11;
    }
}
