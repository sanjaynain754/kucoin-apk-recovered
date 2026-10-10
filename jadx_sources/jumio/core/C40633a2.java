package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.utils.BitmapUtilKt;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.data.scan.FileDataInterface;
import com.jumio.core.environment.Environment;
import com.jumio.core.extraction.result.ImageExtractionResult;
import com.jumio.core.scanpart.JVisionScanPart;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: jumio.core.a2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40633a2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f90211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageExtractionResult f90212b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FileDataInterface f90213c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ JVisionScanPart f90214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40633a2(ImageExtractionResult imageExtractionResult, FileDataInterface fileDataInterface, JVisionScanPart jVisionScanPart, Continuation continuation) {
        super(2, continuation);
        this.f90212b = imageExtractionResult;
        this.f90213c = fileDataInterface;
        this.f90214d = jVisionScanPart;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40633a2 c40633a2 = new C40633a2(this.f90212b, this.f90213c, this.f90214d, continuation);
        c40633a2.f90211a = obj;
        return c40633a2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40633a2) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f90211a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String simpleName = interfaceC41709m0.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        Log.m14479v(simpleName, "Saving image for " + this.f90212b.getF14141b());
        this.f90213c.setTimestamp(Boxing.boxLong(System.currentTimeMillis()));
        File dataDirectory = Environment.INSTANCE.getDataDirectory(this.f90214d.getF14541a().getF13601b());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%s%d", Arrays.copyOf(new Object[]{ConstantsKt.TEMP_FILE_PREFIX, Boxing.boxLong(System.currentTimeMillis())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        File file = new File(dataDirectory, str);
        if (!this.f90212b.getBitmap().isRecycled()) {
            BitmapUtilKt.saveBitmap(this.f90212b.getBitmap(), file, BitmapUtilKt.getWebpFormat(), this.f90214d.getSettingsModel().getImageCompressionQuality(), this.f90214d.getF14541a().getF13600a().getF14185c());
        }
        FileDataInterface fileDataInterface = this.f90213c;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        fileDataInterface.setData(absolutePath);
        LogLevel logLevel = LogLevel.OFF;
        this.f90212b.getBitmap().recycle();
        return Unit.INSTANCE;
    }
}
