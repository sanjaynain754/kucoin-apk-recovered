package com.kubi.margin.trade.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.Gson;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.CurrencyEntity;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.safe.api.service.TradePasswordExtensionsKt;
import com.kubi.safe.api.service.TradePasswordExtensionsKt$executeTradePassword$1;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36909e;
import p206dp.C36911f;
import p239ep.C37220a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CrossMarginClosePositionDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010$\u001a\u00020\u00112\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\b\u0010&\u001a\u00020\u0011H\u0002J\b\u0010'\u001a\u00020\u0011H\u0002J\b\u0010(\u001a\u00020\u0011H\u0002J\b\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0011H\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J \u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010\u00192\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190/H\u0002J\b\u00100\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginClosePositionDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/margin/trade/dialog/MarginCrossClosePositionVM;", "getViewModel", "()Lcom/kubi/margin/trade/dialog/MarginCrossClosePositionVM;", "viewModel$delegate", "Lkotlin/Lazy;", "isCancelClosePosition", "", "()Z", "isCancelClosePosition$delegate", "confirmCallback", "Lkotlin/Function1;", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "", "currencyLayoutView", "Lcom/kubi/margin/trade/dialog/CurrencyContentLayoutStatusWrapper;", "viewBind", "Lcom/kubi/margin/databinding/BmarginDialogMarginCrossClosePositionBinding;", "currencyAdapter", "Lcom/kubi/margin/trade/dialog/ClosePositionCurrencyAdapter;", "selectedCurrencyForToken", "Lcom/kubi/margin/trade/dialog/ClosePositionCurrency;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setConfirmListener", TUIConstants.TUIChat.CALL_BACK, "initUI", "initMarginLiquidationUI", "initCancelMarginLiquidationUI", "initCurrencyList", "startCollectFlow", "showCurrencyLoadingUI", "showCurrencyListUI", "selected", "list", "", "showCurrencyFailedUI", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossMarginClosePositionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossMarginClosePositionDialog.kt\ncom/kubi/margin/trade/dialog/CrossMarginClosePositionDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,225:1\n106#2,15:226\n*S KotlinDebug\n*F\n+ 1 CrossMarginClosePositionDialog.kt\ncom/kubi/margin/trade/dialog/CrossMarginClosePositionDialog\n*L\n36#1:226,15\n*E\n"})
public final class CrossMarginClosePositionDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f33746j0 = new Companion(null);

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f33747c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f33748d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public Function1<? super CrossMarginCloseContract$UiIntent, Unit> f33749e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public CurrencyContentLayoutStatusWrapper f33750f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public C36909e f33751g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public ClosePositionCurrencyAdapter f33752h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public ClosePositionCurrency f33753i0;

    /* JADX INFO: compiled from: CrossMarginClosePositionDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/margin/trade/dialog/CrossMarginClosePositionDialog$Companion;", "", "<init>", "()V", "CANCEL_STATUS_ARGS", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: W3 */
    private final void m40074W3() {
        m54250y3(0);
        m54249x3(0.85f);
        if (m40083X3()) {
            m40080N3();
        } else {
            m40082R3();
            m40081Q3();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m40070S3(CrossMarginClosePositionDialog crossMarginClosePositionDialog) {
        LifecycleCoroutineScope lifecycleScope;
        ClosePositionCurrency closePositionCurrency = crossMarginClosePositionDialog.f33753i0;
        if (closePositionCurrency == null) {
            return Unit.INSTANCE;
        }
        Gson gson = new Gson();
        String code = closePositionCurrency.getEntity().getCode();
        if (code == null) {
            code = "";
        }
        String liquidationTargetType = closePositionCurrency.getEntity().getLiquidationTargetType();
        String json = gson.toJson(new LiquidationCrossParams(code, liquidationTargetType != null ? liquidationTargetType : ""));
        Fragment parentFragment = crossMarginClosePositionDialog.getParentFragment();
        if (parentFragment != null) {
            TradeSecurityScene tradeSecurityScene = TradeSecurityScene.MARGIN_CROSS_CLOSE;
            Fragment parentFragment2 = crossMarginClosePositionDialog.getParentFragment();
            if (parentFragment2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(parentFragment2)) == null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(crossMarginClosePositionDialog);
            }
            LifecycleCoroutineScope lifecycleCoroutineScope = lifecycleScope;
            Intrinsics.checkNotNull(json);
            TradePasswordExtensionsKt.m56335d(parentFragment, tradeSecurityScene, lifecycleCoroutineScope, (504 & 4) != 0 ? "" : json, (504 & 8) != 0 ? null : null, (504 & 16) != 0 ? false : false, (504 & 32) != 0, (504 & 64) != 0 ? false : false, (504 & 128) != 0 ? new TradePasswordExtensionsKt$executeTradePassword$1(null) : null, (504 & 256) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradePasswordExtensionsKt.m56337f();
                }
            } : null, new CrossMarginClosePositionDialog$initMarginLiquidationUI$3$1(crossMarginClosePositionDialog, null), (504 & 1024) != 0 ? new Function0() { // from class: com.kubi.safe.api.service.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradePasswordExtensionsKt.m56338g();
                }
            } : new Function0() { // from class: com.kubi.margin.trade.dialog.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossMarginClosePositionDialog.m40071T3();
                }
            }, (504 & 2048) != 0 ? new Function1() { // from class: com.kubi.safe.api.service.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradePasswordExtensionsKt.m56339h((Throwable) obj);
                }
            } : new Function1() { // from class: com.kubi.margin.trade.dialog.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CrossMarginClosePositionDialog.m40072U3((Throwable) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m40071T3() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m40072U3(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public final MarginCrossClosePositionVM m40079M3() {
        return (MarginCrossClosePositionVM) this.f33747c0.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m40080N3() {
        KcPrimaryButton kcPrimaryButton;
        AppCompatImageView appCompatImageView;
        C36911f c36911f;
        FrameLayout root;
        BaseTextView baseTextView;
        View view;
        BaseTextView baseTextView2;
        AlertTipsTextView alertTipsTextView;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        C36909e c36909e = this.f33751g0;
        if (c36909e != null && (baseTextView4 = c36909e.f81670i) != null) {
            baseTextView4.setText(getString(R$string.kc_margin_cross_cance_close_position_tip));
        }
        C36909e c36909e2 = this.f33751g0;
        if (c36909e2 != null && (baseTextView3 = c36909e2.f81663b) != null) {
            ViewExtKt.m66594y(baseTextView3);
        }
        C36909e c36909e3 = this.f33751g0;
        if (c36909e3 != null && (alertTipsTextView = c36909e3.f81671j) != null) {
            ViewExtKt.m66577h(alertTipsTextView);
        }
        C36909e c36909e4 = this.f33751g0;
        if (c36909e4 != null && (baseTextView2 = c36909e4.f81667f) != null) {
            ViewExtKt.m66577h(baseTextView2);
        }
        C36909e c36909e5 = this.f33751g0;
        if (c36909e5 != null && (view = c36909e5.f81668g) != null) {
            ViewExtKt.m66577h(view);
        }
        C36909e c36909e6 = this.f33751g0;
        if (c36909e6 != null && (baseTextView = c36909e6.f81669h) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C36909e c36909e7 = this.f33751g0;
        if (c36909e7 != null && (c36911f = c36909e7.f81666e) != null && (root = c36911f.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        C36909e c36909e8 = this.f33751g0;
        if (c36909e8 != null && (appCompatImageView = c36909e8.f81664c) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossMarginClosePositionDialog.m40069P3(this.f33811b);
                }
            }, 1, null);
        }
        C36909e c36909e9 = this.f33751g0;
        if (c36909e9 == null || (kcPrimaryButton = c36909e9.f81665d) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossMarginClosePositionDialog.m40068O3(this.f33814b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m40082R3() {
        AppCompatImageView appCompatImageView;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        C36911f c36911f;
        RecyclerView recyclerView;
        BaseTextView baseTextView;
        View view;
        BaseTextView baseTextView2;
        AlertTipsTextView alertTipsTextView;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        C36911f c36911f2;
        C36909e c36909e = this.f33751g0;
        if (c36909e != null && (c36911f2 = c36909e.f81666e) != null) {
            LottieAnimationView loadingView = c36911f2.f81688g;
            Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
            LinearLayout errorLayout = c36911f2.f81687f;
            Intrinsics.checkNotNullExpressionValue(errorLayout, "errorLayout");
            RecyclerView currencyRecyclerView = c36911f2.f81683b;
            Intrinsics.checkNotNullExpressionValue(currencyRecyclerView, "currencyRecyclerView");
            this.f33750f0 = new CurrencyContentLayoutStatusWrapper(loadingView, errorLayout, currencyRecyclerView);
        }
        CurrencyContentLayoutStatusWrapper currencyContentLayoutStatusWrapper = this.f33750f0;
        if (currencyContentLayoutStatusWrapper != null) {
            currencyContentLayoutStatusWrapper.m40276d();
        }
        C36909e c36909e2 = this.f33751g0;
        if (c36909e2 != null && (baseTextView4 = c36909e2.f81670i) != null) {
            baseTextView4.setText(getString(R$string.kc_margin_cross_close_position_tip));
        }
        C36909e c36909e3 = this.f33751g0;
        if (c36909e3 != null && (baseTextView3 = c36909e3.f81663b) != null) {
            ViewExtKt.m66577h(baseTextView3);
        }
        C36909e c36909e4 = this.f33751g0;
        if (c36909e4 != null && (alertTipsTextView = c36909e4.f81671j) != null) {
            ViewExtKt.m66594y(alertTipsTextView);
        }
        C36909e c36909e5 = this.f33751g0;
        if (c36909e5 != null && (baseTextView2 = c36909e5.f81667f) != null) {
            ViewExtKt.m66594y(baseTextView2);
        }
        C36909e c36909e6 = this.f33751g0;
        if (c36909e6 != null && (view = c36909e6.f81668g) != null) {
            ViewExtKt.m66594y(view);
        }
        C36909e c36909e7 = this.f33751g0;
        if (c36909e7 != null && (baseTextView = c36909e7.f81669h) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C36909e c36909e8 = this.f33751g0;
        if (c36909e8 != null && (c36911f = c36909e8.f81666e) != null && (recyclerView = c36911f.f81683b) != null) {
            recyclerView.setAdapter(this.f33752h0);
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2, 1, false));
        }
        C36909e c36909e9 = this.f33751g0;
        if (c36909e9 != null && (kcPrimaryButton2 = c36909e9.f81665d) != null) {
            kcPrimaryButton2.setEnabled(false);
        }
        C36909e c36909e10 = this.f33751g0;
        if (c36909e10 != null && (kcPrimaryButton = c36909e10.f81665d) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CrossMarginClosePositionDialog.m40070S3(this.f33816b);
                }
            }, 1, null);
        }
        C36909e c36909e11 = this.f33751g0;
        if (c36909e11 == null || (appCompatImageView = c36909e11.f81664c) == null) {
            return;
        }
        C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.margin.trade.dialog.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossMarginClosePositionDialog.m40073V3(this.f33818b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final boolean m40083X3() {
        return ((Boolean) this.f33748d0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m40084Z3(@NotNull Function1<? super CrossMarginCloseContract$UiIntent, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f33749e0 = callback;
    }

    /* JADX INFO: renamed from: a4 */
    public final void m40085a4() {
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView;
        CurrencyContentLayoutStatusWrapper currencyContentLayoutStatusWrapper = this.f33750f0;
        if (currencyContentLayoutStatusWrapper != null) {
            currencyContentLayoutStatusWrapper.showError(new View.OnClickListener() { // from class: com.kubi.margin.trade.dialog.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CrossMarginClosePositionDialog.m40076b4(this.f33821b, view);
                }
            });
        }
        C36909e c36909e = this.f33751g0;
        if (c36909e != null && (baseTextView = c36909e.f81669h) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        C36909e c36909e2 = this.f33751g0;
        if (c36909e2 == null || (kcPrimaryButton = c36909e2.f81665d) == null) {
            return;
        }
        kcPrimaryButton.setEnabled(false);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m40086c4(ClosePositionCurrency closePositionCurrency, List<ClosePositionCurrency> list) {
        BaseTextView baseTextView;
        KcPrimaryButton kcPrimaryButton;
        CurrencyEntity entity;
        BaseTextView baseTextView2;
        this.f33753i0 = closePositionCurrency;
        CurrencyContentLayoutStatusWrapper currencyContentLayoutStatusWrapper = this.f33750f0;
        if (currencyContentLayoutStatusWrapper != null) {
            currencyContentLayoutStatusWrapper.m40275b();
        }
        this.f33752h0.replaceData(list);
        if (closePositionCurrency == null || (entity = closePositionCurrency.getEntity()) == null || !C37220a.m83268b(entity)) {
            C36909e c36909e = this.f33751g0;
            if (c36909e != null && (baseTextView = c36909e.f81669h) != null) {
                ViewExtKt.m66577h(baseTextView);
            }
        } else {
            C36909e c36909e2 = this.f33751g0;
            if (c36909e2 != null && (baseTextView2 = c36909e2.f81669h) != null) {
                ViewExtKt.m66594y(baseTextView2);
            }
        }
        C36909e c36909e3 = this.f33751g0;
        if (c36909e3 == null || (kcPrimaryButton = c36909e3.f81665d) == null) {
            return;
        }
        kcPrimaryButton.setEnabled(closePositionCurrency != null);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m40087d4() {
        KcPrimaryButton kcPrimaryButton;
        CurrencyContentLayoutStatusWrapper currencyContentLayoutStatusWrapper = this.f33750f0;
        if (currencyContentLayoutStatusWrapper != null) {
            currencyContentLayoutStatusWrapper.m40276d();
        }
        C36909e c36909e = this.f33751g0;
        if (c36909e == null || (kcPrimaryButton = c36909e.f81665d) == null) {
            return;
        }
        kcPrimaryButton.setEnabled(false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_dialog_margin_cross_close_position, container, false);
        this.f33751g0 = C36909e.m82687a(viewInflate);
        return viewInflate;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m40074W3();
    }

    public CrossMarginClosePositionDialog() {
        final Function0 function0 = new Function0() { // from class: com.kubi.margin.trade.dialog.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossMarginClosePositionDialog.m40077f4(this.f33824b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f33747c0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarginCrossClosePositionVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.trade.dialog.CrossMarginClosePositionDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f33748d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.dialog.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CrossMarginClosePositionDialog.m40075Y3(this.f33828b));
            }
        });
        this.f33752h0 = new ClosePositionCurrencyAdapter();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m40068O3(CrossMarginClosePositionDialog crossMarginClosePositionDialog) {
        crossMarginClosePositionDialog.m40079M3().sendIntent(CrossMarginCloseContract$UiIntent.CancelClosePositionCross.INSTANCE);
        crossMarginClosePositionDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m40069P3(CrossMarginClosePositionDialog crossMarginClosePositionDialog) {
        crossMarginClosePositionDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m40073V3(CrossMarginClosePositionDialog crossMarginClosePositionDialog) {
        crossMarginClosePositionDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final boolean m40075Y3(CrossMarginClosePositionDialog crossMarginClosePositionDialog) {
        Boolean boolValueOf;
        Bundle arguments = crossMarginClosePositionDialog.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("isCancelLiquidation"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m40076b4(CrossMarginClosePositionDialog crossMarginClosePositionDialog, View view) {
        crossMarginClosePositionDialog.m40079M3().sendIntent(CrossMarginCloseContract$UiIntent.InitCurrencyList.INSTANCE);
    }

    /* JADX INFO: renamed from: f4 */
    public static final ViewModelStoreOwner m40077f4(CrossMarginClosePositionDialog crossMarginClosePositionDialog) {
        Fragment fragmentRequireParentFragment = crossMarginClosePositionDialog.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m40081Q3() {
        m40088e4();
        m40079M3().sendIntent(CrossMarginCloseContract$UiIntent.InitCurrencyList.INSTANCE);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m40088e4() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new CrossMarginClosePositionDialog$startCollectFlow$1(this, null));
    }
}
