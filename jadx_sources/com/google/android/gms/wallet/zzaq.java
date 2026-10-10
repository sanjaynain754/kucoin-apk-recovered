package com.google.android.gms.wallet;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzaq extends BaseImplementation.ApiMethodImpl {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    @VisibleForTesting
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract void doExecute(com.google.android.gms.internal.wallet.zzy zzyVar) throws RemoteException;

    public zzaq(GoogleApiClient googleApiClient) {
        super(Wallet.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
