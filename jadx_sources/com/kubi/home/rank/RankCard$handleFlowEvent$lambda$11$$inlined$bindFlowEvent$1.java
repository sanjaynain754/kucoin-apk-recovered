package com.kubi.home.rank;

import android.widget.LinearLayout;
import com.kubi.home.common.p086ex.ViewExKt;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
import fj.C37522h0;
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

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.rank.RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1", m90122f = "RankCard.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 RankCard.kt\ncom/kubi/home/rank/RankCard\n*L\n1#1,187:1\n126#2,6:188\n*E\n"})
public final class RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RankCard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1(String str, Continuation continuation, RankCard rankCard) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = rankCard;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1 rankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1 = new RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        rankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1.L$0 = obj;
        return rankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((RankCard$handleFlowEvent$lambda$11$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LinearLayout linearLayout;
        C37522h0 c37522h0M29832l3;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                C37522h0 c37522h0M29832l4 = this.this$0.m29832l3();
                if (c37522h0M29832l4 != null && (linearLayout4 = c37522h0M29832l4.f83321l) != null) {
                    ViewExKt.m29091b(linearLayout4);
                }
                C37522h0 c37522h0M29832l5 = this.this$0.m29832l3();
                if (c37522h0M29832l5 != null && (linearLayout3 = c37522h0M29832l5.f83321l) != null) {
                    linearLayout3.setPadding(C27040e.m66658b(12), 0, 0, 0);
                }
                C37522h0 c37522h0M29832l6 = this.this$0.m29832l3();
                if (c37522h0M29832l6 != null && (linearLayout = c37522h0M29832l6.f83321l) != null && ViewExtKt.m66581l(linearLayout) && (c37522h0M29832l3 = this.this$0.m29832l3()) != null && (linearLayout2 = c37522h0M29832l3.f83312c) != null) {
                    ViewExtKt.m66594y(linearLayout2);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
