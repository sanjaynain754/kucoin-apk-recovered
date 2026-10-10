package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.core.data.listener.SNSIconHandler;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.p2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29175p2 extends AbstractC29180q2 {

    /* JADX INFO: renamed from: c */
    public static final C29175p2 f59174c = new C29175p2();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29175p2);
    }

    public C29175p2() {
        super("VISA", SNSIconHandler.SNSIdentityTypeIcons.VISA.getImageName());
    }

    public final String toString() {
        return "Visa";
    }

    public final int hashCode() {
        return -1044723557;
    }
}
