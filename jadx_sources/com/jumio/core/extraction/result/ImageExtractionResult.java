package com.jumio.core.extraction.result;

import android.graphics.Bitmap;
import com.jumio.commons.camera.ImageMetadata;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m90084d2 = {"Lcom/jumio/core/extraction/result/ImageExtractionResult;", "Lcom/jumio/core/extraction/result/ExtractionResult;", "bitmap", "Landroid/graphics/Bitmap;", "side", "", DocumentClassifier.KEY_SIDE, "batchId", "imageMetadata", "Lcom/jumio/commons/camera/ImageMetadata;", "cameraConnectionData", "Lcom/jumio/core/camera/CameraConnectionData;", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/commons/camera/ImageMetadata;Lcom/jumio/core/camera/CameraConnectionData;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getSide", "()Ljava/lang/String;", "getClassifier", "getBatchId", "getImageMetadata", "()Lcom/jumio/commons/camera/ImageMetadata;", "getCameraConnectionData", "()Lcom/jumio/core/camera/CameraConnectionData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ImageExtractionResult extends ExtractionResult {

    /* JADX INFO: renamed from: d */
    public final Bitmap f14143d;

    /* JADX INFO: renamed from: e */
    public final String f14144e;

    /* JADX INFO: renamed from: f */
    public final String f14145f;

    /* JADX INFO: renamed from: g */
    public final String f14146g;

    /* JADX INFO: renamed from: h */
    public final ImageMetadata f14147h;

    /* JADX INFO: renamed from: i */
    public final CameraConnectionData f14148i;

    public /* synthetic */ ImageExtractionResult(Bitmap bitmap, String str, String str2, String str3, ImageMetadata imageMetadata, CameraConnectionData cameraConnectionData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, str, (i11 & 4) != 0 ? str : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : imageMetadata, (i11 & 32) != 0 ? null : cameraConnectionData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageExtractionResult)) {
            return false;
        }
        ImageExtractionResult imageExtractionResult = (ImageExtractionResult) other;
        return Intrinsics.areEqual(this.f14143d, imageExtractionResult.f14143d) && Intrinsics.areEqual(this.f14144e, imageExtractionResult.f14144e) && Intrinsics.areEqual(this.f14145f, imageExtractionResult.f14145f) && Intrinsics.areEqual(this.f14146g, imageExtractionResult.f14146g) && Intrinsics.areEqual(this.f14147h, imageExtractionResult.f14147h) && Intrinsics.areEqual(this.f14148i, imageExtractionResult.f14148i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageExtractionResult(@NotNull Bitmap bitmap, @NotNull String side, @NotNull String classifier, @Nullable String str, @Nullable ImageMetadata imageMetadata, @Nullable CameraConnectionData cameraConnectionData) {
        super(side, classifier, null, 4, null);
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f14143d = bitmap;
        this.f14144e = side;
        this.f14145f = classifier;
        this.f14146g = str;
        this.f14147h = imageMetadata;
        this.f14148i = cameraConnectionData;
    }

    public static /* synthetic */ ImageExtractionResult copy$default(ImageExtractionResult imageExtractionResult, Bitmap bitmap, String str, String str2, String str3, ImageMetadata imageMetadata, CameraConnectionData cameraConnectionData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bitmap = imageExtractionResult.f14143d;
        }
        if ((i11 & 2) != 0) {
            str = imageExtractionResult.f14144e;
        }
        if ((i11 & 4) != 0) {
            str2 = imageExtractionResult.f14145f;
        }
        if ((i11 & 8) != 0) {
            str3 = imageExtractionResult.f14146g;
        }
        if ((i11 & 16) != 0) {
            imageMetadata = imageExtractionResult.f14147h;
        }
        if ((i11 & 32) != 0) {
            cameraConnectionData = imageExtractionResult.f14148i;
        }
        ImageMetadata imageMetadata2 = imageMetadata;
        CameraConnectionData cameraConnectionData2 = cameraConnectionData;
        return imageExtractionResult.copy(bitmap, str, str2, str3, imageMetadata2, cameraConnectionData2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getF14143d() {
        return this.f14143d;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF14144e() {
        return this.f14144e;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF14145f() {
        return this.f14145f;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getF14146g() {
        return this.f14146g;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImageMetadata getF14147h() {
        return this.f14147h;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CameraConnectionData getF14148i() {
        return this.f14148i;
    }

    @NotNull
    public final ImageExtractionResult copy(@NotNull Bitmap bitmap, @NotNull String side, @NotNull String classifier, @Nullable String batchId, @Nullable ImageMetadata imageMetadata, @Nullable CameraConnectionData cameraConnectionData) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        return new ImageExtractionResult(bitmap, side, classifier, batchId, imageMetadata, cameraConnectionData);
    }

    @Override // com.jumio.core.extraction.result.ExtractionResult
    @Nullable
    /* JADX INFO: renamed from: getBatchId */
    public String getF14142c() {
        return this.f14146g;
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.f14143d;
    }

    @Nullable
    public final CameraConnectionData getCameraConnectionData() {
        return this.f14148i;
    }

    @Override // com.jumio.core.extraction.result.ExtractionResult
    @NotNull
    /* JADX INFO: renamed from: getClassifier */
    public String getF14141b() {
        return this.f14145f;
    }

    @Nullable
    public final ImageMetadata getImageMetadata() {
        return this.f14147h;
    }

    @Override // com.jumio.core.extraction.result.ExtractionResult
    @NotNull
    /* JADX INFO: renamed from: getSide */
    public String getF14140a() {
        return this.f14144e;
    }

    public int hashCode() {
        int iM89148a = AbstractC40511C.m89148a(this.f14145f, AbstractC40511C.m89148a(this.f14144e, this.f14143d.hashCode() * 31, 31), 31);
        String str = this.f14146g;
        int iHashCode = (iM89148a + (str == null ? 0 : str.hashCode())) * 31;
        ImageMetadata imageMetadata = this.f14147h;
        int iHashCode2 = (iHashCode + (imageMetadata == null ? 0 : imageMetadata.hashCode())) * 31;
        CameraConnectionData cameraConnectionData = this.f14148i;
        return iHashCode2 + (cameraConnectionData != null ? cameraConnectionData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ImageExtractionResult(bitmap=" + this.f14143d + ", side=" + this.f14144e + ", classifier=" + this.f14145f + ", batchId=" + this.f14146g + ", imageMetadata=" + this.f14147h + ", cameraConnectionData=" + this.f14148i + ')';
    }
}
