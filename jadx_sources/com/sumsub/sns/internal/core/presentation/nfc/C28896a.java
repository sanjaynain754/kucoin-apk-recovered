package com.sumsub.sns.internal.core.presentation.nfc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28896a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28897b f58756a;

    public C28896a(C28897b c28897b) {
        this.f58756a = c28897b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.nfc.action.ADAPTER_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            if (intExtra == 1) {
                this.f58756a.m69676a(Boolean.FALSE);
                return;
            }
            if (intExtra == 2) {
                this.f58756a.m69676a(Boolean.FALSE);
            } else if (intExtra == 3) {
                this.f58756a.m69676a(Boolean.TRUE);
            } else {
                if (intExtra != 4) {
                    return;
                }
                this.f58756a.m69676a(Boolean.FALSE);
            }
        }
    }
}
