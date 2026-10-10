package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.i */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/m0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/BuildersKt")
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final /* synthetic */ class C41690i {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m91067b(CoroutineContext coroutineContext, Function2 function2, int i11, Object obj) throws InterruptedException {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return C41686h.m91047e(coroutineContext, function2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX INFO: renamed from: a */
    public static final <T> T m91066a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        AbstractC41589f1 abstractC41589f1;
        AbstractC41589f1 abstractC41589f1M91355a;
        CoroutineContext coroutineContextM91060k;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            abstractC41589f1M91355a = C41760t2.f91865a.m91356b();
            coroutineContextM91060k = C41687h0.m91060k(C41726q1.f91773b, coroutineContext.plus(abstractC41589f1M91355a));
        } else {
            AbstractC41589f1 abstractC41589f2 = null;
            if (continuationInterceptor instanceof AbstractC41589f1) {
                abstractC41589f1 = (AbstractC41589f1) continuationInterceptor;
            } else {
                abstractC41589f1 = null;
            }
            if (abstractC41589f1 != null) {
                if (abstractC41589f1.m90738V()) {
                    abstractC41589f2 = abstractC41589f1;
                }
                if (abstractC41589f2 != null) {
                    abstractC41589f1M91355a = abstractC41589f2;
                } else {
                    abstractC41589f1M91355a = C41760t2.f91865a.m91355a();
                }
            } else {
                abstractC41589f1M91355a = C41760t2.f91865a.m91355a();
            }
            coroutineContextM91060k = C41687h0.m91060k(C41726q1.f91773b, coroutineContext);
        }
        C41587f c41587f = new C41587f(coroutineContextM91060k, threadCurrentThread, abstractC41589f1M91355a);
        c41587f.m90474X0(CoroutineStart.DEFAULT, c41587f, function2);
        return (T) c41587f.m90727Y0();
    }
}
