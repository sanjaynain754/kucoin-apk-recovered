package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.j */
/* JADX INFO: loaded from: classes62.dex */
public class C35285j extends C35279d implements ITPMediaDRMAsset {

    /* JADX INFO: renamed from: a */
    private String f75848a;

    /* JADX INFO: renamed from: b */
    @TPCommonEnum.TP_DRM_TYPE
    private int f75849b;

    /* JADX INFO: renamed from: d */
    private String f75851d = "";

    /* JADX INFO: renamed from: c */
    private Map<String, String> f75850c = new HashMap();

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public Map<String, String> getDrmAllProperties() {
        return this.f75850c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public String getDrmPlayUrl() {
        return this.f75848a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public String getDrmProperty(String str, String str2) {
        String str3;
        Map<String, String> map = this.f75850c;
        return (map == null || map.isEmpty() || (str3 = this.f75850c.get(str)) == null) ? str2 : str3;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    @TPCommonEnum.TP_DRM_TYPE
    public int getDrmType() {
        return this.f75849b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public String getOfflineKeySetId() {
        return this.f75851d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setDrmPlayUrl(String str) {
        this.f75848a = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setDrmProperty(String str, String str2) {
        this.f75850c.put(str, str2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setDrmType(@TPCommonEnum.TP_DRM_TYPE int i11) {
        this.f75849b = i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset
    public void setOfflineKeySetId(String str) {
        this.f75851d = str;
    }

    public C35285j(@TPCommonEnum.TP_DRM_TYPE int i11, String str) {
        this.f75848a = str;
        this.f75849b = i11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p155b.C35279d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        try {
            return C35284i.m77873a(this);
        } catch (IOException e11) {
            TPLogUtil.m78798e("TPMediaDRMAsset", e11);
            return "";
        }
    }
}
