package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.m */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractBinderC7831m extends BinderC7820b implements InterfaceC7832n {
    /* JADX INFO: renamed from: b */
    public static InterfaceC7832n m13321b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7832n ? (InterfaceC7832n) iInterfaceQueryLocalInterface : new C7830l(iBinder);
    }
}
