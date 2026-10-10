package cu;

import android.net.Uri;
import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p347iu.C40172b;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: cu.h */
/* JADX INFO: compiled from: KuCardRouteInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/KuCardRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "kuCardHomeToggles", "", "getKuCardHomeToggles", "()Z", "kuCardHomeToggles$delegate", "Lkotlin/Lazy;", "intercept", "chain", "Lcom/kubi/router/interceptor/IChain;", "go2RNKuCardHomePage", "", "postcard", "Lcom/kubi/router/model/Postcard;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCardRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCardRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/KuCardRouteInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,54:1\n29#2:55\n35#3,4:56\n39#3:62\n44#4,2:60\n*S KotlinDebug\n*F\n+ 1 KuCardRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/KuCardRouteInterceptor\n*L\n48#1:55\n20#1:56,4\n20#1:62\n20#1:60,2\n*E\n"})
public final class C36537h implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f79383a = LazyKt.lazy(new Function0() { // from class: cu.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C36537h.m81801e());
        }
    });

    /* JADX INFO: renamed from: cu.h$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m81801e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_kucard_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        String string = postcard.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!m81802c() || !C40172b.m88530a(string)) {
            return chain.mo103413a(postcard);
        }
        m81803d(postcard);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81802c() {
        return ((Boolean) this.f79383a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m81803d(C4400a c4400a) {
        C44128b.m97265i("KuCardRouteInterceptor go2RnKuCardHomePage postcard = " + c4400a.getUri());
        Bundle bundle = c4400a.getBundle();
        bundle.putString(Constants.COMPONENT, "kucoin_kucard_rn");
        bundle.putString(Constants.BIZ, "kucard");
        bundle.putString("entry", "main");
        new C4400a(Uri.parse("kucoin://krn/router"), c4400a.getBundle()).m4048k();
    }
}
