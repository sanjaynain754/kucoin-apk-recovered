package com.kubi.sdk.site.migration;

import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NeedMigrationDialog.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0082\bJ\u001e\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/NeedMigrationDialog;", "", "<init>", "()V", "TAG", "", "PAGE_ID", "withReport", "", "message", "showDialog", "targetSite", "from", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNeedMigrationDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NeedMigrationDialog.kt\ncom/kubi/sdk/site/migration/NeedMigrationDialog\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,106:1\n50#2,3:107\n*S KotlinDebug\n*F\n+ 1 NeedMigrationDialog.kt\ncom/kubi/sdk/site/migration/NeedMigrationDialog\n*L\n31#1:107,3\n*E\n"})
public final class NeedMigrationDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NeedMigrationDialog f47921a = new NeedMigrationDialog();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m58130a(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94121c(), new NeedMigrationDialog$showDialog$2(str, str2, null), continuation);
    }
}
