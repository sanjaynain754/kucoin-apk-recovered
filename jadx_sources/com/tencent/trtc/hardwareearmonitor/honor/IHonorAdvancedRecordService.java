package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IHonorAdvancedRecordService extends IInterface {

    public static abstract class Stub extends Binder implements IHonorAdvancedRecordService {
        private static final String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnAdvancedRecordService";
        static final int TRANSACTION_destroy = 2;
        static final int TRANSACTION_disableAdvancedRecord = 4;
        static final int TRANSACTION_enableAdvancedRecord = 3;
        static final int TRANSACTION_enableRecordDenoise = 6;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_isSupported = 5;
        static final int TRANSACTION_unbind = 7;

        public static class Proxy implements IHonorAdvancedRecordService {
            public static IHonorAdvancedRecordService sDefaultImpl;
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().destroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public boolean disableAdvancedRecord() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z11 = false;
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        boolean zDisableAdvancedRecord = Stub.getDefaultImpl().disableAdvancedRecord();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zDisableAdvancedRecord;
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public boolean enableAdvancedRecord() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z11 = false;
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        boolean zEnableAdvancedRecord = Stub.getDefaultImpl().enableAdvancedRecord();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zEnableAdvancedRecord;
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public int enableRecordDenoise(boolean z11, int i11, int i12, int i13, IBinder iBinder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enableRecordDenoise(z11, i11, i12, i13, iBinder);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public void init(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().init(str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public boolean isSupported(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    boolean z11 = false;
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
            public void unbind(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unbind(i11);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static IHonorAdvancedRecordService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHonorAdvancedRecordService)) ? new Proxy(iBinder) : (IHonorAdvancedRecordService) iInterfaceQueryLocalInterface;
        }

        public static IHonorAdvancedRecordService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorAdvancedRecordService iHonorAdvancedRecordService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorAdvancedRecordService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorAdvancedRecordService;
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
                        init(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        destroy();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean zEnableAdvancedRecord = enableAdvancedRecord();
                        parcel2.writeNoException();
                        parcel2.writeInt(zEnableAdvancedRecord ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean zDisableAdvancedRecord = disableAdvancedRecord();
                        parcel2.writeNoException();
                        parcel2.writeInt(zDisableAdvancedRecord ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean zIsSupported = isSupported(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(zIsSupported ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int iEnableRecordDenoise = enableRecordDenoise(z11, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeInt(iEnableRecordDenoise);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        unbind(parcel.readInt());
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

    boolean disableAdvancedRecord() throws RemoteException;

    boolean enableAdvancedRecord() throws RemoteException;

    int enableRecordDenoise(boolean z11, int i11, int i12, int i13, IBinder iBinder) throws RemoteException;

    void init(String str) throws RemoteException;

    boolean isSupported(int i11) throws RemoteException;

    void unbind(int i11) throws RemoteException;

    public static class Default implements IHonorAdvancedRecordService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public boolean disableAdvancedRecord() throws RemoteException {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public boolean enableAdvancedRecord() throws RemoteException {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public int enableRecordDenoise(boolean z11, int i11, int i12, int i13, IBinder iBinder) throws RemoteException {
            return 0;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public boolean isSupported(int i11) throws RemoteException {
            return false;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public void destroy() throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public void init(String str) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService
        public void unbind(int i11) throws RemoteException {
        }
    }
}
