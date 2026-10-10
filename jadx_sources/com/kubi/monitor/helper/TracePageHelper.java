package com.kubi.monitor.helper;

import com.blankj.utilcode.util.ThreadUtils;
import com.kubi.monitor.FinishType;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43854o;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TracePageHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0013j\b\u0012\u0004\u0012\u00020\u0004`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0013j\b\u0012\u0004\u0012\u00020\u0004`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/monitor/helper/TracePageHelper;", "", "<init>", "()V", "", "operation", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "newOperation", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "Lkotlin/Function0;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "startedOperationSet", "endedOperationSet", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class TracePageHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TracePageHelper f35564a = new TracePageHelper();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<String> startedOperationSet = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<String> endedOperationSet = new HashSet<>();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m42467b(@NotNull String operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        m42468c(operation, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m42468c(final String operation, final Function0<Unit> action) {
        HashSet<String> hashSet = endedOperationSet;
        if (hashSet.contains(operation)) {
            return;
        }
        ThreadUtils.m6110c().postAtFrontOfQueue(new Runnable() { // from class: com.kubi.monitor.helper.f
            @Override // java.lang.Runnable
            public final void run() {
                TracePageHelper.m42469d(operation, action);
            }
        });
        hashSet.add(operation);
    }

    /* JADX INFO: renamed from: d */
    public static final void m42469d(String operation, Function0 function0) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        C43854o.m96610c(operation, null, FinishType.OK);
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m42470e(@NotNull String operation, @NotNull final String newOperation, @Nullable final String description) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(newOperation, "newOperation");
        m42468c(operation, new Function0<Unit>() { // from class: com.kubi.monitor.helper.TracePageHelper$endAndStartNext$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TracePageHelper.m42472g(newOperation, description);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m42471f(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        m42470e(str, str2, str3);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m42472g(@NotNull String operation, @Nullable String description) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        HashSet<String> hashSet = startedOperationSet;
        if (hashSet.contains(operation)) {
            return;
        }
        C43854o.m96611d(operation, operation, null, description, "primary_page");
        hashSet.add(operation);
    }
}
