package com.kubi.resources.widget.round.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.kubi.sdk.res.R$styleable;
import cx.InterfaceC36553a;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.kubi.resources.widget.round.widget.a */
/* JADX INFO: compiled from: RCHelper.java */
/* JADX INFO: loaded from: classes12.dex */
public class C23128a {

    /* JADX INFO: renamed from: b */
    public Path f45087b;

    /* JADX INFO: renamed from: c */
    public Paint f45088c;

    /* JADX INFO: renamed from: e */
    public int f45090e;

    /* JADX INFO: renamed from: f */
    public int f45091f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f45092g;

    /* JADX INFO: renamed from: h */
    public int f45093h;

    /* JADX INFO: renamed from: i */
    public boolean f45094i;

    /* JADX INFO: renamed from: j */
    public Region f45095j;

    /* JADX INFO: renamed from: k */
    public RectF f45096k;

    /* JADX INFO: renamed from: l */
    public boolean f45097l;

    /* JADX INFO: renamed from: a */
    public float[] f45086a = new float[8];

    /* JADX INFO: renamed from: d */
    public boolean f45089d = false;

    /* JADX INFO: renamed from: com.kubi.resources.widget.round.widget.a$a */
    /* JADX INFO: compiled from: RCHelper.java */
    /* JADX INFO: loaded from: classes13.dex */
    public interface a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m55455a(View view) {
        if (view instanceof InterfaceC36553a) {
            ArrayList arrayList = new ArrayList();
            if (view instanceof Checkable) {
                arrayList.add(Integer.valueOf(R.attr.state_checkable));
                if (((Checkable) view).isChecked()) {
                    arrayList.add(Integer.valueOf(R.attr.state_checked));
                }
            }
            if (view.isEnabled()) {
                arrayList.add(Integer.valueOf(R.attr.state_enabled));
            }
            if (view.isFocused()) {
                arrayList.add(Integer.valueOf(R.attr.state_focused));
            }
            if (view.isPressed()) {
                arrayList.add(Integer.valueOf(R.attr.state_pressed));
            }
            if (view.isHovered()) {
                arrayList.add(Integer.valueOf(R.attr.state_hovered));
            }
            if (view.isSelected()) {
                arrayList.add(Integer.valueOf(R.attr.state_selected));
            }
            if (view.isActivated()) {
                arrayList.add(Integer.valueOf(R.attr.state_activated));
            }
            if (view.hasWindowFocus()) {
                arrayList.add(Integer.valueOf(R.attr.state_window_focused));
            }
            ColorStateList colorStateList = this.f45092g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                return;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            ((InterfaceC36553a) view).setStrokeColor(this.f45092g.getColorForState(iArr, this.f45090e));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m55456b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RCAttrs);
        this.f45089d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RCAttrs_round_as_circle, false);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.RCAttrs_stroke_color);
        this.f45092g = colorStateList;
        if (colorStateList != null) {
            this.f45091f = colorStateList.getDefaultColor();
            this.f45090e = this.f45092g.getDefaultColor();
        } else {
            this.f45091f = -1;
            this.f45090e = -1;
        }
        this.f45093h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RCAttrs_stroke_width, 0);
        this.f45094i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RCAttrs_clip_background, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RCAttrs_round_corner, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RCAttrs_round_corner_top_left, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RCAttrs_round_corner_top_right, dimensionPixelSize);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RCAttrs_round_corner_bottom_left, dimensionPixelSize);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RCAttrs_round_corner_bottom_right, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        float[] fArr = this.f45086a;
        float f11 = dimensionPixelSize2;
        fArr[0] = f11;
        fArr[1] = f11;
        float f12 = dimensionPixelSize3;
        fArr[2] = f12;
        fArr[3] = f12;
        float f13 = dimensionPixelSize5;
        fArr[4] = f13;
        fArr[5] = f13;
        float f14 = dimensionPixelSize4;
        fArr[6] = f14;
        fArr[7] = f14;
        this.f45096k = new RectF();
        this.f45087b = new Path();
        this.f45095j = new Region();
        Paint paint = new Paint();
        this.f45088c = paint;
        paint.setColor(-1);
        this.f45088c.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: c */
    public void m55457c(Canvas canvas) {
        if (this.f45093h > 0) {
            this.f45088c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            this.f45088c.setColor(-1);
            this.f45088c.setStrokeWidth(this.f45093h * 2);
            Paint paint = this.f45088c;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            canvas.drawPath(this.f45087b, this.f45088c);
            this.f45088c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.f45088c.setColor(this.f45091f);
            this.f45088c.setStyle(style);
            canvas.drawPath(this.f45087b, this.f45088c);
        }
        this.f45088c.setColor(-1);
        this.f45088c.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            this.f45088c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(this.f45087b, this.f45088c);
            return;
        }
        this.f45088c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Path path = new Path();
        path.addRect(0.0f, 0.0f, (int) this.f45096k.width(), (int) this.f45096k.height(), Path.Direction.CW);
        path.op(this.f45087b, Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.f45088c);
    }

    /* JADX INFO: renamed from: d */
    public void m55458d(View view, int i11, int i12) {
        this.f45096k.set(0.0f, 0.0f, i11, i12);
        m55459e(view);
    }

    /* JADX INFO: renamed from: e */
    public void m55459e(View view) {
        int iWidth = (int) this.f45096k.width();
        int iHeight = (int) this.f45096k.height();
        RectF rectF = new RectF();
        rectF.left = view.getPaddingLeft();
        rectF.top = view.getPaddingTop();
        rectF.right = iWidth - view.getPaddingRight();
        rectF.bottom = iHeight - view.getPaddingBottom();
        this.f45087b.reset();
        if (this.f45089d) {
            float fHeight = (rectF.width() >= rectF.height() ? rectF.height() : rectF.width()) / 2.0f;
            float f11 = iHeight / 2;
            PointF pointF = new PointF(iWidth / 2, f11);
            if (Build.VERSION.SDK_INT <= 27) {
                this.f45087b.addCircle(pointF.x, pointF.y, fHeight, Path.Direction.CW);
                this.f45087b.moveTo(0.0f, 0.0f);
                this.f45087b.moveTo(iWidth, iHeight);
            } else {
                float f12 = f11 - fHeight;
                this.f45087b.moveTo(rectF.left, f12);
                this.f45087b.addCircle(pointF.x, f12 + fHeight, fHeight, Path.Direction.CW);
            }
        } else {
            this.f45087b.addRoundRect(rectF, this.f45086a, Path.Direction.CW);
        }
        this.f45095j.setPath(this.f45087b, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
    }
}
