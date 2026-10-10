package com.kubi.spot.kline;

import com.blankj.utilcode.util.C5286o;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.spot.R$id;
import com.kubi.spot.kline.flutter.SpotFlutterKlineFragment;
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
import w20.C45700a;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.kline.KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1", m90122f = "KuCoinKlineFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,187:1\n234#2,3:188\n237#2,11:192\n249#2:210\n1#3:191\n43#4,7:203\n*S KotlinDebug\n*F\n+ 1 KuCoinKlineFragment.kt\ncom/kubi/spot/kline/KuCoinKlineFragment\n*L\n247#1:203,7\n*E\n"})
public final class KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuCoinKlineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1(String str, Continuation continuation, KuCoinKlineFragment kuCoinKlineFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuCoinKlineFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1 kuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1 = new KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        kuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1.L$0 = obj;
        return kuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((KuCoinKlineFragment$onViewCreated$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                try {
                    SpotFlutterKlineFragment spotFlutterKlineFragment = null;
                    if (CallAuctionSwitch.m21636i(CallAuctionSwitch.f20317a, false, 1, null)) {
                        SpotFlutterKlineFragment spotFlutterKlineFragmentM61964o4 = this.this$0.m61964o4();
                        if (spotFlutterKlineFragmentM61964o4 != null) {
                            if (spotFlutterKlineFragmentM61964o4.isAdded()) {
                                spotFlutterKlineFragment = spotFlutterKlineFragmentM61964o4;
                            }
                            if (spotFlutterKlineFragment != null) {
                                C5286o.m6325i(spotFlutterKlineFragment);
                            }
                        }
                    } else {
                        SpotFlutterKlineFragment spotFlutterKlineFragment2 = (SpotFlutterKlineFragment) this.this$0.f50623Y.getValue();
                        C5286o.m6317a(this.this$0.getChildFragmentManager(), spotFlutterKlineFragment2, R$id.fl_container);
                        C5286o.m6329m(spotFlutterKlineFragment2);
                    }
                } catch (Exception e11) {
                    C45700a.m100877c(e11, "KuCoinKlineFragment");
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
