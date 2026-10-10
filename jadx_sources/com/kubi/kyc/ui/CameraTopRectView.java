package com.kubi.kyc.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.kyc.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CameraTopRectView.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001AB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016JP\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000207H\u0002J&\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tJ \u0010?\u001a\u0002092\u0006\u0010@\u001a\u0002092\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006B"}, m90084d2 = {"Lcom/kubi/kyc/ui/CameraTopRectView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "panelHeight", "", "panelWidth", "viewWidth", "viewHeight", "rectWidth", "rectHeight", "rectTop", "rectLeft", "rectRight", "rectBottom", "lineLen", "lineWidth", "linePaint", "Landroid/graphics/Paint;", "wordPaint", "rect", "Landroid/graphics/Rect;", "bottomTextPaint", "Landroid/text/TextPaint;", "getBottomTextPaint", "()Landroid/text/TextPaint;", "bottomTextPaint$delegate", "Lkotlin/Lazy;", "topRect", "leftRect", "rightRect", "bottomRect", "point", "Landroid/graphics/Point;", "getPoint", "()Landroid/graphics/Point;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "textCenter", TypedValues.Custom.S_STRING, "", "textPaint", "width", "align", "Landroid/text/Layout$Alignment;", "spacingmult", "", "spacingadd", "includepad", "", "getPicture", "Landroid/graphics/Bitmap;", "data", "", "orientation", "twidth", "theight", "cropBitmap", "originBitmap", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CameraTopRectView extends View {

    /* JADX INFO: renamed from: b */
    public final int f31267b;

    /* JADX INFO: renamed from: c */
    public final int f31268c;

    /* JADX INFO: renamed from: d */
    public final int f31269d;

    /* JADX INFO: renamed from: e */
    public final int f31270e;

    /* JADX INFO: renamed from: f */
    public int f31271f;

    /* JADX INFO: renamed from: g */
    public int f31272g;

    /* JADX INFO: renamed from: h */
    public final int f31273h;

    /* JADX INFO: renamed from: i */
    public final int f31274i;

    /* JADX INFO: renamed from: j */
    public final int f31275j;

    /* JADX INFO: renamed from: k */
    public final int f31276k;

    /* JADX INFO: renamed from: l */
    public final int f31277l;

    /* JADX INFO: renamed from: m */
    public final int f31278m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Paint f31279n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public Paint f31280o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public Rect f31281p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Lazy f31282q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Rect f31283r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Rect f31284s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final Rect f31285t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Rect f31286u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public final Point f31287v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Companion f31263w = new Companion(null);

    /* JADX INFO: renamed from: x */
    public static final int f31264x = C5275i0.m6236a(4.0f);

    /* JADX INFO: renamed from: y */
    public static final int f31265y = C5275i0.m6236a(8.0f);

    /* JADX INFO: renamed from: z */
    public static final int f31266z = C5275i0.m6236a(8.0f);

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final SparseIntArray f31262A = new SparseIntArray();

    /* JADX INFO: compiled from: CameraTopRectView.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/ui/CameraTopRectView$Companion;", "", "<init>", "()V", "LINE_WIDTH", "", "LEFT_PADDING", "RIGHT_PADDING", "ORIENTATIONS", "Landroid/util/SparseIntArray;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final TextPaint m36867b() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(C5275i0.m6241f(14.0f));
        textPaint.setColor(-1);
        return textPaint;
    }

    private final TextPaint getBottomTextPaint() {
        return (TextPaint) this.f31282q.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Bitmap m36868c(@NotNull byte[] data, float f11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(data, "data");
        Matrix matrix = new Matrix();
        matrix.postRotate(f11);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(data, 0, data.length);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m36869d(String str, TextPaint textPaint, Canvas canvas, Point point, int i11, Layout.Alignment alignment, float f11, float f12, boolean z11) {
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i11, alignment, f11, f12, z11);
        canvas.save();
        canvas.translate(((-staticLayout.getWidth()) / 2) + point.x, ((-staticLayout.getHeight()) / 2) + point.y);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    @NotNull
    /* JADX INFO: renamed from: getPoint, reason: from getter */
    public final Point getF31287v() {
        return this.f31287v;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f31280o.setColor(0);
        canvas.drawRect(this.f31281p, this.f31280o);
        this.f31280o.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f31280o.setAlpha(170);
        canvas.drawRect(this.f31283r, this.f31280o);
        canvas.drawRect(this.f31284s, this.f31280o);
        canvas.drawRect(this.f31285t, this.f31280o);
        canvas.drawRect(this.f31286u, this.f31280o);
        this.f31280o.setAlpha(255);
        String string = getContext().getString(R$string.kyc_camera_tip);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m36869d(string, getBottomTextPaint(), canvas, this.f31287v, this.f31271f, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i11 = this.f31274i;
        int i12 = this.f31278m;
        int i13 = this.f31273h;
        canvas.drawLine(i12 + i11, i13 + i12, i11 + i12 + this.f31277l, i13 + i12, this.f31279n);
        int i14 = this.f31275j;
        int i15 = i14 - this.f31277l;
        int i16 = this.f31278m;
        float f11 = i15 - i16;
        int i17 = this.f31273h;
        canvas.drawLine(f11, i17 + i16, i14 - i16, i17 + i16, this.f31279n);
        int i18 = this.f31274i;
        int i19 = this.f31278m;
        int i21 = this.f31273h;
        canvas.drawLine(i19 + i18, i21, i19 + i18, i21 + this.f31277l + i19, this.f31279n);
        int i22 = this.f31275j;
        int i23 = this.f31278m;
        int i24 = this.f31273h;
        canvas.drawLine(i22 - i23, i24, i22 - i23, i24 + this.f31277l + i23, this.f31279n);
        int i25 = this.f31274i;
        int i26 = this.f31278m;
        int i27 = this.f31276k;
        canvas.drawLine(i26 + i25, i27 - i26, i25 + this.f31277l + i26, i27 - i26, this.f31279n);
        int i28 = this.f31275j;
        int i29 = i28 - this.f31277l;
        int i31 = this.f31278m;
        float f12 = i29 - i31;
        int i32 = this.f31276k;
        canvas.drawLine(f12, i32 - i31, i28 - i31, i32 - i31, this.f31279n);
        int i33 = this.f31274i;
        int i34 = this.f31278m;
        int i35 = this.f31276k;
        canvas.drawLine(i34 + i33, i35 - this.f31277l, i33 + i34, i35, this.f31279n);
        int i36 = this.f31275j;
        int i37 = this.f31278m;
        int i38 = this.f31276k;
        canvas.drawLine(i36 - i37, i38 - this.f31277l, i36 - i37, i38, this.f31279n);
    }

    public CameraTopRectView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int iM6182d = C5267e0.m6182d();
        this.f31267b = iM6182d;
        int iM6183e = C5267e0.m6183e();
        this.f31268c = iM6183e;
        this.f31269d = iM6183e;
        this.f31270e = iM6182d;
        int iM6236a = iM6183e - C5275i0.m6236a(f31265y + f31266z);
        this.f31271f = iM6236a;
        this.f31272g = (iM6236a * 514) / 351;
        int iM6236a2 = C5275i0.m6236a(42.0f);
        this.f31273h = iM6236a2;
        int i11 = this.f31271f;
        int i12 = (iM6183e - i11) / 2;
        this.f31274i = i12;
        int i13 = i11 + i12;
        this.f31275j = i13;
        int i14 = this.f31272g + iM6236a2;
        this.f31276k = i14;
        this.f31277l = C5275i0.m6236a(16.0f);
        int i15 = f31264x;
        this.f31278m = i15 / 2;
        Paint paint = new Paint();
        this.f31279n = paint;
        SparseIntArray sparseIntArray = f31262A;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#c4c4c4"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i15);
        paint.setAlpha(255);
        Paint paint2 = new Paint();
        this.f31280o = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint(1);
        this.f31280o = paint3;
        paint3.setStrokeWidth(3.0f);
        this.f31280o.setTextSize(35.0f);
        this.f31281p = new Rect(i12, iM6236a2, i13, i14);
        this.f31280o.setTextAlign(Paint.Align.CENTER);
        this.f31282q = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraTopRectView.m36867b();
            }
        });
        this.f31283r = new Rect(0, 0, iM6183e, iM6236a2);
        this.f31284s = new Rect(0, iM6236a2, (iM6183e - this.f31271f) / 2, this.f31272g + iM6236a2);
        this.f31285t = new Rect(iM6183e - ((iM6183e - this.f31271f) / 2), iM6236a2, iM6183e, this.f31272g + iM6236a2);
        this.f31286u = new Rect(0, iM6236a2 + this.f31272g, iM6183e, iM6182d);
        this.f31287v = new Point(iM6183e / 2, this.f31281p.bottom + C5275i0.m6236a(24.0f));
    }
}
