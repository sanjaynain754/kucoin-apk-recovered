package com.kubi.resources.widget.lockview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.kubi.sdk.res.R$color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class GestureLockDisplayView extends View {

    /* JADX INFO: renamed from: b */
    public Paint f44944b;

    /* JADX INFO: renamed from: c */
    public int f44945c;

    /* JADX INFO: renamed from: d */
    public int f44946d;

    /* JADX INFO: renamed from: e */
    public int f44947e;

    /* JADX INFO: renamed from: f */
    public int f44948f;

    /* JADX INFO: renamed from: g */
    public int f44949g;

    /* JADX INFO: renamed from: h */
    public List<Dot> f44950h;

    /* JADX INFO: renamed from: i */
    public List<Integer> f44951i;

    public GestureLockDisplayView(Context context) {
        this(context, null);
    }

    public void setAnswer(int... iArr) {
        for (int i11 : iArr) {
            this.f44951i.add(Integer.valueOf(i11));
        }
        postInvalidate();
    }

    public GestureLockDisplayView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44945c = 3;
        this.f44950h = new ArrayList(1);
        this.f44951i = new ArrayList(1);
        m55379a();
    }

    /* JADX INFO: renamed from: a */
    public final void m55379a() {
        Paint paint = new Paint();
        this.f44944b = paint;
        paint.setAntiAlias(true);
        this.f44944b.setStyle(Paint.Style.FILL);
        this.f44944b.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f44948f = getResources().getColor(R$color.primary);
        this.f44949g = getResources().getColor(R$color.emphasis40);
    }

    /* JADX INFO: renamed from: b */
    public final void m55380b() {
        int i11;
        Iterator<Dot> it = this.f44950h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                it.next().setSelected(false);
            }
        }
        for (i11 = 0; i11 < this.f44951i.size(); i11++) {
            this.f44950h.get(this.f44951i.get(i11).intValue()).setSelected(true);
        }
    }

    public void setDotCount(int i11) {
        this.f44945c = i11;
    }

    public void setDotSelectedColor(int i11) {
        this.f44948f = i11;
        postInvalidate();
    }

    public void setDotUnSelectedColor(int i11) {
        this.f44949g = i11;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m55380b();
        for (int i11 = 0; i11 < this.f44950h.size(); i11++) {
            Dot dot = this.f44950h.get(i11);
            if (dot.isSelected()) {
                this.f44944b.setColor(this.f44948f);
            } else {
                this.f44944b.setColor(this.f44949g);
            }
            canvas.drawCircle(dot.getX(), dot.getY(), this.f44946d, this.f44944b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int iMin = Math.min(View.MeasureSpec.getSize(i12), View.MeasureSpec.getSize(i11));
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        int width = getWidth() / (((this.f44945c * 2) + 1) * 2);
        this.f44946d = width;
        this.f44947e = width * 2;
        int i15 = 0;
        while (true) {
            int i16 = this.f44945c;
            if (i15 < i16 * i16) {
                int i17 = this.f44946d;
                int i18 = this.f44947e;
                this.f44950h.add(new Dot(((i15 % i16) * 2 * i17) + i17 + ((i15 % i16) * i18) + i18, ((i15 / i16) * 2 * i17) + i17 + ((i15 / i16) * i18) + i18, i15));
                i15++;
            } else {
                return;
            }
        }
    }

    public void setAnswer(List<Integer> list) {
        this.f44951i = list;
        postInvalidate();
    }
}
