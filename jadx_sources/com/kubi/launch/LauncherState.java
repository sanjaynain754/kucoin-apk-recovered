package com.kubi.launch;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.launch.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LauncherStatus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/launch/LauncherState;", "", "<init>", "()V", "privacyState", "", "getPrivacyState", "()I", "setPrivacyState", "(I)V", "startState", "getStartState", "setStartState", "value", "animationState", "getAnimationState", "jumpState", "getJumpState", "setJumpState", "updateAnimationState", "", "newState", "toString", "", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LauncherState {

    /* JADX INFO: renamed from: a */
    public int f31813a;

    /* JADX INFO: renamed from: b */
    public int f31814b;

    /* JADX INFO: renamed from: c */
    public int f31815c;

    /* JADX INFO: renamed from: d */
    public int f31816d;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF31815c() {
        return this.f31815c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF31816d() {
        return this.f31816d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF31813a() {
        return this.f31813a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF31814b() {
        return this.f31814b;
    }

    /* JADX INFO: renamed from: e */
    public final void m37504e(int i11) {
        this.f31816d = i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m37505f(int i11) {
        this.f31813a = i11;
    }

    /* JADX INFO: renamed from: g */
    public final void m37506g(int i11) {
        this.f31814b = i11;
    }

    /* JADX INFO: renamed from: h */
    public final void m37507h(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 < 1000) {
            if (i11 > 100) {
                int i16 = this.f31815c;
                i13 = (i16 / 1000) * 1000;
                i14 = i16 % 100;
            } else if (i11 > 10) {
                int i17 = this.f31815c;
                i13 = (i17 / 100) * 100;
                i14 = i17 % 10;
            } else {
                i12 = (this.f31815c / 10) * 10;
            }
            i15 = i13 + i14 + i11;
            this.f31815c = i15;
            C44128b.m97266j("SplashActivity", "update " + this);
        }
        i12 = this.f31815c % 1000;
        i15 = i12 + i11;
        this.f31815c = i15;
        C44128b.m97266j("SplashActivity", "update " + this);
    }

    @NotNull
    public String toString() {
        return "LauncherState[privacy=" + this.f31813a + " start=" + this.f31814b + " anime=" + this.f31815c + " jump=" + this.f31816d + ']';
    }
}
