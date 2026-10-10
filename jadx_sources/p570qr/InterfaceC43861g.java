package p570qr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qr.g */
/* JADX INFO: compiled from: IConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0018H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lqr/g;", "Request", "Message", "", "", "connect", "()V", "", "throwable", "d", "(Ljava/lang/Throwable;)V", "disconnect", "", "c", "()Ljava/lang/String;", "Lfr/d;", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "request", "Lfr/c;", "e", "(Ljava/lang/Object;Lfr/c;)V", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC43861g<Request, Message> {

    /* JADX INFO: renamed from: qr.g$a */
    /* JADX INFO: compiled from: IConnection.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m96632a(InterfaceC43861g interfaceC43861g, Object obj, InterfaceC37582c interfaceC37582c, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessage");
            }
            if ((i11 & 2) != 0) {
                interfaceC37582c = null;
            }
            interfaceC43861g.mo42927e(obj, interfaceC37582c);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo42923a(@NotNull InterfaceC37583d callback);

    /* JADX INFO: renamed from: b */
    void mo42924b(@NotNull InterfaceC37583d callback);

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo42925c();

    void connect();

    /* JADX INFO: renamed from: d */
    void mo42926d(@NotNull Throwable throwable);

    void disconnect();

    /* JADX INFO: renamed from: e */
    void mo42927e(Request request, @Nullable InterfaceC37582c callback);

    /* JADX INFO: renamed from: f */
    void mo42928f(@NotNull Function1<? super Message, Unit> callback);
}
