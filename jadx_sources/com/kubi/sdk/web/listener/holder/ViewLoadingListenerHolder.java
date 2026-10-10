package com.kubi.sdk.web.listener.holder;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.sdk.web.listener.holder.ViewLoadingListenerHolder;
import com.kubi.sdk.web.tracker.model.WebPerformanceStageModel;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import z00.InterfaceC46620b;
import z00.InterfaceC46621c;

/* JADX INFO: compiled from: ViewLoadingListenerHolder.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/web/listener/holder/ViewLoadingListenerHolder;", "Lz00/c;", "Lz00/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lz00/b;)V", "", "url", "", "c", "(Ljava/lang/String;)V", "", "progress", "b", "(I)V", "", "", ReportDataTable.COLUMN_PARAMS, "f", "(Ljava/util/Map;)V", "Lcom/kubi/sdk/web/core/WebLoadError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "d", "(Lcom/kubi/sdk/web/core/WebLoadError;)V", "onTimeout", "()V", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Lz00/b;", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ViewLoadingListenerHolder implements InterfaceC46621c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static Handler f48496c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46620b listener;

    /* JADX INFO: compiled from: ViewLoadingListenerHolder.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/web/listener/holder/ViewLoadingListenerHolder$Companion;", "", "<init>", "()V", "Lz00/b;", "Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "Lcom/kubi/sdk/web/listener/holder/ViewLoadingListenerHolder;", C33954u6.f72238i, "(Lz00/b;)Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "mainHandle", "Landroid/os/Handler;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WebLoadListenerHolder<ViewLoadingListenerHolder> holder(@NotNull InterfaceC46620b interfaceC46620b) {
            Intrinsics.checkNotNullParameter(interfaceC46620b, "<this>");
            return WebLoadListenerHolder.INSTANCE.holder(new ViewLoadingListenerHolder(interfaceC46620b), true);
        }
    }

    public ViewLoadingListenerHolder(@NotNull InterfaceC46620b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX INFO: renamed from: o */
    public static final void m58786o(ViewLoadingListenerHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.listener.mo65499c();
        } catch (Exception e11) {
            C44128b.m97263g("ViewLoadingListener", e11);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m58787p(ViewLoadingListenerHolder this$0, String pageType, double d11, String currentProjectName, String currentProjectVersion) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pageType, "$pageType");
        Intrinsics.checkNotNullParameter(currentProjectName, "$currentProjectName");
        Intrinsics.checkNotNullParameter(currentProjectVersion, "$currentProjectVersion");
        try {
            this$0.listener.mo65497a(pageType, d11, currentProjectName, currentProjectVersion);
        } catch (Exception e11) {
            C44128b.m97263g("ViewLoadingListener", e11);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m58788q(ViewLoadingListenerHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.listener.mo65500d();
        } catch (Exception e11) {
            C44128b.m97263g("ViewLoadingListener", e11);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m58789r(ViewLoadingListenerHolder this$0, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.listener.mo65498b(i11);
        } catch (Exception e11) {
            C44128b.m97263g("ViewLoadingListener", e11);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m58790s(ViewLoadingListenerHolder this$0, WebLoadError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        try {
            this$0.listener.mo65501e(error);
        } catch (Exception e11) {
            C44128b.m97263g("ViewLoadingListener", e11);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m58791t(ViewLoadingListenerHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.listener.mo65502f();
        } catch (Exception e11) {
            C44128b.m97263g("ViewLoadingListener", e11);
        }
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: a */
    public void mo58792a(@NotNull final String pageType, final double dclTime, @NotNull final String currentProjectName, @NotNull final String currentProjectVersion) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(currentProjectName, "currentProjectName");
        Intrinsics.checkNotNullParameter(currentProjectVersion, "currentProjectVersion");
        f48496c.post(new Runnable() { // from class: a10.f
            @Override // java.lang.Runnable
            public final void run() {
                ViewLoadingListenerHolder.m58787p(this.f20b, pageType, dclTime, currentProjectName, currentProjectVersion);
            }
        });
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: b */
    public void mo58793b(final int progress) {
        f48496c.post(new Runnable() { // from class: a10.b
            @Override // java.lang.Runnable
            public final void run() {
                ViewLoadingListenerHolder.m58789r(this.f14b, progress);
            }
        });
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: c */
    public void mo58794c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        f48496c.post(new Runnable() { // from class: a10.e
            @Override // java.lang.Runnable
            public final void run() {
                ViewLoadingListenerHolder.m58788q(this.f19b);
            }
        });
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: d */
    public void mo58795d(@NotNull final WebLoadError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        f48496c.post(new Runnable() { // from class: a10.c
            @Override // java.lang.Runnable
            public final void run() {
                ViewLoadingListenerHolder.m58790s(this.f16b, error);
            }
        });
    }

    public boolean equals(@Nullable Object other) {
        ViewLoadingListenerHolder viewLoadingListenerHolder = other instanceof ViewLoadingListenerHolder ? (ViewLoadingListenerHolder) other : null;
        if (viewLoadingListenerHolder == null) {
            return false;
        }
        return Intrinsics.areEqual(this.listener, viewLoadingListenerHolder.listener);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: f */
    public void mo58797f(@Nullable Map<String, ? extends Object> params) {
        f48496c.post(new Runnable() { // from class: a10.d
            @Override // java.lang.Runnable
            public final void run() {
                ViewLoadingListenerHolder.m58786o(this.f18b);
            }
        });
    }

    public int hashCode() {
        return this.listener.hashCode();
    }

    @Override // z00.InterfaceC46621c
    public void onTimeout() {
        f48496c.post(new Runnable() { // from class: a10.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewLoadingListenerHolder.m58791t(this.f13b);
            }
        });
    }

    @NotNull
    public String toString() {
        return this.listener.toString();
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: e */
    public void mo58796e(@NotNull String str, long j11, @NotNull String str2) {
        InterfaceC46621c.a.m102791c(this, str, j11, str2);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: g */
    public void mo58798g(@NotNull WebPerformanceStageModel webPerformanceStageModel) {
        InterfaceC46621c.a.m102794f(this, webPerformanceStageModel);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: h */
    public void mo58799h(@NotNull String str) {
        InterfaceC46621c.a.m102792d(this, str);
    }

    @Override // z00.InterfaceC46621c
    public void onClose() {
        InterfaceC46621c.a.m102789a(this);
    }
}
