package shark;

import java.lang.reflect.Field;
import p852kotlin.Metadata;
import p852kotlin.TypeCastException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: shark.f */
/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"", "e", "()I", "", "d", "()Ljava/lang/String;", "f", "shark"}, m90085k = 2, m90086mv = {1, 4, 1})
public final class C44453f {
    /* JADX INFO: renamed from: d */
    public static final String m98172d() {
        try {
            Object obj = Class.forName("android.os.Build").getDeclaredField("MANUFACTURER").get(null);
            if (obj != null) {
                return (String) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m98173e() {
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").get(null);
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final String m98174f() {
        try {
            Field versionField = Class.forName("leakcanary.internal.InternalLeakCanary").getDeclaredField("version");
            Intrinsics.checkExpressionValueIsNotNull(versionField, "versionField");
            versionField.setAccessible(true);
            Object obj = versionField.get(null);
            if (obj != null) {
                return (String) obj;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return "Unknown";
        }
    }
}
