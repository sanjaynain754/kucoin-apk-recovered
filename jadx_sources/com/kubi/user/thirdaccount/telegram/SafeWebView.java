package com.kubi.user.thirdaccount.telegram;

import android.content.Context;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\rH\u0016J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170!H\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/SafeWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroying", "", "destroyed", "renderProcessGone", "markDestroying", "", "markRenderProcessGone", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "evaluateJavascript", "script", "", "resultCallback", "Landroid/webkit/ValueCallback;", "canEvaluateJavascriptNow", "startActionMode", "Landroid/view/ActionMode;", TUIConstants.TUIChat.CALL_BACK, "Landroid/view/ActionMode$Callback;", "type", "", "startActionModeForChild", "originalView", "Landroid/view/View;", "safeStartActionMode", "start", "Lkotlin/Function0;", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTelegramAuthActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/SafeWebView\n*L\n1#1,658:1\n620#1,5:659\n620#1,5:664\n620#1,5:669\n620#1,5:674\n*S KotlinDebug\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/SafeWebView\n*L\n588#1:659,5\n594#1:664,5\n604#1:669,5\n614#1:674,5\n*E\n"})
final class SafeWebView extends WebView {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f53824f = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicBoolean f53825b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f53826c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f53827d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f53828e;

    /* JADX INFO: compiled from: TelegramAuthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/SafeWebView$Companion;", "", "<init>", "()V", "TAG", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m65789b() {
        this.f53826c = true;
        this.f53825b.set(true);
    }

    /* JADX INFO: renamed from: c */
    public final void m65790c() {
        this.f53828e = true;
        m65789b();
    }

    @Override // android.view.View
    @Nullable
    public ActionMode startActionMode(@Nullable ActionMode.Callback callback) {
        try {
            return super.startActionMode(C26825l.m65833r(callback));
        } catch (Exception unused) {
            C43840a.m96548b("telegram auth startActionMode resource not found", "SafeWebView");
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ActionMode startActionModeForChild(@Nullable View originalView, @Nullable ActionMode.Callback callback) {
        try {
            return super.startActionModeForChild(originalView, C26825l.m65833r(callback));
        } catch (Exception unused) {
            C43840a.m96548b("telegram auth startActionMode resource not found", "SafeWebView");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53825b = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65788a() {
        return (this.f53825b.get() || this.f53826c || this.f53827d || this.f53828e || !Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()) || !isAttachedToWindow() || getWindowToken() == null) ? false : true;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f53827d) {
            return;
        }
        m65789b();
        this.f53827d = true;
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NotNull String script, @Nullable ValueCallback<String> resultCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        if (m65788a()) {
            super.evaluateJavascript(script, resultCallback);
        }
    }

    @Override // android.view.View
    @Nullable
    public ActionMode startActionMode(@Nullable ActionMode.Callback callback, int type) {
        try {
            return super.startActionMode(C26825l.m65833r(callback), type);
        } catch (Exception unused) {
            C43840a.m96548b("telegram auth startActionMode resource not found", "SafeWebView");
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public ActionMode startActionModeForChild(@Nullable View originalView, @Nullable ActionMode.Callback callback, int type) {
        try {
            return super.startActionModeForChild(originalView, C26825l.m65833r(callback), type);
        } catch (Exception unused) {
            C43840a.m96548b("telegram auth startActionMode resource not found", "SafeWebView");
            return null;
        }
    }
}
