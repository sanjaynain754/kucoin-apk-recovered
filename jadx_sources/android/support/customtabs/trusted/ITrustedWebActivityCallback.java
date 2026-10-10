package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface ITrustedWebActivityCallback extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace(Typography.dollar, '.');

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {
        static final int TRANSACTION_onExtraCallback = 2;

        public static class Proxy implements ITrustedWebActivityCallback {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ITrustedWebActivityCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
            public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ITrustedWebActivityCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ITrustedWebActivityCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITrustedWebActivityCallback)) ? new Proxy(iBinder) : (ITrustedWebActivityCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            String str = ITrustedWebActivityCallback.DESCRIPTOR;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 != 2) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            onExtraCallback(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }

        public Stub() {
            attachInterface(this, ITrustedWebActivityCallback.DESCRIPTOR);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t11, int i11) {
            if (t11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t11.writeToParcel(parcel, i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    public static class Default implements ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        }
    }
}
