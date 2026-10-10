package com.kubi.agora;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import android.view.Surface;
import com.google.firebase.messaging.Constants;
import com.kubi.widget.web.service.IKWebService;
import com.kubi.widget.web.ui.KWebContainer;
import com.tencent.bugly.library.MonitorCallback;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.ByteArrayOutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.agora.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AgoraShareScreenManager.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001PB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u000106J\b\u0010:\u001a\u0004\u0018\u000106J\u0006\u0010;\u001a\u000208J\u001e\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tJ\r\u0010@\u001a\u00020\u0007H\u0000¢\u0006\u0002\bAJ\u0006\u0010B\u001a\u000208J\b\u0010C\u001a\u000208H\u0002J\u0006\u0010D\u001a\u000208J\u0006\u0010E\u001a\u000208J\u0006\u0010F\u001a\u000208J\u0010\u0010G\u001a\u0002082\b\u0010#\u001a\u0004\u0018\u00010$J!\u0010H\u001a\u0002082\b\u0010I\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u0004\u0018\u00010\u0005J\u0012\u0010M\u001a\u0004\u0018\u00010\u00052\u0006\u0010N\u001a\u00020OH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u001f\u001a\u0004\u0018\u00010(@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000106\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, m90084d2 = {"Lcom/kubi/agora/AgoraShareScreenManager;", "", "<init>", "()V", "TAG", "", "captureSpec", "Lcom/kubi/agora/CaptureSpec;", "IMAGE_READER_MAX_IMAGES", "", "SCREEN_SHARE_EVENT_NAME_START", "SCREEN_SHARE_EVENT_NAME_END", "SCREEN_SHARE_EVENT_NAME_FORBID", "SCREEN_SHARE_EVENT_NAME_SEND_DATA", "PARAMS_BASE_64", "PARAMS_WIDTH", "PARAMS_HEIGHT", "PARAMS_FPS", "PARAMS_BASE_ERROR", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "screenCaptureHelper", "Lcom/kubi/agora/ScreenCaptureHelper;", "getScreenCaptureHelper", "()Lcom/kubi/agora/ScreenCaptureHelper;", "setScreenCaptureHelper", "(Lcom/kubi/agora/ScreenCaptureHelper;)V", "value", "", "isCapturingFrames", "()Z", "captureRunnable", "Ljava/lang/Runnable;", "encodeThread", "Landroid/os/HandlerThread;", "encodeHandler", "Landroid/media/ImageReader;", "imageReader", "getImageReader", "()Landroid/media/ImageReader;", "imageReaderSpec", "isEncoding", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStopping", "reusableBitmap", "Landroid/graphics/Bitmap;", "reusableOutputStream", "Lcom/kubi/agora/AgoraShareScreenManager$ExposedByteArrayOutputStream;", "webViewRef", "Ljava/lang/ref/SoftReference;", "Lcom/kubi/widget/web/ui/KWebContainer;", "setWebView", "", "wv", "getWebView", "clearWebView", "updateCaptureSpec", "width", "height", "densityDpi", "getCaptureSpec", "getCaptureSpec$AgoraLib_googleRelease", "initScreenCaptureHelper", "startFrameCapture", "stopFrameCapture", "tryInitImageReader", "tryInit", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "postRunnable", "runnable", "delayMillis", "", "(Ljava/lang/Runnable;Ljava/lang/Long;)V", "processFrame", "image", "Landroid/media/Image;", "ExposedByteArrayOutputStream", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAgoraShareScreenManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgoraShareScreenManager.kt\ncom/kubi/agora/AgoraShareScreenManager\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,303:1\n90#2,6:304\n*S KotlinDebug\n*F\n+ 1 AgoraShareScreenManager.kt\ncom/kubi/agora/AgoraShareScreenManager\n*L\n270#1:304,6\n*E\n"})
public final class AgoraShareScreenManager {

    /* JADX INFO: renamed from: d */
    @Nullable
    public static ScreenCaptureHelper f15308d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f15309e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static Runnable f15310f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static HandlerThread f15311g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public static Handler f15312h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static ImageReader f15313i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public static CaptureSpec f15314j;

    /* JADX INFO: renamed from: m */
    @Nullable
    public static Bitmap f15317m;

