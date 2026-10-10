package com.kubi.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.math.BigDecimal;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.utils.e0 */
/* JADX INFO: compiled from: ObjectUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/utils/e0;", "", "<init>", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27022e0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27022e0 f54314a = new C27022e0();

    /* JADX INFO: renamed from: a */
    public final boolean m66528a(@Nullable Object a11, @Nullable Object b11) {
        if ((a11 instanceof BigDecimal) && (b11 instanceof BigDecimal)) {
            return ((BigDecimal) a11).compareTo((BigDecimal) b11) == 0;
        }
        return Objects.equals(a11, b11);
    }
}
