package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes56.dex */
@KeepForSdk
public class ModelInfo {
    private final String zza;
    private final Uri zzb;
    private final String zzc;
    private final ModelType zzd;

    @NonNull
    @KeepForSdk
    public String getModelHash() {
        return this.zzc;
    }

    @NonNull
    @KeepForSdk
    public String getModelNameForPersist() {
        return this.zza;
    }

    @NonNull
    @KeepForSdk
    public ModelType getModelType() {
        return this.zzd;
    }

    @NonNull
    @KeepForSdk
    public Uri getModelUri() {
        return this.zzb;
    }

    @KeepForSdk
    public ModelInfo(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull ModelType modelType) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = modelType;
    }
}
