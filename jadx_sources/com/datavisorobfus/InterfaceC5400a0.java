package com.datavisorobfus;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.datavisorobfus.a0 */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC5400a0 extends IInterface {

    /* JADX INFO: renamed from: com.datavisorobfus.a0$a */
    public static abstract class a extends Binder implements InterfaceC5400a0 {

        /* JADX INFO: renamed from: com.datavisorobfus.a0$a$a, reason: collision with other inner class name */
        public static class C46962a implements InterfaceC5400a0 {

            /* JADX INFO: renamed from: b */
            public static InterfaceC5400a0 f7233b;

            /* JADX INFO: renamed from: a */
            private IBinder f7234a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7234a;
            }

            public C46962a(IBinder iBinder) {
                this.f7234a = iBinder;
            }

            @Override // com.datavisorobfus.InterfaceC5400a0
            /* JADX INFO: renamed from: a */
            public int mo7087a(String str, String str2) {
                int iMo7087a;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.datavisor.vangogh.IDetectAidlInterface");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.f7234a.transact(1, parcelObtain, parcelObtain2, 0) && a.m7108a() != null) {
                        iMo7087a = a.m7108a().mo7087a(str, str2);
                    } else {
                        parcelObtain2.readException();
                        iMo7087a = parcelObtain2.readInt();
                    }
                    return iMo7087a;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC5400a0 m7108a() {
            return C46962a.f7233b;
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC5400a0 m7109a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.datavisor.vangogh.IDetectAidlInterface");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5400a0)) ? new C46962a(iBinder) : (InterfaceC5400a0) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 != 1) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString("com.datavisor.vangogh.IDetectAidlInterface");
                return true;
            }
            parcel.enforceInterface("com.datavisor.vangogh.IDetectAidlInterface");
            int iMo7087a = mo7087a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iMo7087a);
            return true;
        }

        public a() {
            attachInterface(this, "com.datavisor.vangogh.IDetectAidlInterface");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo7087a(String str, String str2);
}
