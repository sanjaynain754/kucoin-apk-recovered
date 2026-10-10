package com.kubi.operation.lib.utils;

import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LocationOnceManager.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/operation/lib/utils/ResultCode;", "", "code", "", "msg", "", "<init>", "(Ljava/lang/String;IJLjava/lang/String;)V", "getCode", "()J", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", AppConstants.AB_TEST_SUCCESS, "UN_AUTHORIZED", "ERROR", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ResultCode {
    SUCCESS(0, "success"),
    UN_AUTHORIZED(-1, "unauthorized"),
    ERROR(-2, "");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f36853c = EnumEntriesKt.enumEntries(m43652a());
    private final long code;

    @NotNull
    private String msg;

    @NotNull
    public static EnumEntries<ResultCode> getEntries() {
        return f36853c;
    }

    public final long getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    ResultCode(long j11, String str) {
        this.code = j11;
        this.msg = str;
    }
}
