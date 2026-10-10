package com.kubi.kucoin.interceptor;

import al.RunnableC0377a;
import android.net.Uri;
import com.kubi.sdk.protocol.ProtocolException;
import f00.C37304a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RouteProtocolInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteProtocolInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteProtocolInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n+ 4 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,31:1\n29#2:32\n49#3:33\n70#3:36\n15#4,2:34\n*S KotlinDebug\n*F\n+ 1 RouteProtocolInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteProtocolInterceptor\n*L\n24#1:32\n27#1:33\n27#1:36\n27#1:34,2\n*E\n"})
public final class RouteProtocolInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f27948a = new Companion(null);

    /* JADX INFO: compiled from: RouteProtocolInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteProtocolInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        try {
            C37304a.f82764a.m83688Y3(Uri.parse(postcard.m4045h()));
            return chain.mo103413a(postcard);
        } catch (ProtocolException e11) {
            C42917g.m94137c().execute(new RunnableC0377a(e11, "RouteProtocolInterceptor"));
            return false;
        }
    }
}
