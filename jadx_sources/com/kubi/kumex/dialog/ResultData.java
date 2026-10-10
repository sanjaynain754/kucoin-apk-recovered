package com.kubi.kumex.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCloseDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kumex/dialog/ResultData;", "Landroid/os/Parcelable;", "success", "", "code", "", "msg", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Z", "getCode", "()Ljava/lang/String;", "getMsg", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ResultData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ResultData> CREATOR = new C15848a();

    @NotNull
    private final String code;

    @NotNull
    private final String msg;
    private final boolean success;

    /* JADX INFO: renamed from: com.kubi.kumex.dialog.ResultData$a */
    /* JADX INFO: compiled from: MarketCloseDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15848a implements Parcelable.Creator<ResultData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ResultData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResultData(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ResultData[] newArray(int i11) {
            return new ResultData[i11];
        }
    }

    public ResultData(boolean z11, @NotNull String code, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.success = z11;
        this.code = code;
        this.msg = msg;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultData)) {
            return false;
        }
        ResultData resultData = (ResultData) other;
        return this.success == resultData.success && Intrinsics.areEqual(this.code, resultData.code) && Intrinsics.areEqual(this.msg, resultData.msg);
    }

    public /* synthetic */ ResultData(boolean z11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ ResultData copy$default(ResultData resultData, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = resultData.success;
        }
        if ((i11 & 2) != 0) {
            str = resultData.code;
        }
        if ((i11 & 4) != 0) {
            str2 = resultData.msg;
        }
        return resultData.copy(z11, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final ResultData copy(boolean success, @NotNull String code, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ResultData(success, code, msg);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.success) * 31) + this.code.hashCode()) * 31) + this.msg.hashCode();
    }

    @NotNull
    public String toString() {
        return "ResultData(success=" + this.success + ", code=" + this.code + ", msg=" + this.msg + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.success ? 1 : 0);
        dest.writeString(this.code);
        dest.writeString(this.msg);
    }
}
