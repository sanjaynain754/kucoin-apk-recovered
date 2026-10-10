package com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes34.dex */
public interface IDeviceidInterface extends IInterface {

    public static class Default implements IDeviceidInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
        public String createAAIDForPackageName(String str) {
            return null;
        }

        @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
        public String getAAID(String str) {
            return null;
        }

        @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
        public String getOAID() {
            return null;
        }

        @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
        public String getUDID() {
            return null;
        }

        @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
        public String getVAID(String str) {
            return null;
        }

        @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
        public boolean isSupport() {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IDeviceidInterface {
        private static final String DESCRIPTOR = "com.zui.deviceidservice.IDeviceidInterface";
        static final int TRANSACTION_createAAIDForPackageName = 6;
        static final int TRANSACTION_getAAID = 5;
        static final int TRANSACTION_getOAID = 1;
        static final int TRANSACTION_getUDID = 2;
        static final int TRANSACTION_getVAID = 4;
        static final int TRANSACTION_isSupport = 3;

        public static class Proxy implements IDeviceidInterface {
            public static IDeviceidInterface sDefaultImpl;
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

            @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
            public String createAAIDForPackageName(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().createAAIDForPackageName(str);
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

            @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
            public String getAAID(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getAAID(str);
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

            @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
            public String getOAID() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getOAID();
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

            @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
            public String getUDID() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getUDID();
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

            @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
            public String getVAID(String str) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getVAID(str);
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

            @Override // com.datavisor.vangogh.oaid.thirdparty.zui.deviceidservice.IDeviceidInterface
            public boolean isSupport() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z11 = false;
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSupport();
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
        }

        public static IDeviceidInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IDeviceidInterface)) ? new Proxy(iBinder) : (IDeviceidInterface) iInterfaceQueryLocalInterface;
        }

        public static IDeviceidInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceidInterface iDeviceidInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iDeviceidInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDeviceidInterface;
            return true;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 != 1598968902) {
                switch (i11) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        String oaid = getOAID();
                        parcel2.writeNoException();
                        parcel2.writeString(oaid);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        String udid = getUDID();
                        parcel2.writeNoException();
                        parcel2.writeString(udid);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean zIsSupport = isSupport();
                        parcel2.writeNoException();
                        parcel2.writeInt(zIsSupport ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        String vaid = getVAID(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(vaid);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        String aaid = getAAID(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(aaid);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        String strCreateAAIDForPackageName = createAAIDForPackageName(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(strCreateAAIDForPackageName);
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

    String createAAIDForPackageName(String str);

    String getAAID(String str);

    String getOAID();

    String getUDID();

    String getVAID(String str);

    boolean isSupport();
}
