.class public Lorg/commonmark/internal/LinkReferenceDefinitionParser;
.super Ljava/lang/Object;
.source "LinkReferenceDefinitionParser.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;
    }
.end annotation


# instance fields
.field public a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

.field public final b:Ljava/lang/StringBuilder;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lih0/p;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/StringBuilder;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:C

.field public h:Ljava/lang/StringBuilder;

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->START_DEFINITION:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->c:Ljava/util/List;

    .line 22
    const/4 v0, 0x0

    .line 23
    .line 24
    iput-boolean v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->i:Z

    .line 25
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;I)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, v0}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 8
    move-result p2

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lhh0/c;->a(Ljava/lang/CharSequence;I)I

    .line 12
    move-result v0

    .line 13
    const/4 v1, -0x1

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    return v1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 20
    move-result v2

    .line 21
    .line 22
    const/16 v3, 0x3c

    .line 23
    const/4 v4, 0x1

    .line 24
    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    add-int/2addr p2, v4

    .line 27
    .line 28
    add-int/lit8 v2, v0, -0x1

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 36
    move-result-object p2

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    :goto_0
    iput-object p2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->f:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 51
    move-result p2

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0, p2}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 55
    move-result p2

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 59
    move-result p1

    .line 60
    .line 61
    if-lt p2, p1, :cond_2

    .line 62
    .line 63
    iput-boolean v4, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->i:Z

    .line 64
    .line 65
    iget-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

    .line 66
    const/4 v0, 0x0

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 70
    goto :goto_1

    .line 71
    .line 72
    :cond_2
    if-ne p2, v0, :cond_3

    .line 73
    return v1

    .line 74
    .line 75
    :cond_3
    :goto_1
    sget-object p1, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->START_TITLE:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 76
    .line 77
    iput-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 78
    return p2
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
.end method

.method public final b()V
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->i:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->f:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lhh0/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-object v1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h:Ljava/lang/StringBuilder;

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lhh0/a;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v1, v2

    .line 27
    .line 28
    :goto_0
    iget-object v3, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->c:Ljava/util/List;

    .line 29
    .line 30
    new-instance v4, Lih0/p;

    .line 31
    .line 32
    iget-object v5, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->e:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-direct {v4, v5, v0, v1}, Lih0/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    iput-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 41
    const/4 v0, 0x0

    .line 42
    .line 43
    iput-boolean v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->i:Z

    .line 44
    .line 45
    iput-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->e:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->f:Ljava/lang/String;

    .line 48
    .line 49
    iput-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h:Ljava/lang/StringBuilder;

    .line 50
    return-void
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
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lih0/p;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b()V

    .line 4
    .line 5
    iget-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->c:Ljava/util/List;

    .line 6
    return-object v0
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
.end method

.method public d()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

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
    .line 21
.end method

.method public final e(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lhh0/c;->c(Ljava/lang/CharSequence;I)I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    return v1

    .line 9
    .line 10
    :cond_0
    iget-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, p1, p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 17
    move-result p2

    .line 18
    .line 19
    if-lt v0, p2, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const/16 p2, 0xa

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    return v0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 31
    move-result p2

    .line 32
    .line 33
    const/16 v2, 0x5d

    .line 34
    .line 35
    if-ne p2, v2, :cond_5

    .line 36
    .line 37
    add-int/lit8 p2, v0, 0x1

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 41
    move-result v2

    .line 42
    .line 43
    if-ge p2, v2, :cond_5

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 47
    move-result p2

    .line 48
    .line 49
    const/16 v2, 0x3a

    .line 50
    .line 51
    if-eq p2, v2, :cond_2

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_2
    iget-object p2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 58
    move-result p2

    .line 59
    .line 60
    const/16 v2, 0x3e7

    .line 61
    .line 62
    if-le p2, v2, :cond_3

    .line 63
    return v1

    .line 64
    .line 65
    :cond_3
    iget-object p2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Lhh0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 77
    move-result v2

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    return v1

    .line 81
    .line 82
    :cond_4
    iput-object p2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->e:Ljava/lang/String;

    .line 83
    .line 84
    sget-object p2, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->DESTINATION:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 85
    .line 86
    iput-object p2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 87
    .line 88
    add-int/lit8 v0, v0, 0x2

    .line 89
    .line 90
    .line 91
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 92
    move-result p2

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v0, p2}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 96
    move-result p1

    .line 97
    return p1

    .line 98
    :cond_5
    :goto_0
    return v1
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
.end method

