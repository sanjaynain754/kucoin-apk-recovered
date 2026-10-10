package com.kubi.resources.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class CircleProgressTextView extends View {

    /* JADX INFO: renamed from: b */
    public Paint f43749b;

    /* JADX INFO: renamed from: c */
    public Paint f43750c;

    /* JADX INFO: renamed from: d */
    public Paint f43751d;

    /* JADX INFO: renamed from: e */
    public RectF f43752e;

    /* JADX INFO: renamed from: f */
    public int f43753f;

    public CircleProgressTextView(@NonNull Context context) {
        super(context, null, R.attr.progressBarStyleHorizontal);
        m54476a();
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, this.f43750c);
            if (this.f43752e == null) {
                this.f43752e = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            }
            canvas.drawArc(this.f43752e, -90.0f, (getProgress() * 360.0f) / 100.0f, false, this.f43751d);
            Paint.FontMetrics fontMetrics = this.f43749b.getFontMetrics();
            float height = (getHeight() / 2.0f) + ((Math.abs(fontMetrics.bottom - fontMetrics.top) / 2.0f) - fontMetrics.bottom);
            canvas.drawText(getProgress() + "%", (getWidth() / 2.0f) - (this.f43749b.measureText(getProgress() + "%") / 2.0f), height, this.f43749b);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m54476a() {
        Paint paint = new Paint();
        this.f43749b = paint;
        Context context = getContext();
        int i11 = R$color.c_white;
        paint.setColor(ContextCompat.getColor(context, i11));
        this.f43749b.setTextSize(C5275i0.m6241f(12.0f));
        Paint paint2 = new Paint();
        this.f43750c = paint2;
        paint2.setColor(ContextCompat.getColor(getContext(), R$color.emphasis40));
        this.f43750c.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f43751d = paint3;
        paint3.setColor(ContextCompat.getColor(getContext(), i11));
        this.f43751d.setStrokeWidth(C5275i0.m6236a(1.0f));
        this.f43751d.setStyle(Paint.Style.STROKE);
        this.f43751d.setAntiAlias(true);
    }

    public int getProgress() {
        return this.f43753f;
    }

    public void setProgress(int i11) {
        this.f43753f = i11;
    }

    public CircleProgressTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.progressBarStyleHorizontal);
        m54476a();
    }

    public CircleProgressTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, R.attr.progressBarStyleHorizontal);
        m54476a();
    }
}
