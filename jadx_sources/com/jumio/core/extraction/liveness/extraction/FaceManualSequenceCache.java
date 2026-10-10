package com.jumio.core.extraction.liveness.extraction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.environment.Environment;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.util.ExtensionsKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33590cg;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005R\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0011\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120&¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020\u0018*\u00020$2\u0006\u0010 \u001a\u00020\u000fH\u0002J \u0010)\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/jumio/core/extraction/liveness/extraction/FaceManualSequenceCache;", "", "context", "Landroid/content/Context;", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "Lcom/jumio/core/models/AuthorizationModel;", "numberOfFrames", "", "maxFrames", "imageCompressionQuality", "<init>", "(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel$SessionKey;III)V", "queue", "Ljava/util/Queue;", "Lcom/jumio/commons/camera/Frame;", C33590cg.f69440j, "Ljava/util/LinkedList;", "Lcom/jumio/commons/camera/ImageData;", "folder", "Ljava/io/File;", "timestamp", "", "isActive", "", "()Z", "setActive", "(Z)V", "counter", "reset", "", "addSync", TypedValues.AttributesType.S_FRAME, "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "finish", "", "()[Lcom/jumio/commons/camera/ImageData;", "inBounds", "dump", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFaceManualSequenceCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceManualSequenceCache.kt\ncom/jumio/core/extraction/liveness/extraction/FaceManualSequenceCache\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,128:1\n37#2:129\n36#2,3:130\n37#2:133\n36#2,3:134\n344#3,3:137\n*S KotlinDebug\n*F\n+ 1 FaceManualSequenceCache.kt\ncom/jumio/core/extraction/liveness/extraction/FaceManualSequenceCache\n*L\n74#1:129\n74#1:130,3\n76#1:133\n76#1:134,3\n87#1:137,3\n*E\n"})
public final class FaceManualSequenceCache {

    /* JADX INFO: renamed from: a */
    public final AuthorizationModel.SessionKey f14102a;

    /* JADX INFO: renamed from: b */
    public final int f14103b;

    /* JADX INFO: renamed from: c */
    public final int f14104c;

    /* JADX INFO: renamed from: d */
    public final int f14105d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentLinkedQueue f14106e;

    /* JADX INFO: renamed from: f */
    public final LinkedList f14107f;

    /* JADX INFO: renamed from: g */
    public final File f14108g;

    /* JADX INFO: renamed from: h */
    public long f14109h;

    /* JADX INFO: renamed from: i */
    public boolean f14110i;

    /* JADX INFO: renamed from: j */
    public int f14111j;

    @NotNull
    public final ImageData[] finish() {
        this.f14110i = false;
        int size = this.f14107f.size();
        int i11 = this.f14103b;
        return size <= i11 ? (ImageData[]) CollectionsKt.reversed(this.f14107f).toArray(new ImageData[0]) : (ImageData[]) CollectionsKt.reversed(CollectionsKt.takeLast(this.f14107f, i11)).toArray(new ImageData[0]);
    }

    public final synchronized boolean isActive() {
        return this.f14110i;
    }

    public final synchronized void setActive(boolean z11) {
        this.f14110i = z11;
    }

    public FaceManualSequenceCache(@NotNull Context context, @NotNull AuthorizationModel.SessionKey sessionKey, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        this.f14102a = sessionKey;
        this.f14103b = i11;
        this.f14104c = i12;
        this.f14105d = i13;
        this.f14106e = new ConcurrentLinkedQueue();
        this.f14107f = new LinkedList();
        this.f14108g = Environment.INSTANCE.getDataDirectory(context);
    }

    public final void addSync(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) throws Throwable {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        try {
            if (this.f14103b != 0 && !extractionArea.isEmpty()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f14109h >= 500 && this.f14110i) {
                    this.f14109h = jCurrentTimeMillis;
                    m14546a(frame, cameraSettings, extractionArea);
                }
            }
        } catch (OutOfMemoryError e11) {
            Log.printStackTrace(e11);
            System.gc();
        }
    }

    public final void reset() {
        this.f14106e.clear();
        this.f14107f.clear();
        System.gc();
        this.f14111j = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m14546a(Frame frame, CameraSettings cameraSettings, Rect rect) throws Throwable {
        if (!rect.isEmpty()) {
            RectF rectFSurfaceToCamera = CameraUtilsKt.surfaceToCamera(cameraSettings, frame.getMetadata(), rect);
            Rect rect2 = new Rect();
            rectFSurfaceToCamera.roundOut(rect2);
            int width = frame.getMetadata().getSize().getWidth();
            int i11 = rect2.left;
            if (i11 >= 0 && i11 <= width) {
                int height = frame.getMetadata().getSize().getHeight();
                int i12 = rect2.top;
                if (i12 >= 0 && i12 <= height) {
                    int width2 = frame.getMetadata().getSize().getWidth();
                    int iWidth = rect2.width();
                    if (iWidth >= 0 && iWidth <= width2) {
                        int height2 = frame.getMetadata().getSize().getHeight();
                        int iHeight = rect2.height();
                        if (iHeight >= 0 && iHeight <= height2) {
                            try {
                                Bitmap bitmapCropRotateScale$default = BitmapUtilKt.cropRotateScale$default(BitmapUtilKt.nv21ToBitmap(frame.getByteArray(), frame.getMetadata().getSize().getWidth(), frame.getMetadata().getSize().getHeight()), frame.getMetadata(), cameraSettings, rect, false, false, Integer.valueOf(C33556b3.f69051i), false, 88, null);
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                Locale locale = Locale.ENGLISH;
                                int i13 = this.f14111j;
                                this.f14111j = i13 + 1;
                                String str = String.format(locale, "%s%04d", Arrays.copyOf(new Object[]{ConstantsKt.TEMP_FILE_PREFIX, Integer.valueOf(i13)}, 2));
                                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                File file = new File(this.f14108g, str);
                                BitmapUtilKt.saveBitmap(bitmapCropRotateScale$default, file, BitmapUtilKt.getWebpFormat(), this.f14105d, this.f14102a);
                                ImageData imageData = new ImageData();
                                String absolutePath = file.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                imageData.setData(absolutePath);
                                imageData.getSize().setWidth(bitmapCropRotateScale$default.getWidth());
                                imageData.getSize().setHeight(bitmapCropRotateScale$default.getHeight());
                                imageData.setMimeType("image/webp");
                                imageData.setFileType(ConstantsKt.FILE_TYPE_WEBP);
                                imageData.setCameraConnectionData(frame.getMetadata().getCameraConnectionData());
                                imageData.setCameraPosition(ExtensionsKt.getCameraPosition(cameraSettings));
                                this.f14107f.addFirst(imageData);
                                if (this.f14107f.size() > this.f14104c) {
                                    Object objRemoveLast = this.f14107f.removeLast();
                                    Intrinsics.checkNotNullExpressionValue(objRemoveLast, "removeLast(...)");
                                    new File(this.f14108g, ((ImageData) objRemoveLast).getData()).delete();
                                }
                                System.gc();
                            } catch (Exception e11) {
                                Log.printStackTrace(e11);
                            } catch (OutOfMemoryError e12) {
                                Log.printStackTrace(e12);
                            }
                        }
                    }
                }
            }
        }
    }
}
