package com.opensource.svgaplayer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.widget.ImageView;
import androidx.media3.exoplayer.upstream.CmcdData;
import h90.C38151b;
import i90.C38488a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.opensource.svgaplayer.d */
/* JADX INFO: compiled from: SVGADrawable.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0018R*\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0012\"\u0004\b$\u0010\u0010R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u00102\u001a\u0004\b/\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b'\u00105¨\u00066"}, m90084d2 = {"Lcom/opensource/svgaplayer/d;", "Landroid/graphics/drawable/Drawable;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lcom/opensource/svgaplayer/e;", "dynamicItem", "<init>", "(Lcom/opensource/svgaplayer/SVGAVideoEntity;Lcom/opensource/svgaplayer/e;)V", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "value", "Z", "getCleared", "()Z", "e", "(Z)V", "cleared", "b", "I", "f", "currentFrame", "Landroid/widget/ImageView$ScaleType;", "c", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "g", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "Lh90/b;", "d", "Lh90/b;", "drawer", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "()Lcom/opensource/svgaplayer/SVGAVideoEntity;", "Lcom/opensource/svgaplayer/e;", "()Lcom/opensource/svgaplayer/e;", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C27321d extends Drawable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int currentFrame;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final C38151b drawer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final SVGAVideoEntity videoItem;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C27322e dynamicItem;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean cleared = true;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: a */
    public final void m67742a() {
        for (C38488a c38488a : this.videoItem.m67723l()) {
            Integer playID = c38488a.getPlayID();
            if (playID != null) {
                int iIntValue = playID.intValue();
                C27326h c27326h = C27326h.f55530e;
                if (c27326h.m67797b()) {
                    c27326h.m67800e(iIntValue);
                } else {
                    SoundPool soundPool = this.videoItem.getSoundPool();
                    if (soundPool != null) {
                        soundPool.stop(iIntValue);
                    }
                }
            }
            c38488a.m87085e(null);
        }
        this.videoItem.m67713b();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentFrame() {
        return this.currentFrame;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27322e getDynamicItem() {
        return this.dynamicItem;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Nullable Canvas canvas) {
        if (this.cleared || canvas == null) {
            return;
        }
        this.drawer.mo86072a(canvas, this.currentFrame, this.scaleType);
    }

    /* JADX INFO: renamed from: e */
    public final void m67746e(boolean z11) {
        if (this.cleared == z11) {
            return;
        }
        this.cleared = z11;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public final void m67747f(int i11) {
        if (this.currentFrame == i11) {
            return;
        }
        this.currentFrame = i11;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public final void m67748g(@NotNull ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    /* JADX INFO: renamed from: h */
    public final void m67749h() {
        Iterator<T> it = this.videoItem.m67723l().iterator();
        while (it.hasNext()) {
            Integer playID = ((C38488a) it.next()).getPlayID();
            if (playID != null) {
                int iIntValue = playID.intValue();
                C27326h c27326h = C27326h.f55530e;
                if (c27326h.m67797b()) {
                    c27326h.m67800e(iIntValue);
                } else {
                    SoundPool soundPool = this.videoItem.getSoundPool();
                    if (soundPool != null) {
                        soundPool.stop(iIntValue);
                    }
                }
            }
        }
    }

    public C27321d(@NotNull SVGAVideoEntity sVGAVideoEntity, @NotNull C27322e c27322e) {
        this.videoItem = sVGAVideoEntity;
        this.dynamicItem = c27322e;
        this.drawer = new C38151b(sVGAVideoEntity, c27322e);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
