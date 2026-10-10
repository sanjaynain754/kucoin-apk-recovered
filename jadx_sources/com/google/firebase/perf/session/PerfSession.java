package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.p070v1.SessionVerbosity;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new Parcelable.Creator<PerfSession>() { // from class: com.google.firebase.perf.session.PerfSession.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PerfSession[] newArray(int i11) {
            return new PerfSession[i11];
        }
    };
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isVerbose() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    @VisibleForTesting(otherwise = 3)
    public PerfSession(String str, Clock clock) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = str;
        this.creationTime = clock.getTime();
    }

    public static PerfSession createWithId(@NonNull String str) {
        PerfSession perfSession = new PerfSession(str.replace(C33820nf.f71144W, ""), new Clock());
        perfSession.setGaugeAndEventCollectionEnabled(shouldCollectGaugesAndEvents());
        return perfSession;
    }

    @VisibleForTesting
    public static boolean isVerbose(@NonNull com.google.firebase.perf.p070v1.PerfSession perfSession) {
        Iterator<SessionVerbosity> it = perfSession.getSessionVerbosityList().iterator();
        while (it.hasNext()) {
            if (it.next() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    public Timer getTimer() {
        return this.creationTime;
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public boolean isSessionRunningTooLong() {
        return TimeUnit.MICROSECONDS.toMinutes(this.creationTime.getDurationMicros()) > ConfigResolver.getInstance().getSessionsMaxDurationMinutes();
    }

    public String sessionId() {
        return this.sessionId;
    }

    public void setGaugeAndEventCollectionEnabled(boolean z11) {
        this.isGaugeAndEventCollectionEnabled = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeString(this.sessionId);
        parcel.writeByte(this.isGaugeAndEventCollectionEnabled ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.creationTime, 0);
    }

    @Nullable
    public static com.google.firebase.perf.p070v1.PerfSession[] buildAndSort(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.p070v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.p070v1.PerfSession[list.size()];
        com.google.firebase.perf.p070v1.PerfSession perfSessionBuild = list.get(0).build();
        boolean z11 = false;
        for (int i11 = 1; i11 < list.size(); i11++) {
            com.google.firebase.perf.p070v1.PerfSession perfSessionBuild2 = list.get(i11).build();
            if (!z11 && list.get(i11).isVerbose()) {
                perfSessionArr[0] = perfSessionBuild2;
                perfSessionArr[i11] = perfSessionBuild;
                z11 = true;
            } else {
                perfSessionArr[i11] = perfSessionBuild2;
            }
        }
        if (!z11) {
            perfSessionArr[0] = perfSessionBuild;
        }
        return perfSessionArr;
    }

    public static boolean shouldCollectGaugesAndEvents() {
        ConfigResolver configResolver = ConfigResolver.getInstance();
        if (configResolver.isPerformanceMonitoringEnabled() && Math.random() < configResolver.getSessionsSamplingRate()) {
            return true;
        }
        return false;
    }

    public com.google.firebase.perf.p070v1.PerfSession build() {
        com.google.firebase.perf.v1.PerfSession.Builder sessionId = com.google.firebase.perf.p070v1.PerfSession.newBuilder().setSessionId(this.sessionId);
        if (this.isGaugeAndEventCollectionEnabled) {
            sessionId.addSessionVerbosity(SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS);
        }
        return sessionId.build();
    }

    private PerfSession(@NonNull Parcel parcel) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = parcel.readString();
        this.isGaugeAndEventCollectionEnabled = parcel.readByte() != 0;
        this.creationTime = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
