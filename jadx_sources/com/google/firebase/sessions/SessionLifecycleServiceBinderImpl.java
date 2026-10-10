package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.kubi.sdk.aspect.ConnectionTrackerAspect;
import com.tencent.qcloud.tuicore.TUIConstants;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.AbstractC43178a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;)V", "bindToService", "", TUIConstants.TUIChat.CALL_BACK, "Landroid/os/Messenger;", "serviceConnection", "Landroid/content/ServiceConnection;", "unbindServiceSafely", "", "appContext", "Landroid/content/Context;", "Companion", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {

    @NotNull
    private static final Companion Companion;

    @Deprecated
    @NotNull
    public static final String TAG = "LifecycleServiceBinder";
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;

    @NotNull
    private final FirebaseApp firebaseApp;

    /* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
    public class AjcClosure1 extends AbstractC43178a {
        @Override // org.aspectj.runtime.internal.AbstractC43178a
        public Object run(Object[] objArr) {
            Object[] objArr2 = this.state;
            SessionLifecycleServiceBinderImpl.bindToService_aroundBody0((SessionLifecycleServiceBinderImpl) objArr2[0], (Messenger) objArr2[1], (ServiceConnection) objArr2[2], (InterfaceC43175a) objArr2[3]);
            return null;
        }

        public AjcClosure1(Object[] objArr) {
            super(objArr);
        }
    }

    /* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m90084d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl$Companion;", "", "()V", "TAG", "", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SessionLifecycleServiceBinderImpl(@NotNull FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        this.firebaseApp = firebaseApp;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("SessionLifecycleServiceBinder.kt", SessionLifecycleServiceBinderImpl.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("1", "bindToService", "com.google.firebase.sessions.SessionLifecycleServiceBinderImpl", "android.os.Messenger:android.content.ServiceConnection", "callback:serviceConnection", "", "void"), 0);
    }

    public static final /* synthetic */ void bindToService_aroundBody0(SessionLifecycleServiceBinderImpl sessionLifecycleServiceBinderImpl, Messenger callback, ServiceConnection serviceConnection, InterfaceC43175a interfaceC43175a) {
        boolean zBindService;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        Context applicationContext = sessionLifecycleServiceBinderImpl.firebaseApp.getApplicationContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d(TAG, "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e11) {
            Log.w(TAG, "Failed to bind session lifecycle service to application.", e11);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        sessionLifecycleServiceBinderImpl.unbindServiceSafely(applicationContext, serviceConnection);
        Log.i(TAG, "Session lifecycle service binding failed.");
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(@NotNull Messenger callback, @NotNull ServiceConnection serviceConnection) throws Throwable {
        ConnectionTrackerAspect.m56526b().m56527c(new AjcClosure1(new Object[]{this, callback, serviceConnection, C36686b.m82124d(ajc$tjp_0, this, this, callback, serviceConnection)}).linkClosureAndJoinPoint(69648));
    }

    static {
        ajc$preClinit();
        Companion = new Companion(null);
    }

    private final Object unbindServiceSafely(Context appContext, ServiceConnection serviceConnection) {
        try {
            appContext.unbindService(serviceConnection);
            return Unit.INSTANCE;
        } catch (IllegalArgumentException e11) {
            return Integer.valueOf(Log.w(TAG, "Session lifecycle service binding failed.", e11));
        }
    }
}
