package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.ImageView;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C39982A extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Movie f88915a;

    /* JADX INFO: renamed from: b */
    public final ImageView f88916b;

    /* JADX INFO: renamed from: c */
    public long f88917c;

    /* JADX INFO: renamed from: d */
    public final Handler f88918d;

    /* JADX INFO: renamed from: e */
    public boolean f88919e;

    /* JADX INFO: renamed from: f */
    public final RunnableC40042z f88920f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C39982A(Movie movie, ImageView imageView) {
        Intrinsics.checkNotNullParameter(movie, "movie");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.f88915a = movie;
        this.f88916b = imageView;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f88918d = handler;
        RunnableC40042z runnableC40042z = new RunnableC40042z(this);
        this.f88920f = runnableC40042z;
        setBounds(0, 0, movie.width(), movie.height());
        if (!this.f88919e) {
            this.f88919e = true;
            this.f88917c = SystemClock.uptimeMillis();
            handler.post(runnableC40042z);
        }
        imageView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC40041y(this));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (bounds.isEmpty()) {
            return;
        }
        float fCoerceAtMost = RangesKt.coerceAtMost(bounds.width() / this.f88915a.width(), bounds.height() / this.f88915a.height());
        float fWidth = this.f88915a.width() * fCoerceAtMost;
        float fHeight = this.f88915a.height() * fCoerceAtMost;
        float fWidth2 = (bounds.width() - fWidth) / 2.0f;
        float fHeight2 = (bounds.height() - fHeight) / 2.0f;
        canvas.save();
        canvas.translate(fWidth2, fHeight2);
        canvas.scale(fCoerceAtMost, fCoerceAtMost);
        this.f88915a.draw(canvas, 0.0f, 0.0f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f88915a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f88915a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f88916b.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
