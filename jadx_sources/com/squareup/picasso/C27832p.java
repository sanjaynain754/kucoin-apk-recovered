package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.squareup.picasso.p */
/* JADX INFO: compiled from: PicassoDrawable.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27832p extends BitmapDrawable {

    /* JADX INFO: renamed from: h */
    public static final Paint f56790h = new Paint();

    /* JADX INFO: renamed from: a */
    public final boolean f56791a;

    /* JADX INFO: renamed from: b */
    public final float f56792b;

    /* JADX INFO: renamed from: c */
    public final Picasso.LoadedFrom f56793c;

    /* JADX INFO: renamed from: d */
    public Drawable f56794d;

    /* JADX INFO: renamed from: e */
    public long f56795e;

    /* JADX INFO: renamed from: f */
    public boolean f56796f;

    /* JADX INFO: renamed from: g */
    public int f56797g;

    /* JADX INFO: renamed from: b */
    public static Path m68884b(int i11, int i12, int i13) {
        Path path = new Path();
        float f11 = i11;
        float f12 = i12;
        path.moveTo(f11, f12);
        path.lineTo(i11 + i13, f12);
        path.lineTo(f11, i12 + i13);
        return path;
    }

    /* JADX INFO: renamed from: a */
    public final void m68887a(Canvas canvas) {
        Paint paint = f56790h;
        paint.setColor(-1);
        canvas.drawPath(m68884b(0, 0, (int) (this.f56792b * 16.0f)), paint);
        paint.setColor(this.f56793c.debugColor);
        canvas.drawPath(m68884b(0, 0, (int) (this.f56792b * 15.0f)), paint);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f56796f) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f56795e) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.f56796f = false;
                this.f56794d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f56794d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f56797g * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f56797g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f56791a) {
            m68887a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f56794d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f56797g = i11;
        Drawable drawable = this.f56794d;
        if (drawable != null) {
            drawable.setAlpha(i11);
        }
        super.setAlpha(i11);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f56794d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    public C27832p(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z11, boolean z12) {
        super(context.getResources(), bitmap);
        this.f56797g = 255;
        this.f56791a = z12;
        this.f56792b = context.getResources().getDisplayMetrics().density;
        this.f56793c = loadedFrom;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY && !z11) {
            this.f56794d = drawable;
            this.f56796f = true;
            this.f56795e = SystemClock.uptimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m68885c(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z11, boolean z12) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C27832p(context, bitmap, drawable, loadedFrom, z11, z12));
    }

    /* JADX INFO: renamed from: d */
    public static void m68886d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }
}
