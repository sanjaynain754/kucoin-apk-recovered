package cu;

import android.net.Uri;
import android.os.Bundle;
import com.kubi.p110rn.Constants;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.web.util.C24335h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: cu.f */
/* JADX INFO: compiled from: IFastTradeRNRouter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/IFastTradeRNRouter;", "", "gotoRNPage", "", "postcard", "Lcom/kubi/router/model/Postcard;", "routeName", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIFastTradeRNRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IFastTradeRNRouter.kt\ncom/kubi/payment/interceptor/route/IFastTradeRNRouter\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n29#2:31\n29#2:38\n463#3:32\n413#3:33\n1252#4,4:34\n*S KotlinDebug\n*F\n+ 1 IFastTradeRNRouter.kt\ncom/kubi/payment/interceptor/route/IFastTradeRNRouter\n*L\n15#1:31\n24#1:38\n16#1:32\n16#1:33\n16#1:34,4\n*E\n"})
public interface InterfaceC36535f {
    /* JADX INFO: renamed from: a */
    default void m81799a(@NotNull C4400a postcard, @NotNull String routeName) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        if (routeName.length() > 0) {
            C24335h c24335h = C24335h.f48569a;
            Uri uri = Uri.parse(routeName);
            HashMap<String, Object> mapM56243d0 = RouteExKt.m56243d0(postcard.getBundle());
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapM56243d0.size()));
            Iterator<T> it = mapM56243d0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            String string = c24335h.m58882a(uri, linkedHashMap).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Bundle bundle = postcard.getBundle();
            bundle.clear();
            bundle.putString(Constants.COMPONENT, "kucoin_fiat_rn");
            bundle.putString(Constants.BIZ, "fiat");
            bundle.putString("entry", "main");
            bundle.putString("route", Uri.encode(string));
            C4400a c4400a = new C4400a(Uri.parse(postcard.getUri().getScheme() + "://krn/router"), postcard.getBundle());
            C44128b.m97266j("IFastTradeRNRouter", "gotoRNPage: rnRoute=" + string + ", component=kucoin_fiat_rn");
            c4400a.m4048k();
        }
    }
}
