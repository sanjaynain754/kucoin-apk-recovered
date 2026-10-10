package com.kubi.futures.data.trial;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ITrialApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/data/trial/SubmitTrialData;", "", AppsFlyerProperties.CHANNEL, "", "code", "symbol", "side", "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getCode", "getSymbol", "getSide", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitTrialData {

    @NotNull
    private final String channel;

    @NotNull
    private final String code;

    @NotNull
    private final String side;

    @NotNull
    private final String symbol;

    @Nullable
    private final transient String validationToken;

    public SubmitTrialData(@NotNull String channel, @NotNull String code, @NotNull String symbol, @NotNull String side, @Nullable String str) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        this.channel = channel;
        this.code = code;
        this.symbol = symbol;
        this.side = side;
        this.validationToken = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitTrialData)) {
            return false;
        }
        SubmitTrialData submitTrialData = (SubmitTrialData) other;
        return Intrinsics.areEqual(this.channel, submitTrialData.channel) && Intrinsics.areEqual(this.code, submitTrialData.code) && Intrinsics.areEqual(this.symbol, submitTrialData.symbol) && Intrinsics.areEqual(this.side, submitTrialData.side) && Intrinsics.areEqual(this.validationToken, submitTrialData.validationToken);
    }

    public static /* synthetic */ SubmitTrialData copy$default(SubmitTrialData submitTrialData, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitTrialData.channel;
        }
        if ((i11 & 2) != 0) {
            str2 = submitTrialData.code;
        }
        if ((i11 & 4) != 0) {
            str3 = submitTrialData.symbol;
        }
        if ((i11 & 8) != 0) {
            str4 = submitTrialData.side;
        }
        if ((i11 & 16) != 0) {
            str5 = submitTrialData.validationToken;
        }
        String str6 = str5;
        String str7 = str3;
        return submitTrialData.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @NotNull
    public final SubmitTrialData copy(@NotNull String channel, @NotNull String code, @NotNull String symbol, @NotNull String side, @Nullable String validationToken) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        return new SubmitTrialData(channel, code, symbol, side, validationToken);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getValidationToken() {
        return this.validationToken;
    }

    public int hashCode() {
        int iHashCode = ((((((this.channel.hashCode() * 31) + this.code.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.side.hashCode()) * 31;
        String str = this.validationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SubmitTrialData(channel=" + this.channel + ", code=" + this.code + ", symbol=" + this.symbol + ", side=" + this.side + ", validationToken=" + this.validationToken + ')';
    }

    public /* synthetic */ SubmitTrialData(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5);
    }
}
