package com.tencent.thumbplayer.tcmedia.p156c.p157a;

import android.os.Looper;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest;
import com.tencent.thumbplayer.tcmedia.api.resourceloader.TPAssetResourceLoadingContentInformationRequest;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.a.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35292d implements ITPAssetResourceLoadingRequest {

    /* JADX INFO: renamed from: a */
    private int f75889a;

    /* JADX INFO: renamed from: b */
    private C35291c f75890b;

    /* JADX INFO: renamed from: c */
    private TPAssetResourceLoadingContentInformationRequest f75891c;

    /* JADX INFO: renamed from: d */
    private boolean f75892d = false;

    /* JADX INFO: renamed from: e */
    private boolean f75893e = false;

    /* JADX INFO: renamed from: a */
    public int m77957a(long j11) {
        return this.f75890b.m77952a(j11);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m77962b() {
        this.f75892d = true;
        this.f75890b.m77956b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized void finishLoading() {
        this.f75893e = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized boolean isCancelled() {
        return this.f75892d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized boolean isFinished() {
        return this.f75893e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C35291c getLoadingDataRequest() {
        return this.f75890b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.resourceloader.ITPAssetResourceLoadingRequest
    public TPAssetResourceLoadingContentInformationRequest getContentInformation() {
        return this.f75891c;
    }

    public C35292d(long j11, long j12, int i11, boolean z11) {
        this.f75889a = i11;
        C35291c c35291c = new C35291c(j11, j12, z11);
        this.f75890b = c35291c;
        c35291c.m77953a(i11);
    }

    /* JADX INFO: renamed from: a */
    public void m77959a(Looper looper) {
        this.f75890b.m77954a(looper);
    }

    /* JADX INFO: renamed from: a */
    public void m77960a(TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest) {
        this.f75891c = tPAssetResourceLoadingContentInformationRequest;
    }

    /* JADX INFO: renamed from: a */
    public void m77961a(String str) {
        this.f75890b.m77955a(str);
    }
}
