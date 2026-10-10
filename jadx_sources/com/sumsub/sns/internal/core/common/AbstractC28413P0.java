package com.sumsub.sns.internal.core.common;

import android.content.Context;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.P0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28413P0 {

    /* JADX INFO: renamed from: a */
    public static boolean f57921a;

    /* JADX INFO: renamed from: b */
    public static C28415Q0 f57922b;

    /* JADX INFO: renamed from: c */
    public static SNSSession f57923c;

    /* JADX INFO: renamed from: a */
    public static SNSSession m69295a() {
        if (!f57921a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SNSSession sNSSession = f57923c;
        if (sNSSession == null) {
            return null;
        }
        return sNSSession;
    }

    /* JADX INFO: renamed from: a */
    public static void m69296a(Context context, SNSSession sNSSession) {
        if (!f57921a) {
            C28415Q0 c28415q0 = new C28415Q0(context);
            f57922b = c28415q0;
            f57921a = true;
            if (sNSSession == null && (sNSSession = c28415q0.m69297a()) == null) {
                throw new IllegalStateException("SNSSession not found.");
            }
            f57923c = sNSSession;
            C28415Q0 c28415q1 = f57922b;
            (c28415q1 != null ? c28415q1 : null).m69298a(sNSSession);
            return;
        }
        if (sNSSession == null || Intrinsics.areEqual(m69295a().getSessionId(), sNSSession.getSessionId())) {
            return;
        }
        f57923c = sNSSession;
        C28415Q0 c28415q2 = f57922b;
        (c28415q2 != null ? c28415q2 : null).m69298a(sNSSession);
    }
}
