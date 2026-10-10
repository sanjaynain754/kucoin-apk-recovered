package com.kubi.futures.settings;

import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SettingRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.SettingRiskLimitFragment$fetchAuUserCategory$1", m90122f = "SettingRiskLimitFragment.kt", m90123i = {}, m90124l = {144}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SettingRiskLimitFragment$fetchAuUserCategory$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SettingRiskLimitFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingRiskLimitFragment$fetchAuUserCategory$1(SettingRiskLimitFragment settingRiskLimitFragment, Continuation<? super SettingRiskLimitFragment$fetchAuUserCategory$1> continuation) {
        super(2, continuation);
        this.this$0 = settingRiskLimitFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingRiskLimitFragment$fetchAuUserCategory$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SettingRiskLimitFragment$fetchAuUserCategory$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            SettingRiskLimitFragment$fetchAuUserCategory$1$category$1 settingRiskLimitFragment$fetchAuUserCategory$1$category$1 = new SettingRiskLimitFragment$fetchAuUserCategory$1$category$1(null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94120b, settingRiskLimitFragment$fetchAuUserCategory$1$category$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AuUserCategoryVO auUserCategoryVO = (AuUserCategoryVO) obj;
        if (auUserCategoryVO == null || !auUserCategoryVO.isRetail()) {
            z11 = false;
        }
        if (z11 != this.this$0.f23215e0) {
            this.this$0.f23215e0 = z11;
            this.this$0.m25974C3();
        }
        return Unit.INSTANCE;
    }
}
