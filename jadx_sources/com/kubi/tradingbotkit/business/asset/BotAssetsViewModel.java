package com.kubi.tradingbotkit.business.asset;

import androidx.recyclerview.widget.DiffUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.business.coreBusinessTrack.CoreBusinessTrack;
import com.kubi.tradingbotkit.entity.asset.AssetsTotalEntity;
import com.kubi.tradingbotkit.model.assets.AssetsTotalModel;
import com.kubi.tradingbotkit.model.assets.BotAssetsTotalItemModel;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27024b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import l40.C42053a;
import o50.C42972f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
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
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import r50.C43930a;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: BotAssetsViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0094@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0014\u001a\u00020%H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010 \u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/asset/BotAssetsViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsRepository;", "getRepository", "()Lcom/kubi/tradingbotkit/business/asset/BotAssetsRepository;", "initState", "getInitState", "()Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UIState;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "genericDiffListEntity", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$DiffList;", "expend", "", "getShowList", "", "Lcom/kubi/tradingbotkit/model/assets/BotAssetsTotalItemModel;", "totalModel", "Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;", "needCatchException", "getNeedCatchException", "()Z", "changeHideNumber", "list", "Lcom/kubi/tradingbotkit/business/asset/BotAssetsContract$UiIntent$HideOrShowNumber;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBotAssetsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BotAssetsViewModel.kt\ncom/kubi/tradingbotkit/business/asset/BotAssetsViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n49#2:143\n51#2:147\n46#3:144\n51#3:146\n105#4:145\n25#5:148\n26#5:150\n1#6:149\n126#7,2:151\n1563#8:153\n1634#8,3:154\n1563#8:157\n1634#8,3:158\n1563#8:161\n1634#8,3:162\n*S KotlinDebug\n*F\n+ 1 BotAssetsViewModel.kt\ncom/kubi/tradingbotkit/business/asset/BotAssetsViewModel\n*L\n47#1:143\n47#1:147\n47#1:144\n47#1:146\n47#1:145\n65#1:148\n65#1:150\n65#1:149\n77#1:151,2\n97#1:153\n97#1:154,3\n107#1:157\n107#1:158,3\n134#1:161\n134#1:162,3\n*E\n"})
public final class BotAssetsViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final BotAssetsRepository f52223X = new BotAssetsRepository();

    /* JADX INFO: renamed from: Y */
    @Nullable
    public String f52224Y;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: BotAssetsViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsViewModel", m90122f = "BotAssetsViewModel.kt", m90123i = {0}, m90124l = {52}, m90125m = "dispatchIntent", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C260471 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C260471(Continuation<? super C260471> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BotAssetsViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$4 */
    /* JADX INFO: compiled from: BotAssetsViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "totalModel", "Lcom/kubi/tradingbotkit/model/assets/AssetsTotalModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$4", m90122f = "BotAssetsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C260484 extends SuspendLambda implements Function2<AssetsTotalModel, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AssetsTotalModel assetsTotalModel, Continuation<? super Unit> continuation) {
            return ((C260484) create(assetsTotalModel, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C260484(Continuation<? super C260484> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: g */
        public static final UIState m63771g(UIState uIState) {
            return UIState.copy$default(uIState, null, null, false, null, "USDT", null, false, 111, null);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C260484 c260484 = BotAssetsViewModel.this.new C260484(continuation);
            c260484.L$0 = obj;
            return c260484;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            final AssetsTotalModel assetsTotalModel = (AssetsTotalModel) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoreBusinessTrack.f52283a.botAssetsShowTrackEvent(true, null);
            BotAssetsViewModel.this.updateState(new Function1() { // from class: com.kubi.tradingbotkit.business.asset.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BotAssetsViewModel.C260484.m63771g((UIState) obj2);
                }
            });
            final BotAssetsViewModel botAssetsViewModel = BotAssetsViewModel.this;
            botAssetsViewModel.updateState(new Function1() { // from class: com.kubi.tradingbotkit.business.asset.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BotAssetsViewModel.C260484.m63772h(botAssetsViewModel, assetsTotalModel, (UIState) obj2);
                }
            });
            BotAssetsViewModel.this.send(new C26049a(true));
            C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        public static final UIState m63772h(BotAssetsViewModel botAssetsViewModel, AssetsTotalModel assetsTotalModel, UIState uIState) {
            return UIState.copy$default(uIState, botAssetsViewModel.m63768z(assetsTotalModel), null, false, assetsTotalModel.getAssetOverViewModel(), null, assetsTotalModel, assetsTotalModel.getCanExpend(), 22, null);
        }
    }

    @Override // com.kubi.mvi.state.AbstractC19290l, com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m63760t() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final UIState m63761u(InterfaceC19282d interfaceC19282d, List list, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, list, null, ((BotAssetsContract$UiIntent.HideOrShowNumber) interfaceC19282d).getHideNumber(), null, null, null, false, 122, null);
    }

    /* JADX INFO: renamed from: v */
    public static final UIState m63762v(DiffList diffList, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, diffList, false, null, null, null, false, 125, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m63763A(@Nullable String str) {
        this.f52224Y = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) throws JSONException {
        C260471 c260471;
        if (continuation instanceof C260471) {
            c260471 = (C260471) continuation;
            int i11 = c260471.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c260471.label = i11 - Integer.MIN_VALUE;
            } else {
                c260471 = new C260471(continuation);
            }
        } else {
            c260471 = new C260471(continuation);
        }
        C260471 c260472 = c260471;
        Object objM42824e = c260472.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c260472.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            if (interfaceC19282d instanceof BotAssetsContract$UiIntent.GetAssetTotal) {
                if (!TradingBotKitDepend.m64273f().c()) {
                    C42972f.m94366b(new Function0() { // from class: com.kubi.tradingbotkit.business.asset.q
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotAssetsViewModel.m63760t();
                        }
                    });
                    return Unit.INSTANCE;
                }
                final InterfaceC41634e<AssetsTotalEntity> interfaceC41634eM63788d = this.f52223X.m63788d();
                InterfaceC41634e<AssetsTotalModel> interfaceC41634e = new InterfaceC41634e<AssetsTotalModel>() { // from class: com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 BotAssetsViewModel.kt\ncom/kubi/tradingbotkit/business/asset/BotAssetsViewModel\n*L\n1#1,49:1\n50#2:50\n48#3,4:51\n*E\n"})
                    public static final class C260462<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f52227b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ BotAssetsViewModel f52228c;

                        /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.asset.BotAssetsViewModel$dispatchIntent$$inlined$map$1$2", m90122f = "BotAssetsViewModel.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C260462.this.emit(null, this);
                            }
                        }

                        public C260462(InterfaceC41635f interfaceC41635f, BotAssetsViewModel botAssetsViewModel) {
                            this.f52227b = interfaceC41635f;
                            this.f52228c = botAssetsViewModel;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.f52227b;
                                C43930a c43930a = new C43930a();
                                this.f52228c.m63763A("USDT");
                                c43930a.m96853f(this.f52228c.getF52224Y());
                                AssetsTotalModel assetsTotalModelM96852e = c43930a.m96852e((AssetsTotalEntity) obj);
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(assetsTotalModelM96852e, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    public Object collect(InterfaceC41635f<? super AssetsTotalModel> interfaceC41635f, Continuation continuation2) {
                        Object objCollect = interfaceC41634eM63788d.collect(new C260462(interfaceC41635f, this), continuation2);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                C260484 c260484 = new C260484(null);
                c260472.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c260472.label = 1;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634e, false, c260484, c260472, 1, null);
                if (objM42824e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC19282d instanceof BotAssetsContract$UiIntent.HideOrShowNumber) {
                BotAssetsContract$UiIntent.HideOrShowNumber hideOrShowNumber = (BotAssetsContract$UiIntent.HideOrShowNumber) interfaceC19282d;
                C46392a.m102328k(IAssetsCenterService.f16464a.get().mo15354t(), hideOrShowNumber.getHideNumber());
                AssetsTotalModel totalModel = ((UIState) getState()).getTotalModel();
                if (totalModel != null) {
                    final List<BotAssetsTotalItemModel> listM63764s = m63764s(C27024b.m66560c(m63768z(totalModel)), hideOrShowNumber);
                    Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.tradingbotkit.business.asset.r
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BotAssetsViewModel.m63761u(interfaceC19282d, listM63764s, (UIState) obj);
                        }
                    }));
                }
            } else if (interfaceC19282d instanceof BotAssetsContract$UiIntent.ExpendList) {
                BotAssetsContract$UiIntent.ExpendList expendList = (BotAssetsContract$UiIntent.ExpendList) interfaceC19282d;
                C27063n.m66773k(expendList.getExpend(), "expend_bot_list");
                final DiffList diffListM63765w = m63765w(expendList.getExpend());
                updateState(new Function1() { // from class: com.kubi.tradingbotkit.business.asset.s
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BotAssetsViewModel.m63762v(diffListM63765w, (UIState) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM42824e);
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            if (throwable instanceof ApiException) {
                CoreBusinessTrack.f52283a.botAssetsShowTrackEvent(false, ((ApiException) throwable).code + ':' + throwable.getMessage());
            } else {
                CoreBusinessTrack.f52283a.botAssetsShowTrackEvent(false, "00030001:" + throwable.getMessage());
            }
            send(new C26049a(false));
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public final List<BotAssetsTotalItemModel> m63764s(List<BotAssetsTotalItemModel> list, BotAssetsContract$UiIntent.HideOrShowNumber hideOrShowNumber) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (BotAssetsTotalItemModel botAssetsTotalItemModel : list) {
            BotAssetsTotalItemModel botAssetsTotalItemModel2 = new BotAssetsTotalItemModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, 0, false, null, null, 67108863, null);
            botAssetsTotalItemModel2.m64241a(botAssetsTotalItemModel);
            botAssetsTotalItemModel2.m64221B(hideOrShowNumber.getHideNumber());
            arrayList.add(botAssetsTotalItemModel2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final DiffList m63765w(boolean z11) {
        ArrayList arrayList;
        List<BotAssetsTotalItemModel> foldList;
        ArrayList arrayList2;
        List<BotAssetsTotalItemModel> expendList;
        DiffList diffList = new DiffList(null, null, 3, null);
        if (z11) {
            AssetsTotalModel totalModel = ((UIState) getState()).getTotalModel();
            if (totalModel == null || (expendList = totalModel.getExpendList()) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(expendList, 10));
                for (BotAssetsTotalItemModel botAssetsTotalItemModel : expendList) {
                    botAssetsTotalItemModel.m64265y(true);
                    botAssetsTotalItemModel.m64221B(IAssetsCenterService.f16464a.get().mo15359y());
                    arrayList2.add(botAssetsTotalItemModel);
                }
            }
            AssetsTotalModel totalModel2 = ((UIState) getState()).getTotalModel();
            diffList.m63780c(DiffUtil.calculateDiff(new C42053a(arrayList2, totalModel2 != null ? totalModel2.getFoldList() : null)));
            diffList.m63781d(arrayList2);
            return diffList;
        }
        AssetsTotalModel totalModel3 = ((UIState) getState()).getTotalModel();
        if (totalModel3 == null || (foldList = totalModel3.getFoldList()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(foldList, 10));
            for (BotAssetsTotalItemModel botAssetsTotalItemModel2 : foldList) {
                botAssetsTotalItemModel2.m64265y(false);
                botAssetsTotalItemModel2.m64221B(IAssetsCenterService.f16464a.get().mo15359y());
                arrayList.add(botAssetsTotalItemModel2);
            }
        }
        AssetsTotalModel totalModel4 = ((UIState) getState()).getTotalModel();
        diffList.m63780c(DiffUtil.calculateDiff(new C42053a(arrayList, totalModel4 != null ? totalModel4.getExpendList() : null)));
        diffList.m63781d(arrayList);
        return diffList;
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getF52224Y() {
        return this.f52224Y;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, null, null, null, false, 127, null);
    }

    /* JADX INFO: renamed from: z */
    public final List<BotAssetsTotalItemModel> m63768z(AssetsTotalModel assetsTotalModel) {
        return C27063n.m66763a("expend_bot_list", true) ? assetsTotalModel.getExpendList() : assetsTotalModel.getFoldList();
    }
}
