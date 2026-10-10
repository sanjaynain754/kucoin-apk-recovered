package ro;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.log.core.C17473a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ro.c */
/* JADX INFO: compiled from: LoggerSymbol.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"", "tag", "name", "data", "desc", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Logger_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C44129c {
    /* JADX INFO: renamed from: a */
    public static final void m97271a(@NotNull String tag, @NotNull String name, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(name, "name");
        C17473a.f32591a.m37856a().getSymbolProcessor().mo98545a(tag, name, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m97272b(String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        m97271a(str, str2, str3, str4);
    }
}
