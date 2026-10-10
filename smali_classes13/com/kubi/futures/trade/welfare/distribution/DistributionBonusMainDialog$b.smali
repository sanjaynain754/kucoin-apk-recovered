.class public final Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$b;
.super Landroid/os/CountDownTimer;
.source "DistributionBonusMainDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;->L4()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$startTimeCountDownText$1",
        "Landroid/os/CountDownTimer;",
        "onTick",
        "",
        "millisUntilFinished",
        "",
        "onFinish",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;


# direct methods
.method public constructor <init>(JLcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;)V
    .locals 2

    .line 1
    .line 2
    iput-object p3, p0, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$b;->a:Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;

    .line 3
    .line 4
    const-wide/16 v0, 0x3e8

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    .line 8
    return-void
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
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$b;->a:Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;

    .line 3
    .line 4
    const-string v1, "00"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1, v1, v1}, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;->u4(Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    return-void
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
.end method

.method public onTick(J)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toDays(J)J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    .line 10
    move-result-wide v3

    .line 11
    .line 12
    const/16 v5, 0x18

    .line 13
    int-to-long v5, v5

    .line 14
    rem-long/2addr v3, v5

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMinutes(J)J

    .line 18
    move-result-wide p1

    .line 19
    .line 20
    const/16 v0, 0x3c

    .line 21
    int-to-long v5, v0

    .line 22
    rem-long/2addr p1, v5

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$b;->a:Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2}, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;->r4(Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;J)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    iget-object v2, p0, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$b;->a:Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3, v4}, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;->r4(Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;J)Ljava/lang/String;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    iget-object v3, p0, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog$b;->a:Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;

    .line 37
    .line 38
    .line 39
    invoke-static {v3, p1, p2}, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;->r4(Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;J)Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1, v2, p1}, Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;->u4(Lcom/kubi/futures/trade/welfare/distribution/DistributionBonusMainDialog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void
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
.end method
