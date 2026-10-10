package com.kubi.assets.exchange.viewmodel;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.assets.exchange.contract.MainConvertContract$UiIntent;
import com.kubi.assets.exchange.contract.UIState;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p719wa.C45776b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import va.C45484a;

/* JADX INFO: compiled from: MainConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/exchange/viewmodel/MainConvertViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMainConvertList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestConvertMainSmallAssets", "Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent$MainConvert;", "(Lcom/kubi/assets/exchange/contract/MainConvertContract$UiIntent$MainConvert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/exchange/contract/MainConvertContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainConvertViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainConvertViewModel.kt\ncom/kubi/assets/exchange/viewmodel/MainConvertViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n25#2:66\n26#2:68\n1#3:67\n*S KotlinDebug\n*F\n+ 1 MainConvertViewModel.kt\ncom/kubi/assets/exchange/viewmodel/MainConvertViewModel\n*L\n57#1:66\n57#1:68\n57#1:67\n*E\n"})
public final class MainConvertViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f17321X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.viewmodel.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainConvertViewModel.m16522s();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.exchange.viewmodel.MainConvertViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: MainConvertViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MainConvertViewModel", m90122f = "MainConvertViewModel.kt", m90123i = {0, 1, 2}, m90124l = {26, 29, 33}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C99101 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C99101(Continuation<? super C99101> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MainConvertViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: t */
    private final AssetV2Api m16523t() {
        return (AssetV2Api) this.f17321X.getValue();
    }

    /* JADX INFO: renamed from: w */
    public static final CharSequence m16524w(RedeemableEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getCurrency());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (m16527x(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (m16526v(r8, r0) == r1) goto L32;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C99101 c99101;
        if (continuation instanceof C99101) {
            c99101 = (C99101) continuation;
            int i11 = c99101.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c99101.label = i11 - Integer.MIN_VALUE;
            } else {
                c99101 = new C99101(continuation);
            }
        } else {
            c99101 = new C99101(continuation);
        }
        Object obj = c99101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c99101.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c99101.L$0 = interfaceC19282d;
            c99101.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c99101) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c99101.L$0;
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof MainConvertContract$UiIntent.QueryMainConvertList) {
            c99101.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c99101.label = 2;
        } else {
            if (!(interfaceC19282d instanceof MainConvertContract$UiIntent.MainConvert)) {
                return Unit.INSTANCE;
            }
            MainConvertContract$UiIntent.MainConvert mainConvert = (MainConvertContract$UiIntent.MainConvert) interfaceC19282d;
            c99101.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c99101.label = 3;
        }
        return coroutine_suspended;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r1 == r9) goto L23;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m16526v(MainConvertContract$UiIntent.MainConvert mainConvert, Continuation<? super Unit> continuation) throws JSONException {
        MainConvertViewModel$requestConvertMainSmallAssets$1 mainConvertViewModel$requestConvertMainSmallAssets$1;
        MainConvertContract$UiIntent.MainConvert mainConvert2;
        String str;
        if (continuation instanceof MainConvertViewModel$requestConvertMainSmallAssets$1) {
            mainConvertViewModel$requestConvertMainSmallAssets$1 = (MainConvertViewModel$requestConvertMainSmallAssets$1) continuation;
            int i11 = mainConvertViewModel$requestConvertMainSmallAssets$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mainConvertViewModel$requestConvertMainSmallAssets$1.label = i11 - Integer.MIN_VALUE;
            } else {
                mainConvertViewModel$requestConvertMainSmallAssets$1 = new MainConvertViewModel$requestConvertMainSmallAssets$1(this, continuation);
            }
        } else {
            mainConvertViewModel$requestConvertMainSmallAssets$1 = new MainConvertViewModel$requestConvertMainSmallAssets$1(this, continuation);
        }
        MainConvertViewModel$requestConvertMainSmallAssets$1 mainConvertViewModel$requestConvertMainSmallAssets$2 = mainConvertViewModel$requestConvertMainSmallAssets$1;
        Object objStartLoading$default = mainConvertViewModel$requestConvertMainSmallAssets$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mainConvertViewModel$requestConvertMainSmallAssets$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objStartLoading$default);
            String strJoinToString$default = CollectionsKt.joinToString$default(mainConvert.getSelectedList(), ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.exchange.viewmodel.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainConvertViewModel.m16524w((RedeemableEntity) obj);
                }
            }, 30, null);
            InterfaceC41634e<Object> interfaceC41634eM17151o = m16523t().m17151o(strJoinToString$default, "MAIN");
            mainConvertViewModel$requestConvertMainSmallAssets$2.L$0 = SpillingKt.nullOutSpilledVariable(mainConvert);
            mainConvertViewModel$requestConvertMainSmallAssets$2.L$1 = SpillingKt.nullOutSpilledVariable(strJoinToString$default);
            mainConvertViewModel$requestConvertMainSmallAssets$2.label = 1;
            objStartLoading$default = BaseStateVM.startLoading$default(this, interfaceC41634eM17151o, 0, false, false, mainConvertViewModel$requestConvertMainSmallAssets$2, 7, null);
            if (objStartLoading$default != coroutine_suspended) {
                mainConvert2 = mainConvert;
                str = strJoinToString$default;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            str = (String) mainConvertViewModel$requestConvertMainSmallAssets$2.L$1;
            mainConvert2 = (MainConvertContract$UiIntent.MainConvert) mainConvertViewModel$requestConvertMainSmallAssets$2.L$0;
            ResultKt.throwOnFailure(objStartLoading$default);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objStartLoading$default);
        }
        Throwable throwable = ((C19334f) objStartLoading$default).getThrowable();
        if (throwable != null) {
            C45484a.f102511a.m100443d(false, throwable.getMessage());
        }
        return Unit.INSTANCE;
        MainConvertViewModel$requestConvertMainSmallAssets$2 mainConvertViewModel$requestConvertMainSmallAssets$3 = new MainConvertViewModel$requestConvertMainSmallAssets$2(this, null);
        mainConvertViewModel$requestConvertMainSmallAssets$2.L$0 = SpillingKt.nullOutSpilledVariable(mainConvert2);
        mainConvertViewModel$requestConvertMainSmallAssets$2.L$1 = SpillingKt.nullOutSpilledVariable(str);
        mainConvertViewModel$requestConvertMainSmallAssets$2.label = 2;
        objStartLoading$default = RetrofitFlowExKt.m42824e((InterfaceC41634e) objStartLoading$default, false, mainConvertViewModel$requestConvertMainSmallAssets$3, mainConvertViewModel$requestConvertMainSmallAssets$2, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m16527x(Continuation<? super Unit> continuation) {
        MainConvertViewModel$requestMainConvertList$1 mainConvertViewModel$requestMainConvertList$1;
        if (continuation instanceof MainConvertViewModel$requestMainConvertList$1) {
            mainConvertViewModel$requestMainConvertList$1 = (MainConvertViewModel$requestMainConvertList$1) continuation;
            int i11 = mainConvertViewModel$requestMainConvertList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mainConvertViewModel$requestMainConvertList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                mainConvertViewModel$requestMainConvertList$1 = new MainConvertViewModel$requestMainConvertList$1(this, continuation);
            }
        } else {
            mainConvertViewModel$requestMainConvertList$1 = new MainConvertViewModel$requestMainConvertList$1(this, continuation);
        }
        Object objM42830k = mainConvertViewModel$requestMainConvertList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mainConvertViewModel$requestMainConvertList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e<List<RedeemableEntity>> interfaceC41634eM17181z1 = m16523t().m17181z1("MAIN");
            mainConvertViewModel$requestMainConvertList$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17181z1, mainConvertViewModel$requestMainConvertList$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42830k);
        }
        sendSingleEvent(new C45776b((List) objM42830k));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AssetV2Api m16522s() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
