package com.jumio.core.extraction.result;

import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/extraction/result/ExtractionResult;", "Ljava/io/Serializable;", "side", "", DocumentClassifier.KEY_SIDE, "batchId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSide", "()Ljava/lang/String;", "getClassifier", "getBatchId", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class ExtractionResult implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f14140a;

    /* JADX INFO: renamed from: b */
    public final String f14141b;

    /* JADX INFO: renamed from: c */
    public final String f14142c;

    public ExtractionResult(@NotNull String side, @NotNull String classifier, @Nullable String str) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        this.f14140a = side;
        this.f14141b = classifier;
        this.f14142c = str;
    }

    @Nullable
    /* JADX INFO: renamed from: getBatchId, reason: from getter */
    public String getF14142c() {
        return this.f14142c;
    }

    @NotNull
    /* JADX INFO: renamed from: getClassifier, reason: from getter */
    public String getF14141b() {
        return this.f14141b;
    }

    @NotNull
    /* JADX INFO: renamed from: getSide, reason: from getter */
    public String getF14140a() {
        return this.f14140a;
    }

    public /* synthetic */ ExtractionResult(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? str : str2, (i11 & 4) != 0 ? null : str3);
    }
}
