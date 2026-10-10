package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.j */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7782j implements InterfaceC7783k {
    @Override // com.google.android.play.core.integrity.InterfaceC7783k
    @Nullable
    /* JADX INFO: renamed from: a */
    public final ApiException mo13261a(Bundle bundle) {
        int i11 = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i11 == 0) {
            return null;
        }
        return new StandardIntegrityException(i11, null);
    }
}
