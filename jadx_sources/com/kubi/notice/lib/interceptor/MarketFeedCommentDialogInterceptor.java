package com.kubi.notice.lib.interceptor;

import android.net.Uri;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarketFeedCommentDialogInterceptor.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/notice/lib/interceptor/MarketFeedCommentDialogInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketFeedCommentDialogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketFeedCommentDialogInterceptor.kt\ncom/kubi/notice/lib/interceptor/MarketFeedCommentDialogInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1869#2,2:35\n*S KotlinDebug\n*F\n+ 1 MarketFeedCommentDialogInterceptor.kt\ncom/kubi/notice/lib/interceptor/MarketFeedCommentDialogInterceptor\n*L\n19#1:35,2\n*E\n"})
public final class MarketFeedCommentDialogInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f36377a = new Companion(null);

    /* JADX INFO: compiled from: MarketFeedCommentDialogInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/notice/lib/interceptor/MarketFeedCommentDialogInterceptor$Companion;", "", "<init>", "()V", "ACTION", "", "ACTION_WITH_SLASH", "FLUTTER_DIALOG_ROUTE", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        Uri uri = chain.getPostcard().getUri();
        Uri.Builder builderPath = new Uri.Builder().path("/market/feed/commentDialog");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                queryParameter = "";
            }
            builderPath.appendQueryParameter(str, queryParameter);
        }
        String string = builderPath.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        KCFlutterRouteManager.m56840m(KCFlutterRouteManager.f46704a, string, null, 2, null);
        return true;
    }
}
