package com.kubi.kumex.dialog;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimeMenuDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kumex/dialog/CustomTime;", "Lcom/kubi/kumex/dialog/BaseTime;", "start", "", "end", "<init>", "(JJ)V", "getStart", "()J", "getEnd", "startTime", "endTime", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomTime implements BaseTime {

    /* JADX INFO: renamed from: a */
    public final long f28881a;

    /* JADX INFO: renamed from: b */
    public final long f28882b;

    @Override // com.kubi.kumex.dialog.BaseTime
    /* JADX INFO: renamed from: a, reason: from getter */
    public long getF28882b() {
        return this.f28882b;
    }

    @Override // com.kubi.kumex.dialog.BaseTime
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getF28881a() {
        return this.f28881a;
    }

    /* JADX INFO: renamed from: c */
    public final long m33593c() {
        return this.f28882b;
    }

    /* JADX INFO: renamed from: d */
    public final long m33594d() {
        return this.f28881a;
    }

    public CustomTime(long j11, long j12) {
        this.f28881a = j11;
        this.f28882b = j12;
    }
}
