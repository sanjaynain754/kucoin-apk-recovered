package com.kubi.httpdns.request;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p234ek.C37207e;
import p234ek.C37208f;
import p234ek.InterfaceC37204b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.httpdns.request.a */
/* JADX INFO: compiled from: CategoryWatcher.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/httpdns/request/a;", "Category", "Lcom/kubi/httpdns/request/g;", "Lek/e;", "Lek/f;", "Lek/b;", SessionDescription.ATTR_CONTROL, "<init>", "(Lek/b;)V", "response", "", "b", "(Lek/f;)V", "", "e", "onFailure", "(Ljava/lang/Throwable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lek/b;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C15197a<Category> implements InterfaceC15203g<C37207e, C37208f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37204b<Category> control;

    public C15197a(@NotNull InterfaceC37204b<Category> control) {
        Intrinsics.checkNotNullParameter(control, "control");
        this.control = control;
    }

    @Override // com.kubi.httpdns.request.InterfaceC15203g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSuccess(@NotNull C37208f response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.control.mo31471c();
    }

    @Override // com.kubi.httpdns.request.InterfaceC15203g
    public void onFailure(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.control.mo31470b();
    }

    @Override // com.kubi.httpdns.request.InterfaceC15203g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onStart(@NotNull C37207e c37207e) {
        InterfaceC15203g.a.m31485a(this, c37207e);
    }
}
