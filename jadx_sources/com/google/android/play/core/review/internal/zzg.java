package com.google.android.play.core.review.internal;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class zzg extends zzb implements zzh {
    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean zza(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
        if (i11 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i13 = zzc.zza;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            zzb(bundle);
            return true;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    public zzg() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }
}
