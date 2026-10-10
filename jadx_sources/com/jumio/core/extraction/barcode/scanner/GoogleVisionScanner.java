package com.jumio.core.extraction.barcode.scanner;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.common.InputImage;
import com.jumio.commons.log.Log;
import com.jumio.core.extraction.barcode.model.Barcode;
import com.jumio.core.extraction.barcode.model.BarcodeFormat;
import com.jumio.core.extraction.barcode.scanner.GoogleVisionScanner;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\tH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J,\u0010\u001f\u001a\u00020\u000b2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\fH\u0016J*\u0010!\u001a\u00020\u000b2 \u0010\"\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\u0010H\u0016J \u0010#\u001a\u00020\u000b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0012j\u0002`\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\fX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\r\u001a \u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/scanner/GoogleVisionScanner;", "Lcom/jumio/core/extraction/barcode/scanner/BarcodeScannerInterface;", "<init>", "()V", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "successListener", "Lkotlin/Function2;", "", "", "Lcom/jumio/core/extraction/barcode/model/Barcode;", "", "Lcom/jumio/core/extraction/barcode/scanner/SuccessListener;", "errorListener", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/jumio/core/extraction/barcode/scanner/ErrorListener;", "completionListener", "Lkotlin/Function1;", "Lcom/jumio/core/extraction/barcode/scanner/CompletionListener;", "isInitialized", "", "()Z", "setup", "formats", "Lcom/jumio/core/extraction/barcode/model/BarcodeFormat;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "process", "timestamp", "bitmap", "Landroid/graphics/Bitmap;", "setOnSuccessListener", "onSuccess", "setOnErrorListener", "onError", "setOnCompletionListener", "onCompletion", "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGoogleVisionScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleVisionScanner.kt\ncom/jumio/core/extraction/barcode/scanner/GoogleVisionScanner\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1557#2:105\n1628#2,3:106\n1557#2:109\n1628#2,3:110\n*S KotlinDebug\n*F\n+ 1 GoogleVisionScanner.kt\ncom/jumio/core/extraction/barcode/scanner/GoogleVisionScanner\n*L\n38#1:105\n38#1:106,3\n72#1:109\n72#1:110,3\n*E\n"})
public final class GoogleVisionScanner implements BarcodeScannerInterface {

    @Nullable
    private Function1<? super Long, Unit> completionListener;

    @Nullable
    private Function2<? super Long, ? super Exception, Unit> errorListener;

    @Nullable
    private BarcodeScanner scanner;

    @Nullable
    private Function2<? super Long, ? super List<Barcode>, Unit> successListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$5(GoogleVisionScanner googleVisionScanner, long j11, Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Function2<? super Long, ? super Exception, Unit> function2 = googleVisionScanner.errorListener;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j11), exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$6(GoogleVisionScanner googleVisionScanner, long j11, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super Long, Unit> function1 = googleVisionScanner.completionListener;
        if (function1 != null) {
            function1.invoke(Long.valueOf(j11));
        }
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public void destroy() {
        BarcodeScanner barcodeScanner = this.scanner;
        if (barcodeScanner != null) {
            barcodeScanner.close();
        }
        this.scanner = null;
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public boolean isInitialized() {
        return this.scanner != null;
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public void process(final long timestamp, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        BarcodeScanner barcodeScanner = this.scanner;
        if (barcodeScanner == null) {
            Log.m14484w("GoogleVisionScanner", "Make sure to call setup(...) before processing.");
            return;
        }
        InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(...)");
        Task<List<com.google.mlkit.vision.barcode.common.Barcode>> taskProcess = barcodeScanner.process(inputImageFromBitmap);
        final Function1 function1 = new Function1() { // from class: o9.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoogleVisionScanner.process$lambda$3(this.f95144b, timestamp, (List) obj);
            }
        };
        taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: o9.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o9.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GoogleVisionScanner.process$lambda$5(this.f95147a, timestamp, exc);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: o9.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GoogleVisionScanner.process$lambda$6(this.f95149b, timestamp, task);
            }
        });
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public void setOnCompletionListener(@NotNull Function1<? super Long, Unit> onCompletion) {
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        this.completionListener = onCompletion;
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public void setOnErrorListener(@NotNull Function2<? super Long, ? super Exception, Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.errorListener = onError;
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public void setOnSuccessListener(@NotNull Function2<? super Long, ? super List<Barcode>, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.successListener = onSuccess;
    }

    @Override // com.jumio.core.extraction.barcode.scanner.BarcodeScannerInterface
    public boolean setup(@NotNull List<? extends BarcodeFormat> formats) {
        int[] intArray;
        Intrinsics.checkNotNullParameter(formats, "formats");
        if (formats.isEmpty()) {
            Log.m14484w("GoogleVisionScanner", "Please provide at least one format!");
            return false;
        }
        int iAccess$asVisionFormat = GoogleVisionScannerKt.access$asVisionFormat((BarcodeFormat) CollectionsKt.first((List) formats));
        if (formats.size() > 1) {
            List listDrop = CollectionsKt.drop(formats, 1);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
            Iterator it = listDrop.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(GoogleVisionScannerKt.access$asVisionFormat((BarcodeFormat) it.next())));
            }
            intArray = CollectionsKt.toIntArray(arrayList);
        } else {
            intArray = new int[]{0};
        }
        BarcodeScannerOptions barcodeScannerOptionsBuild = new BarcodeScannerOptions.Builder().setBarcodeFormats(iAccess$asVisionFormat, Arrays.copyOf(intArray, intArray.length)).build();
        Intrinsics.checkNotNullExpressionValue(barcodeScannerOptionsBuild, "build(...)");
        try {
            this.scanner = BarcodeScanning.getClient(barcodeScannerOptionsBuild);
            return true;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit process$lambda$3(GoogleVisionScanner googleVisionScanner, long j11, List list) {
        Intrinsics.checkNotNull(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.mlkit.vision.barcode.common.Barcode barcode = (com.google.mlkit.vision.barcode.common.Barcode) it.next();
            String strAccess$asString = GoogleVisionScannerKt.access$asString(barcode.getFormat());
            byte[] rawBytes = barcode.getRawBytes();
            if (rawBytes == null) {
                rawBytes = new byte[0];
            }
            arrayList.add(new Barcode(strAccess$asString, rawBytes));
        }
        Function2<? super Long, ? super List<Barcode>, Unit> function2 = googleVisionScanner.successListener;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j11), arrayList);
        }
        return Unit.INSTANCE;
    }
}
