package androidx.media3.common;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class BundleListRetriever extends Binder {
    private static final int REPLY_BREAK = 2;
    private static final int REPLY_CONTINUE = 1;
    private static final int REPLY_END_OF_LIST = 0;
    private static final int SUGGESTED_MAX_IPC_SIZE;
    private final ImmutableList<Bundle> list;

    @Override // android.os.Binder
    public boolean onTransact(int i11, Parcel parcel, @Nullable Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 1) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.list.size();
        int i13 = parcel.readInt();
        while (i13 < size && parcel2.dataSize() < SUGGESTED_MAX_IPC_SIZE) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.list.get(i13));
            i13++;
        }
        parcel2.writeInt(i13 < size ? 2 : 0);
        return true;
    }

    static {
        SUGGESTED_MAX_IPC_SIZE = Util.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static ImmutableList<Bundle> getList(IBinder iBinder) {
        return iBinder instanceof BundleListRetriever ? ((BundleListRetriever) iBinder).list : getListFromRemoteBinder(iBinder);
    }

    public BundleListRetriever(List<Bundle> list) {
        this.list = ImmutableList.copyOf((Collection) list);
    }

    @VisibleForTesting
    public static ImmutableList<Bundle> getListFromRemoteBinder(IBinder iBinder) {
        int i11;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i12 = 0;
        int i13 = 1;
        while (i13 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i12);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i11 = parcelObtain2.readInt();
                        if (i11 == 1) {
                            builder.add((Bundle) Assertions.checkNotNull(parcelObtain2.readBundle()));
                            i12++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i13 = i11;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return builder.build();
    }
}
