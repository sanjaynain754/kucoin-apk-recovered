package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.remote.C29307Y0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30225l0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m70150a(List list) {
        C29307Y0 c29307y0;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30217h0 c30217h0 = (C30217h0) it.next();
            if (c30217h0 != null && (c29307y0 = c30217h0.f60735b) != null && c29307y0.m69844d()) {
                return true;
            }
        }
        return false;
    }
}
