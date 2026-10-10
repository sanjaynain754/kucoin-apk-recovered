package com.kubi.jsbridge.knb;

import android.content.Context;
import android.net.Uri;
import android.os.Vibrator;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import c00.InterfaceC4755b;
import com.kubi.advert.api.IAdvertService;
import com.kubi.host.HostManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeCommonAppCpsInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeCommonAppInfo;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeCommonPermissionInfo;
import com.kubi.sdk.site.SiteType;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27012a;
import com.kubi.utils.C27057k;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.web.api.IWebService;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41016c;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KCHybridBridgeCommon.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016JB\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J@\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00112\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016JB\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J@\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00112\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J8\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgeCommon;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeCommonCall;", "<init>", "()V", "exitApp", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getAppInfo", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeCommonAppInfo;", "getAppVersion", "", "getFingerToken", "event", "getPasteBoardContent", "getPermission", "permissionType", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeCommonPermissionInfo;", "refreshAppSession", "showAddHomePageDialog", "shortcutId", "showToast", "value", "vibrate", "syncCpsFromApp", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeCommonAppCpsInfo;", "Companion", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHybridBridgeCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeCommon.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeCommon\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,181:1\n29#2:182\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeCommon.kt\ncom/kubi/jsbridge/knb/KCHybridBridgeCommon\n*L\n63#1:182\n*E\n"})
public final class KCHybridBridgeCommon implements InterfaceC4755b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27482a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeCommon.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/jsbridge/knb/KCHybridBridgeCommon$Companion;", "", "<init>", "()V", "TAG", "", "WebBridgeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: a */
    public void mo4791a(@NotNull Context ctx, @Nullable Object obj, @NotNull String permissionType, @NotNull Function2<? super KCHybridBridgeCommonPermissionInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = permissionType.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "notification")) {
            callback.invoke(new KCHybridBridgeCommonPermissionInfo(NotificationManagerCompat.from(ctx).areNotificationsEnabled()), null);
        } else {
            callback.invoke(null, new ProtocolException("permissionType not found", null, null, false, 14, null));
        }
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: b */
    public void mo4792b(@NotNull Context ctx, @Nullable Object obj, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IWebService.f54644a.get().mo36741e(new BiConsumer() { // from class: com.kubi.jsbridge.knb.a
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                KCHybridBridgeCommon.m31849n(callback, (Boolean) obj2, (String) obj3);
            }
        });
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: c */
    public void mo4793c(@NotNull Context ctx, @Nullable Object obj, @NotNull String value, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (value.length() == 0) {
            callback.invoke(Boolean.FALSE, new ProtocolException("value is empty", null, null, false, 14, null));
        } else {
            ToastCompat.m66441G(value, new Object[0]);
            callback.invoke(Boolean.TRUE, null);
        }
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: d */
    public void mo4794d(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super KCHybridBridgeCommonAppInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String strM89965c = C41016c.m89965c();
        Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
        String strM89966d = C41016c.m89966d();
        Intrinsics.checkNotNullExpressionValue(strM89966d, "getCurrentCurrencySymbol(...)");
        String strM66668h = C27041f.m66668h(IUserService.a.get().d0().getFeeLevelUrl());
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        boolean z11 = !dayNightThemeManager.m33187l();
        String strM66668h2 = C27041f.m66668h(Uri.parse(HostManager.a.e()).getHost());
        String strM100675Z = C45590s.f102687a.m100675Z();
        String string = MultiLanguageManager.f46811g.getLocale().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        callback.invoke(new KCHybridBridgeCommonAppInfo(strM89965c, strM89966d, string, strM100675Z, strM66668h2, strM66668h, z11, dayNightThemeManager.m33189n(), SiteType.INSTANCE.getCurrentSiteType(), AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType()), null);
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: e */
    public void mo4795e(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CharSequence charSequenceM66749e = C27057k.m66749e();
        String string = charSequenceM66749e != null ? charSequenceM66749e.toString() : null;
        if (string == null || string.length() == 0) {
            callback.invoke(null, new ProtocolException("no clipboard content", null, null, false, 14, null));
        } else {
            callback.invoke(string, null);
        }
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: f */
    public void mo4796f(@NotNull Context ctx, @Nullable Object obj, @Nullable String str, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BaseActivity baseActivity = ctx instanceof BaseActivity ? (BaseActivity) ctx : null;
        if (baseActivity == null) {
            callback.invoke(null, null);
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseActivity), null, null, new KCHybridBridgeCommon$getFingerToken$1(str, callback, null), 3, null);
        }
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: g */
    public void mo4797g(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object systemService = ctx.getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(100L);
        }
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: h */
    public void mo4798h(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(C45590s.f102687a.m100675Z(), null);
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: i */
    public void mo4799i(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super KCHybridBridgeCommonAppCpsInfo, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IAdvertService iAdvertService = IAdvertService.f15070a.get();
        KCHybridBridgeCommonAppCpsInfo kCHybridBridgeCommonAppCpsInfo = new KCHybridBridgeCommonAppCpsInfo(iAdvertService.getAppInstanceId(), iAdvertService.mo14760b(), iAdvertService.mo14762d(), iAdvertService.mo14761c(), iAdvertService.mo14759a());
        C44128b.m97266j("syncCpsFromApp", "H5 res = " + kCHybridBridgeCommonAppCpsInfo);
        callback.invoke(kCHybridBridgeCommonAppCpsInfo, null);
    }

    @Override // c00.InterfaceC4755b
    /* JADX INFO: renamed from: j */
    public void mo4800j(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.jsbridge.knb.b
            @Override // java.lang.Runnable
            public final void run() {
                KCHybridBridgeCommon.m31848m();
            }
        });
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // c00.InterfaceC4755b
    public void showAddHomePageDialog(@NotNull Context ctx, @Nullable Object obj, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (ctx instanceof KWebBaseActivity) {
            IAppletService.f46452a.get().mo15070e((FragmentActivity) ctx, shortcutId, callback);
        } else {
            callback.invoke(Boolean.FALSE, new ProtocolException("showAddHomePageDialog failed,check ctx", null, null, false, 14, null));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m31848m() {
        C27012a.m66486i().m66490d();
    }

    /* JADX INFO: renamed from: n */
    public static final void m31849n(Function2 function2, Boolean bool, String str) {
        ProtocolException protocolException;
        Intrinsics.checkNotNull(str);
        if (str.length() == 0) {
            protocolException = null;
        } else {
            protocolException = new ProtocolException(str, null, null, true, 6, null);
        }
        function2.invoke(bool, protocolException);
    }
}
