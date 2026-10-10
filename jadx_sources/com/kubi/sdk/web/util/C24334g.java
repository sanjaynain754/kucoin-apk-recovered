package com.kubi.sdk.web.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.web.match.C24322a;
import com.kubi.sdk.web.match.C24323b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.g */
/* JADX INFO: compiled from: ReportFilterUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/web/util/g;", "", "<init>", "()V", "", "path", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24334g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24334g f48568a = new C24334g();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m58881a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (C24323b.f48518a.m58823c(path) || C24322a.f48515a.m58817b(path)) {
            return path;
        }
        C44128b.m97266j("ReportFilterUtils", "path not match: " + path);
        return "other";
    }
}
