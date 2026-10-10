package z90;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45771j;

/* JADX INFO: renamed from: z90.b */
/* JADX INFO: compiled from: DefaultDataSink.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46736b implements InterfaceC46735a {

    /* JADX INFO: renamed from: i */
    public static final C45770i f104547i = new C45770i("DefaultDataSink");

    /* JADX INFO: renamed from: a */
    public boolean f104548a;

    /* JADX INFO: renamed from: b */
    public final MediaMuxer f104549b;

    /* JADX INFO: renamed from: c */
    public final List<b> f104550c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f104551d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC45771j<TrackStatus> f104552e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC45771j<MediaFormat> f104553f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC45771j<Integer> f104554g;

    /* JADX INFO: renamed from: h */
    public final C46737c f104555h;

    /* JADX INFO: renamed from: z90.b$b */
    /* JADX INFO: compiled from: DefaultDataSink.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final TrackType f104556a;

        /* JADX INFO: renamed from: b */
        public final int f104557b;

        /* JADX INFO: renamed from: c */
        public final long f104558c;

        /* JADX INFO: renamed from: d */
        public final int f104559d;

        public b(@NonNull TrackType trackType, @NonNull MediaCodec.BufferInfo bufferInfo) {
            this.f104556a = trackType;
            this.f104557b = bufferInfo.size;
            this.f104558c = bufferInfo.presentationTimeUs;
            this.f104559d = bufferInfo.flags;
        }
    }

    public C46736b(@NonNull String str) {
        this(str, 0);
    }

    public C46736b(@NonNull String str, int i11) {
        this.f104548a = false;
        this.f104550c = new ArrayList();
        this.f104552e = C45774m.m101096a(null);
        this.f104553f = C45774m.m101096a(null);
        this.f104554g = C45774m.m101096a(null);
        this.f104555h = new C46737c();
        try {
            this.f104549b = new MediaMuxer(str, i11);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: a */
    public void mo101055a(@NonNull TrackType trackType, @NonNull MediaFormat mediaFormat) {
        f104547i.m101066c("setTrackFormat(" + trackType + ") format=" + mediaFormat);
        if (this.f104552e.mo67873M(trackType) == TrackStatus.COMPRESSING) {
            this.f104555h.m102989b(trackType, mediaFormat);
        }
        this.f104553f.mo101054z(trackType, mediaFormat);
        m102983h();
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: b */
    public void mo101056b(double d11, double d12) {
        this.f104549b.setLocation((float) d11, (float) d12);
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: c */
    public void mo101057c(int i11) {
        this.f104549b.setOrientationHint(i11);
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: d */
    public void mo101058d(@NonNull TrackType trackType, @NonNull TrackStatus trackStatus) {
        this.f104552e.mo101054z(trackType, trackStatus);
    }

    @Override // z90.InterfaceC46735a
    /* JADX INFO: renamed from: e */
    public void mo101059e(@NonNull TrackType trackType, @NonNull ByteBuffer byteBuffer, @NonNull MediaCodec.BufferInfo bufferInfo) {
        if (this.f104548a) {
            this.f104549b.writeSampleData(this.f104554g.mo67873M(trackType).intValue(), byteBuffer, bufferInfo);
        } else {
            m102982g(trackType, byteBuffer, bufferInfo);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m102981f() {
        if (this.f104550c.isEmpty()) {
            return;
        }
        this.f104551d.flip();
        f104547i.m101066c("Output format determined, writing pending data into the muxer. samples:" + this.f104550c.size() + " bytes:" + this.f104551d.limit());
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i11 = 0;
        for (b bVar : this.f104550c) {
            bufferInfo.set(i11, bVar.f104557b, bVar.f104558c, bVar.f104559d);
            mo101059e(bVar.f104556a, this.f104551d, bufferInfo);
            i11 += bVar.f104557b;
        }
        this.f104550c.clear();
        this.f104551d = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m102982g(@NonNull TrackType trackType, @NonNull ByteBuffer byteBuffer, @NonNull MediaCodec.BufferInfo bufferInfo) {
        if (this.f104551d == null) {
            this.f104551d = ByteBuffer.allocateDirect(262144).order(ByteOrder.nativeOrder());
        }
        f104547i.m101070h("enqueue(" + trackType + "): offset=" + bufferInfo.offset + "\trealOffset=" + byteBuffer.position() + "\tsize=" + bufferInfo.size + "\trealSize=" + byteBuffer.remaining() + "\tavailable=" + this.f104551d.remaining() + "\ttotal=262144");
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        this.f104551d.put(byteBuffer);
        this.f104550c.add(new b(trackType, bufferInfo));
    }

    /* JADX INFO: renamed from: h */
    public final void m102983h() {
        if (this.f104548a) {
            return;
        }
        InterfaceC45771j<TrackStatus> interfaceC45771j = this.f104552e;
        TrackType trackType = TrackType.VIDEO;
        boolean zIsTranscoding = interfaceC45771j.mo67873M(trackType).isTranscoding();
        InterfaceC45771j<TrackStatus> interfaceC45771j2 = this.f104552e;
        TrackType trackType2 = TrackType.AUDIO;
        boolean zIsTranscoding2 = interfaceC45771j2.mo67873M(trackType2).isTranscoding();
        MediaFormat mediaFormatMo67883u = this.f104553f.mo67883u(trackType);
        MediaFormat mediaFormatMo67883u2 = this.f104553f.mo67883u(trackType2);
        boolean z11 = (mediaFormatMo67883u == null && zIsTranscoding) ? false : true;
        boolean z12 = (mediaFormatMo67883u2 == null && zIsTranscoding2) ? false : true;
        if (z11 && z12) {
            if (zIsTranscoding) {
                int iAddTrack = this.f104549b.addTrack(mediaFormatMo67883u);
                this.f104554g.mo101051L(Integer.valueOf(iAddTrack));
                f104547i.m101070h("Added track #" + iAddTrack + " with " + mediaFormatMo67883u.getString("mime") + " to muxer");
            }
            if (zIsTranscoding2) {
                int iAddTrack2 = this.f104549b.addTrack(mediaFormatMo67883u2);
                this.f104554g.mo101052v(Integer.valueOf(iAddTrack2));
                f104547i.m101070h("Added track #" + iAddTrack2 + " with " + mediaFormatMo67883u2.getString("mime") + " to muxer");
            }
            this.f104549b.start();
            this.f104548a = true;
            m102981f();
        }
    }

    @Override // z90.InterfaceC46735a
    public void release() {
        try {
            this.f104549b.release();
        } catch (Exception e11) {
            f104547i.m101073k("Failed to release the muxer.", e11);
        }
    }

    @Override // z90.InterfaceC46735a
    public void stop() {
        this.f104549b.stop();
    }
}
