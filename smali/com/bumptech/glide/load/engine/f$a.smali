.class public Lcom/bumptech/glide/load/engine/f$a;
.super Ljava/lang/Object;
.source "Engine.java"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/bumptech/glide/load/engine/DecodeJob$e;

.field public final b:Landroidx/core/util/Pools$Pool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Lcom/bumptech/glide/load/engine/DecodeJob<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/DecodeJob$e;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/bumptech/glide/load/engine/f$a$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/engine/f$a$a;-><init>(Lcom/bumptech/glide/load/engine/f$a;)V

    .line 9
    .line 10
    const/16 v1, 0x96

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lq2/a;->d(ILq2/a$d;)Landroidx/core/util/Pools$Pool;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/bumptech/glide/load/engine/f$a;->b:Landroidx/core/util/Pools$Pool;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/f$a;->a:Lcom/bumptech/glide/load/engine/DecodeJob$e;

    .line 19
    return-void
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
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/e;Ljava/lang/Object;Lv1/e;Lt1/b;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lv1/c;Ljava/util/Map;ZZZLt1/e;Lcom/bumptech/glide/load/engine/DecodeJob$b;)Lcom/bumptech/glide/load/engine/DecodeJob;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/e;",
            "Ljava/lang/Object;",
            "Lv1/e;",
            "Lt1/b;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/Priority;",
            "Lv1/c;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lt1/h<",
            "*>;>;ZZZ",
            "Lt1/e;",
            "Lcom/bumptech/glide/load/engine/DecodeJob$b<",
            "TR;>;)",
            "Lcom/bumptech/glide/load/engine/DecodeJob<",
            "TR;>;"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/bumptech/glide/load/engine/f$a;->b:Landroidx/core/util/Pools$Pool;

    .line 5
    .line 6
    .line 7
    invoke-interface {v1}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/bumptech/glide/load/engine/DecodeJob;

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    .line 17
    check-cast v2, Lcom/bumptech/glide/load/engine/DecodeJob;

    .line 18
    .line 19
    iget v1, v0, Lcom/bumptech/glide/load/engine/f$a;->c:I

    .line 20
    .line 21
    add-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    iput v3, v0, Lcom/bumptech/glide/load/engine/f$a;->c:I

    .line 24
    .line 25
    move-object/from16 v3, p1

    .line 26
    .line 27
    move-object/from16 v4, p2

    .line 28
    .line 29
    move-object/from16 v5, p3

    .line 30
    .line 31
    move-object/from16 v6, p4

    .line 32
    .line 33
    move/from16 v7, p5

    .line 34
    .line 35
    move/from16 v8, p6

    .line 36
    .line 37
    move-object/from16 v9, p7

    .line 38
    .line 39
    move-object/from16 v10, p8

    .line 40
    .line 41
    move-object/from16 v11, p9

    .line 42
    .line 43
    move-object/from16 v12, p10

    .line 44
    .line 45
    move-object/from16 v13, p11

    .line 46
    .line 47
    move/from16 v14, p12

    .line 48
    .line 49
    move/from16 v15, p13

    .line 50
    .line 51
    move/from16 v16, p14

    .line 52
    .line 53
    move-object/from16 v17, p15

    .line 54
    .line 55
    move-object/from16 v18, p16

    .line 56
    .line 57
    move/from16 v19, v1

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {v2 .. v19}, Lcom/bumptech/glide/load/engine/DecodeJob;->m(Lcom/bumptech/glide/e;Ljava/lang/Object;Lv1/e;Lt1/b;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/Priority;Lv1/c;Ljava/util/Map;ZZZLt1/e;Lcom/bumptech/glide/load/engine/DecodeJob$b;I)Lcom/bumptech/glide/load/engine/DecodeJob;

    .line 61
    move-result-object v1

    .line 62
    return-object v1
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
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
.end method
