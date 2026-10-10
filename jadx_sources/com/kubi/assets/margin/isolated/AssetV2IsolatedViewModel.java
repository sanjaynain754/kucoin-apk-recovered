package com.kubi.assets.margin.isolated;

import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41016c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2IsolatedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0095@¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSameCurrency", "checkSame", "", "initState", "getInitState", "()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2IsolatedViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2IsolatedViewModel.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n126#2,2:131\n126#2,2:133\n774#3:135\n865#3,2:136\n25#4:138\n26#4:140\n1#5:139\n*S KotlinDebug\n*F\n+ 1 AssetV2IsolatedViewModel.kt\ncom/kubi/assets/margin/isolated/AssetV2IsolatedViewModel\n*L\n38#1:131,2\n60#1:133,2\n63#1:135\n63#1:136,2\n102#1:138\n102#1:140\n102#1:139\n*E\n"})
public final class AssetV2IsolatedViewModel extends BaseStateVM<AssetV2IsolatedContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18048V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.isolated.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2IsolatedViewModel.m17979t();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetV2IsolatedViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedViewModel", m90122f = "AssetV2IsolatedViewModel.kt", m90123i = {0, 0}, m90124l = {91}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", FirebaseAnalytics.Param.CURRENCY}, m90127s = {"L$0", "L$1"})
    public static final class C104531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C104531(Continuation<? super C104531> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2IsolatedViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.isolated.AssetV2IsolatedViewModel$dispatchIntentOnIO$6 */
    /* JADX INFO: compiled from: AssetV2IsolatedViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/MarginPnlEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.isolated.AssetV2IsolatedViewModel$dispatchIntentOnIO$6", m90122f = "AssetV2IsolatedViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C104546 extends SuspendLambda implements Function2<MarginPnlEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MarginPnlEntity marginPnlEntity, Continuation<? super Unit> continuation) {
            return ((C104546) create(marginPnlEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C104546(Continuation<? super C104546> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m17988f(MarginPnlEntity marginPnlEntity, UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, null, null, marginPnlEntity, 31, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C104546 c104546 = AssetV2IsolatedViewModel.this.new C104546(continuation);
            c104546.L$0 = obj;
            return c104546;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MarginPnlEntity marginPnlEntity = (MarginPnlEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(marginPnlEntity.getBaseCurrency(), AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency())) {
                final MarginPnlEntity marginPnlEntityCopy$default = MarginPnlEntity.copy$default(marginPnlEntity, null, null, null, null, C41016c.m89965c(), 15, null);
                AssetV2IsolatedViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.margin.isolated.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2IsolatedViewModel.C104546.m17988f(marginPnlEntityCopy$default, (UIState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m17981v(AssetV2IsolatedViewModel assetV2IsolatedViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        assetV2IsolatedViewModel.m17980u(z11);
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m17963A(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, false, false, list, null, null, 55, null);
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m17965C(AssetV2IsolatedViewModel assetV2IsolatedViewModel, Throwable th2) {
        assetV2IsolatedViewModel.sendSingleEvent(SingleEvent.C19247c.f35626b);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m17967E(List list, AssetV2IsolatedContract$UiIntent assetV2IsolatedContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        AssetV2IsolatedContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2IsolatedContract$UiIntent.HideSmallOrFilter) assetV2IsolatedContract$UiIntent;
        return UIState.copy$default(updateState, list, false, hideSmallOrFilter.getChecked(), null, hideSmallOrFilter.getKeyword(), null, 42, null);
    }

    /* JADX INFO: renamed from: F */
    private final AssetV2Api m17968F() {
        return (AssetV2Api) this.f18048V.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX INFO: renamed from: u */
    private final void m17980u(boolean z11) {
        boolean z12;
        final String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        if (getState().getMarginPnlEntity() == null) {
            z12 = false;
        } else {
            MarginPnlEntity marginPnlEntity = getState().getMarginPnlEntity();
            if (Intrinsics.areEqual(marginPnlEntity != null ? marginPnlEntity.getBaseCurrency() : null, balanceCurrency)) {
                z12 = false;
            } else {
                z12 = true;
            }
        }
        if (!z11 || z12) {
            updateState(new Function1() { // from class: com.kubi.assets.margin.isolated.e0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetV2IsolatedViewModel.m17982w(balanceCurrency, (UIState) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public static final UIState m17982w(String str, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, false, false, null, null, new MarginPnlEntity(null, null, SharedPositionInfo.MARGIN_MODE_ISOLATED, str, null, 19, null), 31, null);
    }

    /* JADX INFO: renamed from: y */
    public static final UIState m17983y(AssetV2IsolatedContract$UiIntent assetV2IsolatedContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, ((AssetV2IsolatedContract$UiIntent.HideOrShowNumber) assetV2IsolatedContract$UiIntent).getIsChecked(), false, null, null, null, 61, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, false, false, null, null, null, 63, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @SuppressLint({"CheckResult", "KCCyclomaticComplexityCheck"})
    @Nullable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull final AssetV2IsolatedContract$UiIntent assetV2IsolatedContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C104531 c104531;
        List listM66558a;
        if (continuation instanceof C104531) {
            c104531 = (C104531) continuation;
            int i11 = c104531.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c104531.label = i11 - Integer.MIN_VALUE;
            } else {
                c104531 = new C104531(continuation);
            }
        } else {
            c104531 = new C104531(continuation);
        }
        Object objM42823d = c104531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c104531.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (assetV2IsolatedContract$UiIntent instanceof AssetV2IsolatedContract$UiIntent.HideOrShowNumber) {
                C46392a.m102328k(C42153h.f93593a.m92500D(), ((AssetV2IsolatedContract$UiIntent.HideOrShowNumber) assetV2IsolatedContract$UiIntent).getIsChecked());
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.margin.isolated.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2IsolatedViewModel.m17983y(assetV2IsolatedContract$UiIntent, (UIState) obj);
                    }
                }));
            } else {
                final ArrayList arrayList = null;
                if (assetV2IsolatedContract$UiIntent instanceof AssetV2IsolatedContract$UiIntent.FetchIsolatedAssetsList) {
                    Observable observableM37897A0 = IMarginService.m37897A0(AssetsDepend.f18689a.m19183d(), null, 1, null);
                    if (observableM37897A0 != null) {
                        final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.isolated.x
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AssetV2IsolatedViewModel.m17984z(this.f18101b, (IsolateMarginPosition) obj);
                            }
                        };
                        Consumer consumer = new Consumer() { // from class: com.kubi.assets.margin.isolated.y
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                AssetV2IsolatedViewModel.m17964B(function1, obj);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: com.kubi.assets.margin.isolated.z
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AssetV2IsolatedViewModel.m17965C(this.f18103b, (Throwable) obj);
                            }
                        };
                        observableM37897A0.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.margin.isolated.a0
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                AssetV2IsolatedViewModel.m17966D(function2, obj);
                            }
                        });
                    }
                } else if (assetV2IsolatedContract$UiIntent instanceof AssetV2IsolatedContract$UiIntent.HideSmallOrFilter) {
                    AssetV2IsolatedContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2IsolatedContract$UiIntent.HideSmallOrFilter) assetV2IsolatedContract$UiIntent;
                    if (hideSmallOrFilter.getIsManual()) {
                        C46392a.m102328k(C42153h.f93593a.m92526p(), hideSmallOrFilter.getChecked());
                    }
                    List<MarginPosition> isolatedAssetsSourceList = getState().getIsolatedAssetsSourceList();
                    if (isolatedAssetsSourceList != null && (listM66558a = C27024b.m66558a(isolatedAssetsSourceList)) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listM66558a) {
                            MarginPosition marginPosition = (MarginPosition) obj;
                            CurrencyBalance baseAsset = marginPosition.getBaseAsset();
                            String currencyName = baseAsset != null ? baseAsset.getCurrencyName() : null;
                            if (currencyName == null) {
                                currencyName = "";
                            }
                            boolean zContains = StringsKt.contains((CharSequence) currencyName, (CharSequence) hideSmallOrFilter.getKeyword(), true);
                            if (hideSmallOrFilter.getChecked()) {
                                if (zContains) {
                                    BigDecimal bigDecimalM89922G = C41014a.m89922G(marginPosition.totalConversionCompat(), null, 1, null);
                                    AssetsHelper assetsHelper = AssetsHelper.f18684a;
                                    SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                                    BigDecimal bigDecimalM89916A = C41014a.m89916A(bigDecimalM89922G, "BTC", smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
                                    SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                                    if (bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0 || C27039d.m66647g(marginPosition.getLiabilityConversionBalance()) > 0.0d) {
                                        arrayList2.add(obj);
                                    }
                                }
                            } else if (zContains) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    updateState(new Function1() { // from class: com.kubi.assets.margin.isolated.b0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AssetV2IsolatedViewModel.m17967E(arrayList, assetV2IsolatedContract$UiIntent, (UIState) obj2);
                        }
                    });
                    List<MarginPosition> isolatedAssetsSourceList2 = getState().getIsolatedAssetsSourceList();
                    if (isolatedAssetsSourceList2 != null && !isolatedAssetsSourceList2.isEmpty()) {
                        sendSingleEvent(SingleEvent.C19247c.f35626b);
                    }
                } else {
                    if (!(assetV2IsolatedContract$UiIntent instanceof AssetV2IsolatedContract$UiIntent.FetchMarginPnl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
                    m17981v(this, false, 1, null);
                    InterfaceC41634e<MarginPnlEntity> interfaceC41634eM17093M0 = m17968F().m17093M0(balanceCurrency, SharedPositionInfo.MARGIN_MODE_ISOLATED);
                    C104546 c104546 = new C104546(null);
                    c104531.L$0 = SpillingKt.nullOutSpilledVariable(assetV2IsolatedContract$UiIntent);
                    c104531.L$1 = SpillingKt.nullOutSpilledVariable(balanceCurrency);
                    c104531.label = 1;
                    objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM17093M0, false, c104546, c104531);
                    if (objM42823d == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM42823d);
        if (((C19334f) objM42823d).getThrowable() != null) {
            m17980u(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final void m17964B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final void m17966D(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AssetV2Api m17979t() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m17984z(AssetV2IsolatedViewModel assetV2IsolatedViewModel, IsolateMarginPosition isolateMarginPosition) {
        final List<MarginPosition> positions = isolateMarginPosition.getPositions();
        if (positions != null) {
            List<MarginPosition> isolatedAssetsSourceList = assetV2IsolatedViewModel.getState().getIsolatedAssetsSourceList();
            if (isolatedAssetsSourceList != null && !isolatedAssetsSourceList.isEmpty()) {
                assetV2IsolatedViewModel.sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
            assetV2IsolatedViewModel.updateState(new Function1() { // from class: com.kubi.assets.margin.isolated.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetV2IsolatedViewModel.m17963A(positions, (UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
