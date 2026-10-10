package com.kubi.kumex.dialog;

import androidx.annotation.IdRes;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.kumex.R$id;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.b2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimeMenuDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/dialog/RangeTime;", "Lcom/kubi/kumex/dialog/BaseTime;", SessionDescription.ATTR_RANGE, "", "<init>", "(I)V", "getRange", "()I", "startTime", "", "endTime", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RangeTime implements BaseTime {

    /* JADX INFO: renamed from: a */
    public final int f28887a;

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF28887a() {
        return this.f28887a;
    }

    public RangeTime(@IdRes int i11) {
        this.f28887a = i11;
    }

    @Override // com.kubi.kumex.dialog.BaseTime
    /* JADX INFO: renamed from: a */
    public long getF28882b() {
        return System.currentTimeMillis();
    }

    @Override // com.kubi.kumex.dialog.BaseTime
    /* JADX INFO: renamed from: b */
    public long getF28881a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i11 = this.f28887a;
        long j11 = 604800000;
        if (i11 != R$id.sevenDay) {
            if (i11 == R$id.oneMonth) {
                j11 = 2592000000L;
            } else if (i11 == R$id.threeMonth) {
                j11 = 7776000000L;
            }
        }
        return jCurrentTimeMillis - j11;
    }
}
