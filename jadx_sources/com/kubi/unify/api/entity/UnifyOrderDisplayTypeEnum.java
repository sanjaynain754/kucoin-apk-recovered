package com.kubi.unify.api.entity;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.unifyapi.R$string;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: UnifyEnum.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/unify/api/entity/UnifyOrderDisplayTypeEnum;", "", "type", "", "tradeType", "", "displayString", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "getType", "()I", "getTradeType", "()Ljava/lang/String;", TUIConstants.TUIChat.METHOD_GET_DISPLAY_STRING, "UTA_LIMIT", "UTA_MARKET", "UTA_CON_LIMIT", "UTA_CON_MARKET", "UTA_ADVANCED_LIMIT", "UTA_HIDDEN", "UTA_LIQUIDATION", "UTA_ADL", "UTA_SETTLEMENT", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum UnifyOrderDisplayTypeEnum {
    UTA_LIMIT(0, TUIConstants.TUIContact.LIMIT, R$string.kumex_order_limit),
    UTA_MARKET(1, "market", R$string.kumex_order_market),
    UTA_CON_LIMIT(2, "limit_stop", R$string.kumex_order_limit_stop),
    UTA_CON_MARKET(3, "market_stop", R$string.kumex_order_market_stop),
    UTA_ADVANCED_LIMIT(4, "advanced_limit", R$string.kumex_order_limit_advanced),
    UTA_HIDDEN(5, ViewProps.HIDDEN, R$string.kumex_order_hidden),
    UTA_LIQUIDATION(6, "liquid", R$string.force_close_position),
    UTA_ADL(7, "adl", R$string.auto_reduce_position),
    UTA_SETTLEMENT(8, "settlement", R$string.settlement);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53160c = EnumEntriesKt.enumEntries(m65012a());
    private final int displayString;

    @NotNull
    private final String tradeType;
    private final int type;

    @NotNull
    public static EnumEntries<UnifyOrderDisplayTypeEnum> getEntries() {
        return f53160c;
    }

    public final int getDisplayString() {
        return this.displayString;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public final int getType() {
        return this.type;
    }

    UnifyOrderDisplayTypeEnum(int i11, String str, int i12) {
        this.type = i11;
        this.tradeType = str;
        this.displayString = i12;
    }
}
