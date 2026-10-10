package com.jumio.core.extraction.docfinder.classifier;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.sdk.document.JumioDocumentType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"TAG", "", "CONFIDENCE_LABEL_FALLBACK", "fromClassifiedType", "Lcom/jumio/sdk/document/JumioDocumentType;", "Lcom/jumio/sdk/document/JumioDocumentType$Companion;", "classifiedType", "jumio-docfinder_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocumentClassifierKt {
    @Nullable
    public static final JumioDocumentType fromClassifiedType(@NotNull JumioDocumentType.Companion companion, @NotNull String classifiedType) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(classifiedType, "classifiedType");
        int iHashCode = classifiedType.hashCode();
        if (iHashCode == 80) {
            if (classifiedType.equals("P")) {
                return JumioDocumentType.PASSPORT;
            }
            return null;
        }
        if (iHashCode == 86) {
            if (classifiedType.equals(ExifInterface.GPS_MEASUREMENT_INTERRUPTED)) {
                return JumioDocumentType.VISA;
            }
            return null;
        }
        if (iHashCode == 2184) {
            if (classifiedType.equals("DL")) {
                return JumioDocumentType.DRIVING_LICENSE;
            }
            return null;
        }
        if (iHashCode == 2331 && classifiedType.equals("ID")) {
            return JumioDocumentType.ID_CARD;
        }
        return null;
    }
}
