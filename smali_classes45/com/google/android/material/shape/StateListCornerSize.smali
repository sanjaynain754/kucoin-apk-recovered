.class public Lcom/google/android/material/shape/StateListCornerSize;
.super Ljava/lang/Object;
.source "StateListCornerSize.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field private static final INITIAL_CAPACITY:I = 0xa


# instance fields
.field cornerSizes:[Lcom/google/android/material/shape/CornerSize;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private defaultCornerSize:Lcom/google/android/material/shape/CornerSize;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field stateCount:I

.field stateSpecs:[[I
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v1, v0, [[I

    .line 8
    .line 9
    iput-object v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 10
    .line 11
    new-array v0, v0, [Lcom/google/android/material/shape/CornerSize;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method private addStateCornerSize([ILcom/google/android/material/shape/CornerSize;)V
    .locals 2
    .param p1    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/material/shape/CornerSize;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    array-length v1, p1

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    :cond_0
    iput-object p2, p0, Lcom/google/android/material/shape/StateListCornerSize;->defaultCornerSize:Lcom/google/android/material/shape/CornerSize;

    .line 10
    .line 11
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 12
    array-length v1, v1

    .line 13
    .line 14
    if-lt v0, v1, :cond_2

    .line 15
    .line 16
    add-int/lit8 v1, v0, 0xa

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Lcom/google/android/material/shape/StateListCornerSize;->growArray(II)V

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 22
    .line 23
    iget v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 24
    .line 25
    aput-object p1, v0, v1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 28
    .line 29
    aput-object p2, p1, v1

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    iput v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 34
    return-void
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

.method public static create(Landroid/content/Context;Landroid/content/res/TypedArray;ILcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/StateListCornerSize;
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/TypedArray;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/StyleableRes;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/material/shape/CornerSize;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p1, p2, p3}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getCornerSize(Landroid/content/res/TypedArray;ILcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/material/shape/StateListCornerSize;->create(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/StateListCornerSize;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    const-string/jumbo v2, "xml"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    invoke-static {p1, p2, p3}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getCornerSize(Landroid/content/res/TypedArray;ILcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/material/shape/StateListCornerSize;->create(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/StateListCornerSize;

    move-result-object p0

    return-object p0

    .line 6
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :try_start_1
    new-instance p2, Lcom/google/android/material/shape/StateListCornerSize;

    invoke-direct {p2}, Lcom/google/android/material/shape/StateListCornerSize;-><init>()V

    .line 8
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    goto :goto_0

    :cond_2
    if-ne v1, v2, :cond_4

    .line 10
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    .line 11
    const-string/jumbo v2, "selector"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-direct {p2, p0, p1, v0, v1}, Lcom/google/android/material/shape/StateListCornerSize;->loadCornerSizesFromItems(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 13
    :cond_3
    :goto_1
    :try_start_2
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p2

    .line 14
    :cond_4
    :try_start_3
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p2, "No start tag found"

    invoke-direct {p0, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    if-eqz p1, :cond_5

    .line 15
    :try_start_4
    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw p0
    :try_end_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_5 .. :try_end_5} :catch_0

    .line 16
    :catch_0
    invoke-static {p3}, Lcom/google/android/material/shape/StateListCornerSize;->create(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/StateListCornerSize;

    move-result-object p0

    return-object p0
.end method

.method public static create(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/StateListCornerSize;
    .locals 2
    .param p0    # Lcom/google/android/material/shape/CornerSize;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 17
    new-instance v0, Lcom/google/android/material/shape/StateListCornerSize;

    invoke-direct {v0}, Lcom/google/android/material/shape/StateListCornerSize;-><init>()V

    .line 18
    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-direct {v0, v1, p0}, Lcom/google/android/material/shape/StateListCornerSize;->addStateCornerSize([ILcom/google/android/material/shape/CornerSize;)V

    return-object v0
.end method

.method private growArray(II)V
    .locals 3

    .line 1
    .line 2
    new-array v0, p2, [[I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 11
    .line 12
    new-array p2, p2, [Lcom/google/android/material/shape/CornerSize;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v2, p2, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    iput-object p2, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 20
    return-void
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

.method private indexOfStateSet([I)I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    :goto_0
    iget v2, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    aget-object v2, v0, v1

    .line 10
    .line 11
    .line 12
    invoke-static {v2, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    return v1

    .line 17
    .line 18
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p1, -0x1

    .line 21
    return p1
    .line 22
    .line 23
.end method

.method private loadCornerSizesFromItems(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 11
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lorg/xmlpull/v1/XmlPullParser;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/content/res/Resources$Theme;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    add-int/2addr v0, v1

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-eq v2, v1, :cond_7

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 16
    move-result v3

    .line 17
    .line 18
    if-ge v3, v0, :cond_1

    .line 19
    const/4 v4, 0x3

    .line 20
    .line 21
    if-eq v2, v4, :cond_7

    .line 22
    :cond_1
    const/4 v4, 0x2

    .line 23
    .line 24
    if-ne v2, v4, :cond_0

    .line 25
    .line 26
    if-gt v3, v0, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    const-string v3, "item"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v2

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    if-nez p4, :cond_3

    .line 47
    .line 48
    sget-object v4, Lcom/google/android/material/R$styleable;->ShapeAppearance:[I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p3, v4}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 52
    move-result-object v2

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_3
    sget-object v2, Lcom/google/android/material/R$styleable;->ShapeAppearance:[I

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4, p3, v2, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 59
    move-result-object v2

    .line 60
    .line 61
    :goto_1
    sget v4, Lcom/google/android/material/R$styleable;->ShapeAppearance_cornerSize:I

    .line 62
    .line 63
    new-instance v5, Lcom/google/android/material/shape/AbsoluteCornerSize;

    .line 64
    const/4 v6, 0x0

    .line 65
    .line 66
    .line 67
    invoke-direct {v5, v6}, Lcom/google/android/material/shape/AbsoluteCornerSize;-><init>(F)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v4, v5}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getCornerSize(Landroid/content/res/TypedArray;ILcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;

    .line 71
    move-result-object v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 75
    .line 76
    .line 77
    invoke-interface {p3}, Landroid/util/AttributeSet;->getAttributeCount()I

    .line 78
    move-result v2

    .line 79
    .line 80
    new-array v5, v2, [I

    .line 81
    move v6, v3

    .line 82
    move v7, v6

    .line 83
    .line 84
    :goto_2
    if-ge v6, v2, :cond_6

    .line 85
    .line 86
    .line 87
    invoke-interface {p3, v6}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    .line 88
    move-result v8

    .line 89
    .line 90
    sget v9, Lcom/google/android/material/R$attr;->cornerSize:I

    .line 91
    .line 92
    if-eq v8, v9, :cond_5

    .line 93
    .line 94
    add-int/lit8 v9, v7, 0x1

    .line 95
    .line 96
    .line 97
    invoke-interface {p3, v6, v3}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    .line 98
    move-result v10

    .line 99
    .line 100
    if-eqz v10, :cond_4

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    neg-int v8, v8

    .line 103
    .line 104
    :goto_3
    aput v8, v5, v7

    .line 105
    move v7, v9

    .line 106
    .line 107
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 108
    goto :goto_2

    .line 109
    .line 110
    .line 111
    :cond_6
    invoke-static {v5, v7}, Landroid/util/StateSet;->trimStateSet([II)[I

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, v2, v4}, Lcom/google/android/material/shape/StateListCornerSize;->addStateCornerSize([ILcom/google/android/material/shape/CornerSize;)V

    .line 116
    goto :goto_0

    .line 117
    :cond_7
    return-void
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


# virtual methods
.method public getCornerSizeForState([I)Lcom/google/android/material/shape/CornerSize;
    .locals 1
    .param p1    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/material/shape/StateListCornerSize;->indexOfStateSet([I)I

    .line 4
    move-result p1

    .line 5
    .line 6
    if-gez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/util/StateSet;->WILD_CARD:[I

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/google/android/material/shape/StateListCornerSize;->indexOfStateSet([I)I

    .line 12
    move-result p1

    .line 13
    .line 14
    :cond_0
    if-gez p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/material/shape/StateListCornerSize;->defaultCornerSize:Lcom/google/android/material/shape/CornerSize;

    .line 17
    return-object p1

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 20
    .line 21
    aget-object p1, v0, p1

    .line 22
    return-object p1
    .line 23
.end method

.method public getDefaultCornerSize()Lcom/google/android/material/shape/CornerSize;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->defaultCornerSize:Lcom/google/android/material/shape/CornerSize;

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
.end method

.method public isStateful()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public withTransformedCornerSizes(Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;)Lcom/google/android/material/shape/StateListCornerSize;
    .locals 5
    .param p1    # Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/shape/StateListCornerSize;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/material/shape/StateListCornerSize;-><init>()V

    .line 6
    .line 7
    iget v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 8
    .line 9
    iput v1, v0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 12
    array-length v1, v1

    .line 13
    .line 14
    new-array v1, v1, [[I

    .line 15
    .line 16
    iput-object v1, v0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateSpecs:[[I

    .line 19
    array-length v3, v2

    .line 20
    const/4 v4, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 26
    array-length v1, v1

    .line 27
    .line 28
    new-array v1, v1, [Lcom/google/android/material/shape/CornerSize;

    .line 29
    .line 30
    iput-object v1, v0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 31
    .line 32
    :goto_0
    iget v1, p0, Lcom/google/android/material/shape/StateListCornerSize;->stateCount:I

    .line 33
    .line 34
    if-ge v4, v1, :cond_0

    .line 35
    .line 36
    iget-object v1, v0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/google/android/material/shape/StateListCornerSize;->cornerSizes:[Lcom/google/android/material/shape/CornerSize;

    .line 39
    .line 40
    aget-object v2, v2, v4

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, v2}, Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;->apply(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    aput-object v2, v1, v4

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v0
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
.end method
