.class Lcom/facebook/react/devsupport/RedBoxContentView$2;
.super Ljava/lang/Object;
.source "RedBoxContentView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

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
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->e(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->e(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->a(Lcom/facebook/react/devsupport/RedBoxContentView;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 33
    const/4 v1, 0x1

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->i(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->h(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Landroid/widget/TextView;

    .line 49
    .line 50
    const-string v1, "Reporting..."

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->h(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    check-cast v0, Landroid/widget/TextView;

    .line 66
    const/4 v1, 0x0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->d(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    check-cast v0, Landroid/widget/ProgressBar;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 85
    .line 86
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->c(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/view/View;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    move-result-object v0

    .line 95
    .line 96
    check-cast v0, Landroid/view/View;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->f(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    check-cast v0, Landroid/widget/Button;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 115
    .line 116
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 117
    .line 118
    .line 119
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->b(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    move-result-object v0

    .line 129
    move-object v3, v0

    .line 130
    .line 131
    check-cast v3, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->b(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    .line 144
    invoke-static {v0}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    move-result-object v0

    .line 146
    move-object v4, v0

    .line 147
    .line 148
    check-cast v4, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 149
    .line 150
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->b(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    .line 157
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getSourceUrl()Ljava/lang/String;

    .line 158
    move-result-object v5

    .line 159
    .line 160
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 161
    .line 162
    .line 163
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->e(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    iget-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$2;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 171
    .line 172
    .line 173
    invoke-static {p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->g(Lcom/facebook/react/devsupport/RedBoxContentView;)Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    .line 177
    invoke-static {p1}, Lh6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    move-result-object p1

    .line 179
    move-object v6, p1

    .line 180
    .line 181
    check-cast v6, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 182
    .line 183
    .line 184
    invoke-interface/range {v1 .. v6}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->reportRedbox(Landroid/content/Context;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;)V

    .line 185
    :cond_1
    :goto_0
    return-void
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
.end method
