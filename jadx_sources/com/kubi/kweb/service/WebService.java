package com.kubi.kweb.service;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27012a;
import com.kubi.web.api.IWebService;
import com.kubi.widget.web.service.IKWebService;
import com.kubi.widget.web.ui.KWebBaseActivity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Deprecated(message = "use KWebService")
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0011JB\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kweb/service/WebService;", "Lcom/kubi/web/api/IWebService;", "<init>", "()V", "refreshSession", "", TUIConstants.TUIChat.CALL_BACK, "Lio/reactivex/functions/BiConsumer;", "", "", "getSession", "url", "clearUserCookie", "postEvent", "eventName", "updatedGray", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAddHomePageDialog", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "shortcutId", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WebService implements IWebService {
    @Override // com.kubi.web.api.IWebService
    /* JADX INFO: renamed from: a */
    public void mo36738a(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        IKWebService.f55226a.get().mo67354a(eventName);
    }

    @Override // com.kubi.web.api.IWebService
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo36739b(boolean z11, @NotNull Continuation<? super Unit> continuation) {
        Object objMo67355b = IKWebService.f55226a.get().mo67355b(z11, continuation);
        return objMo67355b == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo67355b : Unit.INSTANCE;
    }

    @Override // com.kubi.web.api.IWebService
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo36740c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return IKWebService.f55226a.get().mo67356c(url);
    }

    @Override // com.kubi.web.api.IWebService
    public void showAddHomePageDialog(@NotNull Context ctx, @Nullable Object obj, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(ctx instanceof KWebBaseActivity)) {
            callback.invoke(Boolean.FALSE, new ProtocolException("showAddHomePageDialog failed,check ctx", null, null, false, 14, null));
        } else {
            IAppletService.f46452a.get().mo15070e((FragmentActivity) ctx, shortcutId, callback);
            callback.invoke(Boolean.FALSE, null);
        }
    }

    @Override // com.kubi.web.api.IWebService
    /* JADX INFO: renamed from: e */
    public void mo36741e(@Nullable BiConsumer<Boolean, String> biConsumer) {
        LifecycleOwner lifecycleOwner;
        ComponentCallbacks2 componentCallbacks2M66494h = C27012a.m66486i().m66494h();
        if (componentCallbacks2M66494h instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) componentCallbacks2M66494h;
        } else {
            lifecycleOwner = null;
        }
        if (lifecycleOwner != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new WebService$refreshSession$1(biConsumer, null), 3, null);
        }
    }
}
