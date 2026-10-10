package com.kubi.kucoin.quote.market;

import androidx.fragment.app.Fragment;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.spot.quote.market.info.MarketCoinInfoFragment;
import com.kubi.spot.service.SpotDepend;
import java.util.Iterator;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import t20.C44630b;

/* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$initListener$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.quote.market.KuCoinMarketActivity$initListener$$inlined$bindFlowEvent$default$1", m90122f = "KuCoinMarketActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n510#2:188\n511#2,2:196\n514#2,4:205\n360#3,7:189\n360#3,7:198\n*S KotlinDebug\n*F\n+ 1 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n*L\n510#1:189,7\n512#1:198,7\n*E\n"})
public final class C15547xba400f3e extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuCoinMarketActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15547xba400f3e(String str, Continuation continuation, KuCoinMarketActivity kuCoinMarketActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuCoinMarketActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C15547xba400f3e c15547xba400f3e = new C15547xba400f3e(this.$key, continuation, this.this$0);
        c15547xba400f3e.L$0 = obj;
        return c15547xba400f3e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C15547xba400f3e) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C44630b c44630bM32811W1;
        SlidingTabLayout slidingTabLayout;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                Iterator it = this.this$0.f28317A.iterator();
                int i11 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((Fragment) it.next()) instanceof MarketCoinInfoFragment) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    Iterator it2 = this.this$0.f28317A.iterator();
                    while (it2.hasNext()) {
                        if (SpotDepend.f51244a.m63033c().mo37961t0((Fragment) it2.next())) {
                            break;
                        }
                    }
                }
                if (i11 != -1 && (c44630bM32811W1 = this.this$0.m32811W1()) != null && (slidingTabLayout = c44630bM32811W1.f98969k) != null) {
                    slidingTabLayout.setCurrentTab(i11);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
