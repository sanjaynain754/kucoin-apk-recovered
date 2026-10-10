package w80;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: renamed from: w80.b */
/* JADX INFO: compiled from: KWebMMKVUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/widget/web/utils/KWebMMKVUtils;", "", "<init>", "()V", "category", "", "getString", "key", "defaultValue", "putString", "", "value", "getBoolean", "", "putBoolean", "remove", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45757b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45757b f103175a = new C45757b();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m101020b(C45757b c45757b, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return c45757b.m101021a(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m101021a(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return C46396e.m102351h("kweb_widget", key, defaultValue);
    }

    /* JADX INFO: renamed from: c */
    public final void m101022c(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C46396e.m102358o("kweb_widget", key, value);
    }

    /* JADX INFO: renamed from: d */
    public final void m101023d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C46396e.m102360q("kweb_widget", key);
    }
}
