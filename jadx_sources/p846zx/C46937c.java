package p846zx;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zx.c */
/* JADX INFO: compiled from: InterceptorChain.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lzx/c;", "Lzx/a;", "", "Lzx/d;", "interceptors", "", "index", "Lay/a;", "postcard", "<init>", "(Ljava/util/List;ILay/a;)V", "b", "()Lay/a;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lay/a;)Z", "Ljava/util/List;", "I", "c", "Lay/a;", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C46937c implements InterfaceC46935a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<C46938d> interceptors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C4400a postcard;

    public C46937c(@NotNull List<C46938d> interceptors, int i11, @NotNull C4400a postcard) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        this.interceptors = interceptors;
        this.index = i11;
        this.postcard = postcard;
    }

    @Override // p846zx.InterfaceC46935a
    /* JADX INFO: renamed from: a */
    public boolean mo103413a(@NotNull C4400a postcard) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        int i11 = this.index;
        if (i11 < 0 || i11 >= this.interceptors.size()) {
            throw new IndexOutOfBoundsException("下标越界");
        }
        return this.interceptors.get(this.index).m103415a(postcard) ? this.interceptors.get(this.index).mo4304b(new C46937c(this.interceptors, this.index - 1, postcard)) : new C46937c(this.interceptors, this.index - 1, postcard).mo103413a(postcard);
    }

    @Override // p846zx.InterfaceC46935a
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public C4400a getPostcard() {
        return this.postcard;
    }
}
