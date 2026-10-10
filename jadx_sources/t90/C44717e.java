package t90;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.appsflyer.AppsFlyerProperties;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.AbstractC27360f;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27356b;
import com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;
import z90.InterfaceC46735a;

/* JADX INFO: renamed from: t90.e */
/* JADX INFO: compiled from: Writer.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006%"}, m90084d2 = {"Lt90/e;", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "Lt90/g;", "Lt90/f;", "", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lz90/a;", "sink", "Lcom/otaliastudios/transcoder/common/TrackType;", "track", "<init>", "(Lz90/a;Lcom/otaliastudios/transcoder/common/TrackType;)V", "Landroid/media/MediaFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "d", "(Landroid/media/MediaFormat;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "state", "", "fresh", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f;", "Lz90/a;", "c", "Lcom/otaliastudios/transcoder/common/TrackType;", "Lt90/e;", "f", "()Lt90/e;", AppsFlyerProperties.CHANNEL, "Lw90/i;", "e", "Lw90/i;", "log", "Landroid/media/MediaCodec$BufferInfo;", "Landroid/media/MediaCodec$BufferInfo;", "info", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C44717e implements InterfaceC27361g<WriterData, InterfaceC44718f, Unit, InterfaceC27356b>, InterfaceC44718f {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46735a sink;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final TrackType track;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C44717e channel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final MediaCodec.BufferInfo info;

    @Override // t90.InterfaceC44718f
    /* JADX INFO: renamed from: d */
    public void mo98944d(@NotNull MediaFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.log.m101066c("handleFormat(" + format + ')');
        this.sink.mo101055a(this.track, format);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public C44717e getChannel() {
        return this.channel;
    }

    public C44717e(@NotNull InterfaceC46735a sink, @NotNull TrackType track) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(track, "track");
        this.sink = sink;
        this.track = track;
        this.channel = this;
        this.log = new C45770i("Writer");
        this.info = new MediaCodec.BufferInfo();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC27360f<Unit> mo67997b(@NotNull AbstractC27360f.b<WriterData> state, boolean fresh) {
        Intrinsics.checkNotNullParameter(state, "state");
        WriterData writerDataM68053a = state.m68053a();
        ByteBuffer buffer = writerDataM68053a.getBuffer();
        long timeUs = writerDataM68053a.getTimeUs();
        int flags = writerDataM68053a.getFlags();
        boolean z11 = state instanceof AbstractC27360f.a;
        MediaCodec.BufferInfo bufferInfo = this.info;
        int iPosition = buffer.position();
        int iRemaining = buffer.remaining();
        if (z11) {
            flags &= 4;
        }
        bufferInfo.set(iPosition, iRemaining, timeUs, flags);
        this.sink.mo101059e(this.track, buffer, this.info);
        state.m68053a().m98949d().invoke();
        if (z11) {
            return new AbstractC27360f.a(Unit.INSTANCE);
        }
        return new AbstractC27360f.b(Unit.INSTANCE);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    /* JADX INFO: renamed from: c */
    public void mo67962c(@NotNull InterfaceC27356b interfaceC27356b) {
        InterfaceC27361g.a.m68054a(this, interfaceC27356b);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.InterfaceC27361g
    public void release() {
        InterfaceC27361g.a.m68055b(this);
    }
}
