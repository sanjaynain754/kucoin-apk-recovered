package p570qr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.InterfaceC37583d;
import java.util.LinkedList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qr.i */
/* JADX INFO: compiled from: IConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lqr/i;", "Request", "Message", "", "Lqr/e;", "status", "<init>", "(Lqr/e;)V", "msg", "", "f", "(Ljava/lang/Object;)V", "e", "Lkotlin/Function1;", TUIConstants.TUIChat.CALL_BACK, "d", "(Lkotlin/jvm/functions/Function1;)V", "b", "c", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lqr/e;", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "requestQueue", "Lkotlin/jvm/functions/Function1;", "messageCall", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class AbstractC43863i<Request, Message> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C43859e status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<Request> requestQueue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Message, Unit> messageCall;

    /* JADX INFO: renamed from: qr.i$a */
    /* JADX INFO: compiled from: IConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"qr/i$a", "Lfr/d;", "", "onConnected", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements InterfaceC37583d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC43863i<Request, Message> f96945a;

        public a(AbstractC43863i<Request, Message> abstractC43863i) {
            this.f96945a = abstractC43863i;
        }

        @Override // fr.InterfaceC37583d
        public void onConnected() {
            this.f96945a.m96635c();
        }

        @Override // fr.InterfaceC37583d
        public void onConnecting() {
            InterfaceC37583d.a.m84721b(this);
        }

        @Override // fr.InterfaceC37583d
        public void onDisconnect() {
            InterfaceC37583d.a.m84722c(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo42935e(Request msg);

    public AbstractC43863i(@NotNull C43859e status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.requestQueue = new LinkedList<>();
        status.m96624f(new a(this));
    }

    /* JADX INFO: renamed from: b */
    public final void m96634b(Message msg) {
        Function1<? super Message, Unit> function1 = this.messageCall;
        if (function1 != null) {
            function1.invoke(msg);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m96635c() {
        Request requestPoll;
        while (Intrinsics.areEqual(this.status.getConnectStatus(), "connected")) {
            synchronized (this.requestQueue) {
                requestPoll = this.requestQueue.poll();
            }
            if (requestPoll == null) {
                return;
            } else {
                mo42935e(requestPoll);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m96636d(@NotNull Function1<? super Message, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.messageCall = callback;
    }

    /* JADX INFO: renamed from: f */
    public final void m96637f(Request msg) {
        synchronized (this.requestQueue) {
            this.requestQueue.offer(msg);
        }
        m96635c();
    }
}
