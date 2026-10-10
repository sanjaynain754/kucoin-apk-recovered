package com.ishumei.smantifraud;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes56.dex */
public interface IService extends IInterface {

    public static abstract class l1111l111111Il extends Binder implements IService {
        private static int l1111l111111Il = 1;
        private static int l111l11111I1l = 3;
        private static final String l111l11111Il = "com.ishumei.smantifraud.ISolateDetectorS";
        private static int l111l11111lIl = 2;

        /* JADX INFO: renamed from: com.ishumei.smantifraud.IService$l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
        public static class C46973l1111l111111Il implements IService {
            private IBinder l1111l111111Il;

            private static String l1111l111111Il() {
                return l1111l111111Il.l111l11111Il;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.l1111l111111Il;
            }

            public C46973l1111l111111Il(IBinder iBinder) {
                this.l1111l111111Il = iBinder;
            }

            @Override // com.ishumei.smantifraud.IService
            public final boolean hasBI() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(l1111l111111Il.l111l11111Il);
                    boolean z11 = false;
                    this.l1111l111111Il.transact(3, parcelObtain, parcelObtain2, 0);
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

            @Override // com.ishumei.smantifraud.IService
            public final boolean hasF() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(l1111l111111Il.l111l11111Il);
                    boolean z11 = false;
                    this.l1111l111111Il.transact(2, parcelObtain, parcelObtain2, 0);
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

            @Override // com.ishumei.smantifraud.IService
            public final boolean hasMagiskMount() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(l1111l111111Il.l111l11111Il);
                    boolean z11 = false;
                    this.l1111l111111Il.transact(1, parcelObtain, parcelObtain2, 0);
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

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
            if (i11 == 1) {
                parcel.enforceInterface(l111l11111Il);
                boolean zHasMagiskMount = hasMagiskMount();
                parcel2.writeNoException();
                parcel2.writeInt(zHasMagiskMount ? 1 : 0);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(l111l11111Il);
                boolean zHasF = hasF();
                parcel2.writeNoException();
                parcel2.writeInt(zHasF ? 1 : 0);
                return true;
            }
            if (i11 != 3) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(l111l11111Il);
                return true;
            }
            parcel.enforceInterface(l111l11111Il);
            boolean zHasBI = hasBI();
            parcel2.writeNoException();
            parcel2.writeInt(zHasBI ? 1 : 0);
            return true;
        }

        public static IService l1111l111111Il(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(l111l11111Il);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IService)) ? new C46973l1111l111111Il(iBinder) : (IService) iInterfaceQueryLocalInterface;
        }

        public l1111l111111Il() {
            attachInterface(this, l111l11111Il);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    boolean hasBI();

    boolean hasF();

    boolean hasMagiskMount();
}
