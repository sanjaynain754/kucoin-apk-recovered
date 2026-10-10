.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;
.super Lcom/sumsub/sns/core/presentation/base/p0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;,
        Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$Companion;,
        Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$SetResult;,
        Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 62\u00020\u0001:\u00046789B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ;\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0014\u00a2\u0006\u0004\u0008$\u0010%J\r\u0010&\u001a\u00020\u001d\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u000f\u0010(\u001a\u00020\'H\u0014\u00a2\u0006\u0004\u0008(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010+R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010,R\u001a\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010/R\u001a\u00102\u001a\u0002018\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\u00a8\u0006:"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;",
        "Lcom/sumsub/sns/core/presentation/base/p0;",
        "Lcom/sumsub/sns/internal/features/domain/e;",
        "countriesUseCase",
        "Lcom/sumsub/sns/internal/features/domain/a0;",
        "setApplicantPhoneUseCase",
        "Lcom/sumsub/sns/internal/features/data/repository/common/a;",
        "commonRepository",
        "Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;",
        "dataRepository",
        "Landroidx/lifecycle/SavedStateHandle;",
        "savedStateHandle",
        "Lcom/sumsub/sns/internal/features/data/repository/extensions/a;",
        "extensionProvider",
        "<init>",
        "(Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/a0;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V",
        "Lcom/sumsub/sns/internal/features/data/model/common/p;",
        "applicant",
        "Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;",
        "strings",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;",
        "input",
        "Lcom/sumsub/sns/internal/features/domain/n;",
        "countryData",
        "",
        "submitInProgress",
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;",
        "buildViewState",
        "(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;Lcom/sumsub/sns/internal/features/domain/n;Z)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;",
        "",
        "loadCountries",
        "()V",
        "Lcom/sumsub/sns/core/presentation/base/O;",
        "data",
        "Lkotlinx/coroutines/flow/e;",
        "Lcom/sumsub/sns/core/presentation/base/W;",
        "buildViewStateFlow",
        "(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;",
        "onSubmit",
        "",
        "getDocumentType",
        "()Ljava/lang/String;",
        "Lcom/sumsub/sns/internal/features/domain/e;",
        "Lcom/sumsub/sns/internal/features/domain/a0;",
        "Lcom/sumsub/sns/internal/features/data/repository/extensions/a;",
        "Lkotlinx/coroutines/flow/n;",
        "_submitInProgress",
        "Lkotlinx/coroutines/flow/n;",
        "_countryData",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;",
        "phoneNumberController",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;",
        "getPhoneNumberController$idensic_mobile_sdk_aar_defaultRelease",
        "()Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;",
        "Companion",
        "SetResult",
        "ButtonState",
        "ViewState",
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
        "SMAP\nEnterPhoneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterPhoneViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel\n+ 2 SNSViewModel.kt\ncom/sumsub/sns/core/presentation/base/SNSViewModel\n*L\n1#1,161:1\n169#2,9:162\n*S KotlinDebug\n*F\n+ 1 EnterPhoneViewModel.kt\ncom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel\n*L\n98#1:162,9\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STR_ACTION_CONTINUE:Ljava/lang/String; = "sns_confirmation_contact_phone_beforeVideoIdent_action_continue"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STR_LOCKED_ACTION_CONTINUE:Ljava/lang/String; = "sns_confirmation_contact_phoneLocked_beforeVideoIdent_action_continue"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STR_LOCKED_SUBTITLE:Ljava/lang/String; = "sns_confirmation_contact_phoneLocked_beforeVideoIdent_subtitle"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STR_LOCKED_TITLE:Ljava/lang/String; = "sns_confirmation_contact_phoneLocked_beforeVideoIdent_title"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STR_SUBTITLE:Ljava/lang/String; = "sns_confirmation_contact_phone_beforeVideoIdent_subtitle"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STR_TITLE:Ljava/lang/String; = "sns_confirmation_contact_phone_beforeVideoIdent_title"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final _countryData:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Lcom/sumsub/sns/internal/features/domain/n;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _submitInProgress:Lkotlinx/coroutines/flow/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final countriesUseCase:Lcom/sumsub/sns/internal/features/domain/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final extensionProvider:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final setApplicantPhoneUseCase:Lcom/sumsub/sns/internal/features/domain/a0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->Companion:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/a0;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V
    .locals 6
    .param p1    # Lcom/sumsub/sns/internal/features/domain/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/sumsub/sns/internal/features/domain/a0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/sumsub/sns/internal/features/data/repository/common/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Landroidx/lifecycle/SavedStateHandle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/sumsub/sns/internal/features/data/repository/extensions/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/presentation/base/P;

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/presentation/base/P;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p3, p4, v0}, Lcom/sumsub/sns/core/presentation/base/p0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/core/presentation/base/P;)V

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->countriesUseCase:Lcom/sumsub/sns/internal/features/domain/e;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->setApplicantPhoneUseCase:Lcom/sumsub/sns/internal/features/domain/a0;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->extensionProvider:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 16
    .line 17
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->_submitInProgress:Lkotlinx/coroutines/flow/n;

    .line 24
    const/4 p1, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->_countryData:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 33
    .line 34
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    const-string p1, "VIDEO_IDENT"

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    new-instance v5, Lcom/sumsub/sns/internal/features/domain/C;

    .line 46
    .line 47
    .line 48
    invoke-direct {v5}, Lcom/sumsub/sns/internal/features/domain/C;-><init>()V

    .line 49
    .line 50
    const-string v4, "SNSVideoIdent"

    .line 51
    move-object v1, p0

    .line 52
    move-object v2, p5

    .line 53
    .line 54
    .line 55
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;-><init>(Lcom/sumsub/sns/core/presentation/base/p0;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/C;)V

    .line 56
    .line 57
    iput-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->loadCountries()V

    .line 61
    return-void
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
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
.end method

