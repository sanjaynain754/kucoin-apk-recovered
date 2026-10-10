package com.sumsub.sns.internal.core.domain.facedetector;

import android.content.Context;
import android.os.Build;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.random.Random;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28560f {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC28561g m69420a() {
        return new C28562h();
    }

    /* JADX INFO: renamed from: b */
    public static C28558d m69423b(final Context context) {
        String lowerCase;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        boolean zM71434a = C33048a.f67473f.m71434a();
        boolean zM71434a2 = C33048a.f67474g.m71434a();
        Random.INSTANCE.nextLong(-100L, 100L);
        if (context != null) {
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("FaceDetectorFactory", "@isTensorflowDisabled, Checking is TF disabled", null);
            if (!zM71434a2) {
                c33270a.f67810a.mo68955d("FaceDetectorFactory", "@isTensorflowDisabled, disabled with FF", null);
            } else if (Build.VERSION.SDK_INT < 26) {
                c33270a.f67810a.mo68955d("FaceDetectorFactory", "@isTensorflowDisabled, old Android version", null);
            } else {
                try {
                    System.loadLibrary("tensorflowlite_jni");
                    c33270a.f67810a.mo68955d("FaceDetectorFactory", "@isTensorflowDisabled, TF library found", null);
                    m69421a(linkedBlockingQueue, "TensorFlow", new Function0() { // from class: com.sumsub.sns.internal.core.domain.facedetector.s
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC28560f.m69425c(context);
                        }
                    });
                } catch (Throwable unused) {
                    C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "@isTensorflowDisabled, TF library is missing", null);
                }
            }
        }
        C33270a c33270a2 = C33272c.f67816e;
        c33270a2.f67810a.mo68955d("FaceDetectorFactory", "@isMlKitDisabled, Checking is MLKit disabled", null);
        if (zM71434a) {
            String str = Build.MANUFACTURER;
            if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null && StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) JPushConstants.Manufacturer.HUAWEI, false, 2, (Object) null)) {
                c33270a2.f67810a.mo68955d("FaceDetectorFactory", "@isMlKitDisabled, disabled - manufacturer is Huawei", null);
            } else if (m69422a(context)) {
                try {
                    Class.forName("com.google.mlkit.vision.face.FaceDetection");
                    c33270a2.f67810a.mo68955d("FaceDetectorFactory", "MLKit class found", null);
                    m69421a(linkedBlockingQueue, "MLKit", new Function0() { // from class: com.sumsub.sns.internal.core.domain.facedetector.t
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC28560f.m69420a();
                        }
                    });
                } catch (Throwable th2) {
                    C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "Can't use MLKit detector", th2);
                }
            } else {
                c33270a2.f67810a.mo68955d("FaceDetectorFactory", "@isMlKitDisabled, disabled - no connection to GP Services", null);
            }
        } else {
            c33270a2.f67810a.mo68955d("FaceDetectorFactory", "@isMlKitDisabled, disabled with FF", null);
        }
        m69421a(linkedBlockingQueue, "Native", new Function0() { // from class: com.sumsub.sns.internal.core.domain.facedetector.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC28560f.m69424b();
            }
        });
        return new C28558d(linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m69422a(Context context) {
        if (context == null) {
            C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "@isGooglePlayServicesAvailable, Context is null", null);
            return false;
        }
        try {
            boolean z11 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
            C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "@isGooglePlayServicesAvailable, Has connection to GP Services: " + z11, null);
            return z11;
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "@isGooglePlayServicesAvailable, Failed to check GP Services", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC28561g m69425c(Context context) {
        return new C28572r(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: a */
    public static void m69421a(LinkedBlockingQueue linkedBlockingQueue, String str, Function0 function0) {
        try {
            linkedBlockingQueue.offer(function0.invoke());
            C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "Using " + str + " Face detector", null);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("FaceDetectorFactory", "Can't use " + str + " detector", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC28561g m69424b() {
        return new C28563i();
    }
}
