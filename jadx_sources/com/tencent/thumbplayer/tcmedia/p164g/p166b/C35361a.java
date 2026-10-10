package com.tencent.thumbplayer.tcmedia.p164g.p166b;

import android.media.MediaCodec;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35376a;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.a */
/* JADX INFO: loaded from: classes64.dex */
public final class C35361a extends AbstractC35366f {
    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f
    public final String toString() {
        return "AudioCodecWrapper[" + hashCode() + ']';
    }

    public C35361a(MediaCodec mediaCodec, C35365e c35365e) {
        super(mediaCodec, c35365e);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f
    /* JADX INFO: renamed from: a */
    public final C35376a.b mo78237a(C35365e c35365e) {
        if (C35376a.m78317a(this, c35365e)) {
            return C35376a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION;
        }
        return C35376a.b.KEEP_CODEC_RESULT_NO;
    }
}
