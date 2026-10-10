.class public final Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;
.super Lqb/b;
.source "ChatSocketExecutor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/chat/network/websockt/ChatSocketExecutor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;",
        "Lqb/b;",
        "<init>",
        "(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V",
        "Landroid/os/Message;",
        "msg",
        "",
        "c",
        "(Landroid/os/Message;)Z",
        "ImSDK_release"
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
.field public final synthetic a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;


# direct methods
.method public constructor <init>(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lqb/b;-><init>()V

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
.end method


# virtual methods
.method public c(Landroid/os/Message;)Z
    .locals 7
    .param p1    # Landroid/os/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "msg"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget v0, p1, Landroid/os/Message;->what:I

    .line 8
    const/4 v1, 0x3

    .line 9
    const/4 v2, -0x1

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    if-eq v0, v2, :cond_5

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    const/4 p1, 0x4

    .line 17
    .line 18
    if-eq v0, p1, :cond_0

    .line 19
    const/4 p1, 0x6

    .line 20
    .line 21
    if-eq v0, p1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->L(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)I

    .line 29
    move-result p1

    .line 30
    .line 31
    if-lt p1, v1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v4}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->O(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;I)V

    .line 37
    .line 38
    :cond_1
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, Lqb/c;->t(I)V

    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->C(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)V

    .line 49
    .line 50
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 51
    .line 52
    if-ne v0, v1, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lqb/c;->t(I)V

    .line 58
    .line 59
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->K(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->Q(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;Lqb/a;)V

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_3
    if-eq v0, v3, :cond_4

    .line 70
    const/4 v1, 0x5

    .line 71
    .line 72
    if-eq v0, v1, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 75
    .line 76
    const-wide/16 v5, 0xbb8

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2, v5, v6}, Lqb/c;->w(IJ)V

    .line 80
    .line 81
    :cond_4
    :goto_0
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent;->a:Lcom/kubi/monitor/TechnologyEvent;

    .line 82
    .line 83
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    const-string v1, "type"

    .line 90
    .line 91
    const-string v2, "socketDisconnect"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    const-string v1, "code"

    .line 97
    .line 98
    const-string v2, "-2"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    const-string v1, "error_message"

    .line 104
    .line 105
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v1, p1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 109
    .line 110
    const-string p1, "success"

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1, v4}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->e(Ljava/lang/String;Z)V

    .line 114
    .line 115
    const-string p1, "payment_im"

    .line 116
    .line 117
    .line 118
    invoke-static {p1, v0}, Lcom/kubi/monitor/TechnologyEvent;->d(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 119
    goto :goto_1

    .line 120
    .line 121
    :cond_5
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->L(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)I

    .line 125
    move-result p1

    .line 126
    .line 127
    const-string v0, "chat.socket"

    .line 128
    .line 129
    if-ge p1, v1, :cond_7

    .line 130
    .line 131
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->L(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)I

    .line 135
    move-result v1

    .line 136
    add-int/2addr v1, v3

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->O(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;I)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->k()Z

    .line 143
    move-result p1

    .line 144
    .line 145
    if-eqz p1, :cond_6

    .line 146
    .line 147
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->K(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;)Lcom/kubi/chat/network/websockt/ChatSocketExecutor$e;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v0}, Lcom/kubi/chat/network/websockt/ChatSocketExecutor;->Q(Lcom/kubi/chat/network/websockt/ChatSocketExecutor;Lqb/a;)V

    .line 155
    .line 156
    iget-object p1, p0, Lcom/kubi/chat/network/websockt/ChatSocketExecutor$d;->a:Lcom/kubi/chat/network/websockt/ChatSocketExecutor;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v3}, Lqb/c;->t(I)V

    .line 160
    goto :goto_1

    .line 161
    .line 162
    :cond_6
    const-string p1, "Socket\u5efa\u7acb\u8fde\u63a5[\u65e0\u7f51\u7edc]"

    .line 163
    .line 164
    .line 165
    invoke-static {v0, p1}, Lro/b;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    goto :goto_1

    .line 167
    .line 168
    :cond_7
    const-string p1, "Socket\u5efa\u7acb\u8fde\u63a5[\u5927\u4e8e3\u6b21]"

    .line 169
    .line 170
    .line 171
    invoke-static {v0, p1}, Lro/b;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    :goto_1
    return v3
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
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method
