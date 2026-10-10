package l70;

import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.safe.api.track.RobotCheckMethod;
import com.kubi.safe.api.track.RobotCheckScene;
import com.kubi.user.track.CaptchaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: l70.a */
/* JADX INFO: compiled from: CommonTrackEnum.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"UC_TRACK_COMMON_CANCEL_CODE", "", "UC_TRACK_COMMON_SUCCESS_CODE", "toCaptchaType", "Lcom/kubi/user/track/CaptchaType;", "Lcom/kubi/safe/api/track/RobotCheckMethod;", "toRobotsScene", "Lcom/kubi/safe/api/track/RobotCheckScene;", "Lcom/kubi/data/constance/ValidationBizEnum;", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42117a {

    /* JADX INFO: renamed from: l70.a$a */
    /* JADX INFO: compiled from: CommonTrackEnum.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RobotCheckMethod.values().length];
            try {
                iArr[RobotCheckMethod.GEETEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RobotCheckMethod.HCAPTCHA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RobotCheckMethod.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ValidationBizEnum.values().length];
            try {
                iArr2[ValidationBizEnum.PHONE_LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ValidationBizEnum.EMAIL_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ValidationBizEnum.LOGIN_V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ValidationBizEnum.PHONE_REGISTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ValidationBizEnum.EMAIL_REGISTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ValidationBizEnum.REGISTER_SMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ValidationBizEnum.REGISTER_EMAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ValidationBizEnum.PASSKEY_REGISTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ValidationBizEnum.FORGOT_PASSWORD.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ValidationBizEnum.FORGOT_PASSWORD_V2.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CaptchaType m92385a(@Nullable RobotCheckMethod robotCheckMethod) {
        if (robotCheckMethod == null) {
            return CaptchaType.UNKNOWN;
        }
        int i11 = a.$EnumSwitchMapping$0[robotCheckMethod.ordinal()];
        if (i11 == 1) {
            return CaptchaType.GEETEST;
        }
        if (i11 == 2) {
            return CaptchaType.HCAPTCHA;
        }
        if (i11 == 3) {
            return CaptchaType.IMAGE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final RobotCheckScene m92386b(@Nullable ValidationBizEnum validationBizEnum) {
        if (validationBizEnum == null) {
            return RobotCheckScene.NONE;
        }
        switch (a.$EnumSwitchMapping$1[validationBizEnum.ordinal()]) {
            case 1:
                return RobotCheckScene.LOGIN;
            case 2:
                return RobotCheckScene.LOGIN;
            case 3:
                return RobotCheckScene.LOGIN;
            case 4:
                return RobotCheckScene.REGISTER;
            case 5:
                return RobotCheckScene.REGISTER;
            case 6:
                return RobotCheckScene.REGISTER;
            case 7:
                return RobotCheckScene.REGISTER;
            case 8:
                return RobotCheckScene.REGISTER;
            case 9:
                return RobotCheckScene.RESET_PWD;
            case 10:
                return RobotCheckScene.RESET_PWD;
            default:
                return RobotCheckScene.NONE;
        }
    }
}
