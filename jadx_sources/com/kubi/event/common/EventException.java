package com.kubi.event.common;

import com.kubi.monitor.BaseIssueException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EventEx.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/event/common/EventException;", "Lcom/kubi/monitor/BaseIssueException;", "category", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "FlowEventBus_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class EventException extends BaseIssueException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventException(@NotNull String category, @NotNull Throwable throwable) {
        super(category, "", throwable);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }
}
