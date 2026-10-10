.class public Lcom/facebook/react/devsupport/RedBoxContentView;
.super Landroid/widget/LinearLayout;
.source "RedBoxContentView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;,
        Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;
    }
.end annotation


# instance fields
.field private isReporting:Z

.field private mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

.field private mDismissButton:Landroid/widget/Button;

.field private mLineSeparator:Landroid/view/View;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mLoadingIndicator:Landroid/widget/ProgressBar;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mReloadJsButton:Landroid/widget/Button;

.field private mReportButton:Landroid/widget/Button;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mReportButtonOnClickListener:Landroid/view/View$OnClickListener;

.field private mReportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

.field private mReportTextView:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mStackView:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 7
    .line 8
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$1;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 14
    .line 15
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$2;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$2;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 21
    return-void
    .line 22
    .line 23
.end method

.method public static bridge synthetic a(Lcom/facebook/react/devsupport/RedBoxContentView;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 3
    return p0
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
.end method

.method public static bridge synthetic b(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

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
.end method

.method public static bridge synthetic c(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLineSeparator:Landroid/view/View;

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
.end method

.method public static bridge synthetic d(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLoadingIndicator:Landroid/widget/ProgressBar;

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
.end method

.method public static bridge synthetic e(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

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
.end method

.method public static bridge synthetic f(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

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
.end method

.method public static bridge synthetic g(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

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
.end method

.method public static bridge synthetic h(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

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
.end method

.method public static bridge synthetic i(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 3
    return-void
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


# virtual methods
.method public init()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget v1, Lcom/facebook/react/R$layout;->redbox_view:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 14
    .line 15
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_stack:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Landroid/widget/ListView;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mStackView:Landroid/widget/ListView;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 27
    .line 28
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_reload_button:I

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Landroid/widget/Button;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReloadJsButton:Landroid/widget/Button;

    .line 37
    .line 38
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$3;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$3;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_dismiss_button:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    check-cast v0, Landroid/widget/Button;

    .line 53
    .line 54
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDismissButton:Landroid/widget/Button;

    .line 55
    .line 56
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$4;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$4;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 70
    move-result v0

    .line 71
    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_loading_indicator:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    check-cast v0, Landroid/widget/ProgressBar;

    .line 81
    .line 82
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLoadingIndicator:Landroid/widget/ProgressBar;

    .line 83
    .line 84
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_line_separator:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLineSeparator:Landroid/view/View;

    .line 91
    .line 92
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_report_label:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    check-cast v0, Landroid/widget/TextView;

    .line 99
    .line 100
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    .line 101
    .line 102
    .line 103
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 104
    move-result-object v1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 108
    .line 109
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    .line 110
    const/4 v1, 0x0

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 114
    .line 115
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_report_button:I

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    check-cast v0, Landroid/widget/Button;

    .line 122
    .line 123
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    .line 124
    .line 125
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    :cond_0
    return-void
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
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;

    .line 3
    .line 4
    iget-object p2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    check-cast p2, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 11
    const/4 p4, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p2, p4}, Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;-><init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/devsupport/n0;)V

    .line 15
    .line 16
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iget-object p4, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mStackView:Landroid/widget/ListView;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p4}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 22
    move-result-object p4

    .line 23
    .line 24
    .line 25
    invoke-interface {p4, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 26
    move-result-object p3

    .line 27
    .line 28
    check-cast p3, Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 29
    const/4 p4, 0x1

    .line 30
    .line 31
    new-array p4, p4, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 32
    const/4 p5, 0x0

    .line 33
    .line 34
    aput-object p3, p4, p5

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2, p4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 38
    return-void
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
.end method

.method public refreshContentView()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 15
    .line 16
    .line 17
    invoke-interface {v2}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    iget-object v3, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    invoke-interface {v3, v4}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v4, v3}, Lcom/facebook/react/devsupport/RedBoxContentView;->setExceptionDetails(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    .line 40
    .line 41
    iget-object v3, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 42
    .line 43
    .line 44
    invoke-interface {v3}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    .line 50
    invoke-interface {v3, v0, v1, v2}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->handleRedbox(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Lcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/RedBoxContentView;->resetReporting()V

    .line 54
    :cond_0
    return-void
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
.end method

.method public resetReporting()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportTextView:Landroid/widget/TextView;

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    check-cast v1, Landroid/widget/TextView;

    .line 23
    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLoadingIndicator:Landroid/widget/ProgressBar;

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Landroid/widget/ProgressBar;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mLineSeparator:Landroid/view/View;

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    check-cast v1, Landroid/view/View;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    check-cast v1, Landroid/widget/Button;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mReportButton:Landroid/widget/Button;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    check-cast v0, Landroid/widget/Button;

    .line 69
    const/4 v1, 0x1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 73
    :cond_1
    :goto_0
    return-void
    .line 74
    .line 75
.end method

.method public setDevSupportManager(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)Lcom/facebook/react/devsupport/RedBoxContentView;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mDevSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

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
.end method

.method public setExceptionDetails(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mStackView:Landroid/widget/ListView;

    .line 3
    .line 4
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;-><init>(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 11
    return-void
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
.end method

.method public setRedBoxHandler(Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)Lcom/facebook/react/devsupport/RedBoxContentView;
    .locals 0
    .param p1    # Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->mRedBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

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
.end method
