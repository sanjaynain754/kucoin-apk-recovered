package com.google.android.gms.internal.identity;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
/* JADX INFO: loaded from: classes45.dex */
public final class zze extends GmsClient<zzh> {
    private final Activity zze;

    @Nullable
    private zzd zzf;

    @Nullable
    private final String zzg;
    private final int zzh;

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresAccount() {
        return true;
    }

    public zze(Activity activity, Looper looper, ClientSettings clientSettings, int i11, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super((Context) activity, looper, 12, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzg = clientSettings.getAccountName();
        this.zze = activity;
        this.zzh = i11;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return iInterfaceQueryLocalInterface instanceof zzh ? (zzh) iInterfaceQueryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        super.disconnect();
        zzd zzdVar = this.zzf;
        if (zzdVar != null) {
            zzdVar.zzb = null;
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    public final void zzp(UserAddressRequest userAddressRequest, int i11) {
        super.checkConnected();
        this.zzf = new zzd(i11, this.zze);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.zzg)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzg, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.zzh);
            ((zzh) super.getService()).zzc((zzg) Preconditions.checkNotNull(this.zzf), userAddressRequest, bundle);
        } catch (RemoteException e11) {
            Log.e("AddressClientImpl", "Exception requesting user address", e11);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(AddressConstants.Extras.EXTRA_ERROR_CODE, 555);
            ((zzd) Preconditions.checkNotNull(this.zzf)).zzc(1, bundle2);
        }
    }
}
