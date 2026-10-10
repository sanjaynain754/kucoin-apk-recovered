package com.kubi.host.service;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.host.service.b */
/* JADX INFO: compiled from: ProductService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/host/service/b;", "", "", "availableAppHost", "appStaticImgHost", "availableH5Host", "availableWebHost", "appPlusHost", "appPushHost", "appZendeskHost", "appPciHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "d", "c", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C15189b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String availableAppHost;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String appStaticImgHost;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String availableH5Host;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String availableWebHost;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String appPlusHost;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String appPushHost;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String appZendeskHost;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String appPciHost;

    public C15189b(@NotNull String availableAppHost, @NotNull String appStaticImgHost, @NotNull String availableH5Host, @NotNull String availableWebHost, @NotNull String appPlusHost, @NotNull String appPushHost, @NotNull String appZendeskHost, @NotNull String appPciHost) {
        Intrinsics.checkNotNullParameter(availableAppHost, "availableAppHost");
        Intrinsics.checkNotNullParameter(appStaticImgHost, "appStaticImgHost");
        Intrinsics.checkNotNullParameter(availableH5Host, "availableH5Host");
        Intrinsics.checkNotNullParameter(availableWebHost, "availableWebHost");
        Intrinsics.checkNotNullParameter(appPlusHost, "appPlusHost");
        Intrinsics.checkNotNullParameter(appPushHost, "appPushHost");
        Intrinsics.checkNotNullParameter(appZendeskHost, "appZendeskHost");
        Intrinsics.checkNotNullParameter(appPciHost, "appPciHost");
        this.availableAppHost = availableAppHost;
        this.appStaticImgHost = appStaticImgHost;
        this.availableH5Host = availableH5Host;
        this.availableWebHost = availableWebHost;
        this.appPlusHost = appPlusHost;
        this.appPushHost = appPushHost;
        this.appZendeskHost = appZendeskHost;
        this.appPciHost = appPciHost;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppPciHost() {
        return this.appPciHost;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAppPlusHost() {
        return this.appPlusHost;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAppPushHost() {
        return this.appPushHost;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAppStaticImgHost() {
        return this.appStaticImgHost;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAppZendeskHost() {
        return this.appZendeskHost;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getAvailableAppHost() {
        return this.availableAppHost;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getAvailableH5Host() {
        return this.availableH5Host;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getAvailableWebHost() {
        return this.availableWebHost;
    }

    public /* synthetic */ C15189b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "xcoinsystem.com" : str, (i11 & 2) != 0 ? "staticimg.com" : str2, (i11 & 4) != 0 ? "www.kucoin.plus" : str3, (i11 & 8) != 0 ? "kucoin.com" : str4, (i11 & 16) != 0 ? "kucoin.plus" : str5, (i11 & 32) != 0 ? "aurorapush.cc" : str6, (i11 & 64) != 0 ? "kucoin.zendesk.com" : str7, (i11 & 128) != 0 ? "paypci.kucoin.com" : str8);
    }
}
