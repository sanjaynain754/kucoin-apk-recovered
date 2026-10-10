package com.geetest.gtc4;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.geetest.gtc4.l6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6813l6 implements InterfaceC6777h6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6822m6 f11430a;

    public C6813l6(C6822m6 c6822m6) {
        this.f11430a = c6822m6;
    }

    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) throws RemoteException {
        try {
            return this.f11430a.m12684a(iBinder);
        } catch (RemoteException e11) {
            throw e11;
        } catch (C6750e6 e12) {
            throw e12;
        } catch (Exception e13) {
            throw new C6750e6(e13);
        }
    }
}
