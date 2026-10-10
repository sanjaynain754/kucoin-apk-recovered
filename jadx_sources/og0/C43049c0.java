package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: og0.c0 */
/* JADX INFO: compiled from: SystemProps.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, m90084d2 = {"", "propertyName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "()I", "AVAILABLE_PROCESSORS", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class C43049c0 {

    /* JADX INFO: renamed from: a */
    public static final int f95237a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static final int m94560a() {
        return f95237a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m94561b(@NotNull String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
