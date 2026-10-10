package com.tencent.trtc.hardwareearmonitor.honor;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IHonorAudioPlayService extends IInterface {

    public static abstract class Stub extends Binder implements IHonorAudioPlayService {
        private static final String DESCRIPTOR = "com.hihonor.android.magicx.media.audioengine.IHnAudioPlayService";
        static final int TRANSACTION_destroy = 3;
        static final int TRANSACTION_enableHighSampleRatePlay = 2;
        static final int TRANSACTION_init = 1;

        public static class Proxy implements IHonorAudioPlayService {
            public static IHonorAudioPlayService sDefaultImpl;
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

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void destroy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().destroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
            public void enableHighSampleRatePlay(boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().enableHighSampleRatePlay(z11);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
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
        }

        public static IHonorAudioPlayService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IHonorAudioPlayService)) ? new Proxy(iBinder) : (IHonorAudioPlayService) iInterfaceQueryLocalInterface;
        }

        public static IHonorAudioPlayService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IHonorAudioPlayService iHonorAudioPlayService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHonorAudioPlayService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iHonorAudioPlayService;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                init(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                enableHighSampleRatePlay(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            if (i11 != 3) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            destroy();
            parcel2.writeNoException();
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

    void destroy() throws RemoteException;

    void enableHighSampleRatePlay(boolean z11) throws RemoteException;

    void init(String str) throws RemoteException;

    public static class Default implements IHonorAudioPlayService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void destroy() throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void enableHighSampleRatePlay(boolean z11) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService
        public void init(String str) throws RemoteException {
        }
    }
}
