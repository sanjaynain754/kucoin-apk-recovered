package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zal {
    private final SparseIntArray zaa;
    private GoogleApiAvailabilityLight zab;

    public zal() {
        this(GoogleApiAvailability.getInstance());
    }

    public zal(@NonNull GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.zaa = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.zab = googleApiAvailabilityLight;
    }

    public final int zaa(Context context, int i11) {
        return this.zaa.get(i11, -1);
    }

    public final void zac() {
        this.zaa.clear();
    }

    @ResultIgnorabilityUnspecified
    public final int zab(@NonNull Context context, @NonNull Api.Client client) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(client);
        int iIsGooglePlayServicesAvailable = 0;
        if (!client.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = client.getMinApkVersion();
        int iZaa = zaa(context, minApkVersion);
        if (iZaa != -1) {
            return iZaa;
        }
        int i11 = 0;
        while (true) {
            if (i11 < this.zaa.size()) {
                int iKeyAt = this.zaa.keyAt(i11);
                if (iKeyAt > minApkVersion && this.zaa.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            } else {
                iIsGooglePlayServicesAvailable = -1;
                break;
            }
        }
        if (iIsGooglePlayServicesAvailable == -1) {
            iIsGooglePlayServicesAvailable = this.zab.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.zaa.put(minApkVersion, iIsGooglePlayServicesAvailable);
        return iIsGooglePlayServicesAvailable;
    }
}
