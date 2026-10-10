package il;

import android.net.Uri;
import com.kubi.router.utils.RouteExKt;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: il.u */
/* JADX INFO: compiled from: RouteProtocolSwitchInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, m90084d2 = {"removeLeadingSlashes", "Landroid/net/Uri;", "queryParameters", "", "url", "LAppRouter_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteProtocolSwitchInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteProtocolSwitchInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptorKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n29#2:166\n29#2:167\n1869#3,2:168\n*S KotlinDebug\n*F\n+ 1 RouteProtocolSwitchInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptorKt\n*L\n114#1:166\n116#1:167\n146#1:168,2\n*E\n"})
public final class C38679u {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m87423b(@NotNull String url) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            str = url;
            try {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, "?", 0, false, 6, (Object) null);
                if (iIndexOf$default == -1) {
                    return "";
                }
                String strSubstring = str.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strSubstring, RunnableC33958ua.f72251f, 0, false, 6, (Object) null);
                if (iIndexOf$default2 != -1) {
                    strSubstring = strSubstring.substring(0, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
                for (String str2 : StringsKt.split$default((CharSequence) strSubstring, new String[]{"&"}, false, 0, 6, (Object) null)) {
                    int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) str2, "=", 0, false, 6, (Object) null);
                    if (iIndexOf$default3 != -1) {
                        String strSubstring2 = str2.substring(0, iIndexOf$default3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        String strSubstring3 = str2.substring(iIndexOf$default3 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        linkedHashMap.put(strSubstring2, strSubstring3);
                    }
                }
                return CollectionsKt.joinToString$default(linkedHashMap.entrySet(), "&", null, null, 0, null, new Function1() { // from class: il.t
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C38679u.m87424c((Map.Entry) obj);
                    }
                }, 30, null);
            } catch (Exception e11) {
                e = e11;
                C44128b.m97266j("RouteProtocolSwitchInterceptor", "queryParameters: failed to parse query parameters from url=" + str + ", error=" + e.getMessage());
                return "";
            }
        } catch (Exception e12) {
            e = e12;
            str = url;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m87424c(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((String) it.getKey()) + '=' + ((String) it.getValue());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Uri m87425d(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (!StringsKt.startsWith$default(RouteExKt.m56216G(uri), "/", false, 2, (Object) null)) {
            return uri;
        }
        String strTrimStart = StringsKt.trimStart(RouteExKt.m56216G(uri), '/');
        if (strTrimStart.length() == 0) {
            return uri;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strM87423b = m87423b(string);
        if (strM87423b.length() == 0) {
            return Uri.parse(uri.getScheme() + "://" + strTrimStart);
        }
        return Uri.parse(uri.getScheme() + "://" + strTrimStart + '?' + strM87423b);
    }
}
