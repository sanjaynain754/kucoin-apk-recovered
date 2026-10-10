package com.kubi.utils;

import android.util.Patterns;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.u0 */
/* JADX INFO: compiled from: StringUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/utils/u0;", "", "<init>", "()V", "", TypedValues.Custom.S_STRING, "", "b", "(Ljava/lang/String;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Ljava/lang/String;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27094u0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27094u0 f54451a = new C27094u0();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m66899a(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Matcher matcher = Patterns.WEB_URL.matcher(string);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m66900b(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = string.charAt(i11);
            if (19968 > cCharAt || cCharAt >= 40869) {
                return false;
            }
        }
        return true;
    }
}
