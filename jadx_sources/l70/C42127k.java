package l70;

import org.jetbrains.annotations.NotNull;
import p215dy.InterfaceC36989a;
import p215dy.RobotCheckEventData;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: l70.k */
/* JADX INFO: compiled from: SignupV2Track.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/track/SignupRobotCheckEventReceiver;", "Lcom/kubi/safe/api/track/IRobotCheckEventReceiver;", "<init>", "()V", "invoke", "", "data", "Lcom/kubi/safe/api/track/RobotCheckEventData;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSignupV2Track.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignupV2Track.kt\ncom/kubi/user/track/SignupRobotCheckEventReceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class C42127k implements InterfaceC36989a {
    /* JADX INFO: renamed from: a */
    public void m92431a(@NotNull RobotCheckEventData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (C42130n.m92435a(data.getBizType())) {
            C42130n.f93563b = data.getMethod();
        }
    }

    @Override // p852kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m92431a((RobotCheckEventData) obj);
        return Unit.INSTANCE;
    }
}
