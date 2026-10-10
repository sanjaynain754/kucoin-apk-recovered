package com.kubi.helpcenter.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WorkOrderParams.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/helpcenter/entity/WorkOrderParams;", "Landroid/os/Parcelable;", "key", "", "bizId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getBizId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WorkOrderParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorkOrderParams> CREATOR = new C14481a();

    @NotNull
    private final String bizId;

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: com.kubi.helpcenter.entity.WorkOrderParams$a */
    /* JADX INFO: compiled from: WorkOrderParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14481a implements Parcelable.Creator<WorkOrderParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WorkOrderParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkOrderParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WorkOrderParams[] newArray(int i11) {
            return new WorkOrderParams[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkOrderParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public WorkOrderParams(@NotNull String key, @NotNull String bizId) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bizId, "bizId");
        this.key = key;
        this.bizId = bizId;
    }

    @NotNull
    public final String getBizId() {
        return this.bizId;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.bizId);
    }

    public /* synthetic */ WorkOrderParams(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "ticketConfig" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
