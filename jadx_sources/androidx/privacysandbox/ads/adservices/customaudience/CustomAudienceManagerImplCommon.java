package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.credentials.ExecutorC1980h;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41716o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p743x.C45963a;
import p743x.C45964b;
import p743x.C45965c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CustomAudienceManagerImplCommon.kt */
/* JADX INFO: loaded from: classes34.dex */
@RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 4), @RequiresExtension(extension = 31, version = 9)})
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020 H\u0097@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManager;", "Lx/a;", "customAudienceManager", "<init>", "(Lx/a;)V", "Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "request", "Lx/b;", "convertJoinRequest", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;)Lx/b;", "Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;", "Landroid/adservices/customaudience/LeaveCustomAudienceRequest;", "convertLeaveRequest", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;)Landroid/adservices/customaudience/LeaveCustomAudienceRequest;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "Landroid/adservices/customaudience/CustomAudience;", "convertCustomAudience", "(Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;)Landroid/adservices/customaudience/CustomAudience;", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "input", "Landroid/adservices/common/AdData;", "convertAds", "(Ljava/util/List;)Ljava/util/List;", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "Lx/c;", "convertTrustedSignals", "(Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;)Lx/c;", "", "joinCustomAudience", "(Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "fetchAndJoinCustomAudience", "(Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leaveCustomAudience", "(Landroidx/privacysandbox/ads/adservices/customaudience/LeaveCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lx/a;", "getCustomAudienceManager", "()Lx/a;", "Ext10Impl", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nCustomAudienceManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n314#2,11:160\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon\n*L\n44#1:149,11\n67#1:160,11\n*E\n"})
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {

    @NotNull
    private final C45963a customAudienceManager;

    private final C45965c convertTrustedSignals(TrustedBiddingData input) {
        if (input == null) {
            return null;
        }
        new C45965c.a().m101405b(input.getTrustedBiddingKeys()).m101406c(input.getTrustedBiddingUri()).m101404a();
        return null;
    }

    /* JADX INFO: compiled from: CustomAudienceManagerImplCommon.kt */
    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 10), @RequiresExtension(extension = 31, version = 10)})
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl;", "", "()V", "Companion", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: compiled from: CustomAudienceManagerImplCommon.kt */
        @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion;", "", "<init>", "()V", "Lx/a;", "customAudienceManager", "Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;", "fetchAndJoinCustomAudienceRequest", "", "fetchAndJoinCustomAudience", "(Lx/a;Landroidx/privacysandbox/ads/adservices/customaudience/FetchAndJoinCustomAudienceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nCustomAudienceManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,148:1\n314#2,11:149\n*S KotlinDebug\n*F\n+ 1 CustomAudienceManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudienceManagerImplCommon$Ext10Impl$Companion\n*L\n137#1:149,11\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
            @DoNotInline
            @Nullable
            public final Object fetchAndJoinCustomAudience(@NotNull C45963a c45963a, @NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
                C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
                c41716o.m91142E();
                c45963a.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequest.convertToAdServices$ads_adservices_release(), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
                Object objM91171w = c41716o.m91171w();
                if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
            }
        }

        private Ext10Impl() {
        }
    }

    public CustomAudienceManagerImplCommon(@NotNull C45963a customAudienceManager) {
        Intrinsics.checkNotNullParameter(customAudienceManager, "customAudienceManager");
        this.customAudienceManager = customAudienceManager;
    }

    private final List<AdData> convertAds(List<androidx.privacysandbox.ads.adservices.common.AdData> input) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.privacysandbox.ads.adservices.common.AdData> it = input.iterator();
        while (it.hasNext()) {
            it.next().convertToAdServices$ads_adservices_release();
            arrayList.add(null);
        }
        return arrayList;
    }

    private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience request) {
        android.adservices.customaudience.CustomAudience.Builder builderM1528c = new android.adservices.customaudience.CustomAudience.Builder().setActivationTime(request.getActivationTime()).m1527b(convertAds(request.getAds())).m1528c(request.getBiddingLogicUri());
        request.getBuyer().convertToAdServices$ads_adservices_release();
        android.adservices.customaudience.CustomAudience.Builder builderM1531f = builderM1528c.m1529d(null).m1530e(request.getDailyUpdateUri()).setExpirationTime(request.getExpirationTime()).m1531f(request.getName());
        convertTrustedSignals(request.getTrustedBiddingSignals());
        android.adservices.customaudience.CustomAudience.Builder builderM1532g = builderM1531f.m1532g(null);
        AdSelectionSignals userBiddingSignals = request.getUserBiddingSignals();
        if (userBiddingSignals != null) {
            userBiddingSignals.convertToAdServices$ads_adservices_release();
        }
        builderM1532g.m1533h(null).m1526a();
        Intrinsics.checkNotNullExpressionValue(null, "Builder()\n            .s…s())\n            .build()");
        return null;
    }

    private final C45964b convertJoinRequest(JoinCustomAudienceRequest request) {
        C45964b.a aVar = new C45964b.a();
        convertCustomAudience(request.getCustomAudience());
        aVar.m101403b(null).m101402a();
        Intrinsics.checkNotNullExpressionValue(null, "Builder()\n            .s…ce))\n            .build()");
        return null;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object fetchAndJoinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objFetchAndJoinCustomAudience = Ext10Impl.INSTANCE.fetchAndJoinCustomAudience(customAudienceManagerImplCommon.customAudienceManager, fetchAndJoinCustomAudienceRequest, continuation);
        return objFetchAndJoinCustomAudience == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFetchAndJoinCustomAudience : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object joinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        C45963a customAudienceManager = customAudienceManagerImplCommon.getCustomAudienceManager();
        access$convertJoinRequest(customAudienceManagerImplCommon, joinCustomAudienceRequest);
        customAudienceManager.m101401b(null, new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    public static /* synthetic */ Object leaveCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        customAudienceManagerImplCommon.getCustomAudienceManager().leaveCustomAudience(customAudienceManagerImplCommon.convertLeaveRequest(leaveCustomAudienceRequest), new ExecutorC1980h(), OutcomeReceiverKt.asOutcomeReceiver(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @NotNull
    public final C45963a getCustomAudienceManager() {
        return this.customAudienceManager;
    }

    public static final /* synthetic */ C45964b access$convertJoinRequest(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest) {
        customAudienceManagerImplCommon.convertJoinRequest(joinCustomAudienceRequest);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest request) {
        android.adservices.customaudience.LeaveCustomAudienceRequest.Builder builderM3674a = C3825d.m3674a();
        request.getBuyer().convertToAdServices$ads_adservices_release();
        android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = builderM3674a.setBuyer(null).setName(request.getName()).build();
        Intrinsics.checkNotNullExpressionValue(leaveCustomAudienceRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return leaveCustomAudienceRequestBuild;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object fetchAndJoinCustomAudience(@NotNull FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
        return fetchAndJoinCustomAudience$suspendImpl(this, fetchAndJoinCustomAudienceRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object joinCustomAudience(@NotNull JoinCustomAudienceRequest joinCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
        return joinCustomAudience$suspendImpl(this, joinCustomAudienceRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @DoNotInline
    @Nullable
    public Object leaveCustomAudience(@NotNull LeaveCustomAudienceRequest leaveCustomAudienceRequest, @NotNull Continuation<? super Unit> continuation) {
        return leaveCustomAudience$suspendImpl(this, leaveCustomAudienceRequest, continuation);
    }
}
