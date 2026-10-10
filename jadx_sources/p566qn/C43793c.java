package p566qn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import ro.C44128b;

/* JADX INFO: renamed from: qn.c */
/* JADX INFO: compiled from: JumioLog.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007J \u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/JumioLog;", "", "<init>", "()V", "TAG", "", "logInfo", "", "msg", "logError", "throwable", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43793c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43793c f96846a = new C43793c();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96450a(@Nullable String str, @Nullable Throwable th2) {
        C44128b.m97262f("FaceSDK-Jumio", str, th2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96451b(String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        m96450a(str, th2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m96452c(@Nullable String str) {
        if (str == null) {
            return;
        }
        C44128b.m97266j("FaceSDK-Jumio", str);
    }
}
