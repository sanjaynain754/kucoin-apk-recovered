package com.kubi.mvi.state;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus;", "", "()V", "Companion", "Empty", "Error", "Fail", "IDLE", "Loading", "Success", "Lcom/kubi/mvi/state/MVIStatus$Empty;", "Lcom/kubi/mvi/state/MVIStatus$Error;", "Lcom/kubi/mvi/state/MVIStatus$Fail;", "Lcom/kubi/mvi/state/MVIStatus$IDLE;", "Lcom/kubi/mvi/state/MVIStatus$Loading;", "Lcom/kubi/mvi/state/MVIStatus$Success;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class MVIStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Status.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$Companion;", "", "()V", "empty", "Lcom/kubi/mvi/state/MVIStatus;", "isEmpty", "", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MVIStatus empty(boolean isEmpty) {
            return isEmpty ? Empty.INSTANCE : Success.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Status.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$Empty;", "Lcom/kubi/mvi/state/MVIStatus;", "()V", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Empty extends MVIStatus {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Status.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$Error;", "Lcom/kubi/mvi/state/MVIStatus;", "()V", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Error extends MVIStatus {

        @NotNull
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Status.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$Fail;", "Lcom/kubi/mvi/state/MVIStatus;", "()V", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Fail extends MVIStatus {

        @NotNull
        public static final Fail INSTANCE = new Fail();

        private Fail() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Status.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$IDLE;", "Lcom/kubi/mvi/state/MVIStatus;", "()V", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class IDLE extends MVIStatus {

        @NotNull
        public static final IDLE INSTANCE = new IDLE();

        private IDLE() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Status.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$Loading;", "Lcom/kubi/mvi/state/MVIStatus;", "()V", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Loading extends MVIStatus {

        @NotNull
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: Status.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m90084d2 = {"Lcom/kubi/mvi/state/MVIStatus$Success;", "Lcom/kubi/mvi/state/MVIStatus;", "()V", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class Success extends MVIStatus {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ MVIStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MVIStatus() {
    }
}
