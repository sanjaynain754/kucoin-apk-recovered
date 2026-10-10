package com.kubi.assets.spot;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.AssetV2EventTracker;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import e60.C37084b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p402kf.C41016c;
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

/* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0010R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/spot/AssetV2SpotViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/spot/AssetV2SpotContract$UiIntent;", "Lcom/kubi/assets/spot/AssetV2SpotContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/spot/AssetV2SpotContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/spot/AssetV2SpotContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetV2SpotViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SpotViewModel.kt\ncom/kubi/assets/spot/AssetV2SpotViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n25#2:146\n26#2:148\n1#3:147\n126#4,2:149\n126#4,2:151\n774#5:153\n865#5,2:154\n*S KotlinDebug\n*F\n+ 1 AssetV2SpotViewModel.kt\ncom/kubi/assets/spot/AssetV2SpotViewModel\n*L\n47#1:146\n47#1:148\n47#1:147\n101#1:149,2\n110#1:151,2\n118#1:153\n118#1:154,2\n*E\n"})
public final class AssetV2SpotViewModel extends BaseStateVM<AssetV2SpotContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18823V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.spot.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetV2SpotViewModel.m19446t();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotViewModel", m90122f = "AssetV2SpotViewModel.kt", m90123i = {0, 1, 2, 3}, m90124l = {42, 55, 69, 75}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class C110291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C110291(Continuation<? super C110291> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetV2SpotViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$2 */
    /* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AccountItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$2", m90122f = "AssetV2SpotViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110302 extends SuspendLambda implements Function2<ArrayList<AccountItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C110302(Continuation<? super C110302> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m19455f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, null, arrayList, null, null, null, 239, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110302 c110302 = AssetV2SpotViewModel.this.new C110302(continuation);
            c110302.L$0 = obj;
            return c110302;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AccountItemEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C110302) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList<AccountItemEntity> spotAssetsSourceList = AssetV2SpotViewModel.this.getState().getSpotAssetsSourceList();
            if (spotAssetsSourceList != null && !spotAssetsSourceList.isEmpty()) {
                AssetV2SpotViewModel.this.sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
            AssetV2SpotViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.spot.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2SpotViewModel.C110302.m19455f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$4 */
    /* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$4", m90122f = "AssetV2SpotViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110314 extends SuspendLambda implements Function2<SpotAccountOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotAccountOverviewEntity spotAccountOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C110314) create(spotAccountOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C110314(Continuation<? super C110314> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m19457f(SpotAccountOverviewEntity spotAccountOverviewEntity, UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, null, null, null, null, spotAccountOverviewEntity, 127, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110314 c110314 = AssetV2SpotViewModel.this.new C110314(continuation);
            c110314.L$0 = obj;
            return c110314;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotAccountOverviewEntity spotAccountOverviewEntity = (SpotAccountOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final SpotAccountOverviewEntity spotAccountOverviewEntityCopy$default = SpotAccountOverviewEntity.copy$default(spotAccountOverviewEntity, null, null, null, null, null, AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency(), C41016c.m89965c(), 31, null);
            AssetV2SpotViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.spot.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2SpotViewModel.C110314.m19457f(spotAccountOverviewEntityCopy$default, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$5 */
    /* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/EarnAccountItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$5", m90122f = "AssetV2SpotViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C110325 extends SuspendLambda implements Function2<ArrayList<EarnAccountItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C110325(Continuation<? super C110325> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final UIState m19459f(ArrayList arrayList, UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, null, null, null, arrayList, null, 191, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110325 c110325 = AssetV2SpotViewModel.this.new C110325(continuation);
            c110325.L$0 = obj;
            return c110325;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<EarnAccountItem> arrayList, Continuation<? super Unit> continuation) {
            return ((C110325) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetV2SpotViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.spot.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetV2SpotViewModel.C110325.m19459f(arrayList, (UIState) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$6 */
    /* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$6", m90122f = "AssetV2SpotViewModel.kt", m90123i = {0, 0}, m90124l = {78}, m90125m = "invokeSuspend", m90126n = {"it", TtmlNode.TEXT_EMPHASIS_MARK_OPEN}, m90127s = {"L$0", "Z$0"})
    @SourceDebugExtension({"SMAP\nAssetV2SpotViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2SpotViewModel.kt\ncom/kubi/assets/spot/AssetV2SpotViewModel$dispatchIntentOnIO$6\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n25#2:146\n26#2:148\n1#3:147\n*S KotlinDebug\n*F\n+ 1 AssetV2SpotViewModel.kt\ncom/kubi/assets/spot/AssetV2SpotViewModel$dispatchIntentOnIO$6\n*L\n87#1:146\n87#1:148\n87#1:147\n*E\n"})
    public static final class C110336 extends SuspendLambda implements Function2<Map<String, ? extends String>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        boolean Z$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: AssetV2SpotViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/data/entity/CoinInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.assets.spot.AssetV2SpotViewModel$dispatchIntentOnIO$6$1", m90122f = "AssetV2SpotViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends CoinInfoEntity>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AssetV2SpotViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AssetV2SpotViewModel assetV2SpotViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = assetV2SpotViewModel;
            }

            /* JADX INFO: renamed from: f */
            public static final UIState m19465f(List list, UIState uIState) {
                return UIState.copy$default(uIState, null, false, false, new CovertFromCoin(true, list), null, null, null, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends CoinInfoEntity> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                final List list = (List) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.updateState(new Function1() { // from class: com.kubi.assets.spot.l0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2SpotViewModel.C110336.AnonymousClass1.m19465f(list, (UIState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends String> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, String>) map, continuation);
        }

        public C110336(Continuation<? super C110336> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: g */
        public static final UIState m19462g(UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, new CovertFromCoin(true, null, 2, null), null, null, null, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
        }

        /* JADX INFO: renamed from: h */
        public static final UIState m19463h(UIState uIState) {
            return UIState.copy$default(uIState, null, false, false, new CovertFromCoin(false, null, 2, null), null, null, null, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C110336 c110336 = AssetV2SpotViewModel.this.new C110336(continuation);
            c110336.L$0 = obj;
            return c110336;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, String> map, Continuation<? super Unit> continuation) {
            return ((C110336) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map map = (Map) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = (String) map.get(TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
                boolean zM66566d = C27025c.m66566d(str != null ? Boxing.boxBoolean(Boolean.parseBoolean(str)) : null);
                if (zM66566d) {
                    InterfaceC41634e interfaceC41634eM17060X0 = AssetV2Api.m17060X0(AssetV2SpotViewModel.this.m19436A(), 0, 1, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(AssetV2SpotViewModel.this, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(map);
                    this.Z$0 = zM66566d;
                    this.label = 1;
                    obj = RetrofitFlowExKt.m42823d(interfaceC41634eM17060X0, false, anonymousClass1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Boxing.boxBoolean(AssetV2SpotViewModel.this.updateState(new Function1() { // from class: com.kubi.assets.spot.k0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AssetV2SpotViewModel.C110336.m19463h((UIState) obj2);
                        }
                    }));
                }
                return Unit.INSTANCE;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetV2SpotViewModel assetV2SpotViewModel = AssetV2SpotViewModel.this;
            if (((C19334f) obj).getThrowable() != null) {
                assetV2SpotViewModel.updateState(new Function1() { // from class: com.kubi.assets.spot.j0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2SpotViewModel.C110336.m19462g((UIState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final AssetV2Api m19436A() {
        return (AssetV2Api) this.f18823V.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static final UIState m19447v(AssetV2SpotContract$UiIntent assetV2SpotContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, ((AssetV2SpotContract$UiIntent.HideOrShowNumber) assetV2SpotContract$UiIntent).getIsChecked(), false, null, null, null, null, null, ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m19448w(AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getCurrencyName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m19449x(AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getCurrencyFullName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final BigDecimal m19450y(AccountItemEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAvailableBalance();
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m19451z(List list, AssetV2SpotContract$UiIntent assetV2SpotContract$UiIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        AssetV2SpotContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2SpotContract$UiIntent.HideSmallOrFilter) assetV2SpotContract$UiIntent;
        return UIState.copy$default(updateState, list, false, hideSmallOrFilter.getChecked(), null, null, hideSmallOrFilter.getKeyword(), null, null, 218, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, false, false, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r11 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r11, false, r3, r4, 1, null) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42824e(r11, false, r3, r4, 1, null) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        if (com.kubi.network.retrofit.utils.RetrofitFlowExKt.m42823d(r11, false, r3, r4) == r0) goto L42;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final AssetV2SpotContract$UiIntent assetV2SpotContract$UiIntent, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        C110291 c110291;
        List listM66558a;
        List listM83009d;
        if (continuation instanceof C110291) {
            c110291 = (C110291) continuation;
            int i11 = c110291.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c110291.label = i11 - Integer.MIN_VALUE;
            } else {
                c110291 = new C110291(continuation);
            }
        } else {
            c110291 = new C110291(continuation);
        }
        C110291 c110292 = c110291;
        Object objM42824e = c110292.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c110292.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            final ArrayList arrayList = null;
            if (assetV2SpotContract$UiIntent instanceof AssetV2SpotContract$UiIntent.FetchSpotAssetsList) {
                InterfaceC41634e<ArrayList<AccountItemEntity>> interfaceC41634eM17138j = m19436A().m17138j("USDT", C41016c.m89965c());
                C110302 c110302 = new C110302(null);
                c110292.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SpotContract$UiIntent);
                c110292.label = 1;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17138j, false, c110302, c110292, 1, null);
            } else if (assetV2SpotContract$UiIntent instanceof AssetV2SpotContract$UiIntent.FetchSpotPnlOverview) {
                InterfaceC41634e<SpotAccountOverviewEntity> interfaceC41634eM17113Z = m19436A().m17113Z();
                C110314 c110314 = new C110314(null);
                c110292.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SpotContract$UiIntent);
                c110292.label = 2;
            } else if (assetV2SpotContract$UiIntent instanceof AssetV2SpotContract$UiIntent.FetchProducts) {
                InterfaceC41634e<ArrayList<EarnAccountItem>> interfaceC41634eM17099R = m19436A().m17099R(MapsKt.hashMapOf(TuplesKt.m90091to("upActive", Boxing.boxBoolean(true))));
                C110325 c110325 = new C110325(null);
                c110292.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SpotContract$UiIntent);
                c110292.label = 3;
            } else if (assetV2SpotContract$UiIntent instanceof AssetV2SpotContract$UiIntent.FetchCovertCoinInfo) {
                InterfaceC41634e<Map<String, String>> interfaceC41634eM17076C0 = m19436A().m17076C0();
                C110336 c110336 = new C110336(null);
                c110292.L$0 = SpillingKt.nullOutSpilledVariable(assetV2SpotContract$UiIntent);
                c110292.label = 4;
            } else if (assetV2SpotContract$UiIntent instanceof AssetV2SpotContract$UiIntent.HideOrShowNumber) {
                C46392a.m102328k(C42153h.f93593a.m92500D(), ((AssetV2SpotContract$UiIntent.HideOrShowNumber) assetV2SpotContract$UiIntent).getIsChecked());
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.spot.b0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2SpotViewModel.m19447v(assetV2SpotContract$UiIntent, (UIState) obj);
                    }
                }));
            } else {
                if (!(assetV2SpotContract$UiIntent instanceof AssetV2SpotContract$UiIntent.HideSmallOrFilter)) {
                    throw new NoWhenBranchMatchedException();
                }
                AssetV2SpotContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AssetV2SpotContract$UiIntent.HideSmallOrFilter) assetV2SpotContract$UiIntent;
                if (hideSmallOrFilter.getIsManual()) {
                    C46392a.m102328k(C42153h.f93593a.m92503G(), hideSmallOrFilter.getChecked());
                }
                ArrayList<AccountItemEntity> spotAssetsSourceList = getState().getSpotAssetsSourceList();
                if (spotAssetsSourceList != null && (listM66558a = C27024b.m66558a(spotAssetsSourceList)) != null && (listM83009d = C37084b.m83009d(listM66558a, hideSmallOrFilter.getKeyword(), new Function1() { // from class: com.kubi.assets.spot.c0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2SpotViewModel.m19448w((AccountItemEntity) obj);
                    }
                }, new Function1() { // from class: com.kubi.assets.spot.d0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2SpotViewModel.m19449x((AccountItemEntity) obj);
                    }
                }, new Function1() { // from class: com.kubi.assets.spot.e0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetV2SpotViewModel.m19450y((AccountItemEntity) obj);
                    }
                })) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listM83009d) {
                        AccountItemEntity accountItemEntity = (AccountItemEntity) obj;
                        if (hideSmallOrFilter.getChecked()) {
                            BigDecimal bigDecimalM89922G = C41014a.m89922G(accountItemEntity.getTotalBalance(), null, 1, null);
                            String currency = accountItemEntity.getCurrency();
                            AssetsHelper assetsHelper = AssetsHelper.f18684a;
                            SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                            BigDecimal bigDecimalM89916A = C41014a.m89916A(bigDecimalM89922G, currency, smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
                            SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                            if (bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                    arrayList = arrayList2;
                }
                updateState(new Function1() { // from class: com.kubi.assets.spot.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2SpotViewModel.m19451z(arrayList, assetV2SpotContract$UiIntent, (UIState) obj2);
                    }
                });
                ArrayList<AccountItemEntity> spotAssetsSourceList2 = getState().getSpotAssetsSourceList();
                if (spotAssetsSourceList2 != null && !spotAssetsSourceList2.isEmpty()) {
                    sendSingleEvent(SingleEvent.C19247c.f35626b);
                }
                Unit unit = Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42824e);
            Throwable throwable = ((C19334f) objM42824e).getThrowable();
            if (throwable != null) {
                AssetV2EventTracker.f17857a.m17555h("v2/account/trade-balances", throwable);
                sendSingleEvent(SingleEvent.C19247c.f35626b);
            }
        } else {
            if (i12 != 2 && i12 != 3) {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM42824e);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AssetV2Api m19446t() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
