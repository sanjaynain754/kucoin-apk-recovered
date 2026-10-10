package com.kubi.p110rn.modules.command.impl;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.C23207R;
import com.kubi.p110rn.service.ReactApi;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import ly.C42329a;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FavCoinCommand.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.rn.modules.command.impl.FavCoinCommand$onExecute$1$1", m90122f = "FavCoinCommand.kt", m90123i = {}, m90124l = {42}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFavCoinCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCoinCommand.kt\ncom/kubi/rn/modules/command/impl/FavCoinCommand$onExecute$1$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n25#2:69\n26#2:71\n1#3:70\n*S KotlinDebug\n*F\n+ 1 FavCoinCommand.kt\ncom/kubi/rn/modules/command/impl/FavCoinCommand$onExecute$1$1\n*L\n44#1:69\n44#1:71\n44#1:70\n*E\n"})
public final class FavCoinCommand$onExecute$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42329a $this_apply;
    int label;
    final /* synthetic */ FavCoinCommand this$0;

    /* JADX INFO: renamed from: com.kubi.rn.modules.command.impl.FavCoinCommand$onExecute$1$1$1 */
    /* JADX INFO: compiled from: FavCoinCommand.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.rn.modules.command.impl.FavCoinCommand$onExecute$1$1$1", m90122f = "FavCoinCommand.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C235721 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ C42329a $this_apply;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C235721(C42329a c42329a, Continuation<? super C235721> continuation) {
            super(2, continuation);
            this.$this_apply = c42329a;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C235721(this.$this_apply, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C235721) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$this_apply.m92876a("success", true).m92877b();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavCoinCommand$onExecute$1$1(FavCoinCommand favCoinCommand, C42329a c42329a, Continuation<? super FavCoinCommand$onExecute$1$1> continuation) {
        super(2, continuation);
        this.this$0 = favCoinCommand;
        this.$this_apply = c42329a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavCoinCommand$onExecute$1$1(this.this$0, this.$this_apply, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FavCoinCommand$onExecute$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FavCoinCommand$onExecute$1$1 favCoinCommand$onExecute$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                favCoinCommand$onExecute$1$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<Object> interfaceC41634eAddFavorSymbol = ((ReactApi) C42597a.m93387c().create(ReactApi.class)).addFavorSymbol(this.this$0.getSymbol());
            C235721 c235721 = new C235721(this.$this_apply, null);
            this.label = 1;
            favCoinCommand$onExecute$1$1 = this;
            obj = RetrofitFlowExKt.m42826g(interfaceC41634eAddFavorSymbol, false, c235721, favCoinCommand$onExecute$1$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        C42329a c42329a = favCoinCommand$onExecute$1$1.$this_apply;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            if ((throwable instanceof ApiException) && Intrinsics.areEqual(((ApiException) throwable).code, "420000")) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(C23207R.string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
            }
            c42329a.m92876a("success", false).m92877b();
        }
        return Unit.INSTANCE;
    }
}
