package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes34.dex */
public interface IWorkManagerImplCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IWorkManagerImplCallback {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IWorkManagerImplCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onFailure(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWorkManagerImplCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.IWorkManagerImplCallback
            public void onSuccess(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IWorkManagerImplCallback.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImplCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IWorkManagerImplCallback)) ? new Proxy(iBinder) : (IWorkManagerImplCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(IWorkManagerImplCallback.DESCRIPTOR);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(IWorkManagerImplCallback.DESCRIPTOR);
                return true;
            }
            if (i11 == 1) {
                onSuccess(parcel.createByteArray());
            } else {
                if (i11 != 2) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                onFailure(parcel.readString());
            }
            return true;
        }

        public Stub() {
            attachInterface(this, IWorkManagerImplCallback.DESCRIPTOR);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void onFailure(String str) throws RemoteException;

    void onSuccess(byte[] bArr) throws RemoteException;

    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(String str) throws RemoteException {
        }

        @Override // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] bArr) throws RemoteException {
        }
    }
}
