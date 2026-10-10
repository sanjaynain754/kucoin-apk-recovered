package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes13.dex */
public class DashTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    public Paint f43780b;

    /* JADX INFO: renamed from: c */
    public Path f43781c;

    /* JADX INFO: renamed from: d */
    public boolean f43782d;

    /* JADX INFO: renamed from: e */
    public int f43783e;

    public DashTextView(Context context) {
        super(context);
        m54496b();
    }

    private float getTextWidth() {
        float lineWidth = 0.0f;
        for (int i11 = 0; i11 < getLineCount(); i11++) {
            if (lineWidth < getLayout().getLineWidth(i11)) {
                lineWidth = getLayout().getLineWidth(i11);
            }
        }
        return lineWidth == 0.0f ? getWidth() : lineWidth;
    }

    public void setDashColor(@ColorInt int i11) {
        this.f43780b.setColor(i11);
    }

    public void setDashLineColor(@ColorInt int i11) {
        this.f43780b.setColor(i11);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        this.f43783e = i11;
        super.setGravity(i11);
    }

    public void setNeedDash(boolean z11) {
        this.f43782d = z11;
        invalidate();
    }

    public DashTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54496b();
    }

    /* JADX INFO: renamed from: b */
    public final void m54496b() {
        boolean z11;
        if (getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43782d = z11;
        Paint paint = new Paint(1);
        this.f43780b = paint;
        paint.setColor(getCurrentTextColor());
        this.f43780b.setStrokeWidth(3.0f);
        this.f43780b.setStyle(Paint.Style.STROKE);
        this.f43780b.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.f43781c = new Path();
        setPadding(0, 0, 0, 3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z11;
        super.onDraw(canvas);
        if (this.f43782d) {
            boolean z12 = true;
            setLayerType(1, null);
            if (getLayoutDirection() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int gravity = getGravity();
            if (gravity != 17 && gravity != 1) {
                z12 = false;
            }
            int height = getHeight();
            int width = getWidth();
            float textWidth = getTextWidth();
            this.f43781c.reset();
            float f11 = 0.0f;
            if (this.f43783e == 8388613) {
                Path path = this.f43781c;
                if (!z11) {
                    f11 = width;
                }
                float f12 = height;
                path.moveTo(f11, f12);
                Path path2 = this.f43781c;
                if (!z11) {
                    textWidth = width - textWidth;
                }
                path2.lineTo(textWidth, f12);
            } else {
                Path path3 = this.f43781c;
                if (z12) {
                    f11 = (width / 2.0f) - (textWidth / 2.0f);
                } else if (z11) {
                    f11 = width;
                }
                float f13 = height;
                path3.moveTo(f11, f13);
                Path path4 = this.f43781c;
                if (z12) {
                    textWidth = (textWidth / 2.0f) + (width / 2.0f);
                } else if (z11) {
                    textWidth = width - textWidth;
                }
                path4.lineTo(textWidth, f13);
            }
            canvas.drawPath(this.f43781c, this.f43780b);
        }
    }

    public DashTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m54496b();
    }
}
