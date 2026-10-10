package p852kotlin.reflect.jvm.internal.impl.types;

import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: loaded from: classes61.dex */
public abstract class TypeProjectionBase implements TypeProjection {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeProjection)) {
            return false;
        }
        TypeProjection typeProjection = (TypeProjection) obj;
        return isStarProjection() == typeProjection.isStarProjection() && getProjectionKind() == typeProjection.getProjectionKind() && getType().equals(typeProjection.getType());
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2 = getProjectionKind().hashCode();
        if (TypeUtils.noExpectedType(getType())) {
            return (iHashCode2 * 31) + 19;
        }
        int i11 = iHashCode2 * 31;
        if (isStarProjection()) {
            iHashCode = 17;
        } else {
            iHashCode = getType().hashCode();
        }
        return i11 + iHashCode;
    }

    public String toString() {
        if (isStarProjection()) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        if (getProjectionKind() == Variance.INVARIANT) {
            return getType().toString();
        }
        return getProjectionKind() + C33627eb.f69716f + getType();
    }
}
