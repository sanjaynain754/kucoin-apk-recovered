package p852kotlin.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"iterator", "", ExifInterface.GPS_DIRECTION_TRUE, "array", "", "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ArrayIteratorKt {
    @NotNull
    public static final <T> Iterator<T> iterator(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new ArrayIterator(array);
    }
}
