package gs;

import com.kubi.notice.lib.exception.NoticeException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: gs.a */
/* JADX INFO: compiled from: NoticeIssue.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a$\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00012\u000e\b\u0004\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0080\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "msg", "categoryMessage", "noIgnoreReport", "safeAction", "message", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "NoticeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoticeIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeIssue.kt\ncom/kubi/notice/lib/exception/NoticeIssueKt\n*L\n1#1,65:1\n45#1,4:66\n*S KotlinDebug\n*F\n+ 1 NoticeIssue.kt\ncom/kubi/notice/lib/exception/NoticeIssueKt\n*L\n62#1:66,4\n*E\n"})
public final class C38009a {
    /* JADX INFO: renamed from: b */
    public static final void m85881b(@NotNull Throwable e11, @NotNull String source, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (C42899b.m94075e(e11)) {
            return;
        }
        m85882c(e11, source, msg);
    }

    /* JADX INFO: renamed from: c */
    public static final void m85882c(Throwable th2, String str, String str2) {
        C43846g.m96568c(new NoticeException(th2, str, false, str2), null, 2, null);
    }
}
