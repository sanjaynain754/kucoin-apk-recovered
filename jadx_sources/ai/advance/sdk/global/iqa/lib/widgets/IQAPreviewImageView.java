package ai.advance.sdk.global.iqa.lib.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes23.dex */
public class IQAPreviewImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b */
    public RectF f1060b;

    /* JADX INFO: renamed from: c */
    public final Paint f1061c;

    /* JADX INFO: renamed from: d */
    public Bitmap f1062d;

    /* JADX INFO: renamed from: e */
    public int f1063e;

    /* JADX INFO: renamed from: f */
    public int f1064f;

    /* JADX INFO: renamed from: g */
    public int f1065g;

    /* JADX INFO: renamed from: h */
    public int f1066h;

    public Bitmap getBitmap() {
        return this.f1062d;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap == null && (bitmap2 = this.f1062d) != null) {
            bitmap2.recycle();
        }
        this.f1062d = bitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            super.setImageBitmap(bitmap);
        } else {
            super.setImageBitmap(null);
            this.f1062d = null;
        }
    }

    public void setPointRect(RectF rectF) {
        this.f1060b = rectF;
        postInvalidate();
    }

    public IQAPreviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f1061c = paint;
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#ffff33"));
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        super.onDraw(canvas);
        if (this.f1060b != null) {
            float f11 = measuredWidth;
            this.f1061c.setStrokeWidth(0.005f * f11);
            RectF rectF = this.f1060b;
            float f12 = measuredHeight;
            canvas.drawRoundRect(new RectF(rectF.left * f11, rectF.top * f12, f11 * rectF.right, f12 * rectF.bottom), this.f1061c.getStrokeWidth(), this.f1061c.getStrokeWidth(), this.f1061c);
        }
        if (this.f1063e == 1) {
            canvas.drawLine(0.0f, 0.0f, 0.0f, measuredHeight, this.f1061c);
        }
        if (this.f1064f == 1) {
            canvas.drawLine(0.0f, 0.0f, measuredWidth, 0.0f, this.f1061c);
        }
        if (this.f1066h == 1) {
            float f13 = measuredHeight;
            canvas.drawLine(0.0f, f13, measuredWidth, f13, this.f1061c);
        }
        if (this.f1065g == 1) {
            float f14 = measuredWidth;
            canvas.drawLine(f14, 0.0f, f14, measuredHeight, this.f1061c);
        }
    }
}
