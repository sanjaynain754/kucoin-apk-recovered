package com.jumio.core.processor.challenge;

import com.jumio.commons.camera.CameraCapabilities;
import com.jumio.core.data.scan.ByteArrayData;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import com.jumio.core.extraction.result.DataExtractionResult;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ExtractionResultProvider;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.GzipUtilKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jumio.core.C40557L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0016J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J-\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006*"}, m90084d2 = {"Lcom/jumio/core/processor/challenge/CameraChallengeResult;", "Lcom/jumio/core/model/StaticModel;", "Lcom/jumio/core/extraction/result/ExtractionResultProvider;", DocumentClassifier.KEY_SIDE, "", "capabilities", "Lcom/jumio/commons/camera/CameraCapabilities;", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "", "Lcom/jumio/core/processor/challenge/CameraChallengeFrame;", "<init>", "(Ljava/lang/String;Lcom/jumio/commons/camera/CameraCapabilities;Ljava/util/List;)V", "getClassifier", "()Ljava/lang/String;", "getCapabilities", "()Lcom/jumio/commons/camera/CameraCapabilities;", "setCapabilities", "(Lcom/jumio/commons/camera/CameraCapabilities;)V", "getFrames", "()Ljava/util/List;", "setFrames", "(Ljava/util/List;)V", "toJson", "Lorg/json/JSONObject;", "toJson$jumio_core_release", "getUploadData", "Lcom/jumio/core/data/scan/ByteArrayData;", "getExtractionResult", "Lcom/jumio/core/extraction/result/ExtractionResult;", "side", "batchId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraChallengeResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraChallengeResult.kt\ncom/jumio/core/processor/challenge/CameraChallengeResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final /* data */ class CameraChallengeResult implements StaticModel, ExtractionResultProvider {

    /* JADX INFO: renamed from: a */
    public final String f14513a;

    /* JADX INFO: renamed from: b */
    public CameraCapabilities f14514b;

    /* JADX INFO: renamed from: c */
    public List f14515c;

    public CameraChallengeResult(@NotNull String classifier, @NotNull CameraCapabilities capabilities, @NotNull List<CameraChallengeFrame> frames) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.f14513a = classifier;
        this.f14514b = capabilities;
        this.f14515c = frames;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChallengeResult)) {
            return false;
        }
        CameraChallengeResult cameraChallengeResult = (CameraChallengeResult) other;
        return Intrinsics.areEqual(this.f14513a, cameraChallengeResult.f14513a) && Intrinsics.areEqual(this.f14514b, cameraChallengeResult.f14514b) && Intrinsics.areEqual(this.f14515c, cameraChallengeResult.f14515c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraChallengeResult copy$default(CameraChallengeResult cameraChallengeResult, String str, CameraCapabilities cameraCapabilities, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cameraChallengeResult.f14513a;
        }
        if ((i11 & 2) != 0) {
            cameraCapabilities = cameraChallengeResult.f14514b;
        }
        if ((i11 & 4) != 0) {
            list = cameraChallengeResult.f14515c;
        }
        return cameraChallengeResult.copy(str, cameraCapabilities, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14513a() {
        return this.f14513a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CameraCapabilities getF14514b() {
        return this.f14514b;
    }

    @NotNull
    public final List<CameraChallengeFrame> component3() {
        return this.f14515c;
    }

    @NotNull
    public final CameraChallengeResult copy(@NotNull String classifier, @NotNull CameraCapabilities capabilities, @NotNull List<CameraChallengeFrame> frames) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(frames, "frames");
        return new CameraChallengeResult(classifier, capabilities, frames);
    }

    @NotNull
    public final CameraCapabilities getCapabilities() {
        return this.f14514b;
    }

    @NotNull
    public final String getClassifier() {
        return this.f14513a;
    }

    @Override // com.jumio.core.extraction.result.ExtractionResultProvider
    @NotNull
    public ExtractionResult getExtractionResult(@NotNull String side, @NotNull String classifier, @Nullable String batchId) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        String str = this.f14513a;
        ByteArrayData byteArrayData = new ByteArrayData();
        String string = toJson$jumio_core_release().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byteArrayData.setData(GzipUtilKt.toGzip(string));
        byteArrayData.setMimeType("application/x-gzip-compressed");
        return new DataExtractionResult(side, str, batchId, byteArrayData, null, 16, null);
    }

    @NotNull
    public final List<CameraChallengeFrame> getFrames() {
        return this.f14515c;
    }

    public int hashCode() {
        return this.f14515c.hashCode() + ((this.f14514b.hashCode() + (this.f14513a.hashCode() * 31)) * 31);
    }

    public final void setCapabilities(@NotNull CameraCapabilities cameraCapabilities) {
        Intrinsics.checkNotNullParameter(cameraCapabilities, "<set-?>");
        this.f14514b = cameraCapabilities;
    }

    public final void setFrames(@NotNull List<CameraChallengeFrame> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f14515c = list;
    }

    @NotNull
    public final JSONObject toJson$jumio_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        CameraCapabilities cameraCapabilities = this.f14514b;
        JSONArray jSONArray = new JSONArray();
        if (cameraCapabilities.getCanAdjustFocus()) {
            jSONArray.put("FOCUS");
        }
        if (cameraCapabilities.getCanAdjustExposure()) {
            jSONArray.put("EXPOSURE");
        }
        if (cameraCapabilities.getCanAdjustWhiteBalance()) {
            jSONArray.put("WHITE_BALANCE");
        }
        jSONObject.put("capabilities", jSONArray);
        List list = this.f14515c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraChallengeFrame) it.next()).toJsonObject());
        }
        jSONObject.put("images", new JSONArray((Collection) arrayList));
        jSONObject.put("cameraInfo", this.f14514b.getInfo());
        String[] availableWhiteBalanceModes = this.f14514b.getAvailableWhiteBalanceModes();
        if (availableWhiteBalanceModes.length == 0) {
            availableWhiteBalanceModes = null;
        }
        if (availableWhiteBalanceModes != null) {
            jSONObject.put("whiteBalanceModes", new JSONArray(availableWhiteBalanceModes));
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CameraChallengeResult(classifier=" + this.f14513a + ", capabilities=" + this.f14514b + ", frames=" + this.f14515c + ')';
    }

    public /* synthetic */ CameraChallengeResult(String str, CameraCapabilities cameraCapabilities, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new C40557L0() : cameraCapabilities, (i11 & 4) != 0 ? new ArrayList() : list);
    }
}
