package com.geetest.captcha.utils;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.geetest.captcha.C6706z;
import com.geetest.captcha.NoProguard;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33557b4;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;

/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0002¨\u0006\u0019"}, m90084d2 = {"Lcom/geetest/captcha/utils/LogUtils;", "Lcom/geetest/captcha/NoProguard;", "", "tag", "msg", "", "log2sd", "", FirebaseAnalytics.Param.LEVEL, "init", "v", "d", "i", "w", "e", "release", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "setReleaseLog", "data", "printLongString", "<init>", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "captcha_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class LogUtils implements NoProguard {

    /* JADX INFO: renamed from: c */
    @Nullable
    public static C6690a f11202c;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LogUtils f11200a = new LogUtils();

    /* JADX INFO: renamed from: b */
    public static int f11201b = 4;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f11203d = "Captcha";

    /* JADX INFO: renamed from: e */
    public static boolean f11204e = true;

    /* JADX INFO: renamed from: com.geetest.captcha.utils.LogUtils$a */
    public static final class C6690a {

        /* JADX INFO: renamed from: c */
        @NotNull
        public static final SimpleDateFormat f11205c;

        /* JADX INFO: renamed from: a */
        @Nullable
        public HandlerThread f11206a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public HandlerC6691a f11207b;

        /* JADX INFO: renamed from: com.geetest.captcha.utils.LogUtils$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public final long f11208a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public final String f11209b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public final String f11210c;

            public b() {
                this(0);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f11208a == bVar.f11208a && Intrinsics.areEqual(this.f11209b, bVar.f11209b) && Intrinsics.areEqual(this.f11210c, bVar.f11210c);
            }

            public /* synthetic */ b(int i11) {
                this(0L, null, null);
            }

            public final int hashCode() {
                int iHashCode = Long.hashCode(this.f11208a) * 31;
                String str = this.f11209b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f11210c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "Item(millis=" + this.f11208a + ", tag=" + this.f11209b + ", message=" + this.f11210c + ')';
            }

            public b(long j11, @Nullable String str, @Nullable String str2) {
                this.f11208a = j11;
                this.f11209b = str;
                this.f11210c = str2;
            }
        }

        /* JADX INFO: renamed from: a */
        public static final void m12565a(C6690a c6690a, String str) {
            c6690a.getClass();
            try {
                File file = new File(C6706z.f11251a + File.separator + "Geetest");
                if (!file.exists()) {
                    file.mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "captcha_log.txt"), true);
                try {
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    fileOutputStream.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m12567b() {
            synchronized (this) {
                try {
                    HandlerC6691a handlerC6691a = this.f11207b;
                    if (handlerC6691a != null) {
                        handlerC6691a.removeCallbacksAndMessages(null);
                    }
                    HandlerThread handlerThread = this.f11206a;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    this.f11206a = null;
                    this.f11207b = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final synchronized void m12568c() {
            try {
                HandlerThread handlerThread = this.f11206a;
                if (handlerThread != null) {
                    Intrinsics.checkNotNull(handlerThread);
                    if (!handlerThread.isAlive()) {
                        HandlerThread handlerThread2 = new HandlerThread("Captcha Thread");
                        handlerThread2.start();
                        this.f11206a = handlerThread2;
                        Intrinsics.checkNotNull(handlerThread2);
                        Looper looper = handlerThread2.getLooper();
                        Intrinsics.checkNotNullExpressionValue(looper, "thread!!.looper");
                        this.f11207b = new HandlerC6691a(looper, this);
                    }
                } else {
                    HandlerThread handlerThread3 = new HandlerThread("Captcha Thread");
                    handlerThread3.start();
                    this.f11206a = handlerThread3;
                    Intrinsics.checkNotNull(handlerThread3);
                    Looper looper2 = handlerThread3.getLooper();
                    Intrinsics.checkNotNullExpressionValue(looper2, "thread!!.looper");
                    this.f11207b = new HandlerC6691a(looper2, this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        static {
            new a();
            f11205c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        }

        public C6690a() {
            m12568c();
        }

        /* JADX INFO: renamed from: com.geetest.captcha.utils.LogUtils$a$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static final String m12569a(SimpleDateFormat simpleDateFormat, long j11, String str, String str2) {
                SimpleDateFormat simpleDateFormat2 = C6690a.f11205c;
                String str3 = simpleDateFormat.format(new Date(j11)) + '\t' + str + '\n' + str2 + '\n';
                Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply {\n…             }.toString()");
                return str3;
            }

            /* JADX INFO: renamed from: a */
            public static final void m12570a() {
                SimpleDateFormat simpleDateFormat = C6690a.f11205c;
                File file = new File(new File(C6706z.f11251a + File.separator + "Geetest"), "captcha_log.txt");
                if (!file.exists() || file.length() < C33557b4.f69134v) {
                    return;
                }
                file.delete();
            }
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m12566a() {
            Message messageObtainMessage;
            HandlerC6691a handlerC6691a = this.f11207b;
            if (handlerC6691a != null && (messageObtainMessage = handlerC6691a.obtainMessage(1)) != null) {
                m12568c();
                HandlerC6691a handlerC6691a2 = this.f11207b;
                if (handlerC6691a2 != null) {
                    handlerC6691a2.sendMessage(messageObtainMessage);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12555d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 2) {
            Log.d(f11203d, msg);
            log2sd(f11203d, msg);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12557e(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 5) {
            Log.e(f11203d, msg);
            log2sd(f11203d, msg);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12559i(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 3) {
            Log.i(f11203d, msg);
            log2sd(f11203d, msg);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m12561v(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 1) {
            Log.v(f11203d, msg);
            log2sd(f11203d, msg);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m12563w(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 4) {
            Log.w(f11203d, msg);
            log2sd(f11203d, msg);
        }
    }

    private final void log2sd(String tag, String msg) {
        Message messageObtainMessage;
        if (f11202c == null) {
            C6690a c6690a = new C6690a();
            f11202c = c6690a;
            c6690a.m12566a();
        }
        C6690a c6690a2 = f11202c;
        if (c6690a2 != null) {
            synchronized (c6690a2) {
                HandlerC6691a handlerC6691a = c6690a2.f11207b;
                if (handlerC6691a != null && (messageObtainMessage = handlerC6691a.obtainMessage(0)) != null) {
                    messageObtainMessage.obj = new C6690a.b(System.currentTimeMillis(), tag, msg);
                    c6690a2.m12568c();
                    HandlerC6691a handlerC6691a2 = c6690a2.f11207b;
                    if (handlerC6691a2 != null) {
                        handlerC6691a2.sendMessage(messageObtainMessage);
                    }
                }
            }
        }
    }

    public final void destroy() {
        try {
            C6690a c6690a = f11202c;
            if (c6690a != null) {
                c6690a.m12567b();
            }
            f11202c = null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void printLongString(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int length = data.length();
        if (length <= 3800) {
            Log.e(f11203d, data);
            return;
        }
        int i11 = 0;
        while (length - i11 > 3800) {
            String strSubstring = data.substring(i11, 3800);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Log.e(f11203d, strSubstring);
            i11 += 3800;
        }
        String str = f11203d;
        String strSubstring2 = data.substring(i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        Log.e(str, strSubstring2);
    }

    public final void release(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11204e) {
            Log.i(f11203d, msg);
        }
        log2sd(f11203d, msg);
    }

    public final void setReleaseLog(boolean enable) {
        f11204e = enable;
        f11201b = enable ? 1 : 9999;
    }

    private LogUtils() {
    }

    public final void init(int level, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        f11201b = level;
        f11203d = tag;
    }

    /* JADX INFO: renamed from: d */
    public final void m12556d(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 2) {
            Log.d(tag, msg);
            log2sd(tag, msg);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12558e(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 5) {
            Log.e(tag, msg);
            log2sd(tag, msg);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12560i(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 3) {
            Log.i(tag, msg);
            log2sd(tag, msg);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m12562v(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 1) {
            Log.v(tag, msg);
            log2sd(tag, msg);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m12564w(@Nullable String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (f11201b <= 4) {
            Log.w(tag, msg);
            log2sd(tag, msg);
        }
    }
}
