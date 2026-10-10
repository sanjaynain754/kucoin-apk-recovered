package com.kubi.share.lib.shareui;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.share.lib.utils.C24652v;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ru.C44176b;
import y70.C46392a;

/* JADX INFO: compiled from: AbsShareDailogFragment.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "recordIfShareClick", "", "getRecordIfShareClick", "()Z", "setRecordIfShareClick", "(Z)V", "recordIfShareBack", "onStart", "", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", TIMPushProvider.f75062n, "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "onPause", "onResume", "onDestroyView", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsShareDailogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsShareDailogFragment.kt\ncom/kubi/share/lib/shareui/AbsShareDailogFragment\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,81:1\n135#2,2:82\n126#2,2:84\n*S KotlinDebug\n*F\n+ 1 AbsShareDailogFragment.kt\ncom/kubi/share/lib/shareui/AbsShareDailogFragment\n*L\n67#1:82,2\n72#1:84,2\n*E\n"})
public abstract class AbsShareDailogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final CompositeDisposable f49397q0 = new CompositeDisposable();

    /* JADX INFO: renamed from: r0 */
    public boolean f49398r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f49399s0;

    /* JADX INFO: renamed from: l4 */
    public static final Unit m59722l4(AbsShareDailogFragment absShareDailogFragment, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        absShareDailogFragment.mo59724b3(viewHolder, dialogFragmentHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m59723m4(FragmentActivity fragmentActivity) {
        C44176b.f97516a.m97395b(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b3 */
    public void mo59724b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
    }

    /* JADX INFO: renamed from: n4 */
    public final void m59725n4(boolean z11) {
        this.f49398r0 = z11;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m59726o4(@NotNull FragmentManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        show(manager, "shareDialog");
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.findFragmentByTag(tag) != null) {
            return;
        }
        super.show(manager, tag);
    }

    public AbsShareDailogFragment() {
        m54237f4(new Function2() { // from class: com.kubi.share.lib.shareui.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbsShareDailogFragment.m59722l4(this.f49432b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f49397q0.dispose();
        ShareExtKt.m59864w();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f49399s0 = true;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        final FragmentActivity activity;
        super.onResume();
        if (this.f49399s0 && this.f49398r0) {
            this.f49399s0 = false;
            this.f49398r0 = false;
            if (!C46392a.m102322d(C24652v.m59896a(), false) && (activity = getActivity()) != null) {
                C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.shareui.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbsShareDailogFragment.m59723m4(activity);
                    }
                });
                C46392a.m102328k(C24652v.m59896a(), true);
            }
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setDimAmount(0.7f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(1792);
        }
    }
}
