package com.kubi.launch;

import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.launch.v, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PendingintentHelper.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/launch/PendingintentHelper;", "", "<init>", "()V", "activityBlackList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "kotlin.jvm.PlatformType", "addActivityBlackList", "", "activityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClassName", "isBlackList", "", "intent", "Landroid/content/Intent;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PendingintentHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PendingintentHelper f31847a = new PendingintentHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final CopyOnWriteArrayList<String> f31848b = new CopyOnWriteArrayList<>(CollectionsKt.listOf("com.kubi.otc.PaymentWebActivity"));

    /* JADX INFO: renamed from: a */
    public final boolean m37527a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return m37528b(intent.getStringExtra("activityCls"));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37528b(String str) {
        return str != null && f31848b.contains(str);
    }
}
