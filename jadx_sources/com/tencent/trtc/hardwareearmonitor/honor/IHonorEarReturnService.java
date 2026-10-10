package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IHonorEarReturnService extends IInterface {

    public static abstract class Stub extends Binder implements IHonorEarReturnService {
        private static final String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnEarReturnService";
        static final int TRANSACTION_destroy = 6;
        static final int TRANSACTION_enableEarReturn = 2;
        static final int TRANSACTION_getEarReturnLatency = 3;
        static final int TRANSACTION_init = 5;
        static final int TRANSACTION_isSupported = 1;
        static final int TRANSACTION_setParameter = 4;

        public static class Proxy implements IHonorEarReturnService {
            public static IHonorEarReturnService sDefaultImpl;
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().destroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int enableEarReturn(boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enableEarReturn(z11);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int getEarReturnLatency() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getEarReturnLatency();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public void init(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().init(str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public boolean isSupported(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    boolean z11 = false;
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        boolean zIsSupported = Stub.getDefaultImpl().isSupported(i11);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zIsSupported;
                    }
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z11 = true;
                    }
                    return z11;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
            public int setParameter(String str, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setParameter(str, i11);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static IHonorEarReturnService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHonorEarReturnService)) ? new Proxy(iBinder) : (IHonorEarReturnService) iInterfaceQueryLocalInterface;
        }

        public static IHonorEarReturnService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorEarReturnService iHonorEarReturnService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorEarReturnService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorEarReturnService;
            return true;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            boolean z11;
            if (i11 != 1598968902) {
                switch (i11) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean zIsSupported = isSupported(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(zIsSupported ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int iEnableEarReturn = enableEarReturn(z11);
                        parcel2.writeNoException();
                        parcel2.writeInt(iEnableEarReturn);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int earReturnLatency = getEarReturnLatency();
                        parcel2.writeNoException();
                        parcel2.writeInt(earReturnLatency);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int parameter = setParameter(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(parameter);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        init(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        destroy();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i11, parcel, parcel2, i12);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void destroy() throws RemoteException;

    int enableEarReturn(boolean z11) throws RemoteException;

    int getEarReturnLatency() throws RemoteException;

    void init(String str) throws RemoteException;

    boolean isSupported(int i11) throws RemoteException;

    int setParameter(String str, int i11) throws RemoteException;

    public static class Default implements IHonorEarReturnService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int enableEarReturn(boolean z11) throws RemoteException {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int getEarReturnLatency() throws RemoteException {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public boolean isSupported(int i11) throws RemoteException {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public int setParameter(String str, int i11) throws RemoteException {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public void destroy() throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService
        public void init(String str) throws RemoteException {
        }
    }
}
