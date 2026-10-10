package p499og;

import com.kubi.flutter.widget.kline.exception.KLineException;
import com.kubi.flutter.widget.kline.exception.KLineMessage;
import p569qq.C43846g;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: og.a */
/* JADX INFO: compiled from: KLineIssue.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "categoryMessage", "msg", "noIgnoreReportMsg", "noIgnoreReportExp", "LKLineWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43043a {
    /* JADX INFO: renamed from: c */
    public static final void m94532c(Throwable th2, String str) {
        C43846g.m96568c(new KLineException(th2, str, false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m94533d(String str, String str2) {
        C43846g.m96568c(new KLineMessage(str, str2, false), null, 2, null);
    }
}
