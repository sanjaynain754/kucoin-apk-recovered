.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001BA\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J7\u0010\u0019\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001eR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;",
        "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;",
        "",
        "Lcom/sumsub/sns/internal/features/data/model/common/Document;",
        "documents",
        "Landroidx/savedstate/SavedStateRegistryOwner;",
        "stateRegistryOwner",
        "Lcom/sumsub/sns/internal/core/domain/h;",
        "serviceLocator",
        "Landroid/os/Bundle;",
        "args",
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;",
        "videoChatAdapter",
        "Lcom/sumsub/sns/internal/core/common/b1;",
        "uriContentLoader",
        "<init>",
        "(Ljava/util/List;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;)V",
        "Landroidx/lifecycle/ViewModel;",
        "T",
        "",
        "key",
        "Ljava/lang/Class;",
        "modelClass",
        "Landroidx/lifecycle/SavedStateHandle;",
        "handle",
        "create",
        "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;",
        "Ljava/util/List;",
        "getDocuments",
        "()Ljava/util/List;",
        "Lcom/sumsub/sns/internal/core/domain/h;",
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;",
        "Lcom/sumsub/sns/internal/core/common/b1;",
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
.field private final documents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sumsub/sns/internal/features/data/model/common/Document;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final uriContentLoader:Lcom/sumsub/sns/internal/core/common/b1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final videoChatAdapter:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/savedstate/SavedStateRegistryOwner;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/sumsub/sns/internal/core/domain/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/sumsub/sns/internal/core/common/b1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/internal/features/data/model/common/Document;",
            ">;",
            "Landroidx/savedstate/SavedStateRegistryOwner;",
            "Lcom/sumsub/sns/internal/core/domain/h;",
            "Landroid/os/Bundle;",
            "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;",
            "Lcom/sumsub/sns/internal/core/common/b1;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p2, p4}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->documents:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 5
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->videoChatAdapter:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;

    .line 6
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->uriContentLoader:Lcom/sumsub/sns/internal/core/common/b1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;-><init>(Ljava/util/List;Landroidx/savedstate/SavedStateRegistryOwner;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;)V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/lifecycle/SavedStateHandle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/SavedStateHandle;",
            ")TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel;

    .line 5
    .line 6
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->documents:Ljava/util/List;

    .line 7
    .line 8
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 9
    .line 10
    iget-object v4, v3, Lcom/sumsub/sns/internal/core/domain/h;->z:Lxg0/a;

    .line 11
    .line 12
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 13
    .line 14
    .line 15
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 19
    .line 20
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 21
    .line 22
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v5

    .line 27
    .line 28
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 29
    .line 30
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 31
    .line 32
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/domain/h;->s:Lkotlin/Lazy;

    .line 33
    .line 34
    .line 35
    invoke-interface {v6}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 36
    move-result-object v6

    .line 37
    .line 38
    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/socket/a;

    .line 39
    .line 40
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/videoident/h;

    .line 41
    .line 42
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 43
    .line 44
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 45
    .line 46
    .line 47
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 51
    .line 52
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 53
    .line 54
    iget-object v9, v9, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 55
    .line 56
    .line 57
    invoke-interface {v9}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    check-cast v9, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 61
    .line 62
    .line 63
    invoke-direct {v8, v9, v7}, Lcom/sumsub/sns/internal/features/domain/videoident/h;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 64
    .line 65
    new-instance v9, Lcom/sumsub/sns/internal/features/domain/videoident/j;

    .line 66
    .line 67
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 68
    .line 69
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 70
    .line 71
    .line 72
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 73
    move-result-object v7

    .line 74
    .line 75
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 76
    .line 77
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 78
    .line 79
    iget-object v10, v10, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 80
    .line 81
    .line 82
    invoke-interface {v10}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 83
    move-result-object v10

    .line 84
    .line 85
    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 86
    .line 87
    .line 88
    invoke-direct {v9, v10, v7}, Lcom/sumsub/sns/internal/features/domain/videoident/j;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 89
    .line 90
    new-instance v10, Lcom/sumsub/sns/internal/features/domain/videoident/f;

    .line 91
    .line 92
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 93
    .line 94
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 95
    .line 96
    .line 97
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 98
    move-result-object v7

    .line 99
    .line 100
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 101
    .line 102
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 103
    .line 104
    iget-object v11, v11, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 105
    .line 106
    .line 107
    invoke-interface {v11}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 108
    move-result-object v11

    .line 109
    .line 110
    check-cast v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 111
    .line 112
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 113
    .line 114
    iget-object v12, v12, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 115
    .line 116
    .line 117
    invoke-interface {v12}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 118
    move-result-object v12

    .line 119
    .line 120
    check-cast v12, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 121
    .line 122
    .line 123
    invoke-direct {v10, v7, v11, v12}, Lcom/sumsub/sns/internal/features/domain/videoident/f;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 124
    .line 125
    new-instance v11, Lcom/sumsub/sns/internal/features/domain/videoident/d;

    .line 126
    .line 127
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 128
    .line 129
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 130
    .line 131
    .line 132
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 133
    move-result-object v7

    .line 134
    .line 135
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 136
    .line 137
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 138
    .line 139
    iget-object v12, v12, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 140
    .line 141
    .line 142
    invoke-interface {v12}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 143
    move-result-object v12

    .line 144
    .line 145
    check-cast v12, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 146
    .line 147
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 148
    .line 149
    iget-object v13, v13, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 150
    .line 151
    .line 152
    invoke-interface {v13}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 153
    move-result-object v13

    .line 154
    .line 155
    check-cast v13, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 156
    .line 157
    .line 158
    invoke-direct {v11, v7, v12, v13}, Lcom/sumsub/sns/internal/features/domain/videoident/d;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 159
    .line 160
    new-instance v12, Lcom/sumsub/sns/internal/features/domain/videoident/b;

    .line 161
    .line 162
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 163
    .line 164
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 165
    .line 166
    .line 167
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 168
    move-result-object v7

    .line 169
    .line 170
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 171
    .line 172
    iget-object v13, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 173
    .line 174
    iget-object v13, v13, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 175
    .line 176
    .line 177
    invoke-interface {v13}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 178
    move-result-object v13

    .line 179
    .line 180
    check-cast v13, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 181
    .line 182
    .line 183
    invoke-direct {v12, v13, v7}, Lcom/sumsub/sns/internal/features/domain/videoident/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 184
    .line 185
    new-instance v13, Lcom/sumsub/sns/internal/features/domain/Y;

    .line 186
    .line 187
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 188
    .line 189
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 190
    .line 191
    .line 192
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 193
    move-result-object v7

    .line 194
    .line 195
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 196
    .line 197
    .line 198
    invoke-direct {v13, v7}, Lcom/sumsub/sns/internal/features/domain/Y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 199
    .line 200
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->videoChatAdapter:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;

    .line 201
    .line 202
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->uriContentLoader:Lcom/sumsub/sns/internal/core/common/b1;

    .line 203
    .line 204
    iget-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->serviceLocator:Lcom/sumsub/sns/internal/core/domain/h;

    .line 205
    .line 206
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 207
    .line 208
    .line 209
    invoke-interface {v7}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 210
    move-result-object v7

    .line 211
    .line 212
    move-object/from16 v16, v7

    .line 213
    .line 214
    check-cast v16, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 215
    move-object v7, v4

    .line 216
    move-object v4, v3

    .line 217
    move-object v3, v7

    .line 218
    .line 219
    move-object/from16 v7, p3

    .line 220
    .line 221
    .line 222
    invoke-direct/range {v1 .. v16}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModel;-><init>(Ljava/util/List;Lxg0/a;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/socket/a;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/videoident/h;Lcom/sumsub/sns/internal/features/domain/videoident/j;Lcom/sumsub/sns/internal/features/domain/videoident/f;Lcom/sumsub/sns/internal/features/domain/videoident/d;Lcom/sumsub/sns/internal/features/domain/videoident/b;Lcom/sumsub/sns/internal/features/domain/Y;Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoChatAdapter;Lcom/sumsub/sns/internal/core/common/b1;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;)V

    .line 223
    return-object v1
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
.end method

.method public final getDocuments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/internal/features/data/model/common/Document;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentViewModelFactory;->documents:Ljava/util/List;

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
