package com.google.android.gms.internal.p849authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zbu extends zbb implements zbv {
    @Override // com.google.android.gms.internal.p849authapi.zbb
    public final boolean zba(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) zbc.zba(parcel, SavePasswordResult.CREATOR);
        zbc.zbb(parcel);
        zbb(status, savePasswordResult);
        return true;
    }

    public zbu() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }
}
