package com.sumsub.sns.internal.util.camera;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.camera.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33398h {

    /* JADX INFO: renamed from: a */
    public final CameraManager f68107a;

    /* JADX INFO: renamed from: b */
    public final Set f68108b = Collections.synchronizedSet(new LinkedHashSet());

    /* JADX INFO: renamed from: a */
    public final void m71691a(Function0 function0) {
        Handler handler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("cam-monitor-thread");
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        String str = (String) ArraysKt.lastOrNull(this.f68107a.getCameraIdList());
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("CameraTrace", "Checking camera " + str, null);
        this.f68108b.clear();
        C33397g c33397g = new C33397g(this, handlerThread, handler, function0);
        try {
            if (str != null) {
                this.f68107a.openCamera(str, c33397g, handler2);
                return;
            }
            c33270a.f67810a.mo68956e("CameraTrace", "Camera ID is null", null);
            handlerThread.quitSafely();
            function0.invoke();
        } catch (SecurityException e11) {
            C33272c.f67816e.f67810a.mo68956e("CameraTrace", "Missing permission", e11);
            handlerThread.quitSafely();
            function0.invoke();
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("CameraTrace", "Error " + th2.getMessage(), th2);
            handlerThread.quitSafely();
            function0.invoke();
        }
    }

    public C33398h(Context context) {
        this.f68107a = (CameraManager) context.getSystemService("camera");
    }

    /* JADX INFO: renamed from: a */
    public final void m71690a() {
        try {
            C33272c.f67816e.f67810a.mo68955d("CameraTrace", "Collecting", null);
            this.f68108b.add(m71689a(new Throwable().getStackTrace()));
            this.f68108b.add(m71689a(Thread.currentThread().getStackTrace()));
            new Throwable().fillInStackTrace();
            this.f68108b.add(m71689a((StackTraceElement[]) Class.forName("dalvik.system.VMStack").getMethod("getThreadStackTrace", Thread.class).invoke(null, Thread.currentThread())));
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e("CameraTrace", "Error while collecting " + th2.getMessage(), th2);
        }
        Logger.DefaultImpls.d$default(C33272c.f67812a, "CameraTrace", "Collected " + this.f68108b, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static String m71689a(StackTraceElement[] stackTraceElementArr) {
        int i11 = -1;
        int length = stackTraceElementArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (StringsKt.contains$default((CharSequence) stackTraceElementArr[length].getClassName(), (CharSequence) "com.sumsub", false, 2, (Object) null)) {
                    i11 = length;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        Integer numValueOf = i11 >= 0 ? Integer.valueOf(i11) : null;
        return CollectionsKt.joinToString$default(ArraysKt.drop(stackTraceElementArr, numValueOf != null ? numValueOf.intValue() : 0), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null);
    }
}
