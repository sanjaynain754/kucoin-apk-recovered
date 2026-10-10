package com.tencent.thumbplayer.tcmedia.p164g.p168d;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.p164g.C35357a;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.AbstractC35366f;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.C35365e;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35376a;
import com.tencent.thumbplayer.tcmedia.p164g.p171f.C35377b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.d.b */
/* JADX INFO: loaded from: classes64.dex */
public final class C35371b {

    /* JADX INFO: renamed from: a */
    private InterfaceC35372c f76142a;

    /* JADX INFO: renamed from: b */
    private final int f76143b;

    /* JADX INFO: renamed from: c */
    private final String f76144c;

    /* JADX INFO: renamed from: d */
    private final CopyOnWriteArraySet<AbstractC35366f> f76145d = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b */
    private AbstractC35366f m78296b() {
        Iterator<AbstractC35366f> it = this.f76145d.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC35366f m78299a(C35365e c35365e) {
        AbstractC35366f abstractC35366fM78297b = m78297b(c35365e);
        if (C35380b.m78332a()) {
            C35380b.m78334b("CodecWrapperPool", "obtain codecWrapper:".concat(String.valueOf(abstractC35366fM78297b)));
        }
        if (abstractC35366fM78297b == null) {
            return null;
        }
        this.f76145d.remove(abstractC35366fM78297b);
        return abstractC35366fM78297b;
    }

    /* JADX INFO: renamed from: a */
    private AbstractC35366f m78295a(AbstractC35366f abstractC35366f, Iterator it) {
        while (it.hasNext()) {
            AbstractC35366f abstractC35366f2 = (AbstractC35366f) it.next();
            if (TextUtils.equals(abstractC35366f.m78286m(), abstractC35366f2.m78286m())) {
                return abstractC35366f2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC35366f m78297b(C35365e c35365e) {
        for (AbstractC35366f abstractC35366f : this.f76145d) {
            if (!abstractC35366f.f76095b && abstractC35366f.mo78237a(c35365e) != C35376a.b.KEEP_CODEC_RESULT_NO) {
                return abstractC35366f;
            }
            abstractC35366f.m78284k();
            if (abstractC35366f.m78285l()) {
                m78303b(abstractC35366f);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private AbstractC35366f m78298c(AbstractC35366f abstractC35366f) {
        AbstractC35366f abstractC35366fM78295a;
        return (C35357a.m78185a().m78199d().f76179d != C35377b.a.SAME || (abstractC35366fM78295a = m78295a(abstractC35366f, this.f76145d.iterator())) == null) ? m78296b() : abstractC35366fM78295a;
    }

    public final String toString() {
        return "size:" + this.f76145d.size() + " elements:" + this.f76145d;
    }

    public C35371b(int i11, String str) {
        this.f76143b = i11;
        this.f76144c = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m78300a(AbstractC35366f abstractC35366f) {
        if (m78302a()) {
            m78303b(m78298c(abstractC35366f));
        }
        this.f76145d.add(abstractC35366f);
    }

    /* JADX INFO: renamed from: b */
    public final void m78303b(AbstractC35366f abstractC35366f) {
        if (this.f76145d.remove(abstractC35366f)) {
            InterfaceC35372c interfaceC35372c = this.f76142a;
            if (interfaceC35372c != null) {
                interfaceC35372c.mo78294a(abstractC35366f);
                return;
            }
            return;
        }
        C35380b.m78337d("CodecWrapperPool", "pool:" + this.f76144c + " remove " + abstractC35366f + " not found");
    }

    /* JADX INFO: renamed from: a */
    public final void m78301a(InterfaceC35372c interfaceC35372c) {
        this.f76142a = interfaceC35372c;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78302a() {
        return this.f76145d.size() == this.f76143b;
    }
}
