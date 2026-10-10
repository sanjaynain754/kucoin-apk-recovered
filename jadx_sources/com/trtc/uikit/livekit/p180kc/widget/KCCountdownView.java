package com.trtc.uikit.livekit.p180kc.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.timepicker.TimeModel;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: KCCountdownView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r*\u0001\u001e\u0018\u00002\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0013J\u0006\u0010\"\u001a\u00020\u0018J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0014J@\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J\b\u00101\u001a\u00020\u0018H\u0014J\u000e\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0011J\u000e\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0011J\u0010\u00105\u001a\u00020\u00182\b\b\u0001\u00106\u001a\u00020\u0007J\u0010\u00107\u001a\u00020\u00182\b\b\u0001\u00106\u001a\u00020\u0007J\u0010\u00108\u001a\u00020\u00182\b\b\u0001\u00106\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006:"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "numberPaint", "Landroid/graphics/Paint;", "labelPaint", "backgroundPaint", "rectF", "Landroid/graphics/RectF;", "cornerRadius", "", "targetTimeMillis", "", "currentTimeData", "Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$TimeData;", "onCountdownFinishListener", "Lkotlin/Function0;", "", "getOnCountdownFinishListener", "()Lkotlin/jvm/functions/Function0;", "setOnCountdownFinishListener", "(Lkotlin/jvm/functions/Function0;)V", "countdownRunnable", "com/trtc/uikit/livekit/kc/widget/KCCountdownView$countdownRunnable$1", "Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$countdownRunnable$1;", "setTargetTime", "targetMillis", "stopCountdown", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawTimeUnit", "left", ViewProps.TOP, "width", "height", "value", Constants.ScionAnalytics.PARAM_LABEL, "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDetachedFromWindow", "setNumberTextSize", "size", "setLabelTextSize", "setNumberTextColor", "color", "setLabelTextColor", "setItemBackgroundColor", "TimeData", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCCountdownView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f79236b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f79237c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Paint f79238d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final RectF f79239e;

    /* JADX INFO: renamed from: f */
    public final float f79240f;

    /* JADX INFO: renamed from: g */
    public long f79241g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public TimeData f79242h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Unit> f79243i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final RunnableC36438b f79244j;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCCountdownView$a, reason: from toString */
    /* JADX INFO: compiled from: KCCountdownView.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$TimeData;", "", "days", "", "hours", "minutes", "seconds", "<init>", "(JJJJ)V", "getDays", "()J", "getHours", "getMinutes", "getSeconds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TimeData {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final long days;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final long hours;

        /* JADX INFO: renamed from: c, reason: from toString */
        public final long minutes;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final long seconds;

        public TimeData() {
            this(0L, 0L, 0L, 0L, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeData)) {
                return false;
            }
            TimeData timeData = (TimeData) other;
            return this.days == timeData.days && this.hours == timeData.hours && this.minutes == timeData.minutes && this.seconds == timeData.seconds;
        }

        public TimeData(long j11, long j12, long j13, long j14) {
            this.days = j11;
            this.hours = j12;
            this.minutes = j13;
            this.seconds = j14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDays() {
            return this.days;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getHours() {
            return this.hours;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getMinutes() {
            return this.minutes;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSeconds() {
            return this.seconds;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.days) * 31) + Long.hashCode(this.hours)) * 31) + Long.hashCode(this.minutes)) * 31) + Long.hashCode(this.seconds);
        }

        @NotNull
        public String toString() {
            return "TimeData(days=" + this.days + ", hours=" + this.hours + ", minutes=" + this.minutes + ", seconds=" + this.seconds + ')';
        }

        public /* synthetic */ TimeData(long j11, long j12, long j13, long j14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12, (i11 & 4) != 0 ? 0L : j13, (i11 & 8) != 0 ? 0L : j14);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCCountdownView$b */
    /* JADX INFO: compiled from: KCCountdownView.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/trtc/uikit/livekit/kc/widget/KCCountdownView$countdownRunnable$1", "Ljava/lang/Runnable;", "run", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC36438b implements Runnable {
        public RunnableC36438b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = KCCountdownView.this.f79241g - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                KCCountdownView.this.f79242h = new TimeData(0L, 0L, 0L, 0L);
                KCCountdownView.this.invalidate();
                Function0<Unit> onCountdownFinishListener = KCCountdownView.this.getOnCountdownFinishListener();
                if (onCountdownFinishListener != null) {
                    onCountdownFinishListener.invoke();
                    return;
                }
                return;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j11 = 60;
            KCCountdownView.this.f79242h = new TimeData(timeUnit.toDays(jCurrentTimeMillis), timeUnit.toHours(jCurrentTimeMillis) % ((long) 24), timeUnit.toMinutes(jCurrentTimeMillis) % j11, timeUnit.toSeconds(jCurrentTimeMillis) % j11);
            KCCountdownView.this.invalidate();
            KCCountdownView.this.postDelayed(this, 1000L);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCCountdownView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m81651c(Canvas canvas, float f11, float f12, float f13, float f14, long j11, String str) {
        this.f79239e.set(f11, f12, f11 + f13, f12 + f14);
        RectF rectF = this.f79239e;
        float f15 = this.f79240f;
        canvas.drawRoundRect(rectF, f15, f15, this.f79238d);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        float f16 = 2;
        float f17 = f12 + (f14 / f16);
        float f18 = f11 + (f13 / f16);
        canvas.drawText(str2, f18, (f17 - ((this.f79236b.descent() + this.f79236b.ascent()) / f16)) - 15.0f, this.f79236b);
        canvas.drawText(str, f18, (f17 - ((this.f79237c.descent() + this.f79237c.ascent()) / f16)) + 25.0f, this.f79237c);
    }

    /* JADX INFO: renamed from: d */
    public final void m81652d() {
        removeCallbacks(this.f79244j);
    }

    @Nullable
    public final Function0<Unit> getOnCountdownFinishListener() {
        return this.f79243i;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f11 = (width - 60.0f) / 4.0f;
        m81651c(canvas, 0.0f, 0.0f, f11, height, this.f79242h.getDays(), "天");
        float f12 = f11 + 20.0f;
        m81651c(canvas, f12, 0.0f, f11, height, this.f79242h.getHours(), "小时");
        m81651c(canvas, f12 * 2, 0.0f, f11, height, this.f79242h.getMinutes(), "分钟");
        m81651c(canvas, f12 * 3, 0.0f, f11, height, this.f79242h.getSeconds(), "秒");
    }

    public final void setItemBackgroundColor(@ColorInt int color) {
        this.f79238d.setColor(color);
        invalidate();
    }

    public final void setLabelTextColor(@ColorInt int color) {
        this.f79237c.setColor(color);
        invalidate();
    }

    public final void setLabelTextSize(float size) {
        this.f79237c.setTextSize(size);
        invalidate();
    }

    public final void setNumberTextColor(@ColorInt int color) {
        this.f79236b.setColor(color);
        invalidate();
    }

    public final void setNumberTextSize(float size) {
        this.f79236b.setTextSize(size);
        invalidate();
    }

    public final void setOnCountdownFinishListener(@Nullable Function0<Unit> function0) {
        this.f79243i = function0;
    }

    public final void setTargetTime(long targetMillis) {
        this.f79241g = targetMillis;
        removeCallbacks(this.f79244j);
        post(this.f79244j);
    }

    public /* synthetic */ KCCountdownView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81652d();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = 320;
            }
        } else {
            size = Math.min(320, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = 100;
            }
        } else {
            size2 = Math.min(100, size2);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setTextSize(48.0f);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setFakeBoldText(true);
        this.f79236b = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor("#99FFFFFF"));
        paint2.setTextSize(24.0f);
        paint2.setTextAlign(align);
        this.f79237c = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.parseColor("#66000000"));
        paint3.setStyle(Paint.Style.FILL);
        this.f79238d = paint3;
        this.f79239e = new RectF();
        this.f79240f = 12.0f;
        this.f79242h = new TimeData(0L, 0L, 0L, 0L, 15, null);
        this.f79244j = new RunnableC36438b();
    }
}
