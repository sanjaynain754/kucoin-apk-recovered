package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.q */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractBinderC7835q extends BinderC7820b implements InterfaceC7836r {
    @Override // com.google.android.play.integrity.internal.BinderC7820b
    /* JADX INFO: renamed from: a */
    public final boolean mo13306a(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) C7821c.m13307a(parcel, Bundle.CREATOR);
        C7821c.m13308b(parcel);
        mo13232b(bundle);
        return true;
    }

    public AbstractBinderC7835q() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }
}
