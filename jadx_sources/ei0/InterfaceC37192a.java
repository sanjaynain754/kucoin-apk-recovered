package ei0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: ei0.a */
/* JADX INFO: compiled from: IAdvertisingIdService.java */
/* JADX INFO: loaded from: classes61.dex */
public interface InterfaceC37192a extends IInterface {

    /* JADX INFO: renamed from: ei0.a$a */
    /* JADX INFO: compiled from: IAdvertisingIdService.java */
    public static abstract class a extends Binder implements InterfaceC37192a {

        /* JADX INFO: renamed from: ei0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IAdvertisingIdService.java */
        public static class C47005a implements InterfaceC37192a {

            /* JADX INFO: renamed from: b */
            public static InterfaceC37192a f82489b;

            /* JADX INFO: renamed from: a */
            public IBinder f82490a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f82490a;
            }

            public C47005a(IBinder iBinder) {
                this.f82490a = iBinder;
            }

            @Override // ei0.InterfaceC37192a
            public String getId() throws RemoteException {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (!this.f82490a.transact(1, parcelObtain, parcelObtain2, 0) && a.m83186c() != null) {
                        string = a.m83186c().getId();
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // ei0.InterfaceC37192a
            public boolean isLimitAdTrackingEnabled(boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z12 = true;
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    if (!this.f82490a.transact(2, parcelObtain, parcelObtain2, 0) && a.m83186c() != null) {
                        return a.m83186c().isLimitAdTrackingEnabled(z11);
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() == 0) {
                        z12 = false;
                    }
                    return z12;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC37192a m83185b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC37192a)) ? new C47005a(iBinder) : (InterfaceC37192a) iInterfaceQueryLocalInterface;
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC37192a m83186c() {
            return C47005a.f82489b;
        }
    }

    String getId() throws RemoteException;

    boolean isLimitAdTrackingEnabled(boolean z11) throws RemoteException;
}
