package com.kubi.assets.alpha;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.AlphaAssetEntity;
import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import e60.C37084b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: compiled from: AlphaViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0012R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/alpha/AlphaContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAlphaCoinList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRecommendedCoins", "handleNetworkList", "initState", "getInitState", "()Lcom/kubi/assets/alpha/AlphaContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaViewModel.kt\ncom/kubi/assets/alpha/AlphaViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n126#2,2:136\n126#2,2:141\n774#3:138\n865#3,2:139\n25#4:143\n26#4:145\n25#4:146\n26#4:148\n1#5:144\n1#5:147\n*S KotlinDebug\n*F\n+ 1 AlphaViewModel.kt\ncom/kubi/assets/alpha/AlphaViewModel\n*L\n40#1:136,2\n89#1:141,2\n43#1:138\n43#1:139,2\n108#1:143\n108#1:145\n117#1:146\n117#1:148\n108#1:144\n117#1:147\n*E\n"})
public final class AlphaViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f16441W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.alpha.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaViewModel.m15314v();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.alpha.AlphaViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: AlphaViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.alpha.AlphaViewModel", m90122f = "AlphaViewModel.kt", m90123i = {0, 1, 2}, m90124l = {31, 34, 77}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C94711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C94711(Continuation<? super C94711> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AlphaViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final UIState m15300A(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, false, null, false, null, ((AlphaContract$UiIntent.SelectNetwork) interfaceC19282d).getNetwork(), null, 191, null);
    }

    /* JADX INFO: renamed from: B */
    public static final UIState m15301B(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((AlphaContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), null, false, null, null, null, 251, null);
    }

    /* JADX INFO: renamed from: C */
    private final AssetV2Api m15302C() {
        return (AssetV2Api) this.f16441W.getValue();
    }

    /* JADX INFO: renamed from: w */
    public static final String m15315w(AlphaAssetEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getCurrencyName());
    }

    /* JADX INFO: renamed from: x */
    public static final String m15316x(AlphaAssetEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getTokenAddress());
    }

    /* JADX INFO: renamed from: y */
    public static final BigDecimal m15317y(AlphaAssetEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C41014a.m89922G(it.getAvailableBalance(), null, 1, null);
    }

    /* JADX INFO: renamed from: z */
    public static final UIState m15318z(InterfaceC19282d interfaceC19282d, List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        AlphaContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AlphaContract$UiIntent.HideSmallOrFilter) interfaceC19282d;
        return UIState.copy$default(updateState, null, list, false, hideSmallOrFilter.getKeyword(), hideSmallOrFilter.getChecked(), null, null, null, 229, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, null, false, null, null, null, 255, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: E */
    public final Object m15320E(Continuation<? super Unit> continuation) {
        AlphaViewModel$handleAlphaCoinList$1 alphaViewModel$handleAlphaCoinList$1;
        if (continuation instanceof AlphaViewModel$handleAlphaCoinList$1) {
            alphaViewModel$handleAlphaCoinList$1 = (AlphaViewModel$handleAlphaCoinList$1) continuation;
            int i11 = alphaViewModel$handleAlphaCoinList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                alphaViewModel$handleAlphaCoinList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                alphaViewModel$handleAlphaCoinList$1 = new AlphaViewModel$handleAlphaCoinList$1(this, continuation);
            }
        } else {
            alphaViewModel$handleAlphaCoinList$1 = new AlphaViewModel$handleAlphaCoinList$1(this, continuation);
        }
        AlphaViewModel$handleAlphaCoinList$1 alphaViewModel$handleAlphaCoinList$2 = alphaViewModel$handleAlphaCoinList$1;
        Object objM42824e = alphaViewModel$handleAlphaCoinList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = alphaViewModel$handleAlphaCoinList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<List<AlphaAssetEntity>> interfaceC41634eM17108V0 = m15302C().m17108V0();
            AlphaViewModel$handleAlphaCoinList$2 alphaViewModel$handleAlphaCoinList$3 = new AlphaViewModel$handleAlphaCoinList$2(this, null);
            alphaViewModel$handleAlphaCoinList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17108V0, false, alphaViewModel$handleAlphaCoinList$3, alphaViewModel$handleAlphaCoinList$2, 1, null);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: G */
    public final Object m15322G(Continuation<? super Unit> continuation) {
        AlphaViewModel$handleRecommendedCoins$1 alphaViewModel$handleRecommendedCoins$1;
        if (continuation instanceof AlphaViewModel$handleRecommendedCoins$1) {
            alphaViewModel$handleRecommendedCoins$1 = (AlphaViewModel$handleRecommendedCoins$1) continuation;
            int i11 = alphaViewModel$handleRecommendedCoins$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                alphaViewModel$handleRecommendedCoins$1.label = i11 - Integer.MIN_VALUE;
            } else {
                alphaViewModel$handleRecommendedCoins$1 = new AlphaViewModel$handleRecommendedCoins$1(this, continuation);
            }
        } else {
            alphaViewModel$handleRecommendedCoins$1 = new AlphaViewModel$handleRecommendedCoins$1(this, continuation);
        }
        AlphaViewModel$handleRecommendedCoins$1 alphaViewModel$handleRecommendedCoins$2 = alphaViewModel$handleRecommendedCoins$1;
        Object objM42824e = alphaViewModel$handleRecommendedCoins$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = alphaViewModel$handleRecommendedCoins$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e interfaceC41634eM17052F0 = AssetV2Api.m17052F0(m15302C(), null, 1, null);
            AlphaViewModel$handleRecommendedCoins$2 alphaViewModel$handleRecommendedCoins$3 = new AlphaViewModel$handleRecommendedCoins$2(this, null);
            alphaViewModel$handleRecommendedCoins$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17052F0, false, alphaViewModel$handleRecommendedCoins$3, alphaViewModel$handleRecommendedCoins$2, 1, null);
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

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (m15320E(r0) == r1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0196, code lost:
    
        if (m15321F(r0) == r1) goto L92;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C94711 c94711;
        List listM66558a;
        AlphaChainInfo selectedNetwork;
        String displayChain;
        boolean z11;
        AlphaChainInfo selectedNetwork2;
        String displayChain2;
        if (continuation instanceof C94711) {
            c94711 = (C94711) continuation;
            int i11 = c94711.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c94711.label = i11 - Integer.MIN_VALUE;
            } else {
                c94711 = new C94711(continuation);
            }
        } else {
            c94711 = new C94711(continuation);
        }
        Object obj = c94711.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c94711.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c94711.L$0 = interfaceC19282d;
            c94711.label = 1;
            if (super.dispatchIntentOnIO(interfaceC19282d, c94711) != coroutine_suspended) {
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
        interfaceC19282d = (InterfaceC19282d) c94711.L$0;
        ResultKt.throwOnFailure(obj);
        if (!(interfaceC19282d instanceof AlphaContract$UiIntent.GetAlphaCoinList)) {
            if (interfaceC19282d instanceof AlphaContract$UiIntent.HideSmallOrFilter) {
                AlphaContract$UiIntent.HideSmallOrFilter hideSmallOrFilter = (AlphaContract$UiIntent.HideSmallOrFilter) interfaceC19282d;
                if (hideSmallOrFilter.getIsManual()) {
                    C46392a.m102328k(C42153h.f93593a.m92519i(), hideSmallOrFilter.getChecked());
                }
                List<AlphaAssetEntity> data = ((UIState) getState()).getData();
                final List listM83009d = null;
                if (data != null && (listM66558a = C27024b.m66558a(data)) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listM66558a) {
                        AlphaAssetEntity alphaAssetEntity = (AlphaAssetEntity) obj2;
                        String currencyName = alphaAssetEntity.getCurrencyName();
                        if (currencyName == null) {
                            currencyName = "";
                        }
                        if (StringsKt.contains((CharSequence) currencyName, (CharSequence) hideSmallOrFilter.getKeyword(), true)) {
                            selectedNetwork = ((UIState) getState()).getSelectedNetwork();
                            if (selectedNetwork != null) {
                                displayChain = selectedNetwork.getDisplayChain();
                            } else {
                                displayChain = null;
                            }
                            if (!Intrinsics.areEqual(displayChain, alphaAssetEntity.getChain())) {
                                selectedNetwork2 = ((UIState) getState()).getSelectedNetwork();
                                if (selectedNetwork2 != null) {
                                    displayChain2 = selectedNetwork2.getDisplayChain();
                                } else {
                                    displayChain2 = null;
                                }
                                if (displayChain2 == null) {
                                    z11 = false;
                                }
                            }
                            z11 = true;
                        } else {
                            String tokenAddress = alphaAssetEntity.getTokenAddress();
                            if (StringsKt.equals(tokenAddress != null ? tokenAddress : "", hideSmallOrFilter.getKeyword(), true)) {
                                selectedNetwork = ((UIState) getState()).getSelectedNetwork();
                                if (selectedNetwork != null) {
                                    displayChain = selectedNetwork.getDisplayChain();
                                } else {
                                    displayChain = null;
                                }
                                if (!Intrinsics.areEqual(displayChain, alphaAssetEntity.getChain())) {
                                    selectedNetwork2 = ((UIState) getState()).getSelectedNetwork();
                                    if (selectedNetwork2 != null) {
                                        displayChain2 = selectedNetwork2.getDisplayChain();
                                    } else {
                                        displayChain2 = null;
                                    }
                                    if (displayChain2 == null) {
                                        z11 = false;
                                    }
                                }
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (hideSmallOrFilter.getChecked()) {
                            if (z11) {
                                BigDecimal bigDecimalM89922G = C41014a.m89922G(alphaAssetEntity.getBaseAmount(), null, 1, null);
                                String baseCurrency = alphaAssetEntity.getBaseCurrency();
                                AssetsHelper assetsHelper = AssetsHelper.f18684a;
                                SmallEntity smallEntityM19164h = assetsHelper.m19164h();
                                BigDecimal bigDecimalM89916A = C41014a.m89916A(bigDecimalM89922G, baseCurrency, smallEntityM19164h != null ? smallEntityM19164h.getBaseCurrency() : null);
                                SmallEntity smallEntityM19164h2 = assetsHelper.m19164h();
                                if (bigDecimalM89916A.compareTo(smallEntityM19164h2 != null ? smallEntityM19164h2.getQuotaLimit() : null) >= 0) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else if (z11) {
                            arrayList.add(obj2);
                        }
                    }
                    listM83009d = C37084b.m83009d(arrayList, hideSmallOrFilter.getKeyword(), new Function1() { // from class: com.kubi.assets.alpha.t
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return AlphaViewModel.m15315w((AlphaAssetEntity) obj3);
                        }
                    }, new Function1() { // from class: com.kubi.assets.alpha.u
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return AlphaViewModel.m15316x((AlphaAssetEntity) obj3);
                        }
                    }, new Function1() { // from class: com.kubi.assets.alpha.v
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return AlphaViewModel.m15317y((AlphaAssetEntity) obj3);
                        }
                    });
                }
                updateState(new Function1() { // from class: com.kubi.assets.alpha.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AlphaViewModel.m15318z(interfaceC19282d, listM83009d, (UIState) obj3);
                    }
                });
                List<AlphaAssetEntity> data2 = ((UIState) getState()).getData();
                if (data2 != null && !data2.isEmpty()) {
                    sendSingleEvent(SingleEvent.C19247c.f35626b);
                }
            } else if (interfaceC19282d instanceof AlphaContract$UiIntent.GetNetworkList) {
                c94711.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c94711.label = 3;
            } else if (interfaceC19282d instanceof AlphaContract$UiIntent.SelectNetwork) {
                updateState(new Function1() { // from class: com.kubi.assets.alpha.x
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AlphaViewModel.m15300A(interfaceC19282d, (UIState) obj3);
                    }
                });
                send(new AlphaContract$UiIntent.HideSmallOrFilter(((UIState) getState()).getUiHideSmallSwitch(), ((UIState) getState()).getFilterKeywords(), false, 4, null));
            } else if (interfaceC19282d instanceof AlphaContract$UiIntent.HideOrShowNumber) {
                C46392a.m102328k(C42153h.f93593a.m92500D(), ((AlphaContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked());
                updateState(new Function1() { // from class: com.kubi.assets.alpha.y
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AlphaViewModel.m15301B(interfaceC19282d, (UIState) obj3);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        c94711.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c94711.label = 2;
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final AssetV2Api m15314v() {
        return (AssetV2Api) C42597a.m93388d().create(AssetV2Api.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public final Object m15321F(Continuation<? super Unit> continuation) {
        List<AlphaChainInfo> networkList = ((UIState) getState()).getNetworkList();
        if (networkList != null && !networkList.isEmpty()) {
            sendSingleEvent(C9474b.f16445a);
            return Unit.INSTANCE;
        }
        Object objM42824e = RetrofitFlowExKt.m42824e(m15302C().m17083G(), false, new AlphaViewModel$handleNetworkList$2(this, null), continuation, 1, null);
        if (objM42824e == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM42824e;
        }
        return Unit.INSTANCE;
    }
}
