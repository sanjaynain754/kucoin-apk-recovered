package cu;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.utils.extensions.C27025c;
import il.C38661c;
import java.lang.reflect.Type;
import lt.C42305j;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: cu.k */
/* JADX INFO: compiled from: P2POrderDetailInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/P2POrderDetailInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2POrderDetailInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2POrderDetailInterceptor.kt\ncom/kubi/payment/interceptor/route/P2POrderDetailInterceptor\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,24:1\n35#2,4:25\n39#2:31\n44#3,2:29\n*S KotlinDebug\n*F\n+ 1 P2POrderDetailInterceptor.kt\ncom/kubi/payment/interceptor/route/P2POrderDetailInterceptor\n*L\n18#1:25,4\n18#1:31\n18#1:29,2\n*E\n"})
public final class C36540k extends C38661c {

    /* JADX INFO: renamed from: cu.k$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (OtcDepend.f38138a.m45466o()) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("payment_android_p2p_rn", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            if (C27025c.m66567e((Boolean) objM20457a, false)) {
                C42305j.m92852a(chain.getPostcard(), "otc/orderDetail");
                return true;
            }
        }
        return super.mo4304b(chain);
    }
}
