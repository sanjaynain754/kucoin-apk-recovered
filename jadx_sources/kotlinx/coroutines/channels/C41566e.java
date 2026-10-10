package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.tencent.bugly.proguard.C33675gh;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41539a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.InterfaceC41751f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.e */
/* JADX INFO: compiled from: ChannelCoroutine.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010!\u001a\u00020\u00032#\u0010 \u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\u001dH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096A¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0096\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b.\u0010-R\u0014\u00102\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00069"}, m90084d2 = {"Lkotlinx/coroutines/channels/e;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/a;", "", "Lkotlinx/coroutines/channels/d;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "_channel", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/d;ZZ)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/CancellationException;)V", "", ExifInterface.LATITUDE_SOUTH, "(Ljava/lang/Throwable;)V", "element", C33675gh.f70005k, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "F", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "d", "(Lkotlin/jvm/functions/Function1;)V", "D", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "o", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/f;", "iterator", "()Lkotlinx/coroutines/channels/f;", "Lkotlinx/coroutines/channels/d;", "Z0", "()Lkotlinx/coroutines/channels/d;", "Y0", AppsFlyerProperties.CHANNEL, "q", "()Z", "isClosedForSend", "Lkotlinx/coroutines/selects/f;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lkotlinx/coroutines/selects/f;", "onReceive", "f", "onReceiveCatching", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
public class C41566e<E> extends AbstractC41539a<Unit> implements InterfaceC41565d<E> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41565d<E> _channel;

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: S */
    public void mo90405S(@NotNull Throwable cause) {
        CancellationException cancellationExceptionM90378N0 = JobSupport.m90378N0(this, cause, null, 1, null);
        this._channel.mo90585a(cancellationExceptionM90378N0);
        m90401Q(cancellationExceptionM90378N0);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    /* JADX INFO: renamed from: A */
    public InterfaceC41751f<E> mo90546A() {
        return this._channel.mo90546A();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @Nullable
    /* JADX INFO: renamed from: D */
    public Object mo90550D(@NotNull Continuation<? super E> continuation) {
        return this._channel.mo90550D(continuation);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    /* JADX INFO: renamed from: F */
    public boolean mo90553F(@Nullable Throwable cause) {
        return this._channel.mo90553F(cause);
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC41565d<E> m90689Z0() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    /* JADX INFO: renamed from: d */
    public void mo90591d(@NotNull Function1<? super Throwable, Unit> handler) {
        this._channel.mo90591d(handler);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    @NotNull
    /* JADX INFO: renamed from: e */
    public Object mo90594e(E element) {
        return this._channel.mo90594e(element);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC41751f<ChannelResult<E>> mo90596f() {
        return this._channel.mo90596f();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    public InterfaceC41567f<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @NotNull
    /* JADX INFO: renamed from: o */
    public Object mo90609o() {
        return this._channel.mo90609o();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41576o
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo90611p(@NotNull Continuation<? super ChannelResult<? extends E>> continuation) {
        Object objMo90611p = this._channel.mo90611p(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objMo90611p;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    /* JADX INFO: renamed from: q */
    public boolean mo90614q() {
        return this._channel.mo90614q();
    }

    @Override // kotlinx.coroutines.channels.InterfaceC41577p
    @Nullable
    public Object send(E e11, @NotNull Continuation<? super Unit> continuation) {
        return this._channel.send(e11, continuation);
    }

    public C41566e(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC41565d<E> interfaceC41565d, boolean z11, boolean z12) {
        super(coroutineContext, z11, z12);
        this._channel = interfaceC41565d;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.InterfaceC41775x1
    /* JADX INFO: renamed from: a */
    public final void mo90415a(@Nullable CancellationException cause) {
        if (isCancelled()) {
            return;
        }
        if (cause == null) {
            cause = new JobCancellationException(mo90410V(), null, this);
        }
        mo90405S(cause);
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public final InterfaceC41565d<E> m90688Y0() {
        return this;
    }
}
