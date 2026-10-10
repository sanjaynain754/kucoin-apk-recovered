package com.kubi.home.common;

import android.net.Uri;
import androidx.annotation.Keep;
import com.kubi.home.exception.HomeException;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: ReferralHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007J\u000e\u0010\u0010\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/home/common/ReferralHelper;", "", "<init>", "()V", "PATH_PREFIX", "", "referralHost", "getReferralHost", "()Ljava/lang/String;", "setReferralHost", "(Ljava/lang/String;)V", "cacheReferralHost", "", "functions", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "adjustHost", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nReferralHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferralHelper.kt\ncom/kubi/home/common/ReferralHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,66:1\n47#2,4:67\n*S KotlinDebug\n*F\n+ 1 ReferralHelper.kt\ncom/kubi/home/common/ReferralHelper\n*L\n33#1:67,4\n*E\n"})
public final class ReferralHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ReferralHelper f25587a = new ReferralHelper();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static String f25588b;

    /* JADX INFO: renamed from: com.kubi.home.common.ReferralHelper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 ReferralHelper.kt\ncom/kubi/home/common/ReferralHelper\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,49:1\n34#2,2:50\n36#2:54\n47#3,2:52\n*S KotlinDebug\n*F\n+ 1 ReferralHelper.kt\ncom/kubi/home/common/ReferralHelper\n*L\n35#1:52,2\n*E\n"})
    public static final class C14522a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            ReferralHelper.f25587a.m29043b(null);
            C43846g.m96568c(new HomeException(exception, "ReferralHelper", false, null, 8, null), null, 2, null);
        }

        public C14522a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m29042a(@Nullable List<FunctionEntity> list) {
        if (list == null || list.isEmpty()) {
            f25588b = null;
        } else {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("CacheReferralHost").plus(C42911a.m94120b()).plus(new C14522a(CoroutineExceptionHandler.INSTANCE))), null, null, new ReferralHelper$cacheReferralHost$2(list, null), 3, null);
        }
    }

    @Keep
    @NotNull
    public final String adjustHost(@Nullable String str) {
        String str2;
        String str3;
        if (str == null || (str2 = f25588b) == null || str2.length() == 0) {
            return str == null ? "" : str;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            str3 = str;
            try {
                str = StringsKt.replace$default(str3, C27041f.m66668h(Uri.parse(str).getHost()), C27041f.m66668h(f25588b), false, 4, (Object) null);
                try {
                    Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th3) {
                th = th3;
                str = str3;
            }
        } catch (Throwable th4) {
            th = th4;
            str3 = str;
        }
        C44128b.m97266j("ReferralHelper", "adjustHost: before=" + str3 + " , after=" + str);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m29043b(@Nullable String str) {
        f25588b = str;
    }
}
