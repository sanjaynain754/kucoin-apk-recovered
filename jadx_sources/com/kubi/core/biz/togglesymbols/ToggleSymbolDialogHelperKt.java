package com.kubi.core.biz.togglesymbols;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.component.BottomDialogHostFragment;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.IHomeService;
import com.kubi.margin.api.IMarginService;
import com.kubi.mart.api.IMartService;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ToggleSymbolDialogHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\f\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\r2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\u000e\u001a \u0010\u000f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u001a \u0010\u0012\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¨\u0006\u0014"}, m90084d2 = {"openMarginTradeSymbolsDialog", "", "tradeType", "", "isMarket", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", "fm", "Landroidx/fragment/app/FragmentManager;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/Integer;ZLcom/kubi/data/entity/TradeItemBean;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;)V", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "(Lcom/kubi/sdk/base/ui/BaseUiActivity;Ljava/lang/Integer;ZLcom/kubi/data/entity/TradeItemBean;Lkotlin/jvm/functions/Function0;)V", "openSpotKlineSymbolsDialog", "symbol", "", "openSpotTradeSymbolsDialog", "Lcom/kubi/sdk/BaseFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nToggleSymbolDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToggleSymbolDialogHelper.kt\ncom/kubi/core/biz/togglesymbols/ToggleSymbolDialogHelperKt\n+ 2 BottomDialogHostFragment.kt\ncom/kubi/component/BottomDialogHostFragment\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,132:1\n72#2,2:133\n76#2:137\n72#2,2:138\n76#2:142\n72#2,2:143\n76#2:147\n72#2,2:148\n76#2:152\n81#3,2:135\n81#3,2:140\n81#3,2:145\n81#3,2:150\n*S KotlinDebug\n*F\n+ 1 ToggleSymbolDialogHelper.kt\ncom/kubi/core/biz/togglesymbols/ToggleSymbolDialogHelperKt\n*L\n36#1:133,2\n36#1:137\n67#1:138,2\n67#1:142\n93#1:143,2\n93#1:147\n119#1:148,2\n119#1:152\n36#1:135,2\n67#1:140,2\n93#1:145,2\n119#1:150,2\n*E\n"})
public final class ToggleSymbolDialogHelperKt {
    /* JADX INFO: renamed from: e */
    public static final void m22834e(@NotNull BaseUiActivity baseUiActivity, @Nullable Integer num, boolean z11, @Nullable TradeItemBean tradeItemBean, @NotNull final Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(baseUiActivity, "<this>");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        BaseFragment baseFragmentMo37942j0 = IMarginService.f32724a.get().mo37942j0(num, z11, tradeItemBean);
        BottomDialogHostFragment bottomDialogHostFragmentNewInstance$default = BottomDialogHostFragment.Companion.newInstance$default(BottomDialogHostFragment.f19596s0, baseFragmentMo37942j0.getClass(), baseFragmentMo37942j0.getArguments(), 0.0f, 4, null);
        String strMo28955k = IHomeService.f25434a.get().mo28955k();
        if (C12573b.f21598a.m23696a()) {
            strMo28955k.length();
        }
        C12572a.m23692a(bottomDialogHostFragmentNewInstance$default, false, new C12288xc7d1a12a(strMo28955k, null, bottomDialogHostFragmentNewInstance$default));
        bottomDialogHostFragmentNewInstance$default.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.biz.togglesymbols.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ToggleSymbolDialogHelperKt.m22838i(onDismiss, dialogInterface);
            }
        });
        FragmentManager supportFragmentManager = baseUiActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        bottomDialogHostFragmentNewInstance$default.show(supportFragmentManager, "KLineMarginToggleSymbolsFragment");
    }

    /* JADX INFO: renamed from: f */
    public static final void m22835f(@Nullable Integer num, boolean z11, @Nullable TradeItemBean tradeItemBean, @NotNull FragmentManager fm2, @NotNull final Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        BaseFragment baseFragmentMo37942j0 = IMarginService.f32724a.get().mo37942j0(num, z11, tradeItemBean);
        BottomDialogHostFragment bottomDialogHostFragmentNewInstance$default = BottomDialogHostFragment.Companion.newInstance$default(BottomDialogHostFragment.f19596s0, baseFragmentMo37942j0.getClass(), baseFragmentMo37942j0.getArguments(), 0.0f, 4, null);
        String strMo28955k = IHomeService.f25434a.get().mo28955k();
        if (C12573b.f21598a.m23696a()) {
            strMo28955k.length();
        }
        C12572a.m23692a(bottomDialogHostFragmentNewInstance$default, false, new C12287xc5cb9e4d(strMo28955k, null, bottomDialogHostFragmentNewInstance$default));
        bottomDialogHostFragmentNewInstance$default.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.biz.togglesymbols.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ToggleSymbolDialogHelperKt.m22837h(onDismiss, dialogInterface);
            }
        });
        bottomDialogHostFragmentNewInstance$default.show(fm2, "TradeMarginToggleSymbolsFragment");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22836g(Integer num, boolean z11, TradeItemBean tradeItemBean, FragmentManager fragmentManager, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            tradeItemBean = null;
        }
        m22835f(num, z11, tradeItemBean, fragmentManager, function0);
    }

    /* JADX INFO: renamed from: j */
    public static final void m22839j(@NotNull BaseUiActivity baseUiActivity, @NotNull String symbol, @NotNull final Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(baseUiActivity, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        BaseFragment baseFragmentMo41418a = IMartService.f34639a.get().mo41418a("spot_kline", symbol);
        BottomDialogHostFragment bottomDialogHostFragmentNewInstance$default = BottomDialogHostFragment.Companion.newInstance$default(BottomDialogHostFragment.f19596s0, baseFragmentMo41418a.getClass(), baseFragmentMo41418a.getArguments(), 0.0f, 4, null);
        String strMo28955k = IHomeService.f25434a.get().mo28955k();
        if (C12573b.f21598a.m23696a()) {
            strMo28955k.length();
        }
        C12572a.m23692a(bottomDialogHostFragmentNewInstance$default, false, new C12289x191e1ac0(strMo28955k, null, bottomDialogHostFragmentNewInstance$default));
        bottomDialogHostFragmentNewInstance$default.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.biz.togglesymbols.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ToggleSymbolDialogHelperKt.m22840k(onDismiss, dialogInterface);
            }
        });
        FragmentManager supportFragmentManager = baseUiActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        bottomDialogHostFragmentNewInstance$default.show(supportFragmentManager, "KLineSpotToggleSymbolsFragment");
    }

    /* JADX INFO: renamed from: l */
    public static final void m22841l(@NotNull BaseFragment baseFragment, @NotNull String symbol, @NotNull final Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        BaseFragment baseFragmentMo41418a = IMartService.f34639a.get().mo41418a("spot_trade", symbol);
        BottomDialogHostFragment bottomDialogHostFragmentNewInstance$default = BottomDialogHostFragment.Companion.newInstance$default(BottomDialogHostFragment.f19596s0, baseFragmentMo41418a.getClass(), baseFragmentMo41418a.getArguments(), 0.0f, 4, null);
        String strMo28955k = IHomeService.f25434a.get().mo28955k();
        if (C12573b.f21598a.m23696a()) {
            strMo28955k.length();
        }
        C12572a.m23692a(bottomDialogHostFragmentNewInstance$default, false, new C12290x26ff1c59(strMo28955k, null, bottomDialogHostFragmentNewInstance$default));
        bottomDialogHostFragmentNewInstance$default.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.biz.togglesymbols.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ToggleSymbolDialogHelperKt.m22842m(onDismiss, dialogInterface);
            }
        });
        FragmentManager supportFragmentManager = baseFragment.requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        bottomDialogHostFragmentNewInstance$default.show(supportFragmentManager, "SpotToggleSymbolsFragment");
    }

    /* JADX INFO: renamed from: h */
    public static final void m22837h(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: i */
    public static final void m22838i(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: k */
    public static final void m22840k(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: m */
    public static final void m22842m(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }
}
