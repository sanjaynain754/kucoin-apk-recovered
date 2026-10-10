package com.kubi.kumex.record.filter;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.record.filter.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecordFilterHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kumex/record/filter/IFilterDialogCallBack;", "", "filterCallBack", "", "sideType", "", "timeType", "fundsType", "bizType", "getAdapterResult", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IFilterDialogCallBack {
    @NotNull
    default String getAdapterResult() {
        return "";
    }

    /* JADX INFO: renamed from: j2 */
    default void mo35200j2(@NotNull String sideType, @NotNull String timeType, @NotNull String fundsType, @NotNull String bizType) {
        Intrinsics.checkNotNullParameter(sideType, "sideType");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(fundsType, "fundsType");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
    }
}
