.class public final Lio/reactivex/rxkotlin/FlowableKt;
.super Ljava/lang/Object;
.source "flowable.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c7\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\u000c\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u00019\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0007\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0001*\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\r\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0010\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0013\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0016\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0019\u001a)\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000\u001cH\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u001d\u001a\u0019\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u001f\u001a\'\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000 \u00a2\u0006\u0004\u0008\u0003\u0010!\u001a)\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000\"H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010#\u001a\'\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000$\u00a2\u0006\u0004\u0008\u0003\u0010%\u001a1\u0010&\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00010\"H\u0007\u00a2\u0006\u0004\u0008&\u0010#\u001a1\u0010\'\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00010\"H\u0007\u00a2\u0006\u0004\u0008\'\u0010#\u001aP\u0010+\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a\"\u0008\u0008\u0001\u0010(*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0008\u0004\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010$0)H\u0087\u0008\u00a2\u0006\u0004\u0008+\u0010,\u001ae\u00102\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a\"\u0008\u0008\u0001\u0010(*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00010\"2)\u0008\u0004\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00028\u00010)H\u0087\u0008\u00a2\u0006\u0004\u00082\u00103\u001ae\u00105\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a\"\u0008\u0008\u0001\u0010(*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00010\"2)\u0008\u0004\u00104\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-\u00a2\u0006\u000c\u0008.\u0012\u0008\u0008/\u0012\u0004\u0008\u0008(0\u0012\u0004\u0012\u00028\u00010)H\u0087\u0008\u00a2\u0006\u0004\u00085\u00103\u001a*\u00106\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\n\u0008\u0000\u0010(\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\u0008\u00030\u0001H\u0087\u0008\u00a2\u0006\u0004\u00086\u00107\u001a*\u00108\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\n\u0008\u0000\u0010(\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\u0008\u00030\u0001H\u0087\u0008\u00a2\u0006\u0004\u00088\u00107\u001a)\u0010:\u001a\u0008\u0012\u0004\u0012\u00028\u000009\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000 H\u0002\u00a2\u0006\u0004\u0008:\u0010;\u001aM\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=0\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a\"\u0008\u0008\u0001\u0010(*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u00a2\u0006\u0004\u00082\u0010>\u001ak\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020B0\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a\"\u0008\u0008\u0001\u0010(*\u00020\u001a\"\u0008\u0008\u0002\u0010?*\u00020\u001a*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010@\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00012\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0001H\u0007\u00a2\u0006\u0004\u00082\u0010C\u001aM\u0010E\u001a&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008E\u00107\u001aM\u0010F\u001a&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008F\u00107\u001aM\u0010G\u001a&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008G\u00107\u001a/\u0010H\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u00a2\u0006\u0004\u0008H\u00107\u001a\u00ce\u0001\u0010N\u001a\u0096\u0001\u0012D\u0012B\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D* \u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010M0L D*J\u0012D\u0012B\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D* \u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010M0L\u0018\u00010K0K\"\u0008\u0008\u0000\u0010I*\u00020\u001a\"\u0008\u0008\u0001\u0010J*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=0\u0001H\u0007\u00a2\u0006\u0004\u0008N\u0010O\u001a\u00bf\u0002\u0010R\u001a\u0087\u0002\u0012|\u0012z\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P D*<\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P\u0018\u00010M0L D*\u0082\u0001\u0012|\u0012z\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P D*<\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P\u0018\u00010M0L\u0018\u00010K0K\"\u0008\u0008\u0000\u0010I*\u00020\u001a\"\u0008\u0008\u0001\u0010J*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=0\u0001H\u0007\u00a2\u0006\u0004\u0008R\u0010O\u001aM\u0010F\u001a&\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\u000c\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\u0008\u0008\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000S0\"H\u0007\u00a2\u0006\u0004\u0008F\u0010#\u00a8\u0006T"
    }
    d2 = {
        "",
        "Lio/reactivex/Flowable;",
        "",
        "toFlowable",
        "([Z)Lio/reactivex/Flowable;",
        "",
        "",
        "([B)Lio/reactivex/Flowable;",
        "",
        "",
        "([C)Lio/reactivex/Flowable;",
        "",
        "",
        "([S)Lio/reactivex/Flowable;",
        "",
        "",
        "([I)Lio/reactivex/Flowable;",
        "",
        "",
        "([J)Lio/reactivex/Flowable;",
        "",
        "",
        "([F)Lio/reactivex/Flowable;",
        "",
        "",
        "([D)Lio/reactivex/Flowable;",
        "",
        "T",
        "",
        "([Ljava/lang/Object;)Lio/reactivex/Flowable;",
        "Lkotlin/ranges/IntProgression;",
        "(Lkotlin/ranges/IntProgression;)Lio/reactivex/Flowable;",
        "",
        "(Ljava/util/Iterator;)Lio/reactivex/Flowable;",
        "",
        "(Ljava/lang/Iterable;)Lio/reactivex/Flowable;",
        "Lkotlin/sequences/Sequence;",
        "(Lkotlin/sequences/Sequence;)Lio/reactivex/Flowable;",
        "merge",
        "mergeDelayError",
        "R",
        "Lkotlin/Function1;",
        "body",
        "flatMapSequence",
        "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "args",
        "combineFunction",
        "combineLatest",
        "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;",
        "zipFunction",
        "zip",
        "cast",
        "(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;",
        "ofType",
        "io/reactivex/rxkotlin/FlowableKt$toIterable$1",
        "toIterable",
        "(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;",
        "flowable",
        "Lkotlin/Pair;",
        "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;",
        "U",
        "flowable1",
        "flowable2",
        "Lkotlin/Triple;",
        "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;",
        "kotlin.jvm.PlatformType",
        "mergeAll",
        "concatAll",
        "switchLatest",
        "switchOnNext",
        "A",
        "B",
        "Lio/reactivex/Single;",
        "",
        "",
        "toMap",
        "(Lio/reactivex/Flowable;)Lio/reactivex/Single;",
        "",
        "",
        "toMultimap",
        "Lsh0/b;",
        "rxkotlin"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private static final cast(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 2
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "*>;)",
            "Lio/reactivex/Flowable<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->PASS_THROUGH:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    const-string v1, "R"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    .line 7
    .line 8
    const-class v0, Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lio/reactivex/Flowable;->cast(Ljava/lang/Class;)Lio/reactivex/Flowable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    const-string v0, "cast(R::class.java)"

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final combineLatest(Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 2
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lio/reactivex/Flowable<",
            "TR;>;)",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Pair<",
            "TT;TR;>;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$combineLatest$2;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$combineLatest$2;

    if-eqz v0, :cond_0

    new-instance v1, Lio/reactivex/rxkotlin/FlowableKt$sam$io_reactivex_functions_BiFunction$0;

    invoke-direct {v1, v0}, Lio/reactivex/rxkotlin/FlowableKt$sam$io_reactivex_functions_BiFunction$0;-><init>(Lkotlin/jvm/functions/Function2;)V

    move-object v0, v1

    :cond_0
    check-cast v0, Lio/reactivex/functions/BiFunction;

    invoke-static {p0, p1, v0}, Lio/reactivex/Flowable;->combineLatest(Lsh0/b;Lsh0/b;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "Flowable.combineLatest(t\u2026able, BiFunction(::Pair))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final combineLatest(Lio/reactivex/Flowable;Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 2
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lio/reactivex/Flowable<",
            "TR;>;",
            "Lio/reactivex/Flowable<",
            "TU;>;)",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Triple<",
            "TT;TR;TU;>;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$combineLatest$3;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$combineLatest$3;

    if-eqz v0, :cond_0

    new-instance v1, Lio/reactivex/rxkotlin/FlowableKt$sam$io_reactivex_functions_Function3$0;

    invoke-direct {v1, v0}, Lio/reactivex/rxkotlin/FlowableKt$sam$io_reactivex_functions_Function3$0;-><init>(Lkotlin/jvm/functions/Function3;)V

    move-object v0, v1

    :cond_0
    check-cast v0, Lio/reactivex/functions/Function3;

    invoke-static {p0, p1, p2, v0}, Lio/reactivex/Flowable;->combineLatest(Lsh0/b;Lsh0/b;Lsh0/b;Lio/reactivex/functions/Function3;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "Flowable.combineLatest(t\u2026le2, Function3(::Triple))"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final combineLatest(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/Flowable<",
            "TT;>;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+TT;>;+TR;>;)",
            "Lio/reactivex/Flowable<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxkotlin/FlowableKt$combineLatest$1;

    invoke-direct {v0, p1}, Lio/reactivex/rxkotlin/FlowableKt$combineLatest$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0, v0}, Lio/reactivex/Flowable;->combineLatest(Ljava/lang/Iterable;Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "Flowable.combineLatest(t\u2026List().map { it as T }) }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final concatAll(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "Lio/reactivex/Flowable<",
            "TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$concatAll$1;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$concatAll$1;

    invoke-virtual {p0, v0}, Lio/reactivex/Flowable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final concatAll(Ljava/lang/Iterable;)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lsh0/b<",
            "TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 2
    invoke-static {p0}, Lio/reactivex/Flowable;->concat(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final flatMapSequence(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Lkotlin/sequences/Sequence<",
            "+TR;>;>;)",
            "Lio/reactivex/Flowable<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/reactivex/rxkotlin/FlowableKt$flatMapSequence$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lio/reactivex/rxkotlin/FlowableKt$flatMapSequence$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lio/reactivex/Flowable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string p1, "flatMap { body(it).toFlowable() }"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method

.method public static final merge(Ljava/lang/Iterable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/Flowable<",
            "+TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lio/reactivex/Flowable;->merge(Lsh0/b;)Lio/reactivex/Flowable;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    const-string v0, "Flowable.merge(this.toFlowable())"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final mergeAll(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "Lio/reactivex/Flowable<",
            "TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$mergeAll$1;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$mergeAll$1;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/reactivex/Flowable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final mergeDelayError(Ljava/lang/Iterable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/Flowable<",
            "+TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lio/reactivex/Flowable;->mergeDelayError(Lsh0/b;)Lio/reactivex/Flowable;

    .line 8
    move-result-object p0

    .line 9
    .line 10
    const-string v0, "Flowable.mergeDelayError(this.toFlowable())"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method private static final ofType(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 2
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "*>;)",
            "Lio/reactivex/Flowable<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->PASS_THROUGH:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    const-string v1, "R"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    .line 7
    .line 8
    const-class v0, Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lio/reactivex/Flowable;->ofType(Ljava/lang/Class;)Lio/reactivex/Flowable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    const-string v0, "ofType(R::class.java)"

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    return-object p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final switchLatest(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "Lio/reactivex/Flowable<",
            "TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$switchLatest$1;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$switchLatest$1;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/reactivex/Flowable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 6
    move-result-object p0

    .line 7
    return-object p0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final switchOnNext(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "Lio/reactivex/Flowable<",
            "TT;>;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lio/reactivex/Flowable;->switchOnNext(Lsh0/b;)Lio/reactivex/Flowable;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "Flowable.switchOnNext(this)"

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    return-object p0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    invoke-static {p0}, Lio/reactivex/Flowable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string v0, "Flowable.fromIterable(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final toFlowable(Ljava/util/Iterator;)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # Ljava/util/Iterator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 12
    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toIterable(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable(Lkotlin/ranges/IntProgression;)Lio/reactivex/Flowable;
    .locals 6
    .param p0    # Lkotlin/ranges/IntProgression;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/ranges/IntProgression;",
            ")",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    int-to-long v2, v0

    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v0

    int-to-long v4, v0

    sub-long/2addr v2, v4

    const v0, 0x7fffffff

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v0

    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v2

    invoke-virtual {p0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result p0

    sub-int/2addr v2, p0

    add-int/2addr v2, v1

    const/4 p0, 0x0

    invoke-static {p0, v2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v0, p0}, Lio/reactivex/Flowable;->range(II)Lio/reactivex/Flowable;

    move-result-object p0

    const-string v0, "Flowable.range(first, Ma\u2026max(0, last - first + 1))"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 11
    :cond_0
    invoke-static {p0}, Lio/reactivex/Flowable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string v0, "Flowable.fromIterable(this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final toFlowable(Lkotlin/sequences/Sequence;)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # Lkotlin/sequences/Sequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/sequences/Sequence<",
            "+TT;>;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 14
    invoke-static {p0}, Lkotlin/sequences/SequencesKt;->asIterable(Lkotlin/sequences/Sequence;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([B)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([B)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([C)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [C
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([C)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([C)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([D)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [D
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([D)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 8
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([D)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([F)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([F)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([I)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 5
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([I)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([J)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 6
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([J)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([Ljava/lang/Object;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lio/reactivex/Flowable<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Flowable;->fromArray([Ljava/lang/Object;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string v0, "Flowable.fromArray(*this)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final toFlowable([S)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [S
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([S)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 4
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([S)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method public static final toFlowable([Z)Lio/reactivex/Flowable;
    .locals 0
    .param p0    # [Z
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Z)",
            "Lio/reactivex/Flowable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0}, Lkotlin/collections/ArraysKt;->asIterable([Z)Ljava/lang/Iterable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/rxkotlin/FlowableKt;->toFlowable(Ljava/lang/Iterable;)Lio/reactivex/Flowable;

    move-result-object p0

    return-object p0
.end method

.method private static final toIterable(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;
    .locals 1
    .param p0    # Ljava/util/Iterator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;-><init>(Ljava/util/Iterator;)V

    .line 6
    return-object v0
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final toMap(Lio/reactivex/Flowable;)Lio/reactivex/Single;
    .locals 2
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Pair<",
            "TA;TB;>;>;)",
            "Lio/reactivex/Single<",
            "Ljava/util/Map<",
            "TA;TB;>;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->UNBOUNDED_IN:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$toMap$1;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$toMap$1;

    .line 3
    .line 4
    sget-object v1, Lio/reactivex/rxkotlin/FlowableKt$toMap$2;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$toMap$2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lio/reactivex/Flowable;->toMap(Lio/reactivex/functions/Function;Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final toMultimap(Lio/reactivex/Flowable;)Lio/reactivex/Single;
    .locals 2
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Pair<",
            "TA;TB;>;>;)",
            "Lio/reactivex/Single<",
            "Ljava/util/Map<",
            "TA;",
            "Ljava/util/Collection<",
            "TB;>;>;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->UNBOUNDED_IN:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lio/reactivex/rxkotlin/FlowableKt$toMultimap$1;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$toMultimap$1;

    .line 3
    .line 4
    sget-object v1, Lio/reactivex/rxkotlin/FlowableKt$toMultimap$2;->INSTANCE:Lio/reactivex/rxkotlin/FlowableKt$toMultimap$2;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lio/reactivex/Flowable;->toMultimap(Lio/reactivex/functions/Function;Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final zip(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Ljava/lang/Iterable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lio/reactivex/Flowable<",
            "TT;>;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+TT;>;+TR;>;)",
            "Lio/reactivex/Flowable<",
            "TR;>;"
        }
    .end annotation

    .annotation runtime Lio/reactivex/annotations/BackpressureSupport;
        value = .enum Lio/reactivex/annotations/BackpressureKind;->FULL:Lio/reactivex/annotations/BackpressureKind;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/CheckReturnValue;
    .end annotation

    .annotation runtime Lio/reactivex/annotations/SchedulerSupport;
        value = "none"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lio/reactivex/rxkotlin/FlowableKt$zip$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lio/reactivex/rxkotlin/FlowableKt$zip$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lio/reactivex/Flowable;->zip(Ljava/lang/Iterable;Lio/reactivex/functions/Function;)Lio/reactivex/Flowable;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string p1, "Flowable.zip(this) { zip\u2026List().map { it as T }) }"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
