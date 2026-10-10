package com.kubi.web.api;

import android.content.Context;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IWebService.kt */
/* JADX INFO: loaded from: classes23.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J \u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0003H&J\u0018\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&JB\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u001c\u0010\u0004\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00030\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/web/api/IWebService;", "", "refreshSession", "", TUIConstants.TUIChat.CALL_BACK, "Lio/reactivex/functions/BiConsumer;", "", "", "getSession", "url", "clearUserCookie", "updatedGray", "force", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvent", "eventName", "showAddHomePageDialog", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", "shortcutId", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "Companion", "WebApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IWebService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f54644a = Companion.f54645a;

    /* JADX INFO: compiled from: IWebService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/web/api/IWebService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/web/api/IWebService;", "WebApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f54645a = new Companion();

        @NotNull
        public final IWebService get() {
            return (IWebService) Router.f46192a.m56192n(IWebService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo36738a(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo36739b(boolean z11, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo36740c(@NotNull String str);

    /* JADX INFO: renamed from: e */
    void mo36741e(@Nullable BiConsumer<Boolean, String> biConsumer);

    void showAddHomePageDialog(@NotNull Context ctx, @Nullable Object obj, @Nullable String shortcutId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m67010d(IWebService iWebService, boolean z11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatedGray");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return iWebService.mo36739b(z11, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m67011f(IWebService iWebService, BiConsumer biConsumer, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshSession");
        }
        if ((i11 & 1) != 0) {
            biConsumer = null;
        }
        iWebService.mo36741e(biConsumer);
    }
}
