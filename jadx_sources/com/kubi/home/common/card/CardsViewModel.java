package com.kubi.home.common.card;

import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.group.GroupCardData;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import com.kubi.utils.C27100x0;
import dj.C36718c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p294gz.C38058b;
import p294gz.InterfaceC38061e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u000e\u0010\u0017\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000bR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/home/common/card/CardsViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "value", "", "currentIsUpdateConfig", "getCurrentIsUpdateConfig", "()Z", "changedCards", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "cardsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "getCardsLiveData", "Landroidx/lifecycle/LiveData;", "loadCards", "", "updateConfig", "pullRefresh", "setLiveDataCacheData", "checkBizControl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCardsDetails", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCard", "code", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModel.kt\ncom/kubi/home/common/card/CardsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class CardsViewModel extends ViewModel {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f25600Y = new Companion(null);

    /* JADX INFO: renamed from: Z */
    public static boolean f25601Z = true;

    /* JADX INFO: renamed from: V */
    public boolean f25602V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ConcurrentLinkedQueue<String> f25603W = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<List<BaseCardData>> f25604X = new MutableLiveData<>();

    /* JADX INFO: compiled from: CardsViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/common/card/CardsViewModel$Companion;", "", "<init>", "()V", "firstReq", "", "EVENT_FINISH_REFRESH_LOAD", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.common.card.CardsViewModel$a */
    /* JADX INFO: compiled from: CardsViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/common/card/CardsViewModel$checkBizControl$iStateListener$1", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/IStateListener;", "onStateUpdated", "", "state", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14525a implements InterfaceC38061e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41769w<Boolean> f25605b;

        public C14525a(InterfaceC41769w<Boolean> interfaceC41769w) {
            this.f25605b = interfaceC41769w;
        }

        @Override // p294gz.InterfaceC38061e
        /* JADX INFO: renamed from: r */
        public void mo14990r(BizControlConfigState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state == BizControlConfigState.SUCCESS) {
                this.f25605b.mo91370n(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m29053z(CardsViewModel cardsViewModel) {
        List<BaseCardData> listM29075l = HomeCardsRepository.f25606a.m29075l();
        if (listM29075l == null) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listM29075l);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseCardData baseCardData = (BaseCardData) it.next();
            if (((baseCardData instanceof GroupCardData) && (Intrinsics.areEqual(baseCardData.getCode(), "threeGrip") || Intrinsics.areEqual(baseCardData.getCode(), "twoGrip"))) || Intrinsics.areEqual(baseCardData.getType(), "RANKING_LIST")) {
                it.remove();
            }
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            cardsViewModel.f25604X.setValue(arrayList);
        } else {
            cardsViewModel.f25604X.postValue(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m29054r(Continuation<? super Unit> continuation) {
        CardsViewModel$checkBizControl$1 cardsViewModel$checkBizControl$1;
        C14525a c14525a;
        C14525a c14525a2;
        if (continuation instanceof CardsViewModel$checkBizControl$1) {
            cardsViewModel$checkBizControl$1 = (CardsViewModel$checkBizControl$1) continuation;
            int i11 = cardsViewModel$checkBizControl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardsViewModel$checkBizControl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                cardsViewModel$checkBizControl$1 = new CardsViewModel$checkBizControl$1(this, continuation);
            }
        } else {
            cardsViewModel$checkBizControl$1 = new CardsViewModel$checkBizControl$1(this, continuation);
        }
        Object obj = cardsViewModel$checkBizControl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cardsViewModel$checkBizControl$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C38058b c38058b = C38058b.f85672a;
            BizControlConfigState bizControlConfigStateM85935g = c38058b.m85935g();
            BizControlConfigState bizControlConfigState = BizControlConfigState.SUCCESS;
            if (bizControlConfigStateM85935g == bizControlConfigState) {
                return Unit.INSTANCE;
            }
            InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            c14525a = new C14525a(interfaceC41769wM91388c);
            c38058b.m85929a(c14525a);
            if (c38058b.m85935g() != bizControlConfigState) {
                cardsViewModel$checkBizControl$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
                cardsViewModel$checkBizControl$1.L$1 = c14525a;
                cardsViewModel$checkBizControl$1.label = 1;
                if (interfaceC41769wM91388c.mo91198h(cardsViewModel$checkBizControl$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c14525a2 = c14525a;
            }
            C38058b.f85672a.m85939k(c14525a);
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c14525a2 = (C14525a) cardsViewModel$checkBizControl$1.L$1;
        ResultKt.throwOnFailure(obj);
        c14525a = c14525a2;
        C38058b.f85672a.m85939k(c14525a);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LiveData<List<BaseCardData>> m29055s() {
        return this.f25604X;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getF25602V() {
        return this.f25602V;
    }

    /* JADX INFO: renamed from: u */
    public final void m29057u(boolean z11) {
        this.f25602V = z11;
        C38058b c38058b = C38058b.f85672a;
        boolean zM85937i = c38058b.m85937i();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (zM85937i) {
            if (z11) {
                if (C36718c.m82250a() && c38058b.m85935g() == BizControlConfigState.SUCCESS) {
                    m29061y();
                    booleanRef.element = true;
                } else {
                    C12572a.m23695d("com.kubi.home.event.HomeEvent:shimmer_show", Boolean.TRUE, 0L, 4, null);
                }
            }
        } else if (z11) {
            m29061y();
        }
        ExtensionKt.m32184j(this, new CardsViewModel$loadCards$1(z11, this, zM85937i, booleanRef, null));
    }

    /* JADX INFO: renamed from: w */
    public final void m29059w() {
        ExtensionKt.m32184j(this, new CardsViewModel$pullRefresh$1(this, null));
    }

    /* JADX INFO: renamed from: x */
    public final void m29060x(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ExtensionKt.m32184j(this, new CardsViewModel$removeCard$1(code, this, null));
    }

    /* JADX INFO: renamed from: y */
    public final void m29061y() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.common.card.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsViewModel.m29053z(this.f25612b);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final Object m29058v(boolean z11, Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new CardsViewModel$loadCardsDetails$2(this, z11, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
