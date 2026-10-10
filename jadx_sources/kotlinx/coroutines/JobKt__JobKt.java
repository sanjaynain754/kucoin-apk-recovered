package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\u00020\u0012*\u00020\u00152\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0012*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\u0012*\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001f\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\u00020\u0012*\u00020\u00152\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010¢\u0006\u0004\b!\u0010\u0017\"\u0015\u0010$\u001a\u00020\u0001*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010'\u001a\u00020\u0000*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m90084d2 = {"Lkotlinx/coroutines/x1;", "", "invokeImmediately", "Lkotlinx/coroutines/a2;", "handler", "Lkotlinx/coroutines/b1;", "o", "(Lkotlinx/coroutines/x1;ZLkotlinx/coroutines/a2;)Lkotlinx/coroutines/b1;", "parent", "Lkotlinx/coroutines/z;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/z;", "handle", "k", "(Lkotlinx/coroutines/x1;Lkotlinx/coroutines/b1;)Lkotlinx/coroutines/b1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;)V", "Lkotlin/coroutines/CoroutineContext;", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "m", "(Lkotlinx/coroutines/x1;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/coroutines/CoroutineContext;)V", "", "message", "", "d", "(Lkotlinx/coroutines/x1;Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "q", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "n", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/x1;", "job", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/JobKt")
@SourceDebugExtension({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,692:1\n1317#2,2:693\n1317#2,2:695\n1317#2,2:697\n1317#2,2:699\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n520#1:693,2\n534#1:695,2\n628#1:697,2\n652#1:699,2\n*E\n"})
public final /* synthetic */ class JobKt__JobKt {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ InterfaceC41550b1 m90372p(InterfaceC41775x1 interfaceC41775x1, boolean z11, AbstractC41542a2 abstractC41542a2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return C41783z1.m91409o(interfaceC41775x1, z11, abstractC41542a2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC41781z m90357a(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        return new C41779y1(interfaceC41775x1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC41781z m90358b(InterfaceC41775x1 interfaceC41775x1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41775x1 = null;
        }
        return C41783z1.m91395a(interfaceC41775x1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m90359c(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            interfaceC41775x1.mo90415a(cancellationException);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m90361e(CoroutineContext coroutineContext, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        C41783z1.m91397c(coroutineContext, cancellationException);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m90362f(InterfaceC41775x1 interfaceC41775x1, String str, Throwable th2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        C41783z1.m91398d(interfaceC41775x1, str, th2);
    }

    /* JADX INFO: renamed from: g */
    public static final void m90363g(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        Sequence<InterfaceC41775x1> sequenceMo90438v;
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 == null || (sequenceMo90438v = interfaceC41775x1.mo90438v()) == null) {
            return;
        }
        Iterator<InterfaceC41775x1> it = sequenceMo90438v.iterator();
        while (it.hasNext()) {
            it.next().mo90415a(cancellationException);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m90365i(CoroutineContext coroutineContext, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        C41783z1.m91401g(coroutineContext, cancellationException);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m90366j(InterfaceC41775x1 interfaceC41775x1, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        C41783z1.m91402h(interfaceC41775x1, cancellationException);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final InterfaceC41550b1 m90367k(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull InterfaceC41550b1 interfaceC41550b1) {
        return m90372p(interfaceC41775x1, false, new C41581d1(interfaceC41550b1), 1, null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m90368l(@NotNull CoroutineContext coroutineContext) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            C41783z1.m91407m(interfaceC41775x1);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final InterfaceC41775x1 m90370n(@NotNull CoroutineContext coroutineContext) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            return interfaceC41775x1;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final InterfaceC41550b1 m90371o(@NotNull InterfaceC41775x1 interfaceC41775x1, boolean z11, @NotNull AbstractC41542a2 abstractC41542a2) {
        return interfaceC41775x1 instanceof JobSupport ? ((JobSupport) interfaceC41775x1).m90432q0(z11, abstractC41542a2) : interfaceC41775x1.mo90440w(abstractC41542a2.mo90449u(), z11, new JobKt__JobKt$invokeOnCompletion$1(abstractC41542a2));
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m90373q(@NotNull CoroutineContext coroutineContext) {
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) coroutineContext.get(InterfaceC41775x1.INSTANCE);
        if (interfaceC41775x1 != null) {
            return interfaceC41775x1.isActive();
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final void m90360d(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull String str, @Nullable Throwable th2) {
        interfaceC41775x1.mo90415a(C41702k1.m91113a(str, th2));
    }

    /* JADX INFO: renamed from: h */
    public static final void m90364h(@NotNull InterfaceC41775x1 interfaceC41775x1, @Nullable CancellationException cancellationException) {
        Iterator<InterfaceC41775x1> it = interfaceC41775x1.mo90438v().iterator();
        while (it.hasNext()) {
            it.next().mo90415a(cancellationException);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m90369m(@NotNull InterfaceC41775x1 interfaceC41775x1) {
        if (interfaceC41775x1.isActive()) {
        } else {
            throw interfaceC41775x1.mo90442x();
        }
    }
}
