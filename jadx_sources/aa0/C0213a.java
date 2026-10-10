package aa0;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.audio.C27337b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: aa0.a */
/* JADX INFO: compiled from: BlankAudioDataSource.java */
/* JADX INFO: loaded from: classes59.dex */
public class C0213a implements InterfaceC0214b {

    /* JADX INFO: renamed from: f */
    public static final int f624f = C27337b.m67941c(2048, 2);

    /* JADX INFO: renamed from: a */
    public final long f625a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f626b;

    /* JADX INFO: renamed from: c */
    public MediaFormat f627c;

    /* JADX INFO: renamed from: d */
    public long f628d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f629e = false;

    @Override // aa0.InterfaceC0214b
    @Nullable
    public double[] getLocation() {
        return null;
    }

    @Override // aa0.InterfaceC0214b
    public int getOrientation() {
        return 0;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: a */
    public boolean mo788a(@NonNull TrackType trackType) {
        return trackType == TrackType.AUDIO;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: b */
    public boolean mo789b() {
        return this.f628d >= getDurationUs();
    }

    @Override // aa0.InterfaceC0214b
    @Nullable
    /* JADX INFO: renamed from: d */
    public MediaFormat mo791d(@NonNull TrackType trackType) {
        if (trackType == TrackType.AUDIO) {
            return this.f627c;
        }
        return null;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: f */
    public void mo793f(@NonNull InterfaceC0214b.a aVar) {
        int iPosition = aVar.f630a.position();
        int iMin = Math.min(aVar.f630a.remaining(), f624f);
        this.f626b.clear();
        this.f626b.limit(iMin);
        aVar.f630a.put(this.f626b);
        aVar.f630a.position(iPosition);
        aVar.f630a.limit(iPosition + iMin);
        aVar.f631b = true;
        long j11 = this.f628d;
        aVar.f632c = j11;
        aVar.f633d = true;
        this.f628d = j11 + C27337b.m67940b(iMin, 44100, 2);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: g */
    public void mo794g() {
        this.f628d = 0L;
        this.f629e = false;
    }

    @Override // aa0.InterfaceC0214b
    public long getDurationUs() {
        return this.f625a;
    }

    @Override // aa0.InterfaceC0214b
    public long getPositionUs() {
        return this.f628d;
    }

    @Override // aa0.InterfaceC0214b
    public void initialize() {
        int i11 = f624f;
        this.f626b = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        MediaFormat mediaFormat = new MediaFormat();
        this.f627c = mediaFormat;
        mediaFormat.setString("mime", MimeTypes.AUDIO_RAW);
        this.f627c.setInteger("bitrate", C27337b.m67939a(44100, 2));
        this.f627c.setInteger("channel-count", 2);
        this.f627c.setInteger("max-input-size", i11);
        this.f627c.setInteger("sample-rate", 44100);
        this.f629e = true;
    }

    @Override // aa0.InterfaceC0214b
    public boolean isInitialized() {
        return this.f629e;
    }

    @Override // aa0.InterfaceC0214b
    public long seekTo(long j11) {
        this.f628d = j11;
        return j11;
    }

    public C0213a(long j11) {
        this.f625a = j11;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: c */
    public void mo790c(@NonNull TrackType trackType) {
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: e */
    public void mo792e(@NonNull TrackType trackType) {
    }
}
