package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class TUIConferenceInvitationManagerImpl extends TUIConferenceInvitationManager {
    private TUIConferenceInvitationManagerJni mConferenceListManagerJni;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    private void runOnMainThread(Runnable runnable) {
        if (this.mMainHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mMainHandler.post(runnable);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void accept(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f72711b.mConferenceListManagerJni.accept(str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void addObserver(final TUIConferenceInvitationManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f72747b.mConferenceListManagerJni.addObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void cancelInvitation(final String str, final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f72687b.mConferenceListManagerJni.cancelInvitation(str, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void getInvitationList(final String str, final String str2, final int i11, final TUIConferenceInvitationManager.GetInvitationListCallback getInvitationListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f72735b.mConferenceListManagerJni.getInvitationList(str, str2, i11, getInvitationListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void inviteUsers(final String str, final List<String> list, final int i11, final String str2, final TUIConferenceInvitationManager.InviteUsersCallback inviteUsersCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f72724b.mConferenceListManagerJni.inviteUsers(str, list, i11, str2, inviteUsersCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void reject(final String str, final TUIConferenceInvitationManager.RejectedReason rejectedReason, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f72756b.mConferenceListManagerJni.reject(str, rejectedReason, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager
    public void removeObserver(final TUIConferenceInvitationManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f72699b.mConferenceListManagerJni.removeObserver(observer);
            }
        });
    }

    public TUIConferenceInvitationManagerImpl(final long j11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                TUIConferenceInvitationManagerImpl.m75633c(this.f72717b, j11);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m75633c(TUIConferenceInvitationManagerImpl tUIConferenceInvitationManagerImpl, long j11) {
        tUIConferenceInvitationManagerImpl.getClass();
        tUIConferenceInvitationManagerImpl.mConferenceListManagerJni = new TUIConferenceInvitationManagerJni(j11);
    }
}
