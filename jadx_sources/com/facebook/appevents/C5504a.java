package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C5501a;
import com.facebook.appevents.C5504a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p357j3.C40258g;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: com.facebook.appevents.a */
/* JADX INFO: compiled from: AnalyticsUserIDStore.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/appevents/a;", "", "<init>", "()V", "", "e", "", "id", "g", "(Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "d", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "userID", "", "Z", "initialized", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5504a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5504a f7684a = new C5504a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5504a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String userID;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static volatile boolean initialized;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m7902c() {
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            f7684a.m7907d();
        }
        lock.readLock().lock();
        try {
            return userID;
        } finally {
            lock.readLock().unlock();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m7903e() {
        if (initialized) {
            return;
        }
        InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new Runnable() { // from class: a3.b
            @Override // java.lang.Runnable
            public final void run() {
                C5504a.m7904f();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m7904f() {
        f7684a.m7907d();
    }

    /* JADX INFO: renamed from: h */
    public static final void m7906h(String str) {
        lock.writeLock().lock();
        try {
            userID = str;
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m()).edit();
            editorEdit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", userID);
            editorEdit.apply();
        } finally {
            lock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7907d() {
        if (initialized) {
            return;
        }
        lock.writeLock().lock();
        try {
            if (!initialized) {
                userID = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                initialized = true;
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7905g(@Nullable final String id2) {
        C40258g.m88607b();
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            f7684a.m7907d();
        }
        InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new Runnable() { // from class: a3.a
            @Override // java.lang.Runnable
            public final void run() {
                C5504a.m7906h(id2);
            }
        });
    }
}
