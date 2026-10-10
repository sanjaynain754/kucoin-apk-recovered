package p058cj;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: cj.a */
/* JADX INFO: compiled from: LogEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"HOME_DEFAULT_LOG_TAG", "", "log", "", "tag", "logDebug", "block", "Lkotlin/Function0;", "logE", "", "HomeApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4988a {
    /* JADX INFO: renamed from: a */
    public static final void m5286a(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C44128b.m97259c(tag, str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5287b(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "home";
        }
        m5286a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5288c(@NotNull String tag, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(block, "block");
    }

    /* JADX INFO: renamed from: d */
    public static final void m5289d(@NotNull Throwable th2, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C44128b.m97263g(tag, th2);
    }
}
