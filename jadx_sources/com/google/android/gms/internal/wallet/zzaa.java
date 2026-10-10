package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class zzaa extends zzas {
    final /* synthetic */ CreateWalletObjectsRequest zza;
    final /* synthetic */ int zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzab zzabVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i11) {
        super(googleApiClient);
        this.zza = createWalletObjectsRequest;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.wallet.zzaq, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* JADX INFO: renamed from: zza */
    public final void doExecute(zzy zzyVar) {
        zzyVar.zzp(this.zza, this.zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
