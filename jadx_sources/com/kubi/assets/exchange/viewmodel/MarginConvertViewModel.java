package com.kubi.assets.exchange.viewmodel;

import com.google.firebase.messaging.Constants;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.RedeemableEntity;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.exchange.contract.MarginConvertContract$UiIntent;
import com.kubi.assets.exchange.contract.UIState;
import com.kubi.assets.exchange.model.ConvertEntity;
import com.kubi.assets.exchange.model.CurrencyDetail;
import com.kubi.assets.exchange.model.ExchangeRequest;
import com.kubi.assets.exchange.model.MarginConvertItem;
import com.kubi.assets.exchange.model.PositionParam;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p719wa.C45777c;
import p754xa.GroupHeaderItem;
import p754xa.LineItem;
import p754xa.SectionHeaderItem;
import p754xa.TitleHeaderItem;
import p754xa.TokenItem;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import va.C45484a;

/* JADX INFO: compiled from: MarginConvertViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0094@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0018J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0016\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u0014\u0010$\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/exchange/viewmodel/MarginConvertViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "mApi", "getMApi", "mApi$delegate", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMarginConvertList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestConvertSmallAssets", "Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent$MarginConvert;", "(Lcom/kubi/assets/exchange/contract/MarginConvertContract$UiIntent$MarginConvert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToMarginConvertItems", "", "Lcom/kubi/assets/exchange/model/MarginConvertItem;", Constants.MessagePayloadKeys.RAW_DATA, "Lcom/kubi/assets/exchange/model/ConvertEntity;", "isUnifiedAccount", "", "buildExchangeRequest", "Lcom/kubi/assets/exchange/model/ExchangeRequest;", "selectedTokens", "Lcom/kubi/assets/exchange/model/TokenItem;", "initState", "getInitState", "()Lcom/kubi/assets/exchange/contract/MarginConvertContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginConvertViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginConvertViewModel.kt\ncom/kubi/assets/exchange/viewmodel/MarginConvertViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n25#2:191\n26#2:193\n1#3:192\n1#3:194\n774#4:195\n865#4,2:196\n774#4:198\n865#4,2:199\n1869#4:201\n1869#4,2:202\n1870#4:204\n1869#4:205\n1869#4,2:206\n1870#4:208\n1491#4:209\n1516#4,3:210\n1519#4,3:220\n1563#4:226\n1634#4,3:227\n382#5,7:213\n126#6:223\n153#6,2:224\n155#6:230\n*S KotlinDebug\n*F\n+ 1 MarginConvertViewModel.kt\ncom/kubi/assets/exchange/viewmodel/MarginConvertViewModel\n*L\n71#1:191\n71#1:193\n71#1:192\n105#1:195\n105#1:196,2\n108#1:198\n108#1:199,2\n115#1:201\n116#1:202,2\n115#1:204\n141#1:205\n145#1:206,2\n141#1:208\n168#1:209\n168#1:210,3\n168#1:220,3\n175#1:226\n175#1:227,3\n168#1:213,7\n170#1:223\n170#1:224,2\n170#1:230\n*E\n"})
public final class MarginConvertViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f17322X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.viewmodel.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginConvertViewModel.m16536u();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f17323Y = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.exchange.viewmodel.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginConvertViewModel.m16528A();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.exchange.viewmodel.MarginConvertViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: MarginConvertViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.exchange.viewmodel.MarginConvertViewModel", m90122f = "MarginConvertViewModel.kt", m90123i = {0, 1, 2}, m90124l = {46, 49, 53}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C99111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C99111(Continuation<? super C99111> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarginConvertViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: x */
    private final AssetV2Api m16537x() {
        return (AssetV2Api) this.f17322X.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m16538B(MarginConvertContract$UiIntent.MarginConvert marginConvert, Continuation<? super Unit> continuation) throws JSONException {
        MarginConvertViewModel$requestConvertSmallAssets$1 marginConvertViewModel$requestConvertSmallAssets$1;
        if (continuation instanceof MarginConvertViewModel$requestConvertSmallAssets$1) {
            marginConvertViewModel$requestConvertSmallAssets$1 = (MarginConvertViewModel$requestConvertSmallAssets$1) continuation;
            int i11 = marginConvertViewModel$requestConvertSmallAssets$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                marginConvertViewModel$requestConvertSmallAssets$1.label = i11 - Integer.MIN_VALUE;
            } else {
                marginConvertViewModel$requestConvertSmallAssets$1 = new MarginConvertViewModel$requestConvertSmallAssets$1(this, continuation);
            }
        } else {
            marginConvertViewModel$requestConvertSmallAssets$1 = new MarginConvertViewModel$requestConvertSmallAssets$1(this, continuation);
        }
        Object objM17172w0 = marginConvertViewModel$requestConvertSmallAssets$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = marginConvertViewModel$requestConvertSmallAssets$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM17172w0);
            List<TokenItem> selectedList = marginConvert.getSelectedList();
            ExchangeRequest exchangeRequestM16540v = selectedList != null ? m16540v(selectedList) : null;
            if (exchangeRequestM16540v != null) {
                showLoadingDialog();
                AssetV2Api assetV2ApiM16543z = m16543z();
                marginConvertViewModel$requestConvertSmallAssets$1.L$0 = SpillingKt.nullOutSpilledVariable(marginConvert);
                marginConvertViewModel$requestConvertSmallAssets$1.L$1 = SpillingKt.nullOutSpilledVariable(exchangeRequestM16540v);
                marginConvertViewModel$requestConvertSmallAssets$1.L$2 = SpillingKt.nullOutSpilledVariable(exchangeRequestM16540v);
                marginConvertViewModel$requestConvertSmallAssets$1.I$0 = 0;
                marginConvertViewModel$requestConvertSmallAssets$1.label = 1;
                objM17172w0 = assetV2ApiM16543z.m17172w0(exchangeRequestM16540v, marginConvertViewModel$requestConvertSmallAssets$1);
                if (objM17172w0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM17172w0);
        BaseEntity baseEntity = (BaseEntity) objM17172w0;
        hideLoadingDialog();
        if (baseEntity.getSuccess()) {
            C45484a.f102511a.m100444e(true, "success");
            sendSingleEvent(new C45777c());
        } else {
            String str = baseEntity.getMsg() + '(' + baseEntity.getCode() + ')';
            C45484a.f102511a.m100444e(false, str);
            ToastCompat.m66441G(str, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: C */
    public final Object m16539C(Continuation<? super Unit> continuation) {
        MarginConvertViewModel$requestMarginConvertList$1 marginConvertViewModel$requestMarginConvertList$1;
        if (continuation instanceof MarginConvertViewModel$requestMarginConvertList$1) {
            marginConvertViewModel$requestMarginConvertList$1 = (MarginConvertViewModel$requestMarginConvertList$1) continuation;
            int i11 = marginConvertViewModel$requestMarginConvertList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                marginConvertViewModel$requestMarginConvertList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                marginConvertViewModel$requestMarginConvertList$1 = new MarginConvertViewModel$requestMarginConvertList$1(this, continuation);
            }
        } else {
            marginConvertViewModel$requestMarginConvertList$1 = new MarginConvertViewModel$requestMarginConvertList$1(this, continuation);
        }
        MarginConvertViewModel$requestMarginConvertList$1 marginConvertViewModel$requestMarginConvertList$2 = marginConvertViewModel$requestMarginConvertList$1;
        Object objM42824e = marginConvertViewModel$requestMarginConvertList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = marginConvertViewModel$requestMarginConvertList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<List<ConvertEntity>> interfaceC41634eM17140j1 = m16537x().m17140j1();
            MarginConvertViewModel$requestMarginConvertList$2 marginConvertViewModel$requestMarginConvertList$3 = new MarginConvertViewModel$requestMarginConvertList$2(this, null);
            marginConvertViewModel$requestMarginConvertList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17140j1, false, marginConvertViewModel$requestMarginConvertList$3, marginConvertViewModel$requestMarginConvertList$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        if (((C19334f) objM42824e).getThrowable() != null) {
            sendSingleEvent(SingleEvent.C19247c.f35626b);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (m16539C(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (m16538B(r8, r0) == r1) goto L32;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C99111 c99111;
        if (continuation instanceof C99111) {
            c99111 = (C99111) continuation;
            int i11 = c99111.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c99111.label = i11 - Integer.MIN_VALUE;
            } else {
                c99111 = new C99111(continuation);
            }
        } else {
            c99111 = new C99111(continuation);
        }
        Object obj = c99111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c99111.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c99111.L$0 = interfaceC19282d;
            c99111.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c99111) != coroutine_suspended) {
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
        interfaceC19282d = (InterfaceC19282d) c99111.L$0;
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof MarginConvertContract$UiIntent.QueryMarginConvertList) {
            c99111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c99111.label = 2;
        } else {
            if (!(interfaceC19282d instanceof MarginConvertContract$UiIntent.MarginConvert)) {
                return Unit.INSTANCE;
            }
            MarginConvertContract$UiIntent.MarginConvert marginConvert = (MarginConvertContract$UiIntent.MarginConvert) interfaceC19282d;
            c99111.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c99111.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: v */
    public final ExchangeRequest m16540v(List<TokenItem> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            TokenItem tokenItem = (TokenItem) obj;
            Pair pairM90091to = TuplesKt.m90091to(tokenItem.getPositionType(), tokenItem.getPositionTag());
            Object arrayList = linkedHashMap.get(pairM90091to);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(pairM90091to, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            List<TokenItem> list2 = (List) entry.getValue();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (TokenItem tokenItem2 : list2) {
                String currency = tokenItem2.getCurrency();
                BigDecimal availableAmount = tokenItem2.getAvailableAmount();
                arrayList3.add(new CurrencyDetail(currency, availableAmount != null ? availableAmount.toPlainString() : null));
            }
            arrayList2.add(new PositionParam(str, str2, arrayList3));
        }
        return new ExchangeRequest(arrayList2);
    }

    /* JADX INFO: renamed from: w */
    public final List<MarginConvertItem> m16541w(List<ConvertEntity> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ConvertEntity> arrayList2 = new ArrayList();
        for (Object obj : list) {
            ConvertEntity convertEntity = (ConvertEntity) obj;
            if (!z11 && Intrinsics.areEqual(convertEntity.getPositionType(), "MARGIN")) {
                arrayList2.add(obj);
            }
        }
        ArrayList<ConvertEntity> arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((ConvertEntity) obj2).getPositionType(), SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new SectionHeaderItem(C27017c.f54310a.m66516f(R$string.margin_whole_title, new Object[0])));
            SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
            arrayList.add(new TitleHeaderItem(C27041f.m66668h(smallEntityM19164h != null ? smallEntityM19164h.showString() : null)));
            for (ConvertEntity convertEntity2 : arrayList2) {
                List<RedeemableEntity> redeemableList = convertEntity2.getRedeemableList();
                if (redeemableList != null) {
                    for (RedeemableEntity redeemableEntity : redeemableList) {
                        arrayList.add(new TokenItem(redeemableEntity.getCurrency(), redeemableEntity.getAvailableAmount(), redeemableEntity.getEstimatedExchangeAmount(), redeemableEntity.getEstimatedFee(), false, "MARGIN", convertEntity2.getPositionTag()));
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(new LineItem("--"));
            }
            arrayList.add(new SectionHeaderItem(C27017c.f54310a.m66516f(R$string.margin_single_title, new Object[0])));
            SmallEntity smallEntityM19164h2 = AssetsHelper.f18684a.m19164h();
            arrayList.add(new TitleHeaderItem(C27041f.m66668h(smallEntityM19164h2 != null ? smallEntityM19164h2.showString() : null)));
            for (ConvertEntity convertEntity3 : arrayList3) {
                String positionTag = convertEntity3.getPositionTag();
                if (positionTag == null) {
                    positionTag = "";
                }
                arrayList.add(new GroupHeaderItem(positionTag));
                List<RedeemableEntity> redeemableList2 = convertEntity3.getRedeemableList();
                if (redeemableList2 != null) {
                    for (RedeemableEntity redeemableEntity2 : redeemableList2) {
                        arrayList.add(new TokenItem(redeemableEntity2.getCurrency(), redeemableEntity2.getAvailableAmount(), redeemableEntity2.getEstimatedExchangeAmount(), redeemableEntity2.getEstimatedFee(), false, SharedPositionInfo.MARGIN_MODE_ISOLATED, convertEntity3.getPositionTag()));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }

    /* JADX INFO: renamed from: z */
    public final AssetV2Api m16543z() {
        return (AssetV2Api) this.f17323Y.getValue();
    }

    /* JADX INFO: renamed from: A */
    public static final AssetV2Api m16528A() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AssetV2Api m16536u() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
