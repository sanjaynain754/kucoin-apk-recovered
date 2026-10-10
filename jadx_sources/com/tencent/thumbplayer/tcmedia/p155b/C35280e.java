package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.e */
/* JADX INFO: loaded from: classes62.dex */
public class C35280e extends C35279d implements ITPMediaComposition {

    /* JADX INFO: renamed from: a */
    private int f75828a = 0;

    /* JADX INFO: renamed from: b */
    private int f75829b = 0;

    /* JADX INFO: renamed from: c */
    private int f75830c = 0;

    /* JADX INFO: renamed from: d */
    private List<ITPMediaTrack> f75831d = new ArrayList(1);

    /* JADX INFO: renamed from: e */
    private List<ITPMediaTrack> f75832e = new ArrayList(1);

    /* JADX INFO: renamed from: f */
    private List<ITPMediaTrack> f75833f = new ArrayList(1);

    /* JADX INFO: renamed from: d */
    private synchronized int m77862d() {
        int i11;
        i11 = this.f75828a + 1;
        this.f75828a = i11;
        return i11;
    }

    /* JADX INFO: renamed from: e */
    private synchronized int m77863e() {
        int i11;
        i11 = this.f75829b + 1;
        this.f75829b = i11;
        return i11;
    }

    /* JADX INFO: renamed from: f */
    private synchronized int m77864f() {
        int i11;
        i11 = this.f75830c + 1;
        this.f75830c = i11;
        return i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized ITPMediaTrack addAVTrack() {
        C35282g c35282g;
        c35282g = new C35282g(m77864f(), 1);
        this.f75833f.add(c35282g);
        return c35282g;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized ITPMediaTrack addAudioTrack() {
        C35282g c35282g;
        c35282g = new C35282g(m77863e(), 3);
        this.f75832e.add(c35282g);
        return c35282g;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized ITPMediaTrack addVideoTrack() {
        C35282g c35282g;
        c35282g = new C35282g(m77862d(), 2);
        this.f75831d.add(c35282g);
        return c35282g;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized List<ITPMediaTrack> getAllAudioTracks() {
        return this.f75832e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized List<ITPMediaTrack> getAllVideoTracks() {
        return this.f75831d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 4;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized boolean removeAudioTrack(ITPMediaTrack iTPMediaTrack) {
        try {
            if (iTPMediaTrack == null) {
                throw new IllegalArgumentException("remove audio track , track is null .");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75832e.remove(iTPMediaTrack);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public synchronized boolean removeVideoTrack(ITPMediaTrack iTPMediaTrack) {
        try {
            if (iTPMediaTrack == null) {
                throw new IllegalArgumentException("remove video track , track is null .");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75831d.remove(iTPMediaTrack);
    }

    /* JADX INFO: renamed from: a */
    public long m77865a() {
        List<ITPMediaTrack> list = this.f75831d;
        long timelineDurationMs = 0;
        if (list != null) {
            for (ITPMediaTrack iTPMediaTrack : list) {
                if (timelineDurationMs < iTPMediaTrack.getTimelineDurationMs()) {
                    timelineDurationMs = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return timelineDurationMs;
    }

    /* JADX INFO: renamed from: b */
    public long m77866b() {
        List<ITPMediaTrack> list = this.f75832e;
        long timelineDurationMs = 0;
        if (list != null) {
            for (ITPMediaTrack iTPMediaTrack : list) {
                if (timelineDurationMs < iTPMediaTrack.getTimelineDurationMs()) {
                    timelineDurationMs = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return timelineDurationMs;
    }

    /* JADX INFO: renamed from: c */
    public long m77867c() {
        List<ITPMediaTrack> list = this.f75833f;
        long timelineDurationMs = 0;
        if (list != null) {
            for (ITPMediaTrack iTPMediaTrack : list) {
                if (timelineDurationMs < iTPMediaTrack.getTimelineDurationMs()) {
                    timelineDurationMs = iTPMediaTrack.getTimelineDurationMs();
                }
            }
        }
        return timelineDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public List<ITPMediaTrack> getAllAVTracks() {
        return this.f75833f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[RETURN] */
    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public long getDurationMs() {
        if (!C35422b.m78845a(this.f75833f)) {
            return m77867c();
        }
        long jM77866b = m77866b();
        long jM77865a = m77865a();
        long j11 = jM77865a > jM77866b ? jM77865a : jM77866b;
        String str = C35281f.f75834a;
        str.getClass();
        switch (str) {
            case "base_longer":
                if (jM77865a > jM77866b) {
                    return jM77865a;
                }
                return jM77866b;
            case "base_audio":
                return jM77866b;
            case "base_video":
                return jM77865a;
            default:
                return j11;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public void release() {
        List<ITPMediaTrack> list = this.f75831d;
        if (list != null) {
            list.clear();
            this.f75831d = null;
        }
        List<ITPMediaTrack> list2 = this.f75832e;
        if (list2 != null) {
            list2.clear();
            this.f75832e = null;
        }
        List<ITPMediaTrack> list3 = this.f75833f;
        if (list3 != null) {
            list3.clear();
            this.f75833f = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaComposition
    public boolean removeAVTrack(ITPMediaTrack iTPMediaTrack) {
        if (iTPMediaTrack != null) {
            return this.f75833f.remove(iTPMediaTrack);
        }
        throw new IllegalArgumentException("remove audio track , track is null .");
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return C35284i.m77872a(this);
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPMediaComposition", e11);
            return null;
        }
    }
}
