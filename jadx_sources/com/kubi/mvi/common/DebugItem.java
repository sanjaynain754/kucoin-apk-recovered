package com.kubi.mvi.common;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MviContant.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/mvi/common/DebugItem;", "", "name", "", "isOpenLog", "", "(Ljava/lang/String;Z)V", "()Z", "setOpenLog", "(Z)V", "getName", "()Ljava/lang/String;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class DebugItem {
    private boolean isOpenLog;

    @NotNull
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public DebugItem() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public DebugItem(@NotNull String name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.isOpenLog = z11;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: isOpenLog, reason: from getter */
    public final boolean getIsOpenLog() {
        return this.isOpenLog;
    }

    public final void setOpenLog(boolean z11) {
        this.isOpenLog = z11;
    }

    public /* synthetic */ DebugItem(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11);
    }
}
