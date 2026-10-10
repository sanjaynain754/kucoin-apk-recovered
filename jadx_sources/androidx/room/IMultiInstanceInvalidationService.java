package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes34.dex */
public interface IMultiInstanceInvalidationService extends IInterface {

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        private static final String DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationService";
        static final int TRANSACTION_broadcastInvalidation = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;

        public static class Proxy implements IMultiInstanceInvalidationService {
            public static IMultiInstanceInvalidationService sDefaultImpl;
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void broadcastInvalidation(int i11, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStringArray(strArr);
                    if (!this.mRemote.transact(3, parcelObtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().broadcastInvalidation(i11, strArr);
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException {
                IBinder iBinderAsBinder;
                int iRegisterCallback;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iMultiInstanceInvalidationCallback != null) {
                        iBinderAsBinder = iMultiInstanceInvalidationCallback.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iRegisterCallback = Stub.getDefaultImpl().registerCallback(iMultiInstanceInvalidationCallback, str);
                    } else {
                        parcelObtain2.readException();
                        iRegisterCallback = parcelObtain2.readInt();
                    }
                    return iRegisterCallback;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i11) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iMultiInstanceInvalidationCallback != null) {
                        iBinderAsBinder = iMultiInstanceInvalidationCallback.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    parcelObtain.writeInt(i11);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterCallback(iMultiInstanceInvalidationCallback, i11);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int iRegisterCallback = registerCallback(IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterCallback);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterCallback(IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i11 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i11 != 1598968902) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }

        public static IMultiInstanceInvalidationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) ? new Proxy(iBinder) : (IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
        }

        public static IMultiInstanceInvalidationService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMultiInstanceInvalidationService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMultiInstanceInvalidationService;
            return true;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void broadcastInvalidation(int i11, String[] strArr) throws RemoteException;

    int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException;

    void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i11) throws RemoteException;

    public static class Default implements IMultiInstanceInvalidationService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException {
            return 0;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i11, String[] strArr) throws RemoteException {
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i11) throws RemoteException {
        }
    }
}
