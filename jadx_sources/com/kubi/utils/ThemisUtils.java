package com.kubi.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ThemisUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/utils/ThemisUtils;", "", "<init>", "()V", "", "b", "()Z", "", "Lkotlin/Lazy;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", FirebaseAnalytics.Param.LEVEL, "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ThemisUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ThemisUtils f54260a = new ThemisUtils();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy level = LazyKt.lazy(new Function0<Integer>() { // from class: com.kubi.utils.ThemisUtils$level$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            int iM66936i;
            try {
                iM66936i = C27102y0.m66936i(C27059l.f54343a.m66757a());
            } catch (Throwable unused) {
                iM66936i = 2;
            }
            return Integer.valueOf(iM66936i);
        }
    });

    /* JADX INFO: renamed from: a */
    public final int m66412a() {
        return ((Number) level.getValue()).intValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m66413b() {
        if (m66412a() < 1) {
            return true;
        }
        return false;
    }
}
