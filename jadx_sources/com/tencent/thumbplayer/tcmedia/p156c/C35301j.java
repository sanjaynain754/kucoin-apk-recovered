package com.tencent.thumbplayer.tcmedia.p156c;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.j */
/* JADX INFO: loaded from: classes62.dex */
public class C35301j implements InterfaceC35293b {

    /* JADX INFO: renamed from: a */
    private ITPDownloadProxy f75953a;

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35293b
    /* JADX INFO: renamed from: a */
    public ITPDownloadProxy mo77963a() {
        return this.f75953a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.p156c.InterfaceC35293b
    /* JADX INFO: renamed from: a */
    public void mo77964a(int i11) {
        this.f75953a.pushEvent(i11);
    }

    public C35301j(ITPDownloadProxy iTPDownloadProxy) {
        this.f75953a = iTPDownloadProxy;
    }
}
