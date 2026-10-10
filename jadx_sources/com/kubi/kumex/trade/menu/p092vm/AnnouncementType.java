package com.kubi.kumex.trade.menu.p092vm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AnnouncementViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "LATEST", "NEW_TRADING_PAIR", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum AnnouncementType {
    ALL,
    LATEST,
    NEW_TRADING_PAIR;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f30626c = EnumEntriesKt.enumEntries(m36378a());

    @NotNull
    public static EnumEntries<AnnouncementType> getEntries() {
        return f30626c;
    }
}
