package com.kubi.sdk.web.listener.holder;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.kubi.sdk.web.core.WebLoadError;
import com.kubi.sdk.web.tracker.model.WebPerformanceStageModel;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.sdk.web.util.C24335h;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import z00.InterfaceC46621c;

/* JADX INFO: compiled from: WebLoadListenerHolder.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 E*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001FB\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J%\u0010\u001e\u001a\u00020\r2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\r2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010,R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010?R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010B\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010?R\u0014\u0010C\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u0014\u0010D\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010?¨\u0006G"}, m90084d2 = {"Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "Lz00/c;", ExifInterface.GPS_DIRECTION_TRUE, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "needRepeatMount", "<init>", "(Lz00/c;Z)V", "", "url", "", TUIConstantDefine.CREATE_TIME, "type", "", "e", "(Ljava/lang/String;JLjava/lang/String;)V", "Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;", "model", "g", "(Lcom/kubi/sdk/web/tracker/model/WebPerformanceStageModel;)V", "", "newProgress", "b", "(I)V", "c", "(Ljava/lang/String;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "", ReportDataTable.COLUMN_PARAMS, "f", "(Ljava/util/Map;)V", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "Lcom/kubi/sdk/web/core/WebLoadError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "d", "(Lcom/kubi/sdk/web/core/WebLoadError;)V", "onTimeout", "()V", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "onClose", "Lz00/c;", "getListener", "()Lz00/c;", "Z", "getNeedRepeatMount", "()Z", "Landroid/net/Uri;", "Landroid/net/Uri;", "uri", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoadStarted", "isLoadFinished", "isMountFinished", "isPageFinish", "isClosed", "i", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WebLoadListenerHolder<T extends InterfaceC46621c> implements InterfaceC46621c {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final T listener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean needRepeatMount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Uri uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isLoadStarted;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isLoadFinished;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isMountFinished;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isPageFinish;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isClosed;

    /* JADX INFO: compiled from: WebLoadListenerHolder.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u0005*\u00020\u0004*\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder$Companion;", "", "<init>", "()V", "Lz00/c;", ExifInterface.GPS_DIRECTION_TRUE, "", "needRepeatMount", "Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", C33954u6.f72238i, "(Lz00/c;Z)Lcom/kubi/sdk/web/listener/holder/WebLoadListenerHolder;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ WebLoadListenerHolder holder$default(Companion companion, InterfaceC46621c interfaceC46621c, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.holder(interfaceC46621c, z11);
        }

        @NotNull
        public final <T extends InterfaceC46621c> WebLoadListenerHolder<T> holder(@NotNull T t11, boolean z11) {
            Intrinsics.checkNotNullParameter(t11, "<this>");
            return new WebLoadListenerHolder<>(t11, z11);
        }
    }

    public WebLoadListenerHolder(@NotNull T listener, boolean z11) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.needRepeatMount = z11;
        this.isLoadStarted = new AtomicBoolean(false);
        this.isLoadFinished = new AtomicBoolean(false);
        this.isMountFinished = new AtomicBoolean(false);
        this.isPageFinish = new AtomicBoolean(false);
        this.isClosed = new AtomicBoolean(false);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: a */
    public void mo58792a(@NotNull String pageType, double dclTime, @NotNull String currentProjectName, @NotNull String currentProjectVersion) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(currentProjectName, "currentProjectName");
        Intrinsics.checkNotNullParameter(currentProjectVersion, "currentProjectVersion");
        if (this.needRepeatMount || !this.isMountFinished.getAndSet(true)) {
            InterfaceC46621c.a.m102790b(this, null, 1, null);
            this.listener.mo58792a(pageType, dclTime, currentProjectName, currentProjectVersion);
        }
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: b */
    public void mo58793b(int newProgress) {
        if (!this.isLoadFinished.get()) {
            this.listener.mo58793b(newProgress);
        }
        if (newProgress == 100) {
            InterfaceC46621c.a.m102790b(this, null, 1, null);
        }
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: c */
    public void mo58794c(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.isLoadStarted.getAndSet(true) || this.isLoadFinished.get()) {
            return;
        }
        this.listener.mo58794c(url);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: d */
    public void mo58795d(@NotNull WebLoadError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.uri == null || !error.getIsError() || this.isLoadFinished.getAndSet(true)) {
            return;
        }
        C24329b.m58861c(C24329b.f48558a, "mainload", error.toString(), null, 4, null);
        this.listener.mo58795d(error);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: e */
    public void mo58796e(@NotNull String url, long createTime, @NotNull String type) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        Uri uriM58889h = C24335h.f48569a.m58889h(url);
        this.uri = uriM58889h;
        this.listener.mo58796e(String.valueOf(uriM58889h), createTime, type);
    }

    public boolean equals(@Nullable Object other) {
        WebLoadListenerHolder webLoadListenerHolder = other instanceof WebLoadListenerHolder ? (WebLoadListenerHolder) other : null;
        if (webLoadListenerHolder == null) {
            return false;
        }
        return Intrinsics.areEqual(this.listener, webLoadListenerHolder.listener);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: f */
    public void mo58797f(@Nullable Map<String, ? extends Object> params) {
        if (this.isLoadFinished.getAndSet(true)) {
            return;
        }
        this.listener.mo58797f(params);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: g */
    public void mo58798g(@NotNull WebPerformanceStageModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.listener.mo58798g(model);
    }

    @Override // z00.InterfaceC46621c
    /* JADX INFO: renamed from: h */
    public void mo58799h(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.isPageFinish.getAndSet(true)) {
            return;
        }
        InterfaceC46621c.a.m102790b(this, null, 1, null);
        this.listener.mo58799h(url);
    }

    public int hashCode() {
        return this.listener.hashCode();
    }

    @Override // z00.InterfaceC46621c
    public void onClose() {
        if (this.isClosed.getAndSet(true)) {
            return;
        }
        this.listener.onClose();
    }

    @Override // z00.InterfaceC46621c
    public void onTimeout() {
        if (this.uri == null || this.isLoadFinished.getAndSet(true)) {
            return;
        }
        this.listener.onTimeout();
    }

    @NotNull
    public String toString() {
        return this.listener.toString();
    }
}
