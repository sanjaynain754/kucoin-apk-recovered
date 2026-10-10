package com.kubi.kucoin.main.router;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.facade.lib.R$drawable;
import com.kubi.facade.lib.R$mipmap;
import com.kubi.facade.lib.R$string;
import com.kubi.kucoin.main.helper.ModeDialogHelper;
import com.kubi.lite.api.ILiteService;
import com.kubi.mvi.common.MviExKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.wallet.api.IWalletService;
import java.util.List;
import ml.C42566b;
import nl.C42851a;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p374jl.InterfaceC40433a;
import p374jl.InterfaceC40435c;
import p481ny.C42899b;
import p668un.InterfaceC45265b;
import p668un.InterfaceC45271h;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AppModeSelectorRouteInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u000f\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m90084d2 = {"Lcom/kubi/kucoin/main/router/AppModeSelectorRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "lastDialogShowTime", "", "debounceInterval", "wallet", "Lcom/kubi/launch/spi/IWalletLaunchSPI;", "getWallet", "()Lcom/kubi/launch/spi/IWalletLaunchSPI;", "wallet$delegate", "Lkotlin/Lazy;", "lite", "Lcom/kubi/launch/spi/ILiteLaunchSPI;", "getLite", "()Lcom/kubi/launch/spi/ILiteLaunchSPI;", "lite$delegate", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "showSelectorDialog", "", "postcard", "Lcom/kubi/router/model/Postcard;", "launchAppMode", "modeName", "", "bundle", "Landroid/os/Bundle;", "showWeb3RemindDialog", "webRemindStringId", "", "getWeb3RemindContentStringId", "()Ljava/lang/Integer;", "getProModeNameString", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppModeSelectorRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppModeSelectorRouteInterceptor.kt\ncom/kubi/kucoin/main/router/AppModeSelectorRouteInterceptor\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n17#2,2:186\n17#2,2:188\n1#3:190\n*S KotlinDebug\n*F\n+ 1 AppModeSelectorRouteInterceptor.kt\ncom/kubi/kucoin/main/router/AppModeSelectorRouteInterceptor\n*L\n89#1:186,2\n174#1:188,2\n*E\n"})
public final class AppModeSelectorRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    public long f28013a;

    /* JADX INFO: renamed from: b */
    public final long f28014b = 1000;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f28015c = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.main.router.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppModeSelectorRouteInterceptor.m32478v();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f28016d = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.main.router.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppModeSelectorRouteInterceptor.m32472n();
        }
    });

    /* JADX INFO: renamed from: l */
    public final Integer m32480l() {
        try {
            InterfaceC40435c interfaceC40435c = (InterfaceC40435c) Router.f46192a.m56186h(InterfaceC40435c.class, SiteInfoManager.f47913a.m58109c());
            if (interfaceC40435c != null) {
                return interfaceC40435c.mo89080a();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC45265b m32472n() {
        return (InterfaceC45265b) Router.f46192a.m56192n(InterfaceC45265b.class);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m32473p(List list, final AppModeSelectorRouteInterceptor appModeSelectorRouteInterceptor, final C4400a c4400a, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ModeDialogHelper modeDialogHelper = ModeDialogHelper.f27996a;
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        modeDialogHelper.m32442f(supportFragmentManager, 0, list, new Function1() { // from class: com.kubi.kucoin.main.router.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppModeSelectorRouteInterceptor.m32474q(this.f28020b, c4400a, (SelectEntity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m32474q(AppModeSelectorRouteInterceptor appModeSelectorRouteInterceptor, C4400a c4400a, SelectEntity selectEntity) {
        String value;
        AppMode.Companion companion;
        AppMode appModeFromString;
        C44128b.m97266j("LiteTag", "selectEntity=" + selectEntity);
        if (selectEntity == null || (value = selectEntity.getValue()) == null || (appModeFromString = (companion = AppMode.INSTANCE).fromString(value)) == null) {
            return Unit.INSTANCE;
        }
        C42851a.f94919a.m93990g(AppMode.Companion.getCurrentBizMode$default(companion, null, 1, null), appModeFromString);
        appModeSelectorRouteInterceptor.m32481m(appModeFromString.name(), c4400a.getBundle());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m32475s(int i11, final Bundle bundle, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_info).m54167X4(R$string.home_go_web3_notice_dialog_title).m54169Z4(true).m54170a5(true).m54173d5(false).m54153J4(i11).m54157N4(true).m54161R4(0).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.kucoin.main.router.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                AppModeSelectorRouteInterceptor.m32476t(dialogInterface, i12);
            }
        }).m54162S4(R$string.home_go_web3_notice_dialog_positive_btn_text, new DialogInterface.OnClickListener() { // from class: com.kubi.kucoin.main.router.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                AppModeSelectorRouteInterceptor.m32477u(bundle, dialogInterface, i12);
            }
        }).m54194t3(it, "showWeb3RemindDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m32477u(Bundle bundle, DialogInterface dialogInterface, int i11) {
        C42566b.m93335f(C42566b.f94258a, bundle, false, 2, null);
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC45271h m32478v() {
        return (InterfaceC45271h) Router.f46192a.m56192n(InterfaceC45271h.class);
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        C44128b.m97266j("LiteTag", "postcard=" + postcard);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f28013a <= this.f28014b) {
            return true;
        }
        MviExKt.m42518n(new AppModeSelectorRouteInterceptor$intercept$1(this, jCurrentTimeMillis, postcard, null));
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final String m32479k() {
        int iMo89076a;
        C27017c c27017c = C27017c.f54310a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40433a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            iMo89076a = ((InterfaceC40433a) objM56186h).mo89076a(ILiteService.f32003a.get().mo37530a());
        } else {
            iMo89076a = ILiteService.f32003a.get().mo37530a() ? R$string.lite_mode_selector_pro : R$string.tab_exchange;
        }
        return c27017c.m66516f(iMo89076a, new Object[0]);
    }

    /* JADX INFO: renamed from: m */
    public final void m32481m(String str, Bundle bundle) {
        if (str == null || StringsKt.isBlank(str) || str == null) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 80525) {
            if (str.equals("Pro")) {
                C42566b.m93334d(C42566b.f94258a, false, 1, null);
            }
        } else if (iHashCode == 2368718) {
            if (str.equals("Lite")) {
                C42566b.m93333b(C42566b.f94258a, bundle, false, false, 6, null);
            }
        } else if (iHashCode == 2691967 && str.equals("Web3")) {
            Integer numM32480l = m32480l();
            if (numM32480l == null || !IWalletService.f54542a.get().mo66941a()) {
                C42566b.m93335f(C42566b.f94258a, bundle, false, 2, null);
            } else {
                m32483r(bundle, numM32480l.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m32482o(final C4400a c4400a) {
        SelectEntity selectEntity;
        AppMode.Companion companion = AppMode.INSTANCE;
        SelectEntity selectEntity2 = null;
        boolean z11 = AppMode.Companion.getCurrentBizMode$default(companion, null, 1, null) == AppMode.Web3;
        boolean z12 = AppMode.Companion.getCurrentBizMode$default(companion, null, 1, null) == AppMode.Lite;
        boolean z13 = (z11 || z12) ? false : true;
        String strM32479k = m32479k();
        C27017c c27017c = C27017c.f54310a;
        SelectEntity selectEntity3 = new SelectEntity(null, strM32479k, "Pro", Integer.valueOf(R$mipmap.kucoin_ic_mode_pro), null, null, null, null, null, false, z13, c27017c.m66516f(R$string.lite_mode_selector_pro_desc, new Object[0]), 1009, null);
        if (ILiteService.f32003a.get().mo37530a()) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC40433a.class, SiteInfoManager.f47913a.m58109c());
            selectEntity = new SelectEntity(null, c27017c.m66516f(objM56186h != null ? ((InterfaceC40433a) objM56186h).mo89077b() : R$string.lite_mode_selector_lite, new Object[0]), "Lite", Integer.valueOf(R$mipmap.kucoin_ic_mode_lite), null, null, null, null, null, false, z12, c27017c.m66516f(R$string.lite_mode_selector_lite_desc, new Object[0]), 1009, null);
        } else {
            selectEntity = null;
        }
        if (IWalletService.f54542a.get().mo66941a()) {
            selectEntity2 = new SelectEntity(null, c27017c.m66516f(R$string.lite_mode_selector_wallet, new Object[0]), "Web3", Integer.valueOf(R$mipmap.kucoin_ic_mode_web3), null, null, null, null, null, false, z11, c27017c.m66516f(R$string.lite_mode_selector_wallet_desc, new Object[0]), 1009, null);
        }
        final List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new SelectEntity[]{selectEntity3, selectEntity, selectEntity2});
        C42899b.m94073c(new Function1() { // from class: com.kubi.kucoin.main.router.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppModeSelectorRouteInterceptor.m32473p(listListOfNotNull, this, c4400a, (FragmentActivity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m32483r(final Bundle bundle, final int i11) {
        C42899b.m94073c(new Function1() { // from class: com.kubi.kucoin.main.router.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppModeSelectorRouteInterceptor.m32475s(i11, bundle, (FragmentActivity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public static final void m32476t(DialogInterface dialogInterface, int i11) {
    }
}
