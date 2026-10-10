package com.jumio.core.error;

import android.content.Context;
import com.jumio.core.enums.ErrorCase;
import com.jumio.sdk.error.JumioError;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/error/Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCase", "Lcom/jumio/core/enums/ErrorCase;", "call", "", "detailCode", "<init>", "(Lcom/jumio/core/enums/ErrorCase;II)V", "isRetryable", "", "()Z", "domain", "", "getDomain", "()Ljava/lang/String;", "code", "getCode", "getMessage", "context", "Landroid/content/Context;", "getJumioError", "Lcom/jumio/sdk/error/JumioError;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Error extends Exception {

    /* JADX INFO: renamed from: a */
    public final ErrorCase f13839a;

    /* JADX INFO: renamed from: b */
    public final int f13840b;

    /* JADX INFO: renamed from: c */
    public final int f13841c;

    public /* synthetic */ Error(ErrorCase errorCase, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCase, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }

    public Error(@NotNull ErrorCase errorCase, int i11, int i12) {
        Intrinsics.checkNotNullParameter(errorCase, "errorCase");
        this.f13839a = errorCase;
        this.f13840b = i11;
        this.f13841c = i12;
    }

    @NotNull
    public final String getCode() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.ENGLISH, "%s%02d%04d", Arrays.copyOf(new Object[]{this.f13839a.getF13829a(), Integer.valueOf(this.f13840b), Integer.valueOf(this.f13841c)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @NotNull
    public final String getDomain() {
        return this.f13839a.getF13829a();
    }

    @NotNull
    public final JumioError getJumioError(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zIsRetryable = isRetryable();
        String domain = getDomain();
        String code = getCode();
        String string = context.getString(this.f13839a.getF13830b());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new JumioError(zIsRetryable, domain, code, string);
    }

    @NotNull
    public final String getMessage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getString(this.f13839a.getF13830b()) + ' ' + getCode();
    }

    public final boolean isRetryable() {
        return this.f13839a.getF13831c();
    }
}
