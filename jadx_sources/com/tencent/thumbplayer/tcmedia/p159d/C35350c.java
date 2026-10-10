package com.tencent.thumbplayer.tcmedia.p159d;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.d.c */
/* JADX INFO: loaded from: classes64.dex */
public class C35350c {

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<WeakReference<InterfaceC35348a>> f76013a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public void m78133a(InterfaceC35348a interfaceC35348a) {
        CopyOnWriteArrayList<WeakReference<InterfaceC35348a>> copyOnWriteArrayList;
        if (interfaceC35348a == null || (copyOnWriteArrayList = this.f76013a) == null || copyOnWriteArrayList.contains(interfaceC35348a)) {
            return;
        }
        this.f76013a.add(new WeakReference<>(interfaceC35348a));
    }

    /* JADX INFO: renamed from: a */
    public void m78134a(C35349b.a aVar) {
        CopyOnWriteArrayList<WeakReference<InterfaceC35348a>> copyOnWriteArrayList = this.f76013a;
        if (copyOnWriteArrayList != null) {
            Iterator<WeakReference<InterfaceC35348a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC35348a interfaceC35348a = it.next().get();
                if (interfaceC35348a != null) {
                    interfaceC35348a.mo78077a(aVar);
                }
            }
        }
    }
}
