package com.tencent.rtmp.p148ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;

/* JADX INFO: loaded from: classes56.dex */
public class FocusIndicatorView extends View {

    /* JADX INFO: renamed from: a */
    final ScaleAnimation f75416a;

    /* JADX INFO: renamed from: b */
    private final Paint f75417b;

    /* JADX INFO: renamed from: c */
    private final int f75418c;

    /* JADX INFO: renamed from: d */
    private final Rect f75419d;

    public FocusIndicatorView(Context context) {
        this(context, null);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11 = this.f75418c / 2;
        Rect rect = this.f75419d;
        rect.left = i11;
        rect.top = i11;
        rect.right = getWidth() - i11;
        this.f75419d.bottom = getHeight() - i11;
        canvas.drawRect(this.f75419d, this.f75417b);
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f75419d = new Rect();
        int i12 = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.f75418c = i12;
        Paint paint = new Paint();
        this.f75417b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i12);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.3f, 1.0f, 1.3f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f75416a = scaleAnimation;
        scaleAnimation.setDuration(200L);
    }
}
