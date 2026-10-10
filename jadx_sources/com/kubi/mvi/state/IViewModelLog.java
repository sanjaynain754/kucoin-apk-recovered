package com.kubi.mvi.state;

import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.common.MVILogSwitchManager;
import com.kubi.mvi.common.MviExKt;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IViewModelLog.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/mvi/state/IViewModelLog;", "", "", "debugLog", "()Z", "isDebug", "", "getBiz", "()Ljava/lang/String;", Constants.BIZ, "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public interface IViewModelLog {

    /* JADX INFO: compiled from: IViewModelLog.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static boolean m42548a(IViewModelLog iViewModelLog) {
            return MVILogSwitchManager.f35617a.m42501b(iViewModelLog.getBiz());
        }

        /* JADX INFO: renamed from: b */
        public static void m42549b(@NotNull final IViewModelLog iViewModelLog, @NotNull final String receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            MviExKt.m42509e(m42548a(iViewModelLog), new Function0<Unit>() { // from class: com.kubi.mvi.state.IViewModelLog$logData$1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C19243e.m42535d(receiver, iViewModelLog.getBiz());
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static void m42550c(@NotNull final IViewModelLog iViewModelLog, @NotNull final String receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            MviExKt.m42509e(m42548a(iViewModelLog), new Function0<Unit>() { // from class: com.kubi.mvi.state.IViewModelLog$logIntent$1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C19243e.m42537f(receiver, iViewModelLog.getBiz());
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public static void m42551d(@NotNull final IViewModelLog iViewModelLog, @NotNull final String receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            MviExKt.m42509e(m42548a(iViewModelLog), new Function0<Unit>() { // from class: com.kubi.mvi.state.IViewModelLog$logState$1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    C19243e.m42540i(receiver, iViewModelLog.getBiz());
                }
            });
        }
    }

    @NotNull
    String getBiz();
}
