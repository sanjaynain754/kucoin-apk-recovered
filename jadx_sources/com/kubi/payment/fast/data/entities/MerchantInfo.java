package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MerchantInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\\\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/MerchantInfo;", "", "nickName", "", "goldMerchant", "", "foxKingMerchant", "merchantHighlights", "", "Lcom/kubi/payment/fast/data/entities/MerchantHighlight;", "showLetter", CustomTabsCallback.ONLINE_EXTRAS_KEY, "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getNickName", "()Ljava/lang/String;", "getGoldMerchant", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFoxKingMerchant", "getMerchantHighlights", "()Ljava/util/List;", "getShowLetter", "getOnline", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/MerchantInfo;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MerchantInfo {

    @Nullable
    private final Integer foxKingMerchant;

    @Nullable
    private final Integer goldMerchant;

    @Nullable
    private final List<MerchantHighlight> merchantHighlights;

    @Nullable
    private final String nickName;

    @Nullable
    private final Boolean online;

    @Nullable
    private final String showLetter;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantInfo)) {
            return false;
        }
        MerchantInfo merchantInfo = (MerchantInfo) other;
        return Intrinsics.areEqual(this.nickName, merchantInfo.nickName) && Intrinsics.areEqual(this.goldMerchant, merchantInfo.goldMerchant) && Intrinsics.areEqual(this.foxKingMerchant, merchantInfo.foxKingMerchant) && Intrinsics.areEqual(this.merchantHighlights, merchantInfo.merchantHighlights) && Intrinsics.areEqual(this.showLetter, merchantInfo.showLetter) && Intrinsics.areEqual(this.online, merchantInfo.online);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, Integer num, Integer num2, List list, String str2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = merchantInfo.nickName;
        }
        if ((i11 & 2) != 0) {
            num = merchantInfo.goldMerchant;
        }
        if ((i11 & 4) != 0) {
            num2 = merchantInfo.foxKingMerchant;
        }
        if ((i11 & 8) != 0) {
            list = merchantInfo.merchantHighlights;
        }
        if ((i11 & 16) != 0) {
            str2 = merchantInfo.showLetter;
        }
        if ((i11 & 32) != 0) {
            bool = merchantInfo.online;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        return merchantInfo.copy(str, num, num2, list, str3, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGoldMerchant() {
        return this.goldMerchant;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFoxKingMerchant() {
        return this.foxKingMerchant;
    }

    @Nullable
    public final List<MerchantHighlight> component4() {
        return this.merchantHighlights;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShowLetter() {
        return this.showLetter;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getOnline() {
        return this.online;
    }

    @NotNull
    public final MerchantInfo copy(@Nullable String nickName, @Nullable Integer goldMerchant, @Nullable Integer foxKingMerchant, @Nullable List<MerchantHighlight> merchantHighlights, @Nullable String showLetter, @Nullable Boolean online) {
        return new MerchantInfo(nickName, goldMerchant, foxKingMerchant, merchantHighlights, showLetter, online);
    }

    @Nullable
    public final Integer getFoxKingMerchant() {
        return this.foxKingMerchant;
    }

    @Nullable
    public final Integer getGoldMerchant() {
        return this.goldMerchant;
    }

    @Nullable
    public final List<MerchantHighlight> getMerchantHighlights() {
        return this.merchantHighlights;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final Boolean getOnline() {
        return this.online;
    }

    @Nullable
    public final String getShowLetter() {
        return this.showLetter;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.goldMerchant;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.foxKingMerchant;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<MerchantHighlight> list = this.merchantHighlights;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.showLetter;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.online;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MerchantInfo(nickName=" + this.nickName + ", goldMerchant=" + this.goldMerchant + ", foxKingMerchant=" + this.foxKingMerchant + ", merchantHighlights=" + this.merchantHighlights + ", showLetter=" + this.showLetter + ", online=" + this.online + ')';
    }

    public MerchantInfo(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<MerchantHighlight> list, @Nullable String str2, @Nullable Boolean bool) {
        this.nickName = str;
        this.goldMerchant = num;
        this.foxKingMerchant = num2;
        this.merchantHighlights = list;
        this.showLetter = str2;
        this.online = bool;
    }
}
