package com.kubi.quotefacade.rank.list;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import bv.C4706z;
import com.kubi.quotefacade.rank.config.RankMarketConfigKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import io.reactivex.functions.BiConsumer;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.list.RankListFragment$showMarketChooseDialog$1", m90122f = "RankListFragment.kt", m90123i = {}, m90124l = {245}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RankListFragment$showMarketChooseDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RankListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListFragment$showMarketChooseDialog$1(RankListFragment rankListFragment, Continuation<? super RankListFragment$showMarketChooseDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = rankListFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankListFragment$showMarketChooseDialog$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankListFragment$showMarketChooseDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final void m52886f(RankListFragment rankListFragment, Integer num, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        C4706z c4706zM52877q4 = rankListFragment.m52877q4();
        if (c4706zM52877q4 == null) {
            return;
        }
        c4706zM52877q4.f4650h.f4406i.setText(interfaceC24339a.getLabel());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(rankListFragment), null, null, new RankListFragment$showMarketChooseDialog$1$1$1(interfaceC24339a, null), 3, null);
        rankListFragment.sendIntent(new RankListContract$UiIntent.FetchDataList(rankListFragment.m52880u4(), rankListFragment.m52881v4(), rankListFragment.m52858t4(), interfaceC24339a.getValue()));
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            this.label = 1;
            obj = RankMarketConfigKt.m52712d(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List list = (List) obj;
        if (this.this$0.isAdded() && !this.this$0.getChildFragmentManager().isStateSaved()) {
            BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
            final RankListFragment rankListFragment = this.this$0;
            DialogFragmentHelper dialogFragmentHelperM58955P = BottomSheetDialogHelper.m58955P(bottomSheetDialogHelper, list, new BiConsumer() { // from class: com.kubi.quotefacade.rank.list.e0
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj2, Object obj3) {
                    RankListFragment$showMarketChooseDialog$1.m52886f(rankListFragment, (Integer) obj2, (BottomSheetDialogHelper.InterfaceC24339a) obj3);
                }
            }, null, false, 12, null);
            FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM58955P.show(childFragmentManager, "rankSpotMarketChooseIndex");
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
