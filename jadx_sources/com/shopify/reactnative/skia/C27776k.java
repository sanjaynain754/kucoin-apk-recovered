package com.shopify.reactnative.skia;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.shopify.reactnative.skia.k */
/* JADX INFO: compiled from: ViewScreenshotService.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27776k {
    /* JADX INFO: renamed from: h */
    public static void m68620h(Canvas canvas, TextureView textureView, Paint paint, float f11) {
        textureView.setOpaque(false);
        Bitmap bitmap = textureView.getBitmap(Bitmap.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888));
        canvas.save();
        m68614b(canvas, textureView);
        paint.setAlpha(Math.round(f11 * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: c */
    public static Paint m68615c() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        return paint;
    }

    /* JADX INFO: renamed from: e */
    public static void m68617e(Canvas canvas, ViewGroup viewGroup, Paint paint, float f11) {
        if (viewGroup instanceof ReactViewGroup) {
            try {
                Method declaredMethod = ReactViewGroup.class.getDeclaredMethod("dispatchOverflowDraw", Canvas.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(viewGroup, canvas);
            } catch (Exception e11) {
                Log.e("SkiaScreenshot", "couldn't invoke dispatchOverflowDraw() on ReactViewGroup", e11);
            }
        }
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof TextureView) {
                    m68620h(canvas, (TextureView) childAt, paint, f11);
                } else if (childAt instanceof SurfaceView) {
                    m68618f(canvas, (SurfaceView) childAt, paint, f11);
                } else {
                    m68623k(canvas, childAt, paint, f11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m68618f(Canvas canvas, SurfaceView surfaceView, Paint paint, float f11) {
        final Canvas canvas2;
        final SurfaceView surfaceView2;
        final Paint paint2;
        final float f12;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        try {
            canvas2 = canvas;
            surfaceView2 = surfaceView;
            paint2 = paint;
            f12 = f11;
            try {
                PixelCopy.request(surfaceView2, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.shopify.reactnative.skia.j
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i11) {
                        C27776k.m68613a(canvas2, surfaceView2, paint2, f12, bitmapCreateBitmap, countDownLatch, i11);
                    }
                }, new Handler(Looper.getMainLooper()));
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (Exception e11) {
                e = e11;
                Log.e("SkiaScreenshot", "Cannot PixelCopy for " + surfaceView2, e);
                m68619g(canvas2, surfaceView2, paint2, f12);
            }
        } catch (Exception e12) {
            e = e12;
            canvas2 = canvas;
            surfaceView2 = surfaceView;
            paint2 = paint;
            f12 = f11;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m68621i(Canvas canvas, View view, Paint paint, float f11) {
        canvas.saveLayerAlpha(null, Math.round(f11 * 255.0f));
        view.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m68613a(Canvas canvas, SurfaceView surfaceView, Paint paint, float f11, Bitmap bitmap, CountDownLatch countDownLatch, int i11) {
        canvas.save();
        m68614b(canvas, surfaceView);
        paint.setAlpha(Math.round(f11 * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
        countDownLatch.countDown();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static void m68614b(Canvas canvas, @NonNull View view) {
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate((view.getLeft() + view.getPaddingLeft()) - view.getScrollX(), (view.getTop() + view.getPaddingTop()) - view.getScrollY());
        canvas.concat(matrix2);
        canvas.concat(matrix);
    }

    /* JADX INFO: renamed from: d */
    public static void m68616d(Canvas canvas, View view, float f11) {
        Drawable background = view.getBackground();
        if (background != null) {
            canvas.saveLayerAlpha(null, Math.round(f11 * 255.0f));
            background.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m68619g(Canvas canvas, SurfaceView surfaceView, Paint paint, float f11) {
        Bitmap drawingCache = surfaceView.getDrawingCache();
        if (drawingCache != null) {
            canvas.save();
            m68614b(canvas, surfaceView);
            paint.setAlpha(Math.round(f11 * 255.0f));
            canvas.drawBitmap(drawingCache, 0.0f, 0.0f, paint);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: j */
    public static Bitmap m68622j(ReactContext reactContext, int i11) {
        View viewResolveView;
        try {
            viewResolveView = UIManagerHelper.getUIManagerForReactTag(reactContext, i11).resolveView(i11);
        } catch (RuntimeException e11) {
            reactContext.handleException(e11);
            viewResolveView = null;
        }
        if (viewResolveView == null) {
            return null;
        }
        int width = viewResolveView.getWidth();
        int height = viewResolveView.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintM68615c = m68615c();
        canvas.save();
        canvas.translate(-viewResolveView.getLeft(), -viewResolveView.getTop());
        m68623k(canvas, viewResolveView, paintM68615c, 1.0f);
        canvas.restore();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: k */
    public static void m68623k(Canvas canvas, View view, Paint paint, float f11) {
        float alpha = f11 * view.getAlpha();
        canvas.save();
        m68614b(canvas, view);
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            int scrollX = scrollView.getScrollX();
            int scrollY = scrollView.getScrollY();
            canvas.clipRect(scrollX, scrollY, scrollView.getWidth() + scrollX, scrollView.getHeight() + scrollY);
        }
        if (view instanceof ViewGroup) {
            m68616d(canvas, view, alpha);
            m68617e(canvas, (ViewGroup) view, paint, alpha);
        } else {
            m68621i(canvas, view, paint, alpha);
        }
        canvas.restore();
    }
}
