package hr;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41673r;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hr.f */
/* JADX INFO: compiled from: KCPeriod.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ!\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0097Aø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m90084d2 = {"Lhr/f;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/r;", "Lokhttp3/Request;", "request", "Lkotlinx/coroutines/flow/m;", "flow", "<init>", "(Lokhttp3/Request;Lkotlinx/coroutines/flow/m;)V", "(Lokhttp3/Request;)V", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lokhttp3/Request;", "g", "()Lokhttp3/Request;", "c", "Lkotlinx/coroutines/flow/m;", "f", "()Lkotlinx/coroutines/flow/m;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "replayCache", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38293f<T> implements InterfaceC41673r<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Request request;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41668m<T> flow;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC41673r<T> f86033d;

    public C38293f(Request request, InterfaceC41668m<T> interfaceC41668m) {
        this.request = request;
        this.flow = interfaceC41668m;
        this.f86033d = C41636g.m90905b(interfaceC41668m);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<T> mo86421a() {
        return this.f86033d.mo86421a();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41673r, kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        return this.f86033d.collect(interfaceC41635f, continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC41668m<T> m86422f() {
        return this.flow;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Request getRequest() {
        return this.request;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38293f(@NotNull Request request) {
        this(request, C41674s.m91001b(0, Integer.MAX_VALUE, BufferOverflow.SUSPEND, 1, null));
        Intrinsics.checkNotNullParameter(request, "request");
    }
}
