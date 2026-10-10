package w90;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import z90.InterfaceC46735a;

/* JADX INFO: renamed from: w90.f */
/* JADX INFO: compiled from: eos.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\nJ'\u0010#\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0014\u0010(\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'¨\u0006)"}, m90084d2 = {"Lw90/f;", "Lz90/a;", "sink", "Lkotlin/Function0;", "", "ignore", "<init>", "(Lz90/a;Lkotlin/jvm/functions/Function0;)V", "", "release", "()V", "", JPushConstants.Geofence.KEY_LATITUDE, JPushConstants.Geofence.KEY_LONGITUDE, "b", "(DD)V", "", "orientation", "c", "(I)V", "Lcom/otaliastudios/transcoder/common/TrackType;", "type", "Landroid/media/MediaFormat;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/otaliastudios/transcoder/common/TrackType;Landroid/media/MediaFormat;)V", "Lcom/otaliastudios/transcoder/common/TrackStatus;", "status", "d", "(Lcom/otaliastudios/transcoder/common/TrackType;Lcom/otaliastudios/transcoder/common/TrackStatus;)V", InterfaceC33730j9.f70350a, "Ljava/nio/ByteBuffer;", "byteBuffer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "e", "(Lcom/otaliastudios/transcoder/common/TrackType;Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "Lz90/a;", "Lkotlin/jvm/functions/Function0;", "Landroid/media/MediaCodec$BufferInfo;", "info", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45767f implements InterfaceC46735a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46735a sink;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<Boolean> ignore;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final MediaCodec.BufferInfo info;

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: b */
    public void mo101056b(double latitude, double longitude) {
        this.sink.mo101056b(latitude, longitude);
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: c */
    public void mo101057c(int orientation) {
        this.sink.mo101057c(orientation);
    }

    @Override // z90.InterfaceC46735a
    public void release() {
        this.sink.release();
    }

    @Override // z90.InterfaceC46735a
    public void stop() {
        this.sink.stop();
    }

    public C45767f(@NotNull InterfaceC46735a sink, @NotNull Function0<Boolean> ignore) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(ignore, "ignore");
        this.sink = sink;
        this.ignore = ignore;
        this.info = new MediaCodec.BufferInfo();
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: a */
    public void mo101055a(@NonNull @NotNull TrackType type, @NonNull @NotNull MediaFormat format) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(format, "format");
        this.sink.mo101055a(type, format);
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: d */
    public void mo101058d(@NonNull @NotNull TrackType type, @NonNull @NotNull TrackStatus status) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        this.sink.mo101058d(type, status);
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: e */
    public void mo101059e(@NotNull TrackType type, @NotNull ByteBuffer byteBuffer, @NotNull MediaCodec.BufferInfo bufferInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (this.ignore.invoke().booleanValue()) {
            int i11 = bufferInfo.flags & (-5);
            int i12 = bufferInfo.size;
            if (i12 <= 0 && i11 == 0) {
                return;
            }
            this.info.set(bufferInfo.offset, i12, bufferInfo.presentationTimeUs, i11);
            this.sink.mo101059e(type, byteBuffer, this.info);
            return;
        }
        this.sink.mo101059e(type, byteBuffer, bufferInfo);
    }
}
