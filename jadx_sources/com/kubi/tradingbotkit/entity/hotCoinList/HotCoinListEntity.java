package com.kubi.tradingbotkit.entity.hotCoinList;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33616e0;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: HotCoinListEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/hotCoinList/HotCoinListEntity;", "", "<init>", "()V", "symbolCode", "", "getSymbolCode", "()Ljava/lang/String;", "setSymbolCode", "(Ljava/lang/String;)V", "amplitudeRatio", "getAmplitudeRatio", "setAmplitudeRatio", "changeRate", "getChangeRate", "setChangeRate", FirebaseAnalytics.Param.PRICE, "getPrice", "setPrice", C33616e0.f69644s, "", "Lcom/kubi/tradingbotkit/entity/hotCoinList/Tag;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "volValue", "getVolValue", "setVolValue", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HotCoinListEntity {

    @Nullable
    private String amplitudeRatio;

    @Nullable
    private String changeRate;

    @Nullable
    private String price;

    @Nullable
    private String symbolCode;

    @Nullable
    private List<Tag> tags;

    @Nullable
    private String volValue;

    @Nullable
    public final String getAmplitudeRatio() {
        return this.amplitudeRatio;
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final List<Tag> getTags() {
        return this.tags;
    }

    @Nullable
    public final String getVolValue() {
        return this.volValue;
    }

    public final void setAmplitudeRatio(@Nullable String str) {
        this.amplitudeRatio = str;
    }

    public final void setChangeRate(@Nullable String str) {
        this.changeRate = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setTags(@Nullable List<Tag> list) {
        this.tags = list;
    }

    public final void setVolValue(@Nullable String str) {
        this.volValue = str;
    }
}
