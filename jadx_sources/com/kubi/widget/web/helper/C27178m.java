package com.kubi.widget.web.helper;

import android.net.Uri;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.web.KWebView;
import com.kubi.widget.web.R$id;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.widget.web.helper.m */
/* JADX INFO: compiled from: KWebUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\b"}, m90084d2 = {"safeGetQueryParameter", "", "Landroid/net/Uri;", "key", "notifyOnShow", "", "Lcom/kubi/sdk/web/KWebView;", "notifyOnHide", "LWebWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebUtils.kt\ncom/kubi/widget/web/helper/KWebUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class C27178m {
    /* JADX INFO: renamed from: a */
    public static final void m67318a(@NotNull KWebView kWebView) {
        Intrinsics.checkNotNullParameter(kWebView, "<this>");
        C43840a.m96550d("[page-event] notifyOnHide currentUrl=" + kWebView.getUrl(), "KWebViewLifecycle");
        KWebView.m58555y(kWebView, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, null, null, 6, null);
    }

    /* JADX INFO: renamed from: b */
    public static final void m67319b(@NotNull KWebView kWebView) throws JSONException {
        Intrinsics.checkNotNullParameter(kWebView, "<this>");
        int i11 = R$id.jump_url_tag;
        String str = (String) kWebView.getTag(i11);
        C43840a.m96550d("[page-event] notifyOnShow currentUrl=" + kWebView.getUrl() + ", jumpUrl=" + str, "KWebViewLifecycle");
        if (str == null || str.length() == 0) {
            KWebView.m58555y(kWebView, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, null, null, 6, null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jumpUrl", str);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        kWebView.setTag(i11, "");
        KWebView.m58555y(kWebView, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, string, null, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m67320c(@NotNull Uri uri, @NotNull String key) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return uri.getQueryParameter(key);
        } catch (Exception unused) {
            return null;
        }
    }
}
