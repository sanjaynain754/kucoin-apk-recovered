package com.facebook.imagepipeline.producers;

import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p192d6.C36621b;
import p786y5.C46385a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ThreadHandoffProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0016B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/imagepipeline/producers/v0;", "inputProducer", "Lcom/facebook/imagepipeline/producers/f1;", "threadHandoffProducerQueue", "<init>", "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/producers/f1;)V", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V", "Lcom/facebook/imagepipeline/producers/v0;", "c", "()Lcom/facebook/imagepipeline/producers/v0;", "b", "Lcom/facebook/imagepipeline/producers/f1;", "d", "()Lcom/facebook/imagepipeline/producers/f1;", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nThreadHandoffProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadHandoffProducer.kt\ncom/facebook/imagepipeline/producers/ThreadHandoffProducer\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,72:1\n40#2,9:73\n*S KotlinDebug\n*F\n+ 1 ThreadHandoffProducer.kt\ncom/facebook/imagepipeline/producers/ThreadHandoffProducer\n*L\n22#1:73,9\n*E\n"})
public final class ThreadHandoffProducer<T> implements InterfaceC5731v0<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5731v0<T> inputProducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5693f1 threadHandoffProducerQueue;

    /* JADX INFO: compiled from: ThreadHandoffProducer.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/ThreadHandoffProducer$Companion;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/producers/w0;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/w0;)Ljava/lang/String;", "", "b", "(Lcom/facebook/imagepipeline/producers/w0;)Z", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m9595a(InterfaceC5733w0 context) {
            if (C46385a.m102299b()) {
                return "ThreadHandoffProducer_produceResults_" + context.getId();
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m9596b(InterfaceC5733w0 context) {
            if (!context.mo9664b().getExperiments().getHandOffOnUiThreadOnly() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.ThreadHandoffProducer$a */
    /* JADX INFO: compiled from: ThreadHandoffProducer.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/facebook/imagepipeline/producers/ThreadHandoffProducer$a", "Lcom/facebook/imagepipeline/producers/f;", "", "b", "()V", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5674a extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC5687d1<T> f9251a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ThreadHandoffProducer<T> f9252b;

        public C5674a(AbstractC5687d1<T> abstractC5687d1, ThreadHandoffProducer<T> threadHandoffProducer) {
            this.f9251a = abstractC5687d1;
            this.f9252b = threadHandoffProducer;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            this.f9251a.m99725a();
            this.f9252b.getThreadHandoffProducerQueue().mo9686a(this.f9251a);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.ThreadHandoffProducer$b */
    /* JADX INFO: compiled from: ThreadHandoffProducer.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0006\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"com/facebook/imagepipeline/producers/ThreadHandoffProducer$b", "Lcom/facebook/imagepipeline/producers/d1;", "ignored", "", "f", "(Ljava/lang/Object;)V", "b", "c", "()Ljava/lang/Object;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5675b extends AbstractC5687d1<T> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC5712m<T> f9253g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5737y0 f9254h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC5733w0 f9255i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ ThreadHandoffProducer<T> f9256j;

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: c */
        public T mo9586c() throws Exception {
            return null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5675b(InterfaceC5712m<T> interfaceC5712m, InterfaceC5737y0 interfaceC5737y0, InterfaceC5733w0 interfaceC5733w0, ThreadHandoffProducer<T> threadHandoffProducer) {
            super(interfaceC5712m, interfaceC5737y0, interfaceC5733w0, "BackgroundThreadHandoffProducer");
            this.f9253g = interfaceC5712m;
            this.f9254h = interfaceC5737y0;
            this.f9255i = interfaceC5733w0;
            this.f9256j = threadHandoffProducer;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5687d1, p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: f */
        public void mo9597f(T ignored) {
            this.f9254h.mo9462j(this.f9255i, "BackgroundThreadHandoffProducer", null);
            this.f9256j.m9593c().mo9524a(this.f9253g, this.f9255i);
        }

        @Override // p651u3.AbstractRunnableC45105h
        /* JADX INFO: renamed from: b */
        public void mo9585b(T ignored) {
        }
    }

    public ThreadHandoffProducer(@NotNull InterfaceC5731v0<T> inputProducer, @NotNull InterfaceC5693f1 threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.inputProducer = inputProducer;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(@NotNull InterfaceC5712m<T> consumer, @NotNull InterfaceC5733w0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!C36621b.m81959d()) {
            InterfaceC5737y0 interfaceC5737y0Mo9665g = context.mo9665g();
            Companion companion = INSTANCE;
            if (companion.m9596b(context)) {
                interfaceC5737y0Mo9665g.mo9454b(context, "BackgroundThreadHandoffProducer");
                interfaceC5737y0Mo9665g.mo9462j(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.mo9524a(consumer, context);
                return;
            } else {
                C5675b c5675b = new C5675b(consumer, interfaceC5737y0Mo9665g, context, this);
                context.mo9667i(new C5674a(c5675b, this));
                this.threadHandoffProducerQueue.mo9687b(C46385a.m102298a(c5675b, companion.m9595a(context)));
                return;
            }
        }
        C36621b.m81957a("ThreadHandoffProducer#produceResults");
        try {
            InterfaceC5737y0 interfaceC5737y0Mo9665g2 = context.mo9665g();
            Companion companion2 = INSTANCE;
            if (companion2.m9596b(context)) {
                interfaceC5737y0Mo9665g2.mo9454b(context, "BackgroundThreadHandoffProducer");
                interfaceC5737y0Mo9665g2.mo9462j(context, "BackgroundThreadHandoffProducer", null);
                this.inputProducer.mo9524a(consumer, context);
            } else {
                C5675b c5675b2 = new C5675b(consumer, interfaceC5737y0Mo9665g2, context, this);
                context.mo9667i(new C5674a(c5675b2, this));
                this.threadHandoffProducerQueue.mo9687b(C46385a.m102298a(c5675b2, companion2.m9595a(context)));
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            C36621b.m81958b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC5731v0<T> m9593c() {
        return this.inputProducer;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC5693f1 getThreadHandoffProducerQueue() {
        return this.threadHandoffProducerQueue;
    }
}
