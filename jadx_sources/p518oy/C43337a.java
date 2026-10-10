package p518oy;

import com.kubi.sdk.exception.AppBaseException;
import com.kubi.sdk.exception.AppBaseMessage;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oy.a */
/* JADX INFO: compiled from: AppBaseIssue.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0080\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u000b\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"CATEGORY", "", "categoryException", "", "e", "", "source", "categoryMessage", "msg", "reportMsg", "Lkotlin/Result;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "reportException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/Object;", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43337a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Object m95403a(@NotNull Throwable e11, @NotNull String source) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = String.format("base|appBase|%s|ignore=%s", Arrays.copyOf(new Object[]{source, Boolean.FALSE}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            C43846g.m96568c(new AppBaseException(e11, str, false, null, 12, null), null, 2, null);
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Object m95404b(@NotNull String msg, @NotNull String source) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = String.format("base|appBase|%s|ignore=%s", Arrays.copyOf(new Object[]{source, Boolean.FALSE}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            C43846g.m96568c(new AppBaseMessage(msg, str, false, 4, null), null, 2, null);
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
