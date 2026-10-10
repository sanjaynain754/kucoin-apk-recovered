package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.C5760c;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p333i6.C38442a;
import p357j3.C40258g;
import p464n6.C42757a;
import p618s6.InterfaceC44356a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteServiceWrapper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001f\u0018 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d¨\u0006!"}, m90084d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper;", "", "<init>", "()V", "", "b", "()Z", "", "applicationId", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "e", "(Ljava/lang/String;)Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "Lcom/facebook/appevents/AppEvent;", "appEvents", "c", "(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "eventType", "d", "(Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;Ljava/lang/String;Ljava/util/List;)Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/Boolean;", "isServiceAvailable", "EventType", "ServiceResult", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class RemoteServiceWrapper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RemoteServiceWrapper f8014a = new RemoteServiceWrapper();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Boolean isServiceAvailable;

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        @NotNull
        private final String eventType;

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.eventType;
        }

        EventType(String str) {
            this.eventType = str;
        }
    }

    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$a */
    /* JADX INFO: compiled from: RemoteServiceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$a;", "Landroid/content/ServiceConnection;", "<init>", "()V", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "serviceBinder", "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onNullBinding", "(Landroid/content/ComponentName;)V", "onServiceDisconnected", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Landroid/os/IBinder;", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "latch", "c", "Landroid/os/IBinder;", "binder", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ServiceConnectionC5542a implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final CountDownLatch latch = new CountDownLatch(1);

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public IBinder binder;

        @Nullable
        /* JADX INFO: renamed from: a */
        public final IBinder m8335a() throws InterruptedException {
            this.latch.await(5L, TimeUnit.SECONDS);
            return this.binder;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.binder = serviceBinder;
            this.latch.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m8328b() {
        if (C42757a.m93689d(RemoteServiceWrapper.class)) {
            return false;
        }
        try {
            if (isServiceAvailable == null) {
                isServiceAvailable = Boolean.valueOf(f8014a.m8331a(C5501a.m7799m()) != null);
            }
            Boolean bool = isServiceAvailable;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, RemoteServiceWrapper.class);
            return false;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ServiceResult m8329c(@NotNull String applicationId, @NotNull List<AppEvent> appEvents) {
        if (C42757a.m93689d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f8014a.m8332d(EventType.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, RemoteServiceWrapper.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final ServiceResult m8330e(@NotNull String applicationId) {
        if (C42757a.m93689d(RemoteServiceWrapper.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return f8014a.m8332d(EventType.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
        } catch (Throwable th2) {
            C42757a.m93687b(th2, RemoteServiceWrapper.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Intent m8331a(Context context) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C38442a.m86707a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null && C38442a.m86707a(context, "com.facebook.wakizashi")) {
                    return intent2;
                }
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final ServiceResult m8332d(EventType eventType, String applicationId, List<AppEvent> appEvents) {
        ServiceResult serviceResult;
        String str;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ServiceResult serviceResult2 = ServiceResult.SERVICE_NOT_AVAILABLE;
            C40258g.m88607b();
            Context contextM7799m = C5501a.m7799m();
            Intent intentM8331a = m8331a(contextM7799m);
            if (intentM8331a == null) {
                return serviceResult2;
            }
            ServiceConnectionC5542a serviceConnectionC5542a = new ServiceConnectionC5542a();
            try {
                if (!contextM7799m.bindService(intentM8331a, serviceConnectionC5542a, 1)) {
                    return ServiceResult.SERVICE_ERROR;
                }
                try {
                    IBinder iBinderM8335a = serviceConnectionC5542a.m8335a();
                    if (iBinderM8335a != null) {
                        InterfaceC44356a interfaceC44356aM97851b = InterfaceC44356a.a.m97851b(iBinderM8335a);
                        Bundle bundleM8344a = C5544b.m8344a(eventType, applicationId, appEvents);
                        if (bundleM8344a != null) {
                            interfaceC44356aM97851b.mo97850a(bundleM8344a);
                            C5760c.m10065e0(TAG, "Successfully sent events to the remote service: " + bundleM8344a);
                        }
                        serviceResult2 = ServiceResult.OPERATION_SUCCESS;
                    }
                    return serviceResult2;
                } catch (RemoteException e11) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str = TAG;
                    C5760c.m10063d0(str, e11);
                    contextM7799m.unbindService(serviceConnectionC5542a);
                    C5760c.m10065e0(str, "Unbound from the remote service");
                    return serviceResult;
                } catch (InterruptedException e12) {
                    serviceResult = ServiceResult.SERVICE_ERROR;
                    str = TAG;
                    C5760c.m10063d0(str, e12);
                    contextM7799m.unbindService(serviceConnectionC5542a);
                    C5760c.m10065e0(str, "Unbound from the remote service");
                    return serviceResult;
                }
            } finally {
                contextM7799m.unbindService(serviceConnectionC5542a);
                C5760c.m10065e0(TAG, "Unbound from the remote service");
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
