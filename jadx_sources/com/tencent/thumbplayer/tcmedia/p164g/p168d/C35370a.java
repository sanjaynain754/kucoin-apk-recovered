package com.tencent.thumbplayer.tcmedia.p164g.p168d;

import com.tencent.thumbplayer.tcmedia.p164g.p165a.InterfaceC35358a;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35365e;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35382d;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.d.a */
/* JADX INFO: loaded from: classes64.dex */
public final class C35370a {

    /* JADX INFO: renamed from: a */
    private final C35371b f76137a;

    /* JADX INFO: renamed from: b */
    private final C35371b f76138b;

    /* JADX INFO: renamed from: a */
    public final AbstractC35366f m78289a(C35365e c35365e) {
        AbstractC35366f abstractC35366fM78299a = this.f76137a.m78299a(c35365e);
        if (C35380b.m78332a()) {
            C35380b.m78334b("CodecWrapperManager", "obtainCodecWrapper codecWrapper:".concat(String.valueOf(abstractC35366fM78299a)));
        }
        return abstractC35366fM78299a;
    }

    /* JADX INFO: renamed from: a */
    public final String m78290a() {
        return "runningPool:" + this.f76138b + " keepPool:" + this.f76137a;
    }

    public C35370a() {
        C35371b c35371b = new C35371b(2, "keep");
        this.f76137a = c35371b;
        this.f76138b = new C35371b(Integer.MAX_VALUE, "running");
        c35371b.m78301a(new InterfaceC35372c() { // from class: com.tencent.thumbplayer.tcmedia.g.d.a.2
            @Override // com.tencent.thumbplayer.tcmedia.p164g.p168d.InterfaceC35372c
            /* JADX INFO: renamed from: a */
            public void mo78294a(AbstractC35366f abstractC35366f) {
                if (C35380b.m78332a()) {
                    C35380b.m78334b("CodecWrapperManager", "onErase codecWrapper:".concat(String.valueOf(abstractC35366f)));
                }
                abstractC35366f.m78282i();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m78291a(final AbstractC35366f abstractC35366f) {
        if (C35380b.m78332a()) {
            C35380b.m78334b("CodecWrapperManager", "transToRunning codecWrapper:".concat(String.valueOf(abstractC35366f)));
        }
        this.f76137a.m78303b(abstractC35366f);
        this.f76138b.m78300a(abstractC35366f);
        C35382d.m78351b(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.d.a.1
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC35358a interfaceC35358aM78281h = abstractC35366f.m78281h();
                if (interfaceC35358aM78281h != null) {
                    interfaceC35358aM78281h.onTransToRunningPool();
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m78292b(AbstractC35366f abstractC35366f) {
        if (C35380b.m78332a()) {
            C35380b.m78334b("CodecWrapperManager", "removeFromRunning codecWrapper:".concat(String.valueOf(abstractC35366f)));
        }
        this.f76138b.m78303b(abstractC35366f);
    }

    /* JADX INFO: renamed from: c */
    public final void m78293c(AbstractC35366f abstractC35366f) {
        if (C35380b.m78332a()) {
            C35380b.m78334b("CodecWrapperManager", "transTokeep codecWrapper:".concat(String.valueOf(abstractC35366f)));
        }
        this.f76138b.m78303b(abstractC35366f);
        this.f76137a.m78300a(abstractC35366f);
        InterfaceC35358a interfaceC35358aM78281h = abstractC35366f.m78281h();
        if (interfaceC35358aM78281h != null) {
            interfaceC35358aM78281h.onTransToKeepPool();
        }
    }
}