.method public f(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 25
    move-result v1

    .line 26
    .line 27
    if-ge v0, v1, :cond_2

    .line 28
    .line 29
    sget-object v1, Lorg/commonmark/internal/LinkReferenceDefinitionParser$a;->a:[I

    .line 30
    .line 31
    iget-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 35
    move-result v2

    .line 36
    .line 37
    aget v1, v1, v2

    .line 38
    .line 39
    .line 40
    packed-switch v1, :pswitch_data_0

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :pswitch_0
    invoke-virtual {p0, p1, v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->i(Ljava/lang/CharSequence;I)I

    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :pswitch_1
    invoke-virtual {p0, p1, v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h(Ljava/lang/CharSequence;I)I

    .line 50
    move-result v0

    .line 51
    goto :goto_0

    .line 52
    .line 53
    .line 54
    :pswitch_2
    invoke-virtual {p0, p1, v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a(Ljava/lang/CharSequence;I)I

    .line 55
    move-result v0

    .line 56
    goto :goto_0

    .line 57
    .line 58
    .line 59
    :pswitch_3
    invoke-virtual {p0, p1, v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->e(Ljava/lang/CharSequence;I)I

    .line 60
    move-result v0

    .line 61
    goto :goto_0

    .line 62
    .line 63
    .line 64
    :pswitch_4
    invoke-virtual {p0, p1, v0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->g(Ljava/lang/CharSequence;I)I

    .line 65
    move-result v0

    .line 66
    :goto_0
    const/4 v1, -0x1

    .line 67
    .line 68
    if-ne v0, v1, :cond_1

    .line 69
    .line 70
    sget-object p1, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->PARAGRAPH:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 71
    .line 72
    iput-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 73
    :cond_2
    :pswitch_5
    return-void

    .line 74
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final g(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, v0}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 8
    move-result p2

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result v0

    .line 13
    .line 14
    if-ge p2, v0, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 18
    move-result v0

    .line 19
    .line 20
    const/16 v1, 0x5b

    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    sget-object v0, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->LABEL:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 26
    .line 27
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 35
    .line 36
    add-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 40
    move-result p1

    .line 41
    .line 42
    if-lt p2, p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->d:Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const/16 v0, 0xa

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 50
    :cond_1
    return p2

    .line 51
    :cond_2
    :goto_0
    const/4 p1, -0x1

    .line 52
    return p1
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
.end method

.method public final h(Ljava/lang/CharSequence;I)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2, v0}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 8
    move-result p2

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result v0

    .line 13
    .line 14
    if-lt p2, v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->START_DEFINITION:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 17
    .line 18
    iput-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 19
    return p2

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-char v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->g:C

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 26
    move-result v0

    .line 27
    .line 28
    const/16 v1, 0x22

    .line 29
    .line 30
    if-eq v0, v1, :cond_2

    .line 31
    .line 32
    const/16 v1, 0x27

    .line 33
    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    const/16 v1, 0x28

    .line 37
    .line 38
    if-eq v0, v1, :cond_1

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_1
    const/16 v0, 0x29

    .line 42
    .line 43
    iput-char v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->g:C

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_2
    iput-char v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->g:C

    .line 47
    .line 48
    :goto_0
    iget-char v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->g:C

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    sget-object v0, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->TITLE:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 53
    .line 54
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    iput-object v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h:Ljava/lang/StringBuilder;

    .line 62
    .line 63
    add-int/lit8 p2, p2, 0x1

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 67
    move-result p1

    .line 68
    .line 69
    if-ne p2, p1, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h:Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const/16 v0, 0xa

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    :cond_3
    return p2

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {p0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b()V

    .line 81
    .line 82
    sget-object p1, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->START_DEFINITION:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 83
    .line 84
    iput-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 85
    return p2
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
.end method

.method public final i(Ljava/lang/CharSequence;I)I
    .locals 3

    .line 1
    .line 2
    iget-char v0, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->g:C

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Lhh0/c;->e(Ljava/lang/CharSequence;IC)I

    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    return v1

    .line 11
    .line 12
    :cond_0
    iget-object v2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h:Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 23
    move-result p2

    .line 24
    .line 25
    if-lt v0, p2, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->h:Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const/16 p2, 0xa

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    return v0

    .line 34
    :cond_1
    const/4 p2, 0x1

    .line 35
    add-int/2addr v0, p2

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0, v2}, Lhh0/d;->m(Ljava/lang/CharSequence;II)I

    .line 43
    move-result v0

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 47
    move-result p1

    .line 48
    .line 49
    if-eq v0, p1, :cond_2

    .line 50
    return v1

    .line 51
    .line 52
    :cond_2
    iput-boolean p2, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->i:Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b()V

    .line 56
    .line 57
    iget-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->b:Ljava/lang/StringBuilder;

    .line 58
    const/4 p2, 0x0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    sget-object p1, Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;->START_DEFINITION:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 64
    .line 65
    iput-object p1, p0, Lorg/commonmark/internal/LinkReferenceDefinitionParser;->a:Lorg/commonmark/internal/LinkReferenceDefinitionParser$State;

    .line 66
    return v0
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
.end method
