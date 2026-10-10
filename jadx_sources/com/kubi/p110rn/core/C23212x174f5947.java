package com.kubi.p110rn.core;

import com.kubi.p110rn.exception.RNException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.rn.core.BundleLoader$afterInBackground$$inlined$CoroutineExceptionHandler$1 */
/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader\n+ 3 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,49:1\n80#2:50\n45#3,2:51\n*S KotlinDebug\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader\n*L\n80#1:51,2\n*E\n"})
public final class C23212x174f5947 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        C43846g.m96568c(new RNException(exception, "BundleLoader", false, null, 8, null), null, 2, null);
    }

    public C23212x174f5947(CoroutineExceptionHandler.Companion companion) {
        super(companion);
    }
}
