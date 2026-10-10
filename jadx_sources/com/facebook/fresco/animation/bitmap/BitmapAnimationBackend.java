package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.vito.options.RoundingOptions;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p526p5.AbstractC43387c;
import p683v4.C45416c;
import p683v4.InterfaceC45414a;
import p683v4.InterfaceC45417d;
import p713w4.InterfaceC45718a;
import p713w4.InterfaceC45719b;
import p747x3.C45999a;
import p785y4.InterfaceC46374a;
import p785y4.InterfaceC46375b;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BitmapAnimationBackend.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001mBO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J'\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\b\b\u0001\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u0017J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020&H\u0016¢\u0006\u0004\b5\u00104J\u0019\u00108\u001a\u00020&2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020&H\u0002¢\u0006\u0004\b=\u00104J'\u0010A\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0002¢\u0006\u0004\bA\u0010BJ/\u0010G\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010C\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010C\u001a\u00020?2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bI\u0010JJ7\u0010L\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010\"\u001a\u00020!2\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010NR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010RR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010SR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010TR\u0019\u0010Y\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\b\u001d\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010^R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010`R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010aR\u0016\u0010c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010aR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010hR\u0016\u0010j\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010aR\u0018\u0010l\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010k¨\u0006n"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/BitmapAnimationBackend;", "Lv4/a;", "Lv4/c$b;", "Lp5/c;", "platformBitmapFactory", "Lw4/a;", "bitmapFrameCache", "Lv4/d;", "animationInformation", "Lw4/b;", "bitmapFrameRenderer", "", "isNewRenderImplementation", "Ly4/a;", "bitmapFramePreparationStrategy", "Ly4/b;", "bitmapFramePreparer", "Lcom/facebook/fresco/vito/options/RoundingOptions;", "roundingOptions", "<init>", "(Lp5/c;Lw4/a;Lv4/d;Lw4/b;ZLy4/a;Ly4/b;Lcom/facebook/fresco/vito/options/RoundingOptions;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "frameNumber", "i", "(I)I", "k", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "b", "Landroid/graphics/drawable/Drawable;", "parent", "Landroid/graphics/Canvas;", "canvas", "m", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z", "alpha", "", "j", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "f", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "e", "(Landroid/graphics/Rect;)V", "c", "d", "clear", "()V", "n", "Lv4/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, CmcdData.Factory.STREAM_TYPE_LIVE, "(Lv4/a$a;)V", "frameType", "q", "(Landroid/graphics/Canvas;II)Z", CmcdData.Factory.STREAMING_FORMAT_SS, "La4/a;", "Landroid/graphics/Bitmap;", "targetBitmap", "r", "(ILa4/a;)Z", "bitmap", "", "currentBoundsWidth", "currentBoundsHeight", "t", "(ILandroid/graphics/Bitmap;FF)Z", "o", "(ILandroid/graphics/Bitmap;Landroid/graphics/Canvas;)V", "bitmapReference", "p", "(ILa4/a;Landroid/graphics/Canvas;I)Z", "Lp5/c;", "Lw4/a;", "Lv4/d;", "Lw4/b;", "Z", "Ly4/a;", "Ly4/b;", "", "[F", "getCornerRadii", "()[F", "cornerRadii", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "I", "bitmapWidth", "bitmapHeight", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrix", "pathFrameNumber", "Lv4/a$a;", "animationListener", "Companion", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BitmapAnimationBackend implements InterfaceC45414a, C45416c.b {

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Class<BitmapAnimationBackend> f8388s = BitmapAnimationBackend.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC43387c platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45718a bitmapFrameCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45417d animationInformation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45719b bitmapFrameRenderer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC46374a bitmapFramePreparationStrategy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC46375b bitmapFramePreparer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final float[] cornerRadii;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Rect bounds;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int bitmapWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int bitmapHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Path path;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Matrix matrix;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int pathFrameNumber;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public InterfaceC45414a.a animationListener;

    /* JADX INFO: renamed from: q */
    public final boolean m8754q(Canvas canvas, int frameNumber, int frameType) throws Throwable {
        AbstractC0110a<Bitmap> abstractC0110aMo8763c;
        boolean zM8753p;
        AbstractC0110a<Bitmap> abstractC0110a = null;
        try {
            boolean z11 = false;
            int i11 = 1;
            if (this.isNewRenderImplementation) {
                InterfaceC46374a interfaceC46374a = this.bitmapFramePreparationStrategy;
                AbstractC0110a<Bitmap> abstractC0110aMo102269b = interfaceC46374a != null ? interfaceC46374a.mo102269b(frameNumber, canvas.getWidth(), canvas.getHeight()) : null;
                if (abstractC0110aMo102269b != null) {
                    try {
                        if (abstractC0110aMo102269b.mo567n()) {
                            Bitmap bitmapM565l = abstractC0110aMo102269b.m565l();
                            Intrinsics.checkNotNullExpressionValue(bitmapM565l, "get(...)");
                            m8752o(frameNumber, bitmapM565l, canvas);
                            AbstractC0110a.m555j(abstractC0110aMo102269b);
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC0110a = abstractC0110aMo102269b;
                        AbstractC0110a.m555j(abstractC0110a);
                        throw th;
                    }
                }
                InterfaceC46374a interfaceC46374a2 = this.bitmapFramePreparationStrategy;
                if (interfaceC46374a2 != null) {
                    interfaceC46374a2.mo102268a(canvas.getWidth(), canvas.getHeight(), null);
                }
                AbstractC0110a.m555j(abstractC0110aMo102269b);
                return false;
            }
            if (frameType == 0) {
                abstractC0110aMo8763c = this.bitmapFrameCache.mo8763c(frameNumber);
                zM8753p = m8753p(frameNumber, abstractC0110aMo8763c, canvas, 0);
            } else if (frameType == 1) {
                abstractC0110aMo8763c = this.bitmapFrameCache.mo8764d(frameNumber, this.bitmapWidth, this.bitmapHeight);
                if (m8755r(frameNumber, abstractC0110aMo8763c) && m8753p(frameNumber, abstractC0110aMo8763c, canvas, 1)) {
                    z11 = true;
                }
                zM8753p = z11;
                i11 = 2;
            } else if (frameType == 2) {
                try {
                    abstractC0110aMo8763c = this.platformBitmapFactory.m95561b(this.bitmapWidth, this.bitmapHeight, this.bitmapConfig);
                    if (m8755r(frameNumber, abstractC0110aMo8763c) && m8753p(frameNumber, abstractC0110aMo8763c, canvas, 2)) {
                        z11 = true;
                    }
                    zM8753p = z11;
                    i11 = 3;
                } catch (RuntimeException e11) {
                    C45999a.m101485F(f8388s, "Failed to create frame bitmap", e11);
                    AbstractC0110a.m555j(null);
                    return false;
                }
            } else {
                if (frameType != 3) {
                    AbstractC0110a.m555j(null);
                    return false;
                }
                abstractC0110aMo8763c = this.bitmapFrameCache.mo8762b(frameNumber);
                zM8753p = m8753p(frameNumber, abstractC0110aMo8763c, canvas, 3);
                i11 = -1;
            }
            AbstractC0110a.m555j(abstractC0110aMo8763c);
            return (zM8753p || i11 == -1) ? zM8753p : m8754q(canvas, frameNumber, i11);
        } catch (Throwable th3) {
            th = th3;
            AbstractC0110a.m555j(abstractC0110a);
            throw th;
        }
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: a */
    public int mo4283a() {
        return this.animationInformation.mo4283a();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: b */
    public int mo4284b() {
        return this.animationInformation.mo4284b();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getBitmapWidth() {
        return this.bitmapWidth;
    }

    @Override // p683v4.InterfaceC45414a
    public void clear() {
        if (!this.isNewRenderImplementation) {
            this.bitmapFrameCache.clear();
            return;
        }
        InterfaceC46374a interfaceC46374a = this.bitmapFramePreparationStrategy;
        if (interfaceC46374a != null) {
            interfaceC46374a.mo102270c();
        }
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getBitmapHeight() {
        return this.bitmapHeight;
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: e */
    public void mo8746e(@Nullable Rect bounds) {
        this.bounds = bounds;
        this.bitmapFrameRenderer.mo8811e(bounds);
        m8756s();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: f */
    public void mo8747f(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: g */
    public int mo4285g() {
        return this.animationInformation.mo4285g();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: h */
    public int mo4286h() {
        return this.animationInformation.mo4286h();
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: i */
    public int mo4287i(int frameNumber) {
        return this.animationInformation.mo4287i(frameNumber);
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: j */
    public void mo8748j(@IntRange(from = 0, m1553to = 255) int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // p683v4.InterfaceC45417d
    /* JADX INFO: renamed from: k */
    public int mo4288k() {
        return this.animationInformation.mo4288k();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: l */
    public void mo8749l(@Nullable InterfaceC45414a.a listener) {
        this.animationListener = listener;
    }

    @Override // p683v4.C45416c.b
    /* JADX INFO: renamed from: n */
    public void mo8751n() {
        if (!this.isNewRenderImplementation) {
            clear();
            return;
        }
        InterfaceC46374a interfaceC46374a = this.bitmapFramePreparationStrategy;
        if (interfaceC46374a != null) {
            interfaceC46374a.onStop();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8752o(int frameNumber, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.bounds;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
        } else if (m8757t(frameNumber, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.path, this.paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.paint);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8753p(int frameNumber, AbstractC0110a<Bitmap> bitmapReference, Canvas canvas, int frameType) {
        if (bitmapReference == null || !AbstractC0110a.m557o(bitmapReference)) {
            return false;
        }
        Bitmap bitmapM565l = bitmapReference.m565l();
        Intrinsics.checkNotNullExpressionValue(bitmapM565l, "get(...)");
        m8752o(frameNumber, bitmapM565l, canvas);
        if (frameType == 3 || this.isNewRenderImplementation) {
            return true;
        }
        this.bitmapFrameCache.mo8761a(frameNumber, bitmapReference, frameType);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8755r(int frameNumber, AbstractC0110a<Bitmap> targetBitmap) {
        if (targetBitmap == null || !targetBitmap.mo567n()) {
            return false;
        }
        InterfaceC45719b interfaceC45719b = this.bitmapFrameRenderer;
        Bitmap bitmapM565l = targetBitmap.m565l();
        Intrinsics.checkNotNullExpressionValue(bitmapM565l, "get(...)");
        boolean zMo8808a = interfaceC45719b.mo8808a(frameNumber, bitmapM565l);
        if (!zMo8808a) {
            AbstractC0110a.m555j(targetBitmap);
        }
        return zMo8808a;
    }

    /* JADX INFO: renamed from: s */
    public final void m8756s() {
        int iMo8809c = this.bitmapFrameRenderer.mo8809c();
        this.bitmapWidth = iMo8809c;
        if (iMo8809c == -1) {
            Rect rect = this.bounds;
            this.bitmapWidth = rect != null ? rect.width() : -1;
        }
        int iMo8810d = this.bitmapFrameRenderer.mo8810d();
        this.bitmapHeight = iMo8810d;
        if (iMo8810d == -1) {
            Rect rect2 = this.bounds;
            this.bitmapHeight = rect2 != null ? rect2.height() : -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8757t(int frameNumber, Bitmap bitmap, float currentBoundsWidth, float currentBoundsHeight) {
        if (this.cornerRadii == null) {
            return false;
        }
        if (frameNumber == this.pathFrameNumber) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.matrix.setRectToRect(new RectF(0.0f, 0.0f, this.bitmapWidth, this.bitmapHeight), new RectF(0.0f, 0.0f, currentBoundsWidth, currentBoundsHeight), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.matrix);
        this.paint.setShader(bitmapShader);
        this.path.addRoundRect(new RectF(0.0f, 0.0f, currentBoundsWidth, currentBoundsHeight), this.cornerRadii, Path.Direction.CW);
        this.pathFrameNumber = frameNumber;
        return true;
    }

    public BitmapAnimationBackend(@NotNull AbstractC43387c platformBitmapFactory, @NotNull InterfaceC45718a bitmapFrameCache, @NotNull InterfaceC45417d animationInformation, @NotNull InterfaceC45719b bitmapFrameRenderer, boolean z11, @Nullable InterfaceC46374a interfaceC46374a, @Nullable InterfaceC46375b interfaceC46375b, @Nullable RoundingOptions roundingOptions) {
        float[] cornerRadii;
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.platformBitmapFactory = platformBitmapFactory;
        this.bitmapFrameCache = bitmapFrameCache;
        this.animationInformation = animationInformation;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.isNewRenderImplementation = z11;
        this.bitmapFramePreparationStrategy = interfaceC46374a;
        this.bitmapFramePreparer = interfaceC46375b;
        if (roundingOptions != null) {
            if (roundingOptions.getCornerRadius() == 0.0f) {
                cornerRadii = roundingOptions.getCornerRadii();
            } else {
                float[] fArr = new float[8];
                ArraysKt.fill$default(fArr, roundingOptions.getCornerRadius(), 0, 0, 6, (Object) null);
                cornerRadii = fArr;
            }
        } else {
            cornerRadii = null;
        }
        this.cornerRadii = cornerRadii;
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.paint = new Paint(6);
        this.path = new Path();
        this.matrix = new Matrix();
        this.pathFrameNumber = -1;
        m8756s();
    }

    @Override // p683v4.InterfaceC45414a
    /* JADX INFO: renamed from: m */
    public boolean mo8750m(@NotNull Drawable parent, @NotNull Canvas canvas, int frameNumber) throws Throwable {
        InterfaceC46375b interfaceC46375b;
        InterfaceC46374a interfaceC46374a;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean zM8754q = m8754q(canvas, frameNumber, 0);
        if (!this.isNewRenderImplementation && (interfaceC46375b = this.bitmapFramePreparer) != null && (interfaceC46374a = this.bitmapFramePreparationStrategy) != null) {
            InterfaceC46374a.a.m102277f(interfaceC46374a, interfaceC46375b, this.bitmapFrameCache, this, frameNumber, null, 16, null);
        }
        return zM8754q;
    }
}
