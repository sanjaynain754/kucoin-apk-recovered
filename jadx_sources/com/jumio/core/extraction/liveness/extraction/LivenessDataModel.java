package com.jumio.core.extraction.liveness.extraction;

import com.jumio.commons.PersistWith;
import com.jumio.commons.camera.ImageData;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.FileData;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.jumio.core.model.StaticModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m90084d2 = {"Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;", "Lcom/jumio/core/model/StaticModel;", "<init>", "()V", "type", "Lcom/jumio/core/data/ScanMode;", "getType", "()Lcom/jumio/core/data/ScanMode;", "setType", "(Lcom/jumio/core/data/ScanMode;)V", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "", "Lcom/jumio/commons/camera/ImageData;", "getFrames", "()[Lcom/jumio/commons/camera/ImageData;", "setFrames", "([Lcom/jumio/commons/camera/ImageData;)V", "[Lcom/jumio/commons/camera/ImageData;", "blob", "Lcom/jumio/core/data/scan/FileData;", "getBlob", "()Lcom/jumio/core/data/scan/FileData;", "setBlob", "(Lcom/jumio/core/data/scan/FileData;)V", "value", "Lcom/jumio/core/data/scan/DataState;", "state", "getState", "()Lcom/jumio/core/data/scan/DataState;", "setState", "(Lcom/jumio/core/data/scan/DataState;)V", "isPassed", "", "()Ljava/lang/Boolean;", "setPassed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("LivenessDataModel")
public final class LivenessDataModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public ScanMode f14112a;

    /* JADX INFO: renamed from: b */
    public ImageData[] f14113b;

    /* JADX INFO: renamed from: c */
    public FileData f14114c;

    /* JADX INFO: renamed from: d */
    public DataState f14115d = DataState.TODO;

    /* JADX INFO: renamed from: e */
    public Boolean f14116e;

    @Nullable
    /* JADX INFO: renamed from: getBlob, reason: from getter */
    public final FileData getF14114c() {
        return this.f14114c;
    }

    @Nullable
    /* JADX INFO: renamed from: getFrames, reason: from getter */
    public final ImageData[] getF14113b() {
        return this.f14113b;
    }

    @NotNull
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final DataState getF14115d() {
        return this.f14115d;
    }

    @Nullable
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final ScanMode getF14112a() {
        return this.f14112a;
    }

    @Nullable
    /* JADX INFO: renamed from: isPassed, reason: from getter */
    public final Boolean getF14116e() {
        return this.f14116e;
    }

    public final void setBlob(@Nullable FileData fileData) {
        this.f14114c = fileData;
    }

    public final void setFrames(@Nullable ImageData[] imageDataArr) {
        this.f14113b = imageDataArr;
    }

    public final void setPassed(@Nullable Boolean bool) {
        this.f14116e = bool;
    }

    public final void setState(@NotNull DataState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f14115d.canTransitionTo(value)) {
            this.f14115d = value;
        }
    }

    public final void setType(@Nullable ScanMode scanMode) {
        this.f14112a = scanMode;
    }
}
