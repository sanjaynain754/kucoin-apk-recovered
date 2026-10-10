package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.l */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7830l extends C7805a implements InterfaceC7832n {
    public C7830l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC7832n
    /* JADX INFO: renamed from: c */
    public final void mo13319c(Bundle bundle, InterfaceC7836r interfaceC7836r) throws RemoteException {
        Parcel parcelM13272a = m13272a();
        C7821c.m13309c(parcelM13272a, bundle);
        parcelM13272a.writeStrongBinder(interfaceC7836r);
        m13273b(3, parcelM13272a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC7832n
    /* JADX INFO: renamed from: d */
    public final void mo13320d(Bundle bundle, InterfaceC7834p interfaceC7834p) throws RemoteException {
        Parcel parcelM13272a = m13272a();
        C7821c.m13309c(parcelM13272a, bundle);
        parcelM13272a.writeStrongBinder(interfaceC7834p);
        m13273b(2, parcelM13272a);
    }
}
