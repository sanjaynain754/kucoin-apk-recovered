package com.kubi.quotefacade.constant;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: QuoteConstant.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/QuoteMainTab;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "FAV", "MARKET", "KRAZY_DEGEN", "ALPHA", "CHANCE", "COPY_TRADING", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum QuoteMainTab {
    FAV("fav"),
    MARKET("market"),
    KRAZY_DEGEN("krazyDegen"),
    ALPHA("alpha"),
    CHANCE("chance"),
    COPY_TRADING("copyTrading");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f41651c = EnumEntriesKt.enumEntries(m51046a());

    @NotNull
    private final String type;

    @NotNull
    public static EnumEntries<QuoteMainTab> getEntries() {
        return f41651c;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    QuoteMainTab(String str) {
        this.type = str;
    }
}
