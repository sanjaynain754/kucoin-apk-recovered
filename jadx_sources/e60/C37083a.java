package e60;

import com.kubi.network.retrofit.exception.ApiException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import retrofit2.HttpException;

/* JADX INFO: renamed from: e60.a */
/* JADX INFO: compiled from: RetrofitResultExt.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"errorCode", "", "", "(Ljava/lang/Throwable;)Ljava/lang/Integer;", "TransferApi_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37083a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Integer m83005a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (th2 instanceof ApiException) {
            String code = ((ApiException) th2).code;
            Intrinsics.checkNotNullExpressionValue(code, "code");
            return StringsKt.toIntOrNull(code);
        }
        if (th2 instanceof HttpException) {
            return Integer.valueOf(((HttpException) th2).code());
        }
        return null;
    }
}
