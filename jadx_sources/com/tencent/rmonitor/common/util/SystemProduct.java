package com.tencent.rmonitor.common.util;

import com.tencent.bugly.proguard.C33715if;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/SystemProduct;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class SystemProduct {

    @NotNull
    private static final String TAG = "RMonitor_common_SystemProduct";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<Boolean> isDalvikVm$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: com.tencent.rmonitor.common.util.SystemProduct$Companion$isDalvikVm$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            Object objM73428a = C33715if.m73428a(Thread.currentThread(), "nativePeer");
            if ((objM73428a instanceof Long ? (Long) objM73428a : null) != null) {
                Logger.INSTANCE.mo77132i("RMonitor_common_SystemProduct", "ART Mode");
            }
            Object objM73429a = C33715if.m73429a(Thread.currentThread(), "vmThread", false);
            if (objM73429a != null) {
                Object objM73429a2 = C33715if.m73429a(objM73429a, "vmData", false);
                Integer num = objM73429a2 instanceof Integer ? (Integer) objM73429a2 : null;
                if ((num != null ? num.intValue() : 0) != 0) {
                    Logger.INSTANCE.mo77130d("RMonitor_common_SystemProduct", "Dalvik Mode");
                    return Boolean.TRUE;
                }
            }
            Logger.INSTANCE.mo77130d("RMonitor_common_SystemProduct", "default ART Mode");
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0005\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/SystemProduct$Companion;", "", "()V", "TAG", "", "isDalvikVm", "", "isDalvikVm$annotations", "()Z", "isDalvikVm$delegate", "Lkotlin/Lazy;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isDalvikVm() {
            return ((Boolean) SystemProduct.isDalvikVm$delegate.getValue()).booleanValue();
        }

        @JvmStatic
        public static /* synthetic */ void isDalvikVm$annotations() {
        }
    }

    public static final boolean isDalvikVm() {
        return INSTANCE.isDalvikVm();
    }
}
