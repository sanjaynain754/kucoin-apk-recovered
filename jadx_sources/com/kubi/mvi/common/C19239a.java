package com.kubi.mvi.common;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.mvi.common.a */
/* JADX INFO: compiled from: CodeMessageException.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0010\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"", "", "code", "", "message", "Lcom/kubi/mvi/common/CodeMessageException;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/mvi/common/CodeMessageException;", "MVI_release"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class C19239a {
    @Deprecated(message = "Deprecated")
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CodeMessageException m42525a(@NotNull Throwable th2, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return new CodeMessageException(C27041f.m66668h(num != null ? num.toString() : null), str, th2);
    }
}
