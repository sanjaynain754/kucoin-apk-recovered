package com.kubi.monitor.flutter;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33675gh;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p569qq.C43848i;
import p569qq.C43852m;
import p604rq.InterfaceC44169a;
import p770xq.C46325a;
import p770xq.C46326b;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterMonitorPlugin.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/monitor/flutter/FlutterMonitorPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", DbParams.KEY_CHANNEL_RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "binding", "onDetachedFromEngine", "e", "(Lio/flutter/plugin/common/MethodCall;)V", "b", "c", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", AppsFlyerProperties.CHANNEL, "Companion", "component_monitor_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterMonitorPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterMonitorPlugin.kt\ncom/kubi/monitor/flutter/FlutterMonitorPlugin\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,151:1\n216#2,2:152\n216#2,2:169\n1863#3,2:154\n94#4,13:156\n*S KotlinDebug\n*F\n+ 1 FlutterMonitorPlugin.kt\ncom/kubi/monitor/flutter/FlutterMonitorPlugin\n*L\n67#1:152,2\n120#1:169,2\n92#1:154,2\n108#1:156,13\n*E\n"})
public final class FlutterMonitorPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: a */
    public final void m42454a(MethodCall call) throws IllegalArgumentException {
        String str = (String) call.argument("category");
        if (str == null) {
            throw new IllegalArgumentException("category");
        }
        String str2 = (String) call.argument("message");
        if (str2 == null) {
            throw new IllegalArgumentException("message");
        }
        String str3 = (String) call.argument(FirebaseAnalytics.Param.LEVEL);
        if (str3 == null) {
            str3 = "info";
        }
        int iHashCode = str3.hashCode();
        if (iHashCode != 95458899) {
            if (iHashCode != 96784904) {
                if (iHashCode == 1124446108 && str3.equals("warning")) {
                    C43840a.m96552g(str2, str);
                    return;
                }
            } else if (str3.equals(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                C43840a.m96548b(str2, str);
                return;
            }
        } else if (str3.equals("debug")) {
            C43840a.m96550d(str2, str);
            return;
        }
        C43840a.m96550d(str2, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m42455b(MethodCall call) throws IllegalArgumentException {
        String str = (String) call.argument("name");
        if (str == null) {
            throw new IllegalArgumentException("name");
        }
        String str2 = (String) call.argument("category");
        if (str2 == null) {
            throw new IllegalArgumentException("category");
        }
        Integer num = (Integer) call.argument("code");
        if (num == null) {
            throw new IllegalArgumentException("code");
        }
        List<InterfaceC44169a> listMo32841c = C43848i.f96913a.m96586e().mo32841c();
        HashMap map = new HashMap();
        map.put("code", num);
        map.put("category", str2);
        Iterator<T> it = listMo32841c.iterator();
        while (it.hasNext()) {
            ((InterfaceC44169a) it.next()).mo94079b(str, map);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m42456c(MethodCall call) throws IllegalArgumentException {
        String str = (String) call.argument("name");
        if (str == null) {
            throw new IllegalArgumentException("name");
        }
        Map map = (Map) call.argument("dimensions");
        Map map2 = (Map) call.argument(C33675gh.f70007m);
        if (map == null && map2 == null) {
            C44128b.m97270n("FlutterMonitorPlugin", "kunlunTechnologyEvent args are empty");
            return;
        }
        if (map == null || map.isEmpty()) {
            C44128b.m97260d("kunlun dimensions is null");
            return;
        }
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (map2 == null || map2.isEmpty()) {
                interfaceC44169a.mo94079b(str, MapsKt.toMutableMap(map));
            } else {
                interfaceC44169a.mo94078a(str, MapsKt.toMutableMap(map2), MapsKt.toMutableMap(map));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m42457d(MethodCall call) throws IllegalArgumentException {
        String str = (String) call.argument("name");
        if (str == null) {
            throw new IllegalArgumentException("name");
        }
        Map map = (Map) call.argument("args");
        if (map == null) {
            TechnologyEvent.m42386b(str);
            return;
        }
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key instanceof String)) {
                return;
            }
            if (value instanceof String) {
                eventParametersBuilderAcquire.m42393d((String) key, (String) value);
            } else if (value instanceof Integer) {
                eventParametersBuilderAcquire.m42391b((String) key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                eventParametersBuilderAcquire.m42396g((String) key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                eventParametersBuilderAcquire.m42395f((String) key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                eventParametersBuilderAcquire.m42394e((String) key, ((Boolean) value).booleanValue());
            }
        }
        TechnologyEvent.m42388d(str, eventParametersBuilderAcquire);
    }

    /* JADX INFO: renamed from: e */
    public final void m42458e(MethodCall call) throws JSONException {
        String str = (String) call.argument("name");
        if (str == null) {
            throw new IllegalArgumentException("name");
        }
        Map map = (Map) call.argument("args");
        if (map == null) {
            throw new IllegalArgumentException("args");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key instanceof String)) {
                return;
            }
            if (value instanceof String) {
                jSONObject.put((String) key, value);
            } else if (value instanceof Integer) {
                jSONObject.put((String) key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                jSONObject.put((String) key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                jSONObject.put((String) key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                jSONObject.put((String) key, ((Boolean) value).booleanValue());
            }
        }
        C43852m.m96605q(str, jSONObject);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_monitor");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AppsFlyerProperties.CHANNEL);
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f A[Catch: all -> 0x002a, IllegalArgumentException -> 0x002d, TryCatch #2 {IllegalArgumentException -> 0x002d, all -> 0x002a, blocks: (B:3:0x000f, B:5:0x0013, B:6:0x0017, B:8:0x001c, B:11:0x0025, B:40:0x0097, B:16:0x0030, B:19:0x0039, B:20:0x003d, B:23:0x0046, B:24:0x004a, B:26:0x0052, B:27:0x0056, B:30:0x005f, B:31:0x0063, B:34:0x006c, B:35:0x0072, B:38:0x007b, B:39:0x007f), top: B:45:0x000f }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x007f, please report this as an issue */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(@NotNull MethodCall call, @NotNull MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            String str = call.method;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1179159878:
                        if (!str.equals("issues")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            C46325a.m102142b(call);
                        }
                        break;
                    case -1097337456:
                        if (!str.equals("logger")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            C46326b.f103903a.m102144a(call);
                        }
                        break;
                    case -972372627:
                        if (!str.equals("kunlunTechnologyEvent")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            m42456c(call);
                        }
                        break;
                    case -914275090:
                        if (!str.equals("technologyEvent")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            m42457d(call);
                        }
                        break;
                    case -51457840:
                        if (!str.equals("breadcrumbs")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            m42454a(call);
                        }
                        break;
                    case 1135978511:
                        if (!str.equals("trackEvent")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            m42458e(call);
                        }
                        break;
                    case 1451210201:
                        if (!str.equals("kunlunEvent")) {
                            result.error("notAllow", call.method + " is not allow", null);
                        } else {
                            m42455b(call);
                        }
                        break;
                    default:
                        result.error("notAllow", call.method + " is not allow", null);
                        break;
                }
            } else {
                result.error("notAllow", call.method + " is not allow", null);
            }
            result.success(null);
        } catch (IllegalArgumentException e11) {
            C44128b.m97262f("FlutterMonitorPlugin", "onMethodCall", e11);
            result.error("argLost", e11.getMessage(), null);
        } catch (Throwable th2) {
            C44128b.m97262f("FlutterMonitorPlugin", "onMethodCall", th2);
            result.error("failed", th2.getMessage(), null);
        }
    }
}
