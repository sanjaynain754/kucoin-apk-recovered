package com.sumsub.sentry;

import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import p852kotlin.text.Charsets;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sentry.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27945g0 {
    /* JADX INFO: renamed from: a */
    public static C27949h0 m69010a(C27973n0 c27973n0) {
        AbstractC46162a abstractC46162aM69286a = AbstractC28400J.m69286a(C28468k0.f57988f);
        abstractC46162aM69286a.getSerializersModule();
        byte[] bytes = abstractC46162aM69286a.mo99409b(C27973n0.Companion.serializer(), c27973n0).getBytes(Charsets.UTF_8);
        return new C27949h0(new C27961k0(SentryItemType.Event, bytes.length), bytes);
    }
}
