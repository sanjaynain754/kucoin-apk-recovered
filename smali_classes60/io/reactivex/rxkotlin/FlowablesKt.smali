.class public final Lio/reactivex/rxkotlin/FlowablesKt;
.super Ljava/lang/Object;
.source "Flowables.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\\\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0008\u0004\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0087\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aE\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u000b\u001av\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u000c\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u00042 \u0008\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010H\u0087\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\u0011\u001a_\u0010\u0008\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00120\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u000c\"\u0004\u0008\u0002\u0010\r*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0013\u001a\u0090\u0001\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u000c\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u0014\"\u0004\u0008\u0004\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u00042\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u00042&\u0008\u0004\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0016H\u0087\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\u0017\u001a\u00aa\u0001\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u000c\"\u0004\u0008\u0002\u0010\r\"\u0004\u0008\u0003\u0010\u0014\"\u0004\u0008\u0004\u0010\u0018\"\u0004\u0008\u0005\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u00042\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00028\u00030\u00042\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00040\u00042,\u0008\u0004\u0010\u0007\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001aH\u0087\u0008\u00a2\u0006\u0004\u0008\u0008\u0010\u001b\u001a\\\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001\"\u0004\u0008\u0002\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u001a\u0008\u0004\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0087\u0008\u00a2\u0006\u0004\u0008\u001d\u0010\t\u001aE\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "T",
        "U",
        "R",
        "Lio/reactivex/Flowable;",
        "Lsh0/b;",
        "other",
        "Lkotlin/Function2;",
        "combiner",
        "withLatestFrom",
        "(Lio/reactivex/Flowable;Lsh0/b;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Flowable;",
        "Lkotlin/Pair;",
        "(Lio/reactivex/Flowable;Lsh0/b;)Lio/reactivex/Flowable;",
        "T1",
        "T2",
        "o1",
        "o2",
        "Lkotlin/Function3;",
        "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function3;)Lio/reactivex/Flowable;",
        "Lkotlin/Triple;",
        "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;)Lio/reactivex/Flowable;",
        "T3",
        "o3",
        "Lkotlin/Function4;",
        "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function4;)Lio/reactivex/Flowable;",
        "T4",
        "o4",
        "Lkotlin/Function5;",
        "(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function5;)Lio/reactivex/Flowable;",
        "zipper",
        "zipWith",
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
.method public static final withLatestFrom(Lio/reactivex/Flowable;Lsh0/b;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TU;>;)",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Pair<",
            "TT;TU;>;>;"
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    sget-object v0, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$2;->INSTANCE:Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$2;

    invoke-virtual {p0, p1, v0}, Lio/reactivex/Flowable;->withLatestFrom(Lsh0/b;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "withLatestFrom(other, Bi\u2026on{ t, u -> Pair(t,u)  })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final withLatestFrom(Lio/reactivex/Flowable;Lsh0/b;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TU;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-TU;+TR;>;)",
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$1;

    invoke-direct {v0, p2}, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0, p1, v0}, Lio/reactivex/Flowable;->withLatestFrom(Lsh0/b;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "withLatestFrom(other, Bi\u2026combiner.invoke(t, u)  })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final withLatestFrom(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TT1;>;",
            "Lsh0/b<",
            "TT2;>;)",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Triple<",
            "TT;TT1;TT2;>;>;"
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 4
    sget-object v0, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$4;->INSTANCE:Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$4;

    invoke-virtual {p0, p1, p2, v0}, Lio/reactivex/Flowable;->withLatestFrom(Lsh0/b;Lsh0/b;Lio/reactivex/functions/Function3;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "withLatestFrom(o1, o2, F\u20262 -> Triple(t, t1, t2) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final withLatestFrom(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function3;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TT1;>;",
            "Lsh0/b<",
            "TT2;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-TT;-TT1;-TT2;+TR;>;)",
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    new-instance v0, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$3;

    invoke-direct {v0, p3}, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$3;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-virtual {p0, p1, p2, v0}, Lio/reactivex/Flowable;->withLatestFrom(Lsh0/b;Lsh0/b;Lio/reactivex/functions/Function3;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "withLatestFrom(o1, o2, F\u2026iner.invoke(t, t1, t2) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final withLatestFrom(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function4;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TT1;>;",
            "Lsh0/b<",
            "TT2;>;",
            "Lsh0/b<",
            "TT3;>;",
            "Lkotlin/jvm/functions/Function4<",
            "-TT;-TT1;-TT2;-TT3;+TR;>;)",
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 5
    new-instance v0, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$5;

    invoke-direct {v0, p4}, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$5;-><init>(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lio/reactivex/Flowable;->withLatestFrom(Lsh0/b;Lsh0/b;Lsh0/b;Lio/reactivex/functions/Function4;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "withLatestFrom(o1, o2, o\u2026.invoke(t, t1, t2, t3) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final withLatestFrom(Lio/reactivex/Flowable;Lsh0/b;Lsh0/b;Lsh0/b;Lsh0/b;Lkotlin/jvm/functions/Function5;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "T3:",
            "Ljava/lang/Object;",
            "T4:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TT1;>;",
            "Lsh0/b<",
            "TT2;>;",
            "Lsh0/b<",
            "TT3;>;",
            "Lsh0/b<",
            "TT4;>;",
            "Lkotlin/jvm/functions/Function5<",
            "-TT;-TT1;-TT2;-TT3;-TT4;+TR;>;)",
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

    move-object v0, p5

    .line 6
    new-instance p5, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$6;

    invoke-direct {p5, v0}, Lio/reactivex/rxkotlin/FlowablesKt$withLatestFrom$6;-><init>(Lkotlin/jvm/functions/Function5;)V

    invoke-virtual/range {p0 .. p5}, Lio/reactivex/Flowable;->withLatestFrom(Lsh0/b;Lsh0/b;Lsh0/b;Lsh0/b;Lio/reactivex/functions/Function5;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "withLatestFrom(o1, o2, o\u2026oke(t, t1, t2, t3, t4) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final zipWith(Lio/reactivex/Flowable;Lsh0/b;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TU;>;)",
            "Lio/reactivex/Flowable<",
            "Lkotlin/Pair<",
            "TT;TU;>;>;"
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
    sget-object v0, Lio/reactivex/rxkotlin/FlowablesKt$zipWith$2;->INSTANCE:Lio/reactivex/rxkotlin/FlowablesKt$zipWith$2;

    invoke-virtual {p0, p1, v0}, Lio/reactivex/Flowable;->zipWith(Lsh0/b;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "zipWith(other, BiFunction { t, u -> Pair(t,u) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final zipWith(Lio/reactivex/Flowable;Lsh0/b;Lkotlin/jvm/functions/Function2;)Lio/reactivex/Flowable;
    .locals 1
    .param p0    # Lio/reactivex/Flowable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lsh0/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/Flowable<",
            "TT;>;",
            "Lsh0/b<",
            "TU;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-TU;+TR;>;)",
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lio/reactivex/rxkotlin/FlowablesKt$zipWith$1;

    invoke-direct {v0, p2}, Lio/reactivex/rxkotlin/FlowablesKt$zipWith$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0, p1, v0}, Lio/reactivex/Flowable;->zipWith(Lsh0/b;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Flowable;

    move-result-object p0

    const-string p1, "zipWith(other, BiFunctio\u2026-> zipper.invoke(t, u) })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
