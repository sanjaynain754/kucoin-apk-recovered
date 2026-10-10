package l70;

import com.kubi.advert.api.IAdvertService;
import com.kubi.safe.api.track.RobotCheckEvent;
import com.kubi.safe.api.track.RobotCheckMethod;
import com.kubi.user.track.UCenterCategory;
import com.kubi.user.track.UCenterFailReason;
import com.kubi.user.track.UCenterFailReasonCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p215dy.RobotCheckEventData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: l70.c */
/* JADX INFO: compiled from: LoginRobotCheckEventReceiver.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\f\u0010\b\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\f\u0010\t\u001a\u00020\u0006*\u00020\u0007H\u0002\"\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\"\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\"\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\"\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"acceptEvent", "", "Lcom/kubi/safe/api/track/RobotCheckEvent;", "acceptBizType", "", "track", "", "Lcom/kubi/safe/api/track/RobotCheckEventData;", "robotCheckFailed", "robotCheckCancel", "currentTrackLoginType", "getCurrentTrackLoginType", "()Ljava/lang/String;", "setCurrentTrackLoginType", "(Ljava/lang/String;)V", "currentTrackValidationCodeType", "getCurrentTrackValidationCodeType", "setCurrentTrackValidationCodeType", "currentRobotCheckMethod", "Lcom/kubi/safe/api/track/RobotCheckMethod;", "getCurrentRobotCheckMethod", "()Lcom/kubi/safe/api/track/RobotCheckMethod;", "setCurrentRobotCheckMethod", "(Lcom/kubi/safe/api/track/RobotCheckMethod;)V", "curPasskeyAccountType", "getCurPasskeyAccountType", "setCurPasskeyAccountType", "TAG", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoginRobotCheckEventReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginRobotCheckEventReceiver.kt\ncom/kubi/user/track/LoginRobotCheckEventReceiverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class C42119c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static String f93542a = "";

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f93543b = "";

    /* JADX INFO: renamed from: c */
    @Nullable
    public static RobotCheckMethod f93544c = null;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f93545d = "";

    /* JADX INFO: renamed from: l70.c$a */
    /* JADX INFO: compiled from: LoginRobotCheckEventReceiver.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RobotCheckEvent.values().length];
            try {
                iArr[RobotCheckEvent.API_INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RobotCheckEvent.SDK_INIT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_TIME_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RobotCheckEvent.VERIFY_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RobotCheckEvent.VERIFY_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RobotCheckMethod.values().length];
            try {
                iArr2[RobotCheckMethod.GEETEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[RobotCheckMethod.HCAPTCHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[RobotCheckMethod.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m92388a(String str) {
        return Intrinsics.areEqual(str, "EMAIL_LOGIN") || Intrinsics.areEqual(str, "PHONE_LOGIN");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m92389b(RobotCheckEvent robotCheckEvent) {
        switch (a.$EnumSwitchMapping$0[robotCheckEvent.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m92393f() {
        return f93545d;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final RobotCheckMethod m92394g() {
        return f93544c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m92395h() {
        return f93542a;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m92396i() {
        return f93543b;
    }

    /* JADX INFO: renamed from: k */
    public static final void m92398k(RobotCheckEventData robotCheckEventData) throws JSONException {
        IAdvertService.m14758l(IAdvertService.f15070a.get(), "SecurityPage_Robert_VerifyFailed", null, 2, null);
        RobotCheckMethod method = robotCheckEventData.getMethod();
        int i11 = method == null ? -1 : a.$EnumSwitchMapping$1[method.ordinal()];
        if (i11 == 1) {
            C42121e.m92408b(UCenterCategory.CHECK_ROBOT_GT_ERROR, null, robotCheckEventData.getThrowable(), false, null, 26, null);
            return;
        }
        if (i11 == 2) {
            C42121e.m92408b(UCenterCategory.CHECK_ROBOT_HC_ERROR, null, robotCheckEventData.getThrowable(), false, null, 26, null);
        } else if (i11 != 3) {
            C44128b.m97270n("LoginTrack", "RobotCheckEventData.track:CHECK_FAILED method ignore.");
        } else {
            C42121e.m92408b(UCenterCategory.CHECK_ROBOT_IMAGE_ERROR, null, robotCheckEventData.getThrowable(), false, null, 26, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m92399l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93545d = str;
    }

    /* JADX INFO: renamed from: m */
    public static final void m92400m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93542a = str;
    }

    /* JADX INFO: renamed from: n */
    public static final void m92401n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f93543b = str;
    }

    /* JADX INFO: renamed from: j */
    public static final void m92397j(RobotCheckEventData robotCheckEventData) throws JSONException {
        int i11;
        RobotCheckMethod method = robotCheckEventData.getMethod();
        if (method == null) {
            i11 = -1;
        } else {
            i11 = a.$EnumSwitchMapping$1[method.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    C44128b.m97270n("LoginTrack", "RobotCheckEventData.track:CHECK_CANCEL method ignore.");
                    return;
                } else {
                    C42121e.m92408b(UCenterCategory.CHECK_ROBOT_IMAGE_CANCEL, UCenterFailReason.IMAGE_CANCEL, robotCheckEventData.getThrowable(), false, UCenterFailReasonCode.USER_CANCEL, 8, null);
                    return;
                }
            }
            C42121e.m92408b(UCenterCategory.CHECK_ROBOT_HC_CANCEL, UCenterFailReason.HC_CANCEL, robotCheckEventData.getThrowable(), false, UCenterFailReasonCode.USER_CANCEL, 8, null);
            return;
        }
        C42121e.m92408b(UCenterCategory.CHECK_ROBOT_GT_CANCEL, UCenterFailReason.GT_CANCEL, robotCheckEventData.getThrowable(), false, UCenterFailReasonCode.USER_CANCEL, 8, null);
    }

    /* JADX INFO: renamed from: o */
    public static final void m92402o(RobotCheckEventData robotCheckEventData) throws JSONException {
        RobotCheckMethod method = robotCheckEventData.getMethod();
        if (method != null) {
            f93544c = method;
        }
        switch (a.$EnumSwitchMapping$0[robotCheckEventData.getEvent().ordinal()]) {
            case 1:
                C42121e.m92408b(UCenterCategory.CHECK_ROBOT_API_INIT, null, robotCheckEventData.getThrowable(), false, null, 26, null);
                break;
            case 2:
                IAdvertService.m14758l(IAdvertService.f15070a.get(), "SecurityPage_Robert_expose", null, 2, null);
                break;
            case 3:
                m92397j(robotCheckEventData);
                break;
            case 4:
                m92398k(robotCheckEventData);
                break;
            case 5:
                C42121e.m92408b(UCenterCategory.CHECK_ROBOT_HC_INIT, UCenterFailReason.HC_INIT, robotCheckEventData.getThrowable(), false, null, 24, null);
                break;
            case 6:
                C42121e.m92408b(UCenterCategory.CHECK_ROBOT_HC_TIME_OUT, UCenterFailReason.HC_TIME_OUT, robotCheckEventData.getThrowable(), false, null, 24, null);
                break;
            case 7:
                C42121e.m92408b(UCenterCategory.CHECK_ROBOT_API_SUBMIT, null, robotCheckEventData.getThrowable(), false, null, 26, null);
                break;
            case 8:
                IAdvertService.m14758l(IAdvertService.f15070a.get(), "SecurityPage_Robert_VerifySuccess", null, 2, null);
                break;
            default:
                C44128b.m97270n("LoginTrack", "RobotCheckEventData.track ignore.");
                break;
        }
    }
}
