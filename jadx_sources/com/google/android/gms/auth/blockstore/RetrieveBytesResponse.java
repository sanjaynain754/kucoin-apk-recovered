package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "RetrieveBytesResponseCreator")
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getInternalBlockstoreDataBundle", m12889id = 1)
    @Deprecated
    private final Bundle zza;

    @SafeParcelable.Field(getter = "getInternalBlockstoreDataList", m12889id = 2)
    private final List zzb;
    private final Map zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    @SafeParcelable.Class(creator = "BlockstoreDataCreator")
    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new zza();

        @SafeParcelable.Field(getter = "getBytes", m12889id = 1)
        private final byte[] zza;

        @SafeParcelable.Field(getter = "getKey", m12889id = 2)
        private final String zzb;

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.zza, ((BlockstoreData) obj).zza);
        }

        @NonNull
        public byte[] getBytes() {
            return this.zza;
        }

        public int hashCode() {
            return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)));
        }

        @NonNull
        public final String zza() {
            return this.zzb;
        }

        @SafeParcelable.Constructor
        public BlockstoreData(@SafeParcelable.Param(m12890id = 1) byte[] bArr, @SafeParcelable.Param(m12890id = 2) String str) {
            this.zza = bArr;
            this.zzb = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeByteArray(parcel, 1, getBytes(), false);
            SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @NonNull
    public Map<String, BlockstoreData> getBlockstoreDataMap() {
        return Collections.unmodifiableMap(this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        Bundle bundle = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public RetrieveBytesResponse(@SafeParcelable.Param(m12890id = 1) Bundle bundle, @SafeParcelable.Param(m12890id = 2) List list) {
        this.zza = bundle;
        this.zzb = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            map.put(blockstoreData.zza(), blockstoreData);
        }
        this.zzc = map;
    }
}
