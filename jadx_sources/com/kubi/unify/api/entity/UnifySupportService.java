package com.kubi.unify.api.entity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: UnifyEnum.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/unify/api/entity/UnifySupportService;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SPOT", "FUTURES", "MARGIN", "OPTION", "BOT", "COPY_TRADING", "FINANCE", "ETF", "KCS", "RED_PACKAGE", "BUnifyAccountApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum UnifySupportService {
    SPOT("SPOT"),
    FUTURES("FUTURES"),
    MARGIN("MARGIN"),
    OPTION("OPTION"),
    BOT("BOT"),
    COPY_TRADING("COPY_TRADING"),
    FINANCE("FINANCE"),
    ETF("ETF"),
    KCS("KCS"),
    RED_PACKAGE("RED_PACKAGE");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f53166c = EnumEntriesKt.enumEntries(m65015a());

    @NotNull
    private final String value;

    @NotNull
    public static EnumEntries<UnifySupportService> getEntries() {
        return f53166c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    UnifySupportService(String str) {
        this.value = str;
    }
}
