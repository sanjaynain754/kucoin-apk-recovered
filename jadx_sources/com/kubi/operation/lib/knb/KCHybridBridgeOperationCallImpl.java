package com.kubi.operation.lib.knb;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4759f;
import com.blankj.utilcode.util.C5258a;
import com.kubi.operation.lib.utils.LocationOnceManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeOperationLocationInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeOperationCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/operation/lib/knb/KCHybridBridgeOperationCallImpl;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeOperationCall;", "<init>", "()V", "getCurrentLocation", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeOperationLocationInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "goAppSystemSettings", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCHybridBridgeOperationCallImpl implements InterfaceC4759f {
    @Override // c00.InterfaceC4759f
    /* JADX INFO: renamed from: a */
    public void mo4805a(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LocationOnceManager.f36846a.m43642o();
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // c00.InterfaceC4759f
    /* JADX INFO: renamed from: b */
    public void mo4806b(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super KCHybridBridgeOperationLocationInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        FragmentActivity fragmentActivity = ctx instanceof FragmentActivity ? (FragmentActivity) ctx : null;
        if (fragmentActivity == null) {
            Activity activityM6125h = C5258a.m6125h();
            fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        }
        if (fragmentActivity == null) {
            callback.invoke(null, new ProtocolException("activity is null", null, null, false, 14, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(fragmentActivity).launchWhenStarted(new KCHybridBridgeOperationCallImpl$getCurrentLocation$2(fragmentActivity, callback, null));
        }
    }
}
