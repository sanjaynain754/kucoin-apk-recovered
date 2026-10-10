package com.tencent.trtc.hardwareearmonitor.daisy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface IDaisyAudioEngine extends IInterface {

    public static abstract class Stub extends Binder implements IDaisyAudioEngine {
        private static final String DESCRIPTOR = "com.huawei.multimedia.audioengine.IHwAudioEngine";
        static final int TRANSACTION_getSupportedFeatures = 1;
        static final int TRANSACTION_init = 3;
        static final int TRANSACTION_isFeatureSupported = 2;

        /* JADX INFO: renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine$Stub$a */
        public static class C35454a implements IDaisyAudioEngine {

            /* JADX INFO: renamed from: a */
            private IBinder f76657a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f76657a;
            }

            public C35454a(IBinder iBinder) {
                this.f76657a = iBinder;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine
            public final List getSupportedFeatures() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f76657a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readArrayList(C35454a.class.getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine
            public final void init(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f76657a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine
            public final boolean isFeatureSupported(int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    boolean z11 = false;
                    this.f76657a.transact(2, parcelObtain, parcelObtain2, 0);
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
        }

        public static IDaisyAudioEngine asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDaisyAudioEngine)) ? new C35454a(iBinder) : (IDaisyAudioEngine) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                List supportedFeatures = getSupportedFeatures();
                parcel2.writeNoException();
                parcel2.writeList(supportedFeatures);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                boolean zIsFeatureSupported = isFeatureSupported(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zIsFeatureSupported ? 1 : 0);
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
            init(parcel.readString(), parcel.readString());
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

    List getSupportedFeatures() throws RemoteException;

    void init(String str, String str2) throws RemoteException;

    boolean isFeatureSupported(int i11) throws RemoteException;
}
