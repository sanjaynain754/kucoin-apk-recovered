package p852kotlin;

import p852kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: HashCode.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\u001a\u000f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0087\b¨\u0006\u0003"}, m90084d2 = {"hashCode", "", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HashCodeKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
