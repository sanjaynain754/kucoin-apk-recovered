package com.kubi.assets.entity;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BotAssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/entity/BotAssetEntity;", "", "<init>", "()V", "baseCurrencyName", "", "getBaseCurrencyName", "()Ljava/lang/String;", "setBaseCurrencyName", "(Ljava/lang/String;)V", "assetsValue", "getAssetsValue", "setAssetsValue", "assetsValueLegal", "getAssetsValueLegal", "setAssetsValueLegal", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BotAssetEntity {

    @Nullable
    private String assetsValue;

    @Nullable
    private String assetsValueLegal;

    @Nullable
    private String baseCurrencyName;

    @Nullable
    public final String getAssetsValue() {
        return this.assetsValue;
    }

    @Nullable
    public final String getAssetsValueLegal() {
        return this.assetsValueLegal;
    }

    @Nullable
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    public final void setAssetsValue(@Nullable String str) {
        this.assetsValue = str;
    }

    public final void setAssetsValueLegal(@Nullable String str) {
        this.assetsValueLegal = str;
    }

    public final void setBaseCurrencyName(@Nullable String str) {
        this.baseCurrencyName = str;
    }
}
