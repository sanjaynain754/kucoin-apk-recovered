package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zbo extends com.google.android.gms.internal.p849authapi.zbb implements zbp {
    @Override // com.google.android.gms.internal.p849authapi.zbb
    public final boolean zba(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 1) {
            zbc();
        } else {
            if (i11 != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }

    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }
}
