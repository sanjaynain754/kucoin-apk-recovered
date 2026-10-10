package com.jumio.core.extraction.barcode.extraction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.enums.UploadResolution;
import com.jumio.core.extraction.ExtractionClient;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.ExtractionUpdateState;
import com.jumio.core.extraction.barcode.extraction.BarcodeClient;
import com.jumio.core.extraction.barcode.model.Barcode;
import com.jumio.core.extraction.barcode.model.BarcodeDataModel;
import com.jumio.core.extraction.barcode.model.BarcodeFormat;
import com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.UploadSettingsModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scope.ScopeProviderInterface;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0014J \u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\u0012\u0010'\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010(\u001a\u00020\u0015H\u0014J(\u0010)\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010/\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u00060"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/extraction/BarcodeClient;", "Lcom/jumio/core/extraction/ExtractionClient;", "context", "Landroid/content/Context;", "scopeProvider", "Lcom/jumio/core/scope/ScopeProviderInterface;", "scanner", "Lcom/jumio/core/extraction/barcode/scanner/BarcodeScannerInterface;", "dataModel", "Lcom/jumio/core/extraction/barcode/model/BarcodeDataModel;", "<init>", "(Landroid/content/Context;Lcom/jumio/core/scope/ScopeProviderInterface;Lcom/jumio/core/extraction/barcode/scanner/BarcodeScannerInterface;Lcom/jumio/core/extraction/barcode/model/BarcodeDataModel;)V", "recognizerLock", "", "bitmapCache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroid/graphics/Bitmap;", "connectionCache", "Lcom/jumio/core/camera/CameraConnectionData;", "resultCache", "", "suppressLowResolutionProcessing", "getSuppressLowResolutionProcessing", "()Z", "configure", "", "dataManager", "Lcom/jumio/core/persistence/DataManager;", "configurationModel", "Lcom/jumio/core/model/StaticModel;", "init", "process", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", BridgeParamKeyKt.CAPTURE, "shouldFeed", "onBarcodesFound", "barcodes", "", "Lcom/jumio/core/extraction/barcode/model/Barcode;", "bitmap", "cameraConnectionData", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBarcodeClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeClient.kt\ncom/jumio/core/extraction/barcode/extraction/BarcodeClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Log.kt\ncom/jumio/commons/log/Log\n*L\n1#1,234:1\n1863#2,2:235\n34#3:237\n34#3:238\n*S KotlinDebug\n*F\n+ 1 BarcodeClient.kt\ncom/jumio/core/extraction/barcode/extraction/BarcodeClient\n*L\n161#1:235,2\n169#1:237\n189#1:238\n*E\n"})
public final class BarcodeClient extends ExtractionClient {

    /* JADX INFO: renamed from: u */
    public final BarcodeScannerInterface f13901u;

    /* JADX INFO: renamed from: v */
    public final BarcodeDataModel f13902v;

    /* JADX INFO: renamed from: w */
    public final Object f13903w;

    /* JADX INFO: renamed from: x */
    public final ConcurrentHashMap f13904x;

    /* JADX INFO: renamed from: y */
    public final ConcurrentHashMap f13905y;

    /* JADX INFO: renamed from: z */
    public final ConcurrentHashMap f13906z;

