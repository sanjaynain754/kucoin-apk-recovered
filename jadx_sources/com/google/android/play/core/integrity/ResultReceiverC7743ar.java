package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ar */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class ResultReceiverC7743ar extends ResultReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BinderC7744as f11990a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        if (i11 == 1) {
            this.f11990a.f11991a.trySetResult(3);
        } else if (i11 == 2) {
            this.f11990a.f11991a.trySetResult(2);
        } else {
            if (i11 != 3) {
                return;
            }
            this.f11990a.f11991a.trySetResult(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC7743ar(BinderC7744as binderC7744as, Handler handler) {
        super(handler);
        this.f11990a = binderC7744as;
    }
}
