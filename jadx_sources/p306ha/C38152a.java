package p306ha;

import com.kubi.advert.OnelinkUtil;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: ha.a */
/* JADX INFO: compiled from: RouteAdvertInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/advert/interceptor/RouteAdvertInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteAdvertInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteAdvertInterceptor.kt\ncom/kubi/advert/interceptor/RouteAdvertInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1761#2,3:28\n*S KotlinDebug\n*F\n+ 1 RouteAdvertInterceptor.kt\ncom/kubi/advert/interceptor/RouteAdvertInterceptor\n*L\n19#1:28,3\n*E\n"})
public final class C38152a implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        List<String> listM14837b = OnelinkUtil.f15184a.m14837b();
        if (listM14837b == null || !listM14837b.isEmpty()) {
            for (String str : listM14837b) {
                String string = postcard.getUri().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (StringsKt.startsWith$default(string, str, false, 2, (Object) null)) {
                    C44128b.m97266j("RouteAdvertInterceptor", "Get onelink url, ignore, AppsFlyerUtil.deepLinkListener processed.");
                    return true;
                }
            }
        }
        return chain.mo103413a(postcard);
    }
}
