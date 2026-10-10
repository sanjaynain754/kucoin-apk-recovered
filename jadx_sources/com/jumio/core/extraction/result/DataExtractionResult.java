package com.jumio.core.extraction.result;

import com.jumio.analytics.MetaInfo;
import com.jumio.core.data.scan.DataInterface;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import jumio.core.AbstractC40511C;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m90084d2 = {"Lcom/jumio/core/extraction/result/DataExtractionResult;", "Lcom/jumio/core/extraction/result/ExtractionResult;", "side", "", DocumentClassifier.KEY_SIDE, "batchId", "data", "Lcom/jumio/core/data/scan/DataInterface;", "metaInfo", "Lcom/jumio/analytics/MetaInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/core/data/scan/DataInterface;Lcom/jumio/analytics/MetaInfo;)V", "getSide", "()Ljava/lang/String;", "getClassifier", "getBatchId", "getData", "()Lcom/jumio/core/data/scan/DataInterface;", "getMetaInfo", "()Lcom/jumio/analytics/MetaInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DataExtractionResult extends ExtractionResult {

    /* JADX INFO: renamed from: d */
    public final String f14135d;

    /* JADX INFO: renamed from: e */
    public final String f14136e;

    /* JADX INFO: renamed from: f */
    public final String f14137f;

    /* JADX INFO: renamed from: g */
    public final DataInterface f14138g;

    /* JADX INFO: renamed from: h */
    public final MetaInfo f14139h;

    public /* synthetic */ DataExtractionResult(String str, String str2, String str3, DataInterface dataInterface, MetaInfo metaInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? str : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : dataInterface, (i11 & 16) != 0 ? null : metaInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataExtractionResult)) {
            return false;
        }
        DataExtractionResult dataExtractionResult = (DataExtractionResult) other;
        return Intrinsics.areEqual(this.f14135d, dataExtractionResult.f14135d) && Intrinsics.areEqual(this.f14136e, dataExtractionResult.f14136e) && Intrinsics.areEqual(this.f14137f, dataExtractionResult.f14137f) && Intrinsics.areEqual(this.f14138g, dataExtractionResult.f14138g) && Intrinsics.areEqual(this.f14139h, dataExtractionResult.f14139h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataExtractionResult(@NotNull String side, @NotNull String classifier, @Nullable String str, @Nullable DataInterface<?> dataInterface, @Nullable MetaInfo metaInfo) {
        super(side, classifier, null, 4, null);
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f14135d = side;
        this.f14136e = classifier;
        this.f14137f = str;
        this.f14138g = dataInterface;
        this.f14139h = metaInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataExtractionResult copy$default(DataExtractionResult dataExtractionResult, String str, String str2, String str3, DataInterface dataInterface, MetaInfo metaInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dataExtractionResult.f14135d;
        }
        if ((i11 & 2) != 0) {
            str2 = dataExtractionResult.f14136e;
        }
        if ((i11 & 4) != 0) {
            str3 = dataExtractionResult.f14137f;
        }
        if ((i11 & 8) != 0) {
            dataInterface = dataExtractionResult.f14138g;
        }
        if ((i11 & 16) != 0) {
            metaInfo = dataExtractionResult.f14139h;
        }
        MetaInfo metaInfo2 = metaInfo;
        String str4 = str3;
        return dataExtractionResult.copy(str, str2, str4, dataInterface, metaInfo2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14135d() {
        return this.f14135d;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF14136e() {
        return this.f14136e;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF14137f() {
        return this.f14137f;
    }

    @Nullable
    public final DataInterface<?> component4() {
        return this.f14138g;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetaInfo getF14139h() {
        return this.f14139h;
    }

    @NotNull
    public final DataExtractionResult copy(@NotNull String side, @NotNull String classifier, @Nullable String batchId, @Nullable DataInterface<?> data, @Nullable MetaInfo metaInfo) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        return new DataExtractionResult(side, classifier, batchId, data, metaInfo);
    }

    @Override // com.jumio.core.extraction.result.ExtractionResult
    @Nullable
    /* JADX INFO: renamed from: getBatchId */
    public String getF14142c() {
        return this.f14137f;
    }

    @Override // com.jumio.core.extraction.result.ExtractionResult
    @NotNull
    /* JADX INFO: renamed from: getClassifier */
    public String getF14141b() {
        return this.f14136e;
    }

    @Nullable
    public final DataInterface<?> getData() {
        return this.f14138g;
    }

    @Nullable
    public final MetaInfo getMetaInfo() {
        return this.f14139h;
    }

    @Override // com.jumio.core.extraction.result.ExtractionResult
    @NotNull
    /* JADX INFO: renamed from: getSide */
    public String getF14140a() {
        return this.f14135d;
    }

    public int hashCode() {
        int iM89148a = AbstractC40511C.m89148a(this.f14136e, this.f14135d.hashCode() * 31, 31);
        String str = this.f14137f;
        int iHashCode = (iM89148a + (str == null ? 0 : str.hashCode())) * 31;
        DataInterface dataInterface = this.f14138g;
        int iHashCode2 = (iHashCode + (dataInterface == null ? 0 : dataInterface.hashCode())) * 31;
        MetaInfo metaInfo = this.f14139h;
        return iHashCode2 + (metaInfo != null ? metaInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataExtractionResult(side=" + this.f14135d + ", classifier=" + this.f14136e + ", batchId=" + this.f14137f + ", data=" + this.f14138g + ", metaInfo=" + this.f14139h + ')';
    }
}
