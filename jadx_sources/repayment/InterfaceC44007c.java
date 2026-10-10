package repayment;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: repayment.c */
/* JADX INFO: compiled from: RepayContract.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lrepayment/RepayContract$VMEvent;", "Lrepayment/RepayContract;", "ShowRepaySuccessDialog", "ShowRepayFailedDialog", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44007c {

    /* JADX INFO: renamed from: repayment.c$a */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lrepayment/RepayContract$VMEvent$ShowRepayFailedDialog;", "Lrepayment/RepayContract$VMEvent;", "isFinishPage", "", "exception", "", "<init>", "(ZLjava/lang/Throwable;)V", "()Z", "getException", "()Ljava/lang/Throwable;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC44007c {

        /* JADX INFO: renamed from: a */
        public final boolean f97271a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final Throwable f97272b;

        public a(boolean z11, @NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f97271a = z11;
            this.f97272b = exception;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getF97272b() {
            return this.f97272b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF97271a() {
            return this.f97271a;
        }
    }

    /* JADX INFO: renamed from: repayment.c$b */
    /* JADX INFO: compiled from: RepayContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lrepayment/RepayContract$VMEvent$ShowRepaySuccessDialog;", "Lrepayment/RepayContract$VMEvent;", "<init>", "()V", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements InterfaceC44007c {
    }
}
