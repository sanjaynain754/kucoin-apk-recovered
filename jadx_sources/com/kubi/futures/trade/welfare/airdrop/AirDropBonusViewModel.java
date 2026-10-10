package com.kubi.futures.trade.welfare.airdrop;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import bi.C4622n;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialWithDrawPopupInfoEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseViewModel;
import com.tencent.bugly.proguard.C33844oi;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p725wh.InterfaceC45831a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AirDropBonusDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018J\u0016\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R%\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00150\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirDropBonusViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "api", "Lcom/kubi/futures/data/welfare/IWelfareApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/data/welfare/IWelfareApi;", "api$delegate", "Lkotlin/Lazy;", "retentionAirdropLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "getRetentionAirdropLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showLoading", "getShowLoading", "activateAirdrop", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "getActivateAirdrop", "FUTURES_TRIALS_WITHDRAW_ERROR_CODE", "", "ERROR_CODE_DELIMITERS", "getERROR_CODE_DELIMITERS", "()Ljava/lang/String;", "ERROR_CODE_KEY_NAME", "getERROR_CODE_KEY_NAME", "manualTriggerExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "fetchRetentionAirdropData", "", "code", "activeAirdrop", "side", "checkRisks", "e", "Lcom/kubi/network/retrofit/exception/ApiException;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAirDropBonusDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirDropBonusDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropBonusViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n47#2,4:478\n1#3:482\n*S KotlinDebug\n*F\n+ 1 AirDropBonusDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropBonusViewModel\n*L\n391#1:478,4\n*E\n"})
public final class AirDropBonusViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f24550X = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AirDropBonusViewModel.m28326u();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Pair<Boolean, DistributionRetentionEntity>> f24551Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<Boolean> f24552Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialItemEntity>> f24553a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final String f24554b0 = "999999";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final String f24555c0 = C33844oi.f71346o;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final String f24556d0 = "Code";

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final CoroutineExceptionHandler f24557e0 = new C14199a(CoroutineExceptionHandler.INSTANCE, this);

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.airdrop.AirDropBonusViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AirDropBonusDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropBonusViewModel\n*L\n1#1,49:1\n392#2,3:50\n*E\n"})
    public static final class C14199a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AirDropBonusViewModel f24558b;

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C19331c.m42836c(exception, null, 2, null);
            this.f24558b.m28330B().postValue(Boolean.FALSE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14199a(CoroutineExceptionHandler.Companion companion, AirDropBonusViewModel airDropBonusViewModel) {
            super(companion);
            this.f24558b = airDropBonusViewModel;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final String m28327w(AirDropBonusViewModel airDropBonusViewModel, String str) {
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
                if (Intrinsics.areEqual((str3 == null || (listSplit$default = StringsKt.split$default((CharSequence) str3, new String[]{airDropBonusViewModel.f24555c0}, false, 0, 6, (Object) null)) == null) ? null : (String) listSplit$default.get(0), airDropBonusViewModel.f24556d0)) {
                    String strSubstring2 = str3.substring(iLastIndexOf$default3 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    return StringsKt.trim((CharSequence) strSubstring2).toString();
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC45831a m28328z() {
        return (InterfaceC45831a) this.f24550X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<Pair<Boolean, DistributionRetentionEntity>> m28329A() {
        return this.f24551Y;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<Boolean> m28330B() {
        return this.f24552Z;
    }

    /* JADX INFO: renamed from: t */
    public final void m28331t(@NotNull String code, @NotNull String side) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f24552Z.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b().plus(this.f24557e0), null, new AirDropBonusViewModel$activeAirdrop$1(this, code, side, null), 2, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m28332v(ApiException apiException) throws Throwable {
        String str;
        String str2;
        if (!Intrinsics.areEqual(apiException.code, this.f24554b0)) {
            throw apiException;
        }
        Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.welfare.airdrop.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AirDropBonusViewModel.m28327w(this.f24610b, (String) obj);
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
        FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntityMo100567r = RepositoryServiceLocator.f19236a.m20292k().mo100567r(str);
        String name = C4622n.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C12572a.m23695d(name, new C4622n(futuresWelfareTrialWithDrawPopupInfoEntityMo100567r), 0L, 4, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m28333x(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AirDropBonusViewModel$fetchRetentionAirdropData$1(this, code, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final MutableLiveData<Pair<Boolean, FuturesWelfareTrialItemEntity>> m28334y() {
        return this.f24553a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC45831a m28326u() {
        return (InterfaceC45831a) C42597a.m93387c().create(InterfaceC45831a.class);
    }
}
