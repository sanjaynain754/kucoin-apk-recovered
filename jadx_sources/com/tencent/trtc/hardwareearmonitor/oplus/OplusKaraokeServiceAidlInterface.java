package com.tencent.trtc.hardwareearmonitor.oplus;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
public interface OplusKaraokeServiceAidlInterface extends IInterface {

    public static abstract class Stub extends Binder implements OplusKaraokeServiceAidlInterface {
        private static String DESCRIPTOR = "OplusKaraokeServiceAidlInterface";
        static final int TRANSACTION_setActiveClient = 2;
        static final int TRANSACTION_setHeadsetState = 1;
        static final int TRANSACTION_setPermitBits = 3;

        /* JADX INFO: renamed from: com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface$Stub$a */
        public static class C35467a implements OplusKaraokeServiceAidlInterface {

            /* JADX INFO: renamed from: a */
            public static OplusKaraokeServiceAidlInterface f76672a;

            /* JADX INFO: renamed from: b */
            private IBinder f76673b;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f76673b;
            }

            public C35467a(IBinder iBinder) {
                this.f76673b = iBinder;
            }

            @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
            public final void setActiveClient(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    boolean zTransact = this.f76673b.transact(2, parcelObtain, parcelObtain2, 0);
                    if (!zTransact) {
                        LiteavLog.m76083e("setActiveClient", "setActiveClient error");
                    }
                    if (!zTransact && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setActiveClient(str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
            public final void setHeadsetState(boolean z11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    boolean zTransact = this.f76673b.transact(1, parcelObtain, parcelObtain2, 0);
                    if (!zTransact) {
                        LiteavLog.m76083e("setHeadsetState", "setHeadsetState error");
                    }
                    if (!zTransact && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setHeadsetState(z11);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
            public final void setPermitBits(int i11, int i12, int i13, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeString(str);
                    if (!this.f76673b.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setPermitBits(i11, i12, i13, str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static OplusKaraokeServiceAidlInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OplusKaraokeServiceAidlInterface)) ? new C35467a(iBinder) : (OplusKaraokeServiceAidlInterface) iInterfaceQueryLocalInterface;
        }

        public static OplusKaraokeServiceAidlInterface getDefaultImpl() {
            return C35467a.f76672a;
        }

        public static void setDESCRIPTOR(String str) {
            DESCRIPTOR = str;
        }

        public static boolean setDefaultImpl(OplusKaraokeServiceAidlInterface oplusKaraokeServiceAidlInterface) {
            if (C35467a.f76672a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (oplusKaraokeServiceAidlInterface == null) {
                return false;
            }
            C35467a.f76672a = oplusKaraokeServiceAidlInterface;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            String str = DESCRIPTOR;
            if (i11 == 1) {
                parcel.enforceInterface(str);
                setHeadsetState(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(str);
                setActiveClient(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i11 != 3) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            setPermitBits(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
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

    void setActiveClient(String str) throws RemoteException;

    void setHeadsetState(boolean z11) throws RemoteException;

    void setPermitBits(int i11, int i12, int i13, String str) throws RemoteException;

    public static class Default implements OplusKaraokeServiceAidlInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
        public void setActiveClient(String str) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
        public void setHeadsetState(boolean z11) throws RemoteException {
        }

        @Override // com.tencent.trtc.hardwareearmonitor.oplus.OplusKaraokeServiceAidlInterface
        public void setPermitBits(int i11, int i12, int i13, String str) throws RemoteException {
        }
    }
}
