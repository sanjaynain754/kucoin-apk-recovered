package com.kubi.advert;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.advert.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppsFlyerTrackingState.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/advert/AppsFlyerCallbackWatchdogState;", "", "<init>", "()V", "settled", "", "markCallbackObserved", "expire", "settle", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppsFlyerCallbackWatchdogState {

    /* JADX INFO: renamed from: a */
    public boolean f15155a;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m14781a() {
        return m14783c();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m14782b() {
        return m14783c();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14783c() {
        if (this.f15155a) {
            return false;
        }
        this.f15155a = true;
        return true;
    }
}
