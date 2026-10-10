package com.tencent.trtc.hardwareearmonitor.daisy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface IDaisyAudioKaraokeFeature extends IInterface {

    public static abstract class Stub extends Binder implements IDaisyAudioKaraokeFeature {
        private static final String DESCRIPTOR = "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature";
        static final int TRANSACTION_enableKaraokeFeature = 2;
        static final int TRANSACTION_getKaraokeLatency = 3;
        static final int TRANSACTION_init = 5;
        static final int TRANSACTION_isKaraokeFeatureSupport = 1;
        static final int TRANSACTION_setParameter = 4;

        /* JADX INFO: renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature$Stub$a */
        public static class C35455a implements IDaisyAudioKaraokeFeature {

            /* JADX INFO: renamed from: a */
            private IBinder f76658a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f76658a;
            }

            public C35455a(IBinder iBinder) {
                this.f76658a = iBinder;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final int enableKaraokeFeature(boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    this.f76658a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final int getKaraokeLatency() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f76658a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final void init(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.f76658a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final boolean isKaraokeFeatureSupport() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z11 = false;
                    this.f76658a.transact(1, parcelObtain, parcelObtain2, 0);
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

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature
            public final int setParameter(String str, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    this.f76658a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static IDaisyAudioKaraokeFeature asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDaisyAudioKaraokeFeature)) ? new C35455a(iBinder) : (IDaisyAudioKaraokeFeature) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsKaraokeFeatureSupport = isKaraokeFeatureSupport();
                parcel2.writeNoException();
                parcel2.writeInt(zIsKaraokeFeatureSupport ? 1 : 0);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                int iEnableKaraokeFeature = enableKaraokeFeature(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(iEnableKaraokeFeature);
                return true;
            }
            if (i11 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                int karaokeLatency = getKaraokeLatency();
                parcel2.writeNoException();
                parcel2.writeInt(karaokeLatency);
                return true;
            }
            if (i11 == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                int parameter = setParameter(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(parameter);
                return true;
            }
            if (i11 != 5) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            init(parcel.readString());
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

    int enableKaraokeFeature(boolean z11) throws RemoteException;

    int getKaraokeLatency() throws RemoteException;

    void init(String str) throws RemoteException;

    boolean isKaraokeFeatureSupport() throws RemoteException;

    int setParameter(String str, int i11) throws RemoteException;
}
