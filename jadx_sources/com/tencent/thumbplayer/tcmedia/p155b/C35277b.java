package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetObjectParam;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.b */
/* JADX INFO: loaded from: classes62.dex */
public class C35277b implements ITPMediaAssetExtraParam {

    /* JADX INFO: renamed from: a */
    private HashMap<String, Serializable> f75824a = new HashMap<>();

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public int getExtraInt(String str) {
        if (this.f75824a.containsKey(str)) {
            return ((Integer) this.f75824a.get(str)).intValue();
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public ITPMediaAssetObjectParam getExtraObject(String str) {
        if (this.f75824a.get(str) instanceof ITPMediaAssetObjectParam) {
            return (ITPMediaAssetObjectParam) this.f75824a.get(str);
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public String getExtraString(String str) {
        return this.f75824a.containsKey(str) ? (String) this.f75824a.get(str) : "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public void setExtraInt(String str, int i11) {
        this.f75824a.put(str, Integer.valueOf(i11));
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public void setExtraObject(String str, ITPMediaAssetObjectParam iTPMediaAssetObjectParam) {
        this.f75824a.put(str, iTPMediaAssetObjectParam);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetExtraParam
    public void setExtraString(String str, String str2) {
        this.f75824a.put(str, str2);
    }
}
