package tr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.model.TokenEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: tr.c */
/* JADX INFO: compiled from: ITokenProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Ltr/c;", "", "", "fromCache", "Lcom/kubi/network/socket/model/TokenEntity;", "getToken", "(Z)Lcom/kubi/network/socket/model/TokenEntity;", "c", "()Z", "", "b", "()V", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC45068c {

    /* JADX INFO: renamed from: tr.c$a */
    /* JADX INFO: compiled from: ITokenProvider.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ TokenEntity m99662a(InterfaceC45068c interfaceC45068c, boolean z11, int i11, Object obj) throws Throwable {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToken");
            }
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return interfaceC45068c.getToken(z11);
        }

        /* JADX INFO: renamed from: b */
        public static void m99663b(@NotNull InterfaceC45068c interfaceC45068c) {
        }

        /* JADX INFO: renamed from: c */
        public static void m99664c(@NotNull InterfaceC45068c interfaceC45068c) {
        }

        /* JADX INFO: renamed from: d */
        public static void m99665d(@NotNull InterfaceC45068c interfaceC45068c) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo43097a();

    /* JADX INFO: renamed from: b */
    void mo43098b();

    /* JADX INFO: renamed from: c */
    boolean mo43099c();

    /* JADX INFO: renamed from: d */
    void mo43100d();

    @NotNull
    TokenEntity getToken(boolean fromCache) throws Throwable;
}
