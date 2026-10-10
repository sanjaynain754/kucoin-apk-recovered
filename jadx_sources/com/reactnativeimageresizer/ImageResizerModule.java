package com.reactnativeimageresizer;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes59.dex */
public class ImageResizerModule extends ImageResizerSpec {
    public static final String NAME = "ImageResizer";

    /* JADX INFO: renamed from: com.reactnativeimageresizer.ImageResizerModule$a */
    public class AsyncTaskC27514a extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f55892a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ double f55893b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ double f55894c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f55895d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ double f55896e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Double f55897f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ String f55898g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Boolean f55899h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ WritableMap f55900i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Promise f55901j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27514a(ReactContext reactContext, String str, double d11, double d12, String str2, double d13, Double d14, String str3, Boolean bool, WritableMap writableMap, Promise promise) {
            super(reactContext);
            this.f55892a = str;
            this.f55893b = d11;
            this.f55894c = d12;
            this.f55895d = str2;
            this.f55896e = d13;
            this.f55897f = d14;
            this.f55898g = str3;
            this.f55899h = bool;
            this.f55900i = writableMap;
            this.f55901j = promise;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) throws Throwable {
            try {
                this.f55901j.resolve(ImageResizerModule.this.createResizedImageWithExceptions(this.f55892a, (int) this.f55893b, (int) this.f55894c, this.f55895d, (int) this.f55896e, this.f55897f.intValue(), this.f55898g, this.f55899h.booleanValue(), this.f55900i));
            } catch (IOException e11) {
                this.f55901j.reject(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"LongLogTag"})
    public Object createResizedImageWithExceptions(String str, int i11, int i12, String str2, int i13, int i14, String str3, boolean z11, ReadableMap readableMap) throws Throwable {
        Bitmap.CompressFormat compressFormatValueOf = Bitmap.CompressFormat.valueOf(str2);
        Uri uri = Uri.parse(str);
        Bitmap bitmapM68150c = C27515a.m68150c(getReactApplicationContext(), uri, i11, i12, i13, i14, readableMap.getString("mode"), readableMap.getBoolean("onlyScaleDown"));
        if (bitmapM68150c == null) {
            throw new IOException("The image failed to be resized; invalid Bitmap result.");
        }
        File cacheDir = getReactApplicationContext().getCacheDir();
        if (str3 != null) {
            cacheDir = new File(str3);
        }
        File fileM68160m = C27515a.m68160m(bitmapM68150c, cacheDir, UUID.randomUUID().toString(), compressFormatValueOf, i13);
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (!fileM68160m.isFile()) {
            throw new IOException("Error getting resized image path");
        }
        writableMapCreateMap.putString("path", fileM68160m.getAbsolutePath());
        writableMapCreateMap.putString("uri", Uri.fromFile(fileM68160m).toString());
        writableMapCreateMap.putString("name", fileM68160m.getName());
        writableMapCreateMap.putDouble("size", fileM68160m.length());
        writableMapCreateMap.putDouble("width", bitmapM68150c.getWidth());
        writableMapCreateMap.putDouble("height", bitmapM68150c.getHeight());
        if (z11) {
            try {
                C27515a.m68149b(getReactApplicationContext(), uri, fileM68160m.getAbsolutePath());
            } catch (Exception e11) {
                Log.e("ImageResizer::createResizedImageWithExceptions", "EXIF copy failed", e11);
            }
        }
        bitmapM68150c.recycle();
        return writableMapCreateMap;
    }

    @Override // com.reactnativeimageresizer.NativeImageResizerSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ImageResizer";
    }

    public ImageResizerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.reactnativeimageresizer.NativeImageResizerSpec
    @ReactMethod
    public void createResizedImage(String str, double d11, double d12, String str2, double d13, String str3, boolean z11, Double d14, @Nullable String str4, Boolean bool, Promise promise) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("mode", str3);
        writableMapCreateMap.putBoolean("onlyScaleDown", z11);
        new AsyncTaskC27514a(getReactApplicationContext(), str, d11, d12, str2, d13, d14, str4, bool, writableMapCreateMap, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
