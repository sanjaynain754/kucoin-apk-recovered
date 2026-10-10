package com.kubi.core.biz.menu;

import com.kubi.core.spot.entity.SpotInformationEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;
import se.InterfaceC44395a;

/* JADX INFO: compiled from: SpotInformationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0002\u0010\u0014R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/biz/menu/SpotInformationVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/core/biz/menu/SpotInformationContract$UIState;", "<init>", "()V", "mApi", "Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/core/spot/business/mvi/ISpotTradeApi;", "mApi$delegate", "Lkotlin/Lazy;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSpotInformation", "symbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/core/biz/menu/SpotInformationContract$UIState;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotInformationVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotInformationVM.kt\ncom/kubi/core/biz/menu/SpotInformationVM\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n25#2:44\n26#2:46\n1#3:45\n*S KotlinDebug\n*F\n+ 1 SpotInformationVM.kt\ncom/kubi/core/biz/menu/SpotInformationVM\n*L\n35#1:44\n35#1:46\n35#1:45\n*E\n"})
public final class SpotInformationVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20498X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.menu.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotInformationVM.m21965t();
        }
    });

    /* JADX INFO: renamed from: com.kubi.core.biz.menu.SpotInformationVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: SpotInformationVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.menu.SpotInformationVM", m90122f = "SpotInformationVM.kt", m90123i = {0, 1}, m90124l = {18, 22}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C119651 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C119651(Continuation<? super C119651> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpotInformationVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (m21968s(r7, r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C119651 c119651;
        if (continuation instanceof C119651) {
            c119651 = (C119651) continuation;
            int i11 = c119651.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c119651.label = i11 - Integer.MIN_VALUE;
            } else {
                c119651 = new C119651(continuation);
            }
        } else {
            c119651 = new C119651(continuation);
        }
        Object obj = c119651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c119651.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c119651.L$0 = interfaceC19282d;
            c119651.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c119651) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c119651.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof SpotInformationContract$UiIntent.FetchSpotInformation)) {
            return Unit.INSTANCE;
        }
        String symbol = ((SpotInformationContract$UiIntent.FetchSpotInformation) interfaceC19282d).getSymbol();
        c119651.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c119651.label = 2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC44395a m21967r() {
        return (InterfaceC44395a) this.f20498X.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m21968s(String str, Continuation<? super Unit> continuation) {
        SpotInformationVM$handleSpotInformation$1 spotInformationVM$handleSpotInformation$1;
        if (continuation instanceof SpotInformationVM$handleSpotInformation$1) {
            spotInformationVM$handleSpotInformation$1 = (SpotInformationVM$handleSpotInformation$1) continuation;
            int i11 = spotInformationVM$handleSpotInformation$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotInformationVM$handleSpotInformation$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotInformationVM$handleSpotInformation$1 = new SpotInformationVM$handleSpotInformation$1(this, continuation);
            }
        } else {
            spotInformationVM$handleSpotInformation$1 = new SpotInformationVM$handleSpotInformation$1(this, continuation);
        }
        SpotInformationVM$handleSpotInformation$1 spotInformationVM$handleSpotInformation$2 = spotInformationVM$handleSpotInformation$1;
        Object objStartLoadingDialog = spotInformationVM$handleSpotInformation$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotInformationVM$handleSpotInformation$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objStartLoadingDialog);
            InterfaceC41634e<SpotInformationEntity> interfaceC41634eM97925d = m21967r().m97925d(str);
            spotInformationVM$handleSpotInformation$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            spotInformationVM$handleSpotInformation$2.label = 1;
            objStartLoadingDialog = startLoadingDialog(interfaceC41634eM97925d, spotInformationVM$handleSpotInformation$2);
            if (objStartLoadingDialog != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = (String) spotInformationVM$handleSpotInformation$2.L$0;
            ResultKt.throwOnFailure(objStartLoadingDialog);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objStartLoadingDialog);
        }
        if (((C19334f) objStartLoadingDialog).getThrowable() != null) {
            sendSingleEvent(SingleEvent.C19249e.f35628b);
        }
        return Unit.INSTANCE;
        SpotInformationVM$handleSpotInformation$2 spotInformationVM$handleSpotInformation$3 = new SpotInformationVM$handleSpotInformation$2(this, null);
        spotInformationVM$handleSpotInformation$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
        spotInformationVM$handleSpotInformation$2.label = 2;
        objStartLoadingDialog = RetrofitFlowExKt.m42824e((InterfaceC41634e) objStartLoadingDialog, false, spotInformationVM$handleSpotInformation$3, spotInformationVM$handleSpotInformation$2, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC44395a m21965t() {
        return (InterfaceC44395a) C42597a.m93387c().create(InterfaceC44395a.class);
    }
}
