.class public final Lcom/kubi/futures/settings/CrossLeverageSettingDialog$c;
.super Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$d;
.source "CrossLeverageSettingDialog.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/settings/CrossLeverageSettingDialog;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\u0008\u001a\u00020\u00032\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/kubi/futures/settings/CrossLeverageSettingDialog$initView$8",
        "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;",
        "onChanged",
        "",
        "progress",
        "",
        "progressFloat",
        "",
        "getProgressOnActionUp",
        "bubbleSeekBar",
        "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;",
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
.field public final synthetic a:Lcom/kubi/futures/settings/CrossLeverageSettingDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/futures/settings/CrossLeverageSettingDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/futures/settings/CrossLeverageSettingDialog$c;->a:Lcom/kubi/futures/settings/CrossLeverageSettingDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$d;-><init>()V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public b(Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;IF)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$d;->b(Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;IF)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/kubi/futures/settings/CrossLeverageSettingDialog$c;->a:Lcom/kubi/futures/settings/CrossLeverageSettingDialog;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/kubi/futures/settings/CrossLeverageSettingDialog;->J4(Lcom/kubi/futures/settings/CrossLeverageSettingDialog;)Lcom/kubi/futures/settings/vm/CrossLeverageSettingViewModel;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/futures/settings/vm/CrossLeverageSettingViewModel;->E()Ljava/math/BigDecimal;

    .line 13
    move-result-object p1

    .line 14
    int-to-long p2, p2

    .line 15
    .line 16
    .line 17
    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    const-string v1, "valueOf(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 27
    move-result p1

    .line 28
    .line 29
    if-lez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/kubi/futures/settings/CrossLeverageSettingDialog$c;->a:Lcom/kubi/futures/settings/CrossLeverageSettingDialog;

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    .line 38
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p2}, Lcom/kubi/futures/settings/CrossLeverageSettingDialog;->K4(Lcom/kubi/futures/settings/CrossLeverageSettingDialog;Ljava/math/BigDecimal;)V

    .line 42
    .line 43
    :cond_0
    iget-object p1, p0, Lcom/kubi/futures/settings/CrossLeverageSettingDialog$c;->a:Lcom/kubi/futures/settings/CrossLeverageSettingDialog;

    .line 44
    .line 45
    const-string p2, "4"

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Lcom/kubi/futures/settings/CrossLeverageSettingDialog;->L4(Lcom/kubi/futures/settings/CrossLeverageSettingDialog;Ljava/lang/String;)V

    .line 49
    return-void
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
.end method

.method public c(IF)V
    .locals 2

    .line 1
    .line 2
    iget-object p2, p0, Lcom/kubi/futures/settings/CrossLeverageSettingDialog$c;->a:Lcom/kubi/futures/settings/CrossLeverageSettingDialog;

    .line 3
    int-to-long v0, p1

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    const-string v0, "valueOf(...)"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p2, p1}, Lcom/kubi/futures/settings/CrossLeverageSettingDialog;->K4(Lcom/kubi/futures/settings/CrossLeverageSettingDialog;Ljava/math/BigDecimal;)V

    .line 16
    return-void
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
