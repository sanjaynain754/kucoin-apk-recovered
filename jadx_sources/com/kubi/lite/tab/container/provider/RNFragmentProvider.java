package com.kubi.lite.tab.container.provider;

import android.net.Uri;
import android.os.Bundle;
import co.InterfaceC5033a;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.sdk.BaseFragment;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p238eo.C37218a;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RNFragmentProvider.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/RNFragmentProvider;", "Lcom/kubi/lite/tab/container/provider/FragmentProvider;", "<init>", "()V", "createFragment", "Lcom/kubi/sdk/BaseFragment;", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "newUrl", "", "parseUrlAndBuildArgs", "Landroid/os/Bundle;", "url", "parseCustomParameters", "", "uri", "Landroid/net/Uri;", "bundle", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNFragmentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNFragmentProvider.kt\ncom/kubi/lite/tab/container/provider/RNFragmentProvider\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n29#2:143\n1869#3,2:144\n*S KotlinDebug\n*F\n+ 1 RNFragmentProvider.kt\ncom/kubi/lite/tab/container/provider/RNFragmentProvider\n*L\n66#1:143\n129#1:144,2\n*E\n"})
public final class RNFragmentProvider implements InterfaceC5033a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32097a = new Companion(null);

    /* JADX INFO: compiled from: RNFragmentProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/RNFragmentProvider$Companion;", "", "<init>", "()V", "LTAG", "", "KEY_BIZ", "KEY_ENTRY", "KEY_COMPONENT", "KEY_BACKUP", "KEY_ROUTE", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        C44128b.m97266j("LiteV2-RNFragmentProvider", "Start creating RN Fragment, tabId=" + tabConfig.getConfigTabId() + ", url=" + tabConfig.getUrl());
        Bundle bundleM37567c = (str == null || str.length() <= 0) ? m37567c(tabConfig.getUrl()) : m37567c(str);
        C44128b.m97266j("LiteV2-RNFragmentProvider", "RN Fragment parameters built: biz=" + bundleM37567c.getString(Constants.BIZ));
        BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(bundleM37567c);
        C44128b.m97266j("LiteV2-RNFragmentProvider", "RN Fragment created successfully, tabId=" + tabConfig.getConfigTabId());
        return rnRootFragment;
    }

    /* JADX INFO: renamed from: b */
    public final int m37566b(Uri uri, Bundle bundle) {
        String queryParameter;
        Set of2 = SetsKt.setOf((Object[]) new String[]{Constants.BIZ, "entry", Constants.COMPONENT, "backup", "route"});
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        int i11 = 0;
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                if (!of2.contains(str) && (queryParameter = uri.getQueryParameter(str)) != null && queryParameter.length() != 0) {
                    bundle.putString(str, queryParameter);
                    i11++;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m37567c(String str) {
        C44128b.m97266j("LiteV2-RNFragmentProvider", "Start parsing URL: " + str);
        String strM83260a = C37218a.f82536a.m83260a(str);
        if (strM83260a == null) {
            C44128b.m97270n("LiteV2-RNFragmentProvider", "Route configuration query returned no result, using original URL");
        } else {
            C44128b.m97266j("LiteV2-RNFragmentProvider", "URL after route processing: " + strM83260a);
            str = strM83260a;
        }
        Uri uri = str != null ? Uri.parse(str) : null;
        String str2 = "unknown";
        if (uri == null) {
            C44128b.m97270n("LiteV2-RNFragmentProvider", "Failed to convert URL to Uri: " + str);
            Bundle bundle = new Bundle();
            bundle.putString(Constants.BIZ, "unknown");
            bundle.putString("entry", "index");
            bundle.putString(Constants.COMPONENT, "unknown");
            return bundle;
        }
        String queryParameter = uri.getQueryParameter(Constants.BIZ);
        if (queryParameter == null) {
            C44128b.m97270n("LiteV2-RNFragmentProvider", "Missing required parameter 'biz' in URL, using default: unknown, URL: " + str);
        } else {
            str2 = queryParameter;
        }
        String queryParameter2 = uri.getQueryParameter("entry");
        String str3 = queryParameter2 != null ? queryParameter2 : "index";
        String queryParameter3 = uri.getQueryParameter(Constants.COMPONENT);
        if (queryParameter3 == null) {
            queryParameter3 = str2;
        }
        String queryParameter4 = uri.getQueryParameter("backup");
        String queryParameter5 = uri.getQueryParameter("route");
        C44128b.m97266j("LiteV2-RNFragmentProvider", "URL parameter parsing result: biz=" + str2 + ", entry=" + str3 + ", component=" + queryParameter3 + ", backup=" + queryParameter4 + ", route=" + queryParameter5);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Constants.BIZ, str2);
        bundle2.putString("entry", str3);
        bundle2.putString(Constants.COMPONENT, queryParameter3);
        if (queryParameter4 != null && queryParameter4.length() != 0) {
            bundle2.putString("backup", queryParameter4);
        }
        if (queryParameter5 != null && queryParameter5.length() != 0) {
            bundle2.putString("route", queryParameter5);
        }
        int iM37566b = m37566b(uri, bundle2);
        if (iM37566b > 0) {
            C44128b.m97266j("LiteV2-RNFragmentProvider", "Found " + iM37566b + " custom parameters");
        }
        return bundle2;
    }
}
