package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;

/* JADX INFO: compiled from: com.google.android.gms:play-services-wallet@@19.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface zzq extends IInterface {
    void zzb(int i11, @Nullable FullWallet fullWallet, Bundle bundle) throws RemoteException;

    void zzc(Status status, boolean z11, Bundle bundle) throws RemoteException;

    void zzd(int i11, @Nullable MaskedWallet maskedWallet, Bundle bundle) throws RemoteException;

    void zze(Status status, @Nullable PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) throws RemoteException;

    void zzf(Status status, @Nullable PaymentData paymentData, Bundle bundle) throws RemoteException;

    void zzg(int i11, boolean z11, Bundle bundle) throws RemoteException;

    void zzh(int i11, Bundle bundle) throws RemoteException;
}
