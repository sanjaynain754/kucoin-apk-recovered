package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.j */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractBinderC7828j extends BinderC7820b implements InterfaceC7829k {
    @Override // com.google.android.play.integrity.internal.BinderC7820b
    /* JADX INFO: renamed from: a */
    public final boolean mo13306a(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 == 2) {
            Bundle bundle = (Bundle) C7821c.m13307a(parcel, Bundle.CREATOR);
            C7821c.m13308b(parcel);
            mo13246e(bundle);
            return true;
        }
        if (i11 == 3) {
            Bundle bundle2 = (Bundle) C7821c.m13307a(parcel, Bundle.CREATOR);
            C7821c.m13308b(parcel);
            mo13244c(bundle2);
            return true;
        }
        if (i11 == 4) {
            Bundle bundle3 = (Bundle) C7821c.m13307a(parcel, Bundle.CREATOR);
            C7821c.m13308b(parcel);
            mo13245d(bundle3);
            return true;
        }
        if (i11 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) C7821c.m13307a(parcel, Bundle.CREATOR);
        C7821c.m13308b(parcel);
        mo13243b(bundle4);
        return true;
    }

    public AbstractBinderC7828j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }
}
