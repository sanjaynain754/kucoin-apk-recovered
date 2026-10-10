package com.kubi.assets.jsapi;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5277j0;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.auto.service.AutoService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$string;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.jsapi.KCTurboAssetsModuleImpl;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.p110rn.core.biz.KCTurboFileModuleImpl;
import com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.profit.loss.analysis.lib.OverviewRange;
import com.kubi.profit.loss.analysis.lib.PnlMethod;
import com.kubi.router.core.Router;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.user.config.UserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import d00.InterfaceC36562b;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: KCTurboAssetsModuleImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002JP\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016JH\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u001e\u0010\u0015\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J8\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u001e\u0010\u001e\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u001e\u0010\u001f\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u000f\u0010 \u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010\u0018J\u0017\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010#J\n\u0010&\u001a\u0004\u0018\u00010\u000bH\u0016J2\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016J\u001e\u0010*\u001a\u00020\t2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\t0\u0012H\u0016¨\u0006+"}, m90084d2 = {"Lcom/kubi/assets/jsapi/KCTurboAssetsModuleImpl;", "Lcom/kubi/rn/core/turbo/NativeAssetsTurboModuleAbs;", "ctx", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "bridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiAssetsModule;", "jumpMultiAddFundsDialog", "", "sceneCode", "", FirebaseAnalytics.Param.CURRENCY, "fiatMoney", "defaultAccount", "defaultAccountAmount", "toAccountTag", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "jumpMultiAccountUseDialog", "jumpHoldEarnDialog", "jumpMultiAccountSelectDialog", "getHideAssetsEyeStatus", "()Ljava/lang/Boolean;", "setHideAssetsEyeStatus", "isHide", "(Z)Ljava/lang/Boolean;", "goBindEmail", "goBindGoogle", "goBindPhone", "goSetPassword", "getPnlCalcMethod", "setPnlCalcMethod", FirebaseAnalytics.Param.METHOD, "(Ljava/lang/String;)Ljava/lang/Boolean;", "setPnlDaysRange", "daysRange", "getPnlDaysRange", "setPricingCurrency", "pricingCrypto", "pricingFiat", "openPnlDietalDialog", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@AutoService({NativeAssetsTurboModuleAbs.class})
@SourceDebugExtension({"SMAP\nKCTurboAssetsModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboAssetsModuleImpl.kt\ncom/kubi/assets/jsapi/KCTurboAssetsModuleImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,263:1\n135#2,2:264\n126#2,2:266\n32#2:268\n23#2,2:269\n23#2,2:271\n32#2:273\n*S KotlinDebug\n*F\n+ 1 KCTurboAssetsModuleImpl.kt\ncom/kubi/assets/jsapi/KCTurboAssetsModuleImpl\n*L\n130#1:264,2\n136#1:266,2\n179#1:268\n189#1:269,2\n204#1:271,2\n218#1:273\n*E\n"})
public final class KCTurboAssetsModuleImpl extends NativeAssetsTurboModuleAbs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTurboAssetsModuleImpl(@NotNull ReactApplicationContext ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    private final InterfaceC36562b bridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36562b) Router.f46192a.m56192n(InterfaceC36562b.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36562b) objM103844constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBindEmail$lambda$9(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AssetsDepend.f18689a.m19186g().m56318l(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBindGoogle$lambda$10(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AssetsDepend.f18689a.m19186g().m56321p(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBindPhone$lambda$11(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AssetsDepend.f18689a.m19186g().m56316j(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goSetPassword$lambda$12(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ISafeService iSafeServiceM19186g = AssetsDepend.f18689a.m19186g();
        String strM6253b = C5277j0.m6253b(R$string.withdraw_pwd);
        Intrinsics.checkNotNullExpressionValue(strM6253b, "getString(...)");
        iSafeServiceM19186g.m56313g(it, strM6253b, ValidationBizEnum.SET_WITHDRAWAL_PASSWORD);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openPnlDietalDialog$lambda$16(final Function1 function1, final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        fragmentActivity.runOnUiThread(new Runnable() { // from class: bb.j
            @Override // java.lang.Runnable
            public final void run() {
                KCTurboAssetsModuleImpl.openPnlDietalDialog$lambda$16$lambda$15(fragmentActivity, function1);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openPnlDietalDialog$lambda$16$lambda$15(FragmentActivity fragmentActivity, Function1 function1) {
        try {
            IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            IAssetsCenterService.m15330i(iAssetsCenterService, supportFragmentManager, null, 2, null);
            function1.invoke(Boolean.TRUE);
        } catch (Exception e11) {
            C44128b.m97265i("openPnlDietalDialog error: " + e11.getMessage());
            function1.invoke(Boolean.FALSE);
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    @Nullable
    public Boolean getHideAssetsEyeStatus() {
        return Boolean.valueOf(C46392a.m102322d(C42153h.f93593a.m92500D(), false));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    @Nullable
    public Boolean getPnlCalcMethod() {
        try {
            return Boolean.valueOf(Intrinsics.areEqual(C46392a.m102326h(C42153h.f93593a.m92497A(), "SIMPLE"), "TIME"));
        } catch (Exception e11) {
            C44128b.m97265i("getPnlCalcMethod error: " + e11.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    @Nullable
    public String getPnlDaysRange() {
        try {
            return C46392a.m102326h(C42153h.f93593a.m92529s(), "LAST_1_DAY");
        } catch (Exception e11) {
            C44128b.m97265i("getPnlDaysRange error: " + e11.getMessage());
            return "LAST_1_DAY";
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void goBindEmail(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: bb.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboAssetsModuleImpl.goBindEmail$lambda$9((FragmentActivity) obj);
            }
        });
        callback.invoke(Boolean.TRUE);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void goBindGoogle(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: bb.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboAssetsModuleImpl.goBindGoogle$lambda$10((FragmentActivity) obj);
            }
        });
        callback.invoke(Boolean.TRUE);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void goBindPhone(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: bb.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboAssetsModuleImpl.goBindPhone$lambda$11((FragmentActivity) obj);
            }
        });
        callback.invoke(Boolean.TRUE);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void goSetPassword(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: bb.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboAssetsModuleImpl.goSetPassword$lambda$12((FragmentActivity) obj);
            }
        });
        callback.invoke(Boolean.TRUE);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void jumpHoldEarnDialog(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36562b interfaceC36562bBridge = bridge();
        if (interfaceC36562bBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36562bBridge.mo4413a(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, new Function2() { // from class: bb.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboAssetsModuleImpl.jumpHoldEarnDialog$lambda$6(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void jumpMultiAccountSelectDialog(@NotNull String sceneCode, @NotNull String currency, @Nullable String toAccountTag, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36562b interfaceC36562bBridge = bridge();
        if (interfaceC36562bBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36562bBridge.mo4418f(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, sceneCode, currency, toAccountTag, new Function2() { // from class: bb.g
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboAssetsModuleImpl.jumpMultiAccountSelectDialog$lambda$8(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void jumpMultiAccountUseDialog(@NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36562b interfaceC36562bBridge = bridge();
        if (interfaceC36562bBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36562bBridge.mo4424l(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, sceneCode, currency, fiatMoney, defaultAccountAmount, toAccountTag, new Function2() { // from class: bb.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboAssetsModuleImpl.jumpMultiAccountUseDialog$lambda$4(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void jumpMultiAddFundsDialog(@NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccount, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(sceneCode, "sceneCode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fiatMoney, "fiatMoney");
        Intrinsics.checkNotNullParameter(defaultAccount, "defaultAccount");
        Intrinsics.checkNotNullParameter(defaultAccountAmount, "defaultAccountAmount");
        Intrinsics.checkNotNullParameter(callback, "callback");
        InterfaceC36562b interfaceC36562bBridge = bridge();
        if (interfaceC36562bBridge == null) {
            callback.invoke(null);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36562bBridge.mo4420h(reactApplicationContext, null, KCTurboFileModuleImpl.SOURCE_RN, sceneCode, currency, fiatMoney, defaultAccount, defaultAccountAmount, toAccountTag, new Function2() { // from class: bb.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KCTurboAssetsModuleImpl.jumpMultiAddFundsDialog$lambda$2(callback, (Boolean) obj, (ProtocolException) obj2);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void openPnlDietalDialog(@NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: bb.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCTurboAssetsModuleImpl.openPnlDietalDialog$lambda$16(callback, (FragmentActivity) obj);
            }
        });
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    @Nullable
    public Boolean setHideAssetsEyeStatus(boolean isHide) {
        try {
            C46392a.m102328k(C42153h.f93593a.m92500D(), isHide);
            AssetsProfitLossAnalysisManager.f40608a.m49943e(isHide);
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    @Nullable
    public Boolean setPnlCalcMethod(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        try {
            PnlMethod pnlMethodValueOf = PnlMethod.valueOf(method);
            C46392a.m102333p(C42153h.f93593a.m92497A(), pnlMethodValueOf.name());
            C44128b.m97265i("setPnlCalcMethod: saved successfully, method=" + pnlMethodValueOf.name());
            return Boolean.TRUE;
        } catch (IllegalArgumentException unused) {
            C44128b.m97265i("setPnlCalcMethod: invalid method=" + method + ", must be SIMPLE or TIME");
            return Boolean.FALSE;
        } catch (Exception e11) {
            C44128b.m97265i("setPnlCalcMethod error: " + e11.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    @Nullable
    public Boolean setPnlDaysRange(@NotNull String daysRange) {
        Intrinsics.checkNotNullParameter(daysRange, "daysRange");
        try {
            OverviewRange overviewRangeValueOf = OverviewRange.valueOf(daysRange);
            C46392a.m102333p(C42153h.f93593a.m92529s(), overviewRangeValueOf.name());
            C44128b.m97265i("setPnlDaysRange: saved successfully, range=" + overviewRangeValueOf.name());
            return Boolean.TRUE;
        } catch (IllegalArgumentException unused) {
            C44128b.m97265i("setPnlDaysRange: invalid range=" + daysRange);
            return Boolean.FALSE;
        } catch (Exception e11) {
            C44128b.m97265i("setPnlDaysRange error: " + e11.getMessage());
            return Boolean.FALSE;
        }
    }

    @Override // com.kubi.p110rn.core.turbo.NativeAssetsTurboModuleAbs
    public void setPricingCurrency(@Nullable String pricingCrypto, @Nullable String pricingFiat, @NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (pricingFiat != null) {
            try {
                C41016c.m89971i(pricingFiat);
                AssetsDepend.f18689a.m19189j().d0().setCurrency(pricingFiat);
            } catch (Exception unused) {
                callback.invoke(Boolean.FALSE);
                return;
            }
        }
        if (pricingCrypto != null) {
            AssetsDepend.f18689a.m19189j().d0().setBalanceCurrency(pricingCrypto);
        }
        AssetsDepend.f18689a.m19189j().w0(UserInfo.c());
        callback.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpHoldEarnDialog$lambda$6(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpMultiAccountSelectDialog$lambda$8(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpMultiAccountUseDialog$lambda$4(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpMultiAddFundsDialog$lambda$2(Function1 function1, Boolean bool, ProtocolException protocolException) {
        function1.invoke(bool);
        return Unit.INSTANCE;
    }
}
