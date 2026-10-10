package com.shopify.reactnative.skia;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactContext;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes59.dex */
public class PlatformContext {

    /* JADX INFO: renamed from: a */
    public final ReactContext f56495a;

    /* JADX INFO: renamed from: b */
    public final String f56496b = "PlatformContext";

    /* JADX INFO: renamed from: c */
    public final Handler f56497c = new Handler(Looper.getMainLooper());

    @InterfaceC44695a
    private final HybridData mHybridData;

    /* JADX INFO: renamed from: com.shopify.reactnative.skia.PlatformContext$a */
    public class RunnableC27765a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f56498b;

        public RunnableC27765a(String str) {
            this.f56498b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformContext.this.f56495a.handleException(new Exception(this.f56498b));
        }
    }

    private native HybridData initHybrid(float f11);

    /* JADX INFO: renamed from: b */
    public final byte[] m68593b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i11 = inputStream.read(bArr, 0, 4096);
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    @InterfaceC44695a
    public Object createVideo(String str) {
        return new C27769d(this.f56495a, str);
    }

    public void finalize() throws Throwable {
        this.mHybridData.resetNative();
        super.finalize();
    }

    @InterfaceC44695a
    public byte[] getJniStreamFromSource(String str) throws IOException {
        int identifier = this.f56495a.getResources().getIdentifier(str, "drawable", this.f56495a.getPackageName());
        if (identifier == 0) {
            identifier = this.f56495a.getResources().getIdentifier(str, "raw", this.f56495a.getPackageName());
        }
        if (identifier != 0) {
            return m68593b(this.f56495a.getResources().openRawResource(identifier));
        }
        try {
            URI uri = new URI(str);
            if (uri.getScheme() == null) {
                throw new Exception("Invalid URI scheme");
            }
            URL url = uri.toURL();
            ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).connect();
            return m68593b(new BufferedInputStream(FirebasePerfUrlConnection.openStream(url), 8192));
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
            return null;
        } catch (IOException e12) {
            e12.printStackTrace();
            return null;
        } catch (URISyntaxException e13) {
            e13.printStackTrace();
            return null;
        } catch (Exception e14) {
            e14.printStackTrace();
            return null;
        }
    }

    @InterfaceC44695a
    public void raise(String str) {
        this.f56497c.post(new RunnableC27765a(str));
    }

    @InterfaceC44695a
    public Object takeScreenshotFromViewTag(int i11) {
        return C27776k.m68622j(this.f56495a, i11);
    }

    public PlatformContext(ReactContext reactContext) {
        this.f56495a = reactContext;
        this.mHybridData = initHybrid(reactContext.getResources().getDisplayMetrics().density);
    }
}