    /* JADX INFO: renamed from: o */
    @Nullable
    public static SoftReference<KWebContainer> f15319o;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AgoraShareScreenManager f15305a = new AgoraShareScreenManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static CaptureSpec f15306b = new CaptureSpec(720, 1280, 320);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static Handler f15307c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final AtomicBoolean f15315k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final AtomicBoolean f15316l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final a f15318n = new a(131072);

    /* JADX INFO: renamed from: com.kubi.agora.g$a */
    /* JADX INFO: compiled from: AgoraShareScreenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/agora/AgoraShareScreenManager$ExposedByteArrayOutputStream;", "Ljava/io/ByteArrayOutputStream;", "size", "", "<init>", "(I)V", "rawBuf", "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ByteArrayOutputStream {
        @Nullable
        /* JADX INFO: renamed from: a */
        public final byte[] m14929a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public a(int i11) {
            super(i11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.agora.g$b */
    /* JADX INFO: compiled from: AgoraShareScreenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/agora/AgoraShareScreenManager$initScreenCaptureHelper$1$1", "Lcom/kubi/agora/ScreenCaptureHelper$ScreenCaptureCallback;", "onCaptureStarted", "", "surface", "Landroid/view/Surface;", "onCaptureStopped", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "AgoraLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements ScreenCaptureHelper.InterfaceC9381a {
        /* JADX INFO: renamed from: f */
        public static final void m14933f() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MonitorCallback.EVENT_FPS, ScreenShareConfig.f15335a.m14956d());
            jSONObject.put("width", AgoraShareScreenManager.f15306b.getWidth());
            jSONObject.put("height", AgoraShareScreenManager.f15306b.getHeight());
            IKWebService iKWebService = IKWebService.f55226a.get();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iKWebService.mo67361i("onScreenShareStart", string);
            AgoraShareScreenManager.f15305a.m14925t();
        }

        /* JADX INFO: renamed from: g */
        public static final void m14934g() {
            IKWebService.f55226a.get().mo67354a("onScreenShareEnd");
            AgoraShareScreenManager.f15305a.m14926w();
        }

        /* JADX INFO: renamed from: h */
        public static final void m14935h(String str) throws JSONException {
            AgoraShareScreenManager.f15305a.m14926w();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
            IKWebService iKWebService = IKWebService.f55226a.get();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iKWebService.mo67361i("onScreenShareForbid", string);
        }

