package com.kubi.futures.dialog.twap;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/TimeBreakdown;", "Landroid/os/Parcelable;", "days", "", "hours", "minutes", "seconds", "<init>", "(JJJJ)V", "getDays", "()J", "getHours", "getMinutes", "getSeconds", "toSeconds", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TimeBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TimeBreakdown> CREATOR = new C13130a();
    private final long days;
    private final long hours;
    private final long minutes;
    private final long seconds;

    /* JADX INFO: renamed from: com.kubi.futures.dialog.twap.TimeBreakdown$a */
    /* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13130a implements Parcelable.Creator<TimeBreakdown> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeBreakdown createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimeBreakdown(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TimeBreakdown[] newArray(int i11) {
            return new TimeBreakdown[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeBreakdown)) {
            return false;
        }
        TimeBreakdown timeBreakdown = (TimeBreakdown) other;
        return this.days == timeBreakdown.days && this.hours == timeBreakdown.hours && this.minutes == timeBreakdown.minutes && this.seconds == timeBreakdown.seconds;
    }

    public static /* synthetic */ TimeBreakdown copy$default(TimeBreakdown timeBreakdown, long j11, long j12, long j13, long j14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = timeBreakdown.days;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = timeBreakdown.hours;
        }
        long j16 = j12;
        if ((i11 & 4) != 0) {
            j13 = timeBreakdown.minutes;
        }
        return timeBreakdown.copy(j15, j16, j13, (i11 & 8) != 0 ? timeBreakdown.seconds : j14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getHours() {
        return this.hours;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMinutes() {
        return this.minutes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    @NotNull
    public final TimeBreakdown copy(long days, long hours, long minutes, long seconds) {
        return new TimeBreakdown(days, hours, minutes, seconds);
    }

    public final long getDays() {
        return this.days;
    }

    public final long getHours() {
        return this.hours;
    }

    public final long getMinutes() {
        return this.minutes;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.days) * 31) + Long.hashCode(this.hours)) * 31) + Long.hashCode(this.minutes)) * 31) + Long.hashCode(this.seconds);
    }

    public final long toSeconds() {
        return (this.days * 86400) + (this.hours * C33978va.f72340i) + (this.minutes * 60);
    }

    @NotNull
    public String toString() {
        return "TimeBreakdown(days=" + this.days + ", hours=" + this.hours + ", minutes=" + this.minutes + ", seconds=" + this.seconds + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.days);
        dest.writeLong(this.hours);
        dest.writeLong(this.minutes);
        dest.writeLong(this.seconds);
    }

    public TimeBreakdown(long j11, long j12, long j13, long j14) {
        this.days = j11;
        this.hours = j12;
        this.minutes = j13;
        this.seconds = j14;
    }
}
