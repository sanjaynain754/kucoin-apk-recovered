package com.kubi.assets.unify.detail;

import com.kubi.assets.AssetV2Api;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import gf.C37890n;
import kotlinx.coroutines.InterfaceC41709m0;
import p365jb.UnifiedAccountDetailUiData;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UnifiedDetailVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.detail.UnifiedDetailVM$fetchAccountDetail$1", m90122f = "UnifiedDetailVM.kt", m90123i = {0, 0, 0, 0}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "coinEntityByCode", "$this$invokeSuspend_u24lambda_u241", "$i$a$-runCatching-UnifiedDetailVM$fetchAccountDetail$1$isShowCFlashTrade$1"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
public final class UnifiedDetailVM$fetchAccountDetail$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ Integer $collateralStatus;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UnifiedDetailVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedDetailVM$fetchAccountDetail$1(String str, UnifiedDetailVM unifiedDetailVM, Integer num, Continuation<? super UnifiedDetailVM$fetchAccountDetail$1> continuation) {
        super(2, continuation);
        this.$code = str;
        this.this$0 = unifiedDetailVM;
        this.$collateralStatus = num;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifiedDetailVM$fetchAccountDetail$1 unifiedDetailVM$fetchAccountDetail$1 = new UnifiedDetailVM$fetchAccountDetail$1(this.$code, this.this$0, this.$collateralStatus, continuation);
        unifiedDetailVM$fetchAccountDetail$1.L$0 = obj;
        return unifiedDetailVM$fetchAccountDetail$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifiedDetailVM$fetchAccountDetail$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoinInfoEntity coinInfoEntity;
        Object objM17078D0;
        Object objM103844constructorimpl;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        boolean z11 = false;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$code;
            if (str == null) {
                return Unit.INSTANCE;
            }
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(str);
            if (coinInfoEntityM85613u == null) {
                coinInfoEntityM85613u = new CoinInfoEntity();
                String str2 = this.$code;
                coinInfoEntityM85613u.setCode(str2);
                coinInfoEntityM85613u.setCurrency(str2);
            }
            UnifiedDetailVM unifiedDetailVM = this.this$0;
            String str3 = this.$code;
            try {
                Result.Companion companion = Result.INSTANCE;
                AssetV2Api assetV2ApiM19841F = unifiedDetailVM.m19841F();
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = coinInfoEntityM85613u;
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                objM17078D0 = assetV2ApiM19841F.m17078D0(str3, this);
                if (objM17078D0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coinInfoEntity = coinInfoEntityM85613u;
            } catch (Throwable th2) {
                th = th2;
                coinInfoEntity = coinInfoEntityM85613u;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coinInfoEntity = (CoinInfoEntity) this.L$1;
            try {
                ResultKt.throwOnFailure(obj);
                objM17078D0 = obj;
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        }
        BaseEntity baseEntity = (BaseEntity) objM17078D0;
        if (baseEntity.getSuccess() && ((Boolean) baseEntity.getData()).booleanValue()) {
            z11 = true;
        }
        objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxBoolean(z11));
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Boolean bool = (Boolean) objM103844constructorimpl;
        this.this$0.f18968X.setValue(this.this$0.m19847U(coinInfoEntity, bool));
        this.this$0.f18970Z.setValue(new UnifiedAccountDetailUiData(this.$code, coinInfoEntity.getIconUrl(), coinInfoEntity.getName(), null, null, null, null, null, this.$collateralStatus, coinInfoEntity.getCurrency(), 248, null));
        this.this$0.m19843H(coinInfoEntity, bool);
        this.this$0.m19844M(coinInfoEntity);
        return Unit.INSTANCE;
    }
}
