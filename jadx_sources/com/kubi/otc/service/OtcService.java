package com.kubi.otc.service;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.api.IOtcService;
import com.kubi.otc.entity.ThirdActivity;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.channel.fiat.SearchFiatFragment;
import com.kubi.payment.kucard.data.entities.KuCardEntranceConfig;
import com.kubi.payment.kucard.helper.KuCardHelper;
import com.kubi.payment.kucoinpay.KuCoinPayHelper;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import ht.C38346y;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OtcService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0097@¢\u0006\u0002\u0010\u0013J*\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0097@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\fH\u0016J0\u0010#\u001a\u00020$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\f0&H\u0016JH\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00192\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010.H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0016\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u00107J\b\u00108\u001a\u00020\u0019H\u0016J,\u00109\u001a\u00020\f2\u0006\u0010\r\u001a\u0002022\u0006\u0010:\u001a\u00020\u00112\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0&H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006<"}, m90084d2 = {"Lcom/kubi/otc/service/OtcService;", "Lcom/kubi/otc/api/IOtcService;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "toPayMethodPage", "", "fragment", "Landroidx/fragment/app/Fragment;", "getSupportFastCurrency", "", "", "legal", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegalAndCoinIcon", "Lkotlin/Pair;", "coin", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRealLowKycLevel", "", "getOtcUserInfo", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "getKycLevel", "", "isHighKycLevel", "merchant", "otcKyc", "clearOtcUserInfo", "thirdActivityObserver", "Lio/reactivex/disposables/Disposable;", "function", "Lkotlin/Function1;", "onError", "", "chooseBuyOrDeposit", "fm", "Landroidx/fragment/app/FragmentManager;", "trackEvent", "onBuyClick", "Lkotlin/Function0;", "onDepositClick", "onCloseClick", "loadFaitSearchFragment", "Lcom/kubi/sdk/BaseFragment;", "etSearch", "Lcom/kubi/resources/widget/ClearEditText;", "loadKuCardEntranceStatus", "forceRefresh", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchKuCard", "checkWhitelistBeforeHandleNonAppInfo", "scanCode", "fallbackHandler", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,220:1\n44#2,2:221\n*S KotlinDebug\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService\n*L\n60#1:221,2\n*E\n"})
public final class OtcService implements IOtcService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f38128b = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.service.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcService.m45442t();
        }
    });

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$a */
    /* JADX INFO: compiled from: OtcService.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J*\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, m90084d2 = {"com/kubi/otc/service/OtcService$loadFaitSearchFragment$1", "Landroid/text/TextWatcher;", "beforeTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "afterTextChanged", "Landroid/text/Editable;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOtcService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$loadFaitSearchFragment$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,220:1\n106#2:221\n78#2,22:222\n*S KotlinDebug\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$loadFaitSearchFragment$1\n*L\n184#1:221\n184#1:222,22\n*E\n"})
    public static final class C20270a implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SearchFiatFragment f38129b;

        public C20270a(SearchFiatFragment searchFiatFragment) {
            this.f38129b = searchFiatFragment;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            int i11;
            boolean z11;
            String strValueOf = String.valueOf(s11);
            int length = strValueOf.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) strValueOf.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String string = strValueOf.subSequence(i12, length + 1).toString();
            SearchFiatFragment searchFiatFragment = this.f38129b;
            try {
                Result.Companion companion = Result.INSTANCE;
                searchFiatFragment.m45811a4(string);
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$b */
    /* JADX INFO: compiled from: OtcService.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20271b implements Consumer {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38130b;

        public C20271b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38130b = function;
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f38130b.invoke(obj);
        }
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: c */
    public void mo43956c(@NotNull BaseFragment fragment, @NotNull String scanCode, @NotNull Function1<? super Boolean, Unit> fallbackHandler) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(scanCode, "scanCode");
        Intrinsics.checkNotNullParameter(fallbackHandler, "fallbackHandler");
        KuCoinPayHelper.f39579a.m48303b(fragment, scanCode, fallbackHandler);
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: d */
    public int mo43957d() {
        return OtcUserManager.f38144a.m45489i();
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: e */
    public boolean mo43958e() {
        if (C24129b.m58030b(SiteVisibleConfigKey.KuCard)) {
            return KuCardHelper.f39574a.m48297c();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.otc.api.IOtcService
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo43959f(boolean z11, @NotNull Continuation<? super Boolean> continuation) {
        OtcService$loadKuCardEntranceStatus$1 otcService$loadKuCardEntranceStatus$1;
        if (continuation instanceof OtcService$loadKuCardEntranceStatus$1) {
            otcService$loadKuCardEntranceStatus$1 = (OtcService$loadKuCardEntranceStatus$1) continuation;
            int i11 = otcService$loadKuCardEntranceStatus$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                otcService$loadKuCardEntranceStatus$1.label = i11 - Integer.MIN_VALUE;
            } else {
                otcService$loadKuCardEntranceStatus$1 = new OtcService$loadKuCardEntranceStatus$1(this, continuation);
            }
        } else {
            otcService$loadKuCardEntranceStatus$1 = new OtcService$loadKuCardEntranceStatus$1(this, continuation);
        }
        Object objM48298d = otcService$loadKuCardEntranceStatus$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = otcService$loadKuCardEntranceStatus$1.label;
        boolean z12 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM48298d);
            if (!C24129b.m58030b(SiteVisibleConfigKey.KuCard)) {
                return Boxing.boxBoolean(false);
            }
            KuCardHelper kuCardHelper = KuCardHelper.f39574a;
            otcService$loadKuCardEntranceStatus$1.Z$0 = z11;
            otcService$loadKuCardEntranceStatus$1.label = 1;
            objM48298d = kuCardHelper.m48298d(z11, otcService$loadKuCardEntranceStatus$1);
            if (objM48298d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM48298d);
        }
        KuCardEntranceConfig kuCardEntranceConfig = (KuCardEntranceConfig) objM48298d;
        if (C27025c.m66566d(kuCardEntranceConfig != null ? kuCardEntranceConfig.getHasEntrance() : null)) {
            if (C27041f.m66668h(kuCardEntranceConfig != null ? kuCardEntranceConfig.getEntrancePath() : null).length() > 0) {
                z12 = true;
            }
        }
        return Boxing.boxBoolean(z12);
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: g */
    public void mo43960g(@Nullable Action action) {
        OtcUserManager.f38144a.m45491k(action);
    }

    @Override // com.kubi.otc.api.IOtcService
    @NotNull
    /* JADX INFO: renamed from: h */
    public BaseFragment mo43961h(@NotNull ClearEditText etSearch) {
        Intrinsics.checkNotNullParameter(etSearch, "etSearch");
        SearchFiatFragment searchFiatFragment = new SearchFiatFragment();
        etSearch.addTextChangedListener(new C20270a(searchFiatFragment));
        return searchFiatFragment;
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: i */
    public boolean mo43962i() {
        return C27025c.m66566d(OtcUserManager.f38144a.m45490j().getMerchant());
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: j */
    public void mo43963j(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
            C38346y.m86509T(fragment);
        } else {
            C43846g.m96568c(new OtcException(new Exception("P2P payment method list is not available"), "OtcService", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: k */
    public boolean mo43964k() {
        return OtcUserManager.f38144a.m45493u();
    }

    @Override // com.kubi.otc.api.IOtcService
    @NotNull
    /* JADX INFO: renamed from: m */
    public Disposable mo43965m(@NotNull final Function1<? super String, Unit> function, @NotNull final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Observable<R> observableCompose = m45446s().m83346y().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.service.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcService.m45443u(function, (ThirdActivity) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.service.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcService.m45444v(function1, obj);
            }
        }, new Consumer() { // from class: com.kubi.otc.service.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcService.m45445w(onError, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        return disposableSubscribe;
    }

    @Override // com.kubi.otc.api.IOtcService
    /* JADX INFO: renamed from: n */
    public void mo43966n() {
        OtcUserManager.f38144a.m45488h();
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC37241c m45446s() {
        return (InterfaceC37241c) this.f38128b.getValue();
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC37241c m45442t() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m45443u(Function1 function1, ThirdActivity thirdActivity) {
        function1.invoke(C27041f.m66668h(thirdActivity.getActivityMessage()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m45444v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final void m45445w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.otc.api.IOtcService
    @SuppressLint({"CheckResult"})
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo43954a(@NotNull String str, @NotNull Continuation<? super List<String>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new OtcService$getSupportFastCurrency$2(str, null), continuation);
    }

    @Override // com.kubi.otc.api.IOtcService
    @SuppressLint({"CheckResult"})
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo43955b(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Pair<String, String>> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new OtcService$getLegalAndCoinIcon$2(str, str2, null), continuation);
    }
}
