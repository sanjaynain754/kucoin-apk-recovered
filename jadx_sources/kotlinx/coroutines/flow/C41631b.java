package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.flow.internal.C41662p;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.b */
/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010'R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, m90084d2 = {"Lkotlinx/coroutines/flow/b;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/channels/o;", AppsFlyerProperties.CHANNEL, "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/channels/o;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "i", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/e;", "j", "()Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/channels/m;", "scope", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/channels/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/m0;", "m", "(Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/channels/o;", "Lkotlinx/coroutines/flow/f;", "collector", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "o", "()V", "e", "Lkotlinx/coroutines/channels/o;", "Z", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
public final class C41631b<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91655g = AtomicIntegerFieldUpdater.newUpdater(C41631b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41576o<T> channel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean consume;

    public /* synthetic */ C41631b(InterfaceC41576o interfaceC41576o, boolean z11, CoroutineContext coroutineContext, int i11, BufferOverflow bufferOverflow, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41576o, z11, (i12 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i12 & 8) != 0 ? -3 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.InterfaceC41634e
    @Nullable
    public Object collect(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        if (this.capacity != -3) {
            Object objCollect = super.collect(interfaceC41635f, continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
        }
        m90875o();
        Object objM90752d = FlowKt__ChannelsKt.m90752d(interfaceC41635f, this.channel, this.consume, continuation);
        return objM90752d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90752d : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo90872f() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo90741h(@NotNull InterfaceC41574m<? super T> interfaceC41574m, @NotNull Continuation<? super Unit> continuation) {
        Object objM90752d = FlowKt__ChannelsKt.m90752d(new C41662p(interfaceC41574m), this.channel, this.consume, continuation);
        return objM90752d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90752d : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* JADX INFO: renamed from: i */
    public ChannelFlow<T> mo90742i(@NotNull CoroutineContext context, int capacity, @NotNull BufferOverflow onBufferOverflow) {
        return new C41631b(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* JADX INFO: renamed from: j */
    public InterfaceC41634e<T> mo90873j() {
        return new C41631b(this.channel, this.consume, null, 0, null, 28, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m90875o() {
        if (this.consume && f91655g.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC41576o<T> mo90874m(@NotNull InterfaceC41709m0 scope) {
        m90875o();
        if (this.capacity == -3) {
            return this.channel;
        }
        return super.mo90874m(scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41631b(@NotNull InterfaceC41576o<? extends T> interfaceC41576o, boolean z11, @NotNull CoroutineContext coroutineContext, int i11, @NotNull BufferOverflow bufferOverflow) {
        super(coroutineContext, i11, bufferOverflow);
        this.channel = interfaceC41576o;
        this.consume = z11;
    }
}
