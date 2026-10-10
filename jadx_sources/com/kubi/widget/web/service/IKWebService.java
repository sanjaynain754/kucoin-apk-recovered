package com.kubi.widget.web.service;

import com.google.zxing.client.android.Intents;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IKWebService.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aJ\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\bH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\bH&J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/widget/web/service/IKWebService;", "", "refreshSession", "Lcom/kubi/widget/web/service/IKWebService$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForSessionReady", "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;", "url", "", "timeoutMs", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "getTraceCookieString", "getXCSRFToken", "clearUserCookie", "", "updatedGray", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEvent", "eventName", ReportDataTable.COLUMN_PARAMS, "Result", "SessionReadyResult", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKWebService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f55226a = Companion.f55227a;

    /* JADX INFO: compiled from: IKWebService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/widget/web/service/IKWebService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/widget/web/service/IKWebService;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f55227a = new Companion();

        @NotNull
        public final IKWebService get() {
            return KWebService.f55235b;
        }
    }

    /* JADX INFO: compiled from: IKWebService.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult;", "", "ready", "", "status", "Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;", "message", "", "<init>", "(ZLcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;Ljava/lang/String;)V", "getReady", "()Z", "getStatus", "()Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;", "getMessage", "()Ljava/lang/String;", "Status", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class SessionReadyResult {

        /* JADX INFO: renamed from: a */
        public final boolean f55228a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Status f55229b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f55230c;

        /* JADX INFO: compiled from: IKWebService.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/widget/web/service/IKWebService$SessionReadyResult$Status;", "", "<init>", "(Ljava/lang/String;I)V", "READY", "NOT_LOGIN", "UNSUPPORTED_URL", "FAILED", Intents.Scan.TIMEOUT, "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public enum Status {
            READY,
            NOT_LOGIN,
            UNSUPPORTED_URL,
            FAILED,
            TIMEOUT;


            /* JADX INFO: renamed from: c */
            public static final /* synthetic */ EnumEntries f55232c = EnumEntriesKt.enumEntries(m67366a());

            @NotNull
            public static EnumEntries<Status> getEntries() {
                return f55232c;
            }
        }

        public SessionReadyResult(boolean z11, @NotNull Status status, @Nullable String str) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f55228a = z11;
            this.f55229b = status;
            this.f55230c = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF55230c() {
            return this.f55230c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF55228a() {
            return this.f55228a;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Status getF55229b() {
            return this.f55229b;
        }

        public /* synthetic */ SessionReadyResult(boolean z11, Status status, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, status, (i11 & 4) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: com.kubi.widget.web.service.IKWebService$a */
    /* JADX INFO: compiled from: IKWebService.kt */
    /* JADX INFO: loaded from: classes59.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/widget/web/service/IKWebService$Result;", "", "success", "", "message", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27196a {

        /* JADX INFO: renamed from: a */
        public final boolean f55233a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f55234b;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF55234b() {
            return this.f55234b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF55233a() {
            return this.f55233a;
        }

        public C27196a(boolean z11, @Nullable String str) {
            this.f55233a = z11;
            this.f55234b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo67354a(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo67355b(boolean z11, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo67356c(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: d */
    String mo67357d();

    @Nullable
    /* JADX INFO: renamed from: e */
    String mo67358e(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: g */
    Object mo67359g(@NotNull String str, long j11, @NotNull Continuation<? super SessionReadyResult> continuation);

    /* JADX INFO: renamed from: h */
    void mo67360h();

    /* JADX INFO: renamed from: i */
    void mo67361i(@NotNull String str, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: j */
    Object mo67362j(@NotNull Continuation<? super C27196a> continuation);

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m67353f(IKWebService iKWebService, String str, long j11, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: waitForSessionReady");
        }
        if ((i11 & 2) != 0) {
            j11 = 3000;
        }
        return iKWebService.mo67359g(str, j11, continuation);
    }
}
