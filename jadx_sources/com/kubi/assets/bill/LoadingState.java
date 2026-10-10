package com.kubi.assets.bill;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AccountBillCommonViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/bill/LoadingState;", "", "msg", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "IDLE", "LOADING", "REFRESHING", "LOADING_MORE", "LOAD_ERROR", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum LoadingState {
    IDLE(null, 1, null),
    LOADING(null, 1, null),
    REFRESHING(null, 1, null),
    LOADING_MORE(null, 1, null),
    LOAD_ERROR(null, 1, null);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @Nullable
    private final String msg;

    LoadingState(String str) {
        this.msg = str;
    }

    /* synthetic */ LoadingState(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }

    @NotNull
    public static EnumEntries<LoadingState> getEntries() {
        return $ENTRIES;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }
}
