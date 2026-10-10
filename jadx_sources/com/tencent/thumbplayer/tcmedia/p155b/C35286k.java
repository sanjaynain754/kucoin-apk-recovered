package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.k */
/* JADX INFO: loaded from: classes62.dex */
public class C35286k extends C35279d implements ITPMediaRTCAsset {

    /* JADX INFO: renamed from: a */
    private String f75852a;

    /* JADX INFO: renamed from: b */
    private String f75853b;

    /* JADX INFO: renamed from: c */
    private int f75854c;

    public C35286k(String str, String str2) {
        this.f75854c = 0;
        this.f75852a = str;
        this.f75853b = str2;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    public C35286k(String str, String str2, int i11) {
        this.f75852a = str;
        this.f75853b = str2;
        this.f75854c = i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset
    public int getRtcSdpExchangeType() {
        return this.f75854c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset
    public String getRtcServerUrl() {
        return this.f75853b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaRTCAsset
    public String getRtcStreamUrl() {
        return this.f75852a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return C35284i.m77874a(this);
        } catch (IOException e11) {
            TPLogUtil.m78798e("TPMediaWebrtcAsset", e11);
            return "";
        }
    }
}
