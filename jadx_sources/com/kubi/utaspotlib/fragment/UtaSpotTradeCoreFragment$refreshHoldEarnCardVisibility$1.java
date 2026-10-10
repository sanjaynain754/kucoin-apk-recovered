package com.kubi.utaspotlib.fragment;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.HoldEarnCardHelper;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
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
import q70.C43655b;
import y70.StorageId;

/* JADX INFO: compiled from: UtaSpotTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1", m90122f = "UtaSpotTradeCoreFragment.kt", m90123i = {}, m90124l = {229}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ StorageId<Long> $storageId;
    int label;
    final /* synthetic */ UtaSpotTradeCoreFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1(UtaSpotTradeCoreFragment utaSpotTradeCoreFragment, StorageId<Long> storageId, Continuation<? super UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1> continuation) {
        super(2, continuation);
        this.this$0 = utaSpotTradeCoreFragment;
        this.$storageId = storageId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m66211f(StorageId storageId) {
        HoldEarnCardHelper.INSTANCE.recordDismiss(storageId);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1(this.this$0, this.$storageId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HoldEarnInfoEntity holdEarnInfoEntity;
        HoldingEarnEntryCardView holdingEarnEntryCardView;
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
            if (!this.this$0.isAdded() && this.this$0.getView() != null) {
                C43655b c43655bM66206S3 = this.this$0.m66206S3();
                if (c43655bM66206S3 != null && (holdingEarnEntryCardView = c43655bM66206S3.f96348g) != null) {
                    if (holdEarnInfoEntity != null && HoldEarnCardHelper.INSTANCE.shouldShow(this.$storageId)) {
                        holdingEarnEntryCardView.setPageId(this.this$0.getF34298V());
                        String typePhrases = holdEarnInfoEntity.getTypePhrases();
                        String str = "";
                        if (typePhrases == null) {
                            typePhrases = "";
                        }
                        holdingEarnEntryCardView.setTitleText(typePhrases);
                        String phrases = holdEarnInfoEntity.getPhrases();
                        if (phrases == null) {
                            phrases = "";
                        }
                        holdingEarnEntryCardView.setDescText(phrases);
                        String buttonName = holdEarnInfoEntity.getButtonName();
                        if (buttonName != null) {
                            str = buttonName;
                        }
                        holdingEarnEntryCardView.setInterestRateText(str);
                        holdingEarnEntryCardView.setVisibility(0);
                        final StorageId<Long> storageId = this.$storageId;
                        holdingEarnEntryCardView.setOnCloseClickListener(new Function0() { // from class: com.kubi.utaspotlib.fragment.c
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1.m66211f(storageId);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    holdingEarnEntryCardView.setVisibility(8);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        holdEarnInfoEntity = (HoldEarnInfoEntity) obj;
        if (!this.this$0.isAdded()) {
        }
        return Unit.INSTANCE;
    }
}
