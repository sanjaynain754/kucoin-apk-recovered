package p672ur;

import android.util.LruCache;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.tencent.bugly.proguard.C33590cg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ur.h */
/* JADX INFO: compiled from: RequestTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\b\u0004*\u0001\u0016\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lur/h;", "", "Lur/g$a;", "factory", "<init>", "(Lur/g$a;)V", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "", "c", "(Lcom/kubi/network/api/model/NetworkRequest;)V", "", "id", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "", "e", "b", "(ILjava/lang/Throwable;)V", "f", "d", "Lur/g$a;", "ur/h$a", "Lur/h$a;", C33590cg.f69440j, "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45298h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45297g.a factory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a cache;

    /* JADX INFO: renamed from: ur.h$a */
    /* JADX INFO: compiled from: RequestTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0006\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"ur/h$a", "Landroid/util/LruCache;", "", "Lur/g;", "key", "value", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Integer;Lur/g;)I", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a extends LruCache<Integer, InterfaceC45297g> {
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(@Nullable Integer key, @Nullable InterfaceC45297g value) {
            return 1;
        }

        public a() {
            super(500);
        }
    }

    public C45298h(@NotNull InterfaceC45297g.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
        this.cache = new a();
    }

    /* JADX INFO: renamed from: a */
    public final void m100142a(int id2) {
        InterfaceC45297g interfaceC45297gRemove = this.cache.remove(Integer.valueOf(id2));
        if (interfaceC45297gRemove != null) {
            interfaceC45297gRemove.mo100138c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m100143b(int id2, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        InterfaceC45297g interfaceC45297gRemove = this.cache.remove(Integer.valueOf(id2));
        if (interfaceC45297gRemove != null) {
            interfaceC45297gRemove.mo100136a(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100144c(@NotNull NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.cache.put(Integer.valueOf(request.getId()), this.factory.mo100131a(request));
        InterfaceC45297g interfaceC45297g = this.cache.get(Integer.valueOf(request.getId()));
        if (interfaceC45297g != null) {
            interfaceC45297g.mo100137b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m100145d(int id2) {
        InterfaceC45297g interfaceC45297g = this.cache.get(Integer.valueOf(id2));
        if (interfaceC45297g != null) {
            interfaceC45297g.mo100139d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m100146e(int id2, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        InterfaceC45297g interfaceC45297g = this.cache.get(Integer.valueOf(id2));
        if (interfaceC45297g != null) {
            interfaceC45297g.mo100140e(e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m100147f(int id2) {
        InterfaceC45297g interfaceC45297g = this.cache.get(Integer.valueOf(id2));
        if (interfaceC45297g != null) {
            interfaceC45297g.mo100141f();
        }
    }
}
