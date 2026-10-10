package com.kubi.payment.channel.data.entities;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Capitual.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;", "", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmailAddress", "()Ljava/lang/String;", "getPhoneNumber", "getName", "realPhoneNumber", "getRealPhoneNumber", "phoneAreaCode", "getPhoneAreaCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChannelUserInfo {

    @SerializedName("email")
    @Nullable
    private final String emailAddress;

    @SerializedName("kycName")
    @Nullable
    private final String name;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    @Nullable
    private final String phoneNumber;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUserInfo)) {
            return false;
        }
        ChannelUserInfo channelUserInfo = (ChannelUserInfo) other;
        return Intrinsics.areEqual(this.emailAddress, channelUserInfo.emailAddress) && Intrinsics.areEqual(this.phoneNumber, channelUserInfo.phoneNumber) && Intrinsics.areEqual(this.name, channelUserInfo.name);
    }

    public static /* synthetic */ ChannelUserInfo copy$default(ChannelUserInfo channelUserInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = channelUserInfo.emailAddress;
        }
        if ((i11 & 2) != 0) {
            str2 = channelUserInfo.phoneNumber;
        }
        if ((i11 & 4) != 0) {
            str3 = channelUserInfo.name;
        }
        return channelUserInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ChannelUserInfo copy(@Nullable String emailAddress, @Nullable String phoneNumber, @Nullable String name) {
        return new ChannelUserInfo(emailAddress, phoneNumber, name);
    }

    @Nullable
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhoneAreaCode() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) C27041f.m66668h(this.phoneNumber), C33820nf.f71144W, 0, false, 6, (Object) null);
        if (iIndexOf$default <= 0) {
            return "";
        }
        String strSubstring = C27041f.m66668h(this.phoneNumber).substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt.trim((CharSequence) strSubstring).toString();
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getRealPhoneNumber() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) C27041f.m66668h(this.phoneNumber), C33820nf.f71144W, 0, false, 6, (Object) null);
        if (iIndexOf$default <= 0 || iIndexOf$default >= C27041f.m66668h(this.phoneNumber).length()) {
            return "";
        }
        String strSubstring = C27041f.m66668h(this.phoneNumber).substring(iIndexOf$default + 1, C27041f.m66668h(this.phoneNumber).length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt.trim((CharSequence) strSubstring).toString();
    }

    public int hashCode() {
        String str = this.emailAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChannelUserInfo(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", name=" + this.name + ')';
    }

    public ChannelUserInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.emailAddress = str;
        this.phoneNumber = str2;
        this.name = str3;
    }
}
