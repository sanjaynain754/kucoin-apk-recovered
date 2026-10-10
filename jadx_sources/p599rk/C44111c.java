package p599rk;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rk.c */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Ljava/math/BigDecimal;", "Lrk/b;", "c", "(Ljava/math/BigDecimal;)Lrk/b;", "", "default", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lrk/b;Ljava/lang/String;)Lrk/b;", "shared_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C44111c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C44110b m97190a(@Nullable C44110b c44110b, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return c44110b == null ? new C44110b(str) : c44110b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C44110b m97191b(C44110b c44110b, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "0";
        }
        return m97190a(c44110b, str);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C44110b m97192c(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return new C44110b(bigDecimal);
    }
}
