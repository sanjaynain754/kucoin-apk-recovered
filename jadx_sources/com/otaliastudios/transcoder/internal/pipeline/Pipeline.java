package com.otaliastudios.transcoder.internal.pipeline;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import w90.C45770i;

/* JADX INFO: compiled from: Pipeline.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0002\r#B;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JQ\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R6\u0010\b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "", "", "name", "", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "Lcom/otaliastudios/transcoder/internal/pipeline/AnyStep;", "chain", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/otaliastudios/transcoder/internal/pipeline/f;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/otaliastudios/transcoder/internal/pipeline/f;", "c", "()V", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "previous", "step", "", "fresh", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/f$b;Lcom/otaliastudios/transcoder/internal/pipeline/g;Z)Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "Ljava/util/List;", "Lw90/i;", "Lw90/i;", "log", "Lcom/otaliastudios/transcoder/internal/pipeline/f$b;", "headState", "", "d", "I", "headIndex", "e", "Companion", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class Pipeline {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<InterfaceC27361g<Object, InterfaceC27356b, Object, InterfaceC27356b>> chain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C45770i log;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public AbstractC27360f.b<Object> headState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int headIndex;

    /* JADX INFO: compiled from: Pipeline.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$Companion;", "", "<init>", "()V", "", "name", "Lkotlin/Function0;", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "builder", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "build$lib_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", "build", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Pipeline build$lib_release$default(Companion companion, String str, Function0 function0, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                function0 = new Function0<C27353a<Unit, InterfaceC27356b>>() { // from class: com.otaliastudios.transcoder.internal.pipeline.Pipeline$Companion$build$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p852kotlin.jvm.functions.Function0
                    @NotNull
                    public final Pipeline.C27353a<Unit, InterfaceC27356b> invoke() {
                        return new Pipeline.C27353a<>(null, 1, 0 == true ? 1 : 0);
                    }
                };
            }
            return companion.build$lib_release(str, function0);
        }

        @NotNull
        public final Pipeline build$lib_release(@NotNull String name, @NotNull Function0<? extends C27353a<?, InterfaceC27356b>> builder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new Pipeline(name, builder.invoke().m68043a(), null);
        }
    }

    /* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.Pipeline$a */
    /* JADX INFO: compiled from: Pipeline.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0001B)\b\u0000\u0012\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\b\u0010\tJP\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\"\b\b\u0002\u0010\n*\u00020\u0001\"\b\b\u0003\u0010\u000b*\u00020\u00032\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;", "", "D", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "C", "", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "steps", "<init>", "(Ljava/util/List;)V", "NewData", "NewChannel", "step", "b", "(Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/List;", "()Ljava/util/List;", "lib_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C27353a<D, C extends InterfaceC27356b> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<InterfaceC27361g<?, ?, ?, ?>> steps;

        /* JADX WARN: Multi-variable type inference failed */
        public C27353a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C27353a(@NotNull List<? extends InterfaceC27361g<?, ?, ?, ?>> steps) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.steps = steps;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<InterfaceC27361g<?, ?, ?, ?>> m68043a() {
            return this.steps;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final <NewData, NewChannel extends InterfaceC27356b> C27353a<NewData, NewChannel> m68044b(@NotNull InterfaceC27361g<D, C, NewData, NewChannel> step) {
            Intrinsics.checkNotNullParameter(step, "step");
            return new C27353a<>(CollectionsKt.plus((Collection<? extends InterfaceC27361g<D, C, NewData, NewChannel>>) this.steps, step));
        }

        public /* synthetic */ C27353a(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    public /* synthetic */ Pipeline(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pipeline(String str, List<? extends InterfaceC27361g<Object, InterfaceC27356b, Object, InterfaceC27356b>> list) {
        this.chain = list;
        this.log = new C45770i("Pipeline(" + str + ')');
        this.headState = new AbstractC27360f.b<>(Unit.INSTANCE);
        for (Pair pair : CollectionsKt.reversed(CollectionsKt.zipWithNext(list))) {
            ((InterfaceC27361g) pair.component1()).mo67962c(((InterfaceC27361g) pair.component2()).getChannel());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AbstractC27360f<Unit> m68040a() {
        this.log.m101070h("execute(): starting. head=" + this.headIndex + " steps=" + this.chain.size() + " remaining=" + (this.chain.size() - this.headIndex));
        int i11 = this.headIndex;
        AbstractC27360f.b<Object> bVarM68041b = this.headState;
        int i12 = 0;
        for (Object obj : this.chain) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            InterfaceC27361g<Object, InterfaceC27356b, Object, InterfaceC27356b> interfaceC27361g = (InterfaceC27361g) obj;
            if (i12 >= i11) {
                bVarM68041b = m68041b(bVarM68041b, interfaceC27361g, i11 == 0 || i12 != i11);
                if (bVarM68041b == null) {
                    this.log.m101070h("execute(): step " + ((Object) C27362h.m68056a(interfaceC27361g)) + " (#" + i12 + '/' + this.chain.size() + ") is waiting. headState=" + this.headState + " headIndex=" + this.headIndex);
                    return AbstractC27360f.d.f55760a;
                }
                if (bVarM68041b instanceof AbstractC27360f.a) {
                    this.log.m101066c("execute(): EOS from " + ((Object) C27362h.m68056a(interfaceC27361g)) + " (#" + i12 + '/' + this.chain.size() + ").");
                    this.headState = bVarM68041b;
                    this.headIndex = i13;
                }
            }
            i12 = i13;
        }
        if (this.chain.isEmpty()) {
            return new AbstractC27360f.a(Unit.INSTANCE);
        }
        return bVarM68041b instanceof AbstractC27360f.a ? new AbstractC27360f.a(Unit.INSTANCE) : new AbstractC27360f.b(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: c */
    public final void m68042c() {
        Iterator<T> it = this.chain.iterator();
        while (it.hasNext()) {
            ((InterfaceC27361g) it.next()).release();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC27360f.b<Object> m68041b(AbstractC27360f.b<Object> previous, InterfaceC27361g<Object, InterfaceC27356b, Object, InterfaceC27356b> step, boolean fresh) {
        AbstractC27360f<Object> abstractC27360fMo67997b = step.mo67997b(previous, fresh);
        if (abstractC27360fMo67997b instanceof AbstractC27360f.b) {
            return (AbstractC27360f.b) abstractC27360fMo67997b;
        }
        if (abstractC27360fMo67997b instanceof AbstractC27360f.c) {
            return m68041b(previous, step, false);
        }
        if (abstractC27360fMo67997b instanceof AbstractC27360f.d) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
