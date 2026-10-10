package com.kubi.quotefacade.constant;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: QuoteConstant.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/CardID;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "MARKET_CHANGE", "WHALE", "ALART", "QuoteFacadeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum CardID {
    MARKET_CHANGE(100),
    WHALE(101),
    ALART(102);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f41646c = EnumEntriesKt.enumEntries(m51044a());
    private final int id;

    @NotNull
    public static EnumEntries<CardID> getEntries() {
        return f41646c;
    }

    public final int getId() {
        return this.id;
    }

    CardID(int i11) {
        this.id = i11;
    }
}
