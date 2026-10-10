package com.sumsub.sns.internal.core.presentation.form.model;

import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28845g0 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC28841e0 m69657a(AbstractC28841e0 abstractC28841e0, String str) {
        if (abstractC28841e0 instanceof C28861s) {
            C28861s c28861s = (C28861s) abstractC28841e0;
            return new C28861s(c28861s.f58696d, c28861s.f58697e, c28861s.f58698f, c28861s.f58699g, str, c28861s.f58701i);
        }
        if (abstractC28841e0 instanceof C28863u) {
            C28863u c28863u = (C28863u) abstractC28841e0;
            return new C28863u(c28863u.f58702d, c28863u.f58703e, c28863u.f58704f, str);
        }
        if (abstractC28841e0 instanceof C28819M) {
            C28819M c28819m = (C28819M) abstractC28841e0;
            return new C28819M(c28819m.f58608d, c28819m.f58609e, c28819m.f58610f, str, c28819m.f58612h, c28819m.f58613i, c28819m.f58614j, c28819m.f58615k);
        }
        if (abstractC28841e0 instanceof C28825T) {
            C28825T c28825t = (C28825T) abstractC28841e0;
            return new C28825T(c28825t.f58627d, c28825t.f58628e, c28825t.f58629f, str);
        }
        if (abstractC28841e0 instanceof C28831Z) {
            C28831Z c28831z = (C28831Z) abstractC28841e0;
            return new C28831Z(c28831z.f58639d, c28831z.f58640e, c28831z.f58641f, c28831z.f58642g, str, c28831z.f58644i, c28831z.f58645j, c28831z.f58646k);
        }
        if (abstractC28841e0 instanceof C28835b0) {
            C28835b0 c28835b0 = (C28835b0) abstractC28841e0;
            return new C28835b0(c28835b0.f58654d, c28835b0.f58655e, c28835b0.f58656f, str);
        }
        if (abstractC28841e0 instanceof C28854l) {
            C28854l c28854l = (C28854l) abstractC28841e0;
            return new C28854l(c28854l.f58679d, c28854l.f58680e, c28854l.f58681f, str);
        }
        if (abstractC28841e0 instanceof C28809C) {
            return C28809C.m69640a((C28809C) abstractC28841e0, null, str, null, null, null, null, 1007);
        }
        if (abstractC28841e0 instanceof C28817K) {
            return C28817K.m69645a((C28817K) abstractC28841e0, null, str, null, null, null, null, 2031);
        }
        if (abstractC28841e0 instanceof C28821O) {
            C28821O c28821o = (C28821O) abstractC28841e0;
            return new C28821O(c28821o.f58616d, c28821o.f58617e, c28821o.f58618f, c28821o.f58619g, c28821o.f58620h, c28821o.f58621i, c28821o.f58622j, str, c28821o.f58624l);
        }
        if (abstractC28841e0 instanceof C28827V) {
            C28827V c28827v = (C28827V) abstractC28841e0;
            return new C28827V(c28827v.f58631d, c28827v.f58632e, c28827v.f58633f, c28827v.f58634g, str, c28827v.f58636i);
        }
        if (abstractC28841e0 instanceof C28859q) {
            C28859q c28859q = (C28859q) abstractC28841e0;
            return new C28859q(c28859q.f58689d, c28859q.f58690e, c28859q.f58691f, c28859q.f58692g, c28859q.f58693h, str, c28859q.f58695j);
        }
        if (abstractC28841e0 instanceof C28857o) {
            C28857o c28857o = (C28857o) abstractC28841e0;
            return new C28857o(c28857o.f58683d, c28857o.f58684e, c28857o.f58685f, c28857o.f58686g, c28857o.f58687h, str);
        }
        if ((abstractC28841e0 instanceof C28865w) || (abstractC28841e0 instanceof C28811E) || (abstractC28841e0 instanceof C28823Q) || (abstractC28841e0 instanceof C28829X) || (abstractC28841e0 instanceof C28813G) || (abstractC28841e0 instanceof C28867y) || (abstractC28841e0 instanceof C28839d0) || (abstractC28841e0 instanceof C28846h) || (abstractC28841e0 instanceof C28815I)) {
            return abstractC28841e0;
        }
        throw new NoWhenBranchMatchedException();
    }
}
