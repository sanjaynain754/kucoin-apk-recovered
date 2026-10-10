package com.jumio.core.data.image;

import com.jumio.commons.camera.C9300a;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.data.scan.ScanResult;
import com.jumio.core.models.automation.AutomationModel;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u001a\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018¨\u0006#"}, m90084d2 = {"Lcom/jumio/core/data/image/ImageResult;", "Lcom/jumio/core/data/scan/ScanResult;", "Lcom/jumio/commons/camera/MultiResolutionImageData;", "Ljava/io/Serializable;", "data", "<init>", "(Lcom/jumio/commons/camera/MultiResolutionImageData;)V", "getData", "()Lcom/jumio/commons/camera/MultiResolutionImageData;", "automationModel", "Lcom/jumio/core/models/automation/AutomationModel;", "getAutomationModel", "()Lcom/jumio/core/models/automation/AutomationModel;", "setAutomationModel", "(Lcom/jumio/core/models/automation/AutomationModel;)V", "state", "Lcom/jumio/core/data/scan/DataState;", "getState", "()Lcom/jumio/core/data/scan/DataState;", "setState", "(Lcom/jumio/core/data/scan/DataState;)V", "hasData", "", "getHasData", "()Z", "isComplete", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImageResult implements ScanResult<C9300a>, Serializable {

    /* JADX INFO: renamed from: a */
    public final C9300a f13816a;

    /* JADX INFO: renamed from: b */
    public AutomationModel f13817b;

    /* JADX INFO: renamed from: c */
    public DataState f13818c;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageResult) && Intrinsics.areEqual(this.f13816a, ((ImageResult) other).f13816a);
    }

    public ImageResult(@NotNull C9300a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13816a = data;
        this.f13818c = DataState.TODO;
    }

    public static /* synthetic */ ImageResult copy$default(ImageResult imageResult, C9300a c9300a, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c9300a = imageResult.f13816a;
        }
        return imageResult.copy(c9300a);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C9300a getF13816a() {
        return this.f13816a;
    }

    @NotNull
    public final ImageResult copy(@NotNull C9300a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ImageResult(data);
    }

    @Override // com.jumio.core.data.scan.ScanResult
    @Nullable
    /* JADX INFO: renamed from: getAutomationModel, reason: from getter */
    public AutomationModel getF13817b() {
        return this.f13817b;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    @NotNull
    public C9300a getData() {
        return this.f13816a;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    @NotNull
    /* JADX INFO: renamed from: getState, reason: from getter */
    public DataState getF13818c() {
        return this.f13818c;
    }

    public int hashCode() {
        return this.f13816a.hashCode();
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public void setAutomationModel(@Nullable AutomationModel automationModel) {
        this.f13817b = automationModel;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public void setState(@NotNull DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "<set-?>");
        this.f13818c = dataState;
    }

    @NotNull
    public String toString() {
        return "ImageResult(data=" + this.f13816a + ')';
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public boolean getHasData() {
        if (getF13818c() != DataState.SKIPPED) {
            C9300a data = getData();
            if (!data.m14447a(data.f13566b).getHasData() && !getF13818c().isAtLeast(DataState.SAVING)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.jumio.core.data.scan.ScanResult
    public boolean isComplete() {
        if (getF13818c() != DataState.SKIPPED) {
            C9300a data = getData();
            if (!data.m14447a(data.f13566b).getHasData() || !getF13818c().isAtLeast(DataState.UPLOADED)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public /* synthetic */ ImageResult(C9300a c9300a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new C9300a() : c9300a);
    }
}
