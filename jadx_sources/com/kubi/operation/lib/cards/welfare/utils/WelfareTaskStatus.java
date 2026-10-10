package com.kubi.operation.lib.cards.welfare.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: WelfareEnum.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/utils/WelfareTaskStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INIT", "AUDIT", "AUDIT_FAIL", "COMPLETE", "equalString", "", "status", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum WelfareTaskStatus {
    INIT,
    AUDIT,
    AUDIT_FAIL,
    COMPLETE;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f36760c = EnumEntriesKt.enumEntries(m43462a());

    @NotNull
    public static EnumEntries<WelfareTaskStatus> getEntries() {
        return f36760c;
    }

    public final boolean equalString(@Nullable String status) {
        return StringsKt.equals(name(), status, true);
    }
}
