.class final Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LongObjectScatterMap.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lshark/internal/hppc/LongObjectScatterMap;->g()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lshark/internal/hppc/d<",
        "+TT;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\u0008\u0000\u0010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "T",
        "Lshark/internal/hppc/d;",
        "invoke",
        "()Lshark/internal/hppc/d;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $max:I

.field final synthetic $slot:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic this$0:Lshark/internal/hppc/LongObjectScatterMap;


# direct methods
.method public constructor <init>(Lshark/internal/hppc/LongObjectScatterMap;Lkotlin/jvm/internal/Ref$IntRef;I)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->this$0:Lshark/internal/hppc/LongObjectScatterMap;

    .line 3
    .line 4
    iput-object p2, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    .line 5
    .line 6
    iput p3, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$max:I

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    return-void
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
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->invoke()Lshark/internal/hppc/d;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lshark/internal/hppc/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lshark/internal/hppc/d<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    iget v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v2, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$max:I

    const-wide/16 v3, 0x0

    if-ge v1, v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    .line 3
    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 4
    :goto_0
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v1, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$max:I

    if-ge v0, v1, :cond_2

    .line 5
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->this$0:Lshark/internal/hppc/LongObjectScatterMap;

    invoke-static {v0}, Lshark/internal/hppc/LongObjectScatterMap;->b(Lshark/internal/hppc/LongObjectScatterMap;)[J

    move-result-object v0

    iget-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    aget-wide v5, v0, v2

    cmp-long v0, v5, v3

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->this$0:Lshark/internal/hppc/LongObjectScatterMap;

    invoke-static {v0}, Lshark/internal/hppc/LongObjectScatterMap;->c(Lshark/internal/hppc/LongObjectScatterMap;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    iget v1, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-static {v5, v6, v0}, Lshark/internal/hppc/f;->c(JLjava/lang/Object;)Lshark/internal/hppc/d;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 7
    iput v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v1, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$max:I

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->this$0:Lshark/internal/hppc/LongObjectScatterMap;

    invoke-static {v0}, Lshark/internal/hppc/LongObjectScatterMap;->a(Lshark/internal/hppc/LongObjectScatterMap;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$slot:Lkotlin/jvm/internal/Ref$IntRef;

    iget v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 10
    iget-object v0, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->this$0:Lshark/internal/hppc/LongObjectScatterMap;

    invoke-static {v0}, Lshark/internal/hppc/LongObjectScatterMap;->c(Lshark/internal/hppc/LongObjectScatterMap;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lshark/internal/hppc/LongObjectScatterMap$entrySequence$1;->$max:I

    aget-object v0, v0, v1

    if-nez v0, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    invoke-static {v3, v4, v0}, Lshark/internal/hppc/f;->c(JLjava/lang/Object;)Lshark/internal/hppc/d;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method
