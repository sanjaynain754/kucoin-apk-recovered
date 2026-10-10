package com.facebook.fresco.animation.bitmap.cache;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p713w4.InterfaceC45718a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KeepLastFrameCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \b2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ/\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J-\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/cache/KeepLastFrameCache;", "Lw4/a;", "<init>", "()V", "", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "c", "(I)La4/a;", "b", "width", "height", "d", "(III)La4/a;", "", "contains", "(I)Z", "", "clear", "bitmapReference", "frameType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILa4/a;I)V", "e", "f", "I", "lastFrameNumber", "La4/a;", "lastBitmapReference", "Companion", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class KeepLastFrameCache implements InterfaceC45718a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int lastFrameNumber = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public AbstractC0110a<Bitmap> lastBitmapReference;

    @Override // p713w4.InterfaceC45718a
    /* JADX INFO: renamed from: a */
    public synchronized void mo8761a(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType) {
        try {
            Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
            if (this.lastBitmapReference != null) {
                Bitmap bitmapM565l = bitmapReference.m565l();
                AbstractC0110a<Bitmap> abstractC0110a = this.lastBitmapReference;
                if (Intrinsics.areEqual(bitmapM565l, abstractC0110a != null ? abstractC0110a.m565l() : null)) {
                    return;
                }
            }
            AbstractC0110a.m555j(this.lastBitmapReference);
            this.lastBitmapReference = AbstractC0110a.m553h(bitmapReference);
            this.lastFrameNumber = frameNumber;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized AbstractC0110a<Bitmap> mo8762b(int frameNumber) {
        return AbstractC0110a.m553h(this.lastBitmapReference);
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: c */
    public synchronized AbstractC0110a<Bitmap> mo8763c(int frameNumber) {
        return this.lastFrameNumber == frameNumber ? AbstractC0110a.m553h(this.lastBitmapReference) : null;
    }

    @Override // p713w4.InterfaceC45718a
    public synchronized void clear() {
        m8770f();
    }

    @Override // p713w4.InterfaceC45718a
    public synchronized boolean contains(int frameNumber) {
        return frameNumber == this.lastFrameNumber && AbstractC0110a.m557o(this.lastBitmapReference);
    }

    @Override // p713w4.InterfaceC45718a
    @Nullable
    /* JADX INFO: renamed from: d */
    public synchronized AbstractC0110a<Bitmap> mo8764d(int frameNumber, int width, int height) {
        AbstractC0110a<Bitmap> abstractC0110aM553h;
        try {
            abstractC0110aM553h = AbstractC0110a.m553h(this.lastBitmapReference);
            m8770f();
        } catch (Throwable th2) {
            m8770f();
            throw th2;
        }
        return abstractC0110aM553h;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m8770f() {
        AbstractC0110a.m555j(this.lastBitmapReference);
        this.lastBitmapReference = null;
        this.lastFrameNumber = -1;
    }

    @Override // p713w4.InterfaceC45718a
    /* JADX INFO: renamed from: e */
    public void mo8765e(int frameNumber, @NotNull AbstractC0110a<Bitmap> bitmapReference, int frameType) {
        Intrinsics.checkNotNullParameter(bitmapReference, "bitmapReference");
    }
}
