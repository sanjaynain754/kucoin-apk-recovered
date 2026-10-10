package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@VisibleForTesting
final class zzah extends DeferredLifecycleHelper<zzag> {
    protected OnDelegateCreatedListener<zzag> zza;
    private final ViewGroup zzb;
    private final Context zzc;

    @Nullable
    private final GoogleMapOptions zzd;
    private final List<OnMapReadyCallback> zze = new ArrayList();

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener<zzag> onDelegateCreatedListener) {
        this.zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zzb() {
        if (this.zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.zzc);
            IMapViewDelegate iMapViewDelegateZzg = zzca.zza(this.zzc, null).zzg(ObjectWrapper.wrap(this.zzc), this.zzd);
            if (iMapViewDelegateZzg == null) {
                return;
            }
            this.zza.onDelegateCreated(new zzag(this.zzb, iMapViewDelegateZzg));
            Iterator<OnMapReadyCallback> it = this.zze.iterator();
            while (it.hasNext()) {
                getDelegate().getMapAsync(it.next());
            }
            this.zze.clear();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }

    @VisibleForTesting
    public zzah(ViewGroup viewGroup, Context context, @Nullable GoogleMapOptions googleMapOptions) {
        this.zzb = viewGroup;
        this.zzc = context;
        this.zzd = googleMapOptions;
    }

    public final void zza(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            getDelegate().getMapAsync(onMapReadyCallback);
        } else {
            this.zze.add(onMapReadyCallback);
        }
    }
}
