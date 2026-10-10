package com.kubi.mine.lib.p101ui;

import com.kubi.mine.R$string;
import com.kubi.user.model.LoginUserEntity;
import gq.C37992m;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: MineFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineFragment$updateInfo$4$4", m90122f = "MineFragment.kt", m90123i = {0}, m90124l = {1030}, m90125m = "invokeSuspend", m90126n = {"formatDiscountRate"}, m90127s = {"L$0"})
public final class MineFragment$updateInfo$4$4 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C37992m $binding;
    final /* synthetic */ LoginUserEntity $loginUserEntity;
    Object L$0;
    int label;
    final /* synthetic */ MineFragment this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.MineFragment$updateInfo$4$4$1 */
    /* JADX INFO: compiled from: MineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineFragment$updateInfo$4$4$1", m90122f = "MineFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C190231 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C37992m $binding;
        final /* synthetic */ String $formatDiscountRate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190231(C37992m c37992m, String str, Continuation<? super C190231> continuation) {
            super(2, continuation);
            this.$binding = c37992m;
            this.$formatDiscountRate = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190231(this.$binding, this.$formatDiscountRate, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C190231) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$binding.f85552y.setText(this.$formatDiscountRate);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineFragment$updateInfo$4$4(MineFragment mineFragment, LoginUserEntity loginUserEntity, C37992m c37992m, Continuation<? super MineFragment$updateInfo$4$4> continuation) {
        super(2, continuation);
        this.this$0 = mineFragment;
        this.$loginUserEntity = loginUserEntity;
        this.$binding = c37992m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineFragment$updateInfo$4$4(this.this$0, this.$loginUserEntity, this.$binding, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MineFragment$updateInfo$4$4) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String string = this.this$0.getString(R$string.kcs_trade_fee_gift, this.$loginUserEntity.getFormatDiscountRate() + '%');
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                C190231 c190231 = new C190231(this.$binding, string, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(string);
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, c190231, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
        return Unit.INSTANCE;
    }
}
