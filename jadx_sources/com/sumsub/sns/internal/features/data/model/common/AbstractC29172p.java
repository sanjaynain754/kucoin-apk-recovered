package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29172p {
    /* JADX INFO: renamed from: a */
    public final C29154m m69794a(C29070X c29070x) {
        Object next;
        Iterator it = mo69760k().f59151a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((C29154m) next).f59132a, c29070x)) {
                return (C29154m) next;
            }
        }
        next = null;
        return (C29154m) next;
    }

    /* JADX INFO: renamed from: a */
    public abstract C29332c mo69752a();

    /* JADX INFO: renamed from: b */
    public final String m69795b() {
        C29136j c29136jMo69755f = mo69755f();
        if (c29136jMo69755f != null) {
            return c29136jMo69755f.f59101a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo69753c();

    /* JADX INFO: renamed from: e */
    public abstract String mo69754e();

    /* JADX INFO: renamed from: f */
    public abstract C29136j mo69755f();

    /* JADX INFO: renamed from: g */
    public abstract String mo69756g();

    /* JADX INFO: renamed from: h */
    public abstract String mo69757h();

    /* JADX INFO: renamed from: i */
    public abstract List mo69758i();

    /* JADX INFO: renamed from: j */
    public abstract C29148l mo69759j();

    /* JADX INFO: renamed from: k */
    public abstract C29160n mo69760k();

    /* JADX INFO: renamed from: l */
    public abstract C29140j3 mo69761l();

    /* JADX INFO: renamed from: m */
    public abstract C29166o mo69762m();

    /* JADX INFO: renamed from: b */
    public final List m69796b(C29070X c29070x) {
        List list;
        C29154m c29154mM69794a = m69794a(c29070x);
        if (c29154mM69794a != null && (list = c29154mM69794a.f59133b) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC29121g2.m69769a((String) it.next()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m69797d() {
        if (mo69760k().f59152b) {
            List list = mo69760k().f59154d;
            if (list == null || list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m69798n() {
        ReviewAnswerType reviewAnswerType;
        C29164n3 c29164n3 = mo69762m().f59168e;
        if (c29164n3 != null) {
            reviewAnswerType = c29164n3.f59161c;
        } else {
            reviewAnswerType = null;
        }
        if (reviewAnswerType == ReviewAnswerType.Green) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m69799o() {
        ReviewAnswerType reviewAnswerType;
        C29164n3 c29164n3 = mo69762m().f59168e;
        ReviewRejectType reviewRejectType = null;
        if (c29164n3 != null) {
            reviewAnswerType = c29164n3.f59161c;
        } else {
            reviewAnswerType = null;
        }
        C29164n3 c29164n4 = mo69762m().f59168e;
        if (c29164n4 != null) {
            reviewRejectType = c29164n4.f59163e;
        }
        ReviewStatusType reviewStatusType = mo69762m().f59165b;
        if (reviewAnswerType == ReviewAnswerType.Red && reviewStatusType == ReviewStatusType.Completed) {
            if (reviewRejectType == ReviewRejectType.Final || reviewRejectType == ReviewRejectType.External) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m69800p() {
        ReviewAnswerType reviewAnswerType;
        C29164n3 c29164n3 = mo69762m().f59168e;
        ReviewRejectType reviewRejectType = null;
        if (c29164n3 != null) {
            reviewAnswerType = c29164n3.f59161c;
        } else {
            reviewAnswerType = null;
        }
        C29164n3 c29164n4 = mo69762m().f59168e;
        if (c29164n4 != null) {
            reviewRejectType = c29164n4.f59163e;
        }
        if (reviewAnswerType == ReviewAnswerType.Red && mo69762m().f59165b == ReviewStatusType.Completed && reviewRejectType == ReviewRejectType.Retry) {
            return true;
        }
        return false;
    }
}
