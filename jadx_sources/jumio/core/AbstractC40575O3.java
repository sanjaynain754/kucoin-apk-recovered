package jumio.core;

import com.jumio.commons.log.LogUtils;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.network.ApiCall;
import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: jumio.core.O3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40575O3 extends ApiCall {

    /* JADX INFO: renamed from: h */
    public String f90070h;

    public abstract String getRequest();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40575O3(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        this.f90070h = "";
    }

    @Override // com.jumio.core.network.ApiCall
    public void fillRequest(@NotNull OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        byte[] bytes = this.f90070h.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        outputStream.write(bytes);
    }

    @Override // com.jumio.core.network.ApiCall
    public int prepareRequest() throws Exception {
        this.f90070h = getRequest();
        LogUtils logUtils = LogUtils.INSTANCE;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        logUtils.logServerRequest(simpleName, this.f90070h);
        byte[] bytes = this.f90070h.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes.length;
    }
}
