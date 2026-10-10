package com.kubi.network.socket.socketio;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.utils.C19392h;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.network.socket.socketio.f */
/* JADX INFO: compiled from: SocketIOParser.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0003J%\u0010\f\u001a\u00020\u00002\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u000b\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/network/socket/socketio/f;", "", "<init>", "()V", "data", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)V", "d", "Lkotlin/Function1;", "Lcom/kubi/network/socket/socketio/d;", TUIConstants.TUIChat.CALL_BACK, "e", "(Lkotlin/jvm/functions/Function1;)Lcom/kubi/network/socket/socketio/f;", "", "c", "(Ljava/lang/String;)V", "", "b", "([B)V", "Lkotlin/jvm/functions/Function1;", "Lcom/kubi/network/socket/socketio/e;", "Lcom/kubi/network/socket/socketio/e;", "reconstructor", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19375f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Function1<? super C19373d<?>, Unit> callback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C19374e reconstructor;

    /* JADX INFO: renamed from: d */
    public final void m43011d() {
        this.reconstructor = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m43008a(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof String) {
            m43010c((String) data);
        } else {
            if (!(data instanceof byte[])) {
                throw new IllegalStateException("Only String and ByteArray data decode is supported");
            }
            m43009b((byte[]) data);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m43009b(byte[] data) {
        C19373d<?> c19373dM43007a;
        C19374e c19374e = this.reconstructor;
        if (c19374e == null) {
            throw new RuntimeException("got binary data when not reconstructing a packet");
        }
        Function1<? super C19373d<?>, Unit> function1 = this.callback;
        if (function1 == null || c19374e == null || (c19373dM43007a = c19374e.m43007a(data)) == null) {
            return;
        }
        m43011d();
        function1.invoke(c19373dM43007a);
    }

    /* JADX INFO: renamed from: c */
    public final void m43010c(String data) {
        C19373d c19373dM43006b;
        C19373d<Object> c19373dM43068a = C19392h.f36156a.m43068a(data);
        if (5 != c19373dM43068a.getType() && 6 != c19373dM43068a.getType()) {
            Function1<? super C19373d<?>, Unit> function1 = this.callback;
            if (function1 != null) {
                function1.invoke(c19373dM43068a);
                return;
            }
            return;
        }
        C19374e c19374e = new C19374e(c19373dM43068a);
        this.reconstructor = c19374e;
        Function1<? super C19373d<?>, Unit> function2 = this.callback;
        if (function2 == null || (c19373dM43006b = C19374e.m43006b(c19374e, null, 1, null)) == null) {
            return;
        }
        m43011d();
        function2.invoke(c19373dM43006b);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C19375f m43012e(@NotNull Function1<? super C19373d<?>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        return this;
    }
}
