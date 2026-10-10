.class public final Lcom/sumsub/sns/internal/features/presentation/camera/o;
.super Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/p;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/p;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/o;->a:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;-><init>()V

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
.method public final onSlide(Landroid/view/View;F)V
    .locals 4

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/o;->a:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 3
    .line 4
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 5
    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->k:[Lkotlin/reflect/KProperty;

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    aget-object v3, v1, v2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    cmpl-float v0, p2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    const/4 v0, 0x0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_0
    const/16 v0, 0x8

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/o;->a:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 32
    .line 33
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 34
    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    check-cast p1, Landroid/view/View;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    .line 46
    const v0, 0x3f333333    # 0.7f

    .line 47
    mul-float/2addr p2, v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 51
    :cond_2
    return-void
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

.method public final onStateChanged(Landroid/view/View;I)V
    .locals 2

    .line 1
    const/4 p1, 0x3

    .line 2
    .line 3
    if-eq p2, p1, :cond_1

    .line 4
    const/4 p1, 0x4

    .line 5
    .line 6
    if-eq p2, p1, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/o;->a:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Popup;->BottomSheet:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 18
    .line 19
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 20
    .line 21
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->c:Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1, p2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 27
    return-void

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/o;->a:Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Popup;->BottomSheet:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 38
    .line 39
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 40
    .line 41
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/analytics/f;->c:Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, p1, p2}, Lcom/sumsub/sns/internal/core/analytics/f;->b(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 47
    .line 48
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    sget-object p2, Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;->INSTANCE:Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p2}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 60
    :cond_2
    :goto_0
    return-void
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
