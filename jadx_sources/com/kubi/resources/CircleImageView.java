package com.kubi.resources;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes11.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: q */
    public static final ImageView.ScaleType f43472q = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: r */
    public static final Bitmap.Config f43473r = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    public final RectF f43474b;

    /* JADX INFO: renamed from: c */
    public final RectF f43475c;

    /* JADX INFO: renamed from: d */
    public final Matrix f43476d;

    /* JADX INFO: renamed from: e */
    public final Paint f43477e;

    /* JADX INFO: renamed from: f */
    public final Paint f43478f;

    /* JADX INFO: renamed from: g */
    public int f43479g;

    /* JADX INFO: renamed from: h */
    public int f43480h;

    /* JADX INFO: renamed from: i */
    public Bitmap f43481i;

    /* JADX INFO: renamed from: j */
    public BitmapShader f43482j;

    /* JADX INFO: renamed from: k */
    public int f43483k;

    /* JADX INFO: renamed from: l */
    public int f43484l;

    /* JADX INFO: renamed from: m */
    public float f43485m;

    /* JADX INFO: renamed from: n */
    public float f43486n;

    /* JADX INFO: renamed from: o */
    public boolean f43487o;

    /* JADX INFO: renamed from: p */
    public boolean f43488p;

    public CircleImageView(Context context) {
        super(context);
        this.f43474b = new RectF();
        this.f43475c = new RectF();
        this.f43476d = new Matrix();
        this.f43477e = new Paint();
        this.f43478f = new Paint();
        this.f43479g = ViewCompat.MEASURED_STATE_MASK;
        this.f43480h = 0;
        m54108b();
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m54107a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f43473r) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f43473r);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m54108b() {
        super.setScaleType(f43472q);
        this.f43487o = true;
        if (this.f43488p) {
            m54109c();
            this.f43488p = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m54109c() {
        if (!this.f43487o) {
            this.f43488p = true;
            return;
        }
        if (this.f43481i != null) {
            Bitmap bitmap = this.f43481i;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f43482j = new BitmapShader(bitmap, tileMode, tileMode);
            this.f43477e.setAntiAlias(true);
            this.f43477e.setShader(this.f43482j);
            this.f43478f.setStyle(Paint.Style.STROKE);
            this.f43478f.setAntiAlias(true);
            this.f43478f.setColor(this.f43479g);
            this.f43478f.setStrokeWidth(this.f43480h);
            this.f43484l = this.f43481i.getHeight();
            this.f43483k = this.f43481i.getWidth();
            this.f43475c.set(0.0f, 0.0f, getWidth(), getHeight());
            float f11 = 2;
            this.f43486n = Math.min((this.f43475c.height() - this.f43480h) / f11, (this.f43475c.width() - this.f43480h) / f11);
            RectF rectF = this.f43474b;
            int i11 = this.f43480h;
            rectF.set(i11, i11, this.f43475c.width() - this.f43480h, this.f43475c.height() - this.f43480h);
            this.f43485m = Math.min(this.f43474b.height() / f11, this.f43474b.width() / f11);
            m54110d();
            invalidate();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54110d() {
        float fWidth;
        float fHeight;
        this.f43476d.set(null);
        float fWidth2 = 0.0f;
        if (this.f43483k * this.f43474b.height() > this.f43474b.width() * this.f43484l) {
            fWidth = this.f43474b.height() / this.f43484l;
            fHeight = 0.0f;
            fWidth2 = (this.f43474b.width() - (this.f43483k * fWidth)) * 0.5f;
        } else {
            fWidth = this.f43474b.width() / this.f43483k;
            fHeight = (this.f43474b.height() - (this.f43484l * fWidth)) * 0.5f;
        }
        this.f43476d.setScale(fWidth, fWidth);
        Matrix matrix = this.f43476d;
        int i11 = this.f43480h;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + i11, ((int) (fHeight + 0.5f)) + i11);
        this.f43482j.setLocalMatrix(this.f43476d);
    }

    public int getBorderColor() {
        return this.f43479g;
    }

    public int getBorderWidth() {
        return this.f43480h;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f43472q;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z11) {
        if (z11) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i11) {
        if (i11 != this.f43479g) {
            this.f43479g = i11;
            this.f43478f.setColor(i11);
            invalidate();
        }
    }

    public void setBorderWidth(int i11) {
        if (i11 != this.f43480h) {
            this.f43480h = i11;
            m54109c();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f43485m, this.f43477e);
            if (this.f43480h != 0) {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f43486n, this.f43478f);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m54109c();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f43481i = bitmap;
        m54109c();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f43481i = m54107a(drawable);
        m54109c();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
        this.f43481i = m54107a(getDrawable());
        m54109c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f43481i = m54107a(getDrawable());
        m54109c();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43474b = new RectF();
        this.f43475c = new RectF();
        this.f43476d = new Matrix();
        this.f43477e = new Paint();
        this.f43478f = new Paint();
        this.f43479g = ViewCompat.MEASURED_STATE_MASK;
        this.f43480h = 0;
        m54108b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
