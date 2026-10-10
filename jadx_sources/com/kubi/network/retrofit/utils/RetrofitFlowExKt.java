package com.kubi.network.retrofit.utils;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.exception.DataNullException;
import com.kubi.utils.extensions.C27041f;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002a0.C0006b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import ro.C44128b;

/* JADX INFO: compiled from: RetrofitFlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a]\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072(\b\u0002\u0010\r\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072(\b\u0002\u0010\r\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aW\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000f\u001a\u001d\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0019H\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/network/retrofit/utils/f;", "j", "(Lcom/kubi/network/retrofit/utils/f;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "k", "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "needShowErrorToast", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "f", "(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allowNull", "b", "(Lkotlinx/coroutines/flow/e;ZZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/flow/e;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Ljava/lang/Class;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Class;)Ljava/lang/Object;", "", "tag", "", "throwable", "m", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "msg", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;)V", "network-core-retrofit_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRetrofitFlowEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,184:1\n1#2:185\n71#3,4:186\n71#3,4:190\n*S KotlinDebug\n*F\n+ 1 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n*L\n158#1:186,4\n171#1:190,4\n*E\n"})
public final class RetrofitFlowExKt {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m42824e(InterfaceC41634e interfaceC41634e, boolean z11, Function2 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m42823d(interfaceC41634e, z11, function2, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final <T> Object m42825f(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, @Nullable Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super C19334f<T>> continuation) {
        return m42821b(interfaceC41634e, true, z11, function2, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final <T> Object m42827h(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, boolean z12, @NotNull Continuation<? super C19334f<T>> continuation) {
        return m42822c(interfaceC41634e, z11, z12, null, continuation, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static final <T> T m42820a(@NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (T) C42597a.m93387c().create(cls);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #3 {all -> 0x00bf, blocks: (B:31:0x009a, B:33:0x009f), top: B:73:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m42821b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, boolean z12, @Nullable Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super C19334f<T>> continuation) throws Throwable {
        RetrofitFlowExKt$getDataOrNull$1 retrofitFlowExKt$getDataOrNull$1;
        C19334f c19334f;
        Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function3;
        C19334f c19334f2;
        Throwable th2;
        C19334f c19334f3;
        Object obj;
        C19334f c19334f4;
        C19334f c19334f5;
        C19334f c19334f6;
        Unit unit;
        Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function4;
        C0006b c0006b;
        C19334f c19334f7;
        Object objM103844constructorimpl;
        C19334f c19334f8;
        C19334f c19334f9;
        boolean z13;
        boolean z14;
        Throwable thM103847exceptionOrNullimpl;
        if (continuation instanceof RetrofitFlowExKt$getDataOrNull$1) {
            retrofitFlowExKt$getDataOrNull$1 = (RetrofitFlowExKt$getDataOrNull$1) continuation;
            int i11 = retrofitFlowExKt$getDataOrNull$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                retrofitFlowExKt$getDataOrNull$1.label = i11 - Integer.MIN_VALUE;
            } else {
                retrofitFlowExKt$getDataOrNull$1 = new RetrofitFlowExKt$getDataOrNull$1(continuation);
            }
        } else {
            retrofitFlowExKt$getDataOrNull$1 = new RetrofitFlowExKt$getDataOrNull$1(continuation);
        }
        Object obj2 = retrofitFlowExKt$getDataOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = retrofitFlowExKt$getDataOrNull$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            c19334f = new C19334f(null, null, 3, null);
            try {
                Result.Companion companion = Result.INSTANCE;
                retrofitFlowExKt$getDataOrNull$1.L$0 = function2;
                retrofitFlowExKt$getDataOrNull$1.L$1 = c19334f;
                retrofitFlowExKt$getDataOrNull$1.L$2 = c19334f;
                retrofitFlowExKt$getDataOrNull$1.L$3 = c19334f;
                retrofitFlowExKt$getDataOrNull$1.Z$0 = z11;
                retrofitFlowExKt$getDataOrNull$1.Z$1 = z12;
                retrofitFlowExKt$getDataOrNull$1.label = 1;
                Object objM90884H = C41636g.m90884H(interfaceC41634e, retrofitFlowExKt$getDataOrNull$1);
                if (objM90884H != coroutine_suspended) {
                    obj = objM90884H;
                    function3 = function2;
                    C19334f c19334f10 = c19334f;
                    c19334f4 = c19334f10;
                    c19334f5 = c19334f10;
                    c19334f5.m42848c(obj);
                    if (function3 != null) {
                        c19334f6 = c19334f4;
                        c19334f2 = c19334f;
                        unit = null;
                        function4 = function3;
                        objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        boolean z15 = z11;
                        c19334f8 = c19334f6;
                        c19334f9 = c19334f2;
                        z13 = z12;
                        z14 = z15;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl == null) {
                            return c19334f9;
                        }
                        if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                            throw thM103847exceptionOrNullimpl;
                        }
                        if (z14) {
                        }
                        c19334f8.m42849d(thM103847exceptionOrNullimpl);
                        if (z13) {
                            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                        }
                        m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                        return c19334f9;
                    }
                    c0006b = (Object) c19334f4.m42846a();
                    retrofitFlowExKt$getDataOrNull$1.L$0 = function3;
                    retrofitFlowExKt$getDataOrNull$1.L$1 = c19334f;
                    retrofitFlowExKt$getDataOrNull$1.L$2 = c19334f4;
                    retrofitFlowExKt$getDataOrNull$1.L$3 = null;
                    retrofitFlowExKt$getDataOrNull$1.Z$0 = z11;
                    retrofitFlowExKt$getDataOrNull$1.Z$1 = z12;
                    retrofitFlowExKt$getDataOrNull$1.label = 2;
                    if (function3.invoke(c0006b, retrofitFlowExKt$getDataOrNull$1) != coroutine_suspended) {
                        c19334f7 = c19334f4;
                        c19334f2 = c19334f;
                        function4 = function3;
                        unit = Unit.INSTANCE;
                        c19334f6 = c19334f7;
                        objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        boolean z16 = z11;
                        c19334f8 = c19334f6;
                        c19334f9 = c19334f2;
                        z13 = z12;
                        z14 = z16;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl == null) {
                            return c19334f9;
                        }
                        if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                            throw thM103847exceptionOrNullimpl;
                        }
                        if (z14) {
                        }
                        c19334f8.m42849d(thM103847exceptionOrNullimpl);
                        if (z13) {
                            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                        }
                        m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                        return c19334f9;
                    }
                }
            } catch (Throwable th3) {
                function3 = function2;
                c19334f2 = c19334f;
                th2 = th3;
                c19334f3 = c19334f2;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                boolean z17 = z11;
                c19334f8 = c19334f3;
                c19334f9 = c19334f2;
                z13 = z12;
                z14 = z17;
                function4 = function3;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl == null) {
                    return c19334f9;
                }
                if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                    throw thM103847exceptionOrNullimpl;
                }
                if (z14) {
                }
                c19334f8.m42849d(thM103847exceptionOrNullimpl);
                if (z13) {
                    C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                }
                m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                return c19334f9;
            }
        } else if (i12 == 1) {
            z12 = retrofitFlowExKt$getDataOrNull$1.Z$1;
            z11 = retrofitFlowExKt$getDataOrNull$1.Z$0;
            C19334f c19334f11 = (C19334f) retrofitFlowExKt$getDataOrNull$1.L$3;
            C19334f c19334f12 = (C19334f) retrofitFlowExKt$getDataOrNull$1.L$2;
            C19334f c19334f13 = (C19334f) retrofitFlowExKt$getDataOrNull$1.L$1;
            function3 = (Function2) retrofitFlowExKt$getDataOrNull$1.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                obj = obj2;
                c19334f = c19334f13;
                c19334f5 = c19334f11;
                c19334f4 = c19334f12;
                try {
                    c19334f5.m42848c(obj);
                    if (function3 != null) {
                        c19334f6 = c19334f4;
                        c19334f2 = c19334f;
                        unit = null;
                        function4 = function3;
                        objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        boolean z18 = z11;
                        c19334f8 = c19334f6;
                        c19334f9 = c19334f2;
                        z13 = z12;
                        z14 = z18;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl == null) {
                            return c19334f9;
                        }
                        if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                            throw thM103847exceptionOrNullimpl;
                        }
                        if (z14) {
                        }
                        c19334f8.m42849d(thM103847exceptionOrNullimpl);
                        if (z13) {
                            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                        }
                        m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                        return c19334f9;
                    }
                    c0006b = (Object) c19334f4.m42846a();
                    retrofitFlowExKt$getDataOrNull$1.L$0 = function3;
                    retrofitFlowExKt$getDataOrNull$1.L$1 = c19334f;
                    retrofitFlowExKt$getDataOrNull$1.L$2 = c19334f4;
                    retrofitFlowExKt$getDataOrNull$1.L$3 = null;
                    retrofitFlowExKt$getDataOrNull$1.Z$0 = z11;
                    retrofitFlowExKt$getDataOrNull$1.Z$1 = z12;
                    retrofitFlowExKt$getDataOrNull$1.label = 2;
                    if (function3.invoke(c0006b, retrofitFlowExKt$getDataOrNull$1) != coroutine_suspended) {
                        c19334f7 = c19334f4;
                        c19334f2 = c19334f;
                        function4 = function3;
                        unit = Unit.INSTANCE;
                        c19334f6 = c19334f7;
                        objM103844constructorimpl = Result.m103844constructorimpl(unit);
                        boolean z19 = z11;
                        c19334f8 = c19334f6;
                        c19334f9 = c19334f2;
                        z13 = z12;
                        z14 = z19;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl == null) {
                            return c19334f9;
                        }
                        if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                            throw thM103847exceptionOrNullimpl;
                        }
                        if (z14) {
                        }
                        c19334f8.m42849d(thM103847exceptionOrNullimpl);
                        if (z13) {
                            C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                        }
                        m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                        return c19334f9;
                    }
                } catch (Throwable th4) {
                    C19334f c19334f14 = c19334f;
                    th2 = th4;
                    c19334f3 = c19334f4;
                    c19334f2 = c19334f14;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    boolean z110 = z11;
                    c19334f8 = c19334f3;
                    c19334f9 = c19334f2;
                    z13 = z12;
                    z14 = z110;
                    function4 = function3;
                }
            } catch (Throwable th5) {
                th2 = th5;
                c19334f3 = c19334f12;
                c19334f2 = c19334f13;
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                boolean z111 = z11;
                c19334f8 = c19334f3;
                c19334f9 = c19334f2;
                z13 = z12;
                z14 = z111;
                function4 = function3;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl == null) {
                    return c19334f9;
                }
                if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                    throw thM103847exceptionOrNullimpl;
                }
                if (z14) {
                }
                c19334f8.m42849d(thM103847exceptionOrNullimpl);
                if (z13) {
                    C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                }
                m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                return c19334f9;
            }
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C19334f c19334f15 = (C19334f) retrofitFlowExKt$getDataOrNull$1.L$0;
                ResultKt.throwOnFailure(obj2);
                return c19334f15;
            }
            z12 = retrofitFlowExKt$getDataOrNull$1.Z$1;
            z11 = retrofitFlowExKt$getDataOrNull$1.Z$0;
            c19334f6 = (C19334f) retrofitFlowExKt$getDataOrNull$1.L$2;
            c19334f2 = (C19334f) retrofitFlowExKt$getDataOrNull$1.L$1;
            function4 = (Function2) retrofitFlowExKt$getDataOrNull$1.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                c19334f7 = c19334f6;
                unit = Unit.INSTANCE;
                c19334f6 = c19334f7;
                objM103844constructorimpl = Result.m103844constructorimpl(unit);
                boolean z112 = z11;
                c19334f8 = c19334f6;
                c19334f9 = c19334f2;
                z13 = z12;
                z14 = z112;
            } catch (Throwable th6) {
                th2 = th6;
                function3 = function4;
                c19334f3 = c19334f6;
                Result.Companion companion5 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                boolean z113 = z11;
                c19334f8 = c19334f3;
                c19334f9 = c19334f2;
                z13 = z12;
                z14 = z113;
                function4 = function3;
            }
            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl == null) {
                return c19334f9;
            }
            if (thM103847exceptionOrNullimpl instanceof CancellationException) {
                throw thM103847exceptionOrNullimpl;
            }
            if (z14 || !(thM103847exceptionOrNullimpl instanceof DataNullException)) {
                c19334f8.m42849d(thM103847exceptionOrNullimpl);
                if (z13) {
                    C19331c.m42836c(thM103847exceptionOrNullimpl, null, 2, null);
                }
                m42833n(null, thM103847exceptionOrNullimpl, 1, null);
                return c19334f9;
            }
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            m42831l(message);
            if (function4 == null) {
                return c19334f9;
            }
            retrofitFlowExKt$getDataOrNull$1.L$0 = c19334f9;
            retrofitFlowExKt$getDataOrNull$1.L$1 = objM103844constructorimpl;
            retrofitFlowExKt$getDataOrNull$1.L$2 = null;
            retrofitFlowExKt$getDataOrNull$1.L$3 = null;
            retrofitFlowExKt$getDataOrNull$1.label = 3;
            if (function4.invoke(null, retrofitFlowExKt$getDataOrNull$1) != coroutine_suspended) {
                return c19334f9;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m42822c(InterfaceC41634e interfaceC41634e, boolean z11, boolean z12, Function2 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        return m42821b(interfaceC41634e, z11, z12, function2, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <T> Object m42823d(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, boolean z11, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super C19334f<T>> continuation) {
        return m42821b(interfaceC41634e, false, z11, new RetrofitFlowExKt$onSuccess$3(function2, null), continuation);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Object m42826g(InterfaceC41634e interfaceC41634e, boolean z11, Function2 function2, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        return m42825f(interfaceC41634e, z11, function2, continuation);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m42828i(InterfaceC41634e interfaceC41634e, boolean z11, boolean z12, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        return m42827h(interfaceC41634e, z11, z12, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final <T> T m42829j(@NotNull C19334f<T> c19334f) {
        Intrinsics.checkNotNullParameter(c19334f, "<this>");
        return c19334f.m42846a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final <T> Object m42830k(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super T> continuation) {
        RetrofitFlowExKt$result$1 retrofitFlowExKt$result$1;
        if (continuation instanceof RetrofitFlowExKt$result$1) {
            retrofitFlowExKt$result$1 = (RetrofitFlowExKt$result$1) continuation;
            int i11 = retrofitFlowExKt$result$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                retrofitFlowExKt$result$1.label = i11 - Integer.MIN_VALUE;
            } else {
                retrofitFlowExKt$result$1 = new RetrofitFlowExKt$result$1(continuation);
            }
        } else {
            retrofitFlowExKt$result$1 = new RetrofitFlowExKt$result$1(continuation);
        }
        RetrofitFlowExKt$result$1 retrofitFlowExKt$result$2 = retrofitFlowExKt$result$1;
        Object objM42826g = retrofitFlowExKt$result$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = retrofitFlowExKt$result$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            retrofitFlowExKt$result$2.label = 1;
            objM42826g = m42826g(interfaceC41634e, false, null, retrofitFlowExKt$result$2, 3, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return ((C19334f) objM42826g).m42846a();
    }

    /* JADX INFO: renamed from: l */
    public static final void m42831l(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97259c("retrofit", msg);
    }

    @SuppressLint({"LogNotTimber"})
    /* JADX INFO: renamed from: m */
    public static final void m42832m(@Nullable String str, @NotNull Throwable throwable) {
        Response responseRaw;
        Request request;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            retrofit2.Response<?> response = httpException.response();
            String strValueOf = String.valueOf((response == null || (responseRaw = response.raw()) == null || (request = responseRaw.request()) == null) ? null : request.url());
            if (str == null) {
                str = "retrofit";
            }
            C44128b.m97262f(str, strValueOf + "->" + httpException.code() + "->" + throwable.getMessage() + " 网络请求异常", throwable);
            return;
        }
        if (throwable instanceof ApiException) {
            if (str == null) {
                str = "retrofit";
            }
            C44128b.m97262f(str, ((ApiException) throwable).code + "->" + throwable.getMessage() + " API异常", throwable);
            return;
        }
        if (!(throwable instanceof DataNullException)) {
            if (str == null) {
                str = "retrofit";
            }
            C44128b.m97262f(str, throwable.getMessage(), throwable);
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("category", "UnKnowException");
            eventParametersBuilderAcquire.m42393d("type", "retrofit_flow_error");
            eventParametersBuilderAcquire.m42393d("error_message", C27041f.m66668h(throwable.getMessage()));
            TechnologyEvent.m42388d("RetrofitFlow", eventParametersBuilderAcquire);
            return;
        }
        if (str == null) {
            str = "retrofit";
        }
        StringBuilder sb2 = new StringBuilder();
        DataNullException dataNullException = (DataNullException) throwable;
        sb2.append(dataNullException.getUrl());
        sb2.append(" 数据空异常");
        C44128b.m97262f(str, sb2.toString(), throwable);
        TechnologyEvent technologyEvent2 = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire2.m42393d("category", "DataNullException");
        eventParametersBuilderAcquire2.m42393d("type", "retrofit_flow_error");
        eventParametersBuilderAcquire2.m42393d("url", dataNullException.getUrl());
        eventParametersBuilderAcquire2.m42393d("error_message", C27041f.m66668h(throwable.getMessage()));
        TechnologyEvent.m42388d("RetrofitFlow", eventParametersBuilderAcquire2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m42833n(String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        m42832m(str, th2);
    }
}
