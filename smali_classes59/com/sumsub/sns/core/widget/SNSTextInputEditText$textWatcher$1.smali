.class public final Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sumsub/sns/core/widget/SNSTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J*\u0010\n\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0012\u0010\u000c\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "com/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1",
        "Landroid/text/TextWatcher;",
        "beforeTextChanged",
        "",
        "s",
        "",
        "start",
        "",
        "count",
        "after",
        "onTextChanged",
        "before",
        "afterTextChanged",
        "Landroid/text/Editable;",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSTextInputEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTextInputEditText.kt\ncom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n360#2,7:611\n*S KotlinDebug\n*F\n+ 1 SNSTextInputEditText.kt\ncom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1\n*L\n178#1:611,7\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 14

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_19

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$isTextChangingBefore$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_19

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$isTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_c

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 32
    move-result v0

    .line 33
    .line 34
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    const-string v3, "afterTextChanged, original s="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v3, ", selection="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object v3

    .line 60
    const/4 v5, 0x4

    .line 61
    const/4 v6, 0x0

    .line 62
    .line 63
    const-string v2, "SNSInputEditText"

    .line 64
    const/4 v4, 0x0

    .line 65
    .line 66
    .line 67
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 68
    .line 69
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 70
    const/4 v2, 0x1

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$setTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Z)V

    .line 74
    .line 75
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 76
    const/4 v3, 0x0

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v3}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$setTextChangingBefore$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Z)V

    .line 80
    .line 81
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 82
    .line 83
    .line 84
    invoke-static {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$cleanRaw(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)V

    .line 85
    .line 86
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 90
    move-result-object v1

    .line 91
    .line 92
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 93
    .line 94
    .line 95
    invoke-static {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$findNewMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 96
    move-result-object v4

    .line 97
    const/4 v5, 0x2

    .line 98
    .line 99
    if-eqz v4, :cond_1

    .line 100
    .line 101
    iget-object v7, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 102
    .line 103
    .line 104
    invoke-static {v7, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$prepareMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 105
    goto :goto_0

    .line 106
    .line 107
    :cond_1
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 108
    .line 109
    .line 110
    invoke-static {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRemovedSymbolsCount(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)I

    .line 111
    move-result v7

    .line 112
    add-int/2addr v7, v0

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v7, v6, v5, v6}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 116
    move-result v4

    .line 117
    sub-int/2addr v0, v4

    .line 118
    .line 119
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 120
    .line 121
    .line 122
    invoke-static {v4, v6}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$prepareMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 123
    .line 124
    :goto_0
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 125
    .line 126
    .line 127
    invoke-static {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRemovedSymbolsCount(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)I

    .line 128
    move-result v4

    .line 129
    .line 130
    iget-object v7, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 131
    .line 132
    .line 133
    invoke-static {v7}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMaskSymbolPositions$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/util/HashMap;

    .line 134
    move-result-object v7

    .line 135
    .line 136
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 137
    .line 138
    .line 139
    invoke-static {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 140
    move-result-object v8

    .line 141
    .line 142
    if-eqz v8, :cond_2

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 146
    move-result-object v8

    .line 147
    goto :goto_1

    .line 148
    :cond_2
    move-object v8, v6

    .line 149
    .line 150
    .line 151
    :goto_1
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-result-object v7

    .line 153
    .line 154
    check-cast v7, Ljava/util/List;

    .line 155
    .line 156
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 157
    .line 158
    .line 159
    invoke-static {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 160
    move-result-object v8

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    move-result v8

    .line 165
    .line 166
    if-nez v8, :cond_4

    .line 167
    .line 168
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 169
    .line 170
    .line 171
    invoke-static {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 172
    move-result-object v8

    .line 173
    .line 174
    if-nez v8, :cond_4

    .line 175
    .line 176
    if-eqz p1, :cond_3

    .line 177
    .line 178
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 179
    .line 180
    .line 181
    invoke-static {v1, p1, v3, v2, v6}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->removeHintSpans$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;ZILjava/lang/Object;)V

    .line 182
    .line 183
    :cond_3
    if-eqz p1, :cond_16

    .line 184
    .line 185
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 186
    .line 187
    .line 188
    invoke-static {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    .line 192
    invoke-interface {p1, v1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 193
    .line 194
    goto/16 :goto_b

    .line 195
    .line 196
    :cond_4
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 197
    .line 198
    .line 199
    invoke-static {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 200
    move-result-object v8

    .line 201
    .line 202
    .line 203
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    move-result v8

    .line 205
    .line 206
    if-nez v8, :cond_13

    .line 207
    .line 208
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 209
    .line 210
    .line 211
    invoke-static {v8, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$applyMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;)V

    .line 212
    .line 213
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 214
    .line 215
    .line 216
    invoke-static {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMaskSymbolPositions$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/util/HashMap;

    .line 217
    move-result-object v8

    .line 218
    .line 219
    if-eqz v1, :cond_5

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 223
    move-result-object v9

    .line 224
    goto :goto_2

    .line 225
    :cond_5
    move-object v9, v6

    .line 226
    .line 227
    .line 228
    :goto_2
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    move-result-object v8

    .line 230
    .line 231
    check-cast v8, Ljava/util/List;

    .line 232
    .line 233
    if-eqz v8, :cond_8

    .line 234
    .line 235
    if-lez v4, :cond_6

    .line 236
    move v9, v4

    .line 237
    goto :goto_3

    .line 238
    :cond_6
    move v9, v3

    .line 239
    :goto_3
    add-int/2addr v9, v0

    .line 240
    .line 241
    .line 242
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 243
    move-result v10

    .line 244
    move v12, v0

    .line 245
    move v11, v3

    .line 246
    .line 247
    :goto_4
    if-ge v11, v10, :cond_9

    .line 248
    .line 249
    if-eq v11, v9, :cond_9

    .line 250
    .line 251
    .line 252
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 253
    move-result-object v13

    .line 254
    .line 255
    check-cast v13, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v13}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 259
    move-result v13

    .line 260
    .line 261
    if-gez v13, :cond_7

    .line 262
    .line 263
    add-int/lit8 v12, v12, -0x1

    .line 264
    .line 265
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 266
    goto :goto_4

    .line 267
    :cond_8
    move v12, v0

    .line 268
    .line 269
    :cond_9
    if-eqz v7, :cond_12

    .line 270
    .line 271
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 272
    .line 273
    .line 274
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 275
    move-result-object v9

    .line 276
    move v10, v3

    .line 277
    .line 278
    .line 279
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    move-result v11

    .line 281
    const/4 v13, -0x1

    .line 282
    .line 283
    if-eqz v11, :cond_b

    .line 284
    .line 285
    .line 286
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    move-result-object v11

    .line 288
    .line 289
    check-cast v11, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v11}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 293
    move-result v11

    .line 294
    .line 295
    if-ne v11, v12, :cond_a

    .line 296
    goto :goto_6

    .line 297
    .line 298
    :cond_a
    add-int/lit8 v10, v10, 0x1

    .line 299
    goto :goto_5

    .line 300
    :cond_b
    move v10, v13

    .line 301
    .line 302
    :goto_6
    if-gtz v4, :cond_c

    .line 303
    .line 304
    if-nez v1, :cond_11

    .line 305
    .line 306
    .line 307
    :cond_c
    invoke-static {v3, v10}, Ljava/lang/Math;->max(II)I

    .line 308
    move-result v1

    .line 309
    sub-int/2addr v1, v4

    .line 310
    .line 311
    if-eqz v10, :cond_11

    .line 312
    .line 313
    if-ltz v1, :cond_10

    .line 314
    .line 315
    .line 316
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 317
    move-result v4

    .line 318
    .line 319
    if-lt v1, v4, :cond_d

    .line 320
    goto :goto_9

    .line 321
    .line 322
    .line 323
    :cond_d
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 324
    move-result-object v0

    .line 325
    .line 326
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 330
    move-result v0

    .line 331
    .line 332
    if-gez v0, :cond_f

    .line 333
    .line 334
    :goto_7
    if-ge v13, v1, :cond_11

    .line 335
    .line 336
    .line 337
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 338
    move-result-object v0

    .line 339
    .line 340
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 344
    move-result v0

    .line 345
    .line 346
    if-lez v0, :cond_e

    .line 347
    add-int/2addr v1, v2

    .line 348
    :goto_8
    move v0, v1

    .line 349
    goto :goto_b

    .line 350
    .line 351
    :cond_e
    add-int/lit8 v1, v1, -0x1

    .line 352
    goto :goto_7

    .line 353
    .line 354
    :cond_f
    if-gez v10, :cond_11

    .line 355
    .line 356
    .line 357
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 358
    move-result v0

    .line 359
    goto :goto_b

    .line 360
    .line 361
    .line 362
    :cond_10
    :goto_9
    invoke-static {v8, v0, v6, v5, v6}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 363
    move-result v1

    .line 364
    add-int/2addr v1, v0

    .line 365
    goto :goto_8

    .line 366
    :cond_11
    move v0, v10

    .line 367
    goto :goto_b

    .line 368
    :cond_12
    move v0, v12

    .line 369
    goto :goto_b

    .line 370
    .line 371
    :cond_13
    if-lez v4, :cond_15

    .line 372
    .line 373
    if-eqz v7, :cond_15

    .line 374
    .line 375
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 376
    .line 377
    .line 378
    invoke-static {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getStartingPosition(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)I

    .line 379
    move-result v1

    .line 380
    .line 381
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 382
    .line 383
    .line 384
    invoke-static {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 385
    move-result-object v4

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 389
    move-result v4

    .line 390
    .line 391
    iget-object v8, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 392
    .line 393
    .line 394
    invoke-static {v8, v0, v6, v5, v6}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 395
    move-result v5

    .line 396
    add-int/2addr v5, v4

    .line 397
    .line 398
    if-lt v5, v0, :cond_14

    .line 399
    move v2, v3

    .line 400
    .line 401
    :cond_14
    :goto_a
    if-le v0, v1, :cond_15

    .line 402
    .line 403
    add-int/lit8 v4, v0, 0x1

    .line 404
    .line 405
    .line 406
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 407
    move-result v5

    .line 408
    .line 409
    if-ge v4, v5, :cond_15

    .line 410
    .line 411
    add-int v4, v0, v2

    .line 412
    .line 413
    .line 414
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 415
    move-result-object v4

    .line 416
    .line 417
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 421
    move-result v4

    .line 422
    .line 423
    if-gez v4, :cond_15

    .line 424
    .line 425
    add-int/lit8 v0, v0, -0x1

    .line 426
    goto :goto_a

    .line 427
    .line 428
    :cond_15
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 429
    .line 430
    .line 431
    invoke-static {v1, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$applyMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;)V

    .line 432
    .line 433
    :cond_16
    :goto_b
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 434
    .line 435
    new-instance v1, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    .line 440
    const-string v2, "afterTextChanged, new s="

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    move-result-object v6

    .line 451
    const/4 v8, 0x4

    .line 452
    const/4 v9, 0x0

    .line 453
    .line 454
    const-string v5, "SNSInputEditText"

    .line 455
    const/4 v7, 0x0

    .line 456
    .line 457
    .line 458
    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 459
    .line 460
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 461
    .line 462
    .line 463
    invoke-static {p1, v3}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$setTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Z)V

    .line 464
    .line 465
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 466
    .line 467
    .line 468
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 469
    move-result p1

    .line 470
    .line 471
    if-le v0, p1, :cond_17

    .line 472
    .line 473
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 474
    .line 475
    .line 476
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 477
    move-result v0

    .line 478
    .line 479
    :cond_17
    if-gez v0, :cond_18

    .line 480
    .line 481
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 485
    move-result v0

    .line 486
    .line 487
    :cond_18
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 488
    .line 489
    .line 490
    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 491
    .line 492
    .line 493
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 494
    move-result-wide v0

    .line 495
    .line 496
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 497
    .line 498
    .line 499
    invoke-static {p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getBenchmark$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)J

    .line 500
    move-result-wide v2

    .line 501
    sub-long/2addr v0, v2

    .line 502
    .line 503
    new-instance p1, Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 507
    .line 508
    const-string v2, "Text changed in "

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    const-string/jumbo v0, "ms"

    .line 518
    .line 519
    .line 520
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    move-result-object v6

    .line 525
    const/4 v8, 0x4

    .line 526
    const/4 v9, 0x0

    .line 527
    .line 528
    const-string v5, "SNSInputEditText"

    .line 529
    const/4 v7, 0x0

    .line 530
    .line 531
    .line 532
    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 533
    :cond_19
    :goto_c
    return-void
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$isTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    move-result-wide v1

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$setBenchmark$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;J)V

    .line 27
    .line 28
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    const-string v1, "beforeTextChanged, start="

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string p2, ", count="

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string p2, ", after="

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string p2, ", s="

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v5

    .line 70
    const/4 v7, 0x4

    .line 71
    const/4 v8, 0x0

    .line 72
    .line 73
    const-string v4, "SNSInputEditText"

    .line 74
    const/4 v6, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v3 .. v8}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 78
    .line 79
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 80
    const/4 p2, 0x1

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$setTextChangingBefore$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Z)V

    .line 84
    :cond_1
    :goto_0
    return-void
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_7

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$isTextChangingBefore$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$isTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string/jumbo v7, "onTextChanged, start="

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, ", before="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v2, ", count="

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, ", s="

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    const/4 v5, 0x4

    .line 72
    const/4 v6, 0x0

    .line 73
    .line 74
    const-string v2, "SNSInputEditText"

    .line 75
    const/4 v4, 0x0

    .line 76
    .line 77
    .line 78
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 79
    .line 80
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$setLastRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Ljava/lang/String;)V

    .line 100
    .line 101
    if-lez p4, :cond_4

    .line 102
    .line 103
    if-eqz p1, :cond_7

    .line 104
    .line 105
    add-int p3, p2, p4

    .line 106
    .line 107
    .line 108
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    if-nez p1, :cond_1

    .line 112
    .line 113
    goto/16 :goto_1

    .line 114
    .line 115
    :cond_1
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 116
    const/4 v0, 0x2

    .line 117
    const/4 v2, 0x0

    .line 118
    .line 119
    .line 120
    invoke-static {p3, p2, v2, v0, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMaskSymbolsCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 121
    move-result p3

    .line 122
    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string p2, ", rawStart="

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string p2, ", addedText="

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    move-result-object v3

    .line 153
    const/4 v5, 0x4

    .line 154
    const/4 v6, 0x0

    .line 155
    .line 156
    const-string v2, "SNSInputEditText"

    .line 157
    const/4 v4, 0x0

    .line 158
    .line 159
    .line 160
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 161
    .line 162
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 163
    .line 164
    .line 165
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 166
    move-result-object p2

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 170
    move-result p2

    .line 171
    .line 172
    if-le p3, p2, :cond_2

    .line 173
    .line 174
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 175
    .line 176
    .line 177
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 178
    move-result-object p2

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 182
    goto :goto_0

    .line 183
    .line 184
    :cond_2
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 185
    .line 186
    .line 187
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 188
    move-result-object p2

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 192
    move-result p2

    .line 193
    add-int/2addr p4, p3

    .line 194
    .line 195
    if-lt p2, p4, :cond_3

    .line 196
    .line 197
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 198
    .line 199
    .line 200
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 201
    move-result-object p2

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, p3, p1}, Ljava/lang/StringBuilder;->insert(ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 205
    goto :goto_0

    .line 206
    .line 207
    :cond_3
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 208
    .line 209
    .line 210
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 211
    move-result-object p2

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, p3, p4, p1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    goto :goto_0

    .line 220
    .line 221
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getStartingPosition(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)I

    .line 225
    move-result p1

    .line 226
    .line 227
    if-lt p2, p1, :cond_5

    .line 228
    .line 229
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 230
    .line 231
    .line 232
    invoke-static {p1, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$prevValidCharPosition(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;I)I

    .line 233
    move-result p1

    .line 234
    add-int/2addr p3, p1

    .line 235
    .line 236
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 237
    .line 238
    .line 239
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 240
    move-result-object p2

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 244
    move-result p2

    .line 245
    .line 246
    .line 247
    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    .line 248
    move-result p2

    .line 249
    .line 250
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 251
    .line 252
    .line 253
    invoke-static {p3}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 254
    move-result-object p3

    .line 255
    .line 256
    .line 257
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 260
    goto :goto_0

    .line 261
    .line 262
    :cond_6
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 263
    .line 264
    .line 265
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 266
    move-result-object p2

    .line 267
    .line 268
    .line 269
    invoke-static {p2}, Lkotlin/text/StringsKt;->clear(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 272
    .line 273
    .line 274
    invoke-static {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 275
    move-result-object p2

    .line 276
    .line 277
    .line 278
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;->this$0:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 281
    .line 282
    .line 283
    invoke-static {p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;

    .line 284
    move-result-object p1

    .line 285
    .line 286
    new-instance p2, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string/jumbo p3, "onTextChanged, RawText = "

    .line 293
    .line 294
    .line 295
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    move-result-object v3

    .line 303
    const/4 v5, 0x4

    .line 304
    const/4 v6, 0x0

    .line 305
    .line 306
    const-string v2, "SNSInputEditText"

    .line 307
    const/4 v4, 0x0

    .line 308
    .line 309
    .line 310
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->v$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 311
    :cond_7
    :goto_1
    return-void
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
.end method
