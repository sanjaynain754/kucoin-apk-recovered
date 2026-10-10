package com.kubi.market.monitor.lib.startup;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import ky.InterfaceC42005d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketMonitorMainActivityLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/startup/MarketMonitorMainActivityLifecycle;", "Lcom/kubi/sdk/delegate/IActivityLifecycle;", "<init>", "()V", "onActivityPostCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketMonitorMainActivityLifecycle implements InterfaceC42005d {

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.startup.MarketMonitorMainActivityLifecycle$onActivityPostCreated$1 */
    /* JADX INFO: compiled from: MarketMonitorMainActivityLifecycle.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.market.monitor.lib.startup.MarketMonitorMainActivityLifecycle$onActivityPostCreated$1", m90122f = "MarketMonitorMainActivityLifecycle.kt", m90123i = {}, m90124l = {31}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C185971 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C185971(Continuation<? super C185971> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C185971(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C185971) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m90350b(3000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            FloatingActionManager.f34540a.m41337K0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ky.InterfaceC42005d
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityPostCreated(activity, savedInstanceState);
        if ((activity instanceof IMainActivity) && (activity instanceof FragmentActivity)) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), null, null, new C185971(null), 3, null);
        }
    }
}
