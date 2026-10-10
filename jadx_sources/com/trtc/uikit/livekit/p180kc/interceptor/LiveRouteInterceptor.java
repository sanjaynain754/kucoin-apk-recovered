package com.trtc.uikit.livekit.p180kc.interceptor;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.kubi.router.utils.RouteExKt;
import java.util.concurrent.atomic.AtomicBoolean;
import k10.DialogC40864b;
import kotlinx.coroutines.C41696j;
import ne0.C42817b;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: LiveRouteInterceptor.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "isProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "showLoadingSafely", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dialog", "Lcom/kubi/sdk/widget/loading/LoadingDialog;", "loadingShown", "dismissLoadingSafely", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor\n+ 2 LiveIssue.kt\ncom/trtc/uikit/livekit/kc/util/LiveIssueKt\n*L\n1#1,146:1\n43#2,4:147\n43#2,4:151\n*S KotlinDebug\n*F\n+ 1 LiveRouteInterceptor.kt\ncom/trtc/uikit/livekit/kc/interceptor/LiveRouteInterceptor\n*L\n132#1:147,4\n143#1:151,4\n*E\n"})
public final class LiveRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final AtomicBoolean f79167a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public final void m81533e(DialogC40864b dialogC40864b, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            try {
                dialogC40864b.m89436a(true);
            } catch (Throwable th2) {
                if (C42899b.m94075e(th2)) {
                    return;
                }
                C42817b.m93883b(th2, "LiveRouteInterceptor");
            }
        }
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        Activity activityM6125h = C5258a.m6125h();
        FragmentActivity fragmentActivity = activityM6125h instanceof FragmentActivity ? (FragmentActivity) activityM6125h : null;
        if (fragmentActivity != null && !fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed()) {
            if (!this.f79167a.compareAndSet(false, true)) {
                C44128b.m97259c("Live", "LiveRoom entrance is being processed, ignore duplicate click");
                return true;
            }
            Bundle bundle = postcard.getBundle();
            String strM56285z = RouteExKt.m56285z(bundle, "roomId", "");
            String strM56285z2 = RouteExKt.m56285z(bundle, "roomTxUserId", "");
            Intrinsics.checkNotNull(strM56285z);
            if (!StringsKt.isBlank(strM56285z)) {
                Intrinsics.checkNotNull(strM56285z2);
                if (!StringsKt.isBlank(strM56285z2)) {
                    String strM56285z3 = RouteExKt.m56285z(bundle, "source", "");
                    String strM56285z4 = RouteExKt.m56285z(bundle, "fromInviteOpenId", "");
                    C44128b.m97259c("Live", "roomId:" + strM56285z + ",roomOwnerId:" + strM56285z2 + ",fromInviteOpenId" + strM56285z4 + ",source:" + strM56285z3);
                    C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new LiveRouteInterceptor$intercept$1(new Ref.ObjectRef(), this, fragmentActivity, new AtomicBoolean(false), strM56285z, strM56285z2, strM56285z3, strM56285z4, null), 3, null);
                    return true;
                }
            }
            this.f79167a.set(false);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m81534f(FragmentActivity fragmentActivity, DialogC40864b dialogC40864b, AtomicBoolean atomicBoolean) {
        if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed() && atomicBoolean.compareAndSet(false, true)) {
            try {
                dialogC40864b.show();
            } catch (Throwable th2) {
                atomicBoolean.set(false);
                if (!C42899b.m94075e(th2)) {
                    C42817b.m93883b(th2, "LiveRouteInterceptor");
                }
            }
        }
    }
}
