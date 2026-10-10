.class public final Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;
.super Landroidx/autofill/inline/common/SlicedContent;
.source "InlineSuggestionUi.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/autofill/inline/v1/InlineSuggestionUi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Content"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/autofill/inline/v1/InlineSuggestionUi$Content$Builder;
    }
.end annotation


# static fields
.field static final HINT_INLINE_ATTRIBUTION_INTENT:Ljava/lang/String; = "inline_attribution"

.field static final HINT_INLINE_CONTENT_DESCRIPTION:Ljava/lang/String; = "inline_content_description"

.field static final HINT_INLINE_END_ICON:Ljava/lang/String; = "inline_end_icon"

.field static final HINT_INLINE_START_ICON:Ljava/lang/String; = "inline_start_icon"

.field static final HINT_INLINE_SUBTITLE:Ljava/lang/String; = "inline_subtitle"

.field static final HINT_INLINE_TITLE:Ljava/lang/String; = "inline_title"


# instance fields
.field private mAttributionIntent:Landroid/app/PendingIntent;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mContentDescription:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mEndIcon:Landroid/graphics/drawable/Icon;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mStartIcon:Landroid/graphics/drawable/Icon;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mSubtitle:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mTitle:Ljava/lang/CharSequence;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/slice/Slice;)V
    .locals 4
    .param p1    # Landroid/app/slice/Slice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroidx/autofill/inline/common/SlicedContent;-><init>(Landroid/app/slice/Slice;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/autofill/inline/v1/a;->a(Landroid/app/slice/Slice;)Ljava/util/List;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Landroidx/autofill/inline/v1/b;->a(Ljava/lang/Object;)Landroid/app/slice/SliceItem;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->itemType(Landroid/app/slice/SliceItem;)Ljava/lang/String;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, -0x1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 37
    move-result v3

    .line 38
    .line 39
    .line 40
    sparse-switch v3, :sswitch_data_0

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :sswitch_0
    const-string v3, "inline_end_icon"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-nez v1, :cond_1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v2, 0x5

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :sswitch_1
    const-string v3, "inline_attribution"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 v2, 0x4

    .line 63
    goto :goto_1

    .line 64
    .line 65
    :sswitch_2
    const-string v3, "inline_title"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    move-result v1

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const/4 v2, 0x3

    .line 74
    goto :goto_1

    .line 75
    .line 76
    :sswitch_3
    const-string v3, "inline_start_icon"

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    move-result v1

    .line 81
    .line 82
    if-nez v1, :cond_4

    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 v2, 0x2

    .line 85
    goto :goto_1

    .line 86
    .line 87
    :sswitch_4
    const-string v3, "inline_content_description"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result v1

    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    goto :goto_1

    .line 95
    :cond_5
    const/4 v2, 0x1

    .line 96
    goto :goto_1

    .line 97
    .line 98
    :sswitch_5
    const-string v3, "inline_subtitle"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    move-result v1

    .line 103
    .line 104
    if-nez v1, :cond_6

    .line 105
    goto :goto_1

    .line 106
    :cond_6
    const/4 v2, 0x0

    .line 107
    .line 108
    .line 109
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 110
    goto :goto_0

    .line 111
    .line 112
    .line 113
    :pswitch_0
    invoke-static {v0}, Landroidx/autofill/inline/v1/d;->a(Landroid/app/slice/SliceItem;)Landroid/graphics/drawable/Icon;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    iput-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mEndIcon:Landroid/graphics/drawable/Icon;

    .line 117
    goto :goto_0

    .line 118
    .line 119
    .line 120
    :pswitch_1
    invoke-static {v0}, Landroidx/autofill/inline/v1/e;->a(Landroid/app/slice/SliceItem;)Landroid/app/PendingIntent;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    iput-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mAttributionIntent:Landroid/app/PendingIntent;

    .line 124
    goto :goto_0

    .line 125
    .line 126
    .line 127
    :pswitch_2
    invoke-static {v0}, Landroidx/autofill/inline/v1/c;->a(Landroid/app/slice/SliceItem;)Ljava/lang/CharSequence;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    iput-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mTitle:Ljava/lang/CharSequence;

    .line 135
    goto :goto_0

    .line 136
    .line 137
    .line 138
    :pswitch_3
    invoke-static {v0}, Landroidx/autofill/inline/v1/d;->a(Landroid/app/slice/SliceItem;)Landroid/graphics/drawable/Icon;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    iput-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mStartIcon:Landroid/graphics/drawable/Icon;

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    .line 146
    :pswitch_4
    invoke-static {v0}, Landroidx/autofill/inline/v1/c;->a(Landroid/app/slice/SliceItem;)Ljava/lang/CharSequence;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    iput-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mContentDescription:Ljava/lang/CharSequence;

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    .line 154
    :pswitch_5
    invoke-static {v0}, Landroidx/autofill/inline/v1/c;->a(Landroid/app/slice/SliceItem;)Ljava/lang/CharSequence;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    iput-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mSubtitle:Ljava/lang/CharSequence;

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    :cond_7
    return-void

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
    :sswitch_data_0
    .sparse-switch
        -0x6abe4902 -> :sswitch_5
        -0x4ba4ed70 -> :sswitch_4
        -0x8a61864 -> :sswitch_3
        0x2b761132 -> :sswitch_2
        0x3ccd73d9 -> :sswitch_1
        0x76e72843 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method

