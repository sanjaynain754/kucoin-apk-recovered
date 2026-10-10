package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.credentials.ExecutorC1980h;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlinx.coroutines.C41716o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0097@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0097@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0097@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0097@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0097@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0097@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020#H\u0083@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0097@¢\u0006\u0002\u0010(R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006+"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "mAdSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "(Landroid/adservices/adselection/AdSelectionManager;)V", "getMAdSelectionManager", "()Landroid/adservices/adselection/AdSelectionManager;", "getAdSelectionData", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAdSelectionResult", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportEvent", "", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportImpression", "reportImpressionRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAdsInternal", "Landroid/adservices/adselection/AdSelectionOutcome;", "Landroid/adservices/adselection/AdSelectionConfig;", "(Landroid/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdCounterHistogram", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "(Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ext10Impl", "Ext8Impl", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon\n*L\n50#1:231,11\n70#1:242,11\n*E\n"})
public class AdSelectionManagerImplCommon extends AdSelectionManager {

    @NotNull
    private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 */
    /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", m90122f = "AdSelectionManagerImplCommon.kt", m90123i = {}, m90124l = {44}, m90125m = "selectAds$suspendImpl", m90126n = {}, m90127s = {})
    public static final class C37501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C37501(Continuation<? super C37501> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdSelectionManagerImplCommon.selectAds$suspendImpl(AdSelectionManagerImplCommon.this, (AdSelectionConfig) null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object selectAds$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionConfig adSelectionConfig, Continuation<? super AdSelectionOutcome> continuation) {
        C37501 c37501;
        if (continuation instanceof C37501) {
            c37501 = (C37501) continuation;
            int i11 = c37501.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c37501.label = i11 - Integer.MIN_VALUE;
            } else {
                c37501 = adSelectionManagerImplCommon.new C37501(continuation);
            }
        } else {
            c37501 = adSelectionManagerImplCommon.new C37501(continuation);
        }
        Object objSelectAdsInternal = c37501.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c37501.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objSelectAdsInternal);
            android.adservices.adselection.AdSelectionConfig adSelectionConfigConvertToAdServices$ads_adservices_release = adSelectionConfig.convertToAdServices$ads_adservices_release();
            c37501.label = 1;
            objSelectAdsInternal = adSelectionManagerImplCommon.selectAdsInternal(adSelectionConfigConvertToAdServices$ads_adservices_release, c37501);
            if (objSelectAdsInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSelectAdsInternal);
        }
        return new AdSelectionOutcome(C3787s.m3637a(objSelectAdsInternal));
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object selectAds(@NotNull AdSelectionConfig adSelectionConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
        return selectAds$suspendImpl(this, adSelectionConfig, continuation);
    }

    /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 10), @RequiresExtension(extension = 31, version = 10)})
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
        @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0087@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0087@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion;", "", "()V", "getAdSelectionData", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "adSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "getAdSelectionDataRequest", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistAdSelectionResult", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "persistAdSelectionResultRequest", "Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/PersistAdSelectionResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAds", "adSelectionFromOutcomesConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n314#2,11:253\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext10Impl$Companion\n*L\n146#1:231,11\n165#1:242,11\n182#1:253,11\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            @Nullable
            public final Object getAdSelectionData(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull GetAdSelectionDataRequest getAdSelectionDataRequest, @NotNull Continuation<? super GetAdSelectionDataOutcome> continuation) {
                C3748xa603879b c3748xa603879b;
                if (continuation instanceof C3748xa603879b) {
                    c3748xa603879b = (C3748xa603879b) continuation;
                    int i11 = c3748xa603879b.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c3748xa603879b.label = i11 - Integer.MIN_VALUE;
                    } else {
                        c3748xa603879b = new C3748xa603879b(this, continuation);
                    }
                } else {
                    c3748xa603879b = new C3748xa603879b(this, continuation);
                }
                Object objM91171w = c3748xa603879b.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c3748xa603879b.label;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(objM91171w);
                    c3748xa603879b.L$0 = adSelectionManager;
                    c3748xa603879b.L$1 = getAdSelectionDataRequest;
                    c3748xa603879b.label = 1;
                    C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c3748xa603879b), 1);
                    c41716o.m91142E();
                    adSelectionManager.getAdSelectionData(getAdSelectionDataRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
                    objM91171w = c41716o.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c3748xa603879b);
                    }
                    if (objM91171w == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3785r.m3635a(c3748xa603879b.L$0);
                    ResultKt.throwOnFailure(objM91171w);
                }
                return new GetAdSelectionDataOutcome(C3797x.m3647a(objM91171w));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            @Nullable
            public final Object persistAdSelectionResult(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
                C3749x1c76ae90 c3749x1c76ae90;
                if (continuation instanceof C3749x1c76ae90) {
                    c3749x1c76ae90 = (C3749x1c76ae90) continuation;
                    int i11 = c3749x1c76ae90.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c3749x1c76ae90.label = i11 - Integer.MIN_VALUE;
                    } else {
                        c3749x1c76ae90 = new C3749x1c76ae90(this, continuation);
                    }
                } else {
                    c3749x1c76ae90 = new C3749x1c76ae90(this, continuation);
                }
                Object objM91171w = c3749x1c76ae90.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c3749x1c76ae90.label;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(objM91171w);
                    c3749x1c76ae90.L$0 = adSelectionManager;
                    c3749x1c76ae90.L$1 = persistAdSelectionResultRequest;
                    c3749x1c76ae90.label = 1;
                    C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(c3749x1c76ae90), 1);
                    c41716o.m91142E();
                    adSelectionManager.persistAdSelectionResult(persistAdSelectionResultRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
                    objM91171w = c41716o.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c3749x1c76ae90);
                    }
                    if (objM91171w == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3785r.m3635a(c3749x1c76ae90.L$0);
                    ResultKt.throwOnFailure(objM91171w);
                }
                return new AdSelectionOutcome(C3787s.m3637a(objM91171w));
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            @Nullable
            public final Object selectAds(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
                AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1;
                if (continuation instanceof AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = (AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) continuation;
                    int i11 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label = i11 - Integer.MIN_VALUE;
                    } else {
                        adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, continuation);
                    }
                } else {
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 = new AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1(this, continuation);
                }
                Object objM91171w = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label;
                if (i12 == 0) {
                    ResultKt.throwOnFailure(objM91171w);
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$0 = adSelectionManager;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$1 = adSelectionFromOutcomesConfig;
                    adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.label = 1;
                    C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1), 1);
                    c41716o.m91142E();
                    adSelectionManager.selectAds(adSelectionFromOutcomesConfig.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
                    objM91171w = c41716o.m91171w();
                    if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1);
                    }
                    if (objM91171w == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3785r.m3635a(adSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1.L$0);
                    ResultKt.throwOnFailure(objM91171w);
                }
                return new AdSelectionOutcome(C3787s.m3637a(objM91171w));
            }
        }

        private Ext10Impl() {
        }
    }

    /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 8), @RequiresExtension(extension = 31, version = 9)})
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl;", "", "()V", "Companion", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Ext8Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: AdSelectionManagerImplCommon.kt */
        @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0087@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion;", "", "()V", "reportEvent", "", "adSelectionManager", "Landroid/adservices/adselection/AdSelectionManager;", "reportEventRequest", "Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/ReportEventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdCounterHistogram", "updateAdCounterHistogramRequest", "Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;", "(Landroid/adservices/adselection/AdSelectionManager;Landroidx/privacysandbox/ads/adservices/adselection/UpdateAdCounterHistogramRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nAdSelectionManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,230:1\n314#2,11:231\n314#2,11:242\n*S KotlinDebug\n*F\n+ 1 AdSelectionManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adselection/AdSelectionManagerImplCommon$Ext8Impl$Companion\n*L\n204#1:231,11\n219#1:242,11\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            @Nullable
            public final Object reportEvent(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull ReportEventRequest reportEventRequest, @NotNull Continuation<? super Unit> continuation) {
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
                c41716o.m91142E();
                adSelectionManager.reportEvent(reportEventRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
                Object objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
            }

            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            @Nullable
            public final Object updateAdCounterHistogram(@NotNull android.adservices.adselection.AdSelectionManager adSelectionManager, @NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NotNull Continuation<? super Unit> continuation) {
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
                c41716o.m91142E();
                adSelectionManager.updateAdCounterHistogram(updateAdCounterHistogramRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
                Object objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
            }
        }

        private Ext8Impl() {
        }
    }

    public AdSelectionManagerImplCommon(@NotNull android.adservices.adselection.AdSelectionManager mAdSelectionManager) {
        Intrinsics.checkNotNullParameter(mAdSelectionManager, "mAdSelectionManager");
        this.mAdSelectionManager = mAdSelectionManager;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object getAdSelectionData$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation<? super GetAdSelectionDataOutcome> continuation) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.INSTANCE.getAdSelectionData(adSelectionManagerImplCommon.mAdSelectionManager, getAdSelectionDataRequest, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object persistAdSelectionResult$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, Continuation<? super AdSelectionOutcome> continuation) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.INSTANCE.persistAdSelectionResult(adSelectionManagerImplCommon.mAdSelectionManager, persistAdSelectionResultRequest, continuation);
        }
        throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object reportEvent$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, Continuation<? super Unit> continuation) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 8 && adServicesInfo.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objReportEvent = Ext8Impl.INSTANCE.reportEvent(adSelectionManagerImplCommon.mAdSelectionManager, reportEventRequest, continuation);
        return objReportEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objReportEvent : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object reportImpression$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        adSelectionManagerImplCommon.getMAdSelectionManager().reportImpression(reportImpressionRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, Continuation<? super android.adservices.adselection.AdSelectionOutcome> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        getMAdSelectionManager().selectAds(adSelectionConfig, new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object updateAdCounterHistogram$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation<? super Unit> continuation) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 8 && adServicesInfo.extServicesVersionS() < 9) {
            throw new UnsupportedOperationException("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        }
        Object objUpdateAdCounterHistogram = Ext8Impl.INSTANCE.updateAdCounterHistogram(adSelectionManagerImplCommon.mAdSelectionManager, updateAdCounterHistogramRequest, continuation);
        return objUpdateAdCounterHistogram == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateAdCounterHistogram : Unit.INSTANCE;
    }

    @NotNull
    public final android.adservices.adselection.AdSelectionManager getMAdSelectionManager() {
        return this.mAdSelectionManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object selectAds(@NotNull AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
        return selectAds$suspendImpl(this, adSelectionFromOutcomesConfig, continuation);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object selectAds$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation<? super AdSelectionOutcome> continuation) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        return Ext10Impl.INSTANCE.selectAds(adSelectionManagerImplCommon.mAdSelectionManager, adSelectionFromOutcomesConfig, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object getAdSelectionData(@NotNull GetAdSelectionDataRequest getAdSelectionDataRequest, @NotNull Continuation<? super GetAdSelectionDataOutcome> continuation) {
        return getAdSelectionData$suspendImpl(this, getAdSelectionDataRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object persistAdSelectionResult(@NotNull PersistAdSelectionResultRequest persistAdSelectionResultRequest, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
        return persistAdSelectionResult$suspendImpl(this, persistAdSelectionResultRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object reportEvent(@NotNull ReportEventRequest reportEventRequest, @NotNull Continuation<? super Unit> continuation) {
        return reportEvent$suspendImpl(this, reportEventRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object reportImpression(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull Continuation<? super Unit> continuation) {
        return reportImpression$suspendImpl(this, reportImpressionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object updateAdCounterHistogram(@NotNull UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, @NotNull Continuation<? super Unit> continuation) {
        return updateAdCounterHistogram$suspendImpl(this, updateAdCounterHistogramRequest, continuation);
    }
}
