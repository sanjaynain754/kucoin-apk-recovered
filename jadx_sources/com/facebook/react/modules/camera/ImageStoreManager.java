package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImageStoreManager.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = "ImageStoreManager")
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager;", "Lcom/facebook/fbreact/specs/NativeImageStoreAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getBase64ForTag", "", "uri", "", "success", "Lcom/facebook/react/bridge/Callback;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    private static final int BUFFER_SIZE = 8192;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NAME = "ImageStoreManager";

    /* JADX INFO: compiled from: ImageStoreManager.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/react/modules/camera/ImageStoreManager$Companion;", "", "<init>", "()V", "NAME", "", "BUFFER_SIZE", "", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "convertInputStreamToBase64OutputStream", "inputStream", "Ljava/io/InputStream;", "convertInputStreamToBase64OutputStream$ReactAndroid_release", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nImageStoreManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageStoreManager.kt\ncom/facebook/react/modules/camera/ImageStoreManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final String convertInputStreamToBase64OutputStream$ReactAndroid_release(@NotNull InputStream inputStream) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    int i11 = inputStream.read(bArr);
                    if (i11 <= -1) {
                        closeQuietly(base64OutputStream);
                        String string = byteArrayOutputStream.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return string;
                    }
                    base64OutputStream.write(bArr, 0, i11);
                } catch (Throwable th2) {
                    closeQuietly(base64OutputStream);
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void closeQuietly(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getBase64ForTag$lambda$0(ImageStoreManager imageStoreManager, String str, Callback callback, Callback callback2) {
        try {
            InputStream inputStreamOpenInputStream = imageStoreManager.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(str));
            Intrinsics.checkNotNull(inputStreamOpenInputStream, "null cannot be cast to non-null type java.io.InputStream");
            try {
                try {
                    Companion companion = INSTANCE;
                    callback.invoke(companion.convertInputStreamToBase64OutputStream$ReactAndroid_release(inputStreamOpenInputStream));
                    companion.closeQuietly(inputStreamOpenInputStream);
                } catch (IOException e11) {
                    callback2.invoke(e11.getMessage());
                    INSTANCE.closeQuietly(inputStreamOpenInputStream);
                }
            } catch (Throwable th2) {
                INSTANCE.closeQuietly(inputStreamOpenInputStream);
                throw th2;
            }
        } catch (FileNotFoundException e12) {
            callback2.invoke(e12.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageStoreAndroidSpec
    public void getBase64ForTag(@NotNull final String uri, @NotNull final Callback success, @NotNull final Callback error) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: w6.a
            @Override // java.lang.Runnable
            public final void run() {
                ImageStoreManager.getBase64ForTag$lambda$0(this.f103144b, uri, success, error);
            }
        });
    }
}
