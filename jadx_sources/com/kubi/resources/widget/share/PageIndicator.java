package com.kubi.resources.widget.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PageIndicator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H&J \u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H&J\b\u0010#\u001a\u00020!H&J\b\u0010$\u001a\u00020!H&R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/resources/widget/share/PageIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "totalPage", "pageWidth", "scrollDistance", "empty", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "indicatorBitmap", "Landroid/graphics/Bitmap;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "attachToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "drawNormal", "drawSelect", "centerX", "", "centerY", "indicatorWidth", "indicatorHeight", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPageIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageIndicator.kt\ncom/kubi/resources/widget/share/PageIndicator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
public abstract class PageIndicator extends View {

    /* JADX INFO: renamed from: b */
    public int f45113b;

    /* JADX INFO: renamed from: c */
    public int f45114c;

    /* JADX INFO: renamed from: d */
    public int f45115d;

    /* JADX INFO: renamed from: e */
    public int f45116e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Paint f45117f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Bitmap f45118g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PageIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo55469b(@NotNull Canvas canvas, float f11, float f12);

    /* JADX INFO: renamed from: d */
    public abstract void mo55470d(@NotNull Canvas canvas, float f11, float f12);

    /* JADX INFO: renamed from: e */
    public abstract float mo55471e();

    /* JADX INFO: renamed from: f */
    public abstract float mo55472f();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PageIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getPaint, reason: from getter */
    public final Paint getF45117f() {
        return this.f45117f;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f45116e = (getMeasuredWidth() - (this.f45113b * ((int) mo55472f()))) / 2;
        m55473a(canvas);
        m55474c(canvas);
    }

    public /* synthetic */ PageIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m55473a(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f45117f, 31);
        if (this.f45118g == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.f45118g = bitmapCreateBitmap;
            if (bitmapCreateBitmap != null) {
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                int i11 = this.f45113b;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        mo55469b(canvas2, this.f45116e + (i12 * mo55472f()), mo55471e() / 2);
                        if (i12 == i11) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        Bitmap bitmap = this.f45118g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f45117f);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX INFO: renamed from: c */
    public final void m55474c(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f45117f, 31);
        mo55470d(canvas, this.f45116e + ((mo55472f() * this.f45115d) / this.f45114c), getMeasuredHeight() / 2);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) mo55471e(), 1073741824);
        setMeasuredDimension(widthMeasureSpec, iMakeMeasureSpec);
        super.onMeasure(widthMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PageIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f45117f = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
    }
}
