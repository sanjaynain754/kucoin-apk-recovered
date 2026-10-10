package com.kubi.monitor;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlutterError.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JI\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\b\u0010'\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m90084d2 = {"Lcom/kubi/monitor/FlutterError;", "", "throwable", "", "message", "", "reason", TtmlNode.TAG_INFORMATION, "category", FirebaseAnalytics.Param.LEVEL, "Lcom/kubi/monitor/MonitorLevel;", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getInformation", "setInformation", "getLevel", "()Lcom/kubi/monitor/MonitorLevel;", "setLevel", "(Lcom/kubi/monitor/MonitorLevel;)V", "getMessage", "getReason", "setReason", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class FlutterError {

    @NotNull
    private String category;

    @Nullable
    private String information;

    @NotNull
    private MonitorLevel level;

    @NotNull
    private final String message;

    @Nullable
    private String reason;

    @NotNull
    private final Throwable throwable;

    public FlutterError(@NotNull Throwable throwable, @NotNull String message, @Nullable String str, @Nullable String str2, @NotNull String category, @NotNull MonitorLevel level) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(level, "level");
        this.throwable = throwable;
        this.message = message;
        this.reason = str;
        this.information = str2;
        this.category = category;
        this.level = level;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlutterError)) {
            return false;
        }
        FlutterError flutterError = (FlutterError) other;
        return Intrinsics.areEqual(this.throwable, flutterError.throwable) && Intrinsics.areEqual(this.message, flutterError.message) && Intrinsics.areEqual(this.reason, flutterError.reason) && Intrinsics.areEqual(this.information, flutterError.information) && Intrinsics.areEqual(this.category, flutterError.category) && this.level == flutterError.level;
    }

    public static /* synthetic */ FlutterError copy$default(FlutterError flutterError, Throwable th2, String str, String str2, String str3, String str4, MonitorLevel monitorLevel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = flutterError.throwable;
        }
        if ((i11 & 2) != 0) {
            str = flutterError.message;
        }
        if ((i11 & 4) != 0) {
            str2 = flutterError.reason;
        }
        if ((i11 & 8) != 0) {
            str3 = flutterError.information;
        }
        if ((i11 & 16) != 0) {
            str4 = flutterError.category;
        }
        if ((i11 & 32) != 0) {
            monitorLevel = flutterError.level;
        }
        String str5 = str4;
        MonitorLevel monitorLevel2 = monitorLevel;
        return flutterError.copy(th2, str, str2, str3, str5, monitorLevel2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInformation() {
        return this.information;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MonitorLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final FlutterError copy(@NotNull Throwable throwable, @NotNull String message, @Nullable String reason, @Nullable String information, @NotNull String category, @NotNull MonitorLevel level) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(level, "level");
        return new FlutterError(throwable, message, reason, information, category, level);
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getInformation() {
        return this.information;
    }

    @NotNull
    public final MonitorLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = ((this.throwable.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.information;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.category.hashCode()) * 31) + this.level.hashCode();
    }

    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final void setInformation(@Nullable String str) {
        this.information = str;
    }

    public final void setLevel(@NotNull MonitorLevel monitorLevel) {
        Intrinsics.checkNotNullParameter(monitorLevel, "<set-?>");
        this.level = monitorLevel;
    }

    public final void setReason(@Nullable String str) {
        this.reason = str;
    }

    @NotNull
    public String toString() {
        return "FlutterError(throwable=" + this.throwable + ", message='" + this.message + "', reason=" + ((Object) this.reason) + ", information=" + ((Object) this.information) + ", category='" + this.category + "', level=" + this.level + ')';
    }

    public /* synthetic */ FlutterError(Throwable th2, String str, String str2, String str3, String str4, MonitorLevel monitorLevel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? "FlutterError" : str4, (i11 & 32) != 0 ? MonitorLevel.ERROR : monitorLevel);
    }
}
