package com.tencent.rmonitor.common.thread;

import com.tencent.bugly.proguard.C33715if;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.SystemProduct;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/common/thread/ThreadTool;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ThreadTool {

    @NotNull
    private static final String TAG = "RMonitor_common_ThreadTool";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThreadLocal<StringBuilder> builderThreadLocal = new ThreadLocal<>();

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\f\u0010\r\u001a\u00060\u0007j\u0002`\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/rmonitor/common/thread/ThreadTool$Companion;", "", "()V", "TAG", "", "builderThreadLocal", "Ljava/lang/ThreadLocal;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getNativeThreadAddress", "", InterfaceC33953u5.f72225u, "Ljava/lang/Thread;", "getReuseStringBuilder", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final long getNativeThreadAddress(@NotNull Thread thread) {
            Long l11;
            Intrinsics.checkNotNullParameter(thread, "thread");
            try {
                if (!SystemProduct.INSTANCE.isDalvikVm()) {
                    Object objM73428a = C33715if.m73428a(thread, "nativePeer");
                    l11 = objM73428a instanceof Long ? (Long) objM73428a : null;
                    if (l11 != null) {
                        return l11.longValue();
                    }
                    return -1L;
                }
                Object objM73428a2 = C33715if.m73428a(thread, "vmThread");
                if (objM73428a2 == null) {
                    return -1L;
                }
                Object objM73429a = C33715if.m73429a(objM73428a2, "vmData", false);
                l11 = objM73429a instanceof Long ? (Long) objM73429a : null;
                if (l11 != null) {
                    return l11.longValue();
                }
                return -1L;
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(ThreadTool.TAG, "getNativeThreadAddress", th2);
                return -1L;
            }
        }

        @JvmStatic
        @NotNull
        public final StringBuilder getReuseStringBuilder() {
            StringBuilder sbDelete;
            StringBuilder sb2 = (StringBuilder) ThreadTool.builderThreadLocal.get();
            if (sb2 != null) {
                sbDelete = sb2.delete(0, sb2.length());
            } else {
                sbDelete = null;
            }
            if (sbDelete == null) {
                StringBuilder sb3 = new StringBuilder(1024);
                ThreadTool.builderThreadLocal.set(sb3);
                return sb3;
            }
            return sbDelete;
        }
    }

    @JvmStatic
    public static final long getNativeThreadAddress(@NotNull Thread thread) {
        return INSTANCE.getNativeThreadAddress(thread);
    }

    @JvmStatic
    @NotNull
    public static final StringBuilder getReuseStringBuilder() {
        return INSTANCE.getReuseStringBuilder();
    }
}
