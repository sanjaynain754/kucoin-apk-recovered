package p209ds;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: ds.a, reason: from toString */
/* JADX INFO: compiled from: RedDot.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/notice/api/entity/RedDot;", "", "noticeNumberCount", "", "noticeAllCount", "encourageCount", "invitationCount", "<init>", "(IIII)V", "getNoticeNumberCount", "()I", "getNoticeAllCount", "getEncourageCount", "getInvitationCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "NoticeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RedDot {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final int noticeNumberCount;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int noticeAllCount;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int encourageCount;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int invitationCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedDot)) {
            return false;
        }
        RedDot redDot = (RedDot) other;
        return this.noticeNumberCount == redDot.noticeNumberCount && this.noticeAllCount == redDot.noticeAllCount && this.encourageCount == redDot.encourageCount && this.invitationCount == redDot.invitationCount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEncourageCount() {
        return this.encourageCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInvitationCount() {
        return this.invitationCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNoticeAllCount() {
        return this.noticeAllCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getNoticeNumberCount() {
        return this.noticeNumberCount;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.noticeNumberCount) * 31) + Integer.hashCode(this.noticeAllCount)) * 31) + Integer.hashCode(this.encourageCount)) * 31) + Integer.hashCode(this.invitationCount);
    }

    @NotNull
    public String toString() {
        return "RedDot(noticeNumberCount=" + this.noticeNumberCount + ", noticeAllCount=" + this.noticeAllCount + ", encourageCount=" + this.encourageCount + ", invitationCount=" + this.invitationCount + ')';
    }

    public RedDot(int i11, int i12, int i13, int i14) {
        this.noticeNumberCount = i11;
        this.noticeAllCount = i12;
        this.encourageCount = i13;
        this.invitationCount = i14;
    }
}
