package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes56.dex */
public final class CustomRemoteModel extends RemoteModel {
    private final RemoteModelSource zzb;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    public static class Builder {

        @NonNull
        private final RemoteModelSource zza;

        @NonNull
        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.zza, null);
        }

        public Builder(@NonNull RemoteModelSource remoteModelSource) {
            Preconditions.checkNotNull(remoteModelSource);
            this.zza = remoteModelSource;
        }
    }

    @NonNull
    @KeepForSdk
    public RemoteModelSource getRemoteModelSource() {
        return this.zzb;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomRemoteModel(RemoteModelSource remoteModelSource, zza zzaVar) {
        String strZza;
        if (TextUtils.isEmpty(remoteModelSource.zza())) {
            strZza = "no_model_name";
        } else {
            strZza = remoteModelSource.zza();
        }
        super(strZza, null, ModelType.CUSTOM);
        this.zzb = remoteModelSource;
    }
}
