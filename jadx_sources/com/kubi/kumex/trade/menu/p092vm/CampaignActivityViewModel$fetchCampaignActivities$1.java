package com.kubi.kumex.trade.menu.p092vm;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.data.platform.model.FuturesCampaignActivityEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import th.InterfaceC44974a;

/* JADX INFO: compiled from: CampaignActivityViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.trade.menu.vm.CampaignActivityViewModel$fetchCampaignActivities$1", m90122f = "CampaignActivityViewModel.kt", m90123i = {}, m90124l = {53}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CampaignActivityViewModel$fetchCampaignActivities$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $lang;
    final /* synthetic */ int $page;
    int label;
    final /* synthetic */ CampaignActivityViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.vm.CampaignActivityViewModel$fetchCampaignActivities$1$1 */
    /* JADX INFO: compiled from: CampaignActivityViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.trade.menu.vm.CampaignActivityViewModel$fetchCampaignActivities$1$1", m90122f = "CampaignActivityViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCampaignActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignActivityViewModel.kt\ncom/kubi/kumex/trade/menu/vm/CampaignActivityViewModel$fetchCampaignActivities$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
    public static final class C169421 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $lang;
        final /* synthetic */ int $page;
        int label;
        final /* synthetic */ CampaignActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C169421(int i11, String str, CampaignActivityViewModel campaignActivityViewModel, Continuation<? super C169421> continuation) {
            super(1, continuation);
            this.$page = i11;
            this.$lang = str;
            this.this$0 = campaignActivityViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C169421(this.$page, this.$lang, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C169421) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List<Article> items;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                FuturesCampaignActivityEntity futuresCampaignActivityEntityM99449c0 = InterfaceC44974a.m99449c0(RepositoryServiceLocator.f19236a.m20288g(), this.$page, 20, this.$lang, "futures-announcements,activities", null, 16, null);
                if (futuresCampaignActivityEntityM99449c0 == null || (items = futuresCampaignActivityEntityM99449c0.getItems()) == null || items.isEmpty()) {
                    this.this$0.m36399u(this.$page);
                    if (this.$page == 1) {
                        this.this$0.f30637Z.postValue(Boxing.boxBoolean(true));
                    } else {
                        this.this$0.f30639b0.postValue(Boxing.boxBoolean(true));
                    }
                } else {
                    this.this$0.m36399u(this.$page);
                    this.this$0.f30645h0.postValue(futuresCampaignActivityEntityM99449c0.getItems());
                    if (Intrinsics.areEqual(futuresCampaignActivityEntityM99449c0.getHasNext(), Boxing.boxBoolean(false))) {
                        this.this$0.f30639b0.postValue(Boxing.boxBoolean(true));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m36401f(int i11, CampaignActivityViewModel campaignActivityViewModel, Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        if (i11 == 1) {
            campaignActivityViewModel.f30641d0.postValue(Boolean.TRUE);
        } else {
            campaignActivityViewModel.f30643f0.postValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CampaignActivityViewModel$fetchCampaignActivities$1(int i11, String str, CampaignActivityViewModel campaignActivityViewModel, Continuation<? super CampaignActivityViewModel$fetchCampaignActivities$1> continuation) {
        super(2, continuation);
        this.$page = i11;
        this.$lang = str;
        this.this$0 = campaignActivityViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CampaignActivityViewModel$fetchCampaignActivities$1(this.$page, this.$lang, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CampaignActivityViewModel$fetchCampaignActivities$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C169421 c169421 = new C169421(this.$page, this.$lang, this.this$0, null);
            final int i12 = this.$page;
            final CampaignActivityViewModel campaignActivityViewModel = this.this$0;
            Function1 function1 = new Function1() { // from class: com.kubi.kumex.trade.menu.vm.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CampaignActivityViewModel$fetchCampaignActivities$1.m36401f(i12, campaignActivityViewModel, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c169421, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
