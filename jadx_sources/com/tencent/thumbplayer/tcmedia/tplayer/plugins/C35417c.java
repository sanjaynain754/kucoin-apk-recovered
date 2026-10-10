package com.tencent.thumbplayer.tcmedia.tplayer.plugins;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.c */
/* JADX INFO: loaded from: classes64.dex */
public class C35417c implements InterfaceC35416b {

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<InterfaceC35415a> f76489a = new CopyOnWriteArrayList<>();

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78182a() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78183a(int i11, int i12, int i13, String str, Object obj) {
        CopyOnWriteArrayList<InterfaceC35415a> copyOnWriteArrayList = this.f76489a;
        if (copyOnWriteArrayList != null) {
            for (InterfaceC35415a interfaceC35415a : copyOnWriteArrayList) {
                int i14 = i11;
                int i15 = i12;
                int i16 = i13;
                String str2 = str;
                Object obj2 = obj;
                if (interfaceC35415a != null) {
                    interfaceC35415a.mo78183a(i14, i15, i16, str2, obj2);
                }
                i11 = i14;
                i12 = i15;
                i13 = i16;
                str = str2;
                obj = obj2;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35416b
    /* JADX INFO: renamed from: c */
    public void mo78694c() {
        CopyOnWriteArrayList<InterfaceC35415a> copyOnWriteArrayList = this.f76489a;
        if (copyOnWriteArrayList != null) {
            for (InterfaceC35415a interfaceC35415a : copyOnWriteArrayList) {
                if (interfaceC35415a != null) {
                    interfaceC35415a.mo78184b();
                }
            }
            this.f76489a.clear();
        }
        this.f76489a = null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35416b
    /* JADX INFO: renamed from: a */
    public void mo78693a(InterfaceC35415a interfaceC35415a) {
        CopyOnWriteArrayList<InterfaceC35415a> copyOnWriteArrayList = this.f76489a;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.contains(interfaceC35415a)) {
            return;
        }
        interfaceC35415a.mo78182a();
        this.f76489a.add(interfaceC35415a);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: b */
    public void mo78184b() {
    }
}
