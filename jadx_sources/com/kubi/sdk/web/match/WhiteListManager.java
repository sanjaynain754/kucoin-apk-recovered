package com.kubi.sdk.web.match;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.host.HostManager;
import com.kubi.sdk.web.core.WebCoreException;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: compiled from: WhiteListManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/web/match/WhiteListManager;", "", "<init>", "()V", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "newList", "g", "(Ljava/util/List;)V", "f", "url", "", "b", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Z", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "writeList", "e", "Lcom/kubi/sdk/web/match/WhiteListMatcher;", "Lcom/kubi/sdk/web/match/WhiteListMatcher;", "hostMatcher", "whitelistMatcher", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWhiteListManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteListManager.kt\ncom/kubi/sdk/web/match/WhiteListManager\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 WebCoreException.kt\ncom/kubi/sdk/web/core/WebCoreExceptionKt\n*L\n1#1,89:1\n181#2,5:90\n86#3,3:95\n86#3,3:98\n*S KotlinDebug\n*F\n+ 1 WhiteListManager.kt\ncom/kubi/sdk/web/match/WhiteListManager\n*L\n28#1:90,5\n31#1:95,3\n53#1:98,3\n*E\n"})
public final class WhiteListManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WhiteListManager f48507a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final WhiteListMatcher hostMatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final WhiteListMatcher whitelistMatcher;

    /* JADX INFO: renamed from: e */
    public final void m58804e(List<String> writeList) {
        try {
            C46396e.m102358o("web", "whitelist", C27099x.m66919i(writeList, false, 2, null));
        } catch (Exception e11) {
            C43846g.m96568c(new WebCoreException(e11, "WhiteListManager", false, "save whitelist", 4, null), null, 2, null);
        }
    }

    static {
        WhiteListManager whiteListManager = new WhiteListManager();
        f48507a = whiteListManager;
        hostMatcher = new WhiteListMatcher(true);
        whitelistMatcher = new WhiteListMatcher(false, 1, null);
        whiteListManager.m58805f();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m58800a(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return hostMatcher.m58813f(uri);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58801b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return hostMatcher.m58814g(url);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58802c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return whitelistMatcher.m58814g(url);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:25:0x0076, B:27:0x007a, B:28:0x007e), top: B:36:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:25:0x0076, B:27:0x007a, B:28:0x007e), top: B:36:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m58803d(@NotNull Continuation<? super Unit> continuation) {
        WhiteListManager$load$1 whiteListManager$load$1;
        Exception exc;
        WhiteListManager whiteListManager;
        ArrayList arrayList;
        if (continuation instanceof WhiteListManager$load$1) {
            whiteListManager$load$1 = (WhiteListManager$load$1) continuation;
            int i11 = whiteListManager$load$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                whiteListManager$load$1.label = i11 - Integer.MIN_VALUE;
            } else {
                whiteListManager$load$1 = new WhiteListManager$load$1(this, continuation);
            }
        } else {
            whiteListManager$load$1 = new WhiteListManager$load$1(this, continuation);
        }
        Object objM90914f0 = whiteListManager$load$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = whiteListManager$load$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            String strM102351h = C46396e.m102351h("web", "whitelist", "");
            if (strM102351h.length() > 0) {
                try {
                    C27099x c27099x = C27099x.f54458a;
                    InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90890N(C41636g.m90887K(new WhiteListManager$load$$inlined$fromJsonOrNull$1(strM102351h, null)), C42911a.m94120b()), new WhiteListManager$load$$inlined$fromJsonOrNull$2(null));
                    whiteListManager$load$1.L$0 = this;
                    whiteListManager$load$1.label = 1;
                    objM90914f0 = C41636g.m90914f0(interfaceC41634eM90917h, whiteListManager$load$1);
                    if (objM90914f0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    whiteListManager = this;
                    arrayList = (ArrayList) objM90914f0;
                    if (arrayList != null) {
                        return Unit.INSTANCE;
                    }
                    whiteListManager.m58807h(arrayList);
                } catch (Exception e11) {
                    exc = e11;
                    whiteListManager = this;
                    C43846g.m96568c(new WebCoreException(exc, "WhiteListManager", false, "initWhiteList err", 4, null), null, 2, null);
                }
            } else {
                whiteListManager = this;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            whiteListManager = (WhiteListManager) whiteListManager$load$1.L$0;
            try {
                ResultKt.throwOnFailure(objM90914f0);
                arrayList = (ArrayList) objM90914f0;
                if (arrayList != null) {
                    return Unit.INSTANCE;
                }
                whiteListManager.m58807h(arrayList);
            } catch (Exception e12) {
                exc = e12;
                C43846g.m96568c(new WebCoreException(exc, "WhiteListManager", false, "initWhiteList err", 4, null), null, 2, null);
            }
        }
        whiteListManager.m58805f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m58805f() {
        WhiteListMatcher whiteListMatcher = hostMatcher;
        HostManager hostManager = HostManager.a;
        whiteListMatcher.m58808a(hostManager.h());
        whiteListMatcher.m58808a(hostManager.s());
    }

    /* JADX INFO: renamed from: g */
    public final void m58806g(@NotNull List<String> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        m58807h(newList);
        m58804e(newList);
    }

    /* JADX INFO: renamed from: h */
    public final void m58807h(List<String> newList) {
        WhiteListMatcher whiteListMatcher = whitelistMatcher;
        whiteListMatcher.m58811d();
        whiteListMatcher.m58809b(newList);
    }
}
