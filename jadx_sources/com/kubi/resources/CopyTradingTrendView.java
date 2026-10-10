package com.kubi.resources;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.blankj.utilcode.util.C5272h;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5303w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CopyTradingTrendView.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\b\b\u0001\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m90084d2 = {"Lcom/kubi/resources/CopyTradingTrendView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "linePain", "Landroid/graphics/Paint;", "maskFilter", "Landroid/graphics/BlurMaskFilter;", "path", "Landroid/graphics/Path;", "pointList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "safePadding", "", "isLine", "", "lineFillPath", "lineFillPaint", "getLineFillPaint", "()Landroid/graphics/Paint;", "lineFillPaint$delegate", "Lkotlin/Lazy;", "setDataList", "", "list", "", "color", "onDraw", "canvas", "Landroid/graphics/Canvas;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingTrendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingTrendView.kt\ncom/kubi/resources/CopyTradingTrendView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1#2:137\n1878#3,3:138\n*S KotlinDebug\n*F\n+ 1 CopyTradingTrendView.kt\ncom/kubi/resources/CopyTradingTrendView\n*L\n82#1:138,3\n*E\n"})
public final class CopyTradingTrendView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f43489b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final BlurMaskFilter f43490c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Path f43491d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ArrayList<Float> f43492e;

    /* JADX INFO: renamed from: f */
    public final int f43493f;

    /* JADX INFO: renamed from: g */
    public boolean f43494g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Path f43495h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f43496i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingTrendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setStrokeWidth(C5275i0.m6236a(1.0f));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f43489b = paint;
        this.f43490c = new BlurMaskFilter(C5275i0.m6236a(5.0f), BlurMaskFilter.Blur.SOLID);
        this.f43491d = new Path();
        this.f43492e = new ArrayList<>();
        this.f43493f = C5275i0.m6236a(10.0f);
        this.f43495h = new Path();
        this.f43496i = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingTrendView.m54112b();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final Paint m54112b() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m54113d(CopyTradingTrendView copyTradingTrendView, List list, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        copyTradingTrendView.m54114c(list, i11, z11);
    }

    private final Paint getLineFillPaint() {
        return (Paint) this.f43496i.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m54114c(@NotNull List<Float> list, @ColorInt int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f43494g = z11;
        this.f43492e.clear();
        this.f43492e.addAll(list);
        if (C5303w0.m6511a()) {
            CollectionsKt.reverse(this.f43492e);
        }
        this.f43489b.setColor(i11);
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        boolean z11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f43492e.size() < 2) {
            return;
        }
        Iterator<T> it = this.f43492e.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        Iterator<T> it2 = this.f43492e.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue2 = ((Number) it2.next()).floatValue();
        while (it2.hasNext()) {
            fFloatValue2 = Math.max(fFloatValue2, ((Number) it2.next()).floatValue());
        }
        float f11 = fFloatValue2 - fFloatValue;
        float measuredHeight = f11 != 0.0f ? (getMeasuredHeight() - (this.f43493f * 2)) / f11 : 0.0f;
        boolean z12 = true;
        float measuredWidth = getMeasuredWidth() / (this.f43492e.size() - 1);
        int i11 = 0;
        for (Object obj : this.f43492e) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue3 = ((Number) obj).floatValue();
            if (i11 != 0) {
                int i13 = i11 - 1;
                float f12 = i13 * measuredWidth;
                float height = (getHeight() - ((this.f43492e.get(i13).floatValue() - fFloatValue) * measuredHeight)) - this.f43493f;
                float f13 = i11 * measuredWidth;
                float height2 = (getHeight() - ((fFloatValue3 - fFloatValue) * measuredHeight)) - this.f43493f;
                if (this.f43494g) {
                    canvas.drawLine(f12, height, f13, height2, this.f43489b);
                    getLineFillPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), C5272h.m6230b(this.f43489b.getColor(), 40), 0, Shader.TileMode.CLAMP));
                    this.f43495h.moveTo(f12, getHeight() + getTop());
                    this.f43495h.lineTo(f12, height);
                    this.f43495h.lineTo(f13, height2);
                    this.f43495h.lineTo(f13, getHeight() + getTop());
                    this.f43495h.close();
                    canvas.drawPath(this.f43495h, getLineFillPaint());
                    this.f43495h.reset();
                    z11 = true;
                } else {
                    this.f43491d.moveTo(f12, height);
                    float f14 = (f12 + f13) / 2;
                    this.f43491d.cubicTo(f14, height, f14, height2, f13, height2);
                    if (i11 == 1) {
                        this.f43489b.setShader(new LinearGradient(f12, height, f13, height2, 0, this.f43489b.getColor(), Shader.TileMode.CLAMP));
                        z11 = true;
                    } else {
                        z11 = true;
                        if (i11 == this.f43492e.size() - 1) {
                            this.f43489b.setShader(new LinearGradient(f12, height, f13, height2, this.f43489b.getColor(), 0, Shader.TileMode.CLAMP));
                        }
                    }
                    this.f43489b.setMaskFilter(this.f43490c);
                    this.f43489b.setStrokeWidth(C5275i0.m6236a(0.5f));
                    canvas.drawPath(this.f43491d, this.f43489b);
                    this.f43489b.setStrokeWidth(C5275i0.m6236a(1.0f));
                    this.f43489b.setMaskFilter(null);
                    canvas.drawPath(this.f43491d, this.f43489b);
                    this.f43489b.setShader(null);
                    this.f43491d.reset();
                }
            } else {
                z11 = z12;
            }
            i11 = i12;
            z12 = z11;
        }
    }
}
