package l70;

import com.kubi.mvi.common.C19241c;
import com.kubi.user.exception.UserCenterException;
import d70.C36638a;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: l70.d */
/* JADX INFO: compiled from: LoginTrackHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\tJ\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/user/track/LoginTrackHelper;", "", "<init>", "()V", "trackLoginFailed", "", "throwable", "", "validationType", "", "trackLoginSucceed", "businessType", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoginTrackHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginTrackHelper.kt\ncom/kubi/user/track/LoginTrackHelper\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,63:1\n50#2,17:64\n50#2,17:89\n57#3,8:81\n57#3,8:106\n*S KotlinDebug\n*F\n+ 1 LoginTrackHelper.kt\ncom/kubi/user/track/LoginTrackHelper\n*L\n35#1:64,17\n52#1:89,17\n43#1:81,8\n60#1:106,8\n*E\n"})
public final class C42120d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42120d f93546a = new C42120d();

    /* JADX INFO: renamed from: c */
    public final void m92406c(@NotNull String businessType) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            C43852m.m96605q("login_result", new JSONObject().put("businessType", businessType).put("is_success", true));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【LoginTrackHelper 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 == null || C42899b.m94075e(thM103847exceptionOrNullimpl2)) {
            return;
        }
        if (C36638a.m81972c(thM103847exceptionOrNullimpl2)) {
            C43846g.m96568c(new UserCenterException(thM103847exceptionOrNullimpl2, "LoginTrackHelper", true, null, 8, null), null, 2, null);
        } else {
            C36638a.m81973d(thM103847exceptionOrNullimpl2, "LoginTrackHelper");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m92403d(C42120d c42120d, String str, int i11, Object obj) throws Throwable {
        if ((i11 & 1) != 0) {
            str = "v2Login";
        }
        c42120d.m92406c(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m92404a(@NotNull String businessType) throws Throwable {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(businessType, "businessType");
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            C43852m.m96605q("login_result", new JSONObject().put("businessType", businessType).put("is_success", false));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【mvi 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 == null || C42899b.m94075e(thM103847exceptionOrNullimpl2)) {
            return;
        }
        if (C36638a.m81972c(thM103847exceptionOrNullimpl2)) {
            C43846g.m96568c(new UserCenterException(thM103847exceptionOrNullimpl2, "LoginTrackHelper", true, null, 8, null), null, 2, null);
        } else {
            C36638a.m81973d(thM103847exceptionOrNullimpl2, "LoginTrackHelper");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m92405b(@NotNull Throwable throwable, @NotNull String validationType) throws JSONException {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        JSONObject jSONObjectPut = new JSONObject().put("code", com.kubi.user.api.p.b(throwable)).put("fail_reason", throwable.getMessage());
        if (validationType.length() > 0) {
            jSONObjectPut.put("validationType", validationType);
        }
        C43852m.m96605q("login_failed_event", jSONObjectPut);
    }
}
