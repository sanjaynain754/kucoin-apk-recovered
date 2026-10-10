package com.kubi.otc.api;

import androidx.fragment.app.Fragment;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: IOtcService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\bg\u0018\u0000 32\u00020\u0001:\u00013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u000eJP\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H&J\b\u0010\u0018\u001a\u00020\u0013H&J\u0014\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0013H&J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020\u0013H&J\b\u0010$\u001a\u00020\u0013H&J0\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00030(H&J\b\u0010+\u001a\u00020\u0003H&J\u0016\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0013H&J,\u00100\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020 2\u0006\u00101\u001a\u00020\b2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030(H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/otc/api/IOtcService;", "", "toPayMethodPage", "", "fragment", "Landroidx/fragment/app/Fragment;", "getSupportFastCurrency", "", "", "legal", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLegalAndCoinIcon", "Lkotlin/Pair;", "coin", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chooseBuyOrDeposit", "fm", "Landroidx/fragment/app/FragmentManager;", "trackEvent", "", "onBuyClick", "Lkotlin/Function0;", "onDepositClick", "onCloseClick", "isRealLowKycLevel", "getOtcUserInfo", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "getKycLevel", "", "isHighKycLevel", "loadFaitSearchFragment", "Lcom/kubi/sdk/BaseFragment;", "etSearch", "Lcom/kubi/resources/widget/ClearEditText;", "merchant", "otcKyc", "thirdActivityObserver", "Lio/reactivex/disposables/Disposable;", "function", "Lkotlin/Function1;", "param", "", "clearOtcUserInfo", "loadKuCardEntranceStatus", "forceRefresh", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchKuCard", "checkWhitelistBeforeHandleNonAppInfo", "scanCode", "fallbackHandler", "Companion", "PaymentApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IOtcService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f37164a = Companion.f37165a;

    /* JADX INFO: compiled from: IOtcService.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/otc/api/IOtcService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/otc/api/IOtcService;", Companion.SOURCE_FROM_H5, "", Companion.SOURCE_FROM_HOME_PAGE, "PaymentApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String SOURCE_FROM_H5 = "SOURCE_FROM_H5";

        @NotNull
        public static final String SOURCE_FROM_HOME_PAGE = "SOURCE_FROM_HOME_PAGE";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f37165a = new Companion();

        @NotNull
        public final IOtcService get() {
            return (IOtcService) Router.f46192a.m56192n(IOtcService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo43954a(@NotNull String str, @NotNull Continuation<? super List<String>> continuation);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo43955b(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Pair<String, String>> continuation);

    /* JADX INFO: renamed from: c */
    void mo43956c(@NotNull BaseFragment baseFragment, @NotNull String str, @NotNull Function1<? super Boolean, Unit> function1);

    /* JADX INFO: renamed from: d */
    int mo43957d();

    /* JADX INFO: renamed from: e */
    boolean mo43958e();

    @Nullable
    /* JADX INFO: renamed from: f */
    Object mo43959f(boolean z11, @NotNull Continuation<? super Boolean> continuation);

    /* JADX INFO: renamed from: g */
    void mo43960g(@Nullable Action action);

    @NotNull
    /* JADX INFO: renamed from: h */
    BaseFragment mo43961h(@NotNull ClearEditText clearEditText);

    /* JADX INFO: renamed from: i */
    boolean mo43962i();

    /* JADX INFO: renamed from: j */
    void mo43963j(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: k */
    boolean mo43964k();

    @NotNull
    /* JADX INFO: renamed from: m */
    Disposable mo43965m(@NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function2);

    /* JADX INFO: renamed from: n */
    void mo43966n();

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m43953l(IOtcService iOtcService, Action action, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOtcUserInfo");
        }
        if ((i11 & 1) != 0) {
            action = null;
        }
        iOtcService.mo43960g(action);
    }
}
