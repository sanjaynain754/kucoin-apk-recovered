package com.jumio.liveness.image;

import com.jumio.commons.camera.ImageData;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, m90084d2 = {"Lcom/jumio/liveness/image/LivenessImageData;", "Lcom/jumio/commons/camera/ImageData;", "<init>", "()V", "bestSelfie", "", "getBestSelfie", "()Z", "setBestSelfie", "(Z)V", "clear", "", "getUploadMetadata", "Lorg/json/JSONObject;", "jumio-liveness_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LivenessImageData extends ImageData {

    /* JADX INFO: renamed from: a */
    public boolean f14669a;

    /* JADX INFO: renamed from: getBestSelfie, reason: from getter */
    public final boolean getF14669a() {
        return this.f14669a;
    }

    @Override // com.jumio.commons.camera.ImageData
    @NotNull
    public JSONObject getUploadMetadata() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("bestSelfieShot", this.f14669a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final void setBestSelfie(boolean z11) {
        this.f14669a = z11;
    }

    @Override // com.jumio.commons.camera.ImageData, com.jumio.core.data.scan.FileData, com.jumio.core.data.scan.DataInterface
    public void clear() {
        super.clear();
        this.f14669a = false;
    }
}
