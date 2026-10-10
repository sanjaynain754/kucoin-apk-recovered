.class public final Lcom/facebook/react/uimanager/Spacing;
.super Ljava/lang/Object;
.source "Spacing.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/Spacing$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0008B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\tB\u0011\u0008\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0086\u0002J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/Spacing;",
        "",
        "defaultValue",
        "",
        "spacing",
        "",
        "<init>",
        "(F[F)V",
        "()V",
        "(F)V",
        "original",
        "(Lcom/facebook/react/uimanager/Spacing;)V",
        "valueFlags",
        "",
        "hasAliasesSet",
        "",
        "set",
        "spacingType",
        "value",
        "get",
        "getRaw",
        "reset",
        "",
        "getWithFallback",
        "fallbackType",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ALL:I = 0x8

.field public static final BLOCK:I = 0x9

.field public static final BLOCK_END:I = 0xa

.field public static final BLOCK_START:I = 0xb

.field public static final BOTTOM:I = 0x3

.field public static final Companion:Lcom/facebook/react/uimanager/Spacing$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final END:I = 0x5

.field public static final HORIZONTAL:I = 0x6

.field public static final LEFT:I = 0x0

.field public static final RIGHT:I = 0x2

.field public static final START:I = 0x4

.field public static final TOP:I = 0x1

.field public static final VERTICAL:I = 0x7

.field private static final flagsMap:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final defaultValue:F

.field private hasAliasesSet:Z

