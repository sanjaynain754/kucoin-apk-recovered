package l70;

import com.kubi.otc.entity.OtcAd;
import com.kubi.safe.api.track.RobotCheckEvent;
import com.kubi.safe.api.track.RobotCheckScene;
import com.kubi.user.track.ResetPwdDescription;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p215dy.InterfaceC36989a;
import p215dy.RobotCheckEventData;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l70.i */
/* JADX INFO: compiled from: ResetPwdTrack.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002J\f\u0010\f\u001a\u00020\n*\u00020\rH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/track/ResetPwdRobotCheckEventReceiver;", "Lcom/kubi/safe/api/track/IRobotCheckEventReceiver;", "<init>", "()V", "invoke", "", "data", "Lcom/kubi/safe/api/track/RobotCheckEventData;", "track", "acceptScene", "", "Lcom/kubi/safe/api/track/RobotCheckScene;", "acceptEvent", "Lcom/kubi/safe/api/track/RobotCheckEvent;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42125i implements InterfaceC36989a {

    /* JADX INFO: renamed from: l70.i$a */
    /* JADX INFO: compiled from: ResetPwdTrack.kt */
    /* JADX INFO: loaded from: classes53.dex */
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
                iArr[RobotCheckEvent.CHECK_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RobotCheckEvent.SDK_INIT_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_TIME_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RobotCheckEvent.VERIFY_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RobotCheckScene.values().length];
            try {
                iArr2[RobotCheckScene.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RobotCheckScene.LOGIN_SEND_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    private final boolean m92422a(RobotCheckEvent robotCheckEvent) {
        switch (a.$EnumSwitchMapping$0[robotCheckEvent.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private final boolean m92423b(RobotCheckScene robotCheckScene) {
        int i11 = a.$EnumSwitchMapping$1[robotCheckScene.ordinal()];
        return i11 == 1 || i11 == 2;
    }

    /* JADX INFO: renamed from: c */
    public void m92425c(@NotNull RobotCheckEventData data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (m92423b(data.getRobotCheckScene()) && m92422a(data.getEvent())) {
            C42126j.f93557a.m92428b(C42117a.m92385a(data.getMethod()));
            m92424d(data);
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
        m92425c((RobotCheckEventData) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    private final void m92424d(RobotCheckEventData robotCheckEventData) throws JSONException {
        switch (a.$EnumSwitchMapping$0[robotCheckEventData.getEvent().ordinal()]) {
            case 1:
                C42126j.m92426e(C42126j.f93557a, ResetPwdDescription.CAPTCHA_INIT, false, "-13001", null, robotCheckEventData.getThrowable(), 8, null);
                break;
            case 2:
                C42126j.m92426e(C42126j.f93557a, ResetPwdDescription.CAPTCHA_CANCEL, false, OtcAd.KYC_NOT_PASS, null, null, 24, null);
                break;
            case 3:
                C42126j.m92426e(C42126j.f93557a, ResetPwdDescription.CAPTCHA_HANDLE, false, "-13502", null, robotCheckEventData.getThrowable(), 8, null);
                break;
            case 4:
                C42126j.m92426e(C42126j.f93557a, ResetPwdDescription.CAPTCHA_HANDLE, false, "-13003", null, robotCheckEventData.getThrowable(), 8, null);
                break;
            case 5:
                C42126j.m92426e(C42126j.f93557a, ResetPwdDescription.CAPTCHA_HANDLE, false, "-13004", null, robotCheckEventData.getThrowable(), 8, null);
                break;
            case 6:
                C42126j.m92426e(C42126j.f93557a, ResetPwdDescription.CAPTCHA_SUBMIT, false, "-13005", null, robotCheckEventData.getThrowable(), 8, null);
                break;
        }
    }
}
