package com.kubi.assets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import ro.C44128b;

/* JADX INFO: compiled from: AssetsLog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/AssetsLog;", "", "tag", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTag", "()Ljava/lang/String;", "Deposit", "Withdraw", "Transfer", "Home", "Options", "Common", "i", "", "msg", "e", "throwable", "", "w", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum AssetsLog {
    Deposit("Assets.Deposit"),
    Withdraw("Assets.Withdraw"),
    Transfer("Assets.Transfer"),
    Home("Assets.Home"),
    Options("Assets.Options"),
    Common("Assets");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f16345c = EnumEntriesKt.enumEntries(m15233a());

    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: e */
    public final void m15234e(@Nullable String msg) {
        C44128b.m97261e(this.tag, msg);
    }

    @NotNull
    public static EnumEntries<AssetsLog> getEntries() {
        return f16345c;
    }

    /* JADX INFO: renamed from: e */
    public final void m15235e(@Nullable Throwable throwable) {
        C44128b.m97263g(this.tag, throwable);
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: i */
    public final void m15236i(@Nullable String msg) {
        C44128b.m97266j(this.tag, msg);
    }

    /* JADX INFO: renamed from: w */
    public final void m15237w(@Nullable String msg) {
        C44128b.m97270n(this.tag, msg);
    }

    AssetsLog(String str) {
        this.tag = str;
    }
}
