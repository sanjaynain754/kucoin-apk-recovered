package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiPaymentModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiPaymentRecurringFrequencyInfo;", "", "frequency", "", "dayOfMonth", "dayOfWeek", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "frequencyDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDayOfMonth", "()Ljava/lang/String;", "getDayOfWeek", "getFrequency", "getFrequencyDisplay", "getTimeOfDay", "getTimeZone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiPaymentRecurringFrequencyInfo {

    @NotNull
    private final String dayOfMonth;

    @NotNull
    private final String dayOfWeek;

    @NotNull
    private final String frequency;

    @NotNull
    private final String frequencyDisplay;

    @NotNull
    private final String timeOfDay;

    @NotNull
    private final String timeZone;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiPaymentRecurringFrequencyInfo)) {
            return false;
        }
        KCJSApiPaymentRecurringFrequencyInfo kCJSApiPaymentRecurringFrequencyInfo = (KCJSApiPaymentRecurringFrequencyInfo) other;
        return Intrinsics.areEqual(this.frequency, kCJSApiPaymentRecurringFrequencyInfo.frequency) && Intrinsics.areEqual(this.dayOfMonth, kCJSApiPaymentRecurringFrequencyInfo.dayOfMonth) && Intrinsics.areEqual(this.dayOfWeek, kCJSApiPaymentRecurringFrequencyInfo.dayOfWeek) && Intrinsics.areEqual(this.timeOfDay, kCJSApiPaymentRecurringFrequencyInfo.timeOfDay) && Intrinsics.areEqual(this.timeZone, kCJSApiPaymentRecurringFrequencyInfo.timeZone) && Intrinsics.areEqual(this.frequencyDisplay, kCJSApiPaymentRecurringFrequencyInfo.frequencyDisplay);
    }

    public KCJSApiPaymentRecurringFrequencyInfo(@NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull String frequencyDisplay) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(dayOfMonth, "dayOfMonth");
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(frequencyDisplay, "frequencyDisplay");
        this.frequency = frequency;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.timeZone = timeZone;
        this.frequencyDisplay = frequencyDisplay;
    }

    public static /* synthetic */ KCJSApiPaymentRecurringFrequencyInfo copy$default(KCJSApiPaymentRecurringFrequencyInfo kCJSApiPaymentRecurringFrequencyInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiPaymentRecurringFrequencyInfo.frequency;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiPaymentRecurringFrequencyInfo.dayOfMonth;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiPaymentRecurringFrequencyInfo.dayOfWeek;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiPaymentRecurringFrequencyInfo.timeOfDay;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiPaymentRecurringFrequencyInfo.timeZone;
        }
        if ((i11 & 32) != 0) {
            str6 = kCJSApiPaymentRecurringFrequencyInfo.frequencyDisplay;
        }
        String str7 = str5;
        String str8 = str6;
        return kCJSApiPaymentRecurringFrequencyInfo.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDayOfMonth() {
        return this.dayOfMonth;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDayOfWeek() {
        return this.dayOfWeek;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFrequencyDisplay() {
        return this.frequencyDisplay;
    }

    @NotNull
    public final KCJSApiPaymentRecurringFrequencyInfo copy(@NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull String frequencyDisplay) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(dayOfMonth, "dayOfMonth");
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(frequencyDisplay, "frequencyDisplay");
        return new KCJSApiPaymentRecurringFrequencyInfo(frequency, dayOfMonth, dayOfWeek, timeOfDay, timeZone, frequencyDisplay);
    }

    @NotNull
    public final String getDayOfMonth() {
        return this.dayOfMonth;
    }

    @NotNull
    public final String getDayOfWeek() {
        return this.dayOfWeek;
    }

    @NotNull
    public final String getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final String getFrequencyDisplay() {
        return this.frequencyDisplay;
    }

    @NotNull
    public final String getTimeOfDay() {
        return this.timeOfDay;
    }

    @NotNull
    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((((((((this.frequency.hashCode() * 31) + this.dayOfMonth.hashCode()) * 31) + this.dayOfWeek.hashCode()) * 31) + this.timeOfDay.hashCode()) * 31) + this.timeZone.hashCode()) * 31) + this.frequencyDisplay.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiPaymentRecurringFrequencyInfo(frequency=" + this.frequency + ", dayOfMonth=" + this.dayOfMonth + ", dayOfWeek=" + this.dayOfWeek + ", timeOfDay=" + this.timeOfDay + ", timeZone=" + this.timeZone + ", frequencyDisplay=" + this.frequencyDisplay + ')';
    }
}
