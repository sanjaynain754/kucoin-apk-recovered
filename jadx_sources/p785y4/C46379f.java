package p785y4;

import android.graphics.Bitmap;
import androidx.annotation.UiThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C5610a;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameLoaderFactory;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameResult;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC5611b;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p007a5.InterfaceC0130g;
import p683v4.InterfaceC45414a;
import p683v4.InterfaceC45417d;
import p713w4.InterfaceC45718a;
import p713w4.InterfaceC45719b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: y4.f */
/* JADX INFO: compiled from: FrameLoaderStrategy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004*\u00019\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001e\u00105\u001a\u0004\u0018\u0001008B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010:¨\u0006<"}, m90084d2 = {"Ly4/f;", "Ly4/a;", "", "source", "Lv4/d;", "animationInformation", "Lw4/b;", "bitmapFrameRenderer", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory;", "frameLoaderFactory", "", "downscaleFrameToDrawableDimensions", "<init>", "(Ljava/lang/String;Lv4/d;Lw4/b;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory;Z)V", "", "canvasWidth", "canvasHeight", "Lkotlin/Function0;", "", "onAnimationLoaded", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILkotlin/jvm/functions/Function0;)V", "frameNumber", "La4/a;", "Landroid/graphics/Bitmap;", "b", "(III)La4/a;", "onStop", "()V", "c", "Ly4/g;", "j", "(II)Ly4/g;", "k", "(Lv4/d;)I", "Lv4/d;", "Lw4/b;", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameLoaderFactory;", "d", "Z", "e", "Ljava/lang/String;", "cacheKey", "f", "I", "animationWidth", "g", "animationHeight", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/b;", "frameLoader", "i", "maxAnimationFps", "currentFps", "y4/f$a", "Ly4/f$a;", "dynamicFpsRender", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFrameLoaderStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameLoaderStrategy.kt\ncom/facebook/fresco/animation/bitmap/preparation/FrameLoaderStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class C46379f implements InterfaceC46374a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45417d animationInformation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45719b bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final FrameLoaderFactory frameLoaderFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean downscaleFrameToDrawableDimensions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int animationWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int animationHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public InterfaceC5611b frameLoader;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int maxAnimationFps;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentFps;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final a dynamicFpsRender;

    /* JADX INFO: renamed from: y4.f$a */
    /* JADX INFO: compiled from: FrameLoaderStrategy.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m90084d2 = {"y4/f$a", "La5/g;", "", "renderingFps", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "I", "c", "()I", "animationFps", "b", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a implements InterfaceC0130g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int animationFps;

        public a() {
            this.animationFps = C46379f.this.maxAnimationFps;
        }

        @Override // p007a5.InterfaceC0130g
        /* JADX INFO: renamed from: a */
        public void mo596a(int renderingFps) {
            if (renderingFps != C46379f.this.currentFps) {
                C46379f c46379f = C46379f.this;
                c46379f.currentFps = RangesKt.coerceIn(renderingFps, 1, c46379f.maxAnimationFps);
                InterfaceC5611b interfaceC5611bM102295l = C46379f.this.m102295l();
                if (interfaceC5611bM102295l != null) {
                    interfaceC5611bM102295l.mo8775b(C46379f.this.currentFps);
                }
            }
        }

        @Override // p007a5.InterfaceC0130g
        /* JADX INFO: renamed from: b */
        public int mo597b() {
            return C46379f.this.currentFps;
        }

        @Override // p007a5.InterfaceC0130g
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getAnimationFps() {
            return this.animationFps;
        }
    }

    public C46379f(@Nullable String str, @NotNull InterfaceC45417d animationInformation, @NotNull InterfaceC45719b bitmapFrameRenderer, @NotNull FrameLoaderFactory frameLoaderFactory, boolean z11) {
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(frameLoaderFactory, "frameLoaderFactory");
        this.animationInformation = animationInformation;
        this.bitmapFrameRenderer = bitmapFrameRenderer;
        this.frameLoaderFactory = frameLoaderFactory;
        this.downscaleFrameToDrawableDimensions = z11;
        this.cacheKey = str == null ? String.valueOf(hashCode()) : str;
        this.animationWidth = animationInformation.mo4288k();
        this.animationHeight = animationInformation.mo4285g();
        int iM102294k = m102294k(animationInformation);
        this.maxAnimationFps = iM102294k;
        this.currentFps = iM102294k;
        this.dynamicFpsRender = new a();
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m102292m() {
        return Unit.INSTANCE;
    }

    @Override // p785y4.InterfaceC46374a
    @UiThread
    /* JADX INFO: renamed from: a */
    public void mo102268a(int canvasWidth, int canvasHeight, @Nullable Function0<Unit> onAnimationLoaded) {
        if (canvasWidth <= 0 || canvasHeight <= 0 || this.animationWidth <= 0 || this.animationHeight <= 0) {
            return;
        }
        C46380g c46380gM102293j = m102293j(canvasWidth, canvasHeight);
        InterfaceC5611b interfaceC5611bM102295l = m102295l();
        if (interfaceC5611bM102295l != null) {
            int width = c46380gM102293j.getWidth();
            int width2 = c46380gM102293j.getWidth();
            if (onAnimationLoaded == null) {
                onAnimationLoaded = new Function0() { // from class: y4.e
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C46379f.m102292m();
                    }
                };
            }
            interfaceC5611bM102295l.mo8774a(width, width2, onAnimationLoaded);
        }
    }

    /* JADX INFO: renamed from: j */
    public final C46380g m102293j(int canvasWidth, int canvasHeight) {
        if (!this.downscaleFrameToDrawableDimensions) {
            return new C46380g(this.animationWidth, this.animationHeight);
        }
        int iCoerceAtMost = this.animationWidth;
        int iCoerceAtMost2 = this.animationHeight;
        if (canvasWidth < iCoerceAtMost || canvasHeight < iCoerceAtMost2) {
            double d11 = ((double) iCoerceAtMost) / ((double) iCoerceAtMost2);
            if (canvasHeight > canvasWidth) {
                iCoerceAtMost2 = RangesKt.coerceAtMost(canvasHeight, iCoerceAtMost2);
                iCoerceAtMost = (int) (((double) iCoerceAtMost2) * d11);
            } else {
                iCoerceAtMost = RangesKt.coerceAtMost(canvasWidth, iCoerceAtMost);
                iCoerceAtMost2 = (int) (((double) iCoerceAtMost) / d11);
            }
        }
        return new C46380g(iCoerceAtMost, iCoerceAtMost2);
    }

    /* JADX INFO: renamed from: k */
    public final int m102294k(InterfaceC45417d interfaceC45417d) {
        return (int) RangesKt.coerceAtLeast(TimeUnit.SECONDS.toMillis(1L) / ((long) (interfaceC45417d.mo4286h() / interfaceC45417d.mo4283a())), 1L);
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC5611b m102295l() {
        if (this.frameLoader == null) {
            this.frameLoader = this.frameLoaderFactory.m8791b(this.cacheKey, this.bitmapFrameRenderer, this.animationInformation);
        }
        return this.frameLoader;
    }

    @Override // p785y4.InterfaceC46374a
    @UiThread
    @Nullable
    /* JADX INFO: renamed from: b */
    public AbstractC0110a<Bitmap> mo102269b(int frameNumber, int canvasWidth, int canvasHeight) {
        FrameResult frameResultMo8776c;
        C46380g c46380gM102293j = m102293j(canvasWidth, canvasHeight);
        InterfaceC5611b interfaceC5611bM102295l = m102295l();
        if (interfaceC5611bM102295l != null) {
            frameResultMo8776c = interfaceC5611bM102295l.mo8776c(frameNumber, c46380gM102293j.getWidth(), c46380gM102293j.getHeight());
        } else {
            frameResultMo8776c = null;
        }
        if (frameResultMo8776c != null) {
            C5610a.f8443a.m8802h(this.dynamicFpsRender, frameResultMo8776c);
        }
        if (frameResultMo8776c == null) {
            return null;
        }
        return frameResultMo8776c.m8792a();
    }

    @Override // p785y4.InterfaceC46374a
    /* JADX INFO: renamed from: c */
    public void mo102270c() {
        InterfaceC5611b interfaceC5611bM102295l = m102295l();
        if (interfaceC5611bM102295l != null) {
            FrameLoaderFactory.INSTANCE.saveUnusedFrame(this.cacheKey, interfaceC5611bM102295l);
        }
        this.frameLoader = null;
    }

    @Override // p785y4.InterfaceC46374a
    /* JADX INFO: renamed from: d */
    public void mo102271d(@NotNull InterfaceC46375b interfaceC46375b, @NotNull InterfaceC45718a interfaceC45718a, @NotNull InterfaceC45414a interfaceC45414a, int i11, @Nullable Function0<Unit> function0) {
        InterfaceC46374a.a.m102276e(this, interfaceC46375b, interfaceC45718a, interfaceC45414a, i11, function0);
    }

    @Override // p785y4.InterfaceC46374a
    public void onStop() {
        InterfaceC5611b interfaceC5611bM102295l = m102295l();
        if (interfaceC5611bM102295l != null) {
            interfaceC5611bM102295l.onStop();
        }
        mo102270c();
    }
}
