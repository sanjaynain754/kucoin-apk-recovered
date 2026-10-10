package com.kubi.kyc.ui.kycv2.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClipOutPathView.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJP\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000204H\u0002J\u000e\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u000bJ\u0010\u00107\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$¨\u00068"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/ClipOutPathView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "text", "", "mPaint", "Landroid/graphics/Paint;", "mBgColor", "mPath", "Landroid/graphics/Path;", "besiePath", "panelWidth", "rectHeight", "rectTop", "rectLeft", "rectWidth", "rectRight", "rectBottom", "besierWith", "besierLinePaint", "linePaint", "realDrawPath", "point", "Landroid/graphics/Point;", "getPoint", "()Landroid/graphics/Point;", "bottomTextPaint", "Landroid/text/TextPaint;", "getBottomTextPaint", "()Landroid/text/TextPaint;", "bottomTextPaint$delegate", "Lkotlin/Lazy;", "textCenter", "", TypedValues.Custom.S_STRING, "textPaint", "canvas", "Landroid/graphics/Canvas;", "width", "align", "Landroid/text/Layout$Alignment;", "spacingmult", "", "spacingadd", "includepad", "", "setPhotoText", "photoText", "onDraw", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ClipOutPathView extends View {

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f31454b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public Paint f31455c;

    /* JADX INFO: renamed from: d */
    public int f31456d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public Path f31457e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public Path f31458f;

    /* JADX INFO: renamed from: g */
    public final int f31459g;

    /* JADX INFO: renamed from: h */
    public int f31460h;

    /* JADX INFO: renamed from: i */
    public final int f31461i;

    /* JADX INFO: renamed from: j */
    public final int f31462j;

    /* JADX INFO: renamed from: k */
    public final int f31463k;

    /* JADX INFO: renamed from: l */
    public final int f31464l;

    /* JADX INFO: renamed from: m */
    public final int f31465m;

    /* JADX INFO: renamed from: n */
    public final int f31466n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Paint f31467o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Paint f31468p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Path f31469q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Point f31470r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Lazy f31471s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipOutPathView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipOutPathView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public static final TextPaint m37211b() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(C5275i0.m6241f(14.0f));
        textPaint.setColor(-1);
        return textPaint;
    }

    private final TextPaint getBottomTextPaint() {
        return (TextPaint) this.f31471s.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m37212c(String str, TextPaint textPaint, Canvas canvas, Point point, int i11, Layout.Alignment alignment, float f11, float f12, boolean z11) {
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i11, alignment, f11, f12, z11);
        canvas.save();
        canvas.translate(((-staticLayout.getWidth()) / 2) + point.x, ((-staticLayout.getHeight()) / 2) + point.y + C27029c.m66601d(this, 16));
        staticLayout.draw(canvas);
        canvas.restore();
    }

    @NotNull
    /* JADX INFO: renamed from: getPoint, reason: from getter */
    public final Point getF31470r() {
        return this.f31470r;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f31458f.moveTo(this.f31462j + this.f31466n, this.f31461i);
        Path path = this.f31458f;
        int i11 = this.f31462j;
        int i12 = this.f31461i;
        path.quadTo(i11, i12, i11, i12 + this.f31466n);
        canvas.drawPath(this.f31458f, this.f31467o);
        this.f31458f.lineTo(this.f31462j, this.f31465m - this.f31466n);
        this.f31469q.moveTo(this.f31462j, this.f31461i + this.f31466n);
        this.f31469q.lineTo(this.f31462j, this.f31465m - this.f31466n);
        canvas.drawPath(this.f31469q, this.f31468p);
        this.f31469q.reset();
        this.f31469q.moveTo(this.f31462j, this.f31465m - this.f31466n);
        Path path2 = this.f31469q;
        int i13 = this.f31462j;
        int i14 = this.f31465m;
        path2.quadTo(i13, i14, i13 + this.f31466n, i14);
        canvas.drawPath(this.f31469q, this.f31467o);
        this.f31469q.reset();
        Path path3 = this.f31458f;
        int i15 = this.f31462j;
        int i16 = this.f31465m;
        path3.quadTo(i15, i16, i15 + this.f31466n, i16);
        this.f31469q.moveTo(this.f31462j + this.f31466n, this.f31465m);
        this.f31469q.lineTo(this.f31464l - this.f31466n, this.f31465m);
        canvas.drawPath(this.f31469q, this.f31468p);
        this.f31469q.reset();
        this.f31458f.lineTo(this.f31464l - this.f31466n, this.f31465m);
        this.f31469q.moveTo(this.f31464l - this.f31466n, this.f31465m);
        Path path4 = this.f31469q;
        int i17 = this.f31464l;
        int i18 = this.f31465m;
        path4.quadTo(i17, i18, i17, i18 - this.f31466n);
        canvas.drawPath(this.f31469q, this.f31467o);
        this.f31469q.reset();
        Path path5 = this.f31458f;
        int i19 = this.f31464l;
        int i21 = this.f31465m;
        path5.quadTo(i19, i21, i19, i21 - this.f31466n);
        this.f31469q.moveTo(this.f31464l, this.f31465m - this.f31466n);
        this.f31469q.lineTo(this.f31464l, this.f31461i + this.f31466n);
        canvas.drawPath(this.f31469q, this.f31468p);
        this.f31469q.reset();
        this.f31458f.lineTo(this.f31464l, this.f31461i + this.f31466n);
        this.f31469q.moveTo(this.f31464l, this.f31461i + this.f31466n);
        Path path6 = this.f31469q;
        int i22 = this.f31464l;
        int i23 = this.f31461i;
        path6.quadTo(i22, i23, i22 - this.f31466n, i23);
        canvas.drawPath(this.f31469q, this.f31467o);
        this.f31469q.reset();
        Path path7 = this.f31458f;
        int i24 = this.f31464l;
        int i25 = this.f31461i;
        path7.quadTo(i24, i25, i24 - this.f31466n, i25);
        this.f31469q.moveTo(this.f31464l - this.f31466n, this.f31461i);
        this.f31469q.lineTo(this.f31462j + this.f31466n, this.f31461i);
        canvas.drawPath(this.f31469q, this.f31468p);
        canvas.clipPath(this.f31458f, Region.Op.DIFFERENCE);
        canvas.drawColor(this.f31456d);
        String str = this.f31454b;
        if (str != null) {
            m37212c(str, getBottomTextPaint(), canvas, this.f31470r, this.f31463k, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
    }

    public final void setPhotoText(@NotNull String photoText) {
        Intrinsics.checkNotNullParameter(photoText, "photoText");
        this.f31454b = photoText;
        invalidate();
    }

    public /* synthetic */ ClipOutPathView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClipOutPathView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31455c = new Paint();
        this.f31457e = new Path();
        this.f31458f = new Path();
        int iM6183e = C5267e0.m6183e();
        this.f31459g = iM6183e;
        this.f31460h = C27029c.m66600c(this, 242.0f);
        int iM66600c = C27029c.m66600c(this, 84.0f);
        this.f31461i = iM66600c;
        this.f31462j = C27029c.m66600c(this, 16.0f);
        this.f31463k = iM6183e - C27029c.m66600c(this, 32.0f);
        this.f31464l = C5267e0.m6183e() - C27029c.m66600c(this, 16.0f);
        int i12 = iM66600c + this.f31460h;
        this.f31465m = i12;
        this.f31466n = C27029c.m66600c(this, 24.0f);
        Paint paint = new Paint();
        this.f31467o = paint;
        Paint paint2 = new Paint();
        this.f31468p = paint2;
        this.f31469q = new Path();
        this.f31470r = new Point(iM6183e / 2, i12 + C5275i0.m6236a(24.0f));
        this.f31471s = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.kycv2.camera.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClipOutPathView.m37211b();
            }
        });
        Paint paint3 = new Paint();
        this.f31455c = paint3;
        paint3.setAntiAlias(true);
        this.f31455c.setColor(0);
        this.f31456d = Color.parseColor("#80000000");
        this.f31457e = new Path();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#FFFFFF"));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(C27029c.m66600c(this, 2.0f));
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#FFFFFF"));
        paint2.setStyle(style);
        paint2.setStrokeWidth(C27029c.m66600c(this, 1.0f));
    }
}
