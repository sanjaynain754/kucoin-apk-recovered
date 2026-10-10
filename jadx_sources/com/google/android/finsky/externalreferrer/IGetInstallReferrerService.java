package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p066a.BinderC6958b;
import com.google.android.p066a.C6957a;
import com.google.android.p066a.C6959c;

/* JADX INFO: loaded from: classes45.dex */
public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends BinderC6958b implements IGetInstallReferrerService {
        @Override // com.google.android.p066a.BinderC6958b
        /* JADX INFO: renamed from: a */
        public final boolean mo12808a(int i11, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i11 != 1) {
                return false;
            }
            Bundle bundleMo12871c = mo12871c((Bundle) C6959c.m12809a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C6959c.m12811c(parcel2, bundleMo12871c);
            return true;
        }

        public static class Proxy extends C6957a implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            /* JADX INFO: renamed from: c */
            public final Bundle mo12871c(Bundle bundle) throws RemoteException {
                Parcel parcelM12806a = m12806a();
                C6959c.m12810b(parcelM12806a, bundle);
                Parcel parcelM12807b = m12807b(parcelM12806a);
                Bundle bundle2 = (Bundle) C6959c.m12809a(parcelM12807b, Bundle.CREATOR);
                parcelM12807b.recycle();
                return bundle2;
            }
        }

        /* JADX INFO: renamed from: b */
        public static IGetInstallReferrerService m12872b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }
    }

    /* JADX INFO: renamed from: c */
    Bundle mo12871c(Bundle bundle) throws RemoteException;
}
