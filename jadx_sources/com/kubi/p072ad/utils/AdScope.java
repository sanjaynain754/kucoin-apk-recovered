package com.kubi.p072ad.utils;

import com.kubi.p072ad.exception.AdException;
import java.io.Closeable;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AdEx.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/ad/utils/AdScope;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "context", "Lkotlin/coroutines/CoroutineContext;", "name", "", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "close", "", "Companion", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdEx.kt\ncom/kubi/ad/utils/AdScope\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,32:1\n47#2,4:33\n*S KotlinDebug\n*F\n+ 1 AdEx.kt\ncom/kubi/ad/utils/AdScope\n*L\n25#1:33,4\n*E\n"})
public final class AdScope implements InterfaceC41709m0, Closeable {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f14965c = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final CoroutineContext f14966b;

    /* JADX INFO: compiled from: AdEx.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/ad/utils/AdScope$Companion;", "", "<init>", "()V", "QUOTE_COROUTINE_SCOPE_NAME", "", "AdLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.ad.utils.AdScope$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AdEx.kt\ncom/kubi/ad/utils/AdScope\n+ 3 AdIssue.kt\ncom/kubi/ad/exception/AdIssueKt\n*L\n1#1,49:1\n26#2:50\n27#2:53\n46#3,2:51\n*S KotlinDebug\n*F\n+ 1 AdEx.kt\ncom/kubi/ad/utils/AdScope\n*L\n26#1:51,2\n*E\n"})
    public static final class C9341a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new AdException(exception, "AdScope", false, null, 8, null), null, 2, null);
        }

        public C9341a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    public AdScope(@NotNull CoroutineContext context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f14966b = new CoroutineName("ad_coroutine_scope" + name).plus(C41727q2.m91192b(null, 1, null)).plus(context).plus(new C9341a(CoroutineExceptionHandler.INSTANCE));
    }

    @Override // kotlinx.coroutines.InterfaceC41709m0
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public CoroutineContext getF42698b() {
        return this.f14966b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m90365i(getF42698b(), null, 1, null);
    }

    public /* synthetic */ AdScope(CoroutineContext coroutineContext, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, (i11 & 2) != 0 ? "" : str);
    }
}
