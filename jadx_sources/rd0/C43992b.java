package rd0;

import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.tuikit.common.system.ContextProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: rd0.b */
/* JADX INFO: compiled from: GiftCacheService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService;", "", "<init>", "()V", "cacheSize", "", "tag", "", "executor", "Ljava/util/concurrent/ExecutorService;", "cacheFile", "Ljava/io/File;", "lruCache", "Landroid/util/LruCache;", "setCacheDir", "", "file", "release", "clearCache", "request", "urlString", TUIConstants.TUIChat.CALL_BACK, "Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService$Callback;", "keyForUrl", "url", "bytesToHexString", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "", "Callback", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGiftCacheService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftCacheService.kt\ncom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class C43992b {

    /* JADX INFO: renamed from: a */
    public final int f97226a = 20;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f97227b = "GiftCacheService";

    /* JADX INFO: renamed from: c */
    @Nullable
    public ExecutorService f97228c;

    /* JADX INFO: renamed from: d */
    public File f97229d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public LruCache<String, File> f97230e;

    /* JADX INFO: renamed from: rd0.b$a */
    /* JADX INFO: compiled from: GiftCacheService.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/giftaccess/service/GiftCacheService$Callback;", ExifInterface.GPS_DIRECTION_TRUE, "", "onResult", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", DbParams.KEY_CHANNEL_RESULT, "(ILjava/lang/Object;)V", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        void mo80151a(int i11, @Nullable T t11);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX INFO: renamed from: e */
    public static final void m96950e(C43992b c43992b, String str, URL url, String str2, a aVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            File file = c43992b.f97229d;
            if (file == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cacheFile");
                file = null;
            }
            File file2 = new File(file, new File(str).getName());
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection3 = (HttpURLConnection) uRLConnection;
            try {
                httpURLConnection3.setRequestMethod("GET");
                httpURLConnection3.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                httpURLConnection3.setRequestProperty("Connection", "close");
                httpURLConnection3.connect();
                InputStream inputStream = httpURLConnection3.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i11);
                    }
                }
                fileOutputStream.close();
                LruCache<String, File> lruCache = c43992b.f97230e;
                if (lruCache != null) {
                    lruCache.put(str2, file2);
                }
                if (aVar != null) {
                    aVar.mo80151a(0, file2.getAbsolutePath());
                }
                httpURLConnection3.disconnect();
            } catch (IOException e11) {
                httpURLConnection = httpURLConnection3;
                e = e11;
                try {
                    Log.i(c43992b.f97227b, ' ' + e.getLocalizedMessage());
                    if (aVar != null) {
                        aVar.mo80151a(-1, null);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection2 = httpURLConnection3;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m96951b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final void m96953d(@NotNull final String urlString, @Nullable final a<String> aVar) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Log.i(this.f97227b, "request: " + urlString);
        ExecutorService executorService = this.f97228c;
        if (executorService != null && executorService.isShutdown()) {
            Log.i(this.f97227b, "mExecutor is isShutdown");
            if (aVar != null) {
                aVar.mo80151a(-1, null);
                return;
            }
            return;
        }
        try {
            final URL url = new URL(urlString);
            if (this.f97230e == null) {
                this.f97230e = new LruCache<>(this.f97226a);
            }
            String path = url.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            final String strM96952c = m96952c(path);
            LruCache<String, File> lruCache = this.f97230e;
            File file = lruCache != null ? lruCache.get(strM96952c) : null;
            if (file == null || !file.exists()) {
                if (this.f97228c == null) {
                    this.f97228c = Executors.newSingleThreadExecutor();
                }
                ExecutorService executorService2 = this.f97228c;
                if (executorService2 != null) {
                    executorService2.submit(new Runnable() { // from class: rd0.a
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            C43992b.m96950e(this.f97221b, urlString, url, strM96952c, aVar);
                        }
                    });
                    return;
                }
                return;
            }
            Log.i(this.f97227b, "find cache: " + url);
            if (aVar != null) {
                aVar.mo80151a(0, file.getAbsolutePath());
            }
        } catch (MalformedURLException unused) {
            if (aVar != null) {
                aVar.mo80151a(-1, null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m96954f(@Nullable File file) {
        if (file != null) {
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f97229d = file;
        }
    }

    public C43992b() {
        m96954f(new File(ContextProvider.m79397b().getCacheDir() + File.separator + "gift"));
    }

    /* JADX INFO: renamed from: c */
    public final String m96952c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNull(bArrDigest);
            return m96951b(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
