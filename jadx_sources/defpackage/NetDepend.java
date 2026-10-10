package defpackage;

import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import tl.InterfaceC45041a;

/* JADX INFO: renamed from: b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NetDepend.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"LNetDepend;", "", "<init>", "()V", "netSpi", "Lcom/kubi/kucoin/spi/INetSPI;", "getNetSpi", "()Lcom/kubi/kucoin/spi/INetSPI;", "netSpi$delegate", "Lkotlin/Lazy;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NetDepend {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NetDepend f3835a = new NetDepend();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f3836b = LazyKt.lazy(new Function0() { // from class: a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NetDepend.m4056c();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final InterfaceC45041a m4056c() {
        return (InterfaceC45041a) Router.f46192a.m56192n(InterfaceC45041a.class);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC45041a m4057b() {
        return (InterfaceC45041a) f3836b.getValue();
    }
}
