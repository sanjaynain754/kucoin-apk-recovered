package com.kubi.mart.sidebar.spot.helper;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SpotSidebarSortHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/SortType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "NAME_ASC", "NAME_DESC", "PRICE_ASC", "PRICE_DESC", "CHANGE_RATE_ASC", "CHANGE_RATE_DESC", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SortType {
    NONE,
    NAME_ASC,
    NAME_DESC,
    PRICE_ASC,
    PRICE_DESC,
    CHANGE_RATE_ASC,
    CHANGE_RATE_DESC;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f34740c = EnumEntriesKt.enumEntries(m41466a());

    @NotNull
    public static EnumEntries<SortType> getEntries() {
        return f34740c;
    }
}
