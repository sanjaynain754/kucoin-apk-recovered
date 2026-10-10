package com.tencent.rmonitor.base.meta;

import com.facebook.react.devsupport.StackTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/tencent/rmonitor/base/meta/CloseableLeakMeta;", "Lcom/tencent/rmonitor/base/meta/MonitorMeta;", StackTraceHelper.STACK_KEY, "", "(Ljava/lang/String;)V", "getStack", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class CloseableLeakMeta extends MonitorMeta {

    @NotNull
    private final String stack;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloseableLeakMeta) && Intrinsics.areEqual(this.stack, ((CloseableLeakMeta) other).stack);
    }

    public CloseableLeakMeta(@NotNull String stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        this.stack = stack;
    }

    public static /* synthetic */ CloseableLeakMeta copy$default(CloseableLeakMeta closeableLeakMeta, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = closeableLeakMeta.stack;
        }
        return closeableLeakMeta.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStack() {
        return this.stack;
    }

    @NotNull
    public final CloseableLeakMeta copy(@NotNull String stack) {
        Intrinsics.checkNotNullParameter(stack, "stack");
        return new CloseableLeakMeta(stack);
    }

    @NotNull
    public final String getStack() {
        return this.stack;
    }

    public int hashCode() {
        return this.stack.hashCode();
    }

    @NotNull
    public String toString() {
        return "CloseableLeakMeta(stack=" + this.stack + ')';
    }
}
