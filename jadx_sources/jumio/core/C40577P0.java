package jumio.core;

import com.jumio.core.data.scan.FileDataInterface;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.P0 */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40577P0 extends FunctionReferenceImpl implements Function2 {
    public C40577P0(Object obj) {
        super(2, obj, C40582Q0.class, "addFilesWithMetaData", "addFilesWithMetaData(Lorg/json/JSONObject;Lcom/jumio/core/data/scan/FileDataInterface;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        JSONObject p11 = (JSONObject) obj;
        FileDataInterface p12 = (FileDataInterface) obj2;
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((C40582Q0) this.receiver).m89223a(p11, p12);
        return Unit.INSTANCE;
    }
}
