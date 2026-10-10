package com.kubi.assets.margin.cross;

import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.MarginPnlEntity;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
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

/* JADX INFO: compiled from: AssetV2CrossViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0095@¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/margin/cross/AssetV2CrossViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;", "Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkSameCurrency", "checkSame", "", "initState", "getInitState", "()Lcom/kubi/assets/margin/cross/AssetV2CrossContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2CrossViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2CrossViewModel.kt\ncom/kubi/assets/margin/cross/AssetV2CrossViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n126#2,2:124\n126#2,2:129\n25#3:126\n26#3:128\n25#3:134\n26#3:136\n1#4:127\n1#4:135\n774#5:131\n865#5,2:132\n*S KotlinDebug\n*F\n+ 1 AssetV2CrossViewModel.kt\ncom/kubi/assets/margin/cross/AssetV2CrossViewModel\n*L\n38#1:124,2\n54#1:129,2\n46#1:126\n46#1:128\n95#1:134\n95#1:136\n46#1:127\n95#1:135\n58#1:131\n58#1:132,2\n*E\n"})
public final class AssetV2CrossViewModel extends BaseStateVM<AssetV2CrossContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17999V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.cross.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2CrossViewModel.m17863r();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetV2CrossViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossViewModel", m90122f = "AssetV2CrossViewModel.kt", m90123i = {0, 1, 1}, m90124l = {44, 84}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", FirebaseAnalytics.Param.CURRENCY}, m90127s = {"L$0", "L$0", "L$1"})
    public static final class C103901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C103901(Continuation<? super C103901> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2CrossViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossViewModel$dispatchIntentOnIO$3 */
    /* JADX INFO: compiled from: AssetV2CrossViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/margin/api/entity/FundsInfo;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossViewModel$dispatchIntentOnIO$3", m90122f = "AssetV2CrossViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103913 extends SuspendLambda implements Function2<ArrayList<FundsInfo>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C103913(Continuation<? super C103913> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m17873f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, arrayList, null, null, 55, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103913 c103913 = AssetV2CrossViewModel.this.new C103913(continuation);
            c103913.L$0 = obj;
            return c103913;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<FundsInfo> arrayList, Continuation<? super Unit> continuation) {
            return ((C103913) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetV2CrossViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.margin.cross.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2CrossViewModel.C103913.m17873f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.margin.cross.AssetV2CrossViewModel$dispatchIntentOnIO$6 */
    /* JADX INFO: compiled from: AssetV2CrossViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/MarginPnlEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.margin.cross.AssetV2CrossViewModel$dispatchIntentOnIO$6", m90122f = "AssetV2CrossViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103926 extends SuspendLambda implements Function2<MarginPnlEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MarginPnlEntity marginPnlEntity, Continuation<? super Unit> continuation) {
            return ((C103926) create(marginPnlEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C103926(Continuation<? super C103926> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m17875f(MarginPnlEntity marginPnlEntity, UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, null, null, marginPnlEntity, 31, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103926 c103926 = AssetV2CrossViewModel.this.new C103926(continuation);
            c103926.L$0 = obj;
            return c103926;
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
                AssetV2CrossViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.margin.cross.b0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2CrossViewModel.C103926.m17875f(marginPnlEntityCopy$default, (UIState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m17864t(AssetV2CrossViewModel assetV2CrossViewModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        assetV2CrossViewModel.m17869s(z11);
    }

    /* JADX INFO: renamed from: u */
    public static final UIState m17865u(String str, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, false, false, null, null, new MarginPnlEntity(null, null, "MARGIN", str, null, 19, null), 31, null);
    }

    /* JADX INFO: renamed from: w */
    public static final UIState m17866w(AssetV2CrossContract$UiIntent assetV2CrossContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, ((AssetV2CrossContract$UiIntent.HideOrShowNumber) assetV2CrossContract$UiIntent).getIsChecked(), false, null, null, null, 61, null);
    }

    /* JADX INFO: renamed from: x */
    public static final UIState m17867x(List list, AssetV2CrossContract$UiIntent assetV2CrossContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        AssetV2CrossContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2CrossContract$UiIntent.HideSmallOrFilter) assetV2CrossContract$UiIntent;
        return UIState.copy$default(updateState, list, false, hideSmallOrFilter.getChecked(), null, hideSmallOrFilter.getKeyword(), null, 42, null);
    }

    /* JADX INFO: renamed from: y */
    private final AssetV2Api m17868y() {
        return (AssetV2Api) this.f17999V.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX INFO: renamed from: s */
    public final void m17869s(boolean z11) {
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
            updateState(new Function1() { // from class: com.kubi.assets.margin.cross.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetV2CrossViewModel.m17865u(balanceCurrency, (UIState) obj);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r12 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        if (r12 == r0) goto L67;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final AssetV2CrossContract$UiIntent assetV2CrossContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C103901 c103901;
        List listM66558a;
        if (continuation instanceof C103901) {
            c103901 = (C103901) continuation;
            int i11 = c103901.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c103901.label = i11 - Integer.MIN_VALUE;
            } else {
                c103901 = new C103901(continuation);
            }
        } else {
            c103901 = new C103901(continuation);
        }
        C103901 c103902 = c103901;
        Object objM42823d = c103902.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c103902.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (!(assetV2CrossContract$UiIntent instanceof AssetV2CrossContract$UiIntent.HideOrShowNumber)) {
                final ArrayList arrayList = null;
                if (assetV2CrossContract$UiIntent instanceof AssetV2CrossContract$UiIntent.FetchCrossAssetsList) {
                    InterfaceC41634e interfaceC41634eM37902k0 = IMarginService.m37902k0(AssetsDepend.f18689a.m19183d(), null, 1, null);
                    C103913 c103913 = new C103913(null);
                    c103902.L$0 = SpillingKt.nullOutSpilledVariable(assetV2CrossContract$UiIntent);
                    c103902.label = 1;
                    objM42823d = RetrofitFlowExKt.m42824e(interfaceC41634eM37902k0, false, c103913, c103902, 1, null);
                } else if (assetV2CrossContract$UiIntent instanceof AssetV2CrossContract$UiIntent.HideSmallOrFilter) {
                    AssetV2CrossContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2CrossContract$UiIntent.HideSmallOrFilter) assetV2CrossContract$UiIntent;
                    if (hideSmallOrFilter.getIsManual()) {
                        C46392a.m102328k(C42153h.f93593a.m92533w(), hideSmallOrFilter.getChecked());
                    }
                    ArrayList<FundsInfo> crossAssetsSourceList = getState().getCrossAssetsSourceList();
                    if (crossAssetsSourceList != null && (listM66558a = C27024b.m66558a(crossAssetsSourceList)) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listM66558a) {
                            FundsInfo fundsInfo = (FundsInfo) obj;
                            String currencyName = fundsInfo.getCurrencyName();
                            if (currencyName == null) {
                                currencyName = "";
                            }
                            boolean zContains = StringsKt.contains((CharSequence) currencyName, (CharSequence) hideSmallOrFilter.getKeyword(), true);
                            if (hideSmallOrFilter.getChecked()) {
                                if (zContains) {
                                    BigDecimal bigDecimalM89922G = C41014a.m89922G(fundsInfo.getTotalBalance(), null, 1, null);
                                    String currency = fundsInfo.getCurrency();
                                    AssetsHelper assetsHelper = AssetsHelper.f18684a;
                                    SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                                    BigDecimal bigDecimalM89916A = C41014a.m89916A(bigDecimalM89922G, currency, smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
                                    SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                                    if (bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0 || C27039d.m66647g(fundsInfo.getLiability()) > 0.0d) {
                                        arrayList2.add(obj);
                                    }
                                }
                            } else if (zContains) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    updateState(new Function1() { // from class: com.kubi.assets.margin.cross.y
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AssetV2CrossViewModel.m17867x(arrayList, assetV2CrossContract$UiIntent, (UIState) obj2);
                        }
                    });
                    sendSingleEvent(SingleEvent.C19247c.f35626b);
                } else {
                    if (!(assetV2CrossContract$UiIntent instanceof AssetV2CrossContract$UiIntent.FetchMarginPnl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
                    m17864t(this, false, 1, null);
                    InterfaceC41634e interfaceC41634eM17069u = AssetV2Api.m17069u(m17868y(), balanceCurrency, null, 2, null);
                    C103926 c103926 = new C103926(null);
                    c103902.L$0 = SpillingKt.nullOutSpilledVariable(assetV2CrossContract$UiIntent);
                    c103902.L$1 = SpillingKt.nullOutSpilledVariable(balanceCurrency);
                    c103902.label = 2;
                    objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM17069u, false, c103926, c103902);
                }
                return coroutine_suspended;
            }
            C46392a.m102328k(C42153h.f93593a.m92500D(), ((AssetV2CrossContract$UiIntent.HideOrShowNumber) assetV2CrossContract$UiIntent).getIsChecked());
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.margin.cross.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2CrossViewModel.m17866w(assetV2CrossContract$UiIntent, (UIState) obj2);
                }
            }));
        } else if (i12 == 1) {
            ResultKt.throwOnFailure(objM42823d);
            if (((C19334f) objM42823d).getThrowable() != null) {
                sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
            if (((C19334f) objM42823d).getThrowable() != null) {
                m17869s(false);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, false, false, null, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AssetV2Api m17863r() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
