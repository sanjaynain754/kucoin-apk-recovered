package com.kubi.jsbridge.knb;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4762i;
import com.kubi.jsbridge.service.HybridSensorService;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.core.C27027a;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p503ok.InterfaceC43106c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgePhone.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J@\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016J8\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00050\rH\u0016¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgePhone;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgePhoneCall;", "<init>", "()V", "bindService", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", NotificationCompat.CATEGORY_SERVICE, "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "unbindService", "isSupportNfc", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgePhone implements InterfaceC4762i {
    @Override // c00.InterfaceC4762i
    /* JADX INFO: renamed from: a */
    public void mo4810a(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(ctx.getPackageManager().hasSystemFeature("android.hardware.nfc")), null);
    }

    @Override // c00.InterfaceC4762i
    /* JADX INFO: renamed from: b */
    public void mo4811b(@NotNull Context ctx, @Nullable Object obj, @NotNull String service, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Object obj2;
        HybridSensorService hybridSensorService;
        HybridSensorService hybridSensorService2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
            return;
        }
        Object objM66596a = C27027a.m66596a(baseActivity, service);
        if (objM66596a == null) {
            if (Intrinsics.areEqual(service, "sensor")) {
                hybridSensorService2 = new HybridSensorService(baseActivity);
                LifecycleOwnerKt.getLifecycleScope(baseActivity).launchWhenResumed(new KCHybridBridgePhone$bindService$serviceObj$1$1(baseActivity, hybridSensorService2, null));
            } else {
                callback.invoke(Boolean.FALSE, new ProtocolException("service is not allow", null, null, false, 14, null));
                hybridSensorService = null;
            }
            if (hybridSensorService != null) {
                obj2 = objM66596a;
                obj2 = objM66596a;
                hybridSensorService = hybridSensorService2;
                C27027a.m66597b(baseActivity, service, hybridSensorService);
                obj2 = hybridSensorService;
            } else {
                obj2 = objM66596a;
                obj2 = objM66596a;
                hybridSensorService = hybridSensorService2;
                obj2 = null;
            }
        }
        obj2 = objM66596a;
        if (obj2 instanceof InterfaceC43106c) {
            ((InterfaceC43106c) obj2).bind();
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // c00.InterfaceC4762i
    /* JADX INFO: renamed from: c */
    public void mo4812c(@NotNull Context ctx, @Nullable Object obj, @NotNull String service, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(Boolean.FALSE, null);
            return;
        }
        Object objM66596a = C27027a.m66596a(baseActivity, service);
        InterfaceC43106c interfaceC43106c = objM66596a instanceof InterfaceC43106c ? (InterfaceC43106c) objM66596a : null;
        if (interfaceC43106c == null) {
            callback.invoke(Boolean.FALSE, new ProtocolException("service is not alive", null, null, false, 14, null));
        } else {
            interfaceC43106c.unbind();
            callback.invoke(Boolean.TRUE, null);
        }
    }
}
