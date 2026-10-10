package aa0;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.transcoder.common.TrackType;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import r90.C43960c;
import w90.C45769h;
import w90.C45770i;
import w90.C45774m;
import w90.InterfaceC45771j;

/* JADX INFO: renamed from: aa0.d */
/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC0216d implements InterfaceC0214b {

    /* JADX INFO: renamed from: l */
    public static final AtomicInteger f635l = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final C45770i f636a = new C45770i("DefaultDataSource(" + f635l.getAndIncrement() + ")");

    /* JADX INFO: renamed from: b */
    public final InterfaceC45771j<MediaFormat> f637b = C45774m.m101096a(null);

    /* JADX INFO: renamed from: c */
    public final InterfaceC45771j<Integer> f638c = C45774m.m101096a(null);

    /* JADX INFO: renamed from: d */
    public final HashSet<TrackType> f639d = new HashSet<>();

    /* JADX INFO: renamed from: e */
    public final InterfaceC45771j<Long> f640e = C45774m.m101097b(0L, 0L);

    /* JADX INFO: renamed from: f */
    public MediaMetadataRetriever f641f = null;

    /* JADX INFO: renamed from: g */
    public MediaExtractor f642g = null;

    /* JADX INFO: renamed from: h */
    public long f643h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public boolean f644i = false;

    /* JADX INFO: renamed from: j */
    public long f645j = -1;

    /* JADX INFO: renamed from: k */
    public long f646k = -1;

    @Override // aa0.InterfaceC0214b
    @Nullable
    public double[] getLocation() {
        float[] fArrM101062a;
        this.f636a.m101066c("getLocation()");
        String strExtractMetadata = this.f641f.extractMetadata(23);
        if (strExtractMetadata == null || (fArrM101062a = new C45769h().m101062a(strExtractMetadata)) == null) {
            return null;
        }
        return new double[]{fArrM101062a[0], fArrM101062a[1]};
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo796h(@NonNull MediaExtractor mediaExtractor) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo797i(@NonNull MediaMetadataRetriever mediaMetadataRetriever);

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: a */
    public boolean mo788a(@NonNull TrackType trackType) {
        return this.f642g.getSampleTrackIndex() == this.f638c.mo67873M(trackType).intValue();
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: b */
    public boolean mo789b() {
        return this.f642g.getSampleTrackIndex() < 0;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: c */
    public void mo790c(@NonNull TrackType trackType) {
        this.f636a.m101066c("releaseTrack(" + trackType + ")");
        if (this.f639d.contains(trackType)) {
            this.f639d.remove(trackType);
            this.f642g.unselectTrack(this.f638c.mo67873M(trackType).intValue());
        }
    }

    @Override // aa0.InterfaceC0214b
    @Nullable
    /* JADX INFO: renamed from: d */
    public MediaFormat mo791d(@NonNull TrackType trackType) {
        this.f636a.m101066c("getTrackFormat(" + trackType + ")");
        return this.f637b.mo67883u(trackType);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: e */
    public void mo792e(@NonNull TrackType trackType) {
        this.f636a.m101066c("selectTrack(" + trackType + ")");
        if (this.f639d.contains(trackType)) {
            return;
        }
        this.f639d.add(trackType);
        this.f642g.selectTrack(this.f638c.mo67873M(trackType).intValue());
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: f */
    public void mo793f(@NonNull InterfaceC0214b.a aVar) {
        TrackType trackType;
        int sampleTrackIndex = this.f642g.getSampleTrackIndex();
        int iPosition = aVar.f630a.position();
        int iLimit = aVar.f630a.limit();
        int sampleData = this.f642g.readSampleData(aVar.f630a, iPosition);
        if (sampleData < 0) {
            throw new IllegalStateException("No samples available! Forgot to call canReadTrack / isDrained?");
        }
        int i11 = sampleData + iPosition;
        if (i11 > iLimit) {
            throw new IllegalStateException("MediaExtractor is not respecting the buffer limit. This might cause other issues down the pipeline.");
        }
        aVar.f630a.limit(i11);
        aVar.f630a.position(iPosition);
        aVar.f631b = (this.f642g.getSampleFlags() & 1) != 0;
        long sampleTime = this.f642g.getSampleTime();
        aVar.f632c = sampleTime;
        aVar.f633d = sampleTime < this.f645j || sampleTime >= this.f646k;
        this.f636a.m101070h("readTrack(): time=" + aVar.f632c + ", render=" + aVar.f633d + ", end=" + this.f646k);
        if (this.f638c.mo67871E() && this.f638c.mo67881p().intValue() == sampleTrackIndex) {
            trackType = TrackType.AUDIO;
        } else {
            trackType = (this.f638c.mo67870C() && this.f638c.mo67880o().intValue() == sampleTrackIndex) ? TrackType.VIDEO : null;
        }
        if (trackType == null) {
            throw new RuntimeException("Unknown type: " + sampleTrackIndex);
        }
        this.f640e.mo101054z(trackType, Long.valueOf(aVar.f632c));
        this.f642g.advance();
        if (aVar.f633d || !mo789b()) {
            return;
        }
        this.f636a.m101072j("Force rendering the last frame. timeUs=" + aVar.f632c);
        aVar.f633d = true;
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: g */
    public void mo794g() {
        this.f636a.m101066c("deinitialize(): deinitializing...");
        try {
            this.f642g.release();
        } catch (Exception e11) {
            this.f636a.m101073k("Could not release extractor:", e11);
        }
        try {
            this.f641f.release();
        } catch (Exception e12) {
            this.f636a.m101073k("Could not release metadata:", e12);
        }
        this.f639d.clear();
        this.f643h = Long.MIN_VALUE;
        this.f640e.mo101053x(0L, 0L);
        this.f637b.mo101053x(null, null);
        this.f638c.mo101053x(null, null);
        this.f645j = -1L;
        this.f646k = -1L;
        this.f644i = false;
    }

    @Override // aa0.InterfaceC0214b
    public long getDurationUs() {
        try {
            return Long.parseLong(this.f641f.extractMetadata(9)) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // aa0.InterfaceC0214b
    public int getOrientation() {
        this.f636a.m101066c("getOrientation()");
        try {
            return Integer.parseInt(this.f641f.extractMetadata(24));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // aa0.InterfaceC0214b
    public void initialize() {
        this.f636a.m101066c("initialize(): initializing...");
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f642g = mediaExtractor;
        try {
            mo796h(mediaExtractor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f641f = mediaMetadataRetriever;
            mo797i(mediaMetadataRetriever);
            int trackCount = this.f642g.getTrackCount();
            for (int i11 = 0; i11 < trackCount; i11++) {
                MediaFormat trackFormat = this.f642g.getTrackFormat(i11);
                TrackType trackTypeM96909b = C43960c.m96909b(trackFormat);
                if (trackTypeM96909b != null && !this.f638c.mo67884w(trackTypeM96909b)) {
                    this.f638c.mo101054z(trackTypeM96909b, Integer.valueOf(i11));
                    this.f637b.mo101054z(trackTypeM96909b, trackFormat);
                }
            }
            for (int i12 = 0; i12 < this.f642g.getTrackCount(); i12++) {
                this.f642g.selectTrack(i12);
            }
            this.f643h = this.f642g.getSampleTime();
            this.f636a.m101070h("initialize(): found origin=" + this.f643h);
            for (int i13 = 0; i13 < this.f642g.getTrackCount(); i13++) {
                this.f642g.unselectTrack(i13);
            }
            this.f644i = true;
        } catch (IOException e11) {
            this.f636a.m101065b("Got IOException while trying to open MediaExtractor.", e11);
            throw new RuntimeException(e11);
        }
    }

    @Override // aa0.InterfaceC0214b
    public boolean isInitialized() {
        return this.f644i;
    }

    @Override // aa0.InterfaceC0214b
    public long seekTo(long j11) {
        boolean zContains = this.f639d.contains(TrackType.VIDEO);
        boolean zContains2 = this.f639d.contains(TrackType.AUDIO);
        this.f636a.m101066c("seekTo(): seeking to " + (this.f643h + j11) + " originUs=" + this.f643h + " extractorUs=" + this.f642g.getSampleTime() + " externalUs=" + j11 + " hasVideo=" + zContains + " hasAudio=" + zContains2);
        if (zContains && zContains2) {
            this.f642g.unselectTrack(this.f638c.mo67881p().intValue());
            this.f636a.m101070h("seekTo(): unselected AUDIO, seeking to " + (this.f643h + j11) + " (extractorUs=" + this.f642g.getSampleTime() + ")");
            this.f642g.seekTo(this.f643h + j11, 0);
            this.f636a.m101070h("seekTo(): unselected AUDIO and sought (extractorUs=" + this.f642g.getSampleTime() + ")");
            this.f642g.selectTrack(this.f638c.mo67881p().intValue());
            this.f636a.m101070h("seekTo(): reselected AUDIO, seeking to extractorUs (extractorUs=" + this.f642g.getSampleTime() + ")");
            MediaExtractor mediaExtractor = this.f642g;
            mediaExtractor.seekTo(mediaExtractor.getSampleTime(), 2);
            this.f636a.m101070h("seekTo(): seek workaround completed. (extractorUs=" + this.f642g.getSampleTime() + ")");
        } else {
            this.f642g.seekTo(this.f643h + j11, 0);
        }
        long sampleTime = this.f642g.getSampleTime();
        this.f645j = sampleTime;
        long j12 = this.f643h + j11;
        this.f646k = j12;
        if (sampleTime > j12) {
            this.f645j = j12;
        }
        this.f636a.m101066c("seekTo(): dontRenderRange=" + this.f645j + ".." + this.f646k + " (" + (this.f646k - this.f645j) + "us)");
        return this.f642g.getSampleTime() - this.f643h;
    }

    @Override // aa0.InterfaceC0214b
    public long getPositionUs() {
        if (!isInitialized()) {
            return 0L;
        }
        return Math.max(this.f640e.mo67881p().longValue(), this.f640e.mo67880o().longValue()) - this.f643h;
    }
}
