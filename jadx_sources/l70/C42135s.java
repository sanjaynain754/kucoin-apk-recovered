package l70;

import com.kubi.mvi.common.CodeMessageException;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l70.s */
/* JADX INFO: compiled from: TrackExt.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0006"}, m90084d2 = {"pickException", "Lkotlin/Pair;", "", "", "code", "msg", "UserCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42135s {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Pair<String, String> m92467a(@Nullable Throwable th2, @NotNull String code, @Nullable String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (th2 == null) {
            return TuplesKt.m90091to(code, C27041f.m66668h(str));
        }
        if (th2 instanceof ApiException) {
            ApiException apiException = (ApiException) th2;
            return TuplesKt.m90091to(apiException.code, C27041f.m66669i(apiException.getMessage(), C27041f.m66668h(str)));
        }
        if (!(th2 instanceof CodeMessageException)) {
            return TuplesKt.m90091to(code, C27041f.m66669i(th2.getMessage(), C27041f.m66668h(str)));
        }
        CodeMessageException codeMessageException = (CodeMessageException) th2;
        return TuplesKt.m90091to(C27041f.m66669i(codeMessageException.getCode(), code), C27041f.m66669i(codeMessageException.getMessage(), C27041f.m66668h(str)));
    }
}
