package kf0;

import androidx.annotation.NonNull;
import cf0.C4952g;
import cf0.C4965t;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4964s;
import gf0.AbstractC37912j;
import gf0.AbstractC37915m;
import gf0.InterfaceC37908f;
import ih0.C38620b;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: kf0.a */
/* JADX INFO: compiled from: BlockquoteHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public class C41017a extends AbstractC37915m {
    @Override // gf0.AbstractC37915m
    @NonNull
    /* JADX INFO: renamed from: b */
    public Collection<String> mo85735b() {
        return Collections.singleton("blockquote");
    }

    @Override // gf0.AbstractC37915m
    /* JADX INFO: renamed from: a */
    public void mo85734a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f interfaceC37908f) {
        if (interfaceC37908f.mo85698e()) {
            AbstractC37915m.m85733c(interfaceC4957l, abstractC37912j, interfaceC37908f.mo85695a());
        }
        C4952g c4952gMo5202o = interfaceC4957l.mo5202o();
        InterfaceC4964s interfaceC4964s = c4952gMo5202o.m5180c().get(C38620b.class);
        if (interfaceC4964s != null) {
            C4965t.m5248j(interfaceC4957l.builder(), interfaceC4964s.mo5246a(c4952gMo5202o, interfaceC4957l.mo5200h()), interfaceC37908f.start(), interfaceC37908f.mo85697c());
        }
    }
}
