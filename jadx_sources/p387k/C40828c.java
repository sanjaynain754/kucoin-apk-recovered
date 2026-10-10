package p387k;

import android.app.Activity;
import android.hardware.Camera;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes23.dex */
public class C40828c {

    /* JADX INFO: renamed from: a */
    public static volatile int f90697a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b */
    public static volatile int f90698b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public static volatile int f90699c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public static final Object f90700d = new Object();

    /* JADX INFO: renamed from: e */
    public static boolean f90701e;

    /* JADX INFO: renamed from: b */
    public static void m89328b() {
        int i11;
        int i12;
        int numberOfCameras;
        int i13 = 0;
        int i14 = -1;
        try {
            numberOfCameras = Camera.getNumberOfCameras();
            i12 = -1;
            i11 = -1;
            while (i13 < numberOfCameras) {
                try {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i13, cameraInfo);
                    int i15 = cameraInfo.facing;
                    if (i15 == 1 && i12 == -1) {
                        i12 = i13;
                    } else if (i15 == 0 && i11 == -1) {
                        i11 = i13;
                    }
                    i13++;
                } catch (Exception unused) {
                    i13 = numberOfCameras;
                    i14 = i12;
                    numberOfCameras = i13;
                    i12 = i14;
                    f90698b = i12;
                    f90699c = i11;
                    f90697a = numberOfCameras;
                }
            }
        } catch (Exception unused2) {
            i11 = -1;
        }
        f90698b = i12;
        f90699c = i11;
        f90697a = numberOfCameras;
    }

    /* JADX INFO: renamed from: c */
    public static void m89329c() {
        if (f90697a != Integer.MIN_VALUE) {
            return;
        }
        m89328b();
    }

    /* JADX INFO: renamed from: h */
    public static Camera.CameraInfo m89334h(int i11) {
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i11, cameraInfo);
                return cameraInfo;
            } catch (Exception unused) {
                return cameraInfo;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m89335i() {
        synchronized (f90700d) {
            try {
                if (f90701e) {
                    return;
                }
                f90701e = true;
                new Thread(new Runnable() { // from class: k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C40828c.m89328b();
                    }
                }, "CameraUtils-preload").start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m89330d() {
        m89329c();
        return f90699c;
    }

    /* JADX INFO: renamed from: e */
    public static int m89331e(int i11, Activity activity) {
        int i12;
        Camera.CameraInfo cameraInfoM89334h = m89334h(i11);
        if (cameraInfoM89334h == null) {
            return -1;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i13 = 0;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        i13 = 270;
                    }
                } else {
                    i13 = 180;
                }
            } else {
                i13 = 90;
            }
        }
        int i14 = cameraInfoM89334h.facing;
        int i15 = cameraInfoM89334h.orientation;
        if (i14 == 1) {
            i12 = 360 - ((i15 + i13) % TXVodDownloadDataSource.QUALITY_360P);
        } else {
            i12 = (i15 - i13) + TXVodDownloadDataSource.QUALITY_360P;
        }
        return i12 % TXVodDownloadDataSource.QUALITY_360P;
    }

    /* JADX INFO: renamed from: f */
    public static int m89332f() {
        m89329c();
        return f90698b;
    }

    /* JADX INFO: renamed from: g */
    public static int m89333g() {
        m89329c();
        return f90697a;
    }
}
