package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zak extends zap {
    private final SparseArray zad;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i11 = 0; i11 < this.zad.size(); i11++) {
            zaj zajVarZai = zai(i11);
            if (zajVarZai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zajVarZai.zaa);
                printWriter.println(C33844oi.f71346o);
                zajVarZai.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for (int i11 = 0; i11 < this.zad.size(); i11++) {
            zaj zajVarZai = zai(i11);
            if (zajVarZai != null) {
                zajVarZai.zab.connect();
            }
        }
    }

    @Nullable
    private final zaj zai(int i11) {
        if (this.zad.size() <= i11) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (zaj) sparseArray.get(sparseArray.keyAt(i11));
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult, int i11) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i11 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zajVar = (zaj) this.zad.get(i11);
        if (zajVar != null) {
            zae(i11);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    public final void zad(int i11, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        Preconditions.checkState(this.zad.indexOfKey(i11) < 0, "Already managing a GoogleApiClient with id " + i11);
        zam zamVar = (zam) this.zab.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i11 + C33627eb.f69716f + this.zaa + C33627eb.f69716f + String.valueOf(zamVar));
        zaj zajVar = new zaj(this, i11, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i11, zajVar);
        if (this.zaa && zamVar == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zae(int i11) {
        zaj zajVar = (zaj) this.zad.get(i11);
        this.zad.remove(i11);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        if (zakVar != null) {
            return zakVar;
        }
        return new zak(fragment);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.zad;
        Log.d("AutoManageHelper", "onStart " + this.zaa + C33627eb.f69716f + String.valueOf(sparseArray));
        if (this.zab.get() == null) {
            for (int i11 = 0; i11 < this.zad.size(); i11++) {
                zaj zajVarZai = zai(i11);
                if (zajVarZai != null) {
                    zajVarZai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i11 = 0; i11 < this.zad.size(); i11++) {
            zaj zajVarZai = zai(i11);
            if (zajVarZai != null) {
                zajVarZai.zab.disconnect();
            }
        }
    }
}
