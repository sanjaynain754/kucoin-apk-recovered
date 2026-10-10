package com.kubi.credential.track;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.exception.ClearCredentialException;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.credential.track.a */
/* JADX INFO: compiled from: ClearTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/credential/track/a;", "Lcom/kubi/credential/track/g;", "", "<init>", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "response", "d", "(Lkotlin/Unit;)V", "", "code", "g", "(I)V", "default", "(Ljava/lang/Throwable;I)I", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C12474a implements InterfaceC12480g<Unit> {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m23448f(C12474a c12474a, Throwable th2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 5;
        }
        return c12474a.m23453e(th2, i11);
    }

    @Override // com.kubi.credential.track.InterfaceC12480g
    /* JADX INFO: renamed from: a */
    public void mo23449a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        m23454g(m23448f(this, e11, 0, 2, null));
    }

    @Override // com.kubi.credential.track.InterfaceC12480g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo23451c(@NotNull Unit response) {
        Intrinsics.checkNotNullParameter(response, "response");
        m23454g(0);
    }

    /* JADX INFO: renamed from: e */
    public final int m23453e(Throwable e11, int i11) {
        String type;
        ClearCredentialException clearCredentialException = e11 instanceof ClearCredentialException ? (ClearCredentialException) e11 : null;
        if (clearCredentialException != null && (type = clearCredentialException.getType()) != null) {
            if (StringsKt.startsWith$default(type, "androidx.credentials.TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION", false, 2, (Object) null)) {
                return 1;
            }
            if (StringsKt.startsWith$default(type, "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt.startsWith$default(type, "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION", false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt.startsWith$default(type, "android.credentials.ClearCredentialStateException.TYPE_UNKNOWN", false, 2, (Object) null)) {
                return 4;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: g */
    public final void m23454g(int code) {
        C43847h.m96575d(KunlunTechEventEnum.CATE_CREDENTIAL_CLEAR_STATE, code);
    }

    @Override // com.kubi.credential.track.InterfaceC12480g
    /* JADX INFO: renamed from: b */
    public void mo23450b() {
        InterfaceC12480g.a.m23463a(this);
    }
}
