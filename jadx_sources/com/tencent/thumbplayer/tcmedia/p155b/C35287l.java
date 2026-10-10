package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.l */
/* JADX INFO: loaded from: classes62.dex */
public class C35287l extends C35279d implements ITPMediaUrlAsset {

    /* JADX INFO: renamed from: a */
    private String f75855a;

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset
    public String getStreamUrl() {
        return this.f75855a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaUrlAsset
    public void setStreamUrl(String str) {
        this.f75855a = str;
    }

    public C35287l(String str) {
        this.f75855a = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return C35284i.m77875a(this);
        } catch (IOException e11) {
            TPLogUtil.m78798e("TPMediaUrlAsset", e11);
            return "";
        }
    }
}
