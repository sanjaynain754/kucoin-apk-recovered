package com.kubi.payment.util;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RepositoryExt.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042-\u0010\u0005\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f¨\u0006\r"}, m90084d2 = {InterfaceC33617e1.f69659h, "Lcom/kubi/payment/base/Result;", ExifInterface.GPS_DIRECTION_TRUE, "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RepositoryExtKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m49806a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super BaseEntity<T>>, ? extends Object> function2, @NotNull Continuation<? super AbstractC42878k<? extends T>> continuation) {
        return C41686h.m91049g(coroutineContext, new RepositoryExtKt$launch$2(function2, null), continuation);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m49807b(CoroutineContext coroutineContext, Function2 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = C42911a.m94120b();
        }
        return m49806a(coroutineContext, function2, continuation);
    }
}
