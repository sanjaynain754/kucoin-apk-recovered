package com.kubi.futures.settings;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SettingRiskLimitFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/trade/model/AuUserCategoryVO;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.SettingRiskLimitFragment$fetchAuUserCategory$1$category$1", m90122f = "SettingRiskLimitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SettingRiskLimitFragment$fetchAuUserCategory$1$category$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AuUserCategoryVO>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public SettingRiskLimitFragment$fetchAuUserCategory$1$category$1(Continuation<? super SettingRiskLimitFragment$fetchAuUserCategory$1$category$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SettingRiskLimitFragment$fetchAuUserCategory$1$category$1 settingRiskLimitFragment$fetchAuUserCategory$1$category$1 = new SettingRiskLimitFragment$fetchAuUserCategory$1$category$1(continuation);
        settingRiskLimitFragment$fetchAuUserCategory$1$category$1.L$0 = obj;
        return settingRiskLimitFragment$fetchAuUserCategory$1$category$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AuUserCategoryVO> continuation) {
        return ((SettingRiskLimitFragment$fetchAuUserCategory$1$category$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(RepositoryServiceLocator.f19236a.m20290i().mo99993s());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return objM103844constructorimpl;
    }
}
