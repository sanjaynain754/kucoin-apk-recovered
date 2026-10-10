package l70;

import com.kubi.mvi.common.CodeMessageException;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.entity.OtcAd;
import com.kubi.safe.api.track.RobotCheckMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l70.n */
/* JADX INFO: compiled from: SignupV2Track.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e*\u0004\u0018\u00010\u000fH\u0000\"\u001a\u0010\u0003\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000\"\u001a\u0010\n\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0005\"\u0004\b\f\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"acceptBizType", "", "", "currentTrackSignupType", "getCurrentTrackSignupType", "()Ljava/lang/String;", "setCurrentTrackSignupType", "(Ljava/lang/String;)V", "currentTrackSignupRobotCheckMethod", "Lcom/kubi/safe/api/track/RobotCheckMethod;", "currentBindEmailAccount", "getCurrentBindEmailAccount", "setCurrentBindEmailAccount", "pickException", "Lkotlin/Pair;", "", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42130n {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static String f93562a = "";

    /* JADX INFO: renamed from: b */
    @Nullable
    public static RobotCheckMethod f93563b = null;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f93564c = "";

    /* JADX INFO: renamed from: a */
    public static final boolean m92435a(String str) {
        return Intrinsics.areEqual(str, "EMAIL_REGISTER") || Intrinsics.areEqual(str, "PHONE_REGISTER");
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m92439e() {
        return f93564c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m92440f() {
        return f93562a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Pair<String, String> m92441g(@Nullable Throwable th2) {
        if (th2 == null) {
            return TuplesKt.m90091to(null, null);
        }
        if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            return TuplesKt.m90091to(apiException.code, apiException.getMessage());
        }
        if (!(th2 instanceof CodeMessageException)) {
            return TuplesKt.m90091to(OtcAd.KYC_NOT_PASS, th2.getMessage());
        }
        CodeMessageException codeMessageException = (CodeMessageException) th2;
        return TuplesKt.m90091to(codeMessageException.getCode(), codeMessageException.getMessage());
    }

    /* JADX INFO: renamed from: h */
    public static final void m92442h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93564c = str;
    }

    /* JADX INFO: renamed from: i */
    public static final void m92443i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93562a = str;
    }
}
