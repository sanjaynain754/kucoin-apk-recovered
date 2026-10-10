package com.kubi.kumex.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.futures.trade.book.C13635c;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$string;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitStubView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/view/SubmitStubView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "stub", "", "collumSize", "paint", "Landroid/graphics/Paint;", "itemHeight", "lastCollumSize", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "resetCollum", "onDraw", "canvas", "Landroid/graphics/Canvas;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SubmitStubView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f30921b;

    /* JADX INFO: renamed from: c */
    public int f30922c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public Paint f30923d;

    /* JADX INFO: renamed from: e */
    public final int f30924e;

    /* JADX INFO: renamed from: f */
    public int f30925f;

    public SubmitStubView(@Nullable Context context) {
        super(context);
        String string = getResources().getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f30921b = string;
        this.f30923d = new Paint();
        this.f30924e = C27029c.m66601d(this, C13635c.m26931a());
        this.f30925f = 6;
        this.f30923d.setAntiAlias(true);
        this.f30923d.setTextSize(C27029c.m66601d(this, 12));
        this.f30923d.setColor(getResources().getColor(R$color.emphasis));
    }

    /* JADX INFO: renamed from: a */
    public final void m36713a(int i11) {
        if (this.f30922c == i11) {
            return;
        }
        this.f30922c = i11;
        this.f30925f = i11;
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float fDescent = this.f30924e - ((this.f30923d.descent() - this.f30923d.ascent()) / 2);
        float fMeasureText = this.f30923d.measureText(this.f30921b);
        int i11 = this.f30922c;
        for (int i12 = 0; i12 < i11; i12++) {
            canvas.drawText(this.f30921b, 0.0f, (this.f30924e * i12) + fDescent, this.f30923d);
            canvas.drawText(this.f30921b, getWidth() - fMeasureText, (this.f30924e * i12) + fDescent, this.f30923d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), this.f30922c * this.f30924e);
    }

    public SubmitStubView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        String string = getResources().getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f30921b = string;
        this.f30923d = new Paint();
        this.f30924e = C27029c.m66601d(this, C13635c.m26931a());
        this.f30925f = 6;
        this.f30923d.setAntiAlias(true);
        this.f30923d.setTextSize(C27029c.m66601d(this, 12));
        this.f30923d.setColor(getResources().getColor(R$color.emphasis));
    }

    public SubmitStubView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String string = getResources().getString(R$string.stub);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f30921b = string;
        this.f30923d = new Paint();
        this.f30924e = C27029c.m66601d(this, C13635c.m26931a());
        this.f30925f = 6;
        this.f30923d.setAntiAlias(true);
        this.f30923d.setTextSize(C27029c.m66601d(this, 12));
        this.f30923d.setColor(getResources().getColor(R$color.emphasis));
    }
}
