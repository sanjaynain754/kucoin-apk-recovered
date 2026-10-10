package g10;

import com.kubi.network.websocket.model.Message;
import okhttp3.Request;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g10.j */
/* JADX INFO: compiled from: SocketTaskConfig.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/websocket/SocketTaskConfig;", "", "<init>", "()V", "supportBackground", "", "getSupportBackground", "()Z", "setSupportBackground", "(Z)V", "httpRequest", "Lokhttp3/Request;", "getHttpRequest", "()Lokhttp3/Request;", "setHttpRequest", "(Lokhttp3/Request;)V", "filterMessage", "Lkotlin/Function1;", "Lcom/kubi/network/websocket/model/Message;", "getFilterMessage", "()Lkotlin/jvm/functions/Function1;", "setFilterMessage", "(Lkotlin/jvm/functions/Function1;)V", "LWebSocket_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37779j {

    /* JADX INFO: renamed from: a */
    public boolean f85089a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Request f85090b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function1<? super Message, Boolean> f85091c;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Function1<Message, Boolean> m85204a() {
        return this.f85091c;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Request getF85090b() {
        return this.f85090b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF85089a() {
        return this.f85089a;
    }

    /* JADX INFO: renamed from: d */
    public final void m85207d(@Nullable Function1<? super Message, Boolean> function1) {
        this.f85091c = function1;
    }

    /* JADX INFO: renamed from: e */
    public final void m85208e(@Nullable Request request) {
        this.f85090b = request;
    }

    /* JADX INFO: renamed from: f */
    public final void m85209f(boolean z11) {
        this.f85089a = z11;
    }
}
