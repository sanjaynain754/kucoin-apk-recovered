package com.sumsub.sns.internal.features.domain.mrtd;

import android.nfc.tech.IsoDep;
import com.sumsub.sns.internal.core.presentation.nfc.C28904i;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30268y {

    /* JADX INFO: renamed from: a */
    public final C29917M f60851a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29953a f60852b;

    /* JADX INFO: renamed from: a */
    public abstract Object mo70164a(IsoDep isoDep, Function1 function1, C28904i c28904i);

    public AbstractC30268y(C29917M c29917m, InterfaceC29953a interfaceC29953a) {
        this.f60851a = c29917m;
        this.f60852b = interfaceC29953a;
    }
}
