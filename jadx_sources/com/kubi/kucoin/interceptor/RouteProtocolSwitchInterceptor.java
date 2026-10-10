package com.kubi.kucoin.interceptor;

import android.net.Uri;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.route.config.C23629a;
import com.kubi.route.config.RouteConfigManager;
import com.kubi.route.config.model.RouteEntry;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteType;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import il.C38674p;
import il.C38675q;
import il.C38679u;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: RouteProtocolSwitchInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u000b\u001a\u00020\f*\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "needForceExternalUrl", "externalPath", "", "toTransparentRnUriIfNeeded", "Landroid/net/Uri;", "postcard", "Lcom/kubi/router/model/Postcard;", "Companion", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteProtocolSwitchInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteProtocolSwitchInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,165:1\n29#2:166\n29#2:167\n*S KotlinDebug\n*F\n+ 1 RouteProtocolSwitchInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor\n*L\n86#1:166\n95#1:167\n*E\n"})
public final class RouteProtocolSwitchInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27949a = new Companion(null);

    /* JADX INFO: compiled from: RouteProtocolSwitchInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteProtocolSwitchInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "RN_ROUTER_PATH", "RN_TRANSPARENT_ROUTER_PATH", "KEY_TRANSPARENT", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32294a(String str) {
        return Intrinsics.areEqual(str, "news") || Intrinsics.areEqual(str, "/news") || Intrinsics.areEqual(str, TUIConstants.TUIChat.NOTICE) || Intrinsics.areEqual(str, "/notice") || Intrinsics.areEqual(str, "notice/push") || Intrinsics.areEqual(str, "/notice/push") || Intrinsics.areEqual(str, "notice/login") || Intrinsics.areEqual(str, "/notice/login");
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        List<String> listEmptyList;
        List<String> listListOf;
        String strM56162a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        String strM4045h = postcard.m4045h();
        String strM56216G = RouteExKt.m56216G(postcard.getUri());
        RouteEntry routeEntryM56161e = RouteConfigManager.f46179a.m56161e(strM4045h);
        C44128b.m97266j("RouteProtocolSwitchInterceptor", "intercept: externalUrl=" + strM4045h + ", externalPath=" + strM56216G + ", routeEntry=" + routeEntryM56161e);
        String strM66668h = C27041f.m66668h(routeEntryM56161e != null ? routeEntryM56161e.getBiz() : null);
        if (routeEntryM56161e == null || (listEmptyList = routeEntryM56161e.getSiteTypeList()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (C38675q.m87419a(strM66668h, listEmptyList)) {
            C44128b.m97266j("RouteProtocolSwitchInterceptor", "intercept: blocked by RouteAppSiteInterceptor, bizType=" + strM66668h + ", siteTypeList=" + listEmptyList + ", curSiteType=" + SiteType.INSTANCE.getCurrentSiteType());
            return false;
        }
        if (routeEntryM56161e == null || (listListOf = routeEntryM56161e.getMode()) == null) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{AppMode.Pro.getModeType(), AppMode.Lite.getModeType(), AppMode.Web3.getModeType()});
        }
        if (C38674p.f86692a.m87416g(strM4045h, listListOf)) {
            C44128b.m97266j("RouteProtocolSwitchInterceptor", "intercept: blocked by RouteAppModeInterceptor, supportMode=" + listListOf);
            return true;
        }
        if (m32294a(strM56216G)) {
            return chain.mo103413a(new C4400a(C38679u.m87425d(m32295c(strM4045h, postcard)), postcard.getBundle()));
        }
        if (routeEntryM56161e != null && (strM56162a = C23629a.m56162a(routeEntryM56161e)) != null) {
            strM4045h = strM56162a;
        }
        return chain.mo103413a(new C4400a(C38679u.m87425d(m32295c(strM4045h, postcard)), postcard.getBundle()));
    }

    /* JADX INFO: renamed from: c */
    public final Uri m32295c(String str, C4400a c4400a) {
        Uri uri = Uri.parse(str);
        boolean z11 = true;
        String strTrimStart = StringsKt.trimStart(RouteExKt.m56216G(uri), '/');
        if (!Intrinsics.areEqual(c4400a.getBundle().get("transparent"), Boolean.TRUE) && !Intrinsics.areEqual(c4400a.getBundle().get("transparent"), CredentialEntry.TRUE_STRING) && !Intrinsics.areEqual(uri.getQueryParameter("transparent"), CredentialEntry.TRUE_STRING)) {
            z11 = false;
        }
        if (Intrinsics.areEqual(strTrimStart, "krn/router") && z11) {
            return Uri.parse(StringsKt.replaceFirst$default(str, "krn/router", "krn/transparent_router", false, 4, (Object) null));
        }
        return uri;
    }
}
