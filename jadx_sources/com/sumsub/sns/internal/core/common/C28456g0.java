package com.sumsub.sns.internal.core.common;

import cf0.C4947b;
import cf0.InterfaceC4957l;
import ih0.AbstractC38635q;
import ih0.AbstractC38637s;
import ih0.C38636r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28456g0 extends C4947b {
    @Override // cf0.C4947b, cf0.InterfaceC4957l.a
    public final void blockEnd(InterfaceC4957l interfaceC4957l, AbstractC38637s abstractC38637s) {
        AbstractC38637s abstractC38637sMo87320f;
        super.blockEnd(interfaceC4957l, abstractC38637s);
        AbstractC38637s abstractC38637sMo87320f2 = abstractC38637s.mo87320f();
        if (abstractC38637sMo87320f2 != null) {
            abstractC38637sMo87320f = abstractC38637sMo87320f2.mo87320f();
        } else {
            abstractC38637sMo87320f = null;
        }
        if ((abstractC38637sMo87320f2 instanceof C38636r) && abstractC38637s.m87357e() == null && (((C38636r) abstractC38637sMo87320f2).m87357e() instanceof C38636r) && (abstractC38637sMo87320f instanceof AbstractC38635q) && !((AbstractC38635q) abstractC38637sMo87320f).m87352n()) {
            interfaceC4957l.mo5196D();
            interfaceC4957l.mo5196D();
        }
    }
}
