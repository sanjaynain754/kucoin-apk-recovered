package com.kubi.config.kcrc;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.kubi.config.kcrc.b */
/* JADX INFO: compiled from: KCConst.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/config/kcrc/b;", "", "<init>", "()V", "", "b", "J", "()J", "MINIMUM_SECONDS", "", "", "c", "Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/List;", "ERROR_CODE_RE_ALL", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class C11416b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11416b f19681a = new C11416b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final long MINIMUM_SECONDS = 120;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> ERROR_CODE_RE_ALL = CollectionsKt.listOf((Object[]) new String[]{"900008", "900010", "900011"});

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<String> m20553a() {
        return ERROR_CODE_RE_ALL;
    }

    /* JADX INFO: renamed from: b */
    public final long m20554b() {
        return MINIMUM_SECONDS;
    }
}
