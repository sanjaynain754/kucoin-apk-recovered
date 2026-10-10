package com.jumio.core.extraction.result;

import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\bÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/extraction/result/ExtractionResultProvider;", "", "getExtractionResult", "Lcom/jumio/core/extraction/result/ExtractionResult;", "side", "", DocumentClassifier.KEY_SIDE, "batchId", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ExtractionResultProvider {
    @NotNull
    ExtractionResult getExtractionResult(@NotNull String side, @NotNull String classifier, @Nullable String batchId);

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ ExtractionResult getExtractionResult$default(ExtractionResultProvider extractionResultProvider, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExtractionResult");
        }
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return extractionResultProvider.getExtractionResult(str, str2, str3);
    }
}
