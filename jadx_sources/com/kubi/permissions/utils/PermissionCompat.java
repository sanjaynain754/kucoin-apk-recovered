package com.kubi.permissions.utils;

import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.permissions.utils.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PermissionCompat.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/permissions/utils/PermissionCompat;", "", "<init>", "()V", "checkPermissionSmart", "", "context", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)I", "LPermissions_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PermissionCompat {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PermissionCompat f40528a = new PermissionCompat();

    /* JADX INFO: renamed from: a */
    public final int m49937a(@NotNull Context context, @NotNull String... permissions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : PermissionCompatKt.m49935d((String[]) Arrays.copyOf(permissions, permissions.length))) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return -1;
            }
        }
        return 0;
    }
}
