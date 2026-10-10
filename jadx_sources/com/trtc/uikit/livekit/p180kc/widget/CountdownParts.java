package com.trtc.uikit.livekit.p180kc.widget;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KCAudiencePreviewView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/CountdownParts;", "", "days", "", "hours", "minutes", "seconds", "finished", "", "<init>", "(JJJJZ)V", "getDays", "()J", "getHours", "getMinutes", "getSeconds", "getFinished", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CountdownParts {
    private final long days;
    private final boolean finished;
    private final long hours;
    private final long minutes;
    private final long seconds;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountdownParts)) {
            return false;
        }
        CountdownParts countdownParts = (CountdownParts) other;
        return this.days == countdownParts.days && this.hours == countdownParts.hours && this.minutes == countdownParts.minutes && this.seconds == countdownParts.seconds && this.finished == countdownParts.finished;
    }

    public static /* synthetic */ CountdownParts copy$default(CountdownParts countdownParts, long j11, long j12, long j13, long j14, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = countdownParts.days;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = countdownParts.hours;
        }
        return countdownParts.copy(j15, j12, (i11 & 4) != 0 ? countdownParts.minutes : j13, (i11 & 8) != 0 ? countdownParts.seconds : j14, (i11 & 16) != 0 ? countdownParts.finished : z11);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    @NotNull
    public final CountdownParts copy(long days, long hours, long minutes, long seconds, boolean finished) {
        return new CountdownParts(days, hours, minutes, seconds, finished);
    }

    public final long getDays() {
        return this.days;
    }

    public final boolean getFinished() {
        return this.finished;
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
        return (((((((Long.hashCode(this.days) * 31) + Long.hashCode(this.hours)) * 31) + Long.hashCode(this.minutes)) * 31) + Long.hashCode(this.seconds)) * 31) + Boolean.hashCode(this.finished);
    }

    @NotNull
    public String toString() {
        return "CountdownParts(days=" + this.days + ", hours=" + this.hours + ", minutes=" + this.minutes + ", seconds=" + this.seconds + ", finished=" + this.finished + ')';
    }

    public CountdownParts(long j11, long j12, long j13, long j14, boolean z11) {
        this.days = j11;
        this.hours = j12;
        this.minutes = j13;
        this.seconds = j14;
        this.finished = z11;
    }
}
