package com.kubi.sdk.timpush.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimPushBind.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/entity/TimPushBind;", "", "registrationId", "", "<init>", "(Ljava/lang/String;)V", "getRegistrationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TimPushBind {

    @SerializedName("registrationId")
    @Nullable
    private final String registrationId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TimPushBind) && Intrinsics.areEqual(this.registrationId, ((TimPushBind) other).registrationId);
    }

    public static /* synthetic */ TimPushBind copy$default(TimPushBind timPushBind, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timPushBind.registrationId;
        }
        return timPushBind.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegistrationId() {
        return this.registrationId;
    }

    @NotNull
    public final TimPushBind copy(@Nullable String registrationId) {
        return new TimPushBind(registrationId);
    }

    @Nullable
    public final String getRegistrationId() {
        return this.registrationId;
    }

    public int hashCode() {
        String str = this.registrationId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TimPushBind(registrationId=" + this.registrationId + ')';
    }

    public TimPushBind(@Nullable String str) {
        this.registrationId = str;
    }
}
