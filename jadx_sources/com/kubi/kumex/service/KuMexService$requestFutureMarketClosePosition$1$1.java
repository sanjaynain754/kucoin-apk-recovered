package com.kubi.kumex.service;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.trade.PositionHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KuMexService.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.service.KuMexService$requestFutureMarketClosePosition$1$1", m90122f = "KuMexService.kt", m90123i = {0, 0, 0, 0}, m90124l = {1256}, m90125m = "invokeSuspend", m90126n = {"fragment", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nKuMexService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$requestFutureMarketClosePosition$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,1241:1\n808#2,11:1242\n1#3:1253\n196#4,3:1254\n*S KotlinDebug\n*F\n+ 1 KuMexService.kt\ncom/kubi/kumex/service/KuMexService$requestFutureMarketClosePosition$1$1\n*L\n502#1:1242,11\n510#1:1254,3\n*E\n"})
public final class KuMexService$requestFutureMarketClosePosition$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $positionJson;
    final /* synthetic */ String $subUid;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KuMexService$requestFutureMarketClosePosition$1$1(Function2<? super Boolean, ? super ProtocolException, Unit> function2, String str, String str2, Continuation<? super KuMexService$requestFutureMarketClosePosition$1$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$positionJson = str;
        this.$subUid = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KuMexService$requestFutureMarketClosePosition$1$1(this.$callback, this.$positionJson, this.$subUid, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KuMexService$requestFutureMarketClosePosition$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivity;
        BaseFragment baseFragment;
        BaseFragment baseFragment2;
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                baseFragment2 = (BaseFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Activity activityM6125h = C5258a.m6125h();
            if (activityM6125h instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) activityM6125h;
            } else {
                fragmentActivity = null;
            }
            if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fragments) {
                    if (obj2 instanceof BaseFragment) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                        break;
                    }
                } while (!((BaseFragment) next).isShowing());
                baseFragment = (BaseFragment) next;
            } else {
                baseFragment = null;
            }
            if (baseFragment == null) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("-3", new RuntimeException("没有可见的界面承载"), null, false, 12, null));
                return Unit.INSTANCE;
            }
            C27099x c27099x = C27099x.f54458a;
            String str = this.$positionJson;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C16793x84c93d4(str, null)), C42911a.m94120b());
            this.L$0 = baseFragment;
            this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$2 = SpillingKt.nullOutSpilledVariable(str);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseFragment2 = baseFragment;
        }
        PositionEntity positionEntity = (PositionEntity) obj;
        if (positionEntity == null) {
            this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException("-2", new RuntimeException("仓位数据结构不合规"), null, false, 12, null));
            return Unit.INSTANCE;
        }
        PositionHelper.f30771a.m36468q(baseFragment2, positionEntity, this.$subUid, this.$callback);
        return Unit.INSTANCE;
    }
}
