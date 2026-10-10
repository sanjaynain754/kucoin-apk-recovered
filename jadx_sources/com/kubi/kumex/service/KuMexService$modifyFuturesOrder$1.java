package com.kubi.kumex.service;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.futures.trade.order.modify.BaseModifyOrderDialog;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42917g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KuMexService.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.service.KuMexService$modifyFuturesOrder$1", m90122f = "KuMexService.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKuMexService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$modifyFuturesOrder$1\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1241:1\n19#2,2:1242\n1#3:1244\n*S KotlinDebug\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$modifyFuturesOrder$1\n*L\n666#1:1242,2\n*E\n"})
public final class KuMexService$modifyFuturesOrder$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ OrderEntity $order;
    final /* synthetic */ String $targetPrice;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KuMexService$modifyFuturesOrder$1(OrderEntity orderEntity, String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KuMexService$modifyFuturesOrder$1> continuation) {
        super(2, continuation);
        this.$order = orderEntity;
        this.$targetPrice = str;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: f */
    public static final void m35898f(Activity activity, OrderEntity orderEntity, String str, Function2 function2) {
        Object next;
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Fragment) next) instanceof BaseModifyOrderDialog));
        if (((Fragment) next) == null) {
            BaseModifyOrderDialog.Companion companion = BaseModifyOrderDialog.f23879x0;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            companion.show(supportFragmentManager, orderEntity, DowngradeExKt.m66536f(str), function2);
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuMexService$modifyFuturesOrder$1(this.$order, this.$targetPrice, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuMexService$modifyFuturesOrder$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            final Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h != null) {
                final OrderEntity orderEntity = this.$order;
                final String str = this.$targetPrice;
                final Function2<Boolean, ProtocolException, Unit> function2 = this.$callback;
                if (activityM6125h instanceof FragmentActivity) {
                    C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kumex.service.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            KuMexService$modifyFuturesOrder$1.m35898f(activityM6125h, orderEntity, str, function2);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
