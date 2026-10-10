package p698vp;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: vp.a */
/* JADX INFO: compiled from: ExUtils.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m90084d2 = {"safeSubList", "", ExifInterface.GPS_DIRECTION_TRUE, "fromIndex", "", "toIndex", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45611a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> List<T> m100694a(@NotNull List<? extends T> list, int i11, int i12) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.subList(RangesKt.coerceAtLeast(i11, 0), RangesKt.coerceAtMost(i12, list.size()));
    }
}
