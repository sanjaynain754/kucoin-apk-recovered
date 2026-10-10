package com.kubi.home.router;

import com.kubi.event.api.C12572a;
import com.kubi.router.utils.RouteExKt;
import org.jetbrains.annotations.NotNull;
import p233ej.C37201i;
import p693vj.C45557b;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: HomeFeedTabInterceptor.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/router/HomeFeedTabInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeFeedTabInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f26190a = new Companion(null);

    /* JADX INFO: compiled from: HomeFeedTabInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/router/HomeFeedTabInterceptor$Companion;", "", "<init>", "()V", "ACTION", "", "TAG", "KEY_PARAMS_TAB_CODE", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        String strM56216G = RouteExKt.m56216G(chain.getPostcard().getUri());
        C44128b.m97259c("HomeFeedTabInterceptor", "[intercept] action:" + strM56216G);
        if (!Intrinsics.areEqual("home/feedTab", strM56216G)) {
            return true;
        }
        RouteExKt.m56217H("home?page=0");
        String queryParameter = chain.getPostcard().getUri().getQueryParameter("tabCode");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String str = queryParameter;
        C44128b.m97259c("HomeFeedTabInterceptor", "[intercept] code:" + str);
        C37201i.f82500a.m83213F(str);
        C12572a.m23695d("com.kubi.home.feed.QuoteEvent:home_feed_jump_to_tab_position_notify", null, 0L, 6, null);
        if (!C45557b.m100614e()) {
            return true;
        }
        C12572a.m23695d("com.kubi.home.rn.HomeRNEvent:home_feed_jump_to_tab_position_notify", str, 0L, 4, null);
        return true;
    }
}
