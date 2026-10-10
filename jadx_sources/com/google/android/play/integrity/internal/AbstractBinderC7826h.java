package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.h */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractBinderC7826h extends BinderC7820b implements InterfaceC7827i {
    /* JADX INFO: renamed from: b */
    public static InterfaceC7827i m13318b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7827i ? (InterfaceC7827i) iInterfaceQueryLocalInterface : new C7825g(iBinder);
    }
}
