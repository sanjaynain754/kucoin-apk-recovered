package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35279d implements ITPMediaAsset {

    /* JADX INFO: renamed from: a */
    private ITPMediaAssetExtraParam f75826a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f75827b;

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public ITPMediaAssetExtraParam getExtraParam() {
        return this.f75826a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public Map<String, String> getHttpHeader() {
        return this.f75827b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        return "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public void setExtraParam(ITPMediaAssetExtraParam iTPMediaAssetExtraParam) {
        this.f75826a = iTPMediaAssetExtraParam;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public void setHttpHeader(Map<String, String> map) {
        this.f75827b = map;
    }
}
