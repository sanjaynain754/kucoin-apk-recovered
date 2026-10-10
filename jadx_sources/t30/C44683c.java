package t30;

import com.kubi.host.HostManager;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: t30.c */
/* JADX INFO: compiled from: StringEx.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, m90084d2 = {"withHostIfNeeded", "", "TradeBaseLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44683c {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m98841a(@Nullable String str) {
        if (str == null || str.length() == 0 || StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str, "https://", false, 2, (Object) null)) {
            return str;
        }
        return StringsKt.trimEnd(HostManager.a.m(), '/') + '/' + StringsKt.trimStart(str, '/');
    }
}