.method private static itemType(Landroid/app/slice/SliceItem;)Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/autofill/inline/v1/f;->a(Landroid/app/slice/SliceItem;)Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, -0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 13
    move-result v3

    .line 14
    .line 15
    .line 16
    sparse-switch v3, :sswitch_data_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :sswitch_0
    const-string v3, "image"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v2, 0x2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :sswitch_1
    const-string/jumbo v3, "text"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result v0

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v2, 0x1

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :sswitch_2
    const-string v3, "action"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    move-result v0

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v2, 0x0

    .line 51
    .line 52
    .line 53
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 54
    return-object v1

    .line 55
    .line 56
    .line 57
    :pswitch_0
    invoke-static {p0}, Landroidx/autofill/inline/v1/d;->a(Landroid/app/slice/SliceItem;)Landroid/graphics/drawable/Icon;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    return-object v1

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-static {p0}, Landroidx/autofill/inline/v1/g;->a(Landroid/app/slice/SliceItem;)Ljava/util/List;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    const-string v2, "inline_start_icon"

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    move-result v0

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    return-object v2

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-static {p0}, Landroidx/autofill/inline/v1/g;->a(Landroid/app/slice/SliceItem;)Ljava/util/List;

    .line 78
    move-result-object p0

    .line 79
    .line 80
    const-string v0, "inline_end_icon"

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 84
    move-result p0

    .line 85
    .line 86
    if-eqz p0, :cond_8

    .line 87
    return-object v0

    .line 88
    .line 89
    .line 90
    :pswitch_1
    invoke-static {p0}, Landroidx/autofill/inline/v1/c;->a(Landroid/app/slice/SliceItem;)Ljava/lang/CharSequence;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 95
    move-result v0

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    return-object v1

    .line 99
    .line 100
    .line 101
    :cond_5
    invoke-static {p0}, Landroidx/autofill/inline/v1/g;->a(Landroid/app/slice/SliceItem;)Ljava/util/List;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    const-string v2, "inline_title"

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 108
    move-result v0

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    return-object v2

    .line 112
    .line 113
    .line 114
    :cond_6
    invoke-static {p0}, Landroidx/autofill/inline/v1/g;->a(Landroid/app/slice/SliceItem;)Ljava/util/List;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    const-string v2, "inline_subtitle"

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 121
    move-result v0

    .line 122
    .line 123
    if-eqz v0, :cond_7

    .line 124
    return-object v2

    .line 125
    .line 126
    .line 127
    :cond_7
    invoke-static {p0}, Landroidx/autofill/inline/v1/g;->a(Landroid/app/slice/SliceItem;)Ljava/util/List;

    .line 128
    move-result-object p0

    .line 129
    .line 130
    const-string v0, "inline_content_description"

    .line 131
    .line 132
    .line 133
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 134
    move-result p0

    .line 135
    .line 136
    if-eqz p0, :cond_8

    .line 137
    return-object v0

    .line 138
    .line 139
    .line 140
    :pswitch_2
    invoke-static {p0}, Landroidx/autofill/inline/v1/e;->a(Landroid/app/slice/SliceItem;)Landroid/app/PendingIntent;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    .line 146
    invoke-static {p0}, Landroidx/autofill/inline/v1/g;->a(Landroid/app/slice/SliceItem;)Ljava/util/List;

    .line 147
    move-result-object p0

    .line 148
    .line 149
    const-string v0, "inline_attribution"

    .line 150
    .line 151
    .line 152
    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 153
    move-result p0

    .line 154
    .line 155
    if-eqz p0, :cond_8

    .line 156
    return-object v0

    .line 157
    :cond_8
    return-object v1

    .line 158
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x54d081ca -> :sswitch_2
        0x36452d -> :sswitch_1
        0x5faa95b -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method


# virtual methods
.method public getAttributionIntent()Landroid/app/PendingIntent;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mAttributionIntent:Landroid/app/PendingIntent;

    .line 3
    return-object v0
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
.end method

.method public getContentDescription()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mContentDescription:Ljava/lang/CharSequence;

    .line 3
    return-object v0
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
.end method

.method public getEndIcon()Landroid/graphics/drawable/Icon;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mEndIcon:Landroid/graphics/drawable/Icon;

    .line 3
    return-object v0
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
.end method

.method public getStartIcon()Landroid/graphics/drawable/Icon;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mStartIcon:Landroid/graphics/drawable/Icon;

    .line 3
    return-object v0
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
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mSubtitle:Ljava/lang/CharSequence;

    .line 3
    return-object v0
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
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mTitle:Ljava/lang/CharSequence;

    .line 3
    return-object v0
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
.end method

.method public isSingleIconOnly()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mStartIcon:Landroid/graphics/drawable/Icon;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mTitle:Ljava/lang/CharSequence;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mSubtitle:Ljava/lang/CharSequence;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/autofill/inline/v1/InlineSuggestionUi$Content;->mEndIcon:Landroid/graphics/drawable/Icon;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public isValid()Z
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/autofill/inline/common/SlicedContent;->mSlice:Landroid/app/slice/Slice;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroidx/autofill/inline/common/SlicedContent;->getVersion(Landroid/app/slice/Slice;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "androidx.autofill.inline.ui.version:v1"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
