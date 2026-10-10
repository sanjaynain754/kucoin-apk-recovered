package k90;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: k90.c */
/* JADX INFO: compiled from: LogUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lk90/c;", "", "<init>", "()V", "", "tag", "msg", "", "e", "(Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "f", "b", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "d", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "com.opensource.svgaplayer"}, m90085k = 1, m90086mv = {1, 4, 0})
public final class C40965c {

    /* JADX INFO: renamed from: a */
    public static final C40965c f91057a = new C40965c();

    /* JADX INFO: renamed from: a */
    public final void m89713a(@NotNull String tag, @NotNull String msg) {
        InterfaceC40964b interfaceC40964bM89719a;
        C40966d c40966d = C40966d.f91060c;
        if (c40966d.m89720b() && (interfaceC40964bM89719a = c40966d.m89719a()) != null) {
            interfaceC40964bM89719a.debug(tag, msg);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m89714b(@NotNull String tag, @NotNull String msg) {
        InterfaceC40964b interfaceC40964bM89719a;
        C40966d c40966d = C40966d.f91060c;
        if (c40966d.m89720b() && (interfaceC40964bM89719a = c40966d.m89719a()) != null) {
            interfaceC40964bM89719a.mo89710a(tag, msg, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m89715c(@NotNull String tag, @NotNull String msg, @NotNull Throwable error) {
        InterfaceC40964b interfaceC40964bM89719a;
        C40966d c40966d = C40966d.f91060c;
        if (c40966d.m89720b() && (interfaceC40964bM89719a = c40966d.m89719a()) != null) {
            interfaceC40964bM89719a.mo89710a(tag, msg, error);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m89716d(@NotNull String tag, @NotNull Throwable error) {
        InterfaceC40964b interfaceC40964bM89719a;
        C40966d c40966d = C40966d.f91060c;
        if (c40966d.m89720b() && (interfaceC40964bM89719a = c40966d.m89719a()) != null) {
            interfaceC40964bM89719a.mo89710a(tag, error.getMessage(), error);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m89717e(@NotNull String tag, @NotNull String msg) {
        InterfaceC40964b interfaceC40964bM89719a;
        C40966d c40966d = C40966d.f91060c;
        if (c40966d.m89720b() && (interfaceC40964bM89719a = c40966d.m89719a()) != null) {
            interfaceC40964bM89719a.mo89712c(tag, msg);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m89718f(@NotNull String tag, @NotNull String msg) {
        InterfaceC40964b interfaceC40964bM89719a;
        C40966d c40966d = C40966d.f91060c;
        if (c40966d.m89720b() && (interfaceC40964bM89719a = c40966d.m89719a()) != null) {
            interfaceC40964bM89719a.mo89711b(tag, msg);
        }
    }
}
