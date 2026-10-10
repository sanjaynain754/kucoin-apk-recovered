package com.geetest.gtc4;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.geetest.gtc4.j6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6795j6 implements InterfaceC6777h6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6804k6 f11413a;

    public C6795j6(C6804k6 c6804k6) {
        this.f11413a = c6804k6;
    }

    @Override // com.geetest.gtc4.InterfaceC6777h6
    /* JADX INFO: renamed from: a */
    public final String mo12656a(IBinder iBinder) throws RemoteException {
        try {
            return this.f11413a.m12684a(iBinder);
        } catch (RemoteException e11) {
            throw e11;
        } catch (C6750e6 e12) {
            throw e12;
        } catch (Exception e13) {
            throw new C6750e6(e13);
        }
    }
}
