package com.kubi.route.config;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.route.config.issue.RouteConfigException;
import com.kubi.route.config.model.RouteEntry;
import com.kubi.route.config.model.RouteTechStack;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p677ux.C45324b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.route.config.a */
/* JADX INFO: compiled from: RouteConfigExt.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/route/config/model/RouteEntry;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/route/config/model/RouteEntry;)Ljava/lang/String;", "Lcom/kubi/route/config/model/RouteTechStack;", "b", "(Lcom/kubi/route/config/model/RouteEntry;)Lcom/kubi/route/config/model/RouteTechStack;", "c", "(Ljava/lang/String;)Lcom/kubi/route/config/model/RouteTechStack;", "route-config_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteConfigExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteConfigExt.kt\ncom/kubi/route/config/RouteConfigExtKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 RouteConfigIssue.kt\ncom/kubi/route/config/issue/RouteConfigIssueKt\n*L\n1#1,58:1\n29#2:59\n44#3,2:60\n*S KotlinDebug\n*F\n+ 1 RouteConfigExt.kt\ncom/kubi/route/config/RouteConfigExtKt\n*L\n29#1:59\n55#1:60,2\n*E\n"})
public final class C23629a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m56162a(@NotNull RouteEntry routeEntry) {
        Intrinsics.checkNotNullParameter(routeEntry, "<this>");
        String path = routeEntry.getPath();
        return path == null ? "" : path;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final RouteTechStack m56163b(@NotNull RouteEntry routeEntry) {
        Intrinsics.checkNotNullParameter(routeEntry, "<this>");
        return m56164c(m56162a(routeEntry));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final RouteTechStack m56164c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
            String scheme = uri.getScheme();
            if (scheme != null) {
                int iHashCode = scheme.hashCode();
                if (iHashCode != -1120536837) {
                    if (iHashCode == 3213448) {
                        if (!scheme.equals("http")) {
                        }
                        return RouteTechStack.H5;
                    }
                    if (iHashCode != 99617003 || !scheme.equals(ProxyConfig.MATCH_HTTPS)) {
                    }
                    return RouteTechStack.H5;
                }
                if (scheme.equals("kucoin")) {
                    String strM100201h = C45324b.f101918a.m100201h(str);
                    if (Intrinsics.areEqual(strM100201h, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER)) {
                        return RouteTechStack.FLUTTER;
                    }
                    if (Intrinsics.areEqual(strM100201h, "krn/router")) {
                        return RouteTechStack.RN;
                    }
                    if (Intrinsics.areEqual(strM100201h, SignTermItem.LINK)) {
                        return RouteTechStack.H5;
                    }
                    return Intrinsics.areEqual(strM100201h, "external/link") ? RouteTechStack.UNKNOWN : RouteTechStack.NATIVE;
                }
            }
            return RouteTechStack.UNKNOWN;
        } catch (Exception e11) {
            C44128b.m97261e("RouteEntry", "getTechStack error: " + e11);
            C43846g.m96568c(new RouteConfigException(e11, "RouteEntry", false, null, 8, null), null, 2, null);
            return RouteTechStack.UNKNOWN;
        }
    }
}
