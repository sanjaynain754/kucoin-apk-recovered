package com.kubi.futures.trade.welfare.vm;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialWithDrawPopupInfoEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.tencent.bugly.proguard.C33844oi;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: FuturesTrialViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020(J\u001a\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,J\u0018\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\nJ\u0018\u00102\u001a\u00020(2\u0006\u00103\u001a\u0002002\b\b\u0002\u00101\u001a\u00020\nJ\u0016\u00104\u001a\u00020(2\u000e\u00105\u001a\n\u0012\u0004\u0012\u000200\u0018\u000106J\u000e\u0010\u001f\u001a\u00020(2\u0006\u0010/\u001a\u000200J\u0010\u00107\u001a\u00020(2\u0006\u00108\u001a\u000209H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR%\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR%\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR'\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0019\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\f¨\u0006;"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "manualTriggerExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "allTrialExceptionHandler", "allAirdropExceptionHandler", "loadingDialog", "Landroidx/lifecycle/MutableLiveData;", "", "getLoadingDialog", "()Landroidx/lifecycle/MutableLiveData;", "allTrialLiveData", "Lkotlin/Pair;", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "getAllTrialLiveData", "allAirdropLiveData", "getAllAirdropLiveData", "availableTrialLiveData", "getAvailableTrialLiveData", "activateTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getActivateTrial", "activateAirdrop", "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "getActivateAirdrop", "replaceTrial", "getReplaceTrial", "replaceAirdrop", "getReplaceAirdrop", ChannelKycRequest.SCENE_WITHDRAW, "getWithdraw", "showRiskDialogStatus", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "getShowRiskDialogStatus", "trialErrorMsg", "", "getTrialErrorMsg", "fetchAllTrials", "", "fetchAllAirdrops", "fetchAvailableTrials", "currentPage", "", "pageSize", "activateTrials", "code", "", "forceActivate", "activeAirdrop", "trialCode", "trade", "list", "", "checkRisksOfWithdraw", "e", "Lcom/kubi/network/retrofit/exception/ApiException;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTrialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n47#2,4:306\n47#2,4:310\n47#2,4:314\n1#3:318\n*S KotlinDebug\n*F\n+ 1 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel\n*L\n48#1:306,4\n53#1:310,4\n57#1:314,4\n*E\n"})
public final class FuturesTrialViewModel extends BaseVM {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f24925j0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CoroutineExceptionHandler f24926V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CoroutineExceptionHandler f24927W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CoroutineExceptionHandler f24928X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f24929Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialEntity>> f24930Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialEntity>> f24931a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<FuturesWelfareTrialEntity> f24932b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialItemEntity>> f24933c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Pair<FuturesWelfareTrialItemEntity, AirdropBonusEntity>> f24934d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<Boolean> f24935e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<Boolean> f24936f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<Boolean> f24937g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final MutableLiveData<FuturesWelfareTrialWithDrawPopupInfoEntity> f24938h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final MutableLiveData<Throwable> f24939i0;

    /* JADX INFO: compiled from: FuturesTrialViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel$Companion;", "", "<init>", "()V", "FUTURES_TRIALS_WITHDRAW_ERROR_CODE", "", "ERROR_CODE_DELIMITERS", "ERROR_CODE_KEY_NAME", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel\n*L\n1#1,49:1\n49#2,3:50\n*E\n"})
    public static final class C14418a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FuturesTrialViewModel f24940b;

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C19331c.m42836c(exception, null, 2, null);
            this.f24940b.m28770w().postValue(Boolean.FALSE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14418a(CoroutineExceptionHandler.Companion companion, FuturesTrialViewModel futuresTrialViewModel) {
            super(companion);
            this.f24940b = futuresTrialViewModel;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel\n*L\n1#1,49:1\n54#2,2:50\n*E\n"})
    public static final class C14419b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FuturesTrialViewModel f24941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14419b(CoroutineExceptionHandler.Companion companion, FuturesTrialViewModel futuresTrialViewModel) {
            super(companion);
            this.f24941b = futuresTrialViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f24941b.m28768u().postValue(new Pair<>(Boolean.FALSE, null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel$c */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 FuturesTrialViewModel.kt\ncom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel\n*L\n1#1,49:1\n58#2,2:50\n*E\n"})
    public static final class C14420c extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FuturesTrialViewModel f24942b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14420c(CoroutineExceptionHandler.Companion companion, FuturesTrialViewModel futuresTrialViewModel) {
            super(companion);
            this.f24942b = futuresTrialViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            this.f24942b.m28767t().postValue(new Pair<>(Boolean.FALSE, null));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m28753k(String str) {
        String str2;
        int iLastIndexOf$default;
        String str3;
        List listSplit$default;
        if (str != null) {
            str2 = str;
            iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, "[", 0, false, 6, (Object) null);
        } else {
            str2 = str;
            iLastIndexOf$default = -1;
        }
        int iLastIndexOf$default2 = str2 != null ? StringsKt.lastIndexOf$default((CharSequence) str2, "]", 0, false, 6, (Object) null) : -1;
        if (iLastIndexOf$default != -1 && iLastIndexOf$default2 != -1) {
            if (str2 != null) {
                String strSubstring = str2.substring(iLastIndexOf$default + 1, iLastIndexOf$default2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                str3 = strSubstring;
            } else {
                str3 = null;
            }
            int iLastIndexOf$default3 = str3 != null ? StringsKt.lastIndexOf$default((CharSequence) str3, C33844oi.f71346o, 0, false, 6, (Object) null) : -1;
            if (iLastIndexOf$default3 != -1) {
                if (Intrinsics.areEqual((str3 == null || (listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null)) == null) ? null : (String) listSplit$default.get(0), "Code")) {
                    String strSubstring2 = str3.substring(iLastIndexOf$default3 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    return StringsKt.trim((CharSequence) strSubstring2).toString();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m28751g(FuturesTrialViewModel futuresTrialViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        futuresTrialViewModel.m28759f(str, z11);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m28752i(FuturesTrialViewModel futuresTrialViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        futuresTrialViewModel.m28760h(str, z11);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m28754q(FuturesTrialViewModel futuresTrialViewModel, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1;
        }
        if ((i13 & 2) != 0) {
            i12 = 10;
        }
        futuresTrialViewModel.m28764p(i11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Throwable> m28755A() {
        return this.f24939i0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<Boolean> m28756B() {
        return this.f24937g0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: C */
    public final void m28757C(@Nullable List<String> list) {
        String str;
        Object next;
        String strM102677L = C46527h0.f104291a.m102677L();
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual((String) next, strM102677L));
            str = (String) next;
            if (str == null) {
                str = list != null ? (String) CollectionsKt.getOrNull(list, 0) : null;
            }
        } else {
            str = list != null ? (String) CollectionsKt.getOrNull(list, 0) : null;
        }
        if (str == null || str.length() == 0) {
            InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        } else {
            InterfaceC37754f.a.m85131c(C37304a.f82764a, str, null, null, null, null, null, null, null, null, 510, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m28758D(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f24929Y.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24926V), null, new FuturesTrialViewModel$withdraw$1(code, this, null), 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m28759f(@NotNull String code, boolean z11) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f24929Y.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24926V), null, new FuturesTrialViewModel$activateTrials$1(z11, this, code, null), 2, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m28760h(@NotNull String trialCode, boolean z11) {
        Intrinsics.checkNotNullParameter(trialCode, "trialCode");
        this.f24929Y.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24928X), null, new FuturesTrialViewModel$activeAirdrop$1(z11, this, trialCode, null), 2, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m28761j(ApiException apiException) throws ApiException {
        String str;
        String str2;
        if (!Intrinsics.areEqual(apiException.code, "999999")) {
            throw apiException;
        }
        Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.welfare.vm.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTrialViewModel.m28753k((String) obj);
            }
        };
        String message = apiException.getMessage();
        if (message == null || (str2 = (String) function1.invoke(message)) == null) {
            str = "";
            str2 = null;
        } else {
            str = str2;
        }
        if (str2 == null || str2.length() == 0) {
            throw apiException;
        }
        this.f24938h0.postValue(RepositoryServiceLocator.f19236a.m20292k().mo100567r(str));
    }

    /* JADX INFO: renamed from: n */
    public final void m28762n() {
        this.f24931a0.postValue(new Pair<>(Boolean.TRUE, null));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24928X), null, new FuturesTrialViewModel$fetchAllAirdrops$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m28763o() {
        this.f24930Z.postValue(new Pair<>(Boolean.TRUE, null));
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24927W), null, new FuturesTrialViewModel$fetchAllTrials$1(this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final MutableLiveData<Pair<FuturesWelfareTrialItemEntity, AirdropBonusEntity>> m28765r() {
        return this.f24934d0;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialItemEntity>> m28766s() {
        return this.f24933c0;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialEntity>> m28767t() {
        return this.f24931a0;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialEntity>> m28768u() {
        return this.f24930Z;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final MutableLiveData<FuturesWelfareTrialEntity> m28769v() {
        return this.f24932b0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final MutableLiveData<Boolean> m28770w() {
        return this.f24929Y;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final MutableLiveData<Boolean> m28771x() {
        return this.f24936f0;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final MutableLiveData<Boolean> m28772y() {
        return this.f24935e0;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final MutableLiveData<FuturesWelfareTrialWithDrawPopupInfoEntity> m28773z() {
        return this.f24938h0;
    }

    public FuturesTrialViewModel() {
        CoroutineExceptionHandler.Companion companion = CoroutineExceptionHandler.INSTANCE;
        this.f24926V = new C14418a(companion, this);
        this.f24927W = new C14419b(companion, this);
        this.f24928X = new C14420c(companion, this);
        this.f24929Y = new MutableLiveData<>();
        this.f24930Z = new MutableLiveData<>();
        this.f24931a0 = new MutableLiveData<>();
        this.f24932b0 = new MutableLiveData<>();
        this.f24933c0 = new MutableLiveData<>();
        this.f24934d0 = new MutableLiveData<>();
        this.f24935e0 = new MutableLiveData<>();
        this.f24936f0 = new MutableLiveData<>();
        this.f24937g0 = new MutableLiveData<>();
        this.f24938h0 = new MutableLiveData<>();
        this.f24939i0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: p */
    public final void m28764p(int i11, int i12) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(C37213a.m83254d()), null, new FuturesTrialViewModel$fetchAvailableTrials$1(i11, i12, this, null), 2, null);
    }
}
