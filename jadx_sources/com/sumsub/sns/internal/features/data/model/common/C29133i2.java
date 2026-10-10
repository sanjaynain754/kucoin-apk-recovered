package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.core.data.listener.SNSIconHandler;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.i2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29133i2 extends AbstractC29180q2 {

    /* JADX INFO: renamed from: c */
    public static final C29133i2 f59097c = new C29133i2();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29133i2);
    }

    public C29133i2() {
        super("ID_CARD", SNSIconHandler.SNSIdentityTypeIcons.ID_CARD.getImageName());
    }

    public final String toString() {
        return "IDCard";
    }

    public final int hashCode() {
        return 635233413;
    }
}
