package com.kubi.assets.futures.coins;

import android.text.TextUtils;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.AssetFuturesEntity;
import com.kubi.assets.entity.CoinsEntity;
import com.kubi.assets.entity.FuturesTrialAssets;
import com.kubi.assets.entity.FuturesTrialDetailsEntity;
import com.kubi.assets.entity.FuturesTrialEntity;
import com.kubi.assets.entity.FuturesTrialItemEntity;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import io.chad.library.adapter.base.entity.SectionEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0018R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "futuresTrialVersion", "", "fetchFuturesTrialList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFuturesTrialDetails", "code", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFuturesCoinsContract.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n126#2,2:224\n136#2:226\n49#3:227\n51#3:231\n49#3:238\n51#3:242\n49#3:246\n51#3:250\n46#4:228\n51#4:230\n46#4:239\n51#4:241\n46#4:247\n51#4:249\n105#5:229\n105#5:240\n105#5:248\n25#6:232\n26#6:234\n25#6:235\n26#6:237\n25#6:243\n26#6:245\n25#6:251\n26#6:253\n1#7:233\n1#7:236\n1#7:244\n1#7:252\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n*L\n85#1:224,2\n93#1:226\n97#1:227\n97#1:231\n152#1:238\n152#1:242\n174#1:246\n174#1:250\n97#1:228\n97#1:230\n152#1:239\n152#1:241\n174#1:247\n174#1:249\n97#1:229\n152#1:240\n174#1:248\n113#1:232\n113#1:234\n138#1:235\n138#1:237\n162#1:243\n162#1:245\n215#1:251\n215#1:253\n113#1:233\n138#1:236\n162#1:244\n215#1:252\n*E\n"})
public final class AssetFuturesCoinsContract$AssetFuturesCoinsViewModel extends BaseStateVM<AssetFuturesCoinsContract$UIIntent, UIState> {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17548V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.futures.coins.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFuturesCoinsContract$AssetFuturesCoinsViewModel.m16953v();
        }
    });

    /* JADX INFO: renamed from: W */
    public int f17549W;

    /* JADX INFO: renamed from: B */
    private final AssetV2Api m16944B() {
        return (AssetV2Api) this.f17548V.getValue();
    }

    /* JADX INFO: renamed from: x */
    public static final UIState m16954x(AssetFuturesCoinsContract$UIIntent assetFuturesCoinsContract$UIIntent, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, ((AssetFuturesCoinsContract$UIIntent.HideOrShowNumber) assetFuturesCoinsContract$UIIntent).getIsChecked(), null, null, null, 59, null);
    }

    /* JADX INFO: renamed from: y */
    public static final UIState m16955y(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, false, null, null, null, 31, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: A */
    public final Object m16956A(Continuation<? super Unit> continuation) throws Throwable {
        C10079x81c8fa79 c10079x81c8fa79;
        if (continuation instanceof C10079x81c8fa79) {
            c10079x81c8fa79 = (C10079x81c8fa79) continuation;
            int i11 = c10079x81c8fa79.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c10079x81c8fa79.label = i11 - Integer.MIN_VALUE;
            } else {
                c10079x81c8fa79 = new C10079x81c8fa79(this, continuation);
            }
        } else {
            c10079x81c8fa79 = new C10079x81c8fa79(this, continuation);
        }
        C10079x81c8fa79 c10079x81c8fa710 = c10079x81c8fa79;
        Object objM42824e = c10079x81c8fa710.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c10079x81c8fa710.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            final InterfaceC41634e<FuturesTrialEntity> interfaceC41634eM17128f = m16944B().m17128f("ACTIVATE_FINISHED", 1, 10, "ALL");
            InterfaceC41634e<Boolean> interfaceC41634e = new InterfaceC41634e<Boolean>() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n153#3,3:51\n156#3:55\n158#3,2:57\n295#4:54\n296#4:56\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n*L\n155#1:54\n155#1:56\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f17557b;

                    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$$inlined$map$1$2", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                        this.f17557b = interfaceC41635f;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
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
                            InterfaceC41635f interfaceC41635f = this.f17557b;
                            FuturesTrialEntity futuresTrialEntity = (FuturesTrialEntity) obj;
                            Object objBoxBoolean = null;
                            List<FuturesTrialItemEntity> items = futuresTrialEntity != null ? futuresTrialEntity.getItems() : null;
                            if (items != null) {
                                for (Object obj3 : items) {
                                    if (Intrinsics.areEqual(((FuturesTrialItemEntity) obj3).getStatus(), "ACTIVATE_FINISHED")) {
                                        objBoxBoolean = obj3;
                                        break;
                                    }
                                }
                                objBoxBoolean = Boxing.boxBoolean(((FuturesTrialItemEntity) objBoxBoolean) != null);
                            }
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(objBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(InterfaceC41635f<? super Boolean> interfaceC41635f, Continuation continuation2) {
                    Object objCollect = interfaceC41634eM17128f.collect(new AnonymousClass2(interfaceC41635f), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            C10080x81c8fa7b c10080x81c8fa7b = new C10080x81c8fa7b(this, null);
            c10079x81c8fa710.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634e, false, c10080x81c8fa7b, c10079x81c8fa710, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, false, null, null, null, 63, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (r10 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        if (m16959z(r10, r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        if (m16956A(r4) == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        if (r10 == r0) goto L55;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final AssetFuturesCoinsContract$UIIntent assetFuturesCoinsContract$UIIntent, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C10070xd7fd01ba c10070xd7fd01ba;
        if (continuation instanceof C10070xd7fd01ba) {
            c10070xd7fd01ba = (C10070xd7fd01ba) continuation;
            int i11 = c10070xd7fd01ba.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c10070xd7fd01ba.label = i11 - Integer.MIN_VALUE;
            } else {
                c10070xd7fd01ba = new C10070xd7fd01ba(this, continuation);
            }
        } else {
            c10070xd7fd01ba = new C10070xd7fd01ba(this, continuation);
        }
        C10070xd7fd01ba c10070xd7fd01ba2 = c10070xd7fd01ba;
        Object objM42824e = c10070xd7fd01ba2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c10070xd7fd01ba2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            c10070xd7fd01ba2.L$0 = assetFuturesCoinsContract$UIIntent;
            c10070xd7fd01ba2.label = 1;
            if (super.dispatchIntentOnIO(assetFuturesCoinsContract$UIIntent, c10070xd7fd01ba2) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(objM42824e);
                Throwable throwable = ((C19334f) objM42824e).getThrowable();
                if (throwable != null) {
                    C44128b.m97264h(throwable);
                }
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(objM42824e);
                return Unit.INSTANCE;
            }
            if (i12 == 4) {
                ResultKt.throwOnFailure(objM42824e);
                return Unit.INSTANCE;
            }
            if (i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
            Throwable throwable2 = ((C19334f) objM42824e).getThrowable();
            if (throwable2 != null) {
                C44128b.m97264h(throwable2);
                updateState(new Function1() { // from class: com.kubi.assets.futures.coins.f
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetFuturesCoinsContract$AssetFuturesCoinsViewModel.m16955y((UIState) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        assetFuturesCoinsContract$UIIntent = (AssetFuturesCoinsContract$UIIntent) c10070xd7fd01ba2.L$0;
        ResultKt.throwOnFailure(objM42824e);
        if (!(assetFuturesCoinsContract$UIIntent instanceof AssetFuturesCoinsContract$UIIntent.HideOrShowNumber)) {
            if (assetFuturesCoinsContract$UIIntent instanceof AssetFuturesCoinsContract$UIIntent.FetchFuturesList) {
                boolean zM102322d = C46392a.m102322d(C42153h.f93593a.m92527q(), true);
                final InterfaceC41634e<AssetFuturesEntity> interfaceC41634eM17127e1 = m16944B().m17127e1(AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency(), zM102322d);
                InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(new InterfaceC41634e<Pair<? extends AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>>() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n98#3,2:51\n101#3,4:54\n105#3,2:59\n107#3:62\n108#3:64\n1869#4:53\n1869#4:58\n1870#4:61\n1870#4:63\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n*L\n99#1:53\n104#1:58\n104#1:61\n99#1:63\n*E\n"})
                    public static final class AnonymousClass2<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f17551b;

                        /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$$inlined$map$1$2", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                            this.f17551b = interfaceC41635f;
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
                                InterfaceC41635f interfaceC41635f = this.f17551b;
                                AssetFuturesEntity assetFuturesEntity = (AssetFuturesEntity) obj;
                                ArrayList arrayList = new ArrayList();
                                List<CoinsEntity> items = assetFuturesEntity.getItems();
                                if (items != null) {
                                    for (CoinsEntity coinsEntity : items) {
                                        if (!TextUtils.isEmpty(coinsEntity.getTitle())) {
                                            String title = coinsEntity.getTitle();
                                            Intrinsics.checkNotNull(title);
                                            arrayList.add(new HeaderSection(true, title));
                                        }
                                        List<BalanceEntity> coins = coinsEntity.getCoins();
                                        if (coins != null) {
                                            Iterator<T> it = coins.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(new CoinsSection((BalanceEntity) it.next()));
                                            }
                                        }
                                    }
                                }
                                Pair pair = new Pair(assetFuturesEntity, arrayList);
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(pair, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(InterfaceC41635f<? super Pair<? extends AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>> interfaceC41635f, Continuation continuation2) {
                        Object objCollect = interfaceC41634eM17127e1.collect(new AnonymousClass2(interfaceC41635f), continuation2);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C10071xd7fd01bd(this, null));
                C10072xd7fd01be c10072xd7fd01be = new C10072xd7fd01be(this, null);
                c10070xd7fd01ba2.L$0 = SpillingKt.nullOutSpilledVariable(assetFuturesCoinsContract$UIIntent);
                c10070xd7fd01ba2.Z$0 = zM102322d;
                c10070xd7fd01ba2.label = 2;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90895S, false, c10072xd7fd01be, c10070xd7fd01ba2, 1, null);
            } else if (assetFuturesCoinsContract$UIIntent instanceof AssetFuturesCoinsContract$UIIntent.FetchFuturesTrialDetails) {
                String code = ((AssetFuturesCoinsContract$UIIntent.FetchFuturesTrialDetails) assetFuturesCoinsContract$UIIntent).getCode();
                c10070xd7fd01ba2.L$0 = SpillingKt.nullOutSpilledVariable(assetFuturesCoinsContract$UIIntent);
                c10070xd7fd01ba2.label = 3;
            } else if (assetFuturesCoinsContract$UIIntent instanceof AssetFuturesCoinsContract$UIIntent.FetchTrialList) {
                c10070xd7fd01ba2.L$0 = SpillingKt.nullOutSpilledVariable(assetFuturesCoinsContract$UIIntent);
                c10070xd7fd01ba2.label = 4;
            } else {
                if (!(assetFuturesCoinsContract$UIIntent instanceof AssetFuturesCoinsContract$UIIntent.FetchSpotPnlOverview)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC41634e<SpotAccountOverviewEntity> interfaceC41634eM17164t = m16944B().m17164t();
                C10073xd7fd01c0 c10073xd7fd01c0 = new C10073xd7fd01c0(this, null);
                c10070xd7fd01ba2.L$0 = SpillingKt.nullOutSpilledVariable(assetFuturesCoinsContract$UIIntent);
                c10070xd7fd01ba2.label = 5;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17164t, false, c10073xd7fd01c0, c10070xd7fd01ba2, 1, null);
            }
            return coroutine_suspended;
        }
        C46392a.m102328k(C42153h.f93593a.m92500D(), ((AssetFuturesCoinsContract$UIIntent.HideOrShowNumber) assetFuturesCoinsContract$UIIntent).getIsChecked());
        Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.assets.futures.coins.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetFuturesCoinsContract$AssetFuturesCoinsViewModel.m16954x(assetFuturesCoinsContract$UIIntent, (UIState) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: z */
    public final Object m16959z(String str, Continuation<? super Unit> continuation) throws Throwable {
        C10075x11ce9ec1 c10075x11ce9ec1;
        if (continuation instanceof C10075x11ce9ec1) {
            c10075x11ce9ec1 = (C10075x11ce9ec1) continuation;
            int i11 = c10075x11ce9ec1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c10075x11ce9ec1.label = i11 - Integer.MIN_VALUE;
            } else {
                c10075x11ce9ec1 = new C10075x11ce9ec1(this, continuation);
            }
        } else {
            c10075x11ce9ec1 = new C10075x11ce9ec1(this, continuation);
        }
        C10075x11ce9ec1 c10075x11ce9ec2 = c10075x11ce9ec1;
        Object objM42824e = c10075x11ce9ec2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c10075x11ce9ec2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            this.f17549W++;
            sendSingleEvent(SingleEvent.C19252h.f35631b);
            final InterfaceC41634e<FuturesTrialDetailsEntity> interfaceC41634eM17173w1 = m16944B().m17173w1(str);
            InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(new InterfaceC41634e<FuturesTrialAssets>() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1

                /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AssetFuturesCoinsContract.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel\n*L\n1#1,49:1\n50#2:50\n175#3,34:51\n*E\n"})
                public static final class AnonymousClass2<T> implements InterfaceC41635f {

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ InterfaceC41635f f17554b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel f17555c;

                    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$$inlined$map$1$2", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC41635f interfaceC41635f, AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel) {
                        this.f17554b = interfaceC41635f;
                        this.f17555c = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                    @Override // kotlinx.coroutines.flow.InterfaceC41635f
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        String str;
                        StringBuilder sb2;
                        String strM92640e;
                        BigDecimal bigDecimalAbs;
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
                            InterfaceC41635f interfaceC41635f = this.f17554b;
                            FuturesTrialDetailsEntity futuresTrialDetailsEntity = (FuturesTrialDetailsEntity) obj;
                            String strM66668h = C27041f.m66668h(C27041f.m66677q(futuresTrialDetailsEntity.getCurrency()));
                            IKuMexService iKuMexServiceM19180c = AssetsDepend.m19180c();
                            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(strM66668h);
                            int iM66650j = C27039d.m66650j(Boxing.boxInt(iKuMexServiceM19180c.mo33293w(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null)));
                            StringBuilder sb3 = new StringBuilder();
                            BigDecimal trialFundBalance = futuresTrialDetailsEntity.getTrialFundBalance();
                            sb3.append(trialFundBalance != null ? C42180b.m92640e(trialFundBalance, null, iM66650j, false, true, false, 2, null, 85, null) : null);
                            sb3.append(' ');
                            sb3.append(strM66668h);
                            String string = sb3.toString();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("≈ ");
                            BigDecimal trialFundBalance2 = futuresTrialDetailsEntity.getTrialFundBalance();
                            sb4.append(trialFundBalance2 != null ? C41014a.m89950x(C41014a.m89939m(trialFundBalance2.doubleValue(), strM66668h), null, null, 0, false, false, false, true, 63, null) : null);
                            String string2 = sb4.toString();
                            StringBuilder sb5 = new StringBuilder();
                            BigDecimal realisedPNL = futuresTrialDetailsEntity.getRealisedPNL();
                            if (realisedPNL != null) {
                                str = "≈ ";
                                sb2 = sb5;
                                strM92640e = C42180b.m92640e(realisedPNL, null, iM66650j, false, true, false, 2, null, 85, null);
                            } else {
                                str = "≈ ";
                                sb2 = sb5;
                                strM92640e = null;
                            }
                            sb2.append(strM92640e);
                            sb2.append(' ');
                            sb2.append(strM66668h);
                            String string3 = sb2.toString();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str);
                            BigDecimal realisedPNL2 = futuresTrialDetailsEntity.getRealisedPNL();
                            sb6.append((realisedPNL2 == null || (bigDecimalAbs = realisedPNL2.abs()) == null) ? null : C41014a.m89950x(C41014a.m89939m(bigDecimalAbs.doubleValue(), strM66668h), null, null, 0, false, false, false, true, 63, null));
                            FuturesTrialAssets futuresTrialAssets = new FuturesTrialAssets(string, string2, string3, sb6.toString(), C27039d.m66656p(futuresTrialDetailsEntity.getRealisedPNL()).doubleValue(), this.f17555c.f17549W, null, null, futuresTrialDetailsEntity.getPrizeType(), 192, null);
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(futuresTrialAssets, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(InterfaceC41635f<? super FuturesTrialAssets> interfaceC41635f, Continuation continuation2) {
                    Object objCollect = interfaceC41634eM17173w1.collect(new AnonymousClass2(interfaceC41635f, this), continuation2);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new C10076x11ce9ec3(this, null));
            C10077x11ce9ec4 c10077x11ce9ec4 = new C10077x11ce9ec4(this, null);
            c10075x11ce9ec2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            c10075x11ce9ec2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90895S, false, c10077x11ce9ec4, c10075x11ce9ec2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final AssetV2Api m16953v() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
