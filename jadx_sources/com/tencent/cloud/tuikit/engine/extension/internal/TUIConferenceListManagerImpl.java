package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class TUIConferenceListManagerImpl extends TUIConferenceListManager {
    private TUIConferenceListManagerJni mConferenceListManagerJni;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    private void runOnMainThread(Runnable runnable) {
        if (this.mMainHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mMainHandler.post(runnable);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void addAttendeesByAdmin(final String str, final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f72833b.mConferenceListManagerJni.addAttendeesByAdmin(str, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void addObserver(final TUIConferenceListManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f72791b.mConferenceListManagerJni.addObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void cancelConference(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f72806b.mConferenceListManagerJni.cancelConference(str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void fetchAttendeeList(final String str, final String str2, final int i11, final TUIConferenceListManager.FetchScheduledAttendeesCallback fetchScheduledAttendeesCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f72782b.mConferenceListManagerJni.fetchAttendeeList(str, str2, i11, fetchScheduledAttendeesCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void fetchConferenceInfo(final String str, final TUIConferenceListManager.FetchConferenceInfoCallback fetchConferenceInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f72852b.mConferenceListManagerJni.fetchConferenceInfo(str, fetchConferenceInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void fetchScheduledConferenceList(final List<TUIConferenceListManager.ConferenceStatus> list, final String str, final int i11, final TUIConferenceListManager.FetchScheduledConferenceListCallback fetchScheduledConferenceListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f72765b.mConferenceListManagerJni.fetchScheduledConferenceList(list, str, i11, fetchScheduledConferenceListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void removeAttendeesByAdmin(final String str, final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f72842b.mConferenceListManagerJni.removeAttendeesByAdmin(str, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void removeObserver(final TUIConferenceListManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f72775b.mConferenceListManagerJni.removeObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void scheduleConference(final TUIConferenceListManager.ConferenceInfo conferenceInfo, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f72814b.mConferenceListManagerJni.scheduleConference(conferenceInfo, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void transferConferenceOwner(final String str, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f72822b.mConferenceListManagerJni.transferConferenceOwner(str, str2, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager
    public void updateConferenceInfo(final TUIConferenceListManager.ConferenceInfo conferenceInfo, final List<TUIConferenceListManager.ConferenceModifyFlag> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f72859b.mConferenceListManagerJni.updateConferenceInfo(conferenceInfo, list, actionCallback);
            }
        });
    }

    public TUIConferenceListManagerImpl(final long j11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                TUIConferenceListManagerImpl.m75639a(this.f72797b, j11);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75639a(TUIConferenceListManagerImpl tUIConferenceListManagerImpl, long j11) {
        tUIConferenceListManagerImpl.getClass();
        tUIConferenceListManagerImpl.mConferenceListManagerJni = new TUIConferenceListManagerJni(j11);
    }
}