.method public static final synthetic access$buildViewState(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;Lcom/sumsub/sns/internal/features/domain/n;Z)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->buildViewState(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;Lcom/sumsub/sns/internal/features/domain/n;Z)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
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
.end method

.method public static final synthetic access$fireEvent(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 4
    return-void
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final synthetic access$getCountriesUseCase$p(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;)Lcom/sumsub/sns/internal/features/domain/e;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->countriesUseCase:Lcom/sumsub/sns/internal/features/domain/e;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic access$getData(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/p0;->getData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static final synthetic access$getSetApplicantPhoneUseCase$p(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;)Lcom/sumsub/sns/internal/features/domain/a0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->setApplicantPhoneUseCase:Lcom/sumsub/sns/internal/features/domain/a0;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic access$get_countryData$p(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;)Lkotlinx/coroutines/flow/n;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->_countryData:Lkotlinx/coroutines/flow/n;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic access$get_submitInProgress$p(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;)Lkotlinx/coroutines/flow/n;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->_submitInProgress:Lkotlinx/coroutines/flow/n;

    .line 3
    return-object p0
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
.end method

.method private final buildViewState(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;Lcom/sumsub/sns/internal/features/domain/n;Z)Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p4, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/domain/n;Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/L;->i:Lkotlinx/coroutines/flow/w;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;

    .line 17
    const/4 p4, 0x0

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/b;->c:Z

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p1, p4

    .line 24
    .line 25
    :goto_0
    if-eqz p1, :cond_1

    .line 26
    .line 27
    .line 28
    const-string/jumbo v0, "sns_confirmation_contact_phoneLocked_beforeVideoIdent_title"

    .line 29
    goto :goto_1

    .line 30
    .line 31
    .line 32
    :cond_1
    const-string/jumbo v0, "sns_confirmation_contact_phone_beforeVideoIdent_title"

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->extensionProvider:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 41
    .line 42
    check-cast v2, Lcom/sumsub/sns/internal/core/domain/d;

    .line 43
    .line 44
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 50
    move-result-object v0

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v0, v1

    .line 53
    .line 54
    :goto_2
    if-eqz p1, :cond_3

    .line 55
    .line 56
    .line 57
    const-string/jumbo v2, "sns_confirmation_contact_phoneLocked_beforeVideoIdent_subtitle"

    .line 58
    goto :goto_3

    .line 59
    .line 60
    .line 61
    :cond_3
    const-string/jumbo v2, "sns_confirmation_contact_phone_beforeVideoIdent_subtitle"

    .line 62
    .line 63
    .line 64
    :goto_3
    invoke-virtual {p2, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->extensionProvider:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 70
    .line 71
    check-cast v1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 72
    .line 73
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 74
    .line 75
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    :cond_4
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;

    .line 82
    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    .line 86
    const-string/jumbo p1, "sns_confirmation_contact_phoneLocked_beforeVideoIdent_action_continue"

    .line 87
    goto :goto_4

    .line 88
    .line 89
    .line 90
    :cond_5
    const-string/jumbo p1, "sns_confirmation_contact_phone_beforeVideoIdent_action_continue"

    .line 91
    .line 92
    .line 93
    :goto_4
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    if-eqz p3, :cond_6

    .line 97
    .line 98
    iget-boolean p2, p3, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;->b:Z

    .line 99
    goto :goto_5

    .line 100
    :cond_6
    move p2, p4

    .line 101
    .line 102
    :goto_5
    if-eqz p2, :cond_7

    .line 103
    .line 104
    if-nez p5, :cond_7

    .line 105
    const/4 p4, 0x1

    .line 106
    .line 107
    .line 108
    :cond_7
    invoke-direct {v2, p1, p4}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;-><init>(Ljava/lang/CharSequence;Z)V

    .line 109
    .line 110
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;

    .line 111
    .line 112
    .line 113
    invoke-direct {p1, v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;)V

    .line 114
    return-object p1
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
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
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
.end method

.method private final loadCountries()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$loadCountries$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$loadCountries$1;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    return-void
.end method


# virtual methods
.method public buildViewStateFlow(Lcom/sumsub/sns/core/presentation/base/O;)Lkotlinx/coroutines/flow/e;
    .locals 7
    .param p1    # Lcom/sumsub/sns/core/presentation/base/O;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sumsub/sns/core/presentation/base/O;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/sumsub/sns/core/presentation/base/W;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/core/presentation/base/O;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;

    .line 7
    const/4 v5, 0x7

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    :cond_0
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/O;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;

    .line 26
    const/4 v5, 0x7

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    .line 32
    .line 33
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ViewState;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$ButtonState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 41
    .line 42
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;->k:Lkotlinx/coroutines/flow/n;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->_countryData:Lkotlinx/coroutines/flow/n;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->_submitInProgress:Lkotlinx/coroutines/flow/n;

    .line 47
    .line 48
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$buildViewStateFlow$1;

    .line 49
    const/4 v5, 0x0

    .line 50
    .line 51
    .line 52
    invoke-direct {v4, p0, v0, p1, v5}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$buildViewStateFlow$1;-><init>(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lkotlin/coroutines/Continuation;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2, v3, v4}, Lkotlinx/coroutines/flow/g;->n(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/e;

    .line 56
    move-result-object p1

    .line 57
    return-object p1
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
.end method

.method public getDocumentType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "VIDEO_IDENT"

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
.end method

.method public final getPhoneNumberController$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

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
.end method

.method public final onSubmit()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;->phoneNumberController:Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/c;->k:Lkotlinx/coroutines/flow/n;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/phone/a;->a:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x0

    .line 22
    .line 23
    const-string v2, "EnterPhoneViewModel"

    .line 24
    .line 25
    const-string v3, "Phone entered, trying to save it in applicant..."

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1;

    .line 44
    const/4 v1, 0x0

    .line 45
    .line 46
    .line 47
    invoke-direct {v5, p0, v1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel$onSubmit$$inlined$launchWithProgress$1;-><init>(Lcom/sumsub/sns/core/presentation/base/p0;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;Ljava/lang/String;)V

    .line 48
    const/4 v6, 0x2

    .line 49
    const/4 v7, 0x0

    .line 50
    .line 51
    .line 52
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 53
    :cond_1
    :goto_0
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method
