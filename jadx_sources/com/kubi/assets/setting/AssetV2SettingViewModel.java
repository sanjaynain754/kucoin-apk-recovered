package com.kubi.assets.setting;

import android.annotation.SuppressLint;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.AssetV2SettingEntity;
import com.kubi.assets.entity.FiatCurrency;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.DataInitManager;
import com.kubi.data.entity.FiatCurrencyEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.data.rate.CurrencyPrice;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p402kf.C41016c;
import p830zf.InterfaceC46790c;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetV2SettingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0007R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/setting/AssetV2SettingViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;", "Lcom/kubi/assets/setting/AssetV2SettingContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "conversionUnitItemList", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "getConversionUnitItemList", "()Ljava/util/List;", "conversionUnitItemList$delegate", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetDataIntent", "Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$GetData;", "(Lcom/kubi/assets/setting/AssetV2SettingContract$UiIntent$GetData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleCurrency", "initState", "getInitState", "()Lcom/kubi/assets/setting/AssetV2SettingContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SettingViewModel.kt\ncom/kubi/assets/setting/AssetV2SettingViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 7 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,207:1\n25#2:208\n26#2:210\n1#3:209\n1869#4,2:211\n536#5:213\n521#5,6:214\n216#6,2:220\n17#7,2:222\n*S KotlinDebug\n*F\n+ 1 AssetV2SettingViewModel.kt\ncom/kubi/assets/setting/AssetV2SettingViewModel\n*L\n87#1:208\n87#1:210\n87#1:209\n132#1:211,2\n154#1:213\n154#1:214,6\n156#1:220,2\n40#1:222,2\n*E\n"})
public final class AssetV2SettingViewModel extends BaseStateVM<AssetV2SettingContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18711V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.setting.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2SettingViewModel.m19236A();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18712W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.setting.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2SettingViewModel.m19237B();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetV2SettingViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingViewModel", m90122f = "AssetV2SettingViewModel.kt", m90123i = {0, 1, 2}, m90124l = {69, 72, 75}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C109381 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C109381(Continuation<? super C109381> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2SettingViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingViewModel$dispatchIntentOnIO$2 */
    /* JADX INFO: compiled from: AssetV2SettingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingViewModel$dispatchIntentOnIO$2", m90122f = "AssetV2SettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109392 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        int label;

        public C109392(Continuation<? super C109392> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109392(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C109392) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.setting.AssetV2SettingViewModel$dispatchIntentOnIO$3 */
    /* JADX INFO: compiled from: AssetV2SettingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.setting.AssetV2SettingViewModel$dispatchIntentOnIO$3", m90122f = "AssetV2SettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C109403 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetV2SettingContract$UiIntent $intent;
        int label;
        final /* synthetic */ AssetV2SettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109403(AssetV2SettingContract$UiIntent assetV2SettingContract$UiIntent, AssetV2SettingViewModel assetV2SettingViewModel, Continuation<? super C109403> continuation) {
            super(2, continuation);
            this.$intent = assetV2SettingContract$UiIntent;
            this.this$0 = assetV2SettingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C109403(this.$intent, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C109403) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String currency = ((AssetV2SettingContract$UiIntent.SetUserConfig) this.$intent).getCurrency();
                if (currency != null) {
                    C41016c.m89971i(currency);
                    AssetsDepend.f18689a.m19189j().d0().setCurrency(currency);
                }
                String balanceCurrency = ((AssetV2SettingContract$UiIntent.SetUserConfig) this.$intent).getBalanceCurrency();
                if (balanceCurrency != null) {
                    AssetsDepend.f18689a.m19189j().d0().setBalanceCurrency(balanceCurrency);
                }
                AssetsDepend.f18689a.m19189j().w0(UserInfo.c());
                this.this$0.m19269H();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: B */
    public static final List m19237B() {
        List<SelectEntity> listM103119a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46790c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null && (listM103119a = ((InterfaceC46790c) objM56186h).m103119a()) != null) {
            return listM103119a;
        }
        C38184b c38184b = C38184b.f85884a;
        String strM86146a = c38184b.m86146a();
        AssetsDepend assetsDepend = AssetsDepend.f18689a;
        List listMutableListOf = CollectionsKt.mutableListOf(new SelectEntity(null, strM86146a, null, null, null, null, null, null, null, false, Intrinsics.areEqual(assetsDepend.m19189j().d0().getBalanceCurrency(), c38184b.m86146a()), null, 3069, null), new SelectEntity(null, "BTC", null, null, null, null, null, null, null, false, Intrinsics.areEqual(assetsDepend.m19189j().d0().getBalanceCurrency(), "BTC"), null, 3069, null));
        if (C24129b.m58030b(SiteVisibleConfigKey.KCS)) {
            listMutableListOf.add(new SelectEntity(null, "KCS", null, null, null, null, null, null, null, false, Intrinsics.areEqual(assetsDepend.m19189j().d0().getBalanceCurrency(), "KCS"), null, 3069, null));
        }
        return listMutableListOf;
    }

    /* JADX INFO: renamed from: D */
    public static final UIState m19238D(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, Boolean.TRUE, false, 5, null);
    }

    /* JADX INFO: renamed from: E */
    private final AssetV2Api m19239E() {
        return (AssetV2Api) this.f18711V.getValue();
    }

    /* JADX INFO: renamed from: I */
    public static final Boolean m19240I(final CurrencyPrice data, final HashMap it) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(it, "it");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.assets.setting.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SettingViewModel.m19241J(data, it);
            }
        });
        C41016c.m89972j(data);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: K */
    public static final Boolean m19242K(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Boolean) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m19243L(AssetV2SettingViewModel assetV2SettingViewModel, Boolean bool) {
        assetV2SettingViewModel.updateState(new Function1() { // from class: com.kubi.assets.setting.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SettingViewModel.m19244M((UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final UIState m19244M(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, Boolean.TRUE, false, 5, null);
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m19246O(AssetV2SettingViewModel assetV2SettingViewModel, Throwable th2) {
        assetV2SettingViewModel.updateState(new Function1() { // from class: com.kubi.assets.setting.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SettingViewModel.m19247P((UIState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final UIState m19247P(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, Boolean.TRUE, false, 5, null);
    }

    /* JADX INFO: renamed from: T */
    public static final UIState m19250T(List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, null, false, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (m19270R(r9, r4) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r9, false, r3, r4, 1, null) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        if (r9 == r0) goto L35;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull AssetV2SettingContract$UiIntent assetV2SettingContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C109381 c109381;
        if (continuation instanceof C109381) {
            c109381 = (C109381) continuation;
            int i11 = c109381.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c109381.label = i11 - Integer.MIN_VALUE;
            } else {
                c109381 = new C109381(continuation);
            }
        } else {
            c109381 = new C109381(continuation);
        }
        C109381 c109382 = c109381;
        Object objM42824e = c109382.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c109382.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            if (assetV2SettingContract$UiIntent instanceof AssetV2SettingContract$UiIntent.GetData) {
                AssetV2SettingContract$UiIntent.GetData getData = (AssetV2SettingContract$UiIntent.GetData) assetV2SettingContract$UiIntent;
                c109382.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SettingContract$UiIntent);
                c109382.label = 1;
            } else if (assetV2SettingContract$UiIntent instanceof AssetV2SettingContract$UiIntent.SubSwitchChanged) {
                InterfaceC41634e<Object> interfaceC41634eM17075C = m19239E().m17075C(((AssetV2SettingContract$UiIntent.SubSwitchChanged) assetV2SettingContract$UiIntent).getChecked());
                C109392 c109392 = new C109392(null);
                c109382.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SettingContract$UiIntent);
                c109382.label = 2;
            } else if (assetV2SettingContract$UiIntent instanceof AssetV2SettingContract$UiIntent.SetUserConfig) {
                AssetV2SettingContract$UiIntent.SetUserConfig setUserConfig = (AssetV2SettingContract$UiIntent.SetUserConfig) assetV2SettingContract$UiIntent;
                InterfaceC41634e<Object> interfaceC41634eM17144l = m19239E().m17144l(setUserConfig.getCurrency(), setUserConfig.getBalanceCurrency());
                C109403 c109403 = new C109403(assetV2SettingContract$UiIntent, this, null);
                c109382.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SettingContract$UiIntent);
                c109382.label = 3;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17144l, false, c109403, c109382, 1, null);
            } else {
                Unit unit = Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42824e);
            return Unit.INSTANCE;
        }
        if (i12 == 2) {
            ResultKt.throwOnFailure(objM42824e);
        } else {
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
            if (((C19334f) objM42824e).getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.assets.setting.e
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2SettingViewModel.m19238D((UIState) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final List<SelectEntity> m19267F() {
        return (List) this.f18712W.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, 7, null);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: H */
    public final void m19269H() {
        ObservableSource observableSourceCompose;
        Double dM89969g = C41016c.m89969g("USD");
        if (dM89969g == null || Intrinsics.areEqual(dM89969g, 0.0d)) {
            observableSourceCompose = DataInitManager.f21486a.m23669j().m84237b("USD", C41016c.m89965c()).compose(C24217a1.m58389m());
        } else {
            HashMap map = new HashMap();
            map.put(C41016c.m89965c(), dM89969g);
            observableSourceCompose = Observable.just(map);
        }
        ObservableSource observableSourceCompose2 = DataInitManager.f21486a.m23669j().m84236a(C41016c.m89965c()).compose(C24217a1.m58389m());
        final Function2 function2 = new Function2() { // from class: com.kubi.assets.setting.n
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AssetV2SettingViewModel.m19240I((CurrencyPrice) obj, (HashMap) obj2);
            }
        };
        Observable observableZip = Observable.zip(observableSourceCompose2, observableSourceCompose, new BiFunction() { // from class: com.kubi.assets.setting.o
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return AssetV2SettingViewModel.m19242K(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.setting.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SettingViewModel.m19243L(this.f18721b, (Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.assets.setting.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2SettingViewModel.m19245N(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.assets.setting.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SettingViewModel.m19246O(this.f18723b, (Throwable) obj);
            }
        };
        observableZip.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.setting.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetV2SettingViewModel.m19248Q(function3, obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R */
    public final Object m19270R(AssetV2SettingContract$UiIntent.GetData getData, Continuation<? super Unit> continuation) {
        AssetV2SettingViewModel$handleGetDataIntent$1 assetV2SettingViewModel$handleGetDataIntent$1;
        final List list;
        if (continuation instanceof AssetV2SettingViewModel$handleGetDataIntent$1) {
            assetV2SettingViewModel$handleGetDataIntent$1 = (AssetV2SettingViewModel$handleGetDataIntent$1) continuation;
            int i11 = assetV2SettingViewModel$handleGetDataIntent$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetV2SettingViewModel$handleGetDataIntent$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetV2SettingViewModel$handleGetDataIntent$1 = new AssetV2SettingViewModel$handleGetDataIntent$1(this, continuation);
            }
        } else {
            assetV2SettingViewModel$handleGetDataIntent$1 = new AssetV2SettingViewModel$handleGetDataIntent$1(this, continuation);
        }
        Object obj = assetV2SettingViewModel$handleGetDataIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetV2SettingViewModel$handleGetDataIntent$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            if (!AssetExKt.m15129q()) {
                SubAssetEntity subAssetEntity = getData.getSubAssetEntity();
                if (subAssetEntity != null && C27025c.m66566d(subAssetEntity.getHasSubAccount())) {
                    AssetV2SettingEntity assetV2SettingEntity = new AssetV2SettingEntity(null, null, 3);
                    assetV2SettingEntity.setSubAssetEntity(getData.getSubAssetEntity());
                    arrayList.add(assetV2SettingEntity);
                    arrayList.add(new AssetV2SettingEntity(null, null, 4));
                }
                if (getData.getCustomOrderEntity() != null) {
                    AssetV2SettingEntity assetV2SettingEntity2 = new AssetV2SettingEntity(null, null, 7);
                    assetV2SettingEntity2.setSubAssetEntity(getData.getSubAssetEntity());
                    assetV2SettingEntity2.setCustomOrderEntity(getData.getCustomOrderEntity());
                    arrayList.add(assetV2SettingEntity2);
                }
                arrayList.add(new AssetV2SettingEntity(null, null, 5));
                Iterator<T> it = m19267F().iterator();
                while (it.hasNext()) {
                    arrayList.add(new AssetV2SettingEntity((SelectEntity) it.next(), null, 1));
                }
                arrayList.add(new AssetV2SettingEntity(null, null, 4));
                arrayList.add(new AssetV2SettingEntity(null, null, 6));
            }
            InterfaceC41634e<List<FiatCurrencyEntity>> interfaceC41634eM17088J0 = m19239E().m17088J0();
            assetV2SettingViewModel$handleGetDataIntent$1.L$0 = SpillingKt.nullOutSpilledVariable(getData);
            assetV2SettingViewModel$handleGetDataIntent$1.L$1 = arrayList;
            assetV2SettingViewModel$handleGetDataIntent$1.label = 1;
            Object objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17088J0, assetV2SettingViewModel$handleGetDataIntent$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM42830k;
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) assetV2SettingViewModel$handleGetDataIntent$1.L$1;
            ResultKt.throwOnFailure(obj);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            C41016c.m89973k(list2, new Consumer() { // from class: com.kubi.assets.setting.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj2) {
                    AssetV2SettingViewModel.m19249S((String) obj2);
                }
            });
        }
        ConcurrentSkipListMap<String, FiatCurrencyEntity> currencyUnitMap = C41016c.f91251h;
        Intrinsics.checkNotNullExpressionValue(currencyUnitMap, "currencyUnitMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, FiatCurrencyEntity> entry : currencyUnitMap.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "CNY")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            list.add(new AssetV2SettingEntity(null, new FiatCurrency(((FiatCurrencyEntity) entry2.getValue()).getName(), null, ((FiatCurrencyEntity) entry2.getValue()).getIcon(), Intrinsics.areEqual(C41016c.m89965c(), ((FiatCurrencyEntity) entry2.getValue()).getName())), 2));
        }
        updateState(new Function1() { // from class: com.kubi.assets.setting.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AssetV2SettingViewModel.m19250T(list, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final AssetV2Api m19236A() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m19241J(CurrencyPrice currencyPrice, HashMap map) {
        currencyPrice.getPrice().put("USD", Double.valueOf(C27039d.m66646f((Double) map.get(C41016c.m89965c()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final void m19245N(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m19248Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S */
    public static final void m19249S(String str) {
    }
}
