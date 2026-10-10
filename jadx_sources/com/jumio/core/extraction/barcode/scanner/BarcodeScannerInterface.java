package com.jumio.core.extraction.barcode.scanner;

import android.graphics.Bitmap;
import com.jumio.core.extraction.barcode.model.Barcode;
import com.jumio.core.extraction.barcode.model.BarcodeFormat;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J(\u0010\u0010\u001a\u00020\n2\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0007\u0012\u0004\u0012\u00020\n0\u0012H&J&\u0010\u0014\u001a\u00020\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\u0004\u0012\u00020\n0\u0012H&J\u001c\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u001aH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u001bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/scanner/BarcodeScannerInterface;", "", "isInitialized", "", "()Z", "setup", "formats", "", "Lcom/jumio/core/extraction/barcode/model/BarcodeFormat;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "", "process", "timestamp", "", "bitmap", "Landroid/graphics/Bitmap;", "setOnSuccessListener", "onSuccess", "Lkotlin/Function2;", "Lcom/jumio/core/extraction/barcode/model/Barcode;", "setOnErrorListener", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "setOnCompletionListener", "onCompletion", "Lkotlin/Function1;", "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface BarcodeScannerInterface {
    void destroy();

    boolean isInitialized();

    void process(long timestamp, @NotNull Bitmap bitmap);

    void setOnCompletionListener(@NotNull Function1<? super Long, Unit> onCompletion);

    void setOnErrorListener(@NotNull Function2<? super Long, ? super Exception, Unit> onError);

    void setOnSuccessListener(@NotNull Function2<? super Long, ? super List<Barcode>, Unit> onSuccess);

    boolean setup(@NotNull List<? extends BarcodeFormat> formats);
}
