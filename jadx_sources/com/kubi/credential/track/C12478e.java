package com.kubi.credential.track;

import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.exception.GetCredentialException;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p230ef.C37159j;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.credential.track.e */
/* JADX INFO: compiled from: GetTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/credential/track/e;", "Lcom/kubi/credential/track/g;", "Lef/j;", "<init>", "()V", "", "code", "", "g", "(I)V", "", "e", "default", "(Ljava/lang/Throwable;I)I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "response", "d", "(Lef/j;)V", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C12478e implements InterfaceC12480g<C37159j> {
    /* JADX INFO: renamed from: e */
    private final int m23459e(Throwable e11, int i11) {
        String type;
        GetCredentialException getCredentialException = e11 instanceof GetCredentialException ? (GetCredentialException) e11 : null;
        if (getCredentialException != null && (type = getCredentialException.getType()) != null) {
            if (StringsKt.startsWith$default(type, "android.credentials.GetCredentialException.TYPE_USER_CANCELED", false, 2, (Object) null)) {
                return 1;
            }
            if (StringsKt.startsWith$default(type, GetCredentialInterruptedException.TYPE_GET_CREDENTIAL_INTERRUPTED_EXCEPTION, false, 2, (Object) null)) {
                return 2;
            }
            if (StringsKt.startsWith$default(type, GetCredentialProviderConfigurationException.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION, false, 2, (Object) null)) {
                return 3;
            }
            if (StringsKt.startsWith$default(type, GetCredentialUnsupportedException.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION, false, 2, (Object) null)) {
                return 4;
            }
            if (StringsKt.startsWith$default(type, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL", false, 2, (Object) null)) {
                return 5;
            }
            if (StringsKt.startsWith$default(type, GetPublicKeyCredentialDomException.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (Object) null)) {
                return 6;
            }
            if (StringsKt.startsWith$default(type, "android.credentials.GetCredentialException.TYPE_UNKNOWN", false, 2, (Object) null)) {
                return 7;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m23460f(C12478e c12478e, Throwable th2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8;
        }
        return c12478e.m23459e(th2, i11);
    }

    /* JADX INFO: renamed from: g */
    private final void m23461g(int code) {
        C43847h.m96575d(KunlunTechEventEnum.CATE_CREDENTIAL_GET, code);
    }

    @Override // com.kubi.credential.track.InterfaceC12480g
    /* JADX INFO: renamed from: a */
    public void mo23449a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        m23461g(m23460f(this, e11, 0, 2, null));
    }

    @Override // com.kubi.credential.track.InterfaceC12480g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo23451c(@NotNull C37159j response) {
        Intrinsics.checkNotNullParameter(response, "response");
        m23461g(0);
    }

    @Override // com.kubi.credential.track.InterfaceC12480g
    /* JADX INFO: renamed from: b */
    public void mo23450b() {
        InterfaceC12480g.a.m23463a(this);
    }
}
