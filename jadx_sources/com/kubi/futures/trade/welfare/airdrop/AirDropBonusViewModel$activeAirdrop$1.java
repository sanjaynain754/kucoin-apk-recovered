package com.kubi.futures.trade.welfare.airdrop;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.network.retrofit.exception.ApiException;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AirDropBonusDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.airdrop.AirDropBonusViewModel$activeAirdrop$1", m90122f = "AirDropBonusDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AirDropBonusViewModel$activeAirdrop$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ String $side;
    int label;
    final /* synthetic */ AirDropBonusViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirDropBonusViewModel$activeAirdrop$1(AirDropBonusViewModel airDropBonusViewModel, String str, String str2, Continuation<? super AirDropBonusViewModel$activeAirdrop$1> continuation) {
        super(2, continuation);
        this.this$0 = airDropBonusViewModel;
        this.$code = str;
        this.$side = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AirDropBonusViewModel$activeAirdrop$1(this.this$0, this.$code, this.$side, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AirDropBonusViewModel$activeAirdrop$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity;
        List<FuturesWelfareTrialItemEntity> items;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
                FuturesWelfareTrialEntity futuresWelfareTrialEntityMo100558f = repositoryServiceLocator.m20292k().mo100558f("ACTIVATE_FINISHED", 1, 10, "ALL");
                if (futuresWelfareTrialEntityMo100558f != null && (items = futuresWelfareTrialEntityMo100558f.getItems()) != null) {
                    futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) CollectionsKt.firstOrNull((List) items);
                } else {
                    futuresWelfareTrialItemEntity = null;
                }
                if (futuresWelfareTrialItemEntity != null && futuresWelfareTrialItemEntity.isTradeProTrial()) {
                    this.this$0.m28330B().postValue(Boxing.boxBoolean(false));
                    this.this$0.m28334y().postValue(new Pair<>(Boxing.boxBoolean(false), futuresWelfareTrialItemEntity));
                    return Unit.INSTANCE;
                }
                repositoryServiceLocator.m20292k().mo100571z(this.$code, this.$side);
                this.this$0.m28330B().postValue(Boxing.boxBoolean(false));
                this.this$0.m28334y().postValue(new Pair<>(Boxing.boxBoolean(true), null));
                return Unit.INSTANCE;
            } catch (ApiException e11) {
                this.this$0.m28330B().postValue(Boxing.boxBoolean(false));
                this.this$0.m28334y().postValue(new Pair<>(Boxing.boxBoolean(false), null));
                this.this$0.m28332v(e11);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
