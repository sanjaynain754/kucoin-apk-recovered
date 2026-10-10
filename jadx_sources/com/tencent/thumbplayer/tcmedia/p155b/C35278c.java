package com.tencent.thumbplayer.tcmedia.p155b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetOrderedMap;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.c */
/* JADX INFO: loaded from: classes62.dex */
public class C35278c implements ITPMediaAssetOrderedMap {

    /* JADX INFO: renamed from: a */
    private StringBuilder f75825a = new StringBuilder();

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetOrderedMap
    public void addKeyValue(String str, String str2) {
        TPLogUtil.m78800i("TPMediaAssetOrderedMap", "addKeyValue key:" + str + "=" + str2);
        StringBuilder sb2 = this.f75825a;
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        sb2.append(";");
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAssetOrderedMap
    public String getKeyValueStr() {
        TPLogUtil.m78800i("TPMediaAssetOrderedMap", "getKeyValueStr " + this.f75825a.toString());
        return this.f75825a.toString();
    }
}
