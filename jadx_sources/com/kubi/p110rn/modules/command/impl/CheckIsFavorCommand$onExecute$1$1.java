package com.kubi.p110rn.modules.command.impl;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.service.ReactApi;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import ly.C42329a;
import mr.C42597a;
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

/* JADX INFO: compiled from: CheckIsFavorCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.rn.modules.command.impl.CheckIsFavorCommand$onExecute$1$1", m90122f = "CheckIsFavorCommand.kt", m90123i = {}, m90124l = {39}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCheckIsFavorCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckIsFavorCommand.kt\ncom/kubi/rn/modules/command/impl/CheckIsFavorCommand$onExecute$1$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n25#2:62\n26#2:64\n1#3:63\n*S KotlinDebug\n*F\n+ 1 CheckIsFavorCommand.kt\ncom/kubi/rn/modules/command/impl/CheckIsFavorCommand$onExecute$1$1\n*L\n48#1:62\n48#1:64\n48#1:63\n*E\n"})
public final class CheckIsFavorCommand$onExecute$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42329a $this_apply;
    int label;
    final /* synthetic */ CheckIsFavorCommand this$0;

    /* JADX INFO: renamed from: com.kubi.rn.modules.command.impl.CheckIsFavorCommand$onExecute$1$1$1 */
    /* JADX INFO: compiled from: CheckIsFavorCommand.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "list", "", "Lcom/kubi/data/entity/TradeItemBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.modules.command.impl.CheckIsFavorCommand$onExecute$1$1$1", m90122f = "CheckIsFavorCommand.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCheckIsFavorCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckIsFavorCommand.kt\ncom/kubi/rn/modules/command/impl/CheckIsFavorCommand$onExecute$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class C235711 extends SuspendLambda implements Function2<List<? extends TradeItemBean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ C42329a $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CheckIsFavorCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C235711(C42329a c42329a, CheckIsFavorCommand checkIsFavorCommand, Continuation<? super C235711> continuation) {
            super(2, continuation);
            this.$this_apply = c42329a;
            this.this$0 = checkIsFavorCommand;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C235711 c235711 = new C235711(this.$this_apply, this.this$0, continuation);
            c235711.L$0 = obj;
            return c235711;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends TradeItemBean> list, Continuation<? super Unit> continuation) {
            return ((C235711) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CheckIsFavorCommand checkIsFavorCommand = this.this$0;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(checkIsFavorCommand.getSymbol(), ((TradeItemBean) next).getSymbol()));
            C42329a c42329a = this.$this_apply;
            if (((TradeItemBean) next) == null) {
                c42329a.m92876a(CheckIsFavorCommand.KEY_IS_FAV, false);
            } else {
                c42329a.m92876a(CheckIsFavorCommand.KEY_IS_FAV, true);
            }
            this.$this_apply.m92876a("success", true).m92877b();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckIsFavorCommand$onExecute$1$1(C42329a c42329a, CheckIsFavorCommand checkIsFavorCommand, Continuation<? super CheckIsFavorCommand$onExecute$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = c42329a;
        this.this$0 = checkIsFavorCommand;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckIsFavorCommand$onExecute$1$1(this.$this_apply, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CheckIsFavorCommand$onExecute$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CheckIsFavorCommand$onExecute$1$1 checkIsFavorCommand$onExecute$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                checkIsFavorCommand$onExecute$1$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e marketSymbol$default = ReactApi.getMarketSymbol$default((ReactApi) C42597a.m93387c().create(ReactApi.class), "favor", null, 2, null);
            C235711 c235711 = new C235711(this.$this_apply, this.this$0, null);
            this.label = 1;
            checkIsFavorCommand$onExecute$1$1 = this;
            obj = RetrofitFlowExKt.m42824e(marketSymbol$default, false, c235711, checkIsFavorCommand$onExecute$1$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C42329a c42329a = checkIsFavorCommand$onExecute$1$1.$this_apply;
        if (((C19334f) obj).getThrowable() != null) {
            c42329a.m92876a("success", true).m92876a(CheckIsFavorCommand.KEY_IS_FAV, false).m92877b();
        }
        return Unit.INSTANCE;
    }
}
