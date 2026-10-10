package com.kubi.sdk.web.jsapi;

import android.webkit.ValueCallback;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: JsEventObj.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016RF\u0010\u001b\u001a4\u0012.\u0012,\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007 \u0018*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b0\u0006j\u0002`\b\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsEventObj;", "Landroid/webkit/ValueCallback;", "", "event", ReportDataTable.COLUMN_PARAMS, "func", "Lkotlin/Function1;", "", "Lcom/kubi/sdk/web/jsapi/JsEventCallBack;", TUIConstants.TUIChat.CALL_BACK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "value", "b", "(Ljava/lang/String;)V", "Lcom/kubi/sdk/web/KWebView;", "webView", "c", "(Lcom/kubi/sdk/web/KWebView;)V", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "d", "Ljava/lang/ref/WeakReference;", "callbackRef", "e", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsEventObj.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsEventObj.kt\ncom/kubi/sdk/web/jsapi/JsEventObj\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,93:1\n1#2:94\n86#3,3:95\n*S KotlinDebug\n*F\n+ 1 JsEventObj.kt\ncom/kubi/sdk/web/jsapi/JsEventObj\n*L\n84#1:95,3\n*E\n"})
public final class JsEventObj implements ValueCallback<String> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String params;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String func;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final WeakReference<Function1<String, Unit>> callbackRef;

    /* JADX INFO: compiled from: JsEventObj.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/web/jsapi/JsEventObj$Companion;", "", "()V", "EVENT_DISPATCHER_FUNC", "", "RESULT_TRUE", "TAG", "buildBackClick", "Lcom/kubi/sdk/web/jsapi/JsEventObj;", "backAction", "Lkotlin/Function0;", "", "buildBackClick$KWebView_release", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final JsEventObj buildBackClick$KWebView_release(@NotNull final Function0<Unit> backAction) {
            Intrinsics.checkNotNullParameter(backAction, "backAction");
            return new JsEventObj("onLeftClick", null, null, new Function1<String, Unit>() { // from class: com.kubi.sdk.web.jsapi.JsEventObj$Companion$buildBackClick$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (Intrinsics.areEqual(it, CredentialEntry.TRUE_STRING)) {
                        return;
                    }
                    try {
                        backAction.invoke();
                    } catch (Exception e11) {
                        C43846g.m96568c(new WebCoreException(e11, "eventDispatcher", false, "postBackError", 4, null), null, 2, null);
                    }
                }
            }, 6, null);
        }
    }

    public JsEventObj(@NotNull String event, @NotNull String params, @NotNull String func, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(func, "func");
        this.event = event;
        this.params = params;
        this.func = func;
        this.callbackRef = function1 != null ? new WeakReference<>(function1) : null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m58758d(KWebView webView, JsEventObj this$0) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!webView.m58564d()) {
                C24329b.f48558a.m58864d("JsEventObj", "JsEventObj message runnable block~ ");
                return;
            }
            webView.evaluateJavascript(this$0.func + "('" + this$0.event + "','" + this$0.params + "')", this$0);
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "JsEventObj", false, "postEvent", 4, null), null, 2, null);
        }
    }

    @Override // android.webkit.ValueCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(@Nullable String value) {
        Function1<String, Unit> function1;
        WeakReference<Function1<String, Unit>> weakReference = this.callbackRef;
        if (weakReference == null || (function1 = weakReference.get()) == null) {
            return;
        }
        function1.invoke(C27041f.m66668h(value));
    }

    /* JADX INFO: renamed from: c */
    public final void m58760c(@NotNull final KWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (this.func.length() == 0 || this.event.length() == 0) {
            C44128b.m97261e("JsEventObj", "post empty");
        } else if (webView.m58565e()) {
            webView.post(new Runnable() { // from class: com.kubi.sdk.web.jsapi.e
                @Override // java.lang.Runnable
                public final void run() {
                    JsEventObj.m58758d(webView, this);
                }
            });
        } else {
            C24329b.f48558a.m58864d("JsEventObj", "JsEventObj postTo block~ ");
        }
    }

    @NotNull
    public String toString() {
        return this.func + "('" + this.event + "','" + this.params + "')[" + hashCode() + ']';
    }

    public /* synthetic */ JsEventObj(String str, String str2, String str3, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "eventDispatcher" : str3, (i11 & 8) != 0 ? null : function1);
    }
}
