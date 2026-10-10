package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.g */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7825g extends C7805a implements InterfaceC7827i {
    public C7825g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC7827i
    /* JADX INFO: renamed from: c */
    public final void mo13315c(Bundle bundle, InterfaceC7836r interfaceC7836r) throws RemoteException {
        Parcel parcelM13272a = m13272a();
        C7821c.m13309c(parcelM13272a, bundle);
        parcelM13272a.writeStrongBinder(interfaceC7836r);
        m13273b(6, parcelM13272a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC7827i
    /* JADX INFO: renamed from: d */
    public final void mo13316d(Bundle bundle, InterfaceC7829k interfaceC7829k) throws RemoteException {
        Parcel parcelM13272a = m13272a();
        C7821c.m13309c(parcelM13272a, bundle);
        parcelM13272a.writeStrongBinder(interfaceC7829k);
        m13273b(3, parcelM13272a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC7827i
    /* JADX INFO: renamed from: e */
    public final void mo13317e(Bundle bundle, InterfaceC7829k interfaceC7829k) throws RemoteException {
        Parcel parcelM13272a = m13272a();
        C7821c.m13309c(parcelM13272a, bundle);
        parcelM13272a.writeStrongBinder(interfaceC7829k);
        m13273b(2, parcelM13272a);
    }
}
