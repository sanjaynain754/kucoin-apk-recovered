package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import java.io.Serializable;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.a */
/* JADX INFO: loaded from: classes62.dex */
public class C35276a extends C35279d implements ITPMediaTrackClip, Serializable {

    /* JADX INFO: renamed from: a */
    private int f75819a;

    /* JADX INFO: renamed from: b */
    private int f75820b;

    /* JADX INFO: renamed from: c */
    private long f75821c = 0;

    /* JADX INFO: renamed from: d */
    private long f75822d = 0;

    /* JADX INFO: renamed from: e */
    private long f75823e;

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public ITPMediaTrackClip clone(int i11) {
        if (i11 != 3 && i11 != 2 && i11 != 1) {
            return null;
        }
        C35276a c35276a = new C35276a(i11);
        c35276a.f75820b = C35281f.m77868a(i11);
        c35276a.f75821c = this.f75821c;
        c35276a.f75822d = this.f75822d;
        return c35276a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C35276a)) {
            return false;
        }
        C35276a c35276a = (C35276a) obj;
        return this.f75820b == c35276a.getClipId() && this.f75819a == c35276a.getMediaType();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public String getFilePath() {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public int getClipId() {
        return this.f75820b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getEndTimeMs() {
        return this.f75822d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return this.f75819a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getOriginalDurationMs() {
        return this.f75822d - this.f75821c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartPositionMs() {
        return this.f75823e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartTimeMs() {
        return this.f75821c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setCutTimeRange(long j11, long j12) {
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 >= j12) {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.f75821c = j11;
        this.f75822d = j12;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setStartPositionMs(long j11) {
        this.f75823e = j11;
    }

    public C35276a(int i11) {
        this.f75819a = i11;
        this.f75820b = C35281f.m77868a(i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setOriginalDurationMs(long j11) {
    }
}
