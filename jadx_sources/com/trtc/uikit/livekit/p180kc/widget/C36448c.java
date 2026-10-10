package com.trtc.uikit.livekit.p180kc.widget;

import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.c */
/* JADX INFO: compiled from: KCAudiencePreviewView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0000¨\u0006\u0006"}, m90084d2 = {"millisToParts", "Lcom/trtc/uikit/livekit/kc/widget/CountdownParts;", "remainingMillis", "", "twoDigits", "", "tuilivekit_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36448c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CountdownParts m81707a(long j11) {
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j11, 0L);
        long j12 = jCoerceAtLeast / 1000;
        return new CountdownParts(j12 / 86400, (j12 % 86400) / C33978va.f72340i, (j12 % C33978va.f72340i) / 60, j12 % 60, jCoerceAtLeast == 0);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m81708b(long j11) {
        return StringsKt.padStart(String.valueOf(j11), 2, '0');
    }
}
