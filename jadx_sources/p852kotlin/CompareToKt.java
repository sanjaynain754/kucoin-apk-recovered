package p852kotlin;

import androidx.exifinterface.media.ExifInterface;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: compareTo.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0087\f¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"compareTo", "", ExifInterface.GPS_DIRECTION_TRUE, "", "other", "(Ljava/lang/Comparable;Ljava/lang/Object;)I", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CompareToKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.6")
    @InlineOnly
    private static final <T> int compareTo(Comparable<? super T> comparable, T t11) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        return comparable.compareTo(t11);
    }
}
