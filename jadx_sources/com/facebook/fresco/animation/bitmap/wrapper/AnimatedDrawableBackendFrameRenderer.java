package com.facebook.fresco.animation.bitmap.wrapper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p448m5.InterfaceC42426a;
import p713w4.InterfaceC45718a;
import p713w4.InterfaceC45719b;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedDrawableBackendFrameRenderer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010!¨\u0006&"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/wrapper/AnimatedDrawableBackendFrameRenderer;", "Lw4/b;", "Lw4/a;", "bitmapFrameCache", "Lm5/a;", "animatedDrawableBackend", "", "isNewRenderImplementation", "<init>", "(Lw4/a;Lm5/a;Z)V", "Landroid/graphics/Rect;", "bounds", "", "e", "(Landroid/graphics/Rect;)V", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILandroid/graphics/Bitmap;)Z", "Lw4/a;", "b", "Lm5/a;", "c", "Z", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;", "d", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;", "animatedImageCompositor", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", TUIConstants.TUIChat.CALL_BACK, "()I", "intrinsicWidth", "intrinsicHeight", "f", "Companion", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class AnimatedDrawableBackendFrameRenderer implements InterfaceC45719b {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Class<?> f8452g = AnimatedDrawableBackendFrameRenderer.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45718a bitmapFrameCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public InterfaceC42426a animatedDrawableBackend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AnimatedImageCompositor animatedImageCompositor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AnimatedImageCompositor.InterfaceC5637b callback;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer$a */
    /* JADX INFO: compiled from: AnimatedDrawableBackendFrameRenderer.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/fresco/animation/bitmap/wrapper/AnimatedDrawableBackendFrameRenderer$a", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "", "frameNumber", "Landroid/graphics/Bitmap;", "bitmap", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILandroid/graphics/Bitmap;)V", "La4/a;", "b", "(I)La4/a;", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5612a implements AnimatedImageCompositor.InterfaceC5637b {
        public C5612a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC5637b
        /* JADX INFO: renamed from: a */
        public void mo8812a(int frameNumber, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC5637b
        /* JADX INFO: renamed from: b */
        public AbstractC0110a<Bitmap> mo8813b(int frameNumber) {
            return AnimatedDrawableBackendFrameRenderer.this.bitmapFrameCache.mo8763c(frameNumber);
        }
    }

    public AnimatedDrawableBackendFrameRenderer(@NotNull InterfaceC45718a bitmapFrameCache, @NotNull InterfaceC42426a animatedDrawableBackend, boolean z11) {
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.bitmapFrameCache = bitmapFrameCache;
        this.animatedDrawableBackend = animatedDrawableBackend;
        this.isNewRenderImplementation = z11;
        C5612a c5612a = new C5612a();
        this.callback = c5612a;
        this.animatedImageCompositor = new AnimatedImageCompositor(this.animatedDrawableBackend, z11, c5612a);
    }

    @Override // p713w4.InterfaceC45719b
    /* JADX INFO: renamed from: c */
    public int mo8809c() {
        return this.animatedDrawableBackend.getWidth();
    }

    @Override // p713w4.InterfaceC45719b
    /* JADX INFO: renamed from: d */
    public int mo8810d() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // p713w4.InterfaceC45719b
    /* JADX INFO: renamed from: e */
    public void mo8811e(@Nullable Rect bounds) {
        InterfaceC42426a interfaceC42426aMo93137h = this.animatedDrawableBackend.mo93137h(bounds);
        Intrinsics.checkNotNullExpressionValue(interfaceC42426aMo93137h, "forNewBounds(...)");
        if (interfaceC42426aMo93137h != this.animatedDrawableBackend) {
            this.animatedDrawableBackend = interfaceC42426aMo93137h;
            this.animatedImageCompositor = new AnimatedImageCompositor(interfaceC42426aMo93137h, this.isNewRenderImplementation, this.callback);
        }
    }

    @Override // p713w4.InterfaceC45719b
    /* JADX INFO: renamed from: a */
    public boolean mo8808a(int frameNumber, @NotNull Bitmap targetBitmap) {
        Intrinsics.checkNotNullParameter(targetBitmap, "targetBitmap");
        try {
            this.animatedImageCompositor.m9110h(frameNumber, targetBitmap);
            return true;
        } catch (IllegalStateException e11) {
            C45999a.m101506l(f8452g, e11, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(frameNumber));
            return false;
        }
    }
}
