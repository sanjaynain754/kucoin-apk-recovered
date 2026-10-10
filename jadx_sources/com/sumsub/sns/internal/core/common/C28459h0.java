package com.sumsub.sns.internal.core.common;

import android.content.res.Resources;
import cf0.AbstractC4946a;
import cf0.C4952g;
import cf0.InterfaceC4954i;
import cf0.InterfaceC4955j;
import cf0.InterfaceC4957l;
import cf0.InterfaceC4962q;
import cf0.InterfaceC4964s;
import df0.C36671a;
import ff0.C37443b;
import ff0.C37449h;
import ih0.C38636r;
import io.noties.markwon.core.CoreProps;
import of0.C43042d;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.RegexOption;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28459h0 extends AbstractC4946a {
    /* JADX INFO: renamed from: a */
    public static final Object m69359a(C4952g c4952g, InterfaceC4962q interfaceC4962q) {
        C36671a c36671aM5182e = c4952g.m5182e();
        if (CoreProps.f86999a.m5237a(interfaceC4962q) != CoreProps.ListItemType.ORDERED) {
            return new C37443b(c36671aM5182e, 0);
        }
        Integer numM5237a = CoreProps.f87001c.m5237a(interfaceC4962q);
        return new C37449h(c36671aM5182e, (numM5237a != null ? numM5237a.intValue() : 1) + ". ");
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public final void configure(InterfaceC4954i.b bVar) {
        bVar.mo5194a(C43042d.class, C28450e0.f57965a);
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public final void configureConfiguration(C4952g.b bVar) {
        bVar.m5191i(new C28453f0());
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public final void configureSpansFactory(InterfaceC4955j.a aVar) {
        aVar.mo5195a(C38636r.class, new InterfaceC4964s() { // from class: com.sumsub.sns.internal.core.common.y1
            @Override // cf0.InterfaceC4964s
            /* JADX INFO: renamed from: a */
            public final Object mo5246a(C4952g c4952g, InterfaceC4962q interfaceC4962q) {
                return C28459h0.m69359a(c4952g, interfaceC4962q);
            }
        });
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public final void configureVisitor(InterfaceC4957l.b bVar) {
        bVar.mo5208c(new C28456g0());
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public final String processMarkdown(String str) {
        return new Regex("^><\\s*(.+\\S)\\s*$", RegexOption.MULTILINE).replace(str, new Function1() { // from class: com.sumsub.sns.internal.core.common.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28459h0.m69358a((MatchResult) obj);
            }
        });
    }

    @Override // cf0.AbstractC4946a, cf0.InterfaceC4954i
    public final void configureTheme(C36671a.a aVar) {
        super.configureTheme(aVar);
        aVar.m82095B((int) (4 * Resources.getSystem().getDisplayMetrics().density));
        aVar.m82097D(0);
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m69358a(MatchResult matchResult) {
        return "@@" + ((Object) matchResult.getGroupValues().get(1)) + "$$";
    }
}
