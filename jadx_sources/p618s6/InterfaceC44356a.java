package p618s6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: s6.a */
/* JADX INFO: compiled from: IReceiverService.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC44356a extends IInterface {

    /* JADX INFO: renamed from: s6.a$a */
    /* JADX INFO: compiled from: IReceiverService.java */
    public static abstract class a extends Binder implements InterfaceC44356a {

        /* JADX INFO: renamed from: s6.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IReceiverService.java */
        public static class C47017a implements InterfaceC44356a {

            /* JADX INFO: renamed from: a */
            public IBinder f98025a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f98025a;
            }

            public C47017a(IBinder iBinder) {
                this.f98025a = iBinder;
            }

            @Override // p618s6.InterfaceC44356a
            /* JADX INFO: renamed from: a */
            public int mo97850a(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    b.m97853b(parcelObtain, bundle, 0);
                    this.f98025a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC44356a m97851b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC44356a)) ? new C47017a(iBinder) : (InterfaceC44356a) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: s6.a$b */
    /* JADX INFO: compiled from: IReceiverService.java */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static <T extends Parcelable> void m97853b(Parcel parcel, T t11, int i11) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    int mo97850a(Bundle bundle) throws RemoteException;
}
