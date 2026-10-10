package com.otaliastudios.transcoder.internal.video;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.internal.codec.C27346b;
import com.otaliastudios.transcoder.internal.codec.InterfaceC27345a;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;

/* JADX INFO: compiled from: VideoRenderer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001a\u0010)\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/video/VideoRenderer;", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "Lcom/otaliastudios/transcoder/internal/codec/a;", "", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "", "sourceRotation", "extraRotation", "Landroid/media/MediaFormat;", "targetFormat", "", "flipY", "<init>", "(IILandroid/media/MediaFormat;Z)V", "sourceFormat", "Landroid/view/Surface;", "e", "(Landroid/media/MediaFormat;)Landroid/view/Surface;", "rawFormat", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/media/MediaFormat;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "release", "()V", "I", "c", "d", "Landroid/media/MediaFormat;", "Lw90/i;", "Lw90/i;", "log", "f", "Lcom/otaliastudios/transcoder/internal/video/VideoRenderer;", "()Lcom/otaliastudios/transcoder/internal/video/VideoRenderer;", AppsFlyerProperties.CHANNEL, "Lcom/otaliastudios/transcoder/internal/video/a;", "g", "Lkotlin/Lazy;", "()Lcom/otaliastudios/transcoder/internal/video/a;", "frameDrawer", "Lcom/otaliastudios/transcoder/internal/video/b;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/otaliastudios/transcoder/internal/video/b;", "frameDropper", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class VideoRenderer implements InterfaceC27361g<C27346b, InterfaceC27345a, Long, InterfaceC27356b>, InterfaceC27345a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int sourceRotation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int extraRotation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final MediaFormat targetFormat;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final VideoRenderer channel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy frameDrawer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public InterfaceC27366b frameDropper;

    public VideoRenderer(int i11, int i12, @NotNull MediaFormat targetFormat, final boolean z11) {
        Intrinsics.checkNotNullParameter(targetFormat, "targetFormat");
        this.sourceRotation = i11;
        this.extraRotation = i12;
        this.targetFormat = targetFormat;
        C45770i c45770i = new C45770i("VideoRenderer");
        this.log = c45770i;
        this.channel = this;
        this.frameDrawer = LazyKt.lazy(new Function0<C27365a>() { // from class: com.otaliastudios.transcoder.internal.video.VideoRenderer$frameDrawer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final C27365a invoke() {
                C27365a c27365a = new C27365a();
                c27365a.m68084j(z11);
                return c27365a;
            }
        });
        int integer = targetFormat.getInteger("width");
        int integer2 = targetFormat.getInteger("height");
        boolean z12 = i12 % 180 != 0;
        c45770i.m101064a("FrameDrawerEncoder: size=" + integer + '-' + integer2 + ", flipping=" + z12);
        targetFormat.setInteger("width", z12 ? integer2 : integer);
        targetFormat.setInteger("height", z12 ? integer : integer2);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public VideoRenderer getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: g */
    public final C27365a m68074g() {
        return (C27365a) this.frameDrawer.getValue();
    }

    @Override // com.otaliastudios.transcoder.internal.codec.InterfaceC27345a
    /* JADX INFO: renamed from: a */
    public void mo67918a(@NotNull MediaFormat rawFormat) {
        Intrinsics.checkNotNullParameter(rawFormat, "rawFormat");
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<Long> mo67997b(@NotNull AbstractC27360f.b<C27346b> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof AbstractC27360f.a) {
            state.m68053a().m67991b().invoke(Boolean.FALSE);
            return new AbstractC27360f.a(0L);
        }
        InterfaceC27366b interfaceC27366b = this.frameDropper;
        if (interfaceC27366b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frameDropper");
            interfaceC27366b = null;
        }
        if (interfaceC27366b.mo68087a(state.m68053a().getTimeUs())) {
            state.m68053a().m67991b().invoke(Boolean.TRUE);
            m68074g().m68080f();
            return new AbstractC27360f.b(Long.valueOf(state.m68053a().getTimeUs()));
        }
        state.m68053a().m67991b().invoke(Boolean.FALSE);
        return AbstractC27360f.d.f55760a;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: c */
    public void mo67962c(@NotNull InterfaceC27356b interfaceC27356b) {
        InterfaceC27361g.a.m68054a(this, interfaceC27356b);
    }

    @Override // com.otaliastudios.transcoder.internal.codec.InterfaceC27345a
    @NotNull
    /* JADX INFO: renamed from: e */
    public Surface mo67919e(@NotNull MediaFormat sourceFormat) {
        Object objM103844constructorimpl;
        int integer;
        int integer2;
        float f11;
        Intrinsics.checkNotNullParameter(sourceFormat, "sourceFormat");
        this.log.m101066c("handleSourceFormat(" + sourceFormat + ')');
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Integer.valueOf(sourceFormat.getInteger(MediaUtils.KEY_ROTATION)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        boolean z11 = false;
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            objM103844constructorimpl = 0;
        }
        int iIntValue = ((Number) objM103844constructorimpl).intValue();
        if (iIntValue == this.sourceRotation) {
            sourceFormat.setInteger(MediaUtils.KEY_ROTATION, 0);
            int i11 = (iIntValue + this.extraRotation) % TXVodDownloadDataSource.QUALITY_360P;
            m68074g().m68085k(i11);
            if (i11 % 180 != 0) {
                z11 = true;
            }
            float integer3 = sourceFormat.getInteger("width") / sourceFormat.getInteger("height");
            MediaFormat mediaFormat = this.targetFormat;
            if (z11) {
                integer = mediaFormat.getInteger("height");
            } else {
                integer = mediaFormat.getInteger("width");
            }
            float f12 = integer;
            if (z11) {
                integer2 = this.targetFormat.getInteger("width");
            } else {
                integer2 = this.targetFormat.getInteger("height");
            }
            float f13 = f12 / integer2;
            float f14 = 1.0f;
            if (integer3 > f13) {
                float f15 = integer3 / f13;
                f11 = 1.0f;
                f14 = f15;
            } else if (integer3 < f13) {
                f11 = f13 / integer3;
            } else {
                f11 = 1.0f;
            }
            m68074g().m68086l(f14, f11);
            this.frameDropper = C27367c.m68088a(sourceFormat.getInteger("frame-rate"), this.targetFormat.getInteger("frame-rate"));
            Surface surfaceM68082h = m68074g().m68082h();
            Intrinsics.checkNotNullExpressionValue(surfaceM68082h, "frameDrawer.surface");
            return surfaceM68082h;
        }
        throw new IllegalStateException(("Unexpected difference in rotation. DataSource=" + this.sourceRotation + ", MediaFormat=" + iIntValue).toString());
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        m68074g().m68083i();
    }

    public /* synthetic */ VideoRenderer(int i11, int i12, MediaFormat mediaFormat, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, mediaFormat, (i13 & 8) != 0 ? false : z11);
    }
}
