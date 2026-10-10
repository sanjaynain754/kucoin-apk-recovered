package com.kubi.assets.detail;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailFreezeEntity;
import com.kubi.assets.entity.FreezeData;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.utils.ToastCompat;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
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

/* JADX INFO: compiled from: BaseAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.detail.BaseAccountDetailFragment$loadFreezeReasonData$1", m90122f = "BaseAccountDetailFragment.kt", m90123i = {}, m90124l = {399}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BaseAccountDetailFragment$loadFreezeReasonData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ShapeImageView $ivArrow;
    int label;
    final /* synthetic */ BaseAccountDetailFragment<T> this$0;

    /* JADX INFO: renamed from: com.kubi.assets.detail.BaseAccountDetailFragment$loadFreezeReasonData$1$1 */
    /* JADX INFO: compiled from: BaseAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AccountDetailFreezeEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.detail.BaseAccountDetailFragment$loadFreezeReasonData$1$1", m90122f = "BaseAccountDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C96781 extends SuspendLambda implements Function2<AccountDetailFreezeEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ ShapeImageView $ivArrow;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseAccountDetailFragment<T> this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AccountDetailFreezeEntity accountDetailFreezeEntity, Continuation<? super Unit> continuation) {
            return ((C96781) create(accountDetailFreezeEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C96781(BaseAccountDetailFragment<T> baseAccountDetailFragment, ShapeImageView shapeImageView, Continuation<? super C96781> continuation) {
            super(2, continuation);
            this.this$0 = baseAccountDetailFragment;
            this.$ivArrow = shapeImageView;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96781 c96781 = new C96781(this.this$0, this.$ivArrow, continuation);
            c96781.L$0 = obj;
            return c96781;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<FreezeData> tradeFreeze;
            List<FreezeData> p2pFreeze;
            List<FreezeData> greyMarketFreeze;
            List<FreezeData> gemPoolList;
            AccountDetailFreezeEntity accountDetailFreezeEntity = (AccountDetailFreezeEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<FreezeData> withdrawFreeze = accountDetailFreezeEntity.getWithdrawFreeze();
            if ((withdrawFreeze == null || !(!withdrawFreeze.isEmpty())) && (((tradeFreeze = accountDetailFreezeEntity.getTradeFreeze()) == null || !(!tradeFreeze.isEmpty())) && accountDetailFreezeEntity.getProjectFreeze() == null && (((p2pFreeze = accountDetailFreezeEntity.getP2pFreeze()) == null || !(!p2pFreeze.isEmpty())) && (((greyMarketFreeze = accountDetailFreezeEntity.getGreyMarketFreeze()) == null || !(!greyMarketFreeze.isEmpty())) && ((gemPoolList = accountDetailFreezeEntity.getGemPoolList()) == null || !(!gemPoolList.isEmpty())))))) {
                ToastCompat.m66465z(R$string.asset_freeze_prompt);
            } else {
                AccountDetailFreezeDialog.Companion companion = AccountDetailFreezeDialog.f16849c0;
                String strMo15911c4 = this.this$0.mo15911c4();
                CoinInfoEntity coinInfoEntityM15914h4 = this.this$0.m15914h4();
                AccountDetailFreezeDialog accountDetailFreezeDialogNewInstance = companion.newInstance(strMo15911c4, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCurrency() : null, accountDetailFreezeEntity);
                final BaseAccountDetailFragment<T> baseAccountDetailFragment = this.this$0;
                final ShapeImageView shapeImageView = this.$ivArrow;
                BaseDialogFragment baseDialogFragmentM54192r3 = accountDetailFreezeDialogNewInstance.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.detail.u
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BaseAccountDetailFragment$loadFreezeReasonData$1.C96781.m15938f(baseAccountDetailFragment, shapeImageView, dialogInterface);
                    }
                });
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogFragmentM54192r3.show(childFragmentManager, this.this$0.mo15911c4());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m15938f(BaseAccountDetailFragment baseAccountDetailFragment, ShapeImageView shapeImageView, DialogInterface dialogInterface) {
            Boolean bool;
            boolean zBooleanValue;
            Boolean boolValueOf;
            Object tag = shapeImageView.getTag();
            Boolean bool2 = null;
            if (tag instanceof Boolean) {
                bool = (Boolean) tag;
            } else {
                bool = null;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            baseAccountDetailFragment.m15909K4(shapeImageView, zBooleanValue);
            Object tag2 = shapeImageView.getTag();
            if (tag2 instanceof Boolean) {
                bool2 = (Boolean) tag2;
            }
            if (bool2 != null) {
                boolValueOf = Boolean.valueOf(!bool2.booleanValue());
            } else {
                boolValueOf = Boolean.TRUE;
            }
            shapeImageView.setTag(boolValueOf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAccountDetailFragment$loadFreezeReasonData$1(BaseAccountDetailFragment<T> baseAccountDetailFragment, ShapeImageView shapeImageView, Continuation<? super BaseAccountDetailFragment$loadFreezeReasonData$1> continuation) {
        super(2, continuation);
        this.this$0 = baseAccountDetailFragment;
        this.$ivArrow = shapeImageView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAccountDetailFragment$loadFreezeReasonData$1(this.this$0, this.$ivArrow, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseAccountDetailFragment$loadFreezeReasonData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String code;
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
            AssetV2Api assetV2Api = (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
            CoinInfoEntity coinInfoEntityM15914h4 = this.this$0.m15914h4();
            if (coinInfoEntityM15914h4 != null) {
                code = coinInfoEntityM15914h4.getCode();
            } else {
                code = null;
            }
            if (code == null) {
                code = "";
            }
            InterfaceC41634e<AccountDetailFreezeEntity> interfaceC41634eM17080E = assetV2Api.m17080E(code, this.this$0.mo15911c4());
            C96781 c96781 = new C96781(this.this$0, this.$ivArrow, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM17080E, false, c96781, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
