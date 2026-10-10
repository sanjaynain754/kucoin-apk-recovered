package sy;

import android.content.Context;
import android.os.Build;
import com.blankj.utilcode.util.C5276j;
import com.google.common.net.HttpHeaders;
import com.kubi.fingerprint.C12598b;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.handler.IMethodHandler;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p694vk.C45590s;
import p741wy.InterfaceC45957q;
import p741wy.InterfaceC45959s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: sy.t */
/* JADX INFO: compiled from: RequestHeadersHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/flutter/handler/RequestHeadersHandler;", "Lcom/kubi/sdk/flutter/handler/IMethodHandler;", "<init>", "()V", "handleMethod", "", "context", "Landroid/content/Context;", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "iTransmit", "Lcom/kubi/sdk/flutter/transmit/IXTraceCookieTransmit;", "getITransmit", "()Lcom/kubi/sdk/flutter/transmit/IXTraceCookieTransmit;", "iTransmit$delegate", "Lkotlin/Lazy;", "getTraceCookie", "", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestHeadersHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestHeadersHandler.kt\ncom/kubi/sdk/flutter/handler/RequestHeadersHandler\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,61:1\n65#2:62\n*S KotlinDebug\n*F\n+ 1 RequestHeadersHandler.kt\ncom/kubi/sdk/flutter/handler/RequestHeadersHandler\n*L\n56#1:62\n*E\n"})
public final class C44595t implements IMethodHandler {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44595t f98879a = new C44595t();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f98880b = LazyKt.lazy(new Function0() { // from class: sy.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44595t.m98696d();
        }
    });

    /* JADX INFO: renamed from: d */
    public static final InterfaceC45959s m98696d() {
        return (InterfaceC45959s) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45959s.class)));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC45959s m98697b() {
        return (InterfaceC45959s) f98880b.getValue();
    }

    @Override // com.kubi.sdk.flutter.handler.IMethodHandler
    public void handleMethod(@NotNull Context context, @NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        HashMap map = new HashMap();
        map.put(HttpHeaders.COOKIE, m98695c());
        map.put("X-APP-TOKEN", C27041f.m66668h(UserInfo.a.l()));
        C45590s c45590s = C45590s.f102687a;
        map.put("X-APP-VERSION", c45590s.m100675Z());
        map.put("X-DEVICE", Build.MODEL);
        map.put("X-DEVICE-NO", C5276j.m6247f());
        map.put("X-APP_ID", c45590s.m100661L());
        map.put("X-SYSTEM", "android");
        map.put("X-REQUEST-TIME", String.valueOf(System.currentTimeMillis()));
        map.put("X-SYSTEM-VERSION", Build.VERSION.RELEASE);
        map.put("User-Agent", "android/" + c45590s.m100675Z());
        map.put("LANG", MultiLanguageManager.f46811g.getLocalString());
        map.put("X-VERSION", c45590s.m100677b0());
        map.put("X-DEVICE-FRONT-ID", C5276j.m6247f());
        map.put("X-SENSORS-ID", C27041f.m66668h(SensorsDataAPI.sharedInstance().getDistinctId()));
        Pair<String, String> pairM23781i = C12598b.f21975a.m23781i("flutter_api");
        if (pairM23781i != null) {
            map.put(pairM23781i.getFirst(), pairM23781i.getSecond());
        }
        result.success(map);
    }

    /* JADX INFO: renamed from: c */
    private final String m98695c() {
        String strMo88925d;
        InterfaceC45959s interfaceC45959sM98697b = m98697b();
        if (interfaceC45959sM98697b != null) {
            strMo88925d = interfaceC45959sM98697b.mo88925d();
        } else {
            strMo88925d = null;
        }
        return C27041f.m66668h(strMo88925d);
    }
}
