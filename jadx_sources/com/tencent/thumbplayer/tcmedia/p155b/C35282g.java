package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.g */
/* JADX INFO: loaded from: classes62.dex */
public class C35282g extends C35279d implements ITPMediaTrack, Serializable {

    /* JADX INFO: renamed from: a */
    private int f75838a;

    /* JADX INFO: renamed from: b */
    private int f75839b;

    /* JADX INFO: renamed from: c */
    private List<ITPMediaTrackClip> f75840c;

    public C35282g(int i11) {
        this.f75838a = -1;
        this.f75839b = i11;
        this.f75840c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m77869a(ITPMediaTrackClip iTPMediaTrackClip) {
        try {
            if (iTPMediaTrackClip == null) {
                throw new IllegalArgumentException("add track clip , clip can not be null");
            }
            if (iTPMediaTrackClip.getMediaType() != this.f75839b) {
                throw new IllegalArgumentException("add track clip failed, media type is not same");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized int addTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
        m77869a(iTPMediaTrackClip);
        if (!this.f75840c.contains(iTPMediaTrackClip)) {
            this.f75840c.add(iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        TPLogUtil.m78800i("TPMediaCompositionTrack", "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
        return iTPMediaTrackClip.getClipId();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized List<ITPMediaTrackClip> getAllTrackClips() {
        return this.f75840c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public synchronized int getMediaType() {
        return this.f75839b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized long getTimelineDurationMs() {
        long originalDurationMs;
        Iterator<ITPMediaTrackClip> it = this.f75840c.iterator();
        originalDurationMs = 0;
        while (it.hasNext()) {
            originalDurationMs += it.next().getOriginalDurationMs();
        }
        return originalDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized ITPMediaTrackClip getTrackClip(int i11) {
        for (ITPMediaTrackClip iTPMediaTrackClip : this.f75840c) {
            if (iTPMediaTrackClip.getClipId() == i11) {
                return iTPMediaTrackClip;
            }
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized int getTrackId() {
        return this.f75838a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public synchronized String getUrl() {
        try {
        } catch (IOException e11) {
            TPLogUtil.m78798e("TPMediaCompositionTrack", e11);
            return null;
        }
        return C35284i.m77877a(this.f75840c, this.f75839b);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized int insertTrackClip(ITPMediaTrackClip iTPMediaTrackClip, int i11) {
        m77869a(iTPMediaTrackClip);
        if (this.f75840c.contains(iTPMediaTrackClip)) {
            TPLogUtil.m78800i("TPMediaCompositionTrack", "add track clip failed, clip already exists : " + iTPMediaTrackClip.getClipId());
            return iTPMediaTrackClip.getClipId();
        }
        if (i11 == -1) {
            this.f75840c.add(0, iTPMediaTrackClip);
            return iTPMediaTrackClip.getClipId();
        }
        int size = this.f75840c.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f75840c.get(i12).getClipId() == i11) {
                this.f75840c.add(i12 + 1, iTPMediaTrackClip);
                return iTPMediaTrackClip.getClipId();
            }
        }
        this.f75840c.add(iTPMediaTrackClip);
        TPLogUtil.m78800i("TPMediaCompositionTrack", "insert track clip into the end, coz after clip not found :".concat(String.valueOf(i11)));
        return iTPMediaTrackClip.getClipId();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized void removeAllTrackClips() {
        this.f75840c.clear();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized boolean removeTrackClip(ITPMediaTrackClip iTPMediaTrackClip) {
        try {
            if (iTPMediaTrackClip == null) {
                throw new IllegalArgumentException("remove track clip , clip can not be null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f75840c.remove(iTPMediaTrackClip);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack
    public synchronized boolean swapTrackClip(int i11, int i12) {
        if (i11 >= 0) {
            if (i11 < this.f75840c.size()) {
                if (i12 >= 0 && i12 < this.f75840c.size()) {
                    Collections.swap(this.f75840c, i11, i12);
                    return true;
                }
                TPLogUtil.m78802w("TPMediaCompositionTrack", "swap clip failed, to pos invalid , to pos :".concat(String.valueOf(i12)));
                return false;
            }
        }
        TPLogUtil.m78802w("TPMediaCompositionTrack", "swap clip failed, from pos invalid , from pos : ".concat(String.valueOf(i11)));
        return false;
    }

    public C35282g(int i11, int i12) {
        this.f75838a = i11;
        this.f75839b = i12;
        this.f75840c = new ArrayList();
    }
}
