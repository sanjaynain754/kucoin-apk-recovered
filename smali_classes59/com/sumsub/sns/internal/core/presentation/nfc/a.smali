.class public final Lcom/sumsub/sns/internal/core/presentation/nfc/a;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/core/presentation/nfc/b;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/nfc/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/a;->a:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    .line 10
    :goto_0
    const-string v0, "android.nfc.action.ADAPTER_STATE_CHANGED"

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_5

    .line 17
    .line 18
    const-string p1, "android.nfc.extra.ADAPTER_STATE"

    .line 19
    const/4 v0, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 23
    move-result p1

    .line 24
    .line 25
    if-eq p1, v0, :cond_4

    .line 26
    const/4 p2, 0x2

    .line 27
    .line 28
    if-eq p1, p2, :cond_3

    .line 29
    const/4 p2, 0x3

    .line 30
    .line 31
    if-eq p1, p2, :cond_2

    .line 32
    const/4 p2, 0x4

    .line 33
    .line 34
    if-eq p1, p2, :cond_1

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/a;->a:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 38
    .line 39
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->a(Ljava/lang/Boolean;)V

    .line 43
    return-void

    .line 44
    .line 45
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/a;->a:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 46
    .line 47
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->a(Ljava/lang/Boolean;)V

    .line 51
    return-void

    .line 52
    .line 53
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/a;->a:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 54
    .line 55
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->a(Ljava/lang/Boolean;)V

    .line 59
    return-void

    .line 60
    .line 61
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/a;->a:Lcom/sumsub/sns/internal/core/presentation/nfc/b;

    .line 62
    .line 63
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->a(Ljava/lang/Boolean;)V

    .line 67
    :cond_5
    :goto_1
    return-void
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
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
