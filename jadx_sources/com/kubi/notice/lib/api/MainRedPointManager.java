package com.kubi.notice.lib.api;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.MainThread;
import com.kubi.event.api.C12572a;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mvi.state.TaskFlow;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p209ds.RedDot;
import p273fw.C37726b;
import p294gz.C38057a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainRedPointManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087@¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0012H\u0003J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/notice/lib/api/MainRedPointManager;", "", "<init>", "()V", "mNewNoticeApi", "Lcom/kubi/notice/lib/api/INoticeApi;", "getMNewNoticeApi", "()Lcom/kubi/notice/lib/api/INoticeApi;", "mNewNoticeApi$delegate", "Lkotlin/Lazy;", "taskFlow", "Lcom/kubi/mvi/state/TaskFlow;", "modifyOTCNotice", "", "otcCount", "", "getRedPoint", "context", "Landroid/content/Context;", "needRequestOTC", "", "getRedPointAsync", "(Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showRedPoint", "mContext", "isNoticeShow", "encourageCount", "invitationCount", "noticeAllCount", "noticeNumberCount", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MainRedPointManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MainRedPointManager f36366a = new MainRedPointManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f36367b = LazyKt.lazy(new Function0() { // from class: com.kubi.notice.lib.api.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainRedPointManager.m43149n();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final TaskFlow f36368c = new TaskFlow();

    /* JADX INFO: renamed from: d */
    public static int f36369d;

    /* JADX INFO: renamed from: e */
    public static int f36370e;

    /* JADX INFO: renamed from: f */
    public static int f36371f;

    /* JADX INFO: renamed from: g */
    public static int f36372g;

    /* JADX INFO: renamed from: h */
    public static int f36373h;

    /* JADX INFO: renamed from: n */
    public static final INoticeApi m43149n() {
        return (INoticeApi) RetrofitFlowExKt.m42820a(INoticeApi.class);
    }

    /* JADX INFO: renamed from: j */
    public final INoticeApi m43150j() {
        return (INoticeApi) f36367b.getValue();
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: k */
    public final void m43151k(@NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        TaskFlow.m42653f(f36368c, false, false, new MainRedPointManager$getRedPoint$1(context, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m43153m() {
        return C38057a.f85671a.m85928a(C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "inform", null, 4, null), true);
    }

    /* JADX INFO: renamed from: o */
    public final void m43154o(int i11) {
        C4988a.m5286a("更新 otcCount:" + f36371f, "red_point");
        f36373h = i11;
        C12572a.m23695d("com.kubi.notice.event.NoticeEvent:update_notice_count", Integer.valueOf(i11), 0L, 4, null);
    }

    @SuppressLint({"CheckResult"})
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m43152l(@NotNull Context context, boolean z11, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new MainRedPointManager$getRedPointAsync$2(context, z11, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public final void m43155p(Context context) {
        if (!m43153m()) {
            return;
        }
        int i11 = f36372g;
        if (i11 > 0) {
            C37726b.m85021a(context, i11);
        } else {
            C37726b.m85025e(context);
        }
        C4988a.m5286a("更新 noticeAllCount:" + f36371f + " noticeNumberCount:" + f36372g, "red_point");
        C12572a.m23695d("com.kubi.home.event.HomeEvent:showRedPoint", new RedDot(f36372g, f36371f, f36369d, f36370e), 0L, 4, null);
        m43154o(f36373h);
    }
}
