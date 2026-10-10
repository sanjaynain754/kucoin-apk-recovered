package p846zx;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.router.annotation.Interceptor$Companion;
import com.kubi.router.utils.RouteExKt;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zx.d */
/* JADX INFO: compiled from: IInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lzx/d;", "Lzx/b;", "interceptor", "", "", "rules", "<init>", "(Lzx/b;[Ljava/lang/String;)V", "Lzx/a;", "chain", "", "b", "(Lzx/a;)Z", "Lay/a;", "postcard", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lay/a;)Z", "Lzx/b;", "[Ljava/lang/String;", "RouterSDK_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C46938d implements InterfaceC46936b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46936b interceptor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String[] rules;

    public C46938d(@NotNull InterfaceC46936b interceptor, @NotNull String[] rules) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.interceptor = interceptor;
        this.rules = rules;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m103415a(@NotNull C4400a postcard) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        return ArraysKt.contains(this.rules, Interceptor$Companion.MATCHES_ALL_PATH) || ArraysKt.contains(this.rules, RouteExKt.m56216G(postcard.getUri()));
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return this.interceptor.mo4304b(chain);
    }

    public /* synthetic */ C46938d(InterfaceC46936b interfaceC46936b, String[] strArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC46936b, (i11 & 2) != 0 ? new String[]{Interceptor$Companion.MATCHES_ALL_PATH} : strArr);
    }
}
