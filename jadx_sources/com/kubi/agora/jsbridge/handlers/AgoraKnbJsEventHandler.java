package com.kubi.agora.jsbridge.handlers;

import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.web.KWebView;
import com.kubi.widget.web.jsbridge.handlers.KnbJsEventHandler;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AgoraKnbJsEventHandler.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/agora/jsbridge/handlers/AgoraKnbJsEventHandler;", "Lcom/kubi/widget/web/jsbridge/handlers/KnbJsEventHandler;", "activity", "Lcom/kubi/sdk/BaseActivity;", "webView", "Lcom/kubi/sdk/web/KWebView;", "<init>", "(Lcom/kubi/sdk/BaseActivity;Lcom/kubi/sdk/web/KWebView;)V", "getCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AgoraKnbJsEventHandler extends KnbJsEventHandler {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f15323e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final InterfaceC41709m0 f15324f = C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94120b()));

    /* JADX INFO: compiled from: AgoraKnbJsEventHandler.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/agora/jsbridge/handlers/AgoraKnbJsEventHandler$Companion;", "", "<init>", "()V", "bgScope", "Lkotlinx/coroutines/CoroutineScope;", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgoraKnbJsEventHandler(@NotNull BaseActivity activity, @NotNull KWebView webView) {
        super(activity, webView);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
    }

    @Override // com.kubi.widget.web.jsbridge.handlers.KnbJsEventHandler
    @NotNull
    /* JADX INFO: renamed from: g */
    public InterfaceC41709m0 mo14944g() {
        return f15324f;
    }
}
