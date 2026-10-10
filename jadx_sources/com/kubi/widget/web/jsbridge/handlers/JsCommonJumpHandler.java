package com.kubi.widget.web.jsbridge.handlers;

import android.content.Intent;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.messaging.Constants;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.jsapi.InterfaceC24317b;
import com.kubi.sdk.web.jsapi.JsBridgeEvent;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.widget.web.R$id;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.exception.KWebWidgetMessage;
import cy.InterfaceC36555b;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: JsCommonJumpHandler.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler;", "Lcom/kubi/sdk/web/jsapi/JsBridgeEventHandler;", "activity", "Lcom/kubi/sdk/BaseActivity;", "webView", "Lcom/kubi/sdk/web/KWebView;", "<init>", "(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/KWebView;)V", "handleEvent", "", "event", "Lcom/kubi/sdk/web/jsapi/JsBridgeEvent;", "track", "", "code", "", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsCommonJumpHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsCommonJumpHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler\n+ 2 JsBridgeEventEx.kt\ncom/kubi/widget/web/jsbridge/handlers/JsBridgeEventExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 5 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,88:1\n7#2:89\n1#3:90\n54#4,2:91\n46#4,6:93\n71#5,4:99\n*S KotlinDebug\n*F\n+ 1 JsCommonJumpHandler.kt\ncom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler\n*L\n44#1:89\n44#1:90\n62#1:91,2\n75#1:93,6\n83#1:99,4\n*E\n"})
public final class JsCommonJumpHandler implements InterfaceC24317b {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f55208c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseActivity f55209a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KWebView f55210b;

    /* JADX INFO: compiled from: JsCommonJumpHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/handlers/JsCommonJumpHandler$Companion;", "", "<init>", "()V", "TAG", "", "KEY_RESULT_CALLBACK", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public JsCommonJumpHandler(@NotNull BaseActivity activity, @NotNull KWebView webView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f55209a = activity;
        this.f55210b = webView;
    }

    /* JADX INFO: renamed from: c */
    public static final void m67325c(String str, JsBridgeEvent jsBridgeEvent, JsCommonJumpHandler jsCommonJumpHandler, int i11, Intent intent) {
        C24329b.f48558a.m58864d("jsInoke", "url: " + str + ", code:" + i11);
        if (i11 == -1) {
            JsBridgeEvent.m58746c(jsBridgeEvent, 0, "succeed", false, 5, null);
        } else {
            JsBridgeEvent.m58746c(jsBridgeEvent, 0, ConstantsKt.FACE_CAPTURE_MODE_BACK, false, 5, null);
        }
        jsCommonJumpHandler.m67326d(jsBridgeEvent, 0);
    }

    @Override // com.kubi.sdk.web.jsapi.InterfaceC24317b
    /* JADX INFO: renamed from: a */
    public boolean mo58765a(@NotNull final JsBridgeEvent event) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event.getType(), "jump")) {
            return false;
        }
        try {
            final String value = event.getValue();
            Object obj = event.m58751f().get("app_android_result_callback");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                Object obj2 = event.m58751f().get("app_android_result_callback");
                String str = obj2 instanceof String ? (String) obj2 : null;
                Boolean boolValueOf = str != null ? Boolean.valueOf(Intrinsics.areEqual(str, CredentialEntry.TRUE_STRING)) : null;
                zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
            }
            C4400a c4400aM4038a = Router.f46192a.m56184f(value).m4039b(event.m58751f()).m4038a("userLoginInterceptorCheckFromH5", Boolean.TRUE);
            if (zBooleanValue && event.getCom.tencent.qcloud.tuicore.TUIConstants.TUIChat.CALL_BACK java.lang.String() != null) {
                c4400aM4038a = c4400aM4038a.m4051n(new InterfaceC36555b() { // from class: com.kubi.widget.web.jsbridge.handlers.a
                    @Override // cy.InterfaceC36555b
                    /* JADX INFO: renamed from: a */
                    public final void mo4404a(int i11, Intent intent) {
                        JsCommonJumpHandler.m67325c(value, event, this, i11, intent);
                    }
                });
            }
            C44128b.m97259c("jump " + value, "JsCommonJumpHandler");
            if (c4400aM4038a.m4048k()) {
                C24329b.f48558a.m58864d("jsInoke", "url: " + value + ", navigation success");
                this.f55210b.setTag(R$id.jump_url_tag, value);
                if (!zBooleanValue) {
                    JsBridgeEvent.m58746c(event, 0, "succeed", false, 5, null);
                    m67326d(event, 0);
                }
            } else {
                C43846g.m96568c(new KWebWidgetMessage("jump not found", "JsCommonJumpHandler", false, 4, null), null, 2, null);
                JsBridgeEvent.m58746c(event, -1, "not found", false, 4, null);
                m67326d(event, 404);
            }
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "JsCommonJumpHandler", false, null, 8, null), null, 2, null);
            }
            JsBridgeEvent.m58746c(event, -1, Constants.IPC_BUNDLE_KEY_SEND_ERROR, false, 4, null);
            m67326d(event, 500);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m67326d(JsBridgeEvent jsBridgeEvent, int i11) {
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire.m42391b("code", i11);
        eventParametersBuilderAcquire.m42393d("url", jsBridgeEvent.getValue());
        TechnologyEvent.m42388d("js_bridge_jump", eventParametersBuilderAcquire);
    }
}
