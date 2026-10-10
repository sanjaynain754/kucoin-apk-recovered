package com.kubi.assets.history;

import androidx.fragment.app.FragmentManager;
import com.kubi.assets.dialog.AssetHelperDialog;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.WithdrawHintInfoEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: InOutDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.history.InOutDetailFragment$loadWithdrawKcsRewardTip$2$1", m90122f = "InOutDetailFragment.kt", m90123i = {}, m90124l = {551}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nInOutDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InOutDetailFragment.kt\ncom/kubi/assets/history/InOutDetailFragment$loadWithdrawKcsRewardTip$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n1#2:670\n*E\n"})
public final class InOutDetailFragment$loadWithdrawKcsRewardTip$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ HistoryRecordEntity $hisRecord;
    final /* synthetic */ Ref.ObjectRef<WithdrawHintInfoEntity> $result;
    int label;
    final /* synthetic */ InOutDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InOutDetailFragment$loadWithdrawKcsRewardTip$2$1(Ref.ObjectRef<WithdrawHintInfoEntity> objectRef, InOutDetailFragment inOutDetailFragment, HistoryRecordEntity historyRecordEntity, Continuation<? super InOutDetailFragment$loadWithdrawKcsRewardTip$2$1> continuation) {
        super(2, continuation);
        this.$result = objectRef;
        this.this$0 = inOutDetailFragment;
        this.$hisRecord = historyRecordEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InOutDetailFragment$loadWithdrawKcsRewardTip$2$1(this.$result, this.this$0, this.$hisRecord, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((InOutDetailFragment$loadWithdrawKcsRewardTip$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, com.kubi.assets.entity.WithdrawHintInfoEntity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String chainId;
        WithdrawHintInfoEntity withdrawHintInfoEntity;
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
            WithdrawHintInfoEntity withdrawHintInfoEntity2 = this.$result.element;
            if (withdrawHintInfoEntity2 == null) {
                com.kubi.assets.withdraw.chain.a aVarM17262i4 = this.this$0.m17262i4();
                HistoryRecordEntity historyRecordEntity = this.$hisRecord;
                if (historyRecordEntity != null) {
                    withdrawHintInfoEntity = withdrawHintInfoEntity2;
                    chainId = historyRecordEntity.getChainId();
                } else {
                    withdrawHintInfoEntity = withdrawHintInfoEntity2;
                    chainId = null;
                }
                InterfaceC41634e interfaceC41634eQ = aVarM17262i4.q(chainId);
                this.label = 1;
                obj = RetrofitFlowExKt.m42830k(interfaceC41634eQ, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            withdrawHintInfoEntity = withdrawHintInfoEntity2;
            AssetHelperDialog assetHelperDialog = AssetHelperDialog.f16924a;
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            assetHelperDialog.m15979k(childFragmentManager, withdrawHintInfoEntity);
            return Unit.INSTANCE;
        }
        ?? r11 = (WithdrawHintInfoEntity) obj;
        this.$result.element = r11;
        withdrawHintInfoEntity = r11;
        withdrawHintInfoEntity = withdrawHintInfoEntity2;
        AssetHelperDialog assetHelperDialog2 = AssetHelperDialog.f16924a;
        FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
        assetHelperDialog2.m15979k(childFragmentManager2, withdrawHintInfoEntity);
        return Unit.INSTANCE;
    }
}
