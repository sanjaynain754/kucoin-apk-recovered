package com.kubi.assets.entity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AccountDetailFreezeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/entity/FreezeType;", "", "<init>", "(Ljava/lang/String;I)V", "WITHDRAW_FREEZE", "P2P_FREEZE", "TRADE_FREEZE", "GREY_MARKET_FREEZE", "GEM_POOL_FREEZE", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum FreezeType {
    WITHDRAW_FREEZE,
    P2P_FREEZE,
    TRADE_FREEZE,
    GREY_MARKET_FREEZE,
    GEM_POOL_FREEZE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<FreezeType> getEntries() {
        return $ENTRIES;
    }
}
