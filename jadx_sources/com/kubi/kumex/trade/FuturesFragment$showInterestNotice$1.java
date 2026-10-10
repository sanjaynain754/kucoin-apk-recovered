package com.kubi.kumex.trade;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.HoldEarnCardHelper;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.futures.view.FuturesTraderProChallengeView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.core.ViewExtKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: compiled from: FuturesFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.trade.FuturesFragment$showInterestNotice$1", m90122f = "FuturesFragment.kt", m90123i = {}, m90124l = {1415}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFuturesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$showInterestNotice$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,2545:1\n254#2:2546\n*S KotlinDebug\n*F\n+ 1 FuturesFragment.kt\ncom/kubi/kumex/trade/FuturesFragment$showInterestNotice$1\n*L\n1421#1:2546\n*E\n"})
public final class FuturesFragment$showInterestNotice$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ HoldingEarnEntryCardView $noticeLayout;
    int label;
    final /* synthetic */ FuturesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesFragment$showInterestNotice$1(HoldingEarnEntryCardView holdingEarnEntryCardView, FuturesFragment futuresFragment, Continuation<? super FuturesFragment$showInterestNotice$1> continuation) {
        super(2, continuation);
        this.$noticeLayout = holdingEarnEntryCardView;
        this.this$0 = futuresFragment;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m36209f(StorageId storageId) {
        HoldEarnCardHelper.INSTANCE.recordDismiss(storageId);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesFragment$showInterestNotice$1(this.$noticeLayout, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesFragment$showInterestNotice$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HoldEarnInfoEntity holdEarnInfoEntity;
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
            IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
            if (iAssetsCenterService != null) {
                this.label = 1;
                obj = iAssetsCenterService.mo15353s(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                holdEarnInfoEntity = null;
            }
            HoldEarnCardHelper holdEarnCardHelper = HoldEarnCardHelper.INSTANCE;
            final StorageId<Long> storageIdFuturesStorageId = holdEarnCardHelper.futuresStorageId(UserInfo.a.i());
            if (holdEarnInfoEntity == null && holdEarnCardHelper.shouldShow(storageIdFuturesStorageId)) {
                FuturesTraderProChallengeView futuresTraderProChallengeView = (FuturesTraderProChallengeView) this.this$0.findViewById(R$id.traderProChallengeView);
                if (futuresTraderProChallengeView != null && futuresTraderProChallengeView.getVisibility() == 0) {
                    ViewExtKt.m66577h(this.$noticeLayout);
                    return Unit.INSTANCE;
                }
                this.$noticeLayout.setPageId(this.this$0.getF34288V());
                this.$noticeLayout.m54529g();
                HoldingEarnEntryCardView holdingEarnEntryCardView = this.$noticeLayout;
                String typePhrases = holdEarnInfoEntity.getTypePhrases();
                String str = "";
                if (typePhrases == null) {
                    typePhrases = "";
                }
                holdingEarnEntryCardView.setTitleText(typePhrases);
                HoldingEarnEntryCardView holdingEarnEntryCardView2 = this.$noticeLayout;
                String phrases = holdEarnInfoEntity.getPhrases();
                if (phrases == null) {
                    phrases = "";
                }
                holdingEarnEntryCardView2.setDescText(phrases);
                HoldingEarnEntryCardView holdingEarnEntryCardView3 = this.$noticeLayout;
                String buttonName = holdEarnInfoEntity.getButtonName();
                if (buttonName != null) {
                    str = buttonName;
                }
                holdingEarnEntryCardView3.setInterestRateText(str);
                this.$noticeLayout.setVisibility(0);
                this.$noticeLayout.setOnCloseClickListener(new Function0() { // from class: com.kubi.kumex.trade.j3
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesFragment$showInterestNotice$1.m36209f(storageIdFuturesStorageId);
                    }
                });
                return Unit.INSTANCE;
            }
            this.$noticeLayout.setVisibility(8);
            return Unit.INSTANCE;
        }
        holdEarnInfoEntity = (HoldEarnInfoEntity) obj;
        HoldEarnCardHelper holdEarnCardHelper2 = HoldEarnCardHelper.INSTANCE;
        final StorageId storageIdFuturesStorageId2 = holdEarnCardHelper2.futuresStorageId(UserInfo.a.i());
        if (holdEarnInfoEntity == null) {
        }
        this.$noticeLayout.setVisibility(8);
        return Unit.INSTANCE;
    }
}
