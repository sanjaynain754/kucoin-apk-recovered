package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33978va;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.e0 */
/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lkotlinx/serialization/json/internal/e0;", "", "<init>", "()V", "Lvg0/f;", "sd", "", "c", "(Lvg0/f;)V", "", "index", "g", "(I)V", "key", "f", "(Ljava/lang/Object;)V", "d", "b", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "toString", "e", "", "[Ljava/lang/Object;", "currentObjectPath", "", "[I", "indicies", "I", "currentDepth", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C41922e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Object[] currentObjectPath = new Object[8];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public int[] indicies;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int currentDepth;

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.e0$a */
    /* JADX INFO: compiled from: JsonPath.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lkotlinx/serialization/json/internal/e0$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f92113a = new a();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m91932a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i11 = this.currentDepth + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = this.currentObjectPath[i12];
            if (obj instanceof InterfaceC45533f) {
                InterfaceC45533f interfaceC45533f = (InterfaceC45533f) obj;
                if (!Intrinsics.areEqual(interfaceC45533f.getKind(), AbstractC45542o.b.f102631a)) {
                    int i13 = this.indicies[i12];
                    if (i13 >= 0) {
                        sb2.append(C33978va.f72339h);
                        sb2.append(interfaceC45533f.mo91527f(i13));
                    }
                } else if (this.indicies[i12] != -1) {
                    sb2.append("[");
                    sb2.append(this.indicies[i12]);
                    sb2.append("]");
                }
            } else if (obj != a.f92113a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final void m91933b() {
        int i11 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i11] == -2) {
            iArr[i11] = -1;
            this.currentDepth = i11 - 1;
        }
        int i12 = this.currentDepth;
        if (i12 != -1) {
            this.currentDepth = i12 - 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m91934c(@NotNull InterfaceC45533f sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i11 = this.currentDepth + 1;
        this.currentDepth = i11;
        if (i11 == this.currentObjectPath.length) {
            m91936e();
        }
        this.currentObjectPath[i11] = sd2;
    }

    /* JADX INFO: renamed from: d */
    public final void m91935d() {
        int[] iArr = this.indicies;
        int i11 = this.currentDepth;
        if (iArr[i11] == -2) {
            this.currentObjectPath[i11] = a.f92113a;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m91936e() {
        int i11 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i11);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i11);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.indicies = iArrCopyOf;
    }

    /* JADX INFO: renamed from: f */
    public final void m91937f(@Nullable Object key) {
        int[] iArr = this.indicies;
        int i11 = this.currentDepth;
        if (iArr[i11] != -2) {
            int i12 = i11 + 1;
            this.currentDepth = i12;
            if (i12 == this.currentObjectPath.length) {
                m91936e();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i13 = this.currentDepth;
        objArr[i13] = key;
        this.indicies[i13] = -2;
    }

    /* JADX INFO: renamed from: g */
    public final void m91938g(int index) {
        this.indicies[this.currentDepth] = index;
    }

    public C41922e0() {
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    @NotNull
    public String toString() {
        return m91932a();
    }
}
