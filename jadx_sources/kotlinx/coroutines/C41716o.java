package kotlinx.coroutines;

import androidx.concurrent.futures.C1481a;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C2711C;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import og0.AbstractC43081x;
import og0.C43045a0;
import og0.C43058h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.o */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J\u0088\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u001e\"\u0004\b\u0001\u0010(2\u0006\u0010\"\u001a\u00020)2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u0001\u00103Jx\u00105\u001a\u0004\u0018\u000104\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\u001e2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00108\u001a\u0002072\b\u0010*\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\rH\u0001¢\u0006\u0004\b=\u0010\u000fJ\u0017\u0010@\u001a\n\u0018\u00010>j\u0004\u0018\u0001`?H\u0016¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u00020\u00162\b\u0010D\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bG\u0010\u0013J\u0017\u0010H\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020J2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\bK\u0010LJp\u0010M\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2K\u00101\u001aG\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00160+2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010.\u001a\u00028\u0001¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00102\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0011\u0010S\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\bS\u0010CJ\u000f\u0010T\u001a\u00020\u0016H\u0000¢\u0006\u0004\bT\u0010;J\u001d\u0010W\u001a\u00020\u00162\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000UH\u0016¢\u0006\u0004\bW\u0010!J<\u0010Y\u001a\u00020\u00162\u0006\u0010.\u001a\u00028\u00002#\u00101\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0016\u0018\u00010XH\u0016¢\u0006\u0004\bY\u0010ZJp\u0010[\u001a\u00020\u0016\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010.\u001a\u00028\u00012M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\b[\u0010\\J#\u0010^\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010]\u001a\u00020\tH\u0016¢\u0006\u0004\b^\u0010_J8\u0010a\u001a\u00020\u00162'\u0010\u001f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00160Xj\u0002``H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020JH\u0000¢\u0006\u0004\bc\u0010dJv\u0010(\u001a\u00020\u0016\"\u0004\b\u0001\u0010(2\u0006\u0010*\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\t2O\b\u0002\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0000¢\u0006\u0004\b(\u0010eJ\u000f\u0010f\u001a\u00020\u0016H\u0000¢\u0006\u0004\bf\u0010;J|\u0010g\u001a\u0004\u0018\u00010\u001e\"\b\b\u0001\u0010(*\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\b\u00102\u001a\u0004\u0018\u00010\u001e2M\u00101\u001aI\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0016\u0018\u00010+H\u0016¢\u0006\u0004\bg\u0010hJ\u0019\u0010j\u001a\u0004\u0018\u00010\u001e2\u0006\u0010i\u001a\u00020\u0010H\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00162\u0006\u0010l\u001a\u00020\u001eH\u0016¢\u0006\u0004\bm\u0010!J\u001b\u0010o\u001a\u00020\u0016*\u00020n2\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0004\bo\u0010pJ\u001f\u0010q\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0010¢\u0006\u0004\bs\u0010tJ\u000f\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020uH\u0014¢\u0006\u0004\bx\u0010wR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010y\u001a\u0004\bz\u0010{R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010|\u001a\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u001dR\u0016\u0010\u0082\u0001\u001a\u00020u8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010wR\u0017\u0010\"\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010CR\u0016\u0010\u0084\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\u000fR\u0016\u0010\u0085\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u000fR\u001f\u0010\u0088\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\r\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004R\u0015\u0010\u008c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u008b\u00018\u0002X\u0082\u0004R\u0015\u0010\u008d\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u008b\u00018\u0002X\u0082\u0004¨\u0006\u008e\u0001"}, m90084d2 = {"Lkotlinx/coroutines/o;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/w0;", "Lkotlinx/coroutines/m;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/z2;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "J", "()Z", "", "cause", "n", "(Ljava/lang/Throwable;)Z", "Log0/x;", "segment", "", "m", "(Log0/x;Ljava/lang/Throwable;)V", ExifInterface.LONGITUDE_WEST, "U", "Lkotlinx/coroutines/b1;", "F", "()Lkotlinx/coroutines/b1;", "", "handler", "H", "(Ljava/lang/Object;)V", "state", "K", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mode", "q", "(I)V", "R", "Lkotlinx/coroutines/i2;", "proposedUpdate", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "onCancellation", "idempotent", "(Lkotlinx/coroutines/i2;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "Log0/a0;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Log0/a0;", "", "j", "(Ljava/lang/Object;)Ljava/lang/Void;", "p", "()V", ExifInterface.LONGITUDE_EAST, "O", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/Object;", "takenState", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "c", "M", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/l;", "k", "(Lkotlinx/coroutines/l;Ljava/lang/Throwable;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "Lkotlinx/coroutines/x1;", "parent", "u", "(Lkotlinx/coroutines/x1;)Ljava/lang/Throwable;", "w", "N", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "resumeWith", "Lkotlin/Function1;", "P", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "r", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "index", "e", "(Log0/x;I)V", "Lkotlinx/coroutines/CompletionHandler;", "t", "(Lkotlin/jvm/functions/Function1;)V", "I", "(Lkotlinx/coroutines/l;)V", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "o", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "exception", "y", "(Ljava/lang/Throwable;)Ljava/lang/Object;", InterfaceC33826o0.f71244p, CmcdData.Factory.STREAMING_FORMAT_SS, "Lkotlinx/coroutines/j0;", "B", "(Lkotlinx/coroutines/j0;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "L", "Lkotlin/coroutines/Continuation;", "b", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "v", "parentHandle", "z", "stateDebugRepresentation", "x", "isActive", "isCompleted", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "_state", "_parentHandle", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
public class C41716o<T> extends AbstractC41770w0<T> implements InterfaceC41708m<T>, CoroutineStackFrame, InterfaceC41784z2 {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91763g = AtomicIntegerFieldUpdater.newUpdater(C41716o.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91764h = AtomicReferenceFieldUpdater.newUpdater(C41716o.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91765i = AtomicReferenceFieldUpdater.newUpdater(C41716o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Continuation<T> delegate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext context;

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m91140S(C41716o c41716o, Object obj, int i11, Function3 function3, int i12, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i12 & 4) != 0) {
            function3 = null;
        }
        c41716o.m91152R(obj, i11, function3);
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    /* JADX INFO: renamed from: B */
    public void mo91114B(@NotNull AbstractC41697j0 abstractC41697j0, T t11) {
        Continuation<T> continuation = this.delegate;
        C43058h c43058h = continuation instanceof C43058h ? (C43058h) continuation : null;
        m91140S(this, t11, (c43058h != null ? c43058h.dispatcher : null) == abstractC41697j0 ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m91146J() {
        if (!C41774x0.m91374c(this.resumeMode)) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C43058h) continuation).m94578n();
    }

    /* JADX INFO: renamed from: K */
    public final void m91147K(Object handler, Object state) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public String mo90447L() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: N */
    public final void m91149N() {
        Throwable thM94581q;
        Continuation<T> continuation = this.delegate;
        C43058h c43058h = continuation instanceof C43058h ? (C43058h) continuation : null;
        if (c43058h == null || (thM94581q = c43058h.m94581q(this)) == null) {
            return;
        }
        m91167o();
        mo91116c(thM94581q);
    }

    /* JADX INFO: renamed from: P */
    public void m91151P(T value, @Nullable final Function1<? super Throwable, Unit> onCancellation) {
        m91152R(value, this.resumeMode, onCancellation != null ? new Function3() { // from class: kotlinx.coroutines.n
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C41716o.m91139Q(onCancellation, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    /* JADX INFO: renamed from: T */
    public final <R> Object m91153T(InterfaceC41693i2 state, R proposedUpdate, int resumeMode, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotent) {
        if (proposedUpdate instanceof C41549b0) {
            return proposedUpdate;
        }
        if ((C41774x0.m91373b(resumeMode) || idempotent != null) && !(onCancellation == null && !(state instanceof InterfaceC41704l) && idempotent == null)) {
            return new CompletedContinuation(proposedUpdate, state instanceof InterfaceC41704l ? (InterfaceC41704l) state : null, onCancellation, idempotent, null, 16, null);
        }
        return proposedUpdate;
    }

    @Override // kotlinx.coroutines.AbstractC41770w0
    @NotNull
    /* JADX INFO: renamed from: b */
    public final Continuation<T> mo91158b() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.AbstractC41770w0
    /* JADX INFO: renamed from: f */
    public <T> T mo91160f(@Nullable Object state) {
        return state instanceof CompletedContinuation ? (T) ((CompletedContinuation) state).result : state;
    }

    @Override // p852kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.delegate;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // p852kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: j */
    public final Void m91162j(Object proposedUpdate) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    /* JADX INFO: renamed from: r */
    public <R extends T> void mo91117r(R value, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        m91152R(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    /* JADX INFO: renamed from: s */
    public void mo91118s(@NotNull Object token) {
        m91169q(this.resumeMode);
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    /* JADX INFO: renamed from: t */
    public void mo91119t(@NotNull Function1<? super Throwable, Unit> handler) {
        C41724q.m91188c(this, new InterfaceC41704l.a(handler));
    }

    @NotNull
    public String toString() {
        return mo90447L() + '(' + C41717o0.m91176c(this.delegate) + "){" + m91173z() + "}@" + C41717o0.m91175b(this);
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    @Nullable
    /* JADX INFO: renamed from: y */
    public Object mo91120y(@NotNull Throwable exception) {
        return m91155V(new C41549b0(exception, false, 2, null), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41716o(@NotNull Continuation<? super T> continuation, int i11) {
        super(i11);
        this.delegate = continuation;
        this.context = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C41579d.f91529b;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m91139Q(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public void m91142E() {
        InterfaceC41550b1 interfaceC41550b1M91143F = m91143F();
        if (interfaceC41550b1M91143F != null && isCompleted()) {
            interfaceC41550b1M91143F.dispose();
            f91765i.set(this, C41689h2.f91736b);
        }
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC41550b1 m91143F() {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) getContext().get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            InterfaceC41550b1 interfaceC41550b1M90372p = JobKt__JobKt.m90372p(interfaceC41775x1, false, new C41739s(this), 1, null);
            C1481a.m2260a(f91765i, this, null, interfaceC41550b1M90372p);
            return interfaceC41550b1M90372p;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    @Nullable
    /* JADX INFO: renamed from: G */
    public <R extends T> Object mo91115G(R value, @Nullable Object idempotent, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        return m91155V(value, idempotent, onCancellation);
    }

    /* JADX INFO: renamed from: H */
    public final void m91144H(Object handler) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91764h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C41579d) {
                if (C1481a.m2260a(f91764h, this, obj, handler)) {
                    return;
                }
            } else if (!(obj instanceof InterfaceC41704l) && !(obj instanceof AbstractC43081x)) {
                if (obj instanceof C41549b0) {
                    C41549b0 c41549b0 = (C41549b0) obj;
                    if (!c41549b0.m90487c()) {
                        m91147K(handler, obj);
                    }
                    if (obj instanceof C41728r) {
                        Throwable th2 = null;
                        if (obj == null) {
                            c41549b0 = null;
                        }
                        if (c41549b0 != null) {
                            th2 = c41549b0.cause;
                        }
                        if (handler instanceof InterfaceC41704l) {
                            m91163k((InterfaceC41704l) handler, th2);
                            return;
                        } else {
                            Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m91165m((AbstractC43081x) handler, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        m91147K(handler, obj);
                    }
                    if (handler instanceof AbstractC43081x) {
                        return;
                    }
                    Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC41704l interfaceC41704l = (InterfaceC41704l) handler;
                    if (completedContinuation.m90477c()) {
                        m91163k(interfaceC41704l, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (C1481a.m2260a(f91764h, this, obj, CompletedContinuation.m90475b(completedContinuation, null, interfaceC41704l, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof AbstractC43081x) {
                        return;
                    }
                    Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (C1481a.m2260a(f91764h, this, obj, new CompletedContinuation(obj, (InterfaceC41704l) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else {
                m91147K(handler, obj);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m91145I(@NotNull InterfaceC41704l handler) {
        m91144H(handler);
    }

    /* JADX INFO: renamed from: M */
    public final void m91148M(@NotNull Throwable cause) {
        if (m91166n(cause)) {
            return;
        }
        mo91116c(cause);
        m91168p();
    }

    @JvmName(name = "resetStateReusable")
    /* JADX INFO: renamed from: O */
    public final boolean m91150O() {
        Object obj = f91764h.get(this);
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).idempotentResume != null) {
            m91167o();
            return false;
        }
        f91763g.set(this, 536870911);
        f91764h.set(this, C41579d.f91529b);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final <R> void m91152R(R proposedUpdate, int resumeMode, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91764h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC41693i2) {
                R r11 = proposedUpdate;
                int i11 = resumeMode;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3 = onCancellation;
                if (C1481a.m2260a(f91764h, this, obj, m91153T((InterfaceC41693i2) obj, r11, i11, function3, null))) {
                    m91168p();
                    m91169q(i11);
                    return;
                } else {
                    proposedUpdate = r11;
                    resumeMode = i11;
                    onCancellation = function3;
                }
            } else {
                R r12 = proposedUpdate;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function4 = onCancellation;
                if (obj instanceof C41728r) {
                    C41728r c41728r = (C41728r) obj;
                    if (c41728r.m91195e()) {
                        if (function4 != null) {
                            m91164l(function4, c41728r.cause, r12);
                            return;
                        }
                        return;
                    }
                }
                m91162j(r12);
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final boolean m91154U() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91763g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f91763g.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final <R> C43045a0 m91155V(R proposedUpdate, Object idempotent, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91764h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC41693i2) {
                R r11 = proposedUpdate;
                Object obj2 = idempotent;
                Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3 = onCancellation;
                if (C1481a.m2260a(f91764h, this, obj, m91153T((InterfaceC41693i2) obj, r11, this.resumeMode, function3, obj2))) {
                    m91168p();
                    return C41720p.f91768a;
                }
                proposedUpdate = r11;
                onCancellation = function3;
                idempotent = obj2;
            } else {
                Object obj3 = idempotent;
                if (!(obj instanceof CompletedContinuation) || obj3 == null || ((CompletedContinuation) obj).idempotentResume != obj3) {
                    return null;
                }
                return C41720p.f91768a;
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final boolean m91156W() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91763g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f91763g.compareAndSet(this, i11, C2711C.BUFFER_FLAG_LAST_SAMPLE + (536870911 & i11)));
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC41770w0
    /* JADX INFO: renamed from: a */
    public void mo91157a(@Nullable Object takenState, @NotNull Throwable cause) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91764h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC41693i2)) {
                if (!(obj instanceof C41549b0)) {
                    if (obj instanceof CompletedContinuation) {
                        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                        if (!completedContinuation.m90477c()) {
                            Throwable th3 = cause;
                            th2 = th3;
                            if (C1481a.m2260a(f91764h, this, obj, CompletedContinuation.m90475b(completedContinuation, null, null, null, null, th3, 15, null))) {
                                completedContinuation.m90478d(this, th2);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else {
                        th2 = cause;
                        if (C1481a.m2260a(f91764h, this, obj, new CompletedContinuation(obj, null, null, null, th2, 14, null))) {
                            return;
                        }
                    }
                    cause = th2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    /* JADX INFO: renamed from: c */
    public boolean mo91116c(@Nullable Throwable cause) {
        Object obj;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91764h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z11 = false;
            if (!(obj instanceof InterfaceC41693i2)) {
                return false;
            }
            if ((obj instanceof InterfaceC41704l) || (obj instanceof AbstractC43081x)) {
                z11 = true;
            }
        } while (!C1481a.m2260a(f91764h, this, obj, new C41728r(this, cause, z11)));
        InterfaceC41693i2 interfaceC41693i2 = (InterfaceC41693i2) obj;
        if (interfaceC41693i2 instanceof InterfaceC41704l) {
            m91163k((InterfaceC41704l) obj, cause);
        } else if (interfaceC41693i2 instanceof AbstractC43081x) {
            m91165m((AbstractC43081x) obj, cause);
        }
        m91168p();
        m91169q(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC41770w0
    @Nullable
    /* JADX INFO: renamed from: d */
    public Throwable mo91159d(@Nullable Object state) {
        Throwable thMo91159d = super.mo91159d(state);
        if (thMo91159d != null) {
            return thMo91159d;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC41784z2
    /* JADX INFO: renamed from: e */
    public void mo90632e(@NotNull AbstractC43081x<?> segment, int index) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91763g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + index));
        m91144H(segment);
    }

    @Override // kotlinx.coroutines.AbstractC41770w0
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo91161h() {
        return m91172x();
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    public boolean isActive() {
        return m91172x() instanceof InterfaceC41693i2;
    }

    @Override // kotlinx.coroutines.InterfaceC41708m
    public boolean isCompleted() {
        return !(m91172x() instanceof InterfaceC41693i2);
    }

    /* JADX INFO: renamed from: k */
    public final void m91163k(@NotNull InterfaceC41704l handler, @Nullable Throwable cause) {
        try {
            handler.mo90501b(cause);
        } catch (Throwable th2) {
            C41701k0.m91111a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final <R> void m91164l(@NotNull Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @NotNull Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getContext());
        } catch (Throwable th2) {
            C41701k0.m91111a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m91165m(AbstractC43081x<?> segment, Throwable cause) {
        int i11 = f91763g.get(this) & 536870911;
        if (i11 != 536870911) {
            try {
                segment.mo90700s(i11, cause, getContext());
                return;
            } catch (Throwable th2) {
                C41701k0.m91111a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    /* JADX INFO: renamed from: n */
    public final boolean m91166n(Throwable cause) {
        if (!m91146J()) {
            return false;
        }
        Continuation<T> continuation = this.delegate;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C43058h) continuation).m94579o(cause);
    }

    /* JADX INFO: renamed from: o */
    public final void m91167o() {
        InterfaceC41550b1 interfaceC41550b1M91170v = m91170v();
        if (interfaceC41550b1M91170v == null) {
            return;
        }
        interfaceC41550b1M91170v.dispose();
        f91765i.set(this, C41689h2.f91736b);
    }

    /* JADX INFO: renamed from: p */
    public final void m91168p() {
        if (!m91146J()) {
            m91167o();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m91169q(int mode) {
        if (m91154U()) {
            return;
        }
        C41774x0.m91372a(this, mode);
    }

    @Override // p852kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        m91140S(this, C41554c0.m90500c(result, this), this.resumeMode, null, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public Throwable mo90448u(@NotNull InterfaceC41775x1 parent) {
        return parent.mo90442x();
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC41550b1 m91170v() {
        return (InterfaceC41550b1) f91765i.get(this);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: w */
    public final Object m91171w() {
        InterfaceC41775x1 interfaceC41775x1;
        boolean zM91146J = m91146J();
        if (m91156W()) {
            if (m91170v() == null) {
                m91143F();
            }
            if (zM91146J) {
                m91149N();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (zM91146J) {
            m91149N();
        }
        Object objM91172x = m91172x();
        if (!(objM91172x instanceof C41549b0)) {
            if (C41774x0.m91373b(this.resumeMode) && (interfaceC41775x1 = (InterfaceC41775x1) getContext().get(InterfaceC41775x1.INSTANCE)) != null && !interfaceC41775x1.isActive()) {
                CancellationException cancellationExceptionMo90442x = interfaceC41775x1.mo90442x();
                mo91157a(objM91172x, cancellationExceptionMo90442x);
                throw cancellationExceptionMo90442x;
            }
            return mo91160f(objM91172x);
        }
        throw ((C41549b0) objM91172x).cause;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public final Object m91172x() {
        return f91764h.get(this);
    }

    /* JADX INFO: renamed from: z */
    public final String m91173z() {
        Object objM91172x = m91172x();
        if (objM91172x instanceof InterfaceC41693i2) {
            return "Active";
        }
        if (objM91172x instanceof C41728r) {
            return "Cancelled";
        }
        return "Completed";
    }
}
