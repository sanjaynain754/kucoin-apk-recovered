package com.kubi.assets.main;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.AssetV2EventTracker;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.MainRecommendData;
import com.kubi.assets.entity.MainRecommendDataItem;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.otc.api.IOtcService;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import e60.C37084b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
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
import y70.C46392a;

/* JADX INFO: compiled from: AssetV2MainViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0010R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/main/AssetV2MainViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;", "Lcom/kubi/assets/main/AssetV2MainContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/main/AssetV2MainContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/main/AssetV2MainContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2MainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainViewModel.kt\ncom/kubi/assets/main/AssetV2MainViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n25#2:115\n26#2:117\n1#3:116\n126#4,2:118\n126#4,2:120\n774#5:122\n865#5,2:123\n*S KotlinDebug\n*F\n+ 1 AssetV2MainViewModel.kt\ncom/kubi/assets/main/AssetV2MainViewModel\n*L\n41#1:115\n41#1:117\n41#1:116\n59#1:118,2\n66#1:120,2\n75#1:122\n75#1:123,2\n*E\n"})
public final class AssetV2MainViewModel extends BaseStateVM<AssetV2MainContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17920V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.main.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2MainViewModel.m17714s();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetV2MainViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainViewModel", m90122f = "AssetV2MainViewModel.kt", m90123i = {0, 1, 2, 3}, m90124l = {36, 48, 98, 104}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class C103121 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C103121(Continuation<? super C103121> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2MainViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$2 */
    /* JADX INFO: compiled from: AssetV2MainViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AccountItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$2", m90122f = "AssetV2MainViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103132 extends SuspendLambda implements Function2<ArrayList<AccountItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C103132(Continuation<? super C103132> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m17724f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, null, false, false, arrayList, null, null, false, 239, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103132 c103132 = AssetV2MainViewModel.this.new C103132(continuation);
            c103132.L$0 = obj;
            return c103132;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AccountItemEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C103132) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList<AccountItemEntity> mainAssetsSourceList = AssetV2MainViewModel.this.getState().getMainAssetsSourceList();
            if (mainAssetsSourceList != null && !mainAssetsSourceList.isEmpty()) {
                AssetV2MainViewModel.this.sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
            AssetV2MainViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.main.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2MainViewModel.C103132.m17724f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$4 */
    /* JADX INFO: compiled from: AssetV2MainViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/MainRecommendDataItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$4", m90122f = "AssetV2MainViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetV2MainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2MainViewModel.kt\ncom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1869#2,2:115\n*S KotlinDebug\n*F\n+ 1 AssetV2MainViewModel.kt\ncom/kubi/assets/main/AssetV2MainViewModel$dispatchIntentOnIO$4\n*L\n50#1:115,2\n*E\n"})
    public static final class C103144 extends SuspendLambda implements Function2<List<? extends MainRecommendDataItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MainRecommendDataItem> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MainRecommendDataItem>) list, continuation);
        }

        public C103144(Continuation<? super C103144> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m17726f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, arrayList, false, false, null, null, null, false, ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103144 c103144 = AssetV2MainViewModel.this.new C103144(continuation);
            c103144.L$0 = obj;
            return c103144;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MainRecommendDataItem> list, Continuation<? super Unit> continuation) {
            return ((C103144) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<MainRecommendDataItem> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final ArrayList arrayList = new ArrayList();
            for (MainRecommendDataItem mainRecommendDataItem : list) {
                arrayList.add(new MainRecommendData(mainRecommendDataItem.getType(), mainRecommendDataItem));
            }
            AssetV2MainViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.main.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2MainViewModel.C103144.m17726f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$7 */
    /* JADX INFO: compiled from: AssetV2MainViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EarnAccountItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.main.AssetV2MainViewModel$dispatchIntentOnIO$7", m90122f = "AssetV2MainViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C103157 extends SuspendLambda implements Function2<ArrayList<EarnAccountItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C103157(Continuation<? super C103157> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final UIState m17728f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, null, false, false, null, arrayList, null, false, 223, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C103157 c103157 = AssetV2MainViewModel.this.new C103157(continuation);
            c103157.L$0 = obj;
            return c103157;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EarnAccountItem> arrayList, Continuation<? super Unit> continuation) {
            return ((C103157) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetV2MainViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.main.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2MainViewModel.C103157.m17728f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A */
    private final AssetV2Api m17704A() {
        return (AssetV2Api) this.f17920V.getValue();
    }

    /* JADX INFO: renamed from: u */
    public static final UIState m17715u(AssetV2MainContract$UiIntent assetV2MainContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((AssetV2MainContract$UiIntent.HideOrShowNumber) assetV2MainContract$UiIntent).getIsChecked(), false, null, null, null, false, 251, null);
    }

    /* JADX INFO: renamed from: v */
    public static final String m17716v(AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getCurrencyName());
    }

    /* JADX INFO: renamed from: w */
    public static final String m17717w(AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getCurrencyFullName());
    }

    /* JADX INFO: renamed from: x */
    public static final BigDecimal m17718x(AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAvailableBalance();
    }

    /* JADX INFO: renamed from: y */
    public static final UIState m17719y(List list, AssetV2MainContract$UiIntent assetV2MainContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        AssetV2MainContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2MainContract$UiIntent.HideSmallOrFilter) assetV2MainContract$UiIntent;
        return UIState.copy$default(updateState, list, null, false, hideSmallOrFilter.getChecked(), null, null, hideSmallOrFilter.getKeyword(), false, 182, null);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m17720z(boolean z11, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, false, false, null, null, null, z11, 127, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, false, null, null, null, false, 255, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r10 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r10, false, r2, r4) == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c9, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r10, false, r3, r4, 1, null) == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e2, code lost:
    
        if (r10 == r0) goto L83;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final AssetV2MainContract$UiIntent assetV2MainContract$UiIntent, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        C103121 c103121;
        List listM66558a;
        List listM83009d;
        if (continuation instanceof C103121) {
            c103121 = (C103121) continuation;
            int i11 = c103121.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c103121.label = i11 - Integer.MIN_VALUE;
            } else {
                c103121 = new C103121(continuation);
            }
        } else {
            c103121 = new C103121(continuation);
        }
        C103121 c103122 = c103121;
        Object objMo43959f = c103122.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c103122.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo43959f);
            final ArrayList arrayList = null;
            if (assetV2MainContract$UiIntent instanceof AssetV2MainContract$UiIntent.FetchMainAssetsList) {
                InterfaceC41634e<ArrayList<AccountItemEntity>> interfaceC41634eM17124d = m17704A().m17124d();
                C103132 c103132 = new C103132(null);
                c103122.L$0 = SpillingKt.nullOutSpilledVariable(assetV2MainContract$UiIntent);
                c103122.label = 1;
                objMo43959f = RetrofitFlowExKt.m42824e(interfaceC41634eM17124d, false, c103132, c103122, 1, null);
            } else if (assetV2MainContract$UiIntent instanceof AssetV2MainContract$UiIntent.FetchMainLendCrypto) {
                InterfaceC41634e interfaceC41634eM17047B = AssetV2Api.m17047B(m17704A(), 0, 1, null);
                C103144 c103144 = new C103144(null);
                c103122.L$0 = SpillingKt.nullOutSpilledVariable(assetV2MainContract$UiIntent);
                c103122.label = 2;
            } else if (assetV2MainContract$UiIntent instanceof AssetV2MainContract$UiIntent.HideOrShowNumber) {
                C46392a.m102328k(C42153h.f93593a.m92500D(), ((AssetV2MainContract$UiIntent.HideOrShowNumber) assetV2MainContract$UiIntent).getIsChecked());
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.main.b0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2MainViewModel.m17715u(assetV2MainContract$UiIntent, (UIState) obj);
                    }
                }));
            } else if (assetV2MainContract$UiIntent instanceof AssetV2MainContract$UiIntent.HideSmallOrFilter) {
                AssetV2MainContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2MainContract$UiIntent.HideSmallOrFilter) assetV2MainContract$UiIntent;
                if (hideSmallOrFilter.getIsManual()) {
                    C46392a.m102328k(C42153h.f93593a.m92532v(), hideSmallOrFilter.getChecked());
                }
                ArrayList<AccountItemEntity> mainAssetsSourceList = getState().getMainAssetsSourceList();
                if (mainAssetsSourceList != null && (listM66558a = C27024b.m66558a(mainAssetsSourceList)) != null && (listM83009d = C37084b.m83009d(listM66558a, hideSmallOrFilter.getKeyword(), new Function1() { // from class: com.kubi.assets.main.c0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2MainViewModel.m17716v((AccountItemEntity) obj);
                    }
                }, new Function1() { // from class: com.kubi.assets.main.d0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2MainViewModel.m17717w((AccountItemEntity) obj);
                    }
                }, new Function1() { // from class: com.kubi.assets.main.e0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2MainViewModel.m17718x((AccountItemEntity) obj);
                    }
                })) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listM83009d) {
                        AccountItemEntity accountItemEntity = (AccountItemEntity) obj;
                        if (hideSmallOrFilter.getChecked()) {
                            BigDecimal totalBalance = accountItemEntity.getTotalBalance();
                            String currency = accountItemEntity.getCurrency();
                            AssetsHelper assetsHelper = AssetsHelper.f18684a;
                            SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                            BigDecimal bigDecimalM89916A = C41014a.m89916A(totalBalance, currency, smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
                            SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                            if (bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                    arrayList = arrayList2;
                }
                updateState(new Function1() { // from class: com.kubi.assets.main.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2MainViewModel.m17719y(arrayList, assetV2MainContract$UiIntent, (UIState) obj2);
                    }
                });
                ArrayList<AccountItemEntity> mainAssetsSourceList2 = getState().getMainAssetsSourceList();
                if (mainAssetsSourceList2 != null && !mainAssetsSourceList2.isEmpty()) {
                    sendSingleEvent(SingleEvent.C19247c.f35626b);
                }
                Unit unit = Unit.INSTANCE;
            } else if (assetV2MainContract$UiIntent instanceof AssetV2MainContract$UiIntent.FetchProducts) {
                InterfaceC41634e<ArrayList<EarnAccountItem>> interfaceC41634eM17099R = m17704A().m17099R(MapsKt.hashMapOf(TuplesKt.m90091to("upActive", Boxing.boxBoolean(true))));
                C103157 c103157 = new C103157(null);
                c103122.L$0 = SpillingKt.nullOutSpilledVariable(assetV2MainContract$UiIntent);
                c103122.label = 3;
            } else {
                if (!(assetV2MainContract$UiIntent instanceof AssetV2MainContract$UiIntent.FetchKuCardStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                IOtcService iOtcServiceM19184e = AssetsDepend.f18689a.m19184e();
                c103122.L$0 = SpillingKt.nullOutSpilledVariable(assetV2MainContract$UiIntent);
                c103122.label = 4;
                objMo43959f = iOtcServiceM19184e.mo43959f(false, c103122);
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objMo43959f);
            Throwable throwable = ((C19334f) objMo43959f).getThrowable();
            if (throwable != null) {
                AssetV2EventTracker.f17857a.m17555h("v2/account/main-balances", throwable);
                sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
        } else {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objMo43959f);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(objMo43959f);
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo43959f);
                final boolean zBooleanValue = ((Boolean) objMo43959f).booleanValue();
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.main.g0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2MainViewModel.m17720z(zBooleanValue, (UIState) obj2);
                    }
                }));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AssetV2Api m17714s() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
