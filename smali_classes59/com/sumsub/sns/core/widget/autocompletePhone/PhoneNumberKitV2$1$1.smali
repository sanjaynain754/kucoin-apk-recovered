.class public final Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/country/picker/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;-><init>(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1",
        "Lcom/sumsub/sns/internal/features/presentation/country/picker/e;",
        "Lcom/sumsub/sns/internal/features/presentation/country/b;",
        "item",
        "",
        "onItemSelected",
        "(Lcom/sumsub/sns/internal/features/presentation/country/b;)V",
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


# instance fields
.field final synthetic $masks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;",
            ">;",
            "Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;->$masks:Ljava/util/List;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;->this$0:Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onDismiss()V
    .locals 0

    .line 1
    return-void
    .line 2
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
.end method

.method public onItemSelected(Lcom/sumsub/sns/internal/features/presentation/country/b;)V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;->$masks:Ljava/util/List;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    .line 22
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getPayload()Ljava/lang/Object;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    instance-of v4, v3, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v3, v1

    .line 35
    .line 36
    :goto_0
    if-eqz v3, :cond_2

    .line 37
    .line 38
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v3, v1

    .line 41
    .line 42
    :goto_1
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    move-result v3

    .line 47
    .line 48
    if-eqz v3, :cond_0

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move-object v2, v1

    .line 51
    .line 52
    :goto_2
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move-object v2, v1

    .line 55
    .line 56
    :goto_3
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;->this$0:Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;

    .line 57
    const/4 v3, 0x0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1, v3}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->setCountry(Lcom/sumsub/sns/internal/features/presentation/country/b;Z)V

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getPayload()Ljava/lang/Object;

    .line 66
    move-result-object v0

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move-object v0, v1

    .line 69
    .line 70
    :goto_4
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 71
    .line 72
    if-eqz v2, :cond_6

    .line 73
    .line 74
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 75
    goto :goto_5

    .line 76
    :cond_6
    move-object v0, v1

    .line 77
    .line 78
    :goto_5
    if-eqz v0, :cond_b

    .line 79
    .line 80
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2$1$1;->this$0:Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->access$getPhoneMasks(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Ljava/util/Map;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    if-eqz v4, :cond_7

    .line 87
    .line 88
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;

    .line 95
    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;->a:Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v4, :cond_7

    .line 101
    const/4 v8, 0x4

    .line 102
    const/4 v9, 0x0

    .line 103
    .line 104
    const-string v5, " "

    .line 105
    .line 106
    const-string v6, ""

    .line 107
    const/4 v7, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    .line 114
    :cond_7
    invoke-static {v2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->access$getEditText(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 127
    .line 128
    :cond_8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-static {v2, p1}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->access$setManuallySelectedCountryKey$p(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->access$getEditText(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    if-eqz p1, :cond_9

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    :cond_9
    invoke-static {v2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->access$getEditText(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    if-eqz p1, :cond_b

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;->access$getEditText(Lcom/sumsub/sns/core/widget/autocompletePhone/PhoneNumberKitV2;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    .line 156
    move-result-object v0

    .line 157
    .line 158
    if-eqz v0, :cond_a

    .line 159
    .line 160
    .line 161
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 162
    move-result v3

    .line 163
    .line 164
    .line 165
    :cond_a
    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setSelection(I)V

    .line 166
    :cond_b
    return-void
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
.end method
