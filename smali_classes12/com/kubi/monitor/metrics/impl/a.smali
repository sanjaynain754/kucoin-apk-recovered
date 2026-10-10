.class public final Lcom/kubi/monitor/metrics/impl/a;
.super Ljava/lang/Object;
.source "MemCollector.kt"

# interfaces
.implements Lbr/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/kubi/monitor/metrics/impl/a;",
        "Lbr/a;",
        "<init>",
        "()V",
        "Lcom/kubi/monitor/metrics/bean/CollectorData;",
        "b",
        "()Lcom/kubi/monitor/metrics/bean/CollectorData;",
        "",
        "a",
        "()I",
        "Ljava/lang/Runtime;",
        "Ljava/lang/Runtime;",
        "runtime",
        "Monitor_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/Runtime;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-string v1, "getRuntime()"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/monitor/metrics/impl/a;->a:Ljava/lang/Runtime;

    .line 15
    return-void
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
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public b()Lcom/kubi/monitor/metrics/bean/CollectorData;
    .locals 11
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lzq/e;->a:Lzq/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lzq/e;->k()Landroidx/core/util/Pools$Pool;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/monitor/metrics/bean/CollectorData;

    .line 13
    const/4 v1, 0x2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/kubi/monitor/metrics/bean/CollectorData;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Lcom/kubi/monitor/metrics/bean/CollectorData;-><init>(I)V

    .line 21
    goto :goto_0

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/metrics/bean/CollectorData;->i(I)V

    .line 25
    .line 26
    :goto_0
    iget-object v1, p0, Lcom/kubi/monitor/metrics/impl/a;->a:Ljava/lang/Runtime;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Runtime;->totalMemory()J

    .line 30
    move-result-wide v1

    .line 31
    .line 32
    iget-object v3, p0, Lcom/kubi/monitor/metrics/impl/a;->a:Ljava/lang/Runtime;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Runtime;->freeMemory()J

    .line 36
    move-result-wide v3

    .line 37
    .line 38
    iget-object v5, p0, Lcom/kubi/monitor/metrics/impl/a;->a:Ljava/lang/Runtime;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Runtime;->maxMemory()J

    .line 42
    move-result-wide v5

    .line 43
    .line 44
    sget-object v7, Lcom/kubi/monitor/metrics/util/a;->a:Lcom/kubi/monitor/metrics/util/a;

    .line 45
    .line 46
    sget-object v8, Lcom/kubi/monitor/metrics/util/StorageUnit;->BYTES:Lcom/kubi/monitor/metrics/util/StorageUnit;

    .line 47
    .line 48
    sub-long v9, v1, v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v8, v9, v10}, Lcom/kubi/monitor/metrics/util/StorageUnit;->toMegabytes(J)J

    .line 52
    move-result-wide v9

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7, v9, v10}, Lcom/kubi/monitor/metrics/util/a;->a(J)I

    .line 56
    move-result v9

    .line 57
    sub-long/2addr v5, v1

    .line 58
    add-long/2addr v5, v3

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8, v5, v6}, Lcom/kubi/monitor/metrics/util/StorageUnit;->toMegabytes(J)J

    .line 62
    move-result-wide v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v7, v1, v2}, Lcom/kubi/monitor/metrics/util/a;->a(J)I

    .line 66
    move-result v1

    .line 67
    int-to-long v2, v9

    .line 68
    int-to-long v4, v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/kubi/monitor/metrics/bean/CollectorData;->g(JJ)V

    .line 72
    .line 73
    const-string v1, "mem data "

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    const-string v2, "MetricsManager"

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    return-object v0
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
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method
