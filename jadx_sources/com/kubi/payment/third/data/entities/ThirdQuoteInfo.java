package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.payment.data.entities.BannerInfo;
import com.kubi.utils.extensions.C27025c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006J\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006J\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ju\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006."}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "", "minFiatAmount", "", "maxFiatAmount", "fiatCurrencySelect", "", "Lcom/kubi/payment/third/data/entities/FiatCurrencySelect;", "currencySelect", "Lcom/kubi/payment/third/data/entities/ThirdCurrencySelect;", "payMethodSelect", "Lcom/kubi/payment/third/data/entities/PayMethodSelect;", "payChannelSelect", "Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "bannerInfo", "Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/kubi/payment/data/entities/BannerInfo$Banner;)V", "getMinFiatAmount", "()Ljava/lang/String;", "getMaxFiatAmount", "getFiatCurrencySelect", "()Ljava/util/List;", "getCurrencySelect", "getPayMethodSelect", "getPayChannelSelect", "getBannerInfo", "()Lcom/kubi/payment/data/entities/BannerInfo$Banner;", "getFiatList", "getCryptoList", "getMethodList", "getChannelList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThirdQuote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdQuote.kt\ncom/kubi/payment/third/data/entities/ThirdQuoteInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n774#2:141\n865#2,2:142\n774#2:144\n865#2,2:145\n1056#2:147\n774#2:148\n865#2,2:149\n774#2:151\n865#2,2:152\n*S KotlinDebug\n*F\n+ 1 ThirdQuote.kt\ncom/kubi/payment/third/data/entities/ThirdQuoteInfo\n*L\n43#1:141\n43#1:142,2\n45#1:144\n45#1:145,2\n45#1:147\n47#1:148\n47#1:149,2\n49#1:151\n49#1:152,2\n*E\n"})
public final /* data */ class ThirdQuoteInfo {

    @SerializedName("marketingActivity")
    @Nullable
    private final BannerInfo.Banner bannerInfo;

    @Nullable
    private final List<ThirdCurrencySelect> currencySelect;

    @Nullable
    private final List<FiatCurrencySelect> fiatCurrencySelect;

    @Nullable
    private final String maxFiatAmount;

    @Nullable
    private final String minFiatAmount;

    @Nullable
    private final List<PayChannelSelect> payChannelSelect;

    @Nullable
    private final List<PayMethodSelect> payMethodSelect;

    /* JADX INFO: renamed from: com.kubi.payment.third.data.entities.ThirdQuoteInfo$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ThirdQuote.kt\ncom/kubi/payment/third/data/entities/ThirdQuoteInfo\n*L\n1#1,328:1\n45#2:329\n*E\n"})
    public static final class C21391a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((ThirdCurrencySelect) t11).getName(), ((ThirdCurrencySelect) t12).getName());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdQuoteInfo)) {
            return false;
        }
        ThirdQuoteInfo thirdQuoteInfo = (ThirdQuoteInfo) other;
        return Intrinsics.areEqual(this.minFiatAmount, thirdQuoteInfo.minFiatAmount) && Intrinsics.areEqual(this.maxFiatAmount, thirdQuoteInfo.maxFiatAmount) && Intrinsics.areEqual(this.fiatCurrencySelect, thirdQuoteInfo.fiatCurrencySelect) && Intrinsics.areEqual(this.currencySelect, thirdQuoteInfo.currencySelect) && Intrinsics.areEqual(this.payMethodSelect, thirdQuoteInfo.payMethodSelect) && Intrinsics.areEqual(this.payChannelSelect, thirdQuoteInfo.payChannelSelect) && Intrinsics.areEqual(this.bannerInfo, thirdQuoteInfo.bannerInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirdQuoteInfo copy$default(ThirdQuoteInfo thirdQuoteInfo, String str, String str2, List list, List list2, List list3, List list4, BannerInfo.Banner banner, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = thirdQuoteInfo.minFiatAmount;
        }
        if ((i11 & 2) != 0) {
            str2 = thirdQuoteInfo.maxFiatAmount;
        }
        if ((i11 & 4) != 0) {
            list = thirdQuoteInfo.fiatCurrencySelect;
        }
        if ((i11 & 8) != 0) {
            list2 = thirdQuoteInfo.currencySelect;
        }
        if ((i11 & 16) != 0) {
            list3 = thirdQuoteInfo.payMethodSelect;
        }
        if ((i11 & 32) != 0) {
            list4 = thirdQuoteInfo.payChannelSelect;
        }
        if ((i11 & 64) != 0) {
            banner = thirdQuoteInfo.bannerInfo;
        }
        List list5 = list4;
        BannerInfo.Banner banner2 = banner;
        List list6 = list3;
        List list7 = list;
        return thirdQuoteInfo.copy(str, str2, list7, list2, list6, list5, banner2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMinFiatAmount() {
        return this.minFiatAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxFiatAmount() {
        return this.maxFiatAmount;
    }

    @Nullable
    public final List<FiatCurrencySelect> component3() {
        return this.fiatCurrencySelect;
    }

    @Nullable
    public final List<ThirdCurrencySelect> component4() {
        return this.currencySelect;
    }

    @Nullable
    public final List<PayMethodSelect> component5() {
        return this.payMethodSelect;
    }

    @Nullable
    public final List<PayChannelSelect> component6() {
        return this.payChannelSelect;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BannerInfo.Banner getBannerInfo() {
        return this.bannerInfo;
    }

    @NotNull
    public final ThirdQuoteInfo copy(@Nullable String minFiatAmount, @Nullable String maxFiatAmount, @Nullable List<FiatCurrencySelect> fiatCurrencySelect, @Nullable List<ThirdCurrencySelect> currencySelect, @Nullable List<PayMethodSelect> payMethodSelect, @Nullable List<PayChannelSelect> payChannelSelect, @Nullable BannerInfo.Banner bannerInfo) {
        return new ThirdQuoteInfo(minFiatAmount, maxFiatAmount, fiatCurrencySelect, currencySelect, payMethodSelect, payChannelSelect, bannerInfo);
    }

    @Nullable
    public final BannerInfo.Banner getBannerInfo() {
        return this.bannerInfo;
    }

    @Nullable
    public final List<PayChannelSelect> getChannelList() {
        List<PayChannelSelect> list = this.payChannelSelect;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C27025c.m66566d(((PayChannelSelect) obj).getEnable())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final List<ThirdCurrencySelect> getCryptoList() {
        List<ThirdCurrencySelect> list = this.currencySelect;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C27025c.m66566d(((ThirdCurrencySelect) obj).getEnable())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new C21391a());
    }

    @Nullable
    public final List<ThirdCurrencySelect> getCurrencySelect() {
        return this.currencySelect;
    }

    @Nullable
    public final List<FiatCurrencySelect> getFiatCurrencySelect() {
        return this.fiatCurrencySelect;
    }

    @Nullable
    public final List<FiatCurrencySelect> getFiatList() {
        List<FiatCurrencySelect> list = this.fiatCurrencySelect;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C27025c.m66566d(((FiatCurrencySelect) obj).getEnable())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final String getMaxFiatAmount() {
        return this.maxFiatAmount;
    }

    @Nullable
    public final List<PayMethodSelect> getMethodList() {
        List<PayMethodSelect> list = this.payMethodSelect;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C27025c.m66566d(((PayMethodSelect) obj).getEnable())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final String getMinFiatAmount() {
        return this.minFiatAmount;
    }

    @Nullable
    public final List<PayChannelSelect> getPayChannelSelect() {
        return this.payChannelSelect;
    }

    @Nullable
    public final List<PayMethodSelect> getPayMethodSelect() {
        return this.payMethodSelect;
    }

    public int hashCode() {
        String str = this.minFiatAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxFiatAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<FiatCurrencySelect> list = this.fiatCurrencySelect;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ThirdCurrencySelect> list2 = this.currencySelect;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PayMethodSelect> list3 = this.payMethodSelect;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<PayChannelSelect> list4 = this.payChannelSelect;
        int iHashCode6 = (iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        BannerInfo.Banner banner = this.bannerInfo;
        return iHashCode6 + (banner != null ? banner.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThirdQuoteInfo(minFiatAmount=" + this.minFiatAmount + ", maxFiatAmount=" + this.maxFiatAmount + ", fiatCurrencySelect=" + this.fiatCurrencySelect + ", currencySelect=" + this.currencySelect + ", payMethodSelect=" + this.payMethodSelect + ", payChannelSelect=" + this.payChannelSelect + ", bannerInfo=" + this.bannerInfo + ')';
    }

    public ThirdQuoteInfo(@Nullable String str, @Nullable String str2, @Nullable List<FiatCurrencySelect> list, @Nullable List<ThirdCurrencySelect> list2, @Nullable List<PayMethodSelect> list3, @Nullable List<PayChannelSelect> list4, @Nullable BannerInfo.Banner banner) {
        this.minFiatAmount = str;
        this.maxFiatAmount = str2;
        this.fiatCurrencySelect = list;
        this.currencySelect = list2;
        this.payMethodSelect = list3;
        this.payChannelSelect = list4;
        this.bannerInfo = banner;
    }
}
