package com.tencent.thumbplayer.tcmedia.p164g.p166b;

import android.media.MediaCodec;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35376a;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35381c;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b.g */
/* JADX INFO: loaded from: classes64.dex */
public final class C35367g extends AbstractC35366f {
    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f
    public final String toString() {
        return "VideoCodecWrapper[" + hashCode() + ']';
    }

    public C35367g(MediaCodec mediaCodec, C35365e c35365e) {
        super(mediaCodec, c35365e);
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f
    /* JADX INFO: renamed from: a */
    public final C35376a.b mo78237a(C35365e c35365e) {
        if (C35376a.m78317a(this, c35365e)) {
            int i11 = c35365e.f76080b;
            C35362b c35362b = this.f76100g;
            if (i11 <= c35362b.f76074a && c35365e.f76081c <= c35362b.f76075b && C35381c.m78340a(this, c35365e) <= this.f76100g.f76076c) {
                if (c35365e.m78259a(this.f76098e)) {
                    return C35376a.b.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION;
                }
                return C35376a.b.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION;
            }
        }
        return C35376a.b.KEEP_CODEC_RESULT_NO;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f
    /* JADX INFO: renamed from: j */
    public final boolean mo78283j() {
        if (super.mo78283j() && this.f76099f != null && this.f76098e.f76082d == 0) {
            return true;
        }
        return false;
    }
}
