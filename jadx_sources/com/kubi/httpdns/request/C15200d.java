package com.kubi.httpdns.request;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p234ek.C37207e;
import p234ek.C37208f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.httpdns.request.d */
/* JADX INFO: compiled from: HttpRetryTask.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/httpdns/request/d;", "Lcom/kubi/httpdns/request/f;", "Lek/e;", "Lek/f;", "task", "", "retryCount", "<init>", "(Lcom/kubi/httpdns/request/f;I)V", "request", "b", "(Lek/e;)Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/httpdns/request/f;", "I", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C15200d implements InterfaceC15202f<C37207e, C37208f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15202f<C37207e, C37208f> task;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int retryCount;

    public C15200d(@NotNull InterfaceC15202f<C37207e, C37208f> task, int i11) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.task = task;
        this.retryCount = i11;
    }

    @Override // com.kubi.httpdns.request.InterfaceC15202f
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C37208f mo31482a(@NotNull C37207e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int i11 = 0;
        while (true) {
            try {
                return this.task.mo31482a(request);
            } catch (Throwable th2) {
                if (i11 >= this.retryCount) {
                    throw th2;
                }
                i11++;
            }
        }
    }
}
