package com.kubi.agora.interceptor;

import android.net.Uri;
import com.kubi.agora.AgoraScreenShareWebActivity;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.web.util.C24335h;
import com.kubi.user.protocol.entity.SignTermItem;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AgoraScreenShareInterceptor.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u000bH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/agora/interceptor/AgoraScreenShareInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "getRealJumpUrl", "Landroid/net/Uri;", "postcard", "Lcom/kubi/router/model/Postcard;", "optUrl", "Companion", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAgoraScreenShareInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgoraScreenShareInterceptor.kt\ncom/kubi/agora/interceptor/AgoraScreenShareInterceptor\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n488#2,7:74\n216#3,2:81\n*S KotlinDebug\n*F\n+ 1 AgoraScreenShareInterceptor.kt\ncom/kubi/agora/interceptor/AgoraScreenShareInterceptor\n*L\n66#1:74,7\n68#1:81,2\n*E\n"})
public final class AgoraScreenShareInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f15320a = new Companion(null);

    /* JADX INFO: compiled from: AgoraScreenShareInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/agora/interceptor/AgoraScreenShareInterceptor$Companion;", "", "<init>", "()V", "AGOTA_SCREEN_SHARE_PARAMS", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        String string;
        String queryParameter;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        Uri uriM14936a = m14936a(postcard);
        String strValueOf = String.valueOf(uriM14936a);
        boolean z11 = postcard.getBundle().getBoolean("meeting_screen_share") || ((string = postcard.getBundle().getString("meeting_screen_share")) != null && Boolean.parseBoolean(string)) || !(uriM14936a == null || (queryParameter = uriM14936a.getQueryParameter("meeting_screen_share")) == null || !Boolean.parseBoolean(queryParameter));
        if (!StringsKt.startsWith$default(strValueOf, "http", false, 2, (Object) null) || !z11) {
            return chain.mo103413a(postcard);
        }
        AgoraScreenShareWebActivity.f15187x.jumpToAgoraScreenSharePage(strValueOf);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m14936a(C4400a c4400a) {
        Uri uri = c4400a.getUri();
        if (Intrinsics.areEqual(RouteExKt.m56216G(uri), SignTermItem.LINK)) {
            return m14937c(c4400a);
        }
        return uri;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m14937c(C4400a c4400a) {
        Uri.Builder builderBuildUpon;
        Uri uriM58889h;
        String strM56284y = RouteExKt.m56284y(c4400a.getBundle(), "url");
        if (strM56284y != null && (uriM58889h = C24335h.f48569a.m58889h(strM56284y)) != null) {
            builderBuildUpon = uriM58889h.buildUpon();
        } else {
            builderBuildUpon = null;
        }
        HashMap<String, Object> mapM56243d0 = RouteExKt.m56243d0(c4400a.getBundle());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapM56243d0.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), "url")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (builderBuildUpon != null) {
                builderBuildUpon.appendQueryParameter((String) entry2.getKey(), entry2.getValue().toString());
            }
        }
        if (builderBuildUpon == null) {
            return null;
        }
        return builderBuildUpon.build();
    }
}
