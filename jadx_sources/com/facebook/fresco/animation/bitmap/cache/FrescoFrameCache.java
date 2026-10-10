package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p284g6.C37818c;
import p488o5.C42966c;
import p713w4.InterfaceC45718a;
import p747x3.C45999a;
import p749x5.C46079m;
import p749x5.InterfaceC46070d;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FrescoFrameCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\n0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006("}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/cache/FrescoFrameCache;", "Lw4/a;", "Lo5/c;", "animatedFrameCache", "", "enableBitmapReusing", "<init>", "(Lo5/c;Z)V", "", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "c", "(I)La4/a;", "b", "width", "height", "d", "(III)La4/a;", "contains", "(I)Z", "", "clear", "()V", "bitmapReference", "frameType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILa4/a;I)V", "e", "f", "(I)V", "Lo5/c;", "Z", "Landroid/util/SparseArray;", "Lx5/e;", "Landroid/util/SparseArray;", "preparedPendingFrames", "La4/a;", "lastRenderedItem", "Companion", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FrescoFrameCache implements InterfaceC45718a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Class<?> f8410f = FrescoFrameCache.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C42966c animatedFrameCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean enableBitmapReusing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<AbstractC0110a<InterfaceC46071e>> preparedPendingFrames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public AbstractC0110a<InterfaceC46071e> lastRenderedItem;

    /* JADX INFO: compiled from: FrescoFrameCache.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\tR\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/cache/FrescoFrameCache$Companion;", "", "<init>", "()V", "La4/a;", "Lx5/e;", "closeableImage", "Landroid/graphics/Bitmap;", "convertToBitmapReferenceAndClose", "(La4/a;)La4/a;", "imageReference", "", "b", "(La4/a;)I", "image", "c", "(Lx5/e;)I", "bitmapReference", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Class;", "TAG", "Ljava/lang/Class;", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC0110a<InterfaceC46071e> m8767a(AbstractC0110a<Bitmap> bitmapReference) {
            InterfaceC46072f interfaceC46072fM101553y = InterfaceC46072f.m101553y(bitmapReference, C46079m.f103527d, 0);
            Intrinsics.checkNotNullExpressionValue(interfaceC46072fM101553y, "of(...)");
            return AbstractC0110a.m558p(interfaceC46072fM101553y);
        }

        /* JADX INFO: renamed from: c */
        public final int m8769c(InterfaceC46071e image) {
            if (image instanceof InterfaceC46070d) {
                return C37818c.m85341j(((InterfaceC46070d) image).mo101544K());
            }
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public final int m8768b(AbstractC0110a<InterfaceC46071e> imageReference) {
            if (!AbstractC0110a.m557o(imageReference)) {
                return 0;
            }
            Intrinsics.checkNotNull(imageReference);
            return m8769c(imageReference.m565l());
        }

        @JvmStatic
        @VisibleForTesting
        @Nullable
        public final AbstractC0110a<Bitmap> convertToBitmapReferenceAndClose(@Nullable AbstractC0110a<InterfaceC46071e> closeableImage) {
            try {
                if (AbstractC0110a.m557o(closeableImage)) {
                    Intrinsics.checkNotNull(closeableImage);
                    if (closeableImage.m565l() instanceof InterfaceC46072f) {
                        InterfaceC46071e interfaceC46071eM565l = closeableImage.m565l();
                        Intrinsics.checkNotNull(interfaceC46071eM565l, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((InterfaceC46072f) interfaceC46071eM565l).mo101545f();
                    }
                }
                return null;
            } finally {
                AbstractC0110a.m555j(closeableImage);
            }
        }
    }

    @Override // p713w4.InterfaceC45718a
    /* JADX INFO: renamed from: a */
    public synchronized void mo8761a(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        m8766f(frameNumber);
        AbstractC0110a<InterfaceC46071e> abstractC0110aM8767a = null;
        try {
            abstractC0110aM8767a = INSTANCE.m8767a(bitmapReference);
            if (abstractC0110aM8767a != null) {
                AbstractC0110a.m555j(this.lastRenderedItem);
                this.lastRenderedItem = this.animatedFrameCache.m94347a(frameNumber, abstractC0110aM8767a);
            }
            AbstractC0110a.m555j(abstractC0110aM8767a);
        } catch (Throwable th2) {
            AbstractC0110a.m555j(abstractC0110aM8767a);
            throw th2;
        }
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized AbstractC0110a<Bitmap> mo8762b(int frameNumber) {
        return INSTANCE.convertToBitmapReferenceAndClose(AbstractC0110a.m553h(this.lastRenderedItem));
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: c */
    public synchronized AbstractC0110a<Bitmap> mo8763c(int frameNumber) {
        return INSTANCE.convertToBitmapReferenceAndClose(this.animatedFrameCache.m94349c(frameNumber));
    }

    @Override // p713w4.InterfaceC45718a
    public synchronized void clear() {
        try {
            AbstractC0110a.m555j(this.lastRenderedItem);
            this.lastRenderedItem = null;
            int size = this.preparedPendingFrames.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0110a.m555j(this.preparedPendingFrames.valueAt(i11));
            }
            this.preparedPendingFrames.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p713w4.InterfaceC45718a
    public synchronized boolean contains(int frameNumber) {
        return this.animatedFrameCache.m94348b(frameNumber);
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized AbstractC0110a<Bitmap> mo8764d(int frameNumber, int width, int height) {
        if (!this.enableBitmapReusing) {
            return null;
        }
        return INSTANCE.convertToBitmapReferenceAndClose(this.animatedFrameCache.m94350d());
    }

    @Override // p713w4.InterfaceC45718a
    /* JADX INFO: renamed from: e */
    public synchronized void mo8765e(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
        try {
            AbstractC0110a<InterfaceC46071e> abstractC0110aM8767a = INSTANCE.m8767a(bitmapReference);
            if (abstractC0110aM8767a == null) {
                AbstractC0110a.m555j(abstractC0110aM8767a);
                return;
            }
            AbstractC0110a<InterfaceC46071e> abstractC0110aM94347a = this.animatedFrameCache.m94347a(frameNumber, abstractC0110aM8767a);
            if (AbstractC0110a.m557o(abstractC0110aM94347a)) {
                AbstractC0110a.m555j(this.preparedPendingFrames.get(frameNumber));
                this.preparedPendingFrames.put(frameNumber, abstractC0110aM94347a);
                C45999a.m101520z(f8410f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
            }
            AbstractC0110a.m555j(abstractC0110aM8767a);
        } catch (Throwable th2) {
            AbstractC0110a.m555j(null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m8766f(int frameNumber) {
        AbstractC0110a<InterfaceC46071e> abstractC0110a = this.preparedPendingFrames.get(frameNumber);
        if (abstractC0110a != null) {
            this.preparedPendingFrames.delete(frameNumber);
            AbstractC0110a.m555j(abstractC0110a);
            C45999a.m101520z(f8410f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(frameNumber), this.preparedPendingFrames);
        }
    }

    public FrescoFrameCache(@NotNull C42966c animatedFrameCache, boolean z11) {
        Intrinsics.checkNotNullParameter(animatedFrameCache, "animatedFrameCache");
        this.animatedFrameCache = animatedFrameCache;
        this.enableBitmapReusing = z11;
        this.preparedPendingFrames = new SparseArray<>();
    }
}
