package com.jumio.sdk.result;

import com.jumio.sdk.enums.JumioScanMode;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/sdk/result/JumioCredentialResult;", "Ljava/io/Serializable;", "<init>", "()V", "value", "Lcom/jumio/sdk/enums/JumioScanMode;", "extractionMode", "getExtractionMode", "()Lcom/jumio/sdk/enums/JumioScanMode;", "setExtractionMode$jumio_core_release", "(Lcom/jumio/sdk/enums/JumioScanMode;)V", "Lcom/jumio/sdk/result/JumioImageData;", "imageData", "getImageData", "()Lcom/jumio/sdk/result/JumioImageData;", "setImageData$jumio_core_release", "(Lcom/jumio/sdk/result/JumioImageData;)V", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class JumioCredentialResult implements Serializable {

    /* JADX INFO: renamed from: a */
    public JumioScanMode f14709a;

    /* JADX INFO: renamed from: b */
    public JumioImageData f14710b;

    @Nullable
    /* JADX INFO: renamed from: getExtractionMode, reason: from getter */
    public final JumioScanMode getF14709a() {
        return this.f14709a;
    }

    @Nullable
    /* JADX INFO: renamed from: getImageData, reason: from getter */
    public final JumioImageData getF14710b() {
        return this.f14710b;
    }

    public final void setExtractionMode$jumio_core_release(@Nullable JumioScanMode jumioScanMode) {
        this.f14709a = jumioScanMode;
    }

    public final void setImageData$jumio_core_release(@Nullable JumioImageData jumioImageData) {
        this.f14710b = jumioImageData;
    }
}
