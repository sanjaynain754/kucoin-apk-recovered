package com.kubi.httpdns.request;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.httpdns.request.h */
/* JADX INFO: compiled from: RequestTaskWrapper.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/httpdns/request/h;", "Request", "Response", "Lcom/kubi/httpdns/request/f;", "task", "Lcom/kubi/httpdns/request/g;", "watcher", "<init>", "(Lcom/kubi/httpdns/request/f;Lcom/kubi/httpdns/request/g;)V", "request", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/kubi/httpdns/request/f;", "b", "Lcom/kubi/httpdns/request/g;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C15204h<Request, Response> implements InterfaceC15202f<Request, Response> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15202f<Request, Response> task;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15203g<Request, Response> watcher;

    public C15204h(@NotNull InterfaceC15202f<Request, Response> task, @NotNull InterfaceC15203g<Request, Response> watcher) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        this.task = task;
        this.watcher = watcher;
    }

    @Override // com.kubi.httpdns.request.InterfaceC15202f
    /* JADX INFO: renamed from: a */
    public Response mo31482a(Request request) {
        try {
            this.watcher.onStart(request);
            Response responseMo31482a = this.task.mo31482a(request);
            this.watcher.onSuccess(responseMo31482a);
            return responseMo31482a;
        } catch (Throwable th2) {
            this.watcher.onFailure(th2);
            throw th2;
        }
    }
}
