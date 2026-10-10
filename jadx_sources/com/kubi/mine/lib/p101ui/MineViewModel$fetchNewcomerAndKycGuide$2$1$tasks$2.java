package com.kubi.mine.lib.p101ui;

import com.kubi.clean.api.entity.AutoCleanBizType;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.mine.lib.service.MineDepend;
import java.util.Collection;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2", m90122f = "MineViewModel.kt", m90123i = {}, m90124l = {131}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super IPLimitConfig>, Object> {
    int label;

    public MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2(Continuation<? super MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super IPLimitConfig> continuation) {
        return ((MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Collection collectionValues;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MineDepend mineDepend = MineDepend.f35159a;
            if (mineDepend.m41829h()) {
                IAutoCleanService iAutoCleanServiceM41823b = mineDepend.m41823b();
                AutoCleanBizType[] autoCleanBizTypeArr = {AutoCleanBizType.FORCE_KYC_MESSAGE, AutoCleanBizType.IP_TOP_MESSAGE, AutoCleanBizType.CLEARANCE_MESSAGE};
                this.label = 1;
                obj = iAutoCleanServiceM41823b.mo20405e(autoCleanBizTypeArr, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        Map map = (Map) obj;
        if (map != null && (collectionValues = map.values()) != null) {
            return (IPLimitConfig) CollectionsKt.firstOrNull(collectionValues);
        }
        return null;
    }
}
