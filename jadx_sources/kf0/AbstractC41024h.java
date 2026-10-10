package kf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cf0.C4952g;
import cf0.C4965t;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4962q;
import gf0.AbstractC37912j;
import gf0.AbstractC37915m;
import gf0.InterfaceC37908f;

/* JADX INFO: renamed from: kf0.h */
/* JADX INFO: compiled from: SimpleTagHandler.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC41024h extends AbstractC37915m {
    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Object mo89974d(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull InterfaceC37908f interfaceC37908f);

    @Override // gf0.AbstractC37915m
    /* JADX INFO: renamed from: a */
    public void mo85734a(@NonNull InterfaceC4957l interfaceC4957l, @NonNull AbstractC37912j abstractC37912j, @NonNull InterfaceC37908f interfaceC37908f) {
        if (interfaceC37908f.mo85698e()) {
            AbstractC37915m.m85733c(interfaceC4957l, abstractC37912j, interfaceC37908f.mo85695a());
        }
        Object objMo89974d = mo89974d(interfaceC4957l.mo5202o(), interfaceC4957l.mo5200h(), interfaceC37908f);
        if (objMo89974d != null) {
            C4965t.m5248j(interfaceC4957l.builder(), objMo89974d, interfaceC37908f.start(), interfaceC37908f.mo85697c());
        }
    }
}
