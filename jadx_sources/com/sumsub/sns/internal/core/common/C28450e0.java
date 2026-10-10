package com.sumsub.sns.internal.core.common;

import android.text.Layout;
import android.text.style.AlignmentSpan;
import cf0.C4952g;
import cf0.InterfaceC4954i;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import of0.C43042d;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28450e0 implements InterfaceC4954i.a {

    /* JADX INFO: renamed from: a */
    public static final C28450e0 f57965a = new C28450e0();

    /* JADX INFO: renamed from: a */
    public static void m69327a(C43042d c43042d) {
        c43042d.m94528a(2, '@', Typography.dollar, new InterfaceC4964s() { // from class: com.sumsub.sns.internal.core.common.r1
            @Override // cf0.InterfaceC4964s
            /* JADX INFO: renamed from: a */
            public final Object mo5246a(C4952g c4952g, InterfaceC4962q interfaceC4962q) {
                return C28450e0.m69326a(c4952g, interfaceC4962q);
            }
        });
    }

    @Override // cf0.InterfaceC4954i.a
    public final /* bridge */ /* synthetic */ void apply(InterfaceC4954i interfaceC4954i) {
        m69327a((C43042d) interfaceC4954i);
    }

    /* JADX INFO: renamed from: a */
    public static final Object m69326a(C4952g c4952g, InterfaceC4962q interfaceC4962q) {
        return new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER);
    }
}
