package com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BattleCountdownBackView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewPadding", "", "circlePaint", "Landroid/graphics/Paint;", "mArcPaint", "mRipplePaint", "mArcRect", "Landroid/graphics/RectF;", "mArcPath", "Landroid/graphics/Path;", "mCircleRadius", "", "mRotationAngle", "mRippleCircles", "", "Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$RippleCircle;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawCircle", "draw2Arc", "drawRipple", "genRippleCircleAlpha", "radius", "RippleCircle", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BattleCountdownBackView extends View {

    /* JADX INFO: renamed from: b */
    public final int f78212b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f78213c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Paint f78214d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Paint f78215e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final RectF f78216f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Path f78217g;

    /* JADX INFO: renamed from: h */
    public float f78218h;

    /* JADX INFO: renamed from: i */
    public int f78219i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<RippleCircle> f78220j;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorboardcast.view.battle.panel.BattleCountdownBackView$a, reason: from toString */
    /* JADX INFO: compiled from: BattleCountdownBackView.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/panel/BattleCountdownBackView$RippleCircle;", "", "radius", "", "alpha", "", "<init>", "(FI)V", "getRadius", "()F", "setRadius", "(F)V", "getAlpha", "()I", "setAlpha", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RippleCircle {

        /* JADX INFO: renamed from: a, reason: from toString */
        public float radius;

        /* JADX INFO: renamed from: b, reason: from toString */
        public int alpha;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RippleCircle)) {
                return false;
            }
            RippleCircle rippleCircle = (RippleCircle) other;
            return Float.compare(this.radius, rippleCircle.radius) == 0 && this.alpha == rippleCircle.alpha;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAlpha() {
            return this.alpha;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: c */
        public final void m80272c(int i11) {
            this.alpha = i11;
        }

        /* JADX INFO: renamed from: d */
        public final void m80273d(float f11) {
            this.radius = f11;
        }

        public int hashCode() {
            return (Float.hashCode(this.radius) * 31) + Integer.hashCode(this.alpha);
        }

        @NotNull
        public String toString() {
            return "RippleCircle(radius=" + this.radius + ", alpha=" + this.alpha + ')';
        }

        public RippleCircle(float f11, int i11) {
            this.radius = f11;
            this.alpha = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BattleCountdownBackView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public final int m80269d(float f11) {
        return (int) ((1 - ((f11 - this.f78218h) / this.f78212b)) * 255);
    }

    public /* synthetic */ BattleCountdownBackView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m80266a(Canvas canvas) {
        this.f78219i = (this.f78219i + 1) % TXVodDownloadDataSource.QUALITY_360P;
        Path path = this.f78217g;
        path.reset();
        path.addArc(this.f78216f, this.f78219i + 120.0f, 60.0f);
        path.addArc(this.f78216f, this.f78219i - 120.0f, 180.0f);
        canvas.drawPath(this.f78217g, this.f78214d);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int iMin = Math.min(width, height);
        if (this.f78218h == 0.0f) {
            float f11 = (iMin - (this.f78212b * 2)) / 2.0f;
            this.f78218h = f11;
            RectF rectF = this.f78216f;
            float f12 = 2;
            rectF.left = ((width - (f11 * f12)) - (this.f78214d.getStrokeWidth() / 2.0f)) / 2.0f;
            float strokeWidth = ((height - (this.f78218h * f12)) - (this.f78214d.getStrokeWidth() / 2.0f)) / 2.0f;
            rectF.top = strokeWidth;
            float f13 = rectF.left;
            float f14 = this.f78218h;
            rectF.right = f13 + (f14 * f12);
            rectF.bottom = strokeWidth + (f14 * f12);
        }
        m80267b(canvas);
        m80266a(canvas);
        m80268c(canvas);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BattleCountdownBackView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78212b = 80;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAlpha(204);
        paint.setAntiAlias(true);
        this.f78213c = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(6.0f);
        paint2.setAntiAlias(true);
        this.f78214d = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(2.0f);
        paint3.setAntiAlias(true);
        this.f78215e = paint3;
        this.f78216f = new RectF();
        this.f78217g = new Path();
        this.f78220j = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final void m80267b(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f78218h, this.f78213c);
    }

    /* JADX INFO: renamed from: c */
    public final void m80268c(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.f78220j.isEmpty()) {
            float f11 = this.f78218h;
            this.f78220j.add(new RippleCircle(f11, m80269d(f11)));
            float f12 = this.f78218h + (this.f78212b / 2.0f);
            this.f78220j.add(new RippleCircle(f12, m80269d(f12)));
        }
        for (RippleCircle rippleCircle : this.f78220j) {
            this.f78215e.setAlpha(rippleCircle.getAlpha());
            float f13 = width / 2.0f;
            canvas.drawCircle(f13, height / 2.0f, rippleCircle.getRadius(), this.f78215e);
            if (rippleCircle.getRadius() >= f13) {
                rippleCircle.m80273d(this.f78218h);
            } else {
                rippleCircle.m80273d(rippleCircle.getRadius() + 1);
            }
            rippleCircle.m80272c(m80269d(rippleCircle.getRadius()));
        }
    }
}
