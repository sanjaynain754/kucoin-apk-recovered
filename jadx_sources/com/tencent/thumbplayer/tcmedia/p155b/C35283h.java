package com.tencent.thumbplayer.tcmedia.p155b;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import java.io.Serializable;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.h */
/* JADX INFO: loaded from: classes62.dex */
public class C35283h extends C35279d implements ITPMediaTrackClip, Serializable {

    /* JADX INFO: renamed from: a */
    private int f75841a;

    /* JADX INFO: renamed from: b */
    private int f75842b;

    /* JADX INFO: renamed from: c */
    private long f75843c;

    /* JADX INFO: renamed from: d */
    private long f75844d;

    /* JADX INFO: renamed from: e */
    private String f75845e;

    /* JADX INFO: renamed from: f */
    private long f75846f;

    /* JADX INFO: renamed from: g */
    private long f75847g;

    private C35283h() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public ITPMediaTrackClip clone(int i11) {
        if (i11 != 3 && i11 != 2 && i11 != 1) {
            return null;
        }
        C35283h c35283h = new C35283h();
        c35283h.f75841a = i11;
        c35283h.f75842b = C35281f.m77868a(this.f75841a);
        c35283h.f75843c = this.f75843c;
        c35283h.f75844d = this.f75844d;
        c35283h.f75845e = this.f75845e;
        return c35283h;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C35283h)) {
            return false;
        }
        C35283h c35283h = (C35283h) obj;
        return this.f75842b == c35283h.getClipId() && this.f75841a == c35283h.getMediaType();
    }

    public C35283h(String str, int i11) {
        this(str, i11, 0L, -1L);
    }

    /* JADX INFO: renamed from: a */
    public void m77870a(String str) {
        this.f75845e = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public int getClipId() {
        return this.f75842b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getEndTimeMs() {
        return this.f75844d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public String getFilePath() {
        return this.f75845e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return this.f75841a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getOriginalDurationMs() {
        return this.f75847g;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartPositionMs() {
        return this.f75846f;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartTimeMs() {
        return this.f75843c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        return this.f75845e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setOriginalDurationMs(long j11) {
        this.f75847g = j11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setStartPositionMs(long j11) {
        this.f75846f = j11;
    }

    public C35283h(String str, int i11, long j11, long j12) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("TPMediaCompositionTrackClip : clipPath empty");
        }
        this.f75841a = i11;
        this.f75845e = str;
        this.f75843c = j11;
        this.f75844d = j12;
        if (j11 < 0) {
            this.f75843c = 0L;
        }
        if (j12 <= 0) {
            this.f75844d = getOriginalDurationMs();
        }
        this.f75842b = C35281f.m77868a(this.f75841a);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setCutTimeRange(long j11, long j12) {
        if (j11 < getOriginalDurationMs()) {
            if (j12 <= getOriginalDurationMs()) {
                if (j11 < 0) {
                    j11 = 0;
                }
                if (j12 <= 0) {
                    j12 = getOriginalDurationMs();
                }
                if (j11 < j12) {
                    this.f75843c = j11;
                    this.f75844d = j12;
                    return;
                }
                throw new IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
            }
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        throw new IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
    }
}
