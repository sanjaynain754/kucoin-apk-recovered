package com.kubi.monitor.duration;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationRule.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\u001cB=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/monitor/duration/DurationRule;", "", "", "eventName", "Lcom/kubi/monitor/duration/DurationCate;", "eventCate", "startPointName", "", "keyPointNames", "endPointNames", "<init>", "(Ljava/lang/String;Lcom/kubi/monitor/duration/DurationCate;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Lcom/kubi/monitor/duration/DurationRule$a;", "builder", "(Lcom/kubi/monitor/duration/DurationRule$a;)V", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "c", "b", "Lcom/kubi/monitor/duration/DurationCate;", "()Lcom/kubi/monitor/duration/DurationCate;", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "f", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class DurationRule {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String eventName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final DurationCate eventCate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String startPointName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<String> keyPointNames;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<String> endPointNames;

    /* JADX INFO: compiled from: DurationRule.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m90084d2 = {"Lcom/kubi/monitor/duration/DurationRule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/kubi/monitor/duration/DurationRule$a;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/kubi/monitor/duration/DurationRule;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/kubi/monitor/duration/DurationRule;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DurationRule build(@NotNull Function1<? super C19218a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            C19218a c19218a = new C19218a();
            block.invoke(c19218a);
            return c19218a.m42422a();
        }
    }

    /* JADX INFO: renamed from: com.kubi.monitor.duration.DurationRule$a */
    /* JADX INFO: compiled from: DurationRule.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u000f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006\""}, m90084d2 = {"Lcom/kubi/monitor/duration/DurationRule$a;", "", "<init>", "()V", "Lcom/kubi/monitor/duration/DurationRule;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/monitor/duration/DurationRule;", "", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "eventName", "Lcom/kubi/monitor/duration/DurationCate;", "b", "Lcom/kubi/monitor/duration/DurationCate;", "c", "()Lcom/kubi/monitor/duration/DurationCate;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/monitor/duration/DurationCate;)V", "eventCate", "f", "k", "startPointName", "", "Ljava/util/List;", "e", "()Ljava/util/List;", "j", "(Ljava/util/List;)V", "keyPointNames", "g", "endPointNames", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C19218a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String eventName = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public DurationCate eventCate = DurationCate.click;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public String startPointName = "";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public List<String> keyPointNames = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public List<String> endPointNames = CollectionsKt.emptyList();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final DurationRule m42422a() {
            return new DurationRule(this, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<String> m42423b() {
            return this.endPointNames;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final DurationCate getEventCate() {
            return this.eventCate;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final List<String> m42426e() {
            return this.keyPointNames;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getStartPointName() {
            return this.startPointName;
        }

        /* JADX INFO: renamed from: g */
        public final void m42428g(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.endPointNames = list;
        }

        /* JADX INFO: renamed from: h */
        public final void m42429h(@NotNull DurationCate durationCate) {
            Intrinsics.checkNotNullParameter(durationCate, "<set-?>");
            this.eventCate = durationCate;
        }

        /* JADX INFO: renamed from: i */
        public final void m42430i(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.eventName = str;
        }

        /* JADX INFO: renamed from: j */
        public final void m42431j(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.keyPointNames = list;
        }

        /* JADX INFO: renamed from: k */
        public final void m42432k(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.startPointName = str;
        }
    }

    public /* synthetic */ DurationRule(C19218a c19218a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c19218a);
    }

    public DurationRule(String str, DurationCate durationCate, String str2, List<String> list, List<String> list2) {
        this.eventName = str;
        this.eventCate = durationCate;
        this.startPointName = str2;
        this.keyPointNames = list;
        this.endPointNames = list2;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<String> m42417a() {
        return this.endPointNames;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DurationCate getEventCate() {
        return this.eventCate;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<String> m42420d() {
        return this.keyPointNames;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStartPointName() {
        return this.startPointName;
    }

    @NotNull
    public String toString() {
        return "DurationRule(eventName='" + this.eventName + "', eventCate=" + this.eventCate + ", startPointName='" + this.startPointName + "', keyPointNames=" + this.keyPointNames + ", endPointNames=" + this.endPointNames + ')';
    }

    public DurationRule(C19218a c19218a) {
        this(c19218a.getEventName(), c19218a.getEventCate(), c19218a.getStartPointName(), c19218a.m42426e(), c19218a.m42423b());
        if (c19218a.getEventName().length() != 0) {
            if (c19218a.getStartPointName().length() != 0) {
                if (c19218a.m42423b().isEmpty()) {
                    throw new IllegalArgumentException("DurationRule " + this + " endPointNames is illegal");
                }
                return;
            }
            throw new IllegalArgumentException("DurationRule " + this + " startPointName is illegal");
        }
        throw new IllegalArgumentException("DurationRule " + this + " eventName is illegal");
    }
}