    /* JADX INFO: renamed from: a */
    public static final Unit m14532a(BarcodeClient barcodeClient, long j11, List barcodes) {
        Intrinsics.checkNotNullParameter(barcodes, "barcodes");
        Bitmap bitmap = (Bitmap) barcodeClient.f13904x.remove(Long.valueOf(j11));
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        CameraConnectionData cameraConnectionData = (CameraConnectionData) barcodeClient.f13905y.remove(Long.valueOf(j11));
        ConcurrentHashMap concurrentHashMap = barcodeClient.f13906z;
        Long lValueOf = Long.valueOf(j11);
        boolean z11 = false;
        if (!barcodes.isEmpty()) {
            try {
                Iterator it = barcodes.iterator();
                while (it.hasNext()) {
                    Barcode barcode = (Barcode) it.next();
                    if (!barcodeClient.f13902v.getBarcodes().contains(barcode)) {
                        barcodeClient.f13902v.getBarcodes().add(barcode);
                    }
                }
                Log.m14463d("BarcodeClient", "Barcodes found: " + barcodeClient.f13902v.getBarcodes().size());
                LogLevel logLevel = LogLevel.OFF;
                System.gc();
                if (!barcodeClient.getF13862t()) {
                    ExtractionUpdateInterface.Companion companion = ExtractionUpdateInterface.INSTANCE;
                    ExtractionUpdateState.Companion companion2 = ExtractionUpdateState.INSTANCE;
                    barcodeClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, companion2.getSaveImage(), new ImageExtractionResult(bitmap, barcodeClient.getF13857o(), null, null, null, cameraConnectionData, 28, null), null, 4, null));
                    barcodeClient.publishUpdate(ExtractionUpdateInterface.Companion.build$default(companion, companion2.getShotTaken(), new ExtractionResult(barcodeClient.getF13857o(), null, null, 6, null), null, 4, null));
                } else if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                barcodeClient.publishResult((StaticModel) barcodeClient.f13902v);
                z11 = !barcodeClient.getF13862t();
            } catch (Exception unused) {
                Log log = Log.INSTANCE;
                LogLevel logLevel2 = LogLevel.OFF;
            }
        }
        concurrentHashMap.put(lValueOf, Boolean.valueOf(z11));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeClient(@NotNull Context context, @NotNull ScopeProviderInterface scopeProvider, @NotNull BarcodeScannerInterface scanner, @NotNull BarcodeDataModel dataModel) {
        super(context, scopeProvider);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.f13901u = scanner;
        this.f13902v = dataModel;
        this.f13903w = new Object();
        this.f13904x = new ConcurrentHashMap();
        this.f13905y = new ConcurrentHashMap();
        this.f13906z = new ConcurrentHashMap();
        setCenterCropExtractionArea(true);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void capture(@Nullable Frame frame) {
        Frame frame2;
        Log.m14479v("BarcodeClient", "4K frame received: " + frame);
        if (frame != null) {
            synchronized (this.f13903w) {
                try {
                    frame2 = frame;
                    Bitmap bitmapApplyPreviewFrameCropToHighResolutionFrame$default = BitmapUtilKt.applyPreviewFrameCropToHighResolutionFrame$default(frame2, getF13860r(), getF13861s(), false, null, 24, null);
                    this.f13904x.put(Long.valueOf(frame2.getMetadata().getTimestamp()), bitmapApplyPreviewFrameCropToHighResolutionFrame$default);
                    CameraConnectionData cameraConnectionData = frame2.getMetadata().getCameraConnectionData();
                    if (cameraConnectionData != null) {
                        this.f13905y.put(Long.valueOf(frame2.getMetadata().getTimestamp()), cameraConnectionData);
                    }
                    this.f13901u.process(frame2.getMetadata().getTimestamp(), bitmapApplyPreviewFrameCropToHighResolutionFrame$default);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            frame2 = frame;
        }
        super.capture(frame2);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void configure(@NotNull DataManager dataManager, @NotNull StaticModel configurationModel) {
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(configurationModel, "configurationModel");
        super.configure(dataManager, configurationModel);
        if (this.f13901u.isInitialized()) {
            destroy();
        }
        boolean z11 = configurationModel instanceof PhysicalIdScanPartModel;
        boolean z12 = false;
        if (!z11) {
            Log.m14469e("BarcodeClient", "Configuration model needs to be an instance of " + Reflection.getOrCreateKotlinClass(PhysicalIdScanPartModel.class).getSimpleName());
            setConfigured(false);
            return;
        }
        this.f13901u.setOnSuccessListener(new Function2() { // from class: n9.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BarcodeClient.m14532a(this.f94723b, ((Long) obj).longValue(), (List) obj2);
            }
        });
        this.f13901u.setOnErrorListener(new Function2() { // from class: n9.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BarcodeClient.m14531a(this.f94724b, ((Long) obj).longValue(), (Exception) obj2);
            }
        });
        this.f13901u.setOnCompletionListener(new Function1() { // from class: n9.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BarcodeClient.m14530a(this.f94725b, ((Long) obj).longValue());
            }
        });
        List<? extends BarcodeFormat> listListOf = getF13862t() ? CollectionsKt.listOf((Object[]) new BarcodeFormat[]{BarcodeFormat.PDF_417, BarcodeFormat.QR_CODE}) : CollectionsKt.listOf(BarcodeFormat.PDF_417);
        if (getF13859q() && this.f13901u.setup(listListOf)) {
            z12 = true;
        }
        setConfigured(z12);
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void process(@NotNull Frame frame, @NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) {
        UploadSettingsModel uploadSettingsModel;
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        DataManager f13856n = getF13856n();
        if (((f13856n == null || (uploadSettingsModel = (UploadSettingsModel) f13856n.get(UploadSettingsModel.class)) == null) ? null : uploadSettingsModel.getF14381b()) == UploadResolution.UHD && getF13862t()) {
            setResult(false);
            return;
        }
        synchronized (this.f13903w) {
            try {
                Bitmap bitmapCropRotateScale$default = BitmapUtilKt.cropRotateScale$default(BitmapUtilKt.nv21ToBitmap(frame.getByteArray(), frame.getMetadata().getSize().getWidth(), frame.getMetadata().getSize().getHeight()), frame.getMetadata(), cameraSettings, extractionArea, false, false, null, false, 120, null);
                this.f13904x.put(Long.valueOf(frame.getMetadata().getTimestamp()), bitmapCropRotateScale$default);
                CameraConnectionData cameraConnectionData = frame.getMetadata().getCameraConnectionData();
                if (cameraConnectionData != null) {
                    this.f13905y.put(Long.valueOf(frame.getMetadata().getTimestamp()), cameraConnectionData);
                }
                this.f13901u.process(frame.getMetadata().getTimestamp(), bitmapCropRotateScale$default);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public boolean shouldFeed() {
        return this.f13901u.isInitialized();
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void destroy() {
        super.destroy();
        this.f13904x.clear();
        this.f13905y.clear();
        this.f13906z.clear();
        synchronized (this.f13903w) {
            this.f13901u.destroy();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.jumio.core.extraction.ExtractionClient
    public void init() {
        super.init();
        this.f13902v.getBarcodes().clear();
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14531a(BarcodeClient barcodeClient, long j11, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Log.m14463d("BarcodeClient", "Barcode scanner failed: " + exception.getLocalizedMessage());
        barcodeClient.f13905y.remove(Long.valueOf(j11));
        Bitmap bitmap = (Bitmap) barcodeClient.f13904x.remove(Long.valueOf(j11));
        if (bitmap == null) {
            barcodeClient.setResult(false);
            return Unit.INSTANCE;
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        barcodeClient.setResult(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14530a(BarcodeClient barcodeClient, long j11) {
        Boolean bool = (Boolean) barcodeClient.f13906z.remove(Long.valueOf(j11));
        barcodeClient.setResult(bool != null ? bool.booleanValue() : false);
        return Unit.INSTANCE;
    }
}
