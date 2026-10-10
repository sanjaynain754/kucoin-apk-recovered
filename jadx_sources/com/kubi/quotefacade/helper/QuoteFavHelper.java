package com.kubi.quotefacade.helper;

import android.annotation.SuppressLint;
import com.kubi.config.exception.KCConfigException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuoteFavHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/QuoteFavHelper;", "", "<init>", "()V", "TAG", "", "ioScope", "Lcom/kubi/quotefacade/helper/QuoteCoroutineScope;", "init", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteFavHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFavHelper.kt\ncom/kubi/quotefacade/helper/QuoteFavHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,44:1\n47#2,4:45\n*S KotlinDebug\n*F\n+ 1 QuoteFavHelper.kt\ncom/kubi/quotefacade/helper/QuoteFavHelper\n*L\n21#1:45,4\n*E\n"})
public final class QuoteFavHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final QuoteFavHelper f41941a = new QuoteFavHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final QuoteCoroutineScope f41942b = new QuoteCoroutineScope(C42911a.m94120b().plus(new C22128a(CoroutineExceptionHandler.INSTANCE)), "QuoteFavHelper");

    /* JADX INFO: renamed from: com.kubi.quotefacade.helper.QuoteFavHelper$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 QuoteFavHelper.kt\ncom/kubi/quotefacade/helper/QuoteFavHelper\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,49:1\n22#2:50\n23#2:53\n44#3,2:51\n*S KotlinDebug\n*F\n+ 1 QuoteFavHelper.kt\ncom/kubi/quotefacade/helper/QuoteFavHelper\n*L\n22#1:51,2\n*E\n"})
    public static final class C22128a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new KCConfigException(exception, "QuoteFavHelper", false, null, 8, null), null, 2, null);
        }

        public C22128a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: a */
    public final void m51874a() {
        C41696j.m91104d(f41942b, null, null, new QuoteFavHelper$init$1(null), 3, null);
    }
}
