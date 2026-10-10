package com.kubi.safe.api.tradesecurity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TradeSecurityScene.kt */
/* JADX INFO: loaded from: classes40.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/safe/api/tradesecurity/TradeSecurityScene;", "", "<init>", "(Ljava/lang/String;I)V", "SPOT_SUBMIT", "MARGIN_SUBMIT", "TRADE_CORE_SUBMIT", "CONTRACT_SUBMIT", "CONTRACT_AMEND", "CONTRACT_STOP_PROFIT_LOSS", "SPOT_AMEND", "MARGIN_AMEND", "MARGIN_ISOLATED_CLOSE", "MARGIN_CROSS_CLOSE", "UTA_CONTRACT_SUBMIT", "SafeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum TradeSecurityScene {
    SPOT_SUBMIT,
    MARGIN_SUBMIT,
    TRADE_CORE_SUBMIT,
    CONTRACT_SUBMIT,
    CONTRACT_AMEND,
    CONTRACT_STOP_PROFIT_LOSS,
    SPOT_AMEND,
    MARGIN_AMEND,
    MARGIN_ISOLATED_CLOSE,
    MARGIN_CROSS_CLOSE,
    UTA_CONTRACT_SUBMIT;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f46335c = EnumEntriesKt.enumEntries(m56343a());

    @NotNull
    public static EnumEntries<TradeSecurityScene> getEntries() {
        return f46335c;
    }
}
