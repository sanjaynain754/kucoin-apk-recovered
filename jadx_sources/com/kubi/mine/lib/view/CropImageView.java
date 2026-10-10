package com.kubi.mine.lib.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.kubi.mine.R$color;
import com.kubi.utils.C27017c;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CropImageView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0017J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u000bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020$H\u0002J\b\u0010/\u001a\u00020$H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/mine/lib/view/CropImageView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "paint", "Landroid/graphics/Paint;", "circlePaint", "maskPaint", "drawMatrix", "Landroid/graphics/Matrix;", "maskPath", "Landroid/graphics/Path;", "circleRadius", "", "circleCenterX", "circleCenterY", "scale", "minScale", "maxScale", "offsetX", "offsetY", "lastTouchX", "lastTouchY", "isDragging", "", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setImageBitmap", "selectedBitmap", "cropSquareBitmap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initParams", "fixBounds", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CropImageView extends View {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Bitmap f35426b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f35427c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Paint f35428d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Paint f35429e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Matrix f35430f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Path f35431g;

    /* JADX INFO: renamed from: h */
    public float f35432h;

    /* JADX INFO: renamed from: i */
    public float f35433i;

    /* JADX INFO: renamed from: j */
    public float f35434j;

    /* JADX INFO: renamed from: k */
    public float f35435k;

    /* JADX INFO: renamed from: l */
    public float f35436l;

    /* JADX INFO: renamed from: m */
    public float f35437m;

    /* JADX INFO: renamed from: n */
    public float f35438n;

    /* JADX INFO: renamed from: o */
    public float f35439o;

    /* JADX INFO: renamed from: p */
    public float f35440p;

    /* JADX INFO: renamed from: q */
    public float f35441q;

    /* JADX INFO: renamed from: r */
    public boolean f35442r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final ScaleGestureDetector f35443s;

    /* JADX INFO: renamed from: com.kubi.mine.lib.view.CropImageView$a */
    /* JADX INFO: compiled from: CropImageView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/mine/lib/view/CropImageView$scaleDetector$1", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19201a extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C19201a() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            float fCoerceIn = RangesKt.coerceIn(CropImageView.this.f35435k * detector.getScaleFactor(), CropImageView.this.f35436l, CropImageView.this.f35437m);
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f11 = (focusX - CropImageView.this.f35438n) / CropImageView.this.f35435k;
            float f12 = (focusY - CropImageView.this.f35439o) / CropImageView.this.f35435k;
            CropImageView.this.f35435k = fCoerceIn;
            CropImageView cropImageView = CropImageView.this;
            cropImageView.f35438n = focusX - (f11 * cropImageView.f35435k);
            CropImageView cropImageView2 = CropImageView.this;
            cropImageView2.f35439o = focusY - (f12 * cropImageView2.f35435k);
            CropImageView.this.m42352q();
            CropImageView.this.invalidate();
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.f35426b;
        if (bitmap != null) {
            this.f35430f.reset();
            Matrix matrix = this.f35430f;
            float f11 = this.f35435k;
            matrix.postScale(f11, f11);
            this.f35430f.postTranslate(this.f35438n, this.f35439o);
            canvas.drawBitmap(bitmap, this.f35430f, this.f35427c);
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            this.f35431g.reset();
            this.f35431g.addCircle(this.f35433i, this.f35434j, this.f35432h, Path.Direction.CCW);
            canvas.clipPath(this.f35431g, Region.Op.DIFFERENCE);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f35429e);
            canvas.restoreToCount(iSaveLayer);
            canvas.drawCircle(this.f35433i, this.f35434j, this.f35432h, this.f35428d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f35443s.onTouchEvent(event);
        if (event.getPointerCount() > 1) {
            return true;
        }
        int action = event.getAction();
        if (action == 0) {
            this.f35440p = event.getX();
            this.f35441q = event.getY();
            this.f35442r = true;
        } else if (action == 1) {
            this.f35442r = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f35442r = false;
            }
        } else if (this.f35442r) {
            float x11 = event.getX() - this.f35440p;
            float y11 = event.getY() - this.f35441q;
            this.f35438n += x11;
            this.f35439o += y11;
            m42352q();
            invalidate();
            this.f35440p = event.getX();
            this.f35441q = event.getY();
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m42352q() {
        Bitmap bitmap = this.f35426b;
        if (bitmap == null) {
            return;
        }
        float width = bitmap.getWidth() * this.f35435k;
        float height = bitmap.getHeight() * this.f35435k;
        float f11 = this.f35433i;
        float f12 = this.f35432h;
        float f13 = f11 - f12;
        float f14 = this.f35434j;
        float f15 = f14 - f12;
        float f16 = f11 + f12;
        float f17 = f14 + f12;
        if (this.f35438n > f13) {
            this.f35438n = f13;
        }
        if (this.f35438n + width < f16) {
            this.f35438n = f16 - width;
        }
        if (this.f35439o > f15) {
            this.f35439o = f15;
        }
        if (this.f35439o + height < f17) {
            this.f35439o = f17 - height;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m42353r() {
        Bitmap bitmap = this.f35426b;
        if (bitmap == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f35432h = (Math.min(width, height) / 2.0f) * 0.8f;
        this.f35433i = width / 2.0f;
        this.f35434j = height / 2.0f;
        float f11 = 2;
        float fMin = (this.f35432h * f11) / Math.min(bitmap.getWidth(), bitmap.getHeight());
        this.f35436l = fMin;
        this.f35437m = Math.max(f11 * fMin, 2.0f);
        this.f35435k = this.f35436l;
        this.f35438n = this.f35433i - ((bitmap.getWidth() * this.f35435k) / 2.0f);
        this.f35439o = this.f35434j - ((bitmap.getHeight() * this.f35435k) / 2.0f);
        m42352q();
    }

    public final void setImageBitmap(@NotNull Bitmap selectedBitmap) {
        Intrinsics.checkNotNullParameter(selectedBitmap, "selectedBitmap");
        this.f35426b = selectedBitmap;
        post(new Runnable() { // from class: com.kubi.mine.lib.view.a
            @Override // java.lang.Runnable
            public final void run() {
                CropImageView.setImageBitmap$lambda$3(this.f35457b);
            }
        });
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setImageBitmap$lambda$3(CropImageView cropImageView) {
        cropImageView.m42353r();
        cropImageView.invalidate();
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m42351p(@NotNull Continuation<? super Bitmap> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new CropImageView$cropSquareBitmap$2(this, null), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CropImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35427c = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(4.0f);
        this.f35428d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(C27017c.f54310a.m66512a(R$color.c_mask));
        this.f35429e = paint2;
        this.f35430f = new Matrix();
        this.f35431g = new Path();
        this.f35435k = 1.0f;
        this.f35436l = 1.0f;
        this.f35437m = 2.0f;
        this.f35443s = new ScaleGestureDetector(context, new C19201a());
    }
}
