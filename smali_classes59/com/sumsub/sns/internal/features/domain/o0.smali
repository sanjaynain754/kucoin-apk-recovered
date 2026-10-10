.class public final Lcom/sumsub/sns/internal/features/domain/o0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/utils/a;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/data/model/common/T;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/domain/s0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/s0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/o0;->a:Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/o0;->b:Lcom/sumsub/sns/internal/features/domain/s0;

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
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/o0;->a:Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 2
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", side="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(I)V
    .locals 4

    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/domain/o0;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", uploaded progress="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 7
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 8
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/o0;->b:Lcom/sumsub/sns/internal/features/domain/s0;

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/o0;->a:Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 11
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/s0;->d:Lcom/sumsub/sns/internal/features/domain/n0;

    if-eqz v2, :cond_1

    const/16 v3, 0x64

    if-ne p1, v3, :cond_0

    .line 14
    sget-object p1, Lcom/sumsub/sns/internal/features/domain/documents/P;->a:Lcom/sumsub/sns/internal/features/domain/documents/P;

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/documents/S;

    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/domain/documents/S;-><init>(I)V

    move-object p1, v3

    .line 15
    :goto_0
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/domain/s0;->a()I

    move-result v0

    .line 16
    invoke-interface {v2, v1, p1, v0}, Lcom/sumsub/sns/internal/features/domain/n0;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V

    :cond_1
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/domain/o0;->a()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v0, ", upload finished"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 26
    .line 27
    const-string v2, "DocCapture"

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/o0;->b:Lcom/sumsub/sns/internal/features/domain/s0;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/o0;->a:Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 36
    .line 37
    const/16 v2, 0x64

    .line 38
    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/domain/s0;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/domain/s0;->d:Lcom/sumsub/sns/internal/features/domain/n0;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    sget-object v3, Lcom/sumsub/sns/internal/features/domain/documents/P;->a:Lcom/sumsub/sns/internal/features/domain/documents/P;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/domain/s0;->a()I

    .line 56
    move-result v0

    .line 57
    .line 58
    .line 59
    invoke-interface {v2, v1, v3, v0}, Lcom/sumsub/sns/internal/features/domain/n0;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/domain/documents/T;I)V

    .line 60
    :cond_0
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
.end method
