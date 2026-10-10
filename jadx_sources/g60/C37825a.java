package g60;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: renamed from: g60.a */
/* JADX INFO: compiled from: CacheUtil.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"CATEGORY", "", "COIN_HISTORY", "SYMBOL_HISTORY", "ACCOUNT_COIN_LIST", "putCacheString", "", "key", "value", "getCacheString", "defaultValue", "TransferLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37825a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m85377a(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return C46396e.m102351h("BTransfer", key, defaultValue);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m85378b(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return m85377a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m85379c(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46396e.m102358o("BTransfer", key, value);
    }
}
