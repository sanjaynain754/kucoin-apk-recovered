package com.kubi.sdk.web.jsapi;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.core.WebBridge;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.core.WebCoreMessage;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24330c;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HybridJsInterface.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/HybridJsInterface;", "", "bridge", "Lcom/kubi/sdk/web/core/WebBridge;", "(Lcom/kubi/sdk/web/core/WebBridge;)V", "prompt", "", "message", "", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHybridJsInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HybridJsInterface.kt\ncom/kubi/sdk/web/jsapi/HybridJsInterface\n+ 2 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,116:1\n85#2,4:117\n85#2,4:121\n85#2,4:125\n85#2,4:129\n86#2,3:133\n*S KotlinDebug\n*F\n+ 1 HybridJsInterface.kt\ncom/kubi/sdk/web/jsapi/HybridJsInterface\n*L\n63#1:117,4\n91#1:121,4\n99#1:125,4\n105#1:129,4\n111#1:133,3\n*E\n"})
public final class HybridJsInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "HybridJsInterface";

    @NotNull
    private final WebBridge bridge;

    /* JADX INFO: compiled from: HybridJsInterface.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/HybridJsInterface$Companion;", "", "<init>", "()V", "", "type", "Lorg/json/JSONObject;", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/sdk/web/jsapi/a;", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/kubi/sdk/web/jsapi/a;)Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "module", "name", "arguments", "b", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/kubi/sdk/web/jsapi/a;)Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "TAG", "Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public final JsBridgeEvent m58744b(String module, String name, JSONObject arguments, InterfaceC24316a callback) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("source", "h5");
            linkedHashMap.put("module", module);
            linkedHashMap.put("arguments", MapsKt.toMutableMap(C24330c.m58865a(arguments)));
            return new JsBridgeEvent("func", name, linkedHashMap, callback);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            if (r5.equals("event") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        
            if (r5.equals("func") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        
            r6 = r6.optString("name");
            r0.remove("name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        
            if (r6 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
        
            if (r6.length() != 0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            p852kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "name");
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        
            return new com.kubi.sdk.web.jsapi.JsBridgeEvent("func", r6, r0, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            return null;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final JsBridgeEvent m58743a(String type, JSONObject params, InterfaceC24316a callback) {
            String url;
            HashMap<String, Object> mapM58865a = C24330c.m58865a(params);
            switch (type.hashCode()) {
                case 3154628:
                    break;
                case 3273774:
                    if (!type.equals("jump") || (url = params.optString("url")) == null || url.length() == 0) {
                        return null;
                    }
                    mapM58865a.remove("url");
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    return new JsBridgeEvent(type, url, mapM58865a, callback);
                case 96891546:
                    break;
                case 106941038:
                    if (type.equals("proxy")) {
                        return new JsBridgeEvent(type, "", mapM58865a, callback);
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    @JavascriptInterface
    public final void prompt(@Nullable String message) {
        if (message == null || message.length() == 0) {
            C43846g.m96568c(new WebCoreMessage("message is empty", TAG, false, 4, null), null, 2, null);
            return;
        }
        C24329b c24329b = C24329b.f48558a;
        c24329b.m58864d("jsInoke", "js prompt");
        this.bridge.getEventQueue().m58762c();
        try {
            JSONObject jSONObject = new JSONObject(message);
            String module = jSONObject.optString("module");
            String name = jSONObject.optString("name");
            if (module != null && module.length() != 0 && name != null && name.length() != 0) {
                c24329b.m58864d(TAG, "新接口调用: module=" + module + ", name=" + name);
                String strOptString = jSONObject.optString(TUIConstants.TUIChat.CALL_BACK);
                String strOptString2 = jSONObject.optString("callbackId");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("arguments");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                InterfaceC24316a interfaceC24316aObtain = JsBridgeCallbackImpl.INSTANCE.obtain(this.bridge, strOptString, strOptString2);
                Companion companion = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(module, "module");
                Intrinsics.checkNotNullExpressionValue(name, "name");
                JsBridgeEvent jsBridgeEventM58744b = companion.m58744b(module, name, jSONObjectOptJSONObject, interfaceC24316aObtain);
                c24329b.m58864d("jsInoke", "eventObj type: " + jsBridgeEventM58744b.getType() + ", value: " + jsBridgeEventM58744b.getValue() + ", cbId:" + strOptString2 + ", cb:" + strOptString);
                this.bridge.m58666n(jsBridgeEventM58744b);
                return;
            }
            String type = jSONObject.optString("type");
            if (type != null && type.length() != 0) {
                String strOptString3 = jSONObject.optString(TUIConstants.TUIChat.CALL_BACK);
                String strOptString4 = jSONObject.optString("callbackId");
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(ReportDataTable.COLUMN_PARAMS);
                if (jSONObjectOptJSONObject2 == null) {
                    C43846g.m96568c(new WebCoreMessage("params is empty", TAG, false, 4, null), null, 2, null);
                    return;
                }
                InterfaceC24316a interfaceC24316aObtain2 = JsBridgeCallbackImpl.INSTANCE.obtain(this.bridge, strOptString3, strOptString4);
                Companion companion2 = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(type, "type");
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = type.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                JsBridgeEvent jsBridgeEventM58743a = companion2.m58743a(lowerCase, jSONObjectOptJSONObject2, interfaceC24316aObtain2);
                if (jsBridgeEventM58743a == null) {
                    C43846g.m96568c(new WebCoreMessage("eventObj is error", TAG, false, 4, null), null, 2, null);
                    return;
                }
                c24329b.m58864d("jsInoke", "eventObj type: " + jsBridgeEventM58743a.getType() + ", value: " + jsBridgeEventM58743a.getValue() + ", cbId:" + strOptString4 + ", cb:" + strOptString3);
                this.bridge.m58666n(jsBridgeEventM58743a);
                return;
            }
            C43846g.m96568c(new WebCoreMessage("type is empty", TAG, false, 4, null), null, 2, null);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, TAG, false, "jsapi err", 4, null), null, 2, null);
        }
    }

    public HybridJsInterface(@NotNull WebBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.bridge = bridge;
    }
}
