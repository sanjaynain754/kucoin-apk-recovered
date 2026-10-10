package repayment;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerProperties;
import i60.InterfaceC38460c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import repayment.ext.C44043i;
import repayment.ext.RepayForAssetsVMExtKt;

/* JADX INFO: compiled from: RepayVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0014J\u000e\u00103\u001a\u0002022\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000202H\u0002J\u001c\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00010\u00132\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\b\u0010;\u001a\u000202H\u0002J\u001c\u0010<\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00010\u00132\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\b\u0010=\u001a\u000202H\u0002JW\u0010>\u001a\u00020\f\"\u0004\b\u0000\u0010?*\b\u0012\u0004\u0012\u0002H?0 2\"\u0010@\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H?\u0012\n\u0012\b\u0012\u0004\u0012\u0002020B\u0012\u0006\u0012\u0004\u0018\u00010C0A2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u0002020EH\u0000¢\u0006\u0004\bG\u0010HR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0!0 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0019¨\u0006J"}, m90084d2 = {"Lrepayment/RepayVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/unify/api/UnifyApi;", "kotlin.jvm.PlatformType", "getApi$BUnifyAccountLib_googleRelease", "()Lcom/kubi/unify/api/UnifyApi;", "api$delegate", "Lkotlin/Lazy;", "preRepayPriceSchedulersJob", "Lkotlinx/coroutines/Job;", "getPreRepayPriceSchedulersJob$BUnifyAccountLib_googleRelease", "()Lkotlinx/coroutines/Job;", "setPreRepayPriceSchedulersJob$BUnifyAccountLib_googleRelease", "(Lkotlinx/coroutines/Job;)V", "internalUIEstimateRepayAmount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getInternalUIEstimateRepayAmount$BUnifyAccountLib_googleRelease", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiEstimateRepayAmount", "Lkotlinx/coroutines/flow/StateFlow;", "getUiEstimateRepayAmount", "()Lkotlinx/coroutines/flow/StateFlow;", "internalUIStateFlow", "Lrepayment/RepayContract$UiState;", "getInternalUIStateFlow$BUnifyAccountLib_googleRelease", "uiStateFlow", "getUiStateFlow", "uiStateTypeChangedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/reflect/KClass;", "getUiStateTypeChangedFlow", "()Lkotlinx/coroutines/flow/Flow;", "_vmEventFlow", "Lrepayment/RepayContract$VMEvent;", "vmEventFlow", "getVmEventFlow", "_selectedAssetListFlow", "", "Lrepayment/UnifyAssetData;", "selectedAssetListFlow", "getSelectedAssetListFlow", "_selectedLiabilityFlow", "Lrepayment/UnifyLiabilityData;", "selectedLiabilityFlow", "getSelectedLiabilityFlow", "onCleared", "", "sendIntent", "intent", "Lrepayment/RepayContract$UiIntent;", "startRepayRequest", "loadUnifyLiabilityAndAssetsData", AppsFlyerProperties.CURRENCY_CODE, "amount", "Ljava/math/BigDecimal;", "updateUiStateFlow", "initLiabilityData", "updateRepayStatusEnable", "startFetch", ExifInterface.GPS_DIRECTION_TRUE, "successCall", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "failedCall", "Lkotlin/Function1;", "", "startFetch$BUnifyAccountLib_googleRelease", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "Companion", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRepayVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n49#2:229\n51#2:233\n46#3:230\n51#3:232\n105#4:231\n1563#5:234\n1634#5,3:235\n*S KotlinDebug\n*F\n+ 1 RepayVM.kt\nrepayment/RepayVM\n*L\n64#1:229\n64#1:233\n64#1:230\n64#1:232\n64#1:231\n137#1:234\n137#1:235,3\n*E\n"})
public final class RepayVM extends ViewModel {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f97237i0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f97238V = LazyKt.lazy(new Function0() { // from class: repayment.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepayVM.m96972q();
        }
    });

    /* JADX INFO: renamed from: W */
    @Nullable
    public InterfaceC41775x1 f97239W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41669n<String> f97240X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41678w<String> f97241Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41669n<InterfaceC44006b> f97242Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC41678w<InterfaceC44006b> f97243a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC41634e<KClass<? extends InterfaceC44006b>> f97244b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC41669n<InterfaceC44007c> f97245c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final InterfaceC41678w<InterfaceC44007c> f97246d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC41669n<List<UnifyAssetData>> f97247e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final InterfaceC41678w<List<UnifyAssetData>> f97248f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final InterfaceC41669n<UnifyLiabilityData> f97249g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC41678w<UnifyLiabilityData> f97250h0;

    /* JADX INFO: compiled from: RepayVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lrepayment/RepayVM$Companion;", "", "<init>", "()V", "PRE_REPAY_PRICE_TIME_MILLIS", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final InterfaceC41678w<InterfaceC44007c> m96973A() {
        return this.f97246d0;
    }

    /* JADX INFO: renamed from: B */
    public final void m96974B(String str, BigDecimal bigDecimal) {
        this.f97249g0.setValue(C44043i.m97121a(str, bigDecimal));
    }

    /* JADX INFO: renamed from: D */
    public final void m96976D(@NotNull InterfaceC44005a intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof InterfaceC44005a.LoadRepayInfo) {
            InterfaceC44005a.LoadRepayInfo loadRepayInfo = (InterfaceC44005a.LoadRepayInfo) intent;
            m96974B(loadRepayInfo.getLiabilityCurrencyCode(), loadRepayInfo.getAmount());
            m96981I();
            m96975C(loadRepayInfo.getLiabilityCurrencyCode(), loadRepayInfo.getAmount());
            return;
        }
        if (intent instanceof InterfaceC44005a.SearchAssets) {
            RepayForAssetsVMExtKt.m97084e(this, ((InterfaceC44005a.SearchAssets) intent).getKeyword());
            return;
        }
        if (intent instanceof InterfaceC44005a.a) {
            m96980H();
            return;
        }
        if (intent instanceof InterfaceC44005a.OnLiabilityListDismiss) {
            RepayForAssetsVMExtKt.m97084e(this, null);
            this.f97249g0.setValue(((InterfaceC44005a.OnLiabilityListDismiss) intent).getSelectedLiability());
        } else if (intent instanceof InterfaceC44005a.OnAssetListDismiss) {
            this.f97247e0.setValue(((InterfaceC44005a.OnAssetListDismiss) intent).m97015a());
        } else if (intent instanceof InterfaceC44005a.b) {
            m96979G();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m96977E(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        this.f97239W = interfaceC41775x1;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final <T> InterfaceC41775x1 m96978F(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> successCall, @NotNull Function1<? super Throwable, Unit> failedCall) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(successCall, "successCall");
        Intrinsics.checkNotNullParameter(failedCall, "failedCall");
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new RepayVM$startFetch$1(interfaceC41634e, successCall, failedCall, null), 2, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m96979G() {
        String currencyCode;
        List<UnifyAssetData> value = this.f97247e0.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            String currencyCode2 = ((UnifyAssetData) it.next()).getCurrencyCode();
            if (currencyCode2 == null) {
                currencyCode2 = "";
            }
            arrayList.add(currencyCode2);
        }
        UnifyLiabilityData value2 = this.f97249g0.getValue();
        if (value2 == null || (currencyCode = value2.getCurrencyCode()) == null) {
            return;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new RepayVM$startRepayRequest$1(arrayList, currencyCode, this, null), 2, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m96980H() {
        RepayForAssetsVMExtKt.m97085f(this, this.f97249g0.getValue(), this.f97247e0.getValue());
    }

    /* JADX INFO: renamed from: I */
    public final void m96981I() {
        if (this.f97242Z.getValue() instanceof InterfaceC44006b.PageEmpty) {
            this.f97242Z.setValue(InterfaceC44006b.c.f97270a);
        }
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC38460c m96982r() {
        return (InterfaceC38460c) this.f97238V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final InterfaceC41669n<String> m96983s() {
        return this.f97240X;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final InterfaceC41669n<InterfaceC44006b> m96984t() {
        return this.f97242Z;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final InterfaceC41775x1 getF97239W() {
        return this.f97239W;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final InterfaceC41678w<List<UnifyAssetData>> m96986v() {
        return this.f97248f0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final InterfaceC41678w<UnifyLiabilityData> m96987w() {
        return this.f97250h0;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC41678w<String> m96988x() {
        return this.f97241Y;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC41678w<InterfaceC44006b> m96989y() {
        return this.f97243a0;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final InterfaceC41634e<KClass<? extends InterfaceC44006b>> m96990z() {
        return this.f97244b0;
    }

    public RepayVM() {
        InterfaceC41669n<String> interfaceC41669nM91009a = C41679x.m91009a("--");
        this.f97240X = interfaceC41669nM91009a;
        this.f97241Y = interfaceC41669nM91009a;
        final InterfaceC41669n<InterfaceC44006b> interfaceC41669nM91009a2 = C41679x.m91009a(InterfaceC44006b.c.f97270a);
        this.f97242Z = interfaceC41669nM91009a2;
        this.f97243a0 = interfaceC41669nM91009a2;
        this.f97244b0 = C41636g.m90939v(new InterfaceC41634e<KClass<? extends InterfaceC44006b>>() { // from class: repayment.RepayVM$special$$inlined$map$1

            /* JADX INFO: renamed from: repayment.RepayVM$special$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RepayVM.kt\nrepayment/RepayVM\n*L\n1#1,49:1\n50#2:50\n64#3:51\n*E\n"})
            public static final class C440002<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f97252b;

                /* JADX INFO: renamed from: repayment.RepayVM$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "repayment.RepayVM$special$$inlined$map$1$2", m90122f = "RepayVM.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                        return C440002.this.emit(null, this);
                    }
                }

                public C440002(InterfaceC41635f interfaceC41635f) {
                    this.f97252b = interfaceC41635f;
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
                        InterfaceC41635f interfaceC41635f = this.f97252b;
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(((InterfaceC44006b) obj).getClass());
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(orCreateKotlinClass, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(InterfaceC41635f<? super KClass<? extends InterfaceC44006b>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41669nM91009a2.collect(new C440002(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        InterfaceC41669n<InterfaceC44007c> interfaceC41669nM91009a3 = C41679x.m91009a(null);
        this.f97245c0 = interfaceC41669nM91009a3;
        this.f97246d0 = interfaceC41669nM91009a3;
        InterfaceC41669n<List<UnifyAssetData>> interfaceC41669nM91009a4 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f97247e0 = interfaceC41669nM91009a4;
        this.f97248f0 = interfaceC41669nM91009a4;
        InterfaceC41669n<UnifyLiabilityData> interfaceC41669nM91009a5 = C41679x.m91009a(null);
        this.f97249g0 = interfaceC41669nM91009a5;
        this.f97250h0 = interfaceC41669nM91009a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC38460c m96972q() {
        return (InterfaceC38460c) C42597a.m93388d().create(InterfaceC38460c.class);
    }

    /* JADX INFO: renamed from: C */
    public final void m96975C(String str, BigDecimal bigDecimal) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new RepayVM$loadUnifyLiabilityAndAssetsData$1(this, str, bigDecimal, null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC41775x1 interfaceC41775x1 = this.f97239W;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }
}
