package l70;

import com.kubi.safe.api.track.RobotCheckEvent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p215dy.InterfaceC36989a;
import p215dy.RobotCheckEventData;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: l70.r */
/* JADX INFO: compiled from: ThirdAccountLoginEvent.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/user/track/ThirdLoginRobotCheckEventReceiver;", "Lcom/kubi/safe/api/track/IRobotCheckEventReceiver;", "<init>", "()V", "invoke", "", "data", "Lcom/kubi/safe/api/track/RobotCheckEventData;", "acceptBizType", "", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42134r implements InterfaceC36989a {

    /* JADX INFO: renamed from: l70.r$a */
    /* JADX INFO: compiled from: ThirdAccountLoginEvent.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RobotCheckEvent.values().length];
            try {
                iArr[RobotCheckEvent.API_INIT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RobotCheckEvent.CHECK_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RobotCheckEvent.SDK_INIT_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RobotCheckEvent.VERIFY_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RobotCheckEvent.VERIFY_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m92465a(String str) {
        return Intrinsics.areEqual(str, "EMAIL_LOGIN") || Intrinsics.areEqual(str, "PHONE_LOGIN") || Intrinsics.areEqual(str, "EMAIL_REGISTER") || Intrinsics.areEqual(str, "PHONE_REGISTER");
    }

    /* JADX INFO: renamed from: b */
    public void m92466b(@NotNull RobotCheckEventData data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (m92465a(data.getBizType())) {
            int i11 = a.$EnumSwitchMapping$0[data.getEvent().ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                Boolean bool = Boolean.FALSE;
                Throwable throwable = data.getThrowable();
                C42133q.m92459d(bool, null, null, null, null, throwable != null ? throwable.getMessage() : null, 30, null);
            } else {
                if (i11 == 5) {
                    C42133q.m92459d(Boolean.TRUE, null, null, null, null, null, 62, null);
                    return;
                }
                C44128b.m97259c("ThirdAccountLoginEvent", "ignore robotcheck: event=" + data.getEvent());
            }
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
        m92466b((RobotCheckEventData) obj);
        return Unit.INSTANCE;
    }
}
