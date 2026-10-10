package com.kubi.sdk.timpush;

import android.content.Intent;
import android.os.Bundle;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.timpush.data.model.TimPushInfo;
import com.kubi.sdk.timpush.manager.KCPushManager;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TimPushService.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/timpush/TimPushService;", "", "<init>", "()V", "buildPushJumpUrl", "", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "autoBind", "", "bind", "unbind", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTimPushService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimPushService.kt\ncom/kubi/sdk/timpush/TimPushService\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,57:1\n196#2,3:58\n*S KotlinDebug\n*F\n+ 1 TimPushService.kt\ncom/kubi/sdk/timpush/TimPushService\n*L\n25#1:58,3\n*E\n"})
public final class TimPushService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TimPushService f48090a = new TimPushService();

    /* JADX INFO: renamed from: a */
    public final void m58243a() {
        KCPushManager.f48094a.m58256d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m58244b(@NotNull Intent intent, @NotNull Continuation<? super String> continuation) {
        TimPushService$buildPushJumpUrl$1 timPushService$buildPushJumpUrl$1;
        if (continuation instanceof TimPushService$buildPushJumpUrl$1) {
            timPushService$buildPushJumpUrl$1 = (TimPushService$buildPushJumpUrl$1) continuation;
            int i11 = timPushService$buildPushJumpUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                timPushService$buildPushJumpUrl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                timPushService$buildPushJumpUrl$1 = new TimPushService$buildPushJumpUrl$1(this, continuation);
            }
        } else {
            timPushService$buildPushJumpUrl$1 = new TimPushService$buildPushJumpUrl$1(this, continuation);
        }
        Object objM90914f0 = timPushService$buildPushJumpUrl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = timPushService$buildPushJumpUrl$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90914f0);
                Bundle extras = intent.getExtras();
                String strM66668h = C27041f.m66668h(extras != null ? RouteExKt.m56284y(extras, "ext") : null);
                C44128b.m97259c("KCPush", "buildPushJumpUrl extJsonString:" + strM66668h);
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new TimPushService$buildPushJumpUrl$$inlined$fromJsonOrNull$1(strM66668h, null)), C42911a.m94120b());
                timPushService$buildPushJumpUrl$1.L$0 = SpillingKt.nullOutSpilledVariable(intent);
                timPushService$buildPushJumpUrl$1.L$1 = SpillingKt.nullOutSpilledVariable(strM66668h);
                timPushService$buildPushJumpUrl$1.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
                timPushService$buildPushJumpUrl$1.L$3 = SpillingKt.nullOutSpilledVariable(strM66668h);
                timPushService$buildPushJumpUrl$1.I$0 = 0;
                timPushService$buildPushJumpUrl$1.label = 1;
                objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, timPushService$buildPushJumpUrl$1);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90914f0);
            }
            TimPushInfo timPushInfo = (TimPushInfo) objM90914f0;
            C44128b.m97259c("KCPush", "buildPushJumpUrl timPushInfo:" + timPushInfo);
            if (timPushInfo != null) {
                return timPushInfo.getUrl();
            }
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("KCPush", "buildPushJumpUrl error:" + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m58245c() {
        KCPushManager.f48094a.m58261i();
    }
}
