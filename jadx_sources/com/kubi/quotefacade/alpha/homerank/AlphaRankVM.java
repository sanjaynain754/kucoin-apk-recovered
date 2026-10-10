package com.kubi.quotefacade.alpha.homerank;

import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.rank.ws.RankWsHelper;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import p414kv.C41996l;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaRankVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u000e\u0010\u0011\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/homerank/AlphaRankVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/alpha/homerank/AlphaRankContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "wsHelper", "Lcom/kubi/quotefacade/rank/ws/RankWsHelper;", "hasRankData", "", "initState", "getInitState", "()Lcom/kubi/quotefacade/alpha/homerank/AlphaRankContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "fetchDataList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeWs", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaRankVM.kt\ncom/kubi/quotefacade/alpha/homerank/AlphaRankVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,67:1\n1563#2:68\n1634#2,3:69\n*S KotlinDebug\n*F\n+ 1 AlphaRankVM.kt\ncom/kubi/quotefacade/alpha/homerank/AlphaRankVM\n*L\n60#1:68\n60#1:69,3\n*E\n"})
public final class AlphaRankVM extends AbstractC19291m<AlphaRankContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteMarketRepository f41269X = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final RankWsHelper f41270Y = new RankWsHelper();

    /* JADX INFO: renamed from: Z */
    public boolean f41271Z;

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.homerank.AlphaRankVM$onShow$1 */
    /* JADX INFO: compiled from: AlphaRankVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.homerank.AlphaRankVM$onShow$1", m90122f = "AlphaRankVM.kt", m90123i = {}, m90124l = {28}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C216701 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C216701(Continuation<? super C216701> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AlphaRankVM.this.new C216701(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C216701) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AlphaRankVM alphaRankVM = AlphaRankVM.this;
                this.label = 1;
                if (alphaRankVM.m50526e(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m50525p(AlphaRankVM alphaRankVM, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(it, 10));
            Iterator it2 = it.iterator();
            while (it2.hasNext()) {
                arrayList.add(C41996l.m92078a(new AlphaItemEntity(null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null), (WsAlphaSnapshotEntity) it2.next()));
            }
            alphaRankVM.f41271Z = true;
            alphaRankVM.send(new C21673c(arrayList));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m50526e(Continuation<? super Unit> continuation) {
        AlphaRankVM$fetchDataList$1 alphaRankVM$fetchDataList$1;
        List listEmptyList;
        if (continuation instanceof AlphaRankVM$fetchDataList$1) {
            alphaRankVM$fetchDataList$1 = (AlphaRankVM$fetchDataList$1) continuation;
            int i11 = alphaRankVM$fetchDataList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                alphaRankVM$fetchDataList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                alphaRankVM$fetchDataList$1 = new AlphaRankVM$fetchDataList$1(this, continuation);
            }
        } else {
            alphaRankVM$fetchDataList$1 = new AlphaRankVM$fetchDataList$1(this, continuation);
        }
        Object objM53004t = alphaRankVM$fetchDataList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = alphaRankVM$fetchDataList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM53004t);
                send(SingleEvent.C19253i.f35632b);
                QuoteMarketRepository quoteMarketRepository = this.f41269X;
                alphaRankVM$fetchDataList$1.label = 1;
                objM53004t = quoteMarketRepository.m53004t(alphaRankVM$fetchDataList$1);
                if (objM53004t == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM53004t);
            }
            listEmptyList = (List) objM53004t;
        } catch (Exception unused) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            send(SingleEvent.C19248d.f35627b);
            if (!this.f41271Z) {
                send(SingleEvent.C19249e.f35628b);
            }
        } else {
            this.f41271Z = true;
            send(new C21673c(listEmptyList));
            send(SingleEvent.C19248d.f35627b);
        }
        m50528o();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.quotefacade.alpha.homerank.AlphaRankContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AlphaRankContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.quotefacade.alpha.homerank.AlphaRankContract$UIState
        };
    }

    /* JADX INFO: renamed from: o */
    public final void m50528o() {
        RankWsHelper.m52933u(this.f41270Y, "/app-home/alpha", 0L, new Function1() { // from class: com.kubi.quotefacade.alpha.homerank.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaRankVM.m50525p(this.f41279b, (List) obj);
            }
        }, 2, null);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f41270Y.m52937C();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        launchOnIO(new C216701(null));
    }
}
