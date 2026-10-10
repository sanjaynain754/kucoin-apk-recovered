package com.kubi.utils.extensions.core;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.ReflectUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ReplaceWith;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v70.C45463a;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.f */
/* JADX INFO: compiled from: FragmentExt.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019\u001aC\u0010\u001a\u001a\u00020\u0003*\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001d\u001a\u00020\u0003*\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u001f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r\u0018\u00010\f¢\u0006\u0004\b\u001f\u0010\u001b\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0019\u001a\u0019\u0010 \u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010\u0019\u001a\u0019\u0010!\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b!\u0010\u0019\u001a\u0011\u0010$\u001a\u00020#*\u00020\"¢\u0006\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Landroidx/fragment/app/FragmentActivity;", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function1;)V", "", "layoutId", "Landroidx/fragment/app/Fragment;", "f", "", "Lkotlin/Pair;", "", "", "bundle", "o", "(Landroidx/fragment/app/FragmentActivity;ILandroidx/fragment/app/Fragment;[Lkotlin/Pair;)V", "c", "g", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/Fragment;)V", CmcdData.Factory.STREAMING_FORMAT_SS, CmcdData.Factory.STREAM_TYPE_LIVE, "m", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)V", "n", "(Landroidx/fragment/app/Fragment;ILandroidx/fragment/app/Fragment;[Lkotlin/Pair;)V", "tag", "i", "(Landroidx/fragment/app/Fragment;ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "r", "k", "Landroidx/fragment/app/FragmentManager;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroidx/fragment/app/FragmentManager;)Z", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFragmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentExt.kt\ncom/kubi/utils/extensions/core/FragmentExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final class C27032f {
    /* JADX INFO: renamed from: a */
    public static final void m66610a(@NotNull Fragment fragment, int i11, @NotNull Fragment f11, @Nullable Pair<String, ? extends Object>[] pairArr) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        if (pairArr != null) {
            f11.setArguments(C27029c.m66605h(pairArr));
        }
        fragment.getChildFragmentManager().beginTransaction().add(i11, f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m66611b(Fragment fragment, int i11, Fragment fragment2, Pair[] pairArr, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            pairArr = null;
        }
        m66610a(fragment, i11, fragment2, pairArr);
    }

    /* JADX INFO: renamed from: c */
    public static final void m66612c(@NotNull FragmentActivity fragmentActivity, int i11, @NotNull Fragment f11, @Nullable Pair<String, ? extends Object>[] pairArr) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        if (pairArr != null) {
            f11.setArguments(C27029c.m66605h(pairArr));
        }
        fragmentActivity.getSupportFragmentManager().beginTransaction().add(i11, f11).commitNowAllowingStateLoss();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m66613d(FragmentActivity fragmentActivity, int i11, Fragment fragment, Pair[] pairArr, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            pairArr = null;
        }
        m66612c(fragmentActivity, i11, fragment, pairArr);
    }

    /* JADX INFO: renamed from: e */
    public static final void m66614e(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super FragmentTransaction, Unit> action) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        FragmentTransaction fragmentManager$lambda$0 = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentManager$lambda$0, "fragmentManager$lambda$0");
        action.invoke(fragmentManager$lambda$0);
        fragmentManager$lambda$0.commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: f */
    public static final void m66615f(@NotNull Fragment fragment, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragment.getChildFragmentManager().beginTransaction().hide(f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: g */
    public static final void m66616g(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragmentActivity.getSupportFragmentManager().beginTransaction().hide(f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m66617h(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        try {
            Object objM6079f = ReflectUtils.m6074o(fragmentManager).m6077d("mExecutingActions").m6079f();
            Boolean bool = objM6079f instanceof Boolean ? (Boolean) objM6079f : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e11) {
            C45463a.m100408a(e11, "FragmentExt");
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m66618i(@NotNull Fragment fragment, int i11, @NotNull Fragment f11, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragment.getChildFragmentManager().beginTransaction().add(i11, f11, str).hide(f11).commitNowAllowingStateLoss();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m66619j(Fragment fragment, int i11, Fragment fragment2, String str, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        m66618i(fragment, i11, fragment2, str);
    }

    /* JADX INFO: renamed from: k */
    public static final void m66620k(@NotNull Fragment fragment, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragment.getChildFragmentManager().beginTransaction().remove(f11).commitAllowingStateLoss();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "unsafe", replaceWith = @ReplaceWith(expression = "removeNow(layoutId,f,bundle)", imports = {}))
    /* JADX INFO: renamed from: l */
    public static final void m66621l(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragmentActivity.getSupportFragmentManager().beginTransaction().remove(f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: m */
    public static final void m66622m(@NotNull Fragment fragment, @NotNull Fragment f11) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        try {
            Result.Companion companion = Result.INSTANCE;
            fragment.getChildFragmentManager().beginTransaction().remove(f11).commitNowAllowingStateLoss();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45463a.m100408a(thM103847exceptionOrNullimpl, "common sdk error");
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m66623n(@NotNull Fragment fragment, int i11, @NotNull Fragment f11, @Nullable Pair<String, ? extends Object>[] pairArr) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        if (pairArr != null) {
            f11.setArguments(C27029c.m66605h(pairArr));
        }
        fragment.getChildFragmentManager().beginTransaction().replace(i11, f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o */
    public static final void m66624o(@NotNull FragmentActivity fragmentActivity, int i11, @NotNull Fragment f11, @Nullable Pair<String, ? extends Object>[] pairArr) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        if (pairArr != null) {
            f11.setArguments(C27029c.m66605h(pairArr));
        }
        fragmentActivity.getSupportFragmentManager().beginTransaction().replace(i11, f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m66625p(Fragment fragment, int i11, Fragment fragment2, Pair[] pairArr, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            pairArr = null;
        }
        m66623n(fragment, i11, fragment2, pairArr);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m66626q(FragmentActivity fragmentActivity, int i11, Fragment fragment, Pair[] pairArr, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            pairArr = null;
        }
        m66624o(fragmentActivity, i11, fragment, pairArr);
    }

    /* JADX INFO: renamed from: r */
    public static final void m66627r(@NotNull Fragment fragment, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragment.getChildFragmentManager().beginTransaction().show(f11).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: s */
    public static final void m66628s(@NotNull FragmentActivity fragmentActivity, @NotNull Fragment f11) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        fragmentActivity.getSupportFragmentManager().beginTransaction().show(f11).commitAllowingStateLoss();
    }
}
