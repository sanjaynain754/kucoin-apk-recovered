package com.jumio.core.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.environment.CpuInfo;
import com.jumio.core.environment.Environment;
import com.jumio.core.image.DiskImageStore;
import com.jumio.core.models.AuthorizationModel;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0014\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u000bR\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0002J\u0018\u0010%\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\tH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/jumio/core/image/DiskImageStore;", "Lcom/jumio/core/image/ImageStoreInterface;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", NotificationCompat.CATEGORY_SERVICE, "Ljava/util/concurrent/ExecutorService;", "folder", "Ljava/io/File;", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "Lcom/jumio/core/models/AuthorizationModel;", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", C33757kf.f70665k, "", "mimeType", "", "fileType", "configure", "", "compressQuality", "start", "add", "imageData", "Lcom/jumio/commons/camera/ImageData;", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "extractionArea", "Landroid/graphics/Rect;", "delete", "data", InterfaceC33730j9.f70350a, "awaitTermination", "", "ensureStarted", "dump", "destinationFile", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDiskImageStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskImageStore.kt\ncom/jumio/core/image/DiskImageStore\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n*L\n1#1,145:1\n34#2:146\n*S KotlinDebug\n*F\n+ 1 DiskImageStore.kt\ncom/jumio/core/image/DiskImageStore\n*L\n117#1:146\n*E\n"})
public final class DiskImageStore implements ImageStoreInterface {

    /* JADX INFO: renamed from: a */
    public ExecutorService f14153a;

    /* JADX INFO: renamed from: b */
    public final File f14154b;

    /* JADX INFO: renamed from: c */
    public AuthorizationModel.SessionKey f14155c;

    /* JADX INFO: renamed from: d */
    public Bitmap.CompressFormat f14156d;

    /* JADX INFO: renamed from: e */
    public int f14157e;

    /* JADX INFO: renamed from: f */
    public String f14158f;

    /* JADX INFO: renamed from: g */
    public String f14159g;

    @Override // com.jumio.core.image.ImageStoreInterface
    public void start() {
        stop(false);
        this.f14153a = Executors.newFixedThreadPool(RangesKt.coerceAtLeast(CpuInfo.INSTANCE.getCpuCount() / 2, 2));
    }

    @Override // com.jumio.core.image.ImageStoreInterface
    public void stop(boolean awaitTermination) {
        if (!awaitTermination) {
            ExecutorService executorService = this.f14153a;
            if (executorService != null) {
                executorService.shutdownNow();
            }
            this.f14153a = null;
            return;
        }
        ExecutorService executorService2 = this.f14153a;
        if (executorService2 != null) {
            executorService2.shutdown();
            try {
                if (!executorService2.awaitTermination(20L, TimeUnit.SECONDS)) {
                    executorService2.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService2.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
        this.f14153a = null;
    }

    public DiskImageStore(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14154b = Environment.INSTANCE.getDataDirectory(context);
        this.f14156d = Bitmap.CompressFormat.WEBP;
        this.f14157e = 95;
        this.f14158f = "image/webp";
        this.f14159g = ConstantsKt.FILE_TYPE_WEBP;
    }

    @Override // com.jumio.core.image.ImageStoreInterface
    public void add(@NotNull ImageData imageData, @NotNull final Frame frame, @NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        if (this.f14153a == null) {
            start();
        }
        long timestamp = frame.getMetadata().getTimestamp();
        final File file = new File(this.f14154b, "image_" + timestamp);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        imageData.setData(absolutePath);
        imageData.getSize().setWidth(frame.getMetadata().getSize().getWidth());
        imageData.getSize().setHeight(frame.getMetadata().getSize().getHeight());
        imageData.setMimeType(this.f14158f);
        imageData.setFileType(this.f14159g);
        imageData.setTimestamp(Long.valueOf(timestamp));
        ExecutorService executorService = this.f14153a;
        if (executorService != null) {
            executorService.submit(new Runnable() { // from class: q9.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    DiskImageStore.m14547a(this.f96478b, frame, file);
                }
            });
        }
    }

    @Override // com.jumio.core.image.ImageStoreInterface
    public void configure(@NotNull AuthorizationModel.SessionKey sessionKey, @NotNull Bitmap.CompressFormat compressFormat, int compressQuality, @NotNull String mimeType, @NotNull String fileType) {
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.f14155c = sessionKey;
        this.f14156d = compressFormat;
        this.f14157e = compressQuality;
        this.f14158f = mimeType;
        this.f14159g = fileType;
    }

    @Override // com.jumio.core.image.ImageStoreInterface
    public void delete(@NotNull ImageData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        File file = new File(data.getData());
        if (file.isFile()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14547a(DiskImageStore diskImageStore, Frame frame, File file) throws Throwable {
        diskImageStore.getClass();
        try {
            Bitmap bitmapRotate$default = BitmapUtilKt.rotate$default(BitmapUtilKt.nv21ToBitmap(frame.getByteArray(), frame.getMetadata().getSize().getWidth(), frame.getMetadata().getSize().getHeight()), frame.getMetadata().getRotation(), false, 2, null);
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
            AuthorizationModel.SessionKey sessionKey = diskImageStore.f14155c;
            if (sessionKey != null) {
                BitmapUtilKt.saveBitmap(bitmapRotate$default, file, diskImageStore.f14156d, diskImageStore.f14157e, sessionKey);
            }
            bitmapRotate$default.recycle();
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        } catch (OutOfMemoryError e12) {
            Log.printStackTrace(e12);
            System.gc();
        }
    }
}
