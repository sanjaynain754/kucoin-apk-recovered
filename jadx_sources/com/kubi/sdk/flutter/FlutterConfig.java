package com.kubi.sdk.flutter;

import android.content.Context;
import android.os.Build;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.delegate.KnbHandlerHelper;
import com.kubi.sdk.flutter.ui.FlutterEntryActivity;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43842c;
import p741wy.InterfaceC45943c;
import p741wy.InterfaceC45944d;
import p741wy.InterfaceC45945e;
import p741wy.InterfaceC45947g;
import p741wy.InterfaceC45949i;
import p741wy.InterfaceC45951k;
import p741wy.InterfaceC45954n;
import p741wy.InterfaceC45956p;
import p741wy.InterfaceC45957q;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import sy.C44571b;
import sy.C44573c;
import sy.C44577e;
import sy.C44579f;
import sy.C44582g0;
import sy.C44586k;
import sy.C44587l;
import sy.C44589n;
import sy.C44590o;
import sy.C44592q;
import sy.C44593r;
import sy.C44595t;
import sy.C44597v;
import sy.C44598w;
import sy.C44600y;

/* JADX INFO: compiled from: FlutterConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020!J\u0014\u0010\"\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010 \u001a\u00020!J\u0006\u0010#\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/flutter/FlutterConfig;", "", "<init>", "()V", "TAG", "", "iCandySaveShareTransmit", "Lcom/kubi/sdk/flutter/transmit/ICandySaveShareTransmit;", "iCandyShareImgTransmit", "Lcom/kubi/sdk/flutter/transmit/ICandyShareImgTransmit;", "iRefreshTokenTransmit", "Lcom/kubi/sdk/flutter/transmit/IRefreshTokenTransmit;", "iKumexoOpenContractTransmit", "Lcom/kubi/sdk/flutter/transmit/IKumexoOpenContractTransmit;", "iNoticeTransmit", "Lcom/kubi/sdk/flutter/transmit/INoticeTransmit;", "iKYCTransmit", "Lcom/kubi/sdk/flutter/transmit/IKYCTransmit;", "iTradeTransmit", "Lcom/kubi/sdk/flutter/transmit/ITradeTransmit;", "handleMethodFragment", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "handleMethod", "Lcom/kubi/sdk/flutter/ui/FlutterEntryActivity;", "generateFlutterRoute", "route", "needLogin", "", "flutterRoute", "getLocalTimeZone", "ENGINE_ID", "METHOD_CHANNEL", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterConfig.kt\ncom/kubi/sdk/flutter/FlutterConfig\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n65#2:288\n65#2:289\n65#2:290\n65#2:291\n65#2:292\n65#2:293\n65#2:294\n1869#3,2:295\n1869#3,2:297\n1869#3,2:299\n*S KotlinDebug\n*F\n+ 1 FlutterConfig.kt\ncom/kubi/sdk/flutter/FlutterConfig\n*L\n61#1:288\n64#1:289\n67#1:290\n70#1:291\n73#1:292\n76#1:293\n79#1:294\n141#1:295,2\n200#1:297,2\n253#1:299,2\n*E\n"})
public final class FlutterConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterConfig f46607a = new FlutterConfig();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final InterfaceC45943c m56652d() {
        return (InterfaceC45943c) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45943c.class)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final InterfaceC45944d m56653e() {
        return (InterfaceC45944d) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45944d.class)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final InterfaceC45947g m56654f() {
        return (InterfaceC45947g) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45947g.class)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final InterfaceC45949i m56655g() {
        return (InterfaceC45949i) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45949i.class)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final InterfaceC45951k m56656h() {
        return (InterfaceC45951k) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45951k.class)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final InterfaceC45954n m56657i() {
        return (InterfaceC45954n) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45954n.class)));
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final InterfaceC45956p m56658j() {
        return (InterfaceC45956p) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45956p.class)));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m56659a() {
        return C27041f.m66669i(Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID(), "Unknown");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e3, code lost:
    
        if (r0.equals("getPermission") == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e7, code lost:
    
        r0 = m56656h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01eb, code lost:
    
        if (r0 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ed, code lost:
    
        r0.mo86424a(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01f7, code lost:
    
        if (r0.equals("candy/share") == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0200, code lost:
    
        if (r0.equals("candy/save") == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0203, code lost:
    
        r0 = m56652d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0207, code lost:
    
        if (r0 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0209, code lost:
    
        r0.mo59659a(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r0.equals("jumpToSystemNoticeSetting") == false) goto L181;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m56660b(@NotNull FlutterEntryActivity context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Set<Map.Entry> setEntrySet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (KnbHandlerHelper.f46655a.m56788k(context, call, result)) {
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -2031916209:
                    if (str.equals("getMockUrl")) {
                        C44589n.f98873a.handleMethod(context, call, result);
                    }
                    break;
                case -2016202834:
                    if (str.equals("getFingerprint")) {
                        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(context), null, null, new FlutterConfig$handleMethod$2(result, call, null), 3, null);
                    }
                    break;
                case -1913642710:
                    if (str.equals("showToast")) {
                        C44598w.f98883a.handleMethod(context, call, result);
                    }
                    break;
                case -1905196798:
                    if (str.equals("playAudio")) {
                        C44590o.f98875a.handleMethod(context, call, result);
                    }
                    break;
                case -1081578757:
                    if (str.equals("jump2Native")) {
                        C44587l.f98872a.handleMethod(context, call, result);
                    }
                    break;
                case -1001672473:
                    break;
                case -986886731:
                    break;
                case -815366715:
                    break;
                case -743780508:
                    if (str.equals("shareImg")) {
                        InterfaceC45944d interfaceC45944dM56653e = m56653e();
                        if (interfaceC45944dM56653e != null) {
                            interfaceC45944dM56653e.mo59663a(context, call, result);
                        }
                    }
                    break;
                case -635431282:
                    if (str.equals("socketNeedReConnect")) {
                        C44582g0.f98864a.handleMethod(context, call, result);
                    }
                    break;
                case -501579672:
                    if (str.equals("getInitConfig")) {
                        C44586k.f98869a.handleMethod(context, call, result);
                    }
                    break;
                case -56506402:
                    if (str.equals("refreshToken")) {
                        InterfaceC45954n interfaceC45954nM56657i = m56657i();
                        if (interfaceC45954nM56657i != null) {
                            interfaceC45954nM56657i.m101383h(call, result);
                        }
                    }
                    break;
                case 106677:
                    if (str.equals("kyc")) {
                        InterfaceC45947g interfaceC45947gM56654f = m56654f();
                        if (interfaceC45947gM56654f != null) {
                            interfaceC45947gM56654f.mo36786c(context, call, result);
                        }
                    }
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        C44592q.f98877a.handleMethod(context, call, result);
                    }
                    break;
                case 110621003:
                    if (str.equals("track")) {
                        try {
                            String str2 = (String) call.argument("eventId");
                            if (str2 != null) {
                                Map map = (Map) call.argument("values");
                                JSONObject jSONObject = new JSONObject();
                                if (map != null && (setEntrySet = map.entrySet()) != null) {
                                    for (Map.Entry entry : setEntrySet) {
                                        jSONObject.put((String) entry.getKey(), entry.getValue());
                                    }
                                }
                                C43842c.m96559b(str2, jSONObject);
                            }
                        } catch (Throwable th2) {
                            C44128b.m97263g("FlutterConfig", th2);
                            return;
                        }
                    }
                    break;
                case 123141359:
                    if (str.equals("hasLogin")) {
                        result.success(Boolean.valueOf(UserInfo.a.n()));
                    }
                    break;
                case 236122546:
                    if (str.equals("getApiInfo")) {
                        C44573c.f98856a.handleMethod(context, call, result);
                    }
                    break;
                case 242587193:
                    if (str.equals("getAppInfo")) {
                        C44577e.f98859a.handleMethod(context, call, result);
                    }
                    break;
                case 474029289:
                    if (str.equals("cbiz#getSymbolInfo")) {
                        InterfaceC45956p interfaceC45956pM56658j = m56658j();
                        if (interfaceC45956pM56658j != null) {
                            interfaceC45956pM56658j.mo101384l(call, result);
                        }
                    }
                    break;
                case 629318295:
                    if (str.equals("sysNativeLocalized")) {
                        C44600y.f98887a.handleMethod(context, call, result);
                    }
                    break;
                case 891798665:
                    if (str.equals("fetchLaunchTimestamp")) {
                        result.success(C23722c.m56700a());
                        C23722c.m56701b(null);
                    }
                    break;
                case 1074158076:
                    if (str.equals("requestHeader")) {
                        C44595t.f98879a.handleMethod(context, call, result);
                    }
                    break;
                case 1119628702:
                    if (str.equals("getRemoteConfig")) {
                        C44593r.f98878a.handleMethod(context, call, result);
                    }
                    break;
                case 1334131334:
                    if (str.equals("getShareUrl")) {
                        C44597v.f98881a.handleMethod(context, call, result);
                    }
                    break;
                case 1722194321:
                    if (str.equals("fastFetchABTest")) {
                        C44571b.f98855a.handleMethod(context, call, result);
                    }
                    break;
                case 1767083515:
                    if (str.equals("cbiz#checkValidationCode")) {
                        InterfaceC45956p interfaceC45956pM56658j2 = m56658j();
                        if (interfaceC45956pM56658j2 != null) {
                            interfaceC45956pM56658j2.mo101385o(call, result, context);
                        }
                    }
                    break;
                case 1810074720:
                    break;
                case 1811096719:
                    if (str.equals("getUserInfo")) {
                        C44579f.f98862a.handleMethod(context, call, result);
                    }
                    break;
                case 1921364348:
                    if (str.equals("openContract")) {
                        InterfaceC45949i interfaceC45949iM56655g = m56655g();
                        if (interfaceC45949iM56655g != null) {
                            interfaceC45949iM56655g.mo33749c(context, call, result);
                        }
                    }
                    break;
            }
            return;
        }
        Iterator it = Router.f46192a.m56190l(InterfaceC45945e.class).iterator();
        while (it.hasNext()) {
            if (((InterfaceC45945e) it.next()).mo48122a(context, call, result)) {
                return;
            }
        }
        result.notImplemented();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public final void m56661c(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (KnbHandlerHelper.f46655a.m56788k(context, call, result)) {
            return;
        }
        String str = call.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -2031916209:
                    if (str.equals("getMockUrl")) {
                        C44589n.f98873a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case -1913642710:
                    if (str.equals("showToast")) {
                        C44598w.f98883a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case -1905196798:
                    if (str.equals("playAudio")) {
                        C44590o.f98875a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case -1081578757:
                    if (str.equals("jump2Native")) {
                        C44587l.f98872a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case -635431282:
                    if (str.equals("socketNeedReConnect")) {
                        C44582g0.f98864a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case -501579672:
                    if (str.equals("getInitConfig")) {
                        C44586k.f98869a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case -56506402:
                    if (str.equals("refreshToken")) {
                        InterfaceC45954n interfaceC45954nM56657i = m56657i();
                        if (interfaceC45954nM56657i != null) {
                            interfaceC45954nM56657i.m101383h(call, result);
                            return;
                        }
                        return;
                    }
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        C44592q.f98877a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 123141359:
                    if (str.equals("hasLogin")) {
                        result.success(Boolean.valueOf(UserInfo.a.n()));
                        return;
                    }
                    break;
                case 236122546:
                    if (str.equals("getApiInfo")) {
                        C44573c.f98856a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 242587193:
                    if (str.equals("getAppInfo")) {
                        C44577e.f98859a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 474029289:
                    if (str.equals("cbiz#getSymbolInfo")) {
                        InterfaceC45956p interfaceC45956pM56658j = m56658j();
                        if (interfaceC45956pM56658j != null) {
                            interfaceC45956pM56658j.mo101384l(call, result);
                            return;
                        }
                        return;
                    }
                    break;
                case 629318295:
                    if (str.equals("sysNativeLocalized")) {
                        C44600y.f98887a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 891798665:
                    if (str.equals("fetchLaunchTimestamp")) {
                        result.success(C23722c.m56700a());
                        C23722c.m56701b(null);
                        return;
                    }
                    break;
                case 1074158076:
                    if (str.equals("requestHeader")) {
                        C44595t.f98879a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 1119628702:
                    if (str.equals("getRemoteConfig")) {
                        C44593r.f98878a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 1334131334:
                    if (str.equals("getShareUrl")) {
                        C44597v.f98881a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 1722194321:
                    if (str.equals("fastFetchABTest")) {
                        C44571b.f98855a.handleMethod(context, call, result);
                        return;
                    }
                    break;
                case 1811096719:
                    if (str.equals("getUserInfo")) {
                        C44579f.f98862a.handleMethod(context, call, result);
                        return;
                    }
                    break;
            }
        }
        Iterator it = Router.f46192a.m56190l(InterfaceC45945e.class).iterator();
        while (it.hasNext()) {
            if (((InterfaceC45945e) it.next()).mo48122a(context, call, result)) {
                return;
            }
        }
        result.notImplemented();
    }
}
