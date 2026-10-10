package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.credentials.provider.CredentialEntry;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "RetrieveBytesRequestCreator")
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getKeys", m12889id = 1)
    private final List zza;

    @SafeParcelable.Field(defaultValue = CredentialEntry.FALSE_STRING, getter = "getRetrieveAll", m12889id = 2)
    private final boolean zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static final class Builder {
        private List zza = new ArrayList();
        private boolean zzb = false;

        @NonNull
        public RetrieveBytesRequest build() {
            return new RetrieveBytesRequest(this.zza, this.zzb);
        }

        @NonNull
        public Builder setKeys(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Keys cannot be set to null");
            this.zza = list;
            return this;
        }

        @NonNull
        public Builder setRetrieveAll(boolean z11) {
            this.zzb = z11;
            return this;
        }
    }

    @NonNull
    public List<String> getKeys() {
        return Collections.unmodifiableList(this.zza);
    }

    public boolean getRetrieveAll() {
        return this.zzb;
    }

    @SafeParcelable.Constructor
    public RetrieveBytesRequest(@SafeParcelable.Param(m12890id = 1) List list, @SafeParcelable.Param(m12890id = 2) boolean z11) {
        if (z11) {
            boolean z12 = true;
            if (list != null && !list.isEmpty()) {
                z12 = false;
            }
            Preconditions.checkState(z12, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.zzb = z11;
        this.zza = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Preconditions.checkNotEmpty(str, "Element in keys cannot be null or empty");
                this.zza.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, getKeys(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, getRetrieveAll());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
