package yf0;

import bf0.C4587b;
import io.opencensus.trace.C39220c;
import io.opencensus.trace.Span;
import tf0.C44941b;

/* JADX INFO: renamed from: yf0.d */
/* JADX INFO: compiled from: ContextUtils.java */
/* JADX INFO: loaded from: classes60.dex */
@Deprecated
public final class C46489d {

    /* JADX INFO: renamed from: a */
    public static final C4587b.d<Span> f104250a = C4587b.m4453m("opencensus-trace-span-key");

    /* JADX INFO: renamed from: a */
    public static Span m102563a(C4587b c4587b) {
        Span spanM4468a = f104250a.m4468a((C4587b) C44941b.m99389b(c4587b, "context"));
        return spanM4468a == null ? C39220c.f87110e : spanM4468a;
    }

    /* JADX INFO: renamed from: b */
    public static C4587b m102564b(C4587b c4587b, Span span) {
        return ((C4587b) C44941b.m99389b(c4587b, "context")).m4464v(f104250a, span);
    }
}
