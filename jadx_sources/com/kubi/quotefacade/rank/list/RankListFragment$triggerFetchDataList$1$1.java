package com.kubi.quotefacade.rank.list;

import com.kubi.quotefacade.rank.config.RankMarketConfigKt;
import com.kubi.quotefacade.rank.config.RankSubTabItemConfig;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RankListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.list.RankListFragment$triggerFetchDataList$1$1", m90122f = "RankListFragment.kt", m90123i = {}, m90124l = {329}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RankListFragment$triggerFetchDataList$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ RankListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankListFragment$triggerFetchDataList$1$1(RankListFragment rankListFragment, Continuation<? super RankListFragment$triggerFetchDataList$1$1> continuation) {
        super(2, continuation);
        this.this$0 = rankListFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankListFragment$triggerFetchDataList$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RankListFragment$triggerFetchDataList$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RankListFragment rankListFragment;
        RankSubTabItemConfig rankSubTabItemConfigM52881v4;
        String strM52858t4;
        String str;
        String value;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = (String) this.L$3;
                rankSubTabItemConfigM52881v4 = (RankSubTabItemConfig) this.L$2;
                str = (String) this.L$1;
                rankListFragment = (RankListFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            rankListFragment = this.this$0;
            String strM52880u4 = rankListFragment.m52880u4();
            rankSubTabItemConfigM52881v4 = this.this$0.m52881v4();
            strM52858t4 = this.this$0.m52858t4();
            if (this.this$0.m52881v4().isRankSpotSubTab()) {
                this.L$0 = rankListFragment;
                this.L$1 = strM52880u4;
                this.L$2 = rankSubTabItemConfigM52881v4;
                this.L$3 = strM52858t4;
                this.label = 1;
                Object objM52711c = RankMarketConfigKt.m52711c(this);
                if (objM52711c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strM52880u4;
                obj = objM52711c;
                str2 = strM52858t4;
            } else {
                str = strM52880u4;
                value = null;
            }
            rankListFragment.sendIntent(new RankListContract$UiIntent.FetchDataList(str, rankSubTabItemConfigM52881v4, strM52858t4, value));
            return Unit.INSTANCE;
        }
        value = ((BottomSheetDialogHelper.InterfaceC24339a) obj).getValue();
        strM52858t4 = str2;
        rankListFragment.sendIntent(new RankListContract$UiIntent.FetchDataList(str, rankSubTabItemConfigM52881v4, strM52858t4, value));
        return Unit.INSTANCE;
    }
}
