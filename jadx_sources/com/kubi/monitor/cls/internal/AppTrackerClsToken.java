package com.kubi.monitor.cls.internal;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppTrackerCredentialManager.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u001bJ\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006!"}, m90084d2 = {"Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "", "secretId", "", "secretKey", InterfaceC33826o0.f71244p, "expiresAtMillis", "", TtmlNode.TAG_REGION, "topicId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getExpiresAtMillis", "()J", "getRegion", "()Ljava/lang/String;", "getSecretId", "getSecretKey", "getToken", "getTopicId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "isValid", "toString", "Monitor-cls_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class AppTrackerClsToken {

    @SerializedName("expiredTime")
    private final long expiresAtMillis;

    @SerializedName(TtmlNode.TAG_REGION)
    @NotNull
    private final String region;

    @SerializedName("tmpSecretId")
    @NotNull
    private final String secretId;

    @SerializedName("tmpSecretKey")
    @NotNull
    private final String secretKey;

    @SerializedName(InterfaceC33826o0.f71244p)
    @NotNull
    private final String token;

    @SerializedName("topicId")
    @NotNull
    private final String topicId;

    public AppTrackerClsToken() {
        this(null, null, null, 0L, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTrackerClsToken)) {
            return false;
        }
        AppTrackerClsToken appTrackerClsToken = (AppTrackerClsToken) other;
        return Intrinsics.areEqual(this.secretId, appTrackerClsToken.secretId) && Intrinsics.areEqual(this.secretKey, appTrackerClsToken.secretKey) && Intrinsics.areEqual(this.token, appTrackerClsToken.token) && this.expiresAtMillis == appTrackerClsToken.expiresAtMillis && Intrinsics.areEqual(this.region, appTrackerClsToken.region) && Intrinsics.areEqual(this.topicId, appTrackerClsToken.topicId);
    }

    public AppTrackerClsToken(@NotNull String secretId, @NotNull String secretKey, @NotNull String token, long j11, @NotNull String region, @NotNull String topicId) {
        Intrinsics.checkNotNullParameter(secretId, "secretId");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        this.secretId = secretId;
        this.secretKey = secretKey;
        this.token = token;
        this.expiresAtMillis = j11;
        this.region = region;
        this.topicId = topicId;
    }

    public static /* synthetic */ AppTrackerClsToken copy$default(AppTrackerClsToken appTrackerClsToken, String str, String str2, String str3, long j11, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appTrackerClsToken.secretId;
        }
        if ((i11 & 2) != 0) {
            str2 = appTrackerClsToken.secretKey;
        }
        if ((i11 & 4) != 0) {
            str3 = appTrackerClsToken.token;
        }
        if ((i11 & 8) != 0) {
            j11 = appTrackerClsToken.expiresAtMillis;
        }
        if ((i11 & 16) != 0) {
            str4 = appTrackerClsToken.region;
        }
        if ((i11 & 32) != 0) {
            str5 = appTrackerClsToken.topicId;
        }
        long j12 = j11;
        String str6 = str3;
        return appTrackerClsToken.copy(str, str2, str6, j12, str4, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSecretId() {
        return this.secretId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTopicId() {
        return this.topicId;
    }

    @NotNull
    public final AppTrackerClsToken copy(@NotNull String secretId, @NotNull String secretKey, @NotNull String token, long expiresAtMillis, @NotNull String region, @NotNull String topicId) {
        Intrinsics.checkNotNullParameter(secretId, "secretId");
        Intrinsics.checkNotNullParameter(secretKey, "secretKey");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        return new AppTrackerClsToken(secretId, secretKey, token, expiresAtMillis, region, topicId);
    }

    public final long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getSecretId() {
        return this.secretId;
    }

    @NotNull
    public final String getSecretKey() {
        return this.secretKey;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((((((((this.secretId.hashCode() * 31) + this.secretKey.hashCode()) * 31) + this.token.hashCode()) * 31) + Long.hashCode(this.expiresAtMillis)) * 31) + this.region.hashCode()) * 31) + this.topicId.hashCode();
    }

    public final boolean isValid() {
        return (StringsKt.isBlank(this.secretId) || StringsKt.isBlank(this.secretKey) || StringsKt.isBlank(this.token) || this.expiresAtMillis <= 0 || StringsKt.isBlank(this.region) || StringsKt.isBlank(this.topicId)) ? false : true;
    }

    @NotNull
    public String toString() {
        return "AppTrackerClsToken(secretId=" + this.secretId + ", secretKey=" + this.secretKey + ", token=" + this.token + ", expiresAtMillis=" + this.expiresAtMillis + ", region=" + this.region + ", topicId=" + this.topicId + ')';
    }

    public /* synthetic */ AppTrackerClsToken(String str, String str2, String str3, long j11, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? "" : str5);
    }
}
