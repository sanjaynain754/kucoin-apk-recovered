package com.kubi.operation.lib.utils;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.kubi.event.api.C12572a;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43846g;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.operation.lib.utils.t */
/* JADX INFO: compiled from: OperationExt.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u000e\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\u000b\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\f\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0000\u001a\u0018\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\b\u0010\u0013\u001a\u00020\u0006H\u0000\"\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"loadIcon", "", "Landroid/widget/ImageView;", "url", "", "holderOrError", "", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "formatedChangeRate", "cardRemove", "log", "safeRemoteText", "rewardAmountRtlAdjust", "safeEqual", "", "Ljava/math/BigDecimal;", "other", "currentLottieAnimCount", "Ljava/lang/Integer;", "lottieAnimCount", "OperationLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOperationExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationExt.kt\ncom/kubi/operation/lib/utils/OperationExtKt\n+ 2 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n45#2,2:184\n35#3,4:186\n39#3:192\n44#4,2:190\n1#5:193\n*S KotlinDebug\n*F\n+ 1 OperationExt.kt\ncom/kubi/operation/lib/utils/OperationExtKt\n*L\n124#1:184,2\n159#1:186,4\n159#1:192\n159#1:190,2\n*E\n"})
public final class C19570t {
    /* JADX INFO: renamed from: b */
    public static final void m43664b(@Nullable String str) {
        if (str != null) {
            C12572a.m23695d("com.kubi.home.event.HomeEvent:removeHomeCard", str, 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m43666d(@Nullable final ImageView imageView, @Nullable final String str, @Nullable final Integer num) {
        if (imageView == null) {
            return;
        }
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.utils.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19570t.m43668f(imageView, str, num);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m43667e(ImageView imageView, String str, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        m43666d(imageView, str, num);
    }

    /* JADX INFO: renamed from: g */
    public static final void m43669g(@Nullable String str) {
        C44128b.m97259c("Operation", str);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m43670h(@Nullable String str) {
        String strM92640e;
        String strM93901b;
        BigDecimal bigDecimalM66654n;
        String strM92642g;
        String str2 = str == null ? "" : str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "%", false, 2, (Object) null)) {
            BigDecimal bigDecimalM66671k = C27041f.m66671k(StringsKt.replace$default(str2, "%", "", false, 4, (Object) null));
            if (bigDecimalM66671k != null && (bigDecimalM66654n = C27039d.m66654n(bigDecimalM66671k)) != null && (strM92642g = C42180b.m92642g(bigDecimalM66654n, null, null, 0, false, false, false, 31, null)) != null) {
                return strM92642g;
            }
        } else {
            List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{C33627eb.f69716f}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                BigDecimal bigDecimalM66671k2 = C27041f.m66671k((String) listSplit$default.get(0));
                if (bigDecimalM66671k2 != null && (strM92640e = C42180b.m92640e(bigDecimalM66671k2, null, 0, false, false, false, 0, null, 127, null)) != null) {
                    String str3 = strM92640e + C33627eb.f69716f;
                    if (str3 != null) {
                        String str4 = str3 + ((String) listSplit$default.get(1));
                        if (str4 != null && (strM93901b = C42828b.m93901b(str4, null, 1, null)) != null) {
                            return strM93901b;
                        }
                    }
                }
            } else {
                String strM93901b2 = C42828b.m93901b(str2, null, 1, null);
                if (strM93901b2 != null) {
                    return strM93901b2;
                }
            }
        }
        return str2;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m43671i(@Nullable String str) {
        Object objM103844constructorimpl;
        if (str == null) {
            return "";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "{num}", "%s", false, 4, (Object) null), "{num1}", "%1$s", false, 4, (Object) null), "{num2}", "%2$s", false, 4, (Object) null), "{num3}", "%3$s", false, 4, (Object) null), "{num4}", "%4$s", false, 4, (Object) null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new OperationException(thM103847exceptionOrNullimpl, "OperationExt", false, null, 8, null), null, 2, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str2 = (String) objM103844constructorimpl;
        return str2 == null ? "" : str2;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m43665c(@Nullable String str) {
        BigDecimal bigDecimalM66671k = C27041f.m66671k(str);
        if (bigDecimalM66671k == null) {
            return "--";
        }
        return C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 23, null);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m43668f(ImageView imageView, String str, Integer num) {
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(imageView.getContext()).mo6634v(str);
        Intrinsics.checkNotNullExpressionValue(c46340cMo6634v, "load(...)");
        if (num != null) {
            c46340cMo6634v.mo92188b0(num.intValue()).mo92208m(num.intValue()).m6594E0(imageView);
        } else {
            c46340cMo6634v.m6594E0(imageView);
        }
        return Unit.INSTANCE;
    }
}
