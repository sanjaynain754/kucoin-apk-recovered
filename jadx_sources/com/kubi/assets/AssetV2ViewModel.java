package com.kubi.assets;

import android.text.TextUtils;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.BotAssetEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.sort.C10997l;
import com.kubi.assets.view.C11273q;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37890n;
import java.math.BigDecimal;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p311hf.C38184b;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2ViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010#\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Lcom/kubi/assets/AssetV2ViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/AssetV2Contract$UiIntent;", "Lcom/kubi/assets/AssetV2Contract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntent", "", "intent", "(Lcom/kubi/assets/AssetV2Contract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchIntentOnIO", "handleUpdateAssetInfo", "Lcom/kubi/assets/AssetV2Contract$UiIntent$UpdateAssetInfo;", "handleFetchAccountsInfo", "Lcom/kubi/assets/AssetV2Contract$UiIntent$FetchAccountsInfo;", "(Lcom/kubi/assets/AssetV2Contract$UiIntent$FetchAccountsInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveData", "getData", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadSubAccountBalance", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Lcom/kubi/assets/AssetV2Contract$UiIntent$FetchAccountsInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exposeError", "it", "", "sendLoadFailEvent", "sendLoadSuccessEvent", "initState", "getInitState", "()Lcom/kubi/assets/AssetV2Contract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2ViewModel.kt\ncom/kubi/assets/AssetV2ViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,217:1\n25#2:218\n26#2:220\n25#2:221\n26#2:223\n25#2:230\n26#2:232\n1#3:219\n1#3:222\n1#3:231\n23#4,2:224\n32#4:226\n196#5,3:227\n*S KotlinDebug\n*F\n+ 1 AssetV2ViewModel.kt\ncom/kubi/assets/AssetV2ViewModel\n*L\n98#1:218\n98#1:220\n118#1:221\n118#1:223\n175#1:230\n175#1:232\n98#1:219\n118#1:222\n175#1:231\n136#1:224,2\n149#1:226\n151#1:227,3\n*E\n"})
public final class AssetV2ViewModel extends BaseStateVM<AssetV2Contract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f16343V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.s0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2ViewModel.m15215v();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2ViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: AssetV2ViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.AssetV2ViewModel", m90122f = "AssetV2ViewModel.kt", m90123i = {0, 1}, m90124l = {44, 49}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C94561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C94561(Continuation<? super C94561> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2ViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2ViewModel$getData$1 */
    /* JADX INFO: compiled from: AssetV2ViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.AssetV2ViewModel", m90122f = "AssetV2ViewModel.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {221}, m90125m = "getData", m90126n = {"it", "this_$iv", "json$iv", "$completion$iv", "$i$a$-runCatching-AssetV2ViewModel$getData$2", "$i$a$-let-AssetV2ViewModel$getData$2$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"})
    public static final class C94571 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C94571(Continuation<? super C94571> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2ViewModel.this.getData(this);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m15222J() {
        C12572a.m23695d("event_network_failed", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m15223K() {
        C12572a.m23695d("event_network_succeed", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m15200C(AssetV2OverviewEntity assetV2OverviewEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, assetV2OverviewEntity, null, 2, null);
    }

    /* JADX INFO: renamed from: D */
    public static final UIState m15201D(AssetV2OverviewEntity assetV2OverviewEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, assetV2OverviewEntity, null, 2, null);
    }

    /* JADX INFO: renamed from: F */
    public static final UIState m15202F(BotAssetEntity botAssetEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, botAssetEntity, 1, null);
    }

    /* JADX INFO: renamed from: H */
    public static final UIState m15203H(AssetV2OverviewEntity assetV2OverviewEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, assetV2OverviewEntity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getData(Continuation<? super AssetV2OverviewEntity> continuation) {
        C94571 c94571;
        Object objM103844constructorimpl;
        AssetV2OverviewEntity assetV2OverviewEntity;
        if (continuation instanceof C94571) {
            c94571 = (C94571) continuation;
            int i11 = c94571.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c94571.label = i11 - Integer.MIN_VALUE;
            } else {
                c94571 = new C94571(continuation);
            }
        } else {
            c94571 = new C94571(continuation);
        }
        Object objM90914f0 = c94571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c94571.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90914f0);
                Result.Companion companion = Result.INSTANCE;
                String strM102326h = C46392a.m102326h(C42153h.f93593a.m92507K(), "");
                if (TextUtils.isEmpty(strM102326h)) {
                    assetV2OverviewEntity = null;
                } else {
                    C27099x c27099x = C27099x.f54458a;
                    InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C9458xdbb9e5d6(strM102326h, null)), C42911a.m94120b());
                    c94571.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                    c94571.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                    c94571.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
                    c94571.L$3 = SpillingKt.nullOutSpilledVariable(c94571);
                    c94571.I$0 = 0;
                    c94571.I$1 = 0;
                    c94571.I$2 = 0;
                    c94571.label = 1;
                    objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, c94571);
                    if (objM90914f0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(assetV2OverviewEntity);
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    return null;
                }
                return objM103844constructorimpl;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90914f0);
            assetV2OverviewEntity = (AssetV2OverviewEntity) objM90914f0;
            objM103844constructorimpl = Result.m103844constructorimpl(assetV2OverviewEntity);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: z */
    private final AssetV2Api m15216z() {
        return (AssetV2Api) this.f16343V.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: B */
    public final Object m15218B(AssetV2Contract$UiIntent.FetchAccountsInfo fetchAccountsInfo, Continuation<? super Unit> continuation) throws JSONException {
        AssetV2ViewModel$handleFetchAccountsInfo$1 assetV2ViewModel$handleFetchAccountsInfo$1;
        C19334f c19334f;
        Throwable throwable;
        Throwable th2;
        C19334f c19334f2;
        Throwable throwable2;
        Throwable th3;
        if (continuation instanceof AssetV2ViewModel$handleFetchAccountsInfo$1) {
            assetV2ViewModel$handleFetchAccountsInfo$1 = (AssetV2ViewModel$handleFetchAccountsInfo$1) continuation;
            int i11 = assetV2ViewModel$handleFetchAccountsInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetV2ViewModel$handleFetchAccountsInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetV2ViewModel$handleFetchAccountsInfo$1 = new AssetV2ViewModel$handleFetchAccountsInfo$1(this, continuation);
            }
        } else {
            assetV2ViewModel$handleFetchAccountsInfo$1 = new AssetV2ViewModel$handleFetchAccountsInfo$1(this, continuation);
        }
        AssetV2ViewModel$handleFetchAccountsInfo$1 assetV2ViewModel$handleFetchAccountsInfo$2 = assetV2ViewModel$handleFetchAccountsInfo$1;
        Object objM42824e = assetV2ViewModel$handleFetchAccountsInfo$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetV2ViewModel$handleFetchAccountsInfo$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            if (C10997l.m19368a()) {
                InterfaceC41634e<AssetV2OverviewEntity> interfaceC41634eM17102S0 = m15216z().m17102S0(fetchAccountsInfo.getCurrency());
                AssetV2ViewModel$handleFetchAccountsInfo$2 assetV2ViewModel$handleFetchAccountsInfo$3 = new AssetV2ViewModel$handleFetchAccountsInfo$2(this, fetchAccountsInfo, null);
                assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
                assetV2ViewModel$handleFetchAccountsInfo$2.label = 1;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17102S0, false, assetV2ViewModel$handleFetchAccountsInfo$3, assetV2ViewModel$handleFetchAccountsInfo$2, 1, null);
                if (objM42824e != coroutine_suspended) {
                    c19334f = (C19334f) objM42824e;
                    throwable = c19334f.getThrowable();
                    if (throwable != null) {
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$1 = c19334f;
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$3 = throwable;
                        assetV2ViewModel$handleFetchAccountsInfo$2.I$0 = 0;
                        assetV2ViewModel$handleFetchAccountsInfo$2.I$1 = 0;
                        assetV2ViewModel$handleFetchAccountsInfo$2.I$2 = 0;
                        assetV2ViewModel$handleFetchAccountsInfo$2.label = 2;
                        objM42824e = getData(assetV2ViewModel$handleFetchAccountsInfo$2);
                        if (objM42824e != coroutine_suspended) {
                            th2 = throwable;
                            final AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) objM42824e;
                            updateState(new Function1() { // from class: com.kubi.assets.p0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AssetV2ViewModel.m15200C(assetV2OverviewEntity, (UIState) obj);
                                }
                            });
                            m15226y(th2);
                            AssetV2EventTracker assetV2EventTracker = AssetV2EventTracker.f17857a;
                            AssetV2EventTracker.m17549l(assetV2EventTracker, false, th2, 1, null);
                            assetV2EventTracker.m17555h("v6/asset/account/total-balance-order", th2);
                            m15222J();
                        }
                    }
                }
            } else {
                InterfaceC41634e<AssetV2OverviewEntity> interfaceC41634eM17170v0 = m15216z().m17170v0(fetchAccountsInfo.getCurrency());
                AssetV2ViewModel$handleFetchAccountsInfo$4 assetV2ViewModel$handleFetchAccountsInfo$4 = new AssetV2ViewModel$handleFetchAccountsInfo$4(this, fetchAccountsInfo, null);
                assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
                assetV2ViewModel$handleFetchAccountsInfo$2.label = 3;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17170v0, false, assetV2ViewModel$handleFetchAccountsInfo$4, assetV2ViewModel$handleFetchAccountsInfo$2, 1, null);
                if (objM42824e != coroutine_suspended) {
                    c19334f2 = (C19334f) objM42824e;
                    throwable2 = c19334f2.getThrowable();
                    if (throwable2 != null) {
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$1 = c19334f2;
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$2 = SpillingKt.nullOutSpilledVariable(throwable2);
                        assetV2ViewModel$handleFetchAccountsInfo$2.L$3 = throwable2;
                        assetV2ViewModel$handleFetchAccountsInfo$2.I$0 = 0;
                        assetV2ViewModel$handleFetchAccountsInfo$2.I$1 = 0;
                        assetV2ViewModel$handleFetchAccountsInfo$2.I$2 = 0;
                        assetV2ViewModel$handleFetchAccountsInfo$2.label = 4;
                        objM42824e = getData(assetV2ViewModel$handleFetchAccountsInfo$2);
                        if (objM42824e != coroutine_suspended) {
                            th3 = throwable2;
                            final AssetV2OverviewEntity assetV2OverviewEntity2 = (AssetV2OverviewEntity) objM42824e;
                            updateState(new Function1() { // from class: com.kubi.assets.q0
                                @Override // p852kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AssetV2ViewModel.m15201D(assetV2OverviewEntity2, (UIState) obj);
                                }
                            });
                            m15226y(th3);
                            AssetV2EventTracker assetV2EventTracker2 = AssetV2EventTracker.f17857a;
                            AssetV2EventTracker.m17549l(assetV2EventTracker2, false, th3, 1, null);
                            assetV2EventTracker2.m17555h("v5/asset/account/total-balance-order", th3);
                            m15222J();
                        }
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            fetchAccountsInfo = (AssetV2Contract$UiIntent.FetchAccountsInfo) assetV2ViewModel$handleFetchAccountsInfo$2.L$0;
            ResultKt.throwOnFailure(objM42824e);
            c19334f = (C19334f) objM42824e;
            throwable = c19334f.getThrowable();
            if (throwable != null) {
                assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
                assetV2ViewModel$handleFetchAccountsInfo$2.L$1 = c19334f;
                assetV2ViewModel$handleFetchAccountsInfo$2.L$2 = SpillingKt.nullOutSpilledVariable(throwable);
                assetV2ViewModel$handleFetchAccountsInfo$2.L$3 = throwable;
                assetV2ViewModel$handleFetchAccountsInfo$2.I$0 = 0;
                assetV2ViewModel$handleFetchAccountsInfo$2.I$1 = 0;
                assetV2ViewModel$handleFetchAccountsInfo$2.I$2 = 0;
                assetV2ViewModel$handleFetchAccountsInfo$2.label = 2;
                objM42824e = getData(assetV2ViewModel$handleFetchAccountsInfo$2);
                if (objM42824e != coroutine_suspended) {
                    th2 = throwable;
                }
                return coroutine_suspended;
            }
        } else if (i12 != 2) {
            if (i12 == 3) {
                fetchAccountsInfo = (AssetV2Contract$UiIntent.FetchAccountsInfo) assetV2ViewModel$handleFetchAccountsInfo$2.L$0;
                ResultKt.throwOnFailure(objM42824e);
                c19334f2 = (C19334f) objM42824e;
                throwable2 = c19334f2.getThrowable();
                if (throwable2 != null) {
                    assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
                    assetV2ViewModel$handleFetchAccountsInfo$2.L$1 = c19334f2;
                    assetV2ViewModel$handleFetchAccountsInfo$2.L$2 = SpillingKt.nullOutSpilledVariable(throwable2);
                    assetV2ViewModel$handleFetchAccountsInfo$2.L$3 = throwable2;
                    assetV2ViewModel$handleFetchAccountsInfo$2.I$0 = 0;
                    assetV2ViewModel$handleFetchAccountsInfo$2.I$1 = 0;
                    assetV2ViewModel$handleFetchAccountsInfo$2.I$2 = 0;
                    assetV2ViewModel$handleFetchAccountsInfo$2.label = 4;
                    objM42824e = getData(assetV2ViewModel$handleFetchAccountsInfo$2);
                    if (objM42824e != coroutine_suspended) {
                        th3 = throwable2;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th3 = (Throwable) assetV2ViewModel$handleFetchAccountsInfo$2.L$3;
                ResultKt.throwOnFailure(objM42824e);
            }
            final AssetV2OverviewEntity assetV2OverviewEntity3 = (AssetV2OverviewEntity) objM42824e;
            updateState(new Function1() { // from class: com.kubi.assets.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetV2ViewModel.m15201D(assetV2OverviewEntity3, (UIState) obj);
                }
            });
            m15226y(th3);
            AssetV2EventTracker assetV2EventTracker3 = AssetV2EventTracker.f17857a;
            AssetV2EventTracker.m17549l(assetV2EventTracker3, false, th3, 1, null);
            assetV2EventTracker3.m17555h("v5/asset/account/total-balance-order", th3);
            m15222J();
        } else {
            th2 = (Throwable) assetV2ViewModel$handleFetchAccountsInfo$2.L$3;
            ResultKt.throwOnFailure(objM42824e);
        }
        final AssetV2OverviewEntity assetV2OverviewEntity4 = (AssetV2OverviewEntity) objM42824e;
        updateState(new Function1() { // from class: com.kubi.assets.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2ViewModel.m15200C(assetV2OverviewEntity4, (UIState) obj);
            }
        });
        m15226y(th2);
        AssetV2EventTracker assetV2EventTracker4 = AssetV2EventTracker.f17857a;
        AssetV2EventTracker.m17549l(assetV2EventTracker4, false, th2, 1, null);
        assetV2EventTracker4.m17555h("v6/asset/account/total-balance-order", th2);
        m15222J();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final void m15219E(AssetV2Contract$UiIntent.UpdateAssetInfo updateAssetInfo) {
        String strM66668h;
        String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(balanceCurrency);
        if (coinInfoEntityM85613u == null || (strM66668h = coinInfoEntityM85613u.getCurrency()) == null) {
            strM66668h = C27041f.m66668h(balanceCurrency);
        }
        BigDecimal total = updateAssetInfo.getTotal();
        final BotAssetEntity botAssetEntity = new BotAssetEntity();
        BigDecimal bigDecimalM89916A = C41014a.m89916A(C41014a.m89922G(total, null, 1, null), C38184b.f85884a.m86146a(), balanceCurrency);
        botAssetEntity.setBaseCurrencyName(strM66668h);
        botAssetEntity.setAssetsValue(C27041f.m66665e(C27041f.m66669i(C37885i.m85562a(bigDecimalM89916A, balanceCurrency, C11273q.m20046b(balanceCurrency)), "--"), 12));
        botAssetEntity.setAssetsValueLegal(C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(bigDecimalM89916A, balanceCurrency), null, null, 0, false, true, false, true, 47, null), "--"));
        updateState(new Function1() { // from class: com.kubi.assets.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2ViewModel.m15202F(botAssetEntity, (UIState) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: G */
    public final Object m15220G(AssetV2OverviewEntity assetV2OverviewEntity, AssetV2Contract$UiIntent.FetchAccountsInfo fetchAccountsInfo, Continuation<? super Unit> continuation) throws JSONException {
        AssetV2ViewModel$loadSubAccountBalance$1 assetV2ViewModel$loadSubAccountBalance$1;
        AssetV2OverviewEntity assetV2OverviewEntity2;
        Throwable th2;
        if (continuation instanceof AssetV2ViewModel$loadSubAccountBalance$1) {
            assetV2ViewModel$loadSubAccountBalance$1 = (AssetV2ViewModel$loadSubAccountBalance$1) continuation;
            int i11 = assetV2ViewModel$loadSubAccountBalance$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetV2ViewModel$loadSubAccountBalance$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetV2ViewModel$loadSubAccountBalance$1 = new AssetV2ViewModel$loadSubAccountBalance$1(this, continuation);
            }
        } else {
            assetV2ViewModel$loadSubAccountBalance$1 = new AssetV2ViewModel$loadSubAccountBalance$1(this, continuation);
        }
        AssetV2ViewModel$loadSubAccountBalance$1 assetV2ViewModel$loadSubAccountBalance$2 = assetV2ViewModel$loadSubAccountBalance$1;
        Object objM42824e = assetV2ViewModel$loadSubAccountBalance$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetV2ViewModel$loadSubAccountBalance$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            C44128b.m97259c("asset", "loadSubAccountBalance start");
            InterfaceC41634e interfaceC41634eM17068r1 = AssetV2Api.m17068r1(m15216z(), fetchAccountsInfo.getCurrency(), false, 2, null);
            AssetV2ViewModel$loadSubAccountBalance$2 assetV2ViewModel$loadSubAccountBalance$3 = new AssetV2ViewModel$loadSubAccountBalance$2(this, assetV2OverviewEntity, null);
            assetV2ViewModel$loadSubAccountBalance$2.L$0 = assetV2OverviewEntity;
            assetV2ViewModel$loadSubAccountBalance$2.L$1 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
            assetV2ViewModel$loadSubAccountBalance$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17068r1, false, assetV2ViewModel$loadSubAccountBalance$3, assetV2ViewModel$loadSubAccountBalance$2, 1, null);
            if (objM42824e != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            fetchAccountsInfo = (AssetV2Contract$UiIntent.FetchAccountsInfo) assetV2ViewModel$loadSubAccountBalance$2.L$1;
            assetV2OverviewEntity = (AssetV2OverviewEntity) assetV2ViewModel$loadSubAccountBalance$2.L$0;
            ResultKt.throwOnFailure(objM42824e);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th2 = (Throwable) assetV2ViewModel$loadSubAccountBalance$2.L$4;
            assetV2OverviewEntity2 = (AssetV2OverviewEntity) assetV2ViewModel$loadSubAccountBalance$2.L$0;
            ResultKt.throwOnFailure(objM42824e);
        }
        final AssetV2OverviewEntity assetV2OverviewEntity3 = (AssetV2OverviewEntity) objM42824e;
        updateState(new Function1() { // from class: com.kubi.assets.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2ViewModel.m15203H(assetV2OverviewEntity3, (UIState) obj);
            }
        });
        m15226y(th2);
        m15222J();
        AssetV2EventTracker.f17857a.m17558k(C27025c.m66566d(assetV2OverviewEntity2.getSubOverLimit()), th2);
        C44128b.m97259c("asset", "loadSubAccountBalance end");
        return Unit.INSTANCE;
        C19334f c19334f = (C19334f) objM42824e;
        Throwable throwable = c19334f.getThrowable();
        if (throwable != null) {
            C44128b.m97259c("asset", "loadSubAccountBalance fail");
            assetV2ViewModel$loadSubAccountBalance$2.L$0 = assetV2OverviewEntity;
            assetV2ViewModel$loadSubAccountBalance$2.L$1 = SpillingKt.nullOutSpilledVariable(fetchAccountsInfo);
            assetV2ViewModel$loadSubAccountBalance$2.L$2 = c19334f;
            assetV2ViewModel$loadSubAccountBalance$2.L$3 = SpillingKt.nullOutSpilledVariable(throwable);
            assetV2ViewModel$loadSubAccountBalance$2.L$4 = throwable;
            assetV2ViewModel$loadSubAccountBalance$2.I$0 = 0;
            assetV2ViewModel$loadSubAccountBalance$2.I$1 = 0;
            assetV2ViewModel$loadSubAccountBalance$2.I$2 = 0;
            assetV2ViewModel$loadSubAccountBalance$2.label = 2;
            objM42824e = getData(assetV2ViewModel$loadSubAccountBalance$2);
            if (objM42824e != coroutine_suspended) {
                assetV2OverviewEntity2 = assetV2OverviewEntity;
                th2 = throwable;
                final AssetV2OverviewEntity assetV2OverviewEntity4 = (AssetV2OverviewEntity) objM42824e;
                updateState(new Function1() { // from class: com.kubi.assets.t0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2ViewModel.m15203H(assetV2OverviewEntity4, (UIState) obj);
                    }
                });
                m15226y(th2);
                m15222J();
                AssetV2EventTracker.f17857a.m17558k(C27025c.m66566d(assetV2OverviewEntity2.getSubOverLimit()), th2);
            }
            return coroutine_suspended;
        }
        C44128b.m97259c("asset", "loadSubAccountBalance end");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (m15218B(r8, r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull AssetV2Contract$UiIntent assetV2Contract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C94561 c94561;
        if (continuation instanceof C94561) {
            c94561 = (C94561) continuation;
            int i11 = c94561.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c94561.label = i11 - Integer.MIN_VALUE;
            } else {
                c94561 = new C94561(continuation);
            }
        } else {
            c94561 = new C94561(continuation);
        }
        Object obj = c94561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c94561.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c94561.L$0 = assetV2Contract$UiIntent;
            c94561.label = 1;
            if (super.dispatchIntent(assetV2Contract$UiIntent, c94561) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            assetV2Contract$UiIntent = (AssetV2Contract$UiIntent) c94561.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C44128b.m97259c("asset", "handleFetchAccountsInfo end");
        return Unit.INSTANCE;
        if (assetV2Contract$UiIntent instanceof AssetV2Contract$UiIntent.FetchAccountsInfo) {
            C44128b.m97259c("asset", "handleFetchAccountsInfo start");
            AssetV2Contract$UiIntent.FetchAccountsInfo fetchAccountsInfo = (AssetV2Contract$UiIntent.FetchAccountsInfo) assetV2Contract$UiIntent;
            c94561.L$0 = SpillingKt.nullOutSpilledVariable(assetV2Contract$UiIntent);
            c94561.label = 2;
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull AssetV2Contract$UiIntent assetV2Contract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        if (assetV2Contract$UiIntent instanceof AssetV2Contract$UiIntent.UpdateAssetInfo) {
            m15219E((AssetV2Contract$UiIntent.UpdateAssetInfo) assetV2Contract$UiIntent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public final void m15226y(Throwable th2) throws JSONException {
        String str = th2 instanceof ApiException ? "backend" : "network";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fail_reason", str);
        jSONObject.put("fail_reason_code", com.kubi.user.api.p.b(th2));
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "errorTips", "toast", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final AssetV2Api m15215v() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: I */
    public final void m15221I() {
        boolean zAreEqual;
        Object objM103844constructorimpl;
        Boolean subOverLimit;
        AssetSingleEntity total;
        AssetV2OverviewEntity overviewData = getState().getOverviewData();
        if (overviewData != null && (total = overviewData.getTotal()) != null) {
            zAreEqual = Intrinsics.areEqual(total.getExecute(), Boolean.FALSE);
        } else {
            zAreEqual = false;
        }
        if (!zAreEqual) {
            Boolean subOverLimit2 = null;
            try {
                Result.Companion companion = Result.INSTANCE;
                C46392a.m102333p(C42153h.f93593a.m92507K(), C27099x.m66919i(getState().getOverviewData(), false, 2, null));
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
                AssetV2EventTracker assetV2EventTracker = AssetV2EventTracker.f17857a;
                AssetV2OverviewEntity overviewData2 = getState().getOverviewData();
                if (overviewData2 != null) {
                    subOverLimit = overviewData2.getSubOverLimit();
                } else {
                    subOverLimit = null;
                }
                AssetV2EventTracker.m17551o(assetV2EventTracker, C27025c.m66566d(subOverLimit), null, 2, null);
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                AssetV2EventTracker assetV2EventTracker2 = AssetV2EventTracker.f17857a;
                AssetV2OverviewEntity overviewData3 = getState().getOverviewData();
                if (overviewData3 != null) {
                    subOverLimit2 = overviewData3.getSubOverLimit();
                }
                assetV2EventTracker2.m17559n(C27025c.m66566d(subOverLimit2), thM103847exceptionOrNullimpl);
            }
        }
    }
}
