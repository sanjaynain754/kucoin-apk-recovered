package p764xk;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: xk.e */
/* JADX INFO: compiled from: IRefreshTokenSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/callback/IRefreshTokenSPI;", "", "onRefreshToken", "", "triggerPath", "", "expiredToken", "getRefreshedToken", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46257e {
    @Nullable
    /* JADX INFO: renamed from: b */
    String m102017b(@Nullable String str);

    /* JADX INFO: renamed from: c */
    boolean m102018c(@NotNull String str, @Nullable String str2);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m102016a(InterfaceC46257e interfaceC46257e, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRefreshToken");
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return interfaceC46257e.m102018c(str, str2);
    }
}
