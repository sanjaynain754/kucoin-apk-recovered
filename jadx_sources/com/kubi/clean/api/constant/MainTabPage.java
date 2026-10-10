package com.kubi.clean.api.constant;

import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: MainTabPage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/clean/api/constant/MainTabPage;", "", DropFrameTable.COLUMN_SCENE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getScene", "()Ljava/lang/String;", "HOME", "MARKET", "TRADE", "FUTURES", "ASSETS", "AutoCleanUserApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum MainTabPage {
    HOME("homepage"),
    MARKET("market"),
    TRADE("trade"),
    FUTURES("futures_trading"),
    ASSETS("assets_overview");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f19479c = EnumEntriesKt.enumEntries(m20399a());

    @NotNull
    private final String scene;

    @NotNull
    public static EnumEntries<MainTabPage> getEntries() {
        return f19479c;
    }

    @NotNull
    public final String getScene() {
        return this.scene;
    }

    MainTabPage(String str) {
        this.scene = str;
    }
}
