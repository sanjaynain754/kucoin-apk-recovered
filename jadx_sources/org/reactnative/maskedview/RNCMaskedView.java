package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes61.dex */
public class RNCMaskedView extends ReactViewGroup {

    /* JADX INFO: renamed from: b */
    public Bitmap f95575b;

    /* JADX INFO: renamed from: c */
    public boolean f95576c;

    /* JADX INFO: renamed from: d */
    public Paint f95577d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f95578e;

    /* JADX INFO: renamed from: f */
    public int f95579f;

    /* JADX INFO: renamed from: g */
    public final void m95311g() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            Bitmap bitmap = this.f95575b;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f95575b = m95310f(childAt);
            childAt.setVisibility(4);
        }
    }

    public RNCMaskedView(Context context) {
        super(context);
        this.f95575b = null;
        this.f95576c = false;
        this.f95579f = 2;
        this.f95577d = new Paint(1);
        this.f95578e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m95310f(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f95576c) {
            m95311g();
            this.f95576c = false;
        }
        if (this.f95575b != null) {
            setLayerType(this.f95579f, this.f95577d);
            this.f95577d.setXfermode(this.f95578e);
            canvas.drawBitmap(this.f95575b, 0.0f, 0.0f, this.f95577d);
            this.f95577d.setXfermode(null);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f95576c = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (!this.f95576c && (childAt = getChildAt(0)) != null && childAt.equals(view)) {
            this.f95576c = true;
        }
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            this.f95576c = true;
        }
    }

    public void setRenderingMode(String str) {
        int i11;
        if (str.equals("software")) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f95579f = i11;
    }
}
