package com.kubi.lite.tab.container.provider;

import android.net.Uri;
import co.InterfaceC5033a;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.container.LiteFlutterDelegateFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p238eo.C37218a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterFragmentProvider.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/FlutterFragmentProvider;", "Lcom/kubi/lite/tab/container/provider/FragmentProvider;", "<init>", "()V", "createFragment", "Lcom/kubi/sdk/BaseFragment;", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "newUrl", "", "parseFlutterRoute", "url", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterFragmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterFragmentProvider.kt\ncom/kubi/lite/tab/container/provider/FlutterFragmentProvider\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,80:1\n29#2:81\n*S KotlinDebug\n*F\n+ 1 FlutterFragmentProvider.kt\ncom/kubi/lite/tab/container/provider/FlutterFragmentProvider\n*L\n57#1:81\n*E\n"})
public final class FlutterFragmentProvider implements InterfaceC5033a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32092a = new Companion(null);

    /* JADX INFO: compiled from: FlutterFragmentProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/FlutterFragmentProvider$Companion;", "", "<init>", "()V", "LTAG", "", "DEFAULT_ROUTE", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // co.InterfaceC5033a
    @NotNull
    /* JADX INFO: renamed from: a */
    public BaseFragment mo5441a(@NotNull TabConfig tabConfig, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Start creating Flutter fragment, tabId=" + tabConfig.getConfigTabId());
        String strM37562b = m37562b(tabConfig.getUrl());
        C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Flutter route parsed: " + strM37562b);
        LiteFlutterDelegateFragment liteFlutterDelegateFragmentNewInstance = LiteFlutterDelegateFragment.f32091Y.newInstance(strM37562b);
        C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Flutter fragment created successfully: route=" + strM37562b);
        return liteFlutterDelegateFragmentNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX INFO: renamed from: b */
    public final String m37562b(String str) {
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        String queryParameter;
        Object obj = "/";
        C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Start parsing Flutter route, url=" + str);
        if (str == null) {
            str = "";
        }
        C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Original URL: " + str);
        String strM83260a = C37218a.f82536a.m83260a(str);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (strM83260a.length() > 0) {
                queryParameter = Uri.parse(strM83260a).getQueryParameter("route");
                C44128b.m97266j("LiteV2-FlutterFragmentProvider", "URI parsing result: query parameter route=" + queryParameter);
                if (queryParameter == null || queryParameter.length() == 0) {
                    C44128b.m97266j("LiteV2-FlutterFragmentProvider", "No route parameter found or empty, using default route: /");
                } else {
                    C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Flutter route parsed successfully: " + queryParameter);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(queryParameter);
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl == null) {
                    obj = objM103844constructorimpl;
                } else {
                    C44128b.m97262f("LiteV2-FlutterFragmentProvider", "Failed to parse Flutter route", thM103847exceptionOrNullimpl);
                    C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Parsing failed, using default route: /");
                }
                return (String) obj;
            }
            C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Jump URL is empty, using default route: /");
            queryParameter = "/";
            objM103844constructorimpl = Result.m103844constructorimpl(queryParameter);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl == null) {
            obj = objM103844constructorimpl;
        } else {
            C44128b.m97262f("LiteV2-FlutterFragmentProvider", "Failed to parse Flutter route", thM103847exceptionOrNullimpl);
            C44128b.m97266j("LiteV2-FlutterFragmentProvider", "Parsing failed, using default route: /");
        }
        return (String) obj;
    }
}
