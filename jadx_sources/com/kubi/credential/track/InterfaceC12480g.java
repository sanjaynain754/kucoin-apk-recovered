package com.kubi.credential.track;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.credential.track.g */
/* JADX INFO: compiled from: IFlowTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/credential/track/g;", "Response", "", "", "b", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "response", "c", "(Ljava/lang/Object;)V", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC12480g<Response> {

    /* JADX INFO: renamed from: com.kubi.credential.track.g$b */
    /* JADX INFO: compiled from: IFlowTrack.kt */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/credential/track/g$b;", "Response", "", "Lcom/kubi/credential/track/g;", "create", "()Lcom/kubi/credential/track/g;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface b<Response> {
        @NotNull
        InterfaceC12480g<Response> create();
    }

    /* JADX INFO: renamed from: a */
    void mo23449a(@NotNull Throwable e11);

    /* JADX INFO: renamed from: b */
    void mo23450b();

    /* JADX INFO: renamed from: c */
    void mo23451c(Response response);

    /* JADX INFO: renamed from: com.kubi.credential.track.g$a */
    /* JADX INFO: compiled from: IFlowTrack.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <Response> void m23463a(@NotNull InterfaceC12480g<Response> interfaceC12480g) {
        }
    }
}
