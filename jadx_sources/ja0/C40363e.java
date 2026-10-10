package ja0;

import com.revolut.revolutpay.data.SessionDto;
import ma0.C42499c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ja0.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C40363e {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C42499c m88947a(@NotNull SessionDto sessionDto) {
        Intrinsics.checkNotNullParameter(sessionDto, "<this>");
        String token = sessionDto.getToken();
        if (token == null) {
            token = "";
        }
        return new C42499c(token);
    }
}
