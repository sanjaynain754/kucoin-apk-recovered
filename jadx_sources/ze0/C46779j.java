package ze0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmInline;

/* JADX INFO: renamed from: ze0.j */
/* JADX INFO: compiled from: CapacityCalculator.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, m90084d2 = {"Lze0/j;", "", "", "value", "b", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "other", "", "c", "(ILjava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getValue", "()I", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@JvmInline
public final class C46779j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int value;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C46779j m103088a(int i11) {
        return new C46779j(i11);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m103090c(int i11, Object obj) {
        return (obj instanceof C46779j) && i11 == ((C46779j) obj).getValue();
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m103091d(int i11, int i12) {
        return i11 == i12;
    }

    public boolean equals(Object obj) {
        return m103090c(this.value, obj);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m103092e(this.value);
    }

    @NotNull
    public String toString() {
        return m103093f(this.value);
    }

    public /* synthetic */ C46779j(int i11) {
        this.value = i11;
    }

    /* JADX INFO: renamed from: e */
    public static int m103092e(int i11) {
        return Integer.hashCode(i11);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static String m103093f(int i11) {
        return String.valueOf(i11);
    }

    /* JADX INFO: renamed from: b */
    public static int m103089b(int i11) {
        return i11;
    }
}
