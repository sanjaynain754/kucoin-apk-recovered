package com.kubi.widget.web.jsbridge.handlers;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.KCHybridProtocolManager;
import com.kubi.sdk.protocol.jsapi.KCJSApiProtocolManager;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.jsapi.InterfaceC24316a;
import com.kubi.sdk.web.jsapi.InterfaceC24317b;
import com.kubi.sdk.web.jsapi.JsBridgeEvent;
import com.kubi.sdk.web.util.C24335h;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.widget.web.exception.KNBHybridException;
import com.kubi.widget.web.exception.KNBHybridNotImplException;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import s80.C44365c;

/* JADX INFO: compiled from: KnbJsEventHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J8\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\tH\u0002J$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler;", "Lcom/kubi/sdk/web/jsapi/JsBridgeEventHandler;", "activity", "Lcom/kubi/sdk/BaseActivity;", "webView", "Lcom/kubi/sdk/web/KWebView;", "<init>", "(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/KWebView;)V", "handleEvent", "", "event", "Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "getCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "knbHandle", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleKycCallback", DbParams.KEY_CHANNEL_RESULT, "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/protocol/ProtocolException;", "handleCallback", "isHybrid", "isStorage", "handleStorageCallback", "track", "businessTrack", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKnbJsEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnbJsEventHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,295:1\n488#2,7:296\n136#3,9:303\n216#3:312\n217#3:314\n145#3:315\n1#4:313\n71#5,4:316\n*S KotlinDebug\n*F\n+ 1 KnbJsEventHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler\n*L\n95#1:296,7\n96#1:303,9\n96#1:312\n96#1:314\n96#1:315\n96#1:313\n264#1:316,4\n*E\n"})
public class KnbJsEventHandler implements InterfaceC24317b {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f55214c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Set<String> f55215d = SetsKt.setOf((Object[]) new String[]{"enableBounces", "updateBackgroundColor", "disableSideSlip"});

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseActivity f55216a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KWebView f55217b;

    /* JADX INFO: compiled from: KnbJsEventHandler.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler$Companion;", "", "<init>", "()V", "TAG", "", "ignoreSet", "", "TRACK_CODE_START", "", "TRACK_CODE_FAILED", "TRACK_CODE_NOT_IMPL", "TRACK_CODE_IGNORE", "TRACK_CODE_CANCEL", "KL_CODE_SUCCESS", "KL_CODE_FAILED", "KL_CODE_ERROR", "KL_CODE_CANCEL", "track", "", "event", "Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "code", "klTrack", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKnbJsEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KnbJsEventHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler$Companion\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,295:1\n71#2,4:296\n*S KotlinDebug\n*F\n+ 1 KnbJsEventHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler$Companion\n*L\n57#1:296,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final void m67351a(int i11) {
            C43847h.m96575d(KunlunTechEventEnum.CATE_KNB_HYBRID, i11);
        }

        /* JADX INFO: renamed from: b */
        public final void m67352b(JsBridgeEvent jsBridgeEvent, int i11) {
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42391b("code", i11);
            eventParametersBuilderAcquire.m42393d("category", jsBridgeEvent.getValue());
            eventParametersBuilderAcquire.m42393d("type", jsBridgeEvent.getType());
            TechnologyEvent.m42388d("KNBHybridBridge", eventParametersBuilderAcquire);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m67347j(JsBridgeEvent jsBridgeEvent, Object obj, ProtocolException protocolException) {
        JsBridgeEvent jsBridgeEvent2;
        if (protocolException == null) {
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.areEqual(bool, obj)) {
                jsBridgeEvent.m58749b(bool, -1, "failed", false);
                jsBridgeEvent2 = jsBridgeEvent;
            } else {
                jsBridgeEvent2 = jsBridgeEvent;
                JsBridgeEvent.m58747d(jsBridgeEvent2, obj, 0, "success", false, 8, null);
            }
        } else {
            jsBridgeEvent2 = jsBridgeEvent;
            String code = protocolException.getCode();
            int iM66651k = C27039d.m66651k(code != null ? StringsKt.toIntOrNull(code) : null, -1);
            Throwable throwable = protocolException.getThrowable();
            String message = throwable != null ? throwable.getMessage() : null;
            if (message == null) {
                message = "";
            }
            jsBridgeEvent2.m58749b(protocolException.getData(), iM66651k, message, false);
        }
        m67350o(jsBridgeEvent2, protocolException);
    }

    /* JADX INFO: renamed from: k */
    public final void m67348k(JsBridgeEvent jsBridgeEvent, Object obj, ProtocolException protocolException) {
        LinkedHashMap linkedHashMapLinkedMapOf;
        String str = "";
        if (protocolException == null) {
            if (obj == null) {
                obj = "";
            }
            linkedHashMapLinkedMapOf = MapsKt.linkedMapOf(TuplesKt.m90091to("data", obj), TuplesKt.m90091to("code", 0), TuplesKt.m90091to("success", Boolean.TRUE), TuplesKt.m90091to("msg", "success"));
        } else {
            Object data = protocolException.getData();
            if (data == null) {
                data = "";
            }
            Pair pairM90091to = TuplesKt.m90091to("data", data);
            Pair pairM90091to2 = TuplesKt.m90091to("code", -1);
            Pair pairM90091to3 = TuplesKt.m90091to("success", Boolean.FALSE);
            String code = protocolException.getCode();
            if (code == null) {
                Throwable throwable = protocolException.getThrowable();
                String message = throwable != null ? throwable.getMessage() : null;
                if (message != null) {
                    str = message;
                }
            } else {
                str = code;
            }
            linkedHashMapLinkedMapOf = MapsKt.linkedMapOf(pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("msg", str));
        }
        InterfaceC24316a interfaceC24316a = jsBridgeEvent.getCom.tencent.qcloud.tuicore.TUIConstants.TUIChat.CALL_BACK java.lang.String();
        if (interfaceC24316a != null) {
            interfaceC24316a.mo58745a(C27099x.m66919i(linkedHashMapLinkedMapOf, false, 2, null));
        }
    }

    public KnbJsEventHandler(@NotNull BaseActivity activity, @NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f55216a = activity;
        this.f55217b = webView;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m67342i(KnbJsEventHandler knbJsEventHandler, JsBridgeEvent jsBridgeEvent, Object obj, ProtocolException protocolException, boolean z11, boolean z12, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCallback");
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        knbJsEventHandler.m67346h(jsBridgeEvent, obj, protocolException, z11, z12);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m67343m(String str, JsBridgeEvent jsBridgeEvent, KnbJsEventHandler knbJsEventHandler, Object obj, ProtocolException protocolException) {
        C44365c c44365c = C44365c.f98029a;
        Object objM97862b = c44365c.m97862b(str, jsBridgeEvent.getValue(), obj);
        if (c44365c.m97865f(str) && protocolException != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("H5 bridge failed method=");
            sb2.append(jsBridgeEvent.getValue());
            sb2.append(", code=");
            sb2.append(protocolException.getCode());
            sb2.append(", data=");
            sb2.append(protocolException.getData());
            sb2.append(", message=");
            Throwable throwable = protocolException.getThrowable();
            String message = throwable != null ? throwable.getMessage() : null;
            if (message == null) {
                message = "";
            }
            sb2.append(message);
            C44128b.m97266j("KCJsBridgeStorage", sb2.toString());
        }
        m67342i(knbJsEventHandler, jsBridgeEvent, objM97862b, protocolException, false, c44365c.m97865f(str), 8, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24317b
    /* JADX INFO: renamed from: a */
    public boolean mo58765a(@NotNull JsBridgeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event.getType(), "func")) {
            return false;
        }
        C41696j.m91104d(mo14944g(), C42911a.m94120b(), null, new KnbJsEventHandler$handleEvent$1(this, event, null), 2, null);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public InterfaceC41709m0 mo14944g() {
        return LifecycleOwnerKt.getLifecycleScope(this.f55216a);
    }

    /* JADX INFO: renamed from: h */
    public final void m67346h(JsBridgeEvent jsBridgeEvent, Object obj, ProtocolException protocolException, boolean z11, boolean z12) {
        if (z12) {
            m67348k(jsBridgeEvent, obj, protocolException);
            m67350o(jsBridgeEvent, protocolException);
            return;
        }
        if (protocolException == null) {
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.areEqual(bool, obj) && z11) {
                jsBridgeEvent.m58749b(bool, -1, "failed", false);
            } else {
                JsBridgeEvent.m58747d(jsBridgeEvent, obj, 0, "success", false, 8, null);
            }
        } else {
            String code = protocolException.getCode();
            if (code == null) {
                Throwable throwable = protocolException.getThrowable();
                code = throwable != null ? throwable.getMessage() : null;
                if (code == null) {
                    code = "";
                }
            }
            JsBridgeEvent.m58747d(jsBridgeEvent, protocolException.getData(), -1, code, false, 8, null);
        }
        m67350o(jsBridgeEvent, protocolException);
    }

    /* JADX INFO: renamed from: l */
    public final Object m67349l(Context context, final JsBridgeEvent jsBridgeEvent, Continuation<? super Unit> continuation) {
        Map<String, ? extends Object> mapEmptyMap;
        f55214c.m67352b(jsBridgeEvent, 0);
        Object obj = jsBridgeEvent.m58751f().get("source");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            KCHybridProtocolManager kCHybridProtocolManager = KCHybridProtocolManager.f47498a;
            KWebView kWebView = this.f55217b;
            Intrinsics.checkNotNull(kWebView, "null cannot be cast to non-null type java.lang.Object");
            Object objM57892a = kCHybridProtocolManager.m57892a(context, kWebView, jsBridgeEvent.getValue(), jsBridgeEvent.m58751f(), new Function2() { // from class: com.kubi.widget.web.jsbridge.handlers.d
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return KnbJsEventHandler.m67344n(jsBridgeEvent, this, obj2, (ProtocolException) obj3);
                }
            }, continuation);
            return objM57892a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM57892a : Unit.INSTANCE;
        }
        Object obj2 = jsBridgeEvent.m58751f().get("module");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        final String str2 = (String) obj2;
        Object obj3 = jsBridgeEvent.m58751f().get("arguments");
        if (obj3 instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj3).entrySet()) {
                if (entry.getKey() instanceof String) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                Pair pairM90091to = (!(key instanceof String) || value == null) ? null : TuplesKt.m90091to(key, value);
                if (pairM90091to != null) {
                    arrayList.add(pairM90091to);
                }
            }
            mapEmptyMap = MapsKt.toMap(arrayList);
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        C44365c c44365c = C44365c.f98029a;
        String strM97866g = c44365c.m97866g(str2, jsBridgeEvent.getValue(), obj3);
        if (strM97866g != null) {
            C44128b.m97266j("KCJsBridgeStorage", "H5 bridge failed method=" + jsBridgeEvent.getValue() + ", message=" + strM97866g);
            m67342i(this, jsBridgeEvent, null, new ProtocolException("-9001", new IllegalArgumentException(strM97866g), strM97866g, false, 8, null), false, false, 24, null);
            return Unit.INSTANCE;
        }
        Map<String, ? extends Object> mapM97863c = c44365c.m97863c(str2, jsBridgeEvent.getValue(), mapEmptyMap);
        if (c44365c.m97865f(str2)) {
            C44128b.m97266j("KCJsBridgeStorage", "H5 bridge call source=" + str + ", module=" + str2 + ", method=" + jsBridgeEvent.getValue() + ", args=" + c44365c.m97864d(mapM97863c));
        }
        Object objM57893a = KCJSApiProtocolManager.f47500a.m57893a(context, this.f55217b, str, str2, jsBridgeEvent.getValue(), mapM97863c, new Function2() { // from class: com.kubi.widget.web.jsbridge.handlers.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj4, Object obj5) {
                return KnbJsEventHandler.m67343m(str2, jsBridgeEvent, this, obj4, (ProtocolException) obj5);
            }
        }, continuation);
        return objM57893a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM57893a : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public final void m67350o(JsBridgeEvent jsBridgeEvent, ProtocolException protocolException) {
        Integer intOrNull;
        if (protocolException == null) {
            f55214c.m67351a(0);
            return;
        }
        int iIntValue = -1;
        if (Intrinsics.areEqual(protocolException.getCode(), "-9003")) {
            if (f55215d.contains(jsBridgeEvent.getValue())) {
                Companion companion = f55214c;
                companion.m67352b(jsBridgeEvent, 3);
                companion.m67351a(-1);
                return;
            }
            Companion companion2 = f55214c;
            companion2.m67352b(jsBridgeEvent, 2);
            Integer intOrNull2 = StringsKt.toIntOrNull("-9003");
            companion2.m67351a(intOrNull2 != null ? intOrNull2.intValue() : -1);
            C43846g.m96568c(new KNBHybridNotImplException("code:2 desc: " + jsBridgeEvent.getValue() + " not handle ", "KnbJsEventHandler", false, 4, null), null, 2, null);
            return;
        }
        if (!Intrinsics.areEqual(protocolException.getCode(), "-9002") && !Intrinsics.areEqual(protocolException.getCode(), "-9001")) {
            m67345f(jsBridgeEvent, protocolException);
            return;
        }
        Companion companion3 = f55214c;
        companion3.m67352b(jsBridgeEvent, 1);
        String code = protocolException.getCode();
        if (code != null && (intOrNull = StringsKt.toIntOrNull(code)) != null) {
            iIntValue = intOrNull.intValue();
        }
        companion3.m67351a(iIntValue);
        C43846g.m96568c(new KNBHybridException("code:" + protocolException.getCode(), "KnbJsEventHandler", false, 4, null), null, 2, null);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m67344n(JsBridgeEvent jsBridgeEvent, KnbJsEventHandler knbJsEventHandler, Object obj, ProtocolException protocolException) {
        if (Intrinsics.areEqual(jsBridgeEvent.getValue(), "openAdvancedCertification")) {
            knbJsEventHandler.m67347j(jsBridgeEvent, obj, protocolException);
        } else {
            m67342i(knbJsEventHandler, jsBridgeEvent, obj, protocolException, true, false, 16, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m67345f(JsBridgeEvent jsBridgeEvent, ProtocolException protocolException) {
        Uri uriM58889h = null;
        if (protocolException.isIgnore()) {
            String url = this.f55217b.getUrl();
            if (url != null) {
                uriM58889h = C24335h.f48569a.m58889h(url);
            }
            String str = "unkown";
            if (uriM58889h != null) {
                TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                String code = protocolException.getCode();
                if (code == null) {
                    code = "unkown";
                }
                eventParametersBuilderAcquire.m42393d("type", code);
                String string = uriM58889h.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                eventParametersBuilderAcquire.m42393d("url", string);
                String encodedPath = uriM58889h.getEncodedPath();
                String str2 = "";
                if (encodedPath == null) {
                    encodedPath = "";
                }
                eventParametersBuilderAcquire.m42393d("path", encodedPath);
                String host = uriM58889h.getHost();
                if (host != null) {
                    str2 = host;
                }
                eventParametersBuilderAcquire.m42393d("host", str2);
                TechnologyEvent.m42388d("kucoin_webview", eventParametersBuilderAcquire);
            }
            String code2 = protocolException.getCode();
            if (code2 != null) {
                str = code2;
            }
            C43840a.m96550d(str, "KnbJsEventHandler");
            f55214c.m67351a(-1);
            return;
        }
        Throwable throwable = protocolException.getThrowable();
        if (throwable == null) {
            Companion companion = f55214c;
            companion.m67351a(-1);
            companion.m67352b(jsBridgeEvent, 1);
            C43846g.m96568c(new KNBHybridException("code:" + protocolException.getCode(), "KnbJsEventHandler", false, 4, null), null, 2, null);
            return;
        }
        if (throwable instanceof CancellationException) {
            Companion companion2 = f55214c;
            companion2.m67351a(-3);
            companion2.m67352b(jsBridgeEvent, 4);
            return;
        }
        Companion companion3 = f55214c;
        companion3.m67351a(-2);
        companion3.m67352b(jsBridgeEvent, 1);
        C43846g.m96568c(new KNBHybridException("code:" + protocolException.getCode() + " desc: " + throwable.getMessage(), throwable, "KnbJsEventHandler", false, 8, null), null, 2, null);
    }
}
