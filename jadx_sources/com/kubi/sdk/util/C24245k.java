package com.kubi.sdk.util;

import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.ReflectUtils;
import com.kubi.sdk.exception.AppBaseException;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.util.k */
/* JADX INFO: compiled from: DrawerInject.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"isExecutingActions", "", "Landroidx/fragment/app/FragmentManager;", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawerInject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerInject.kt\ncom/kubi/sdk/util/DrawerInjectKt\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n*L\n1#1,166:1\n45#2,2:167\n*S KotlinDebug\n*F\n+ 1 DrawerInject.kt\ncom/kubi/sdk/util/DrawerInjectKt\n*L\n163#1:167,2\n*E\n"})
public final class C24245k {
    /* JADX INFO: renamed from: a */
    public static final boolean m58464a(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        try {
            Object objM6079f = ReflectUtils.m6074o(fragmentManager).m6077d("mExecutingActions").m6079f();
            Boolean bool = objM6079f instanceof Boolean ? (Boolean) objM6079f : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e11) {
            C43846g.m96568c(new AppBaseException(e11, FragmentManager.TAG, false, null, 8, null), null, 2, null);
            return false;
        }
    }
}
