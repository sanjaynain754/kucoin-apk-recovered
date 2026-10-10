package d70;

import com.kubi.user.exception.RefreshTokenException;
import com.kubi.user.exception.UserCenterException;
import com.tencent.qcloud.tuicore.TUIConstants;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: d70.a */
/* JADX INFO: compiled from: UserCenterIssue.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "categoryMessage", "msg", "trackDeprecatedBridgeCall", "bridge", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "categoryExtAccountMessage", "internalIgnore", "", "noIgnoreReport", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserCenterIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,91:1\n67#1,2:92\n*S KotlinDebug\n*F\n+ 1 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n72#1:92,2\n*E\n"})
public final class C36638a {
    /* JADX INFO: renamed from: c */
    public static final boolean m81972c(Throwable th2) {
        if (th2 instanceof RefreshTokenException) {
            return StringsKt.contains$default((CharSequence) ((RefreshTokenException) th2).getMessage(), (CharSequence) "=280003", false, 2, (Object) null);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final void m81973d(Throwable th2, String str) {
        C43846g.m96568c(new UserCenterException(th2, str, false, null, 8, null), null, 2, null);
    }
}
