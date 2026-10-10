package com.kubi.assets.overview.coin;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.IRestfulApi;
import com.kubi.assets.R$color;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.assets.entity.DelistCoinListResp;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.restful.C19321b;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.storage.StorageType;
import com.tencent.qcloud.tuicore.TUIConstants;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42151f;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: compiled from: AssetCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0094@¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00142\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010&\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0014H\u0002J\u001c\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`,H\u0002J\b\u0010-\u001a\u00020\u0017H\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u001eH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00063"}, m90084d2 = {"Lcom/kubi/assets/overview/coin/AssetCoinViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "restfulApi", "Lcom/kubi/assets/IRestfulApi;", "getRestfulApi", "()Lcom/kubi/assets/IRestfulApi;", "restfulApi$delegate", "protocolScope", "Lcom/kubi/assets/utils/ParentCoroutineScope;", "category", "", "keys", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTip", "showList", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AssetCoinEntity;", "isChecked", "", "size", "", "convertSpan", "Landroid/text/SpannableString;", "tip", "handleGetCoinList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeSpotWS", "Lkotlinx/coroutines/Job;", "spotSymbols", "getCoinCache", "Lkotlin/collections/ArrayList;", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "getTradeCode", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "initState", "getInitState", "()Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 6 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 7 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,237:1\n774#2:238\n865#2,2:239\n1563#2:242\n1634#2,3:243\n1869#2:251\n1870#2:259\n1#3:241\n1#3:247\n25#4:246\n26#4:248\n250#5,2:249\n281#5,4:252\n139#6:256\n17#6:257\n178#7:258\n*S KotlinDebug\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel\n*L\n83#1:238\n83#1:239,2\n143#1:242\n143#1:243,3\n219#1:251\n219#1:259\n185#1:247\n185#1:246\n185#1:248\n213#1:249,2\n220#1:252,4\n220#1:256\n220#1:257\n220#1:258\n*E\n"})
public final class AssetCoinViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18262W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.coin.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetCoinViewModel.m18468A();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18263X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.coin.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetCoinViewModel.m18474M();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C42151f f18264Y = new C42151f(C42911a.m94120b());

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final String f18265Z = "asset_coin_cache" + AssetsDepend.f18689a.m19189j().d();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final String f18266a0 = "asset_codes";

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetCoinViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinViewModel", m90122f = "AssetCoinViewModel.kt", m90123i = {0, 1}, m90124l = {61, 71}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C106321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C106321(Continuation<? super C106321> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetCoinViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: J */
    public final String m18493J(ArrayList<AssetCoinEntity> arrayList, boolean z11, int i11) {
        if ((arrayList != null && !arrayList.isEmpty()) || i11 == 0 || !z11) {
            return C27017c.f54310a.m66516f(R$string.no_records, new Object[0]);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_assets_coin_empty_title, new Object[0]);
        String strValueOf = String.valueOf(i11);
        SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
        String str = String.format(strM66516f, Arrays.copyOf(new Object[]{strValueOf, C27041f.m66668h(smallEntityM19164h != null ? smallEntityM19164h.showString() : null)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m18469C(ArrayList arrayList, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: renamed from: D */
    public static final UIState m18470D(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((AssetCoinContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), null, null, 27, null);
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m18471E(ArrayList arrayList, AssetCoinViewModel assetCoinViewModel, String str, int i11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, false, arrayList, assetCoinViewModel.m18489B(str, i11), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final AssetV2Api m18472F() {
        return (AssetV2Api) this.f18262W.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (r1 == r2) goto L31;
     */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18473L(Continuation<? super Unit> continuation) {
        AssetCoinViewModel$handleGetCoinList$1 assetCoinViewModel$handleGetCoinList$1;
        List listEmptyList;
        if (continuation instanceof AssetCoinViewModel$handleGetCoinList$1) {
            assetCoinViewModel$handleGetCoinList$1 = (AssetCoinViewModel$handleGetCoinList$1) continuation;
            int i11 = assetCoinViewModel$handleGetCoinList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetCoinViewModel$handleGetCoinList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetCoinViewModel$handleGetCoinList$1 = new AssetCoinViewModel$handleGetCoinList$1(this, continuation);
            }
        } else {
            assetCoinViewModel$handleGetCoinList$1 = new AssetCoinViewModel$handleGetCoinList$1(this, continuation);
        }
        AssetCoinViewModel$handleGetCoinList$1 assetCoinViewModel$handleGetCoinList$2 = assetCoinViewModel$handleGetCoinList$1;
        Object objM42826g = assetCoinViewModel$handleGetCoinList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetCoinViewModel$handleGetCoinList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<List<DelistCoinListResp>> interfaceC41634eM17137i0 = m18472F().m17137i0();
            assetCoinViewModel$handleGetCoinList$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM17137i0, false, null, assetCoinViewModel$handleGetCoinList$2, 2, null);
            if (objM42826g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42826g);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        if (((C19334f) objM42826g).getThrowable() != null) {
            sendSingleEvent(SingleEvent.C19247c.f35626b);
        }
        return Unit.INSTANCE;
        List<DelistCoinListResp> list = (List) ((C19334f) objM42826g).m42846a();
        if (list != null) {
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (DelistCoinListResp delistCoinListResp : list) {
                listEmptyList.add(new AssetCoinEntity(null, delistCoinListResp.getCurrency(), delistCoinListResp.getCurrency(), "0", null, delistCoinListResp.getBalance(), null, null, "", delistCoinListResp.getCurrencyIcon(), null, null, null, Boxing.boxBoolean(true), 7377, null));
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        InterfaceC41634e interfaceC41634eM17058P0 = AssetV2Api.m17058P0(m18472F(), null, 1, null);
        AssetCoinViewModel$handleGetCoinList$2 assetCoinViewModel$handleGetCoinList$3 = new AssetCoinViewModel$handleGetCoinList$2(this, listEmptyList, null);
        assetCoinViewModel$handleGetCoinList$2.L$0 = SpillingKt.nullOutSpilledVariable(list);
        assetCoinViewModel$handleGetCoinList$2.L$1 = SpillingKt.nullOutSpilledVariable(listEmptyList);
        assetCoinViewModel$handleGetCoinList$2.label = 2;
        objM42826g = RetrofitFlowExKt.m42824e(interfaceC41634eM17058P0, false, assetCoinViewModel$handleGetCoinList$3, assetCoinViewModel$handleGetCoinList$2, 1, null);
    }

    /* JADX INFO: renamed from: M */
    public static final IRestfulApi m18474M() {
        return (IRestfulApi) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(IRestfulApi.class);
    }

    /* JADX INFO: renamed from: B */
    public final SpannableString m18489B(String str, int i11) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, String.valueOf(i11), 0, true, 2, (Object) null);
        int length = String.valueOf(i11).length();
        if (iIndexOf$default < 0) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)), iIndexOf$default, length + iIndexOf$default, 17);
        return spannableString;
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList<AssetCoinEntity> m18490G() {
        String strM102351h = C46396e.m102351h(this.f18265Z, this.f18266a0, "");
        if (strM102351h.length() == 0) {
            return null;
        }
        ArrayList<String> arrayList = (ArrayList) CollectionsKt.toCollection(StringsKt.split$default((CharSequence) strM102351h, new String[]{","}, false, 0, 6, (Object) null), new ArrayList());
        ArrayList<AssetCoinEntity> arrayList2 = new ArrayList<>();
        for (String str : arrayList) {
            String str2 = this.f18265Z;
            C46396e c46396e = C46396e.f104049a;
            AssetCoinEntity assetCoinEntity = (AssetCoinEntity) C46392a.f104043a.m102336j(new StorageId(str2, str, StorageType.Shared, true), AssetCoinEntity.class, null);
            if (assetCoinEntity != null) {
                arrayList2.add(assetCoinEntity);
            }
        }
        return arrayList2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, null, null, 31, null);
    }

    /* JADX INFO: renamed from: I */
    public final IRestfulApi m18492I() {
        return (IRestfulApi) this.f18263X.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final String m18494K(AssetCoinEntity assetCoinEntity) {
        return assetCoinEntity.getCode() + '-' + assetCoinEntity.getQuote();
    }

    /* JADX INFO: renamed from: N */
    public final InterfaceC41775x1 m18495N(String str) {
        return C41696j.m91104d(this.f18264Y, null, null, new AssetCoinViewModel$subscribeSpotWS$1(this, str, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (m18473L(r0) == r1) goto L26;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C106321 c106321;
        final ArrayList<AssetCoinEntity> data;
        List listM66558a;
        if (continuation instanceof C106321) {
            c106321 = (C106321) continuation;
            int i11 = c106321.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c106321.label = i11 - Integer.MIN_VALUE;
            } else {
                c106321 = new C106321(continuation);
            }
        } else {
            c106321 = new C106321(continuation);
        }
        Object obj = c106321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c106321.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c106321.L$0 = interfaceC19282d;
            c106321.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c106321) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c106321.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof AssetCoinContract$UiIntent.GetCoinList)) {
            if (interfaceC19282d instanceof AssetCoinContract$UiIntent.HideOrShowNumber) {
                updateState(new Function1() { // from class: com.kubi.assets.overview.coin.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetCoinViewModel.m18470D(interfaceC19282d, (UIState) obj2);
                    }
                });
            } else if (interfaceC19282d instanceof AssetCoinContract$UiIntent.ToggleSmallAssetsVisibility) {
                AssetCoinContract$UiIntent.ToggleSmallAssetsVisibility toggleSmallAssetsVisibility = (AssetCoinContract$UiIntent.ToggleSmallAssetsVisibility) interfaceC19282d;
                if (toggleSmallAssetsVisibility.getIsChecked()) {
                    ArrayList<AssetCoinEntity> data2 = ((UIState) getState()).getData();
                    if (data2 == null || (listM66558a = C27024b.m66558a(data2)) == null) {
                        data = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listM66558a) {
                            AssetCoinEntity assetCoinEntity = (AssetCoinEntity) obj2;
                            BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(assetCoinEntity.getTotalAmount(), null, 1, null);
                            String code = assetCoinEntity.getCode();
                            AssetsHelper assetsHelper = AssetsHelper.f18684a;
                            SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                            BigDecimal bigDecimalM89916A = C41014a.m89916A(bigDecimalM66535e, code, smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
                            SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                            if (bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0) {
                                arrayList.add(obj2);
                            }
                        }
                        data = new ArrayList<>(arrayList);
                    }
                } else {
                    data = ((UIState) getState()).getData();
                }
                ArrayList<AssetCoinEntity> data3 = ((UIState) getState()).getData();
                final int iM66650j = C27039d.m66650j(data3 != null ? Boxing.boxInt(data3.size()) : null);
                final String strM18493J = m18493J(data, toggleSmallAssetsVisibility.getIsChecked(), iM66650j);
                updateState(new Function1() { // from class: com.kubi.assets.overview.coin.n
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AssetCoinViewModel.m18471E(data, this, strM18493J, iM66650j, (UIState) obj3);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        if (((UIState) getState()).getData() == null) {
            final ArrayList<AssetCoinEntity> arrayListM18490G = m18490G();
            updateState(new Function1() { // from class: com.kubi.assets.overview.coin.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return AssetCoinViewModel.m18469C(arrayListM18490G, (UIState) obj3);
                }
            });
        }
        c106321.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c106321.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final AssetV2Api m18468A() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f18264Y.close();
    }
}
