package com.kubi.wallet.utils;

import a80.InterfaceC0200a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.core.content.res.ResourcesCompat;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.wallet.R$dimen;
import com.kubi.wallet.R$font;
import com.kubi.wallet.R$string;
import com.kubi.wallet.api.IWalletService;
import d80.C36642a;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294gz.C38057a;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.wallet.utils.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WalletUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u0019\u001a\u00020\u001a*\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001b\u001a\u00020\rR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/wallet/utils/WalletUtils;", "", "<init>", "()V", "mediumFont", "Landroid/graphics/Typeface;", "getMediumFont", "()Landroid/graphics/Typeface;", "mediumFont$delegate", "Lkotlin/Lazy;", "isWeb3Path", "", "path", "", "uri", "Landroid/net/Uri;", "isWeb3WalletAvailable", "Ljava/lang/Boolean;", "isWeb3WalletAvailable$WalletLib_googleRelease", "isSupportSwitchAnimation", "langTabWidthMap", "", "Lcom/kubi/sdk/function/language/LanguageType;", "", "tabWidth", "log", "", "tag", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWalletUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletUtils.kt\ncom/kubi/wallet/utils/WalletUtils\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 WalletIssue.kt\ncom/kubi/wallet/exception/WalletIssueKt\n*L\n1#1,117:1\n17#2,2:118\n35#3,4:120\n39#3:126\n44#4,2:124\n1#5:127\n49#6,4:128\n*S KotlinDebug\n*F\n+ 1 WalletUtils.kt\ncom/kubi/wallet/utils/WalletUtils\n*L\n55#1:118,2\n64#1:120,4\n64#1:126\n64#1:124,2\n111#1:128,4\n*E\n"})
public final class WalletUtils {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static Boolean f54642c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WalletUtils f54640a = new WalletUtils();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f54641b = LazyKt.lazy(new Function0() { // from class: com.kubi.wallet.utils.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WalletUtils.m67003h();
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<LanguageType, Integer> f54643d = new LinkedHashMap();

    /* JADX INFO: renamed from: com.kubi.wallet.utils.e$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m67002g(WalletUtils walletUtils, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "Web3Wallet";
        }
        walletUtils.m67008f(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public static final Typeface m67003h() {
        return ResourcesCompat.getFont(C27059l.f54343a.m66757a(), R$font.medium);
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m67004b() {
        return (Typeface) f54641b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m67007e() {
        Object objM20457a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC0200a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC0200a) objM56186h).m772a();
        }
        Boolean bool = f54642c;
        if (bool != null) {
            return bool.booleanValue();
        }
        WalletUtils walletUtils = f54640a;
        boolean zM85928a = C38057a.f85671a.m85928a(C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "cexWeb3Button", null, 4, null), true);
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("web3WalletEntrance", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        boolean zM66567e = C27025c.m66567e((Boolean) objM20457a, true);
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.Web3Wallet);
        boolean z11 = zM85928a && zM66567e && zM58030b;
        String str = "[web3Wallet]config.entrance:" + z11 + "(availablelBizControl=" + zM85928a + ",availablelRemoteConfig=" + zM66567e + ",availablelSiteConfig=" + zM58030b + ')';
        m67002g(walletUtils, str, null, 1, null);
        C43840a.m96550d(str, "Web3Wallet");
        f54642c = Boolean.valueOf(z11);
        return z11;
    }

    /* JADX INFO: renamed from: i */
    public final int m67009i() {
        Map<LanguageType, Integer> map = f54643d;
        Integer num = map.get(MultiLanguageManager.f46811g);
        if (num != null) {
            return num.intValue();
        }
        Context contextM66757a = C27059l.f54343a.m66757a();
        try {
            String strMo66943c = IWalletService.f54542a.get().mo66943c();
            String string = contextM66757a.getString(R$string.tab_web3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Paint paint = new Paint();
            paint.setTextSize(C27040e.m66657a(14.0f));
            paint.setTypeface(f54640a.m67004b());
            float fM66658b = C27040e.m66658b(16);
            float fMeasureText = paint.measureText(strMo66943c) + fM66658b;
            float fMeasureText2 = paint.measureText(string) + fM66658b;
            int iCoerceAtMost = (int) RangesKt.coerceAtMost(RangesKt.coerceAtLeast(fMeasureText, fMeasureText2), C27034h.m66633d(contextM66757a, R$dimen.web3_tab_max_width));
            m67002g(this, "exchangeWith=" + fMeasureText + ", web3With=" + fMeasureText2 + ", resultWidth=" + iCoerceAtMost, null, 1, null);
            map.put(MultiLanguageManager.f46811g, Integer.valueOf(iCoerceAtMost));
            return iCoerceAtMost;
        } catch (Throwable th2) {
            if (!C42899b.m94075e(th2)) {
                C36642a.m81980b(th2, "WalletUtils");
            }
            return C27034h.m66633d(contextM66757a, R$dimen.web3_tab_max_width);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m67005c(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.areEqual((String) CollectionsKt.firstOrNull((List) pathSegments), "wallet");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67006d(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            Uri uri = Uri.parse(path);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            return m67005c(uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m67008f(@Nullable String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (str == null) {
            str = "";
        }
        C44128b.m97259c(tag, str);
    }
}