.field private final spacing:[F
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private valueFlags:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/Spacing$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/Spacing$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/uimanager/Spacing;->Companion:Lcom/facebook/react/uimanager/Spacing$Companion;

    .line 9
    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    new-array v0, v0, [I

    .line 13
    .line 14
    .line 15
    fill-array-data v0, :array_0

    .line 16
    .line 17
    sput-object v0, Lcom/facebook/react/uimanager/Spacing;->flagsMap:[I

    .line 18
    return-void

    :array_0
    .array-data 4
        0x1
        0x2
        0x4
        0x8
        0x10
        0x20
        0x40
        0x80
        0x100
        0x200
        0x400
        0x800
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/Spacing;->Companion:Lcom/facebook/react/uimanager/Spacing$Companion;

    invoke-static {v0}, Lcom/facebook/react/uimanager/Spacing$Companion;->access$newFullSpacingArray(Lcom/facebook/react/uimanager/Spacing$Companion;)[F

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/facebook/react/uimanager/Spacing;-><init>(F[F)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .line 3
    sget-object v0, Lcom/facebook/react/uimanager/Spacing;->Companion:Lcom/facebook/react/uimanager/Spacing$Companion;

    invoke-static {v0}, Lcom/facebook/react/uimanager/Spacing$Companion;->access$newFullSpacingArray(Lcom/facebook/react/uimanager/Spacing$Companion;)[F

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/Spacing;-><init>(F[F)V

    return-void
.end method

.method public constructor <init>(F[F)V
    .locals 1
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "spacing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/uimanager/Spacing;->defaultValue:F

    iput-object p2, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/Spacing;)V
    .locals 3
    .param p1    # Lcom/facebook/react/uimanager/Spacing;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "original"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget v0, p1, Lcom/facebook/react/uimanager/Spacing;->defaultValue:F

    iget-object v1, p1, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/facebook/react/uimanager/Spacing;-><init>(F[F)V

    .line 5
    iget v0, p1, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 6
    iget-boolean p1, p1, Lcom/facebook/react/uimanager/Spacing;->hasAliasesSet:Z

    iput-boolean p1, p0, Lcom/facebook/react/uimanager/Spacing;->hasAliasesSet:Z

    return-void
.end method


# virtual methods
.method public final get(I)F
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    const/4 v0, 0x5

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    iget v0, p0, Lcom/facebook/react/uimanager/Spacing;->defaultValue:F

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    :pswitch_0
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 15
    .line 16
    :goto_0
    iget v1, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    goto :goto_2

    .line 20
    .line 21
    :cond_1
    sget-object v2, Lcom/facebook/react/uimanager/Spacing;->flagsMap:[I

    .line 22
    .line 23
    aget v3, v2, p1

    .line 24
    and-int/2addr v3, v1

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 29
    .line 30
    aget p1, v0, p1

    .line 31
    return p1

    .line 32
    .line 33
    :cond_2
    iget-boolean v3, p0, Lcom/facebook/react/uimanager/Spacing;->hasAliasesSet:Z

    .line 34
    .line 35
    if-eqz v3, :cond_5

    .line 36
    const/4 v3, 0x1

    .line 37
    .line 38
    if-eq p1, v3, :cond_3

    .line 39
    const/4 v3, 0x3

    .line 40
    .line 41
    if-eq p1, v3, :cond_3

    .line 42
    const/4 p1, 0x6

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const/4 p1, 0x7

    .line 45
    .line 46
    :goto_1
    aget v3, v2, p1

    .line 47
    and-int/2addr v3, v1

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 52
    .line 53
    aget p1, v0, p1

    .line 54
    return p1

    .line 55
    .line 56
    :cond_4
    const/16 p1, 0x8

    .line 57
    .line 58
    aget v2, v2, p1

    .line 59
    and-int/2addr v1, v2

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 64
    .line 65
    aget p1, v0, p1

    .line 66
    return p1

    .line 67
    :cond_5
    :goto_2
    return v0

    .line 68
    nop

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
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final getRaw(I)F
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 3
    .line 4
    aget p1, v0, p1

    .line 5
    return p1
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
.end method

.method public final getWithFallback(II)F
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/react/uimanager/Spacing;->flagsMap:[I

    .line 5
    .line 6
    aget v1, v1, p1

    .line 7
    and-int/2addr v0, v1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 12
    .line 13
    aget p1, p2, p1

    .line 14
    return p1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 18
    move-result p1

    .line 19
    return p1
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
.end method

.method public final reset()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 3
    const/4 v4, 0x6

    .line 4
    const/4 v5, 0x0

    .line 5
    .line 6
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lkotlin/collections/ArraysKt;->fill$default([FFIIILjava/lang/Object;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/Spacing;->hasAliasesSet:Z

    .line 15
    .line 16
    iput v0, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 17
    return-void
    .line 18
.end method

.method public final set(IF)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 3
    .line 4
    aget v0, v0, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/uimanager/Spacing;->spacing:[F

    .line 14
    .line 15
    aput p2, v0, p1

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, Ld7/f;->a(F)Z

    .line 19
    move-result p2

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    iget p2, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 24
    .line 25
    sget-object v0, Lcom/facebook/react/uimanager/Spacing;->flagsMap:[I

    .line 26
    .line 27
    aget p1, v0, p1

    .line 28
    not-int p1, p1

    .line 29
    and-int/2addr p1, p2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    iget p2, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 33
    .line 34
    sget-object v0, Lcom/facebook/react/uimanager/Spacing;->flagsMap:[I

    .line 35
    .line 36
    aget p1, v0, p1

    .line 37
    or-int/2addr p1, p2

    .line 38
    .line 39
    :goto_0
    iput p1, p0, Lcom/facebook/react/uimanager/Spacing;->valueFlags:I

    .line 40
    .line 41
    sget-object p2, Lcom/facebook/react/uimanager/Spacing;->flagsMap:[I

    .line 42
    .line 43
    const/16 v0, 0x8

    .line 44
    .line 45
    aget v0, p2, v0

    .line 46
    and-int/2addr v0, p1

    .line 47
    const/4 v2, 0x1

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    const/4 v0, 0x7

    .line 51
    .line 52
    aget v0, p2, v0

    .line 53
    and-int/2addr v0, p1

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    const/4 v0, 0x6

    .line 57
    .line 58
    aget v0, p2, v0

    .line 59
    and-int/2addr v0, p1

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    const/16 v0, 0x9

    .line 64
    .line 65
    aget p2, p2, v0

    .line 66
    and-int/2addr p1, p2

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    :cond_1
    move v1, v2

    .line 70
    .line 71
    :cond_2
    iput-boolean v1, p0, Lcom/facebook/react/uimanager/Spacing;->hasAliasesSet:Z

    .line 72
    return v2

    .line 73
    :cond_3
    return v1
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
.end method
