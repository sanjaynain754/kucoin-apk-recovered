package com.kubi.sdk.web.proxy;

import android.webkit.WebResourceRequest;
import androidx.media3.exoplayer.upstream.CmcdData;
import b10.C4454b;
import b10.InterfaceC4453a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: MixWebProxy.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u001b\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/web/proxy/MixWebProxy;", "Lb10/a;", "", "proxyList", "<init>", "([Lb10/a;)V", "Landroid/webkit/WebResourceRequest;", "webRequest", "Lb10/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/webkit/WebResourceRequest;)Lb10/b;", "[Lb10/a;", "b", "Companion", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class MixWebProxy implements InterfaceC4453a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4453a[] proxyList;

    public MixWebProxy(@NotNull InterfaceC4453a... proxyList) {
        Intrinsics.checkNotNullParameter(proxyList, "proxyList");
        this.proxyList = proxyList;
    }

    @Override // b10.InterfaceC4453a
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4454b mo4249a(@NotNull WebResourceRequest webRequest) {
        Intrinsics.checkNotNullParameter(webRequest, "webRequest");
        for (InterfaceC4453a interfaceC4453a : this.proxyList) {
            C4454b c4454bMo4249a = interfaceC4453a.mo4249a(webRequest);
            if (c4454bMo4249a != null) {
                return c4454bMo4249a;
            }
        }
        C44128b.m97259c("resourceLoad", "WebResource [" + webRequest.getUrl() + "] not found");
        return null;
    }
}
