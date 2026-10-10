package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new zae();

    @SafeParcelable.Field(getter = "getSessionId", m12889id = 1)
    private final int zaa;

    @InstallState
    @SafeParcelable.Field(getter = "getInstallState", m12889id = 2)
    private final int zab;

    @Nullable
    @SafeParcelable.Field(getter = "getBytesDownloaded", m12889id = 3)
    private final Long zac;

    @Nullable
    @SafeParcelable.Field(getter = "getTotalBytesToDownload", m12889id = 4)
    private final Long zad;

    @SafeParcelable.Field(getter = "getErrorCode", m12889id = 5)
    private final int zae;

    @Nullable
    private final ProgressInfo zaf;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        public long getBytesDownloaded() {
            return this.zaa;
        }

        public long getTotalBytesToDownload() {
            return this.zab;
        }

        public ProgressInfo(long j11, long j12) {
            Preconditions.checkNotZero(j12);
            this.zaa = j11;
            this.zab = j12;
        }
    }

    public int getErrorCode() {
        return this.zae;
    }

    @InstallState
    public int getInstallState() {
        return this.zab;
    }

    @Nullable
    public ProgressInfo getProgressInfo() {
        return this.zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) @InstallState int i12, @Nullable @SafeParcelable.Param(m12890id = 3) Long l11, @Nullable @SafeParcelable.Param(m12890id = 4) Long l12, @SafeParcelable.Param(m12890id = 5) int i13) {
        ProgressInfo progressInfo;
        this.zaa = i11;
        this.zab = i12;
        this.zac = l11;
        this.zad = l12;
        this.zae = i13;
        if (l11 != null && l12 != null && l12.longValue() != 0) {
            progressInfo = new ProgressInfo(l11.longValue(), l12.longValue());
        } else {
            progressInfo = null;
        }
        this.zaf = progressInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeInt(parcel, 2, getInstallState());
        SafeParcelWriter.writeLongObject(parcel, 3, this.zac, false);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zad, false);
        SafeParcelWriter.writeInt(parcel, 5, getErrorCode());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
