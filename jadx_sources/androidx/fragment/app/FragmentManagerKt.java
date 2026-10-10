package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FragmentManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m90084d2 = {"commit", "", "Landroidx/fragment/app/FragmentManager;", "allowStateLoss", "", TtmlNode.TAG_BODY, "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "commitNow", "transaction", "now", "fragment-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class FragmentManagerKt {
    public static final void commit(@NotNull FragmentManager fragmentManager, boolean z11, @NotNull Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z11, Function1 body, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @MainThread
    public static final void commitNow(@NotNull FragmentManager fragmentManager, boolean z11, @NotNull Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z11) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z11, Function1 body, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z11) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    @Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(@NotNull FragmentManager fragmentManager, boolean z11, boolean z12, @NotNull Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z11) {
            if (z12) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z12) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z11, boolean z12, Function1 body, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        body.invoke(fragmentTransactionBeginTransaction);
        if (z11) {
            if (z12) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z12) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
