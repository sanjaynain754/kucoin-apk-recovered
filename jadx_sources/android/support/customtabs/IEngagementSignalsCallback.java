package android.support.customtabs;

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
public interface IEngagementSignalsCallback extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$IEngagementSignalsCallback".replace(Typography.dollar, '.');

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {
        static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
        static final int TRANSACTION_onSessionEnded = 4;
        static final int TRANSACTION_onVerticalScrollEvent = 2;

        public static class Proxy implements IEngagementSignalsCallback {
            private IBinder mRemote;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IEngagementSignalsCallback.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onGreatestScrollPercentageIncreased(int i11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    parcelObtain.writeInt(i11);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onSessionEnded(boolean z11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onVerticalScrollEvent(boolean z11, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) ? new Proxy(iBinder) : (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            String str = IEngagementSignalsCallback.DESCRIPTOR;
            if (i11 >= 1 && i11 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i11 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i11 == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else if (i11 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else {
                if (i11 != 4) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                onSessionEnded(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            }
            return true;
        }

        public Stub() {
            attachInterface(this, IEngagementSignalsCallback.DESCRIPTOR);
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

    void onGreatestScrollPercentageIncreased(int i11, Bundle bundle) throws RemoteException;

    void onSessionEnded(boolean z11, Bundle bundle) throws RemoteException;

    void onVerticalScrollEvent(boolean z11, Bundle bundle) throws RemoteException;

    public static class Default implements IEngagementSignalsCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int i11, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(boolean z11, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(boolean z11, Bundle bundle) throws RemoteException {
        }
    }
}
