package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import java.util.Enumeration;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0087\b¨\u0006\u0004"}, m90084d2 = {"asSequence", "Lkotlin/sequences/Sequence;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/Enumeration;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/sequences/SequencesKt")
class SequencesKt__SequencesJVMKt extends SequencesKt__SequenceBuilderKt {
    @InlineOnly
    private static final <T> Sequence<T> asSequence(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return SequencesKt__SequencesKt.asSequence(CollectionsKt.iterator(enumeration));
    }
}
