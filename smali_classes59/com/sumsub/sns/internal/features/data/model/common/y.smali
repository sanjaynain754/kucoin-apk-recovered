.class public final Lcom/sumsub/sns/internal/features/data/model/common/y;
.super Lcom/sumsub/sns/internal/features/data/model/common/D;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nApplicantDataField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicantDataField.kt\ncom/sumsub/sns/internal/features/data/model/common/ApplicantDataField$Field\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,408:1\n1#2:409\n*E\n"
    }
.end annotation

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/sumsub/sns/internal/features/data/model/common/y;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/common/w;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final k:[Lkotlin/Lazy;


# instance fields
.field public final b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

.field public final c:Z

.field public final d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/Boolean;

.field public final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/w;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/w;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/w;

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/x;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/x;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 17
    .line 18
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/n4;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/common/n4;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/o4;

    .line 28
    .line 29
    .line 30
    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/data/model/common/o4;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const/16 v2, 0x9

    .line 37
    .line 38
    new-array v2, v2, [Lkotlin/Lazy;

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    .line 42
    aput-object v3, v2, v4

    .line 43
    const/4 v4, 0x1

    .line 44
    .line 45
    aput-object v3, v2, v4

    .line 46
    const/4 v4, 0x2

    .line 47
    .line 48
    aput-object v1, v2, v4

    .line 49
    const/4 v1, 0x3

    .line 50
    .line 51
    aput-object v3, v2, v1

    .line 52
    const/4 v1, 0x4

    .line 53
    .line 54
    aput-object v0, v2, v1

    .line 55
    const/4 v0, 0x5

    .line 56
    .line 57
    aput-object v3, v2, v0

    .line 58
    const/4 v0, 0x6

    .line 59
    .line 60
    aput-object v3, v2, v0

    .line 61
    const/4 v0, 0x7

    .line 62
    .line 63
    aput-object v3, v2, v0

    .line 64
    .line 65
    const/16 v0, 0x8

    .line 66
    .line 67
    aput-object v3, v2, v0

    .line 68
    .line 69
    sput-object v2, Lcom/sumsub/sns/internal/features/data/model/common/y;->k:[Lkotlin/Lazy;

    .line 70
    return-void
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

.method public synthetic constructor <init>(ILcom/sumsub/sns/internal/features/data/model/common/d2;ZLcom/sumsub/sns/internal/features/data/model/common/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 2

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x3

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/v;->a:Lcom/sumsub/sns/internal/features/data/model/common/v;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/v;->getDescriptor()Lvg0/f;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/c2;->a(IILvg0/f;)V

    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/data/model/common/D;-><init>()V

    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    :goto_5
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    return-void

    :cond_7
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLcom/sumsub/sns/internal/features/data/model/common/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/D;-><init>(I)V

    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 5
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 6
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 7
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    .line 9
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 10
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    .line 11
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 12
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLjava/lang/String;Ljava/lang/Boolean;I)V
    .locals 13

    move/from16 v0, p5

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p3

    :goto_0
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object/from16 v11, p4

    :goto_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    .line 2
    invoke-direct/range {v3 .. v12}, Lcom/sumsub/sns/internal/features/data/model/common/y;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/d2;ZLcom/sumsub/sns/internal/features/data/model/common/FieldType;Ljava/lang/String;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/M0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic d()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/FieldType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "com.sumsub.sns.internal.features.data.model.common.FieldType"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlinx/serialization/internal/i0;->b(Ljava/lang/String;[Ljava/lang/Enum;)Ltg0/d;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static final synthetic e()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 8
    return-object v0
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


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/d2;->b()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    const-string v0, ""

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/y;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 26
    .line 27
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 28
    .line 29
    if-eq v1, v3, :cond_3

    .line 30
    return v2

    .line 31
    .line 32
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 33
    .line 34
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 35
    .line 36
    if-eq v1, v3, :cond_4

    .line 37
    return v2

    .line 38
    .line 39
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-nez v1, :cond_5

    .line 48
    return v2

    .line 49
    .line 50
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    .line 51
    .line 52
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    move-result v1

    .line 57
    .line 58
    if-nez v1, :cond_6

    .line 59
    return v2

    .line 60
    .line 61
    :cond_6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 62
    .line 63
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    if-nez v1, :cond_7

    .line 70
    return v2

    .line 71
    .line 72
    :cond_7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-nez v1, :cond_8

    .line 81
    return v2

    .line 82
    .line 83
    :cond_8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 84
    .line 85
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v1

    .line 90
    .line 91
    if-nez v1, :cond_9

    .line 92
    return v2

    .line 93
    .line 94
    :cond_9
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 95
    .line 96
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-nez p1, :cond_a

    .line 103
    return v2

    .line 104
    :cond_a
    return v0
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
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    const/16 v2, 0x1f

    .line 14
    mul-int/2addr v0, v2

    .line 15
    .line 16
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 17
    .line 18
    .line 19
    invoke-static {v3, v0, v2}, Lcom/sumsub/sentry/android/h;->a(ZII)I

    .line 20
    move-result v0

    .line 21
    .line 22
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    move v3, v1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 30
    move-result v3

    .line 31
    :goto_1
    add-int/2addr v0, v3

    .line 32
    mul-int/2addr v0, v2

    .line 33
    .line 34
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v3, :cond_2

    .line 37
    move v3, v1

    .line 38
    goto :goto_2

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 42
    move-result v3

    .line 43
    :goto_2
    add-int/2addr v0, v3

    .line 44
    mul-int/2addr v0, v2

    .line 45
    .line 46
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    .line 47
    .line 48
    if-nez v3, :cond_3

    .line 49
    move v3, v1

    .line 50
    goto :goto_3

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 54
    move-result v3

    .line 55
    :goto_3
    add-int/2addr v0, v3

    .line 56
    mul-int/2addr v0, v2

    .line 57
    .line 58
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 59
    .line 60
    if-nez v3, :cond_4

    .line 61
    move v3, v1

    .line 62
    goto :goto_4

    .line 63
    .line 64
    .line 65
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 66
    move-result v3

    .line 67
    :goto_4
    add-int/2addr v0, v3

    .line 68
    mul-int/2addr v0, v2

    .line 69
    .line 70
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    .line 71
    .line 72
    if-nez v3, :cond_5

    .line 73
    move v3, v1

    .line 74
    goto :goto_5

    .line 75
    .line 76
    .line 77
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 78
    move-result v3

    .line 79
    :goto_5
    add-int/2addr v0, v3

    .line 80
    mul-int/2addr v0, v2

    .line 81
    .line 82
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 83
    .line 84
    if-nez v3, :cond_6

    .line 85
    move v3, v1

    .line 86
    goto :goto_6

    .line 87
    .line 88
    .line 89
    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 90
    move-result v3

    .line 91
    :goto_6
    add-int/2addr v0, v3

    .line 92
    mul-int/2addr v0, v2

    .line 93
    .line 94
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 95
    .line 96
    if-nez v2, :cond_7

    .line 97
    goto :goto_7

    .line 98
    .line 99
    .line 100
    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 101
    move-result v1

    .line 102
    :goto_7
    add-int/2addr v0, v1

    .line 103
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 17
    .line 18
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v9, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    const-string v10, "Field(name="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, ", isRequired="

    .line 34
    .line 35
    .line 36
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v0, ", type="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v0, ", mask="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v0, ", masks="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v0, ", format="

    .line 66
    .line 67
    .line 68
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v0, ", placeholder="

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v0, ", isImmutableIfPresent="

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v0, ", path="

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v0, ")"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    move-result-object v0

    .line 105
    return-object v0
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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->b:Lcom/sumsub/sns/internal/features/data/model/common/d2;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->c:Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->d:Lcom/sumsub/sns/internal/features/data/model/common/FieldType;

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->e:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->f:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->g:Lcom/sumsub/sns/internal/features/data/model/common/M0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 46
    .line 47
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->h:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 51
    .line 52
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->i:Ljava/lang/Boolean;

    .line 53
    .line 54
    if-nez p2, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    goto :goto_1

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    move-result p2

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    .line 70
    :goto_1
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/y;->j:Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    return-void
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
