package com.kubi.safe.api.entity;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CountTimeParams.kt */
/* JADX INFO: loaded from: classes40.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/safe/api/entity/CountTimeParams;", "", AppsFlyerProperties.CHANNEL, "", "receiver", "validationBiz", "loginToken", "ext", "residenceCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getReceiver", "getValidationBiz", "getLoginToken", "getExt", "getResidenceCountry", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CountTimeParams {

    @Nullable
    private final String channel;

    @Nullable
    private final String ext;

    @Nullable
    private final String loginToken;

    @Nullable
    private final String receiver;

    @Nullable
    private final String residenceCountry;

    @Nullable
    private final String validationBiz;

    public CountTimeParams() {
        this(null, null, null, null, null, null, 63, null);
    }

    public CountTimeParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.channel = str;
        this.receiver = str2;
        this.validationBiz = str3;
        this.loginToken = str4;
        this.ext = str5;
        this.residenceCountry = str6;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final String getLoginToken() {
        return this.loginToken;
    }

    @Nullable
    public final String getReceiver() {
        return this.receiver;
    }

    @Nullable
    public final String getResidenceCountry() {
        return this.residenceCountry;
    }

    @Nullable
    public final String getValidationBiz() {
        return this.validationBiz;
    }

    public /* synthetic */ CountTimeParams(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }
}
