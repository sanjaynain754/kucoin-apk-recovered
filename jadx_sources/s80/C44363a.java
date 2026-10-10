package s80;

import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.sdk.web.jsapi.InterfaceC24317b;
import com.kubi.widget.web.abtest.WebKnbABTestHelper;
import com.kubi.widget.web.jsbridge.handlers.JsCommonJumpHandler;
import com.kubi.widget.web.jsbridge.handlers.JsCommonProxyHandler;
import com.kubi.widget.web.jsbridge.handlers.KnbJsEventHandler;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: s80.a */
/* JADX INFO: compiled from: JsBridgeHandlerHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\tJ\n\u0010\u0011\u001a\u00020\u000b*\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/JsBridgeHandlerHelper;", "", "<init>", "()V", "TAG", "", "jsHandlerListRef", "", "Ljava/lang/ref/SoftReference;", "Lcom/kubi/sdk/web/jsapi/JsBridgeEventHandler;", "addAllHandlers", "", "Lcom/kubi/sdk/web/KWebView;", "activity", "Lcom/kubi/sdk/BaseActivity;", "addAgoraAllHandlers", "agoraHandler", "removeBeforeAllHandlers", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsBridgeHandlerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsBridgeHandlerHelper.kt\ncom/kubi/widget/web/jsbridge/JsBridgeHandlerHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1869#2,2:77\n1869#2,2:79\n*S KotlinDebug\n*F\n+ 1 JsBridgeHandlerHelper.kt\ncom/kubi/widget/web/jsbridge/JsBridgeHandlerHelper\n*L\n51#1:77,2\n67#1:79,2\n*E\n"})
public final class C44363a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44363a f98027a = new C44363a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<SoftReference<InterfaceC24317b>> f98028b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m97857a(@NotNull KWebView kWebView, @NotNull BaseActivity activity, @NotNull InterfaceC24317b agoraHandler) {
        Intrinsics.checkNotNullParameter(kWebView, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(agoraHandler, "agoraHandler");
        f98028b.clear();
        for (InterfaceC24317b interfaceC24317b : CollectionsKt.listOf((Object[]) new InterfaceC24317b[]{new JsCommonProxyHandler(activity), new JsCommonJumpHandler(activity, kWebView), agoraHandler})) {
            kWebView.m58562b(interfaceC24317b);
            f98028b.add(new SoftReference<>(interfaceC24317b));
        }
        if (WebKnbABTestHelper.f55056a.m67082d()) {
            return;
        }
        kWebView.m58583w();
    }

    /* JADX INFO: renamed from: b */
    public final void m97858b(@NotNull KWebView kWebView, @NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(kWebView, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        kWebView.m58562b(new JsCommonProxyHandler(activity));
        kWebView.m58562b(new JsCommonJumpHandler(activity, kWebView));
        kWebView.m58562b(new KnbJsEventHandler(activity, kWebView));
        if (WebKnbABTestHelper.f55056a.m67082d()) {
            return;
        }
        kWebView.m58583w();
    }

    /* JADX INFO: renamed from: c */
    public final void m97859c(@NotNull KWebView kWebView) {
        Intrinsics.checkNotNullParameter(kWebView, "<this>");
        Iterator<T> it = f98028b.iterator();
        while (it.hasNext()) {
            InterfaceC24317b interfaceC24317b = (InterfaceC24317b) ((SoftReference) it.next()).get();
            if (interfaceC24317b != null) {
                kWebView.m58556A(interfaceC24317b);
            }
        }
    }
}
