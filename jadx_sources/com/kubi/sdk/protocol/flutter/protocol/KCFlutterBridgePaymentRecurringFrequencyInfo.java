package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgePaymentCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePaymentRecurringFrequencyInfo;", "", "frequency", "", "dayOfMonth", "dayOfWeek", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "frequencyDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDayOfMonth", "()Ljava/lang/String;", "getDayOfWeek", "getFrequency", "getFrequencyDisplay", "getTimeOfDay", "getTimeZone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgePaymentRecurringFrequencyInfo {

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
        if (!(other instanceof KCFlutterBridgePaymentRecurringFrequencyInfo)) {
            return false;
        }
        KCFlutterBridgePaymentRecurringFrequencyInfo kCFlutterBridgePaymentRecurringFrequencyInfo = (KCFlutterBridgePaymentRecurringFrequencyInfo) other;
        return Intrinsics.areEqual(this.frequency, kCFlutterBridgePaymentRecurringFrequencyInfo.frequency) && Intrinsics.areEqual(this.dayOfMonth, kCFlutterBridgePaymentRecurringFrequencyInfo.dayOfMonth) && Intrinsics.areEqual(this.dayOfWeek, kCFlutterBridgePaymentRecurringFrequencyInfo.dayOfWeek) && Intrinsics.areEqual(this.timeOfDay, kCFlutterBridgePaymentRecurringFrequencyInfo.timeOfDay) && Intrinsics.areEqual(this.timeZone, kCFlutterBridgePaymentRecurringFrequencyInfo.timeZone) && Intrinsics.areEqual(this.frequencyDisplay, kCFlutterBridgePaymentRecurringFrequencyInfo.frequencyDisplay);
    }

    public KCFlutterBridgePaymentRecurringFrequencyInfo(@NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull String frequencyDisplay) {
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

    public static /* synthetic */ KCFlutterBridgePaymentRecurringFrequencyInfo copy$default(KCFlutterBridgePaymentRecurringFrequencyInfo kCFlutterBridgePaymentRecurringFrequencyInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgePaymentRecurringFrequencyInfo.frequency;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgePaymentRecurringFrequencyInfo.dayOfMonth;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgePaymentRecurringFrequencyInfo.dayOfWeek;
        }
        if ((i11 & 8) != 0) {
            str4 = kCFlutterBridgePaymentRecurringFrequencyInfo.timeOfDay;
        }
        if ((i11 & 16) != 0) {
            str5 = kCFlutterBridgePaymentRecurringFrequencyInfo.timeZone;
        }
        if ((i11 & 32) != 0) {
            str6 = kCFlutterBridgePaymentRecurringFrequencyInfo.frequencyDisplay;
        }
        String str7 = str5;
        String str8 = str6;
        return kCFlutterBridgePaymentRecurringFrequencyInfo.copy(str, str2, str3, str4, str7, str8);
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
    public final KCFlutterBridgePaymentRecurringFrequencyInfo copy(@NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull String frequencyDisplay) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(dayOfMonth, "dayOfMonth");
        Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
        Intrinsics.checkNotNullParameter(timeOfDay, "timeOfDay");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(frequencyDisplay, "frequencyDisplay");
        return new KCFlutterBridgePaymentRecurringFrequencyInfo(frequency, dayOfMonth, dayOfWeek, timeOfDay, timeZone, frequencyDisplay);
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
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("frequency", this.frequency);
        linkedHashMap.put("dayOfMonth", this.dayOfMonth);
        linkedHashMap.put("dayOfWeek", this.dayOfWeek);
        linkedHashMap.put("timeOfDay", this.timeOfDay);
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, this.timeZone);
        linkedHashMap.put("frequencyDisplay", this.frequencyDisplay);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgePaymentRecurringFrequencyInfo(frequency=" + this.frequency + ", dayOfMonth=" + this.dayOfMonth + ", dayOfWeek=" + this.dayOfWeek + ", timeOfDay=" + this.timeOfDay + ", timeZone=" + this.timeZone + ", frequencyDisplay=" + this.frequencyDisplay + ')';
    }
}