        @Override // com.kubi.agora.ScreenCaptureHelper.InterfaceC9381a
        /* JADX INFO: renamed from: a */
        public void mo14878a(Surface surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            AgoraShareScreenManager.f15305a.m14916j().post(new Runnable() { // from class: com.kubi.agora.h
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    AgoraShareScreenManager.b.m14933f();
                }
            });
        }

        @Override // com.kubi.agora.ScreenCaptureHelper.InterfaceC9381a
        /* JADX INFO: renamed from: b */
        public void mo14879b() {
            AgoraShareScreenManager.f15305a.m14916j().post(new Runnable() { // from class: com.kubi.agora.i
                @Override // java.lang.Runnable
                public final void run() {
                    AgoraShareScreenManager.b.m14934g();
                }
            });
        }

        @Override // com.kubi.agora.ScreenCaptureHelper.InterfaceC9381a
        public void onError(final String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            AgoraShareScreenManager.f15305a.m14916j().post(new Runnable() { // from class: com.kubi.agora.j
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    AgoraShareScreenManager.b.m14935h(error);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007d A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000c, B:10:0x0030, B:14:0x0036, B:17:0x003d, B:19:0x0043, B:21:0x0047, B:28:0x005d, B:30:0x0061, B:32:0x0066, B:34:0x006a, B:38:0x0076, B:40:0x007d, B:43:0x008c, B:44:0x008f, B:37:0x0073, B:24:0x004e, B:26:0x0052, B:27:0x0055), top: B:49:0x0001 }] */
    /* JADX INFO: renamed from: r */
    public final String m14923r(Image image) {
        Bitmap bitmapCreateBitmap;
        boolean z11;
        a aVar;
        Bitmap bitmap;
        try {
            Image.Plane[] planes = image.getPlanes();
            if (planes != null && planes.length != 0) {
                ByteBuffer buffer = planes[0].getBuffer();
                int pixelStride = planes[0].getPixelStride();
                int rowStride = planes[0].getRowStride();
                int width = f15306b.getWidth();
                int height = f15306b.getHeight();
                int i11 = rowStride - (pixelStride * width);
                int i12 = (i11 > 0 ? i11 / pixelStride : 0) + width;
                Bitmap bitmap2 = f15317m;
                if (bitmap2 == null || bitmap2 == null || bitmap2.getWidth() != i12 || (bitmap = f15317m) == null || bitmap.getHeight() != height) {
                    Bitmap bitmap3 = f15317m;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    f15317m = Bitmap.createBitmap(i12, height, Bitmap.Config.ARGB_8888);
                }
                Bitmap bitmap4 = f15317m;
                if (bitmap4 != null) {
                    bitmap4.copyPixelsFromBuffer(buffer);
                }
                if (i12 != width) {
                    Bitmap bitmap5 = f15317m;
                    if (bitmap5 != null) {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmap5, 0, 0, width, height);
                        z11 = true;
                    } else {
                        bitmapCreateBitmap = null;
                    }
                    aVar = f15318n;
                    aVar.reset();
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, ScreenShareConfig.f15335a.m14958f(), aVar);
                    }
                    if (z11 && bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    return Base64.encodeToString(aVar.m14929a(), 0, aVar.size(), 2);
                }
                bitmapCreateBitmap = f15317m;
                z11 = false;
                aVar = f15318n;
                aVar.reset();
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, ScreenShareConfig.f15335a.m14958f(), aVar);
                }
                if (z11) {
                    bitmapCreateBitmap.recycle();
                }
                return Base64.encodeToString(aVar.m14929a(), 0, aVar.size(), 2);
            }
            return null;
        } catch (Exception e11) {
            C44128b.m97262f("AgoraShareScreenManager", "Error processing frame: " + e11.getMessage(), e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14907p(AgoraShareScreenManager agoraShareScreenManager, Runnable runnable, Long l11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        agoraShareScreenManager.m14921o(runnable, l11);
    }

    /* JADX INFO: renamed from: u */
    public static final void m14908u() throws Throwable {
        if (!f15309e || f15313i == null) {
            return;
        }
        AgoraShareScreenManager agoraShareScreenManager = f15305a;
        final String strM14922q = agoraShareScreenManager.m14922q();
        if (strM14922q != null) {
            f15307c.post(new Runnable() { // from class: com.kubi.agora.f
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    AgoraShareScreenManager.m14909v(strM14922q);
                }
            });
        }
        if (f15309e) {
            agoraShareScreenManager.m14921o(f15310f, Long.valueOf(ScreenShareConfig.f15335a.m14957e()));
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m14909v(String str) throws JSONException {
        if (f15309e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("base64", str);
            IKWebService iKWebService = IKWebService.f55226a.get();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iKWebService.mo67361i("onScreenShareDataSend", string);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m14910x() {
        ScreenCaptureHelper screenCaptureHelper = f15308d;
        if (screenCaptureHelper != null) {
            screenCaptureHelper.m14873f();
        }
        f15308d = null;
        f15316l.set(false);
    }

    /* JADX INFO: renamed from: A */
    public final void m14911A(int i11, int i12, int i13) {
        f15306b = new CaptureSpec(RangesKt.coerceAtLeast(i11, 1), RangesKt.coerceAtLeast(i12, 1), RangesKt.coerceAtLeast(i13, 1));
    }

    /* JADX INFO: renamed from: f */
    public final void m14912f() {
        SoftReference<KWebContainer> softReference = f15319o;
        if (softReference != null) {
            softReference.clear();
        }
        f15319o = null;
    }

    /* JADX INFO: renamed from: g */
    public final void m14913g(@Nullable Runnable runnable) {
        Handler handler;
        if (runnable != null && (handler = f15312h) != null) {
            handler.removeCallbacks(runnable);
        }
        Bitmap bitmap = f15317m;
        if (bitmap != null) {
            bitmap.recycle();
        }
        f15317m = null;
        f15315k.set(false);
        HandlerThread handlerThread = f15311g;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        f15311g = null;
        ImageReader imageReader = f15313i;
        if (imageReader != null) {
            imageReader.close();
        }
        f15313i = null;
        f15314j = null;
        m14912f();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final CaptureSpec m14914h() {
        return f15306b;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ImageReader m14915i() {
        return f15313i;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Handler m14916j() {
        return f15307c;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final ScreenCaptureHelper m14917k() {
        return f15308d;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final KWebContainer m14918l() {
        SoftReference<KWebContainer> softReference = f15319o;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m14919m() {
        if (f15308d != null) {
            return;
        }
        ScreenCaptureHelper screenCaptureHelper = new ScreenCaptureHelper();
        screenCaptureHelper.m14874g(new b());
        f15308d = screenCaptureHelper;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m14920n() {
        return f15309e;
    }

    /* JADX INFO: renamed from: o */
    public final void m14921o(@Nullable Runnable runnable, @Nullable Long l11) {
        if (runnable != null) {
            if (l11 != null) {
                Handler handler = f15312h;
                if (handler != null) {
                    handler.postDelayed(runnable, l11.longValue());
                    return;
                }
                return;
            }
            Handler handler2 = f15312h;
            if (handler2 != null) {
                handler2.post(runnable);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m14922q() throws Throwable {
        Image imageAcquireLatestImage;
        AtomicBoolean atomicBoolean = f15315k;
        Image image = null;
        String strM14923r = null;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return null;
        }
        try {
            ImageReader imageReader = f15313i;
            if (imageReader == null) {
                atomicBoolean.set(false);
                return null;
            }
            imageAcquireLatestImage = imageReader.acquireLatestImage();
            if (imageAcquireLatestImage != null) {
                try {
                    try {
                        strM14923r = m14923r(imageAcquireLatestImage);
                    } catch (Exception e11) {
                        e = e11;
                        C44128b.m97261e("AgoraShareScreenManager", "Error acquiring image: " + e.getMessage());
                        if (imageAcquireLatestImage != null) {
                            imageAcquireLatestImage.close();
                        }
                        f15315k.set(false);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    image = imageAcquireLatestImage;
                    if (image != null) {
                        image.close();
                    }
                    f15315k.set(false);
                    throw th;
                }
            }
            if (imageAcquireLatestImage != null) {
                imageAcquireLatestImage.close();
            }
            atomicBoolean.set(false);
            return strM14923r;
        } catch (Exception e12) {
            e = e12;
            imageAcquireLatestImage = null;
        } catch (Throwable th3) {
            th = th3;
            if (image != null) {
                image.close();
            }
            f15315k.set(false);
            throw th;
        }
        C44128b.m97261e("AgoraShareScreenManager", "Error acquiring image: " + e.getMessage());
        if (imageAcquireLatestImage != null) {
            imageAcquireLatestImage.close();
        }
        f15315k.set(false);
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m14924s(@Nullable KWebContainer kWebContainer) {
        f15319o = new SoftReference<>(kWebContainer);
    }

    /* JADX INFO: renamed from: t */
    public final void m14925t() {
        if (f15309e || f15313i == null) {
            return;
        }
        m14927y();
        f15316l.set(false);
        f15309e = true;
        Runnable runnable = new Runnable() { // from class: com.kubi.agora.e
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                AgoraShareScreenManager.m14908u();
            }
        };
        f15310f = runnable;
        m14907p(this, runnable, null, 2, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m14926w() {
        if (f15316l.compareAndSet(false, true)) {
            f15309e = false;
            m14913g(f15310f);
            f15310f = null;
            ScreenCaptureService.Companion companion = ScreenCaptureService.f15296c;
            if (companion.isFloatWindowShowing()) {
                companion.stopFloating();
            }
            f15307c.post(new Runnable() { // from class: com.kubi.agora.d
                @Override // java.lang.Runnable
                public final void run() {
                    AgoraShareScreenManager.m14910x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m14927y() {
        if (f15311g == null) {
            HandlerThread handlerThread = new HandlerThread("ScreenEncodeThread");
            handlerThread.start();
            f15312h = new Handler(handlerThread.getLooper());
            f15311g = handlerThread;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m14928z() {
        if (f15313i == null || !Intrinsics.areEqual(f15314j, f15306b)) {
            ImageReader imageReader = f15313i;
            if (imageReader != null) {
                imageReader.close();
            }
            f15313i = ImageReader.newInstance(f15306b.getWidth(), f15306b.getHeight(), 1, 2);
            f15314j = f15306b;
        }
    }
}
