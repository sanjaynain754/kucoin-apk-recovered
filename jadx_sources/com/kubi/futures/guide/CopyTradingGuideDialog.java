package com.kubi.futures.guide;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.Constants;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36787k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: CopyTradingGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/guide/CopyTradingGuideDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogCopyTradingGuideBinding;", "initType", "", "onStart", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isCanceledOnTouchOutside", "", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingGuide.kt\ncom/kubi/futures/guide/CopyTradingGuideDialog\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,127:1\n136#2:128\n126#2,2:129\n126#2,2:131\n*S KotlinDebug\n*F\n+ 1 CopyTradingGuide.kt\ncom/kubi/futures/guide/CopyTradingGuideDialog\n*L\n107#1:128\n104#1:129,2\n115#1:131,2\n*E\n"})
public final class CopyTradingGuideDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f23056r0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public C36787k f23057q0;

    /* JADX INFO: compiled from: CopyTradingGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/guide/CopyTradingGuideDialog$Companion;", "", "<init>", "()V", "PAGE_ID", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 4;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: O3 */
    public boolean mo25577O3() {
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m25574m4(CopyTradingGuideDialog copyTradingGuideDialog) {
        C43852m.m96591c("B5InviteUserOrderExpertCmp", Constants.COMPONENT, "close", null, 8, null);
        StorageId<Boolean> storageIdM103238C = C46894j.f104736a.m103238C();
        C36787k c36787k = copyTradingGuideDialog.f23057q0;
        if (c36787k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787k = null;
        }
        C46392a.m102328k(storageIdM103238C, c36787k.f80373q.isSelected());
        copyTradingGuideDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m25575n4(CopyTradingGuideDialog copyTradingGuideDialog) {
        C36787k c36787k = copyTradingGuideDialog.f23057q0;
        C36787k c36787k2 = null;
        if (c36787k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787k = null;
        }
        AppCompatImageView appCompatImageView = c36787k.f80373q;
        C36787k c36787k3 = copyTradingGuideDialog.f23057q0;
        if (c36787k3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36787k2 = c36787k3;
        }
        appCompatImageView.setSelected(!c36787k2.f80373q.isSelected());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m25576o4(CopyTradingGuideDialog copyTradingGuideDialog) {
        C43852m.m96591c("B5InviteUserOrderExpertCmp", Constants.COMPONENT, "joinNow", null, 8, null);
        StorageId<Boolean> storageIdM103238C = C46894j.f104736a.m103238C();
        C36787k c36787k = copyTradingGuideDialog.f23057q0;
        if (c36787k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787k = null;
        }
        C46392a.m102328k(storageIdM103238C, c36787k.f80373q.isSelected());
        Router.f46192a.m56184f("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=" + Uri.encode("FillApplyTraderForm?from=appB6futures")).m4048k();
        copyTradingGuideDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36787k c36787kM82433c = C36787k.m82433c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36787kM82433c, "inflate(...)");
        this.f23057q0 = c36787kM82433c;
        if (c36787kM82433c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787kM82433c = null;
        }
        return c36787kM82433c.getRoot();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43852m.m96595g("B5InviteUserOrderExpertCmp", Constants.COMPONENT, "1", null, 8, null);
        C36787k c36787k = this.f23057q0;
        C36787k c36787k2 = null;
        if (c36787k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787k = null;
        }
        AppCompatImageView closeIv = c36787k.f80358b;
        Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
        C27046k.m66711z(closeIv, 0L, new Function0() { // from class: com.kubi.futures.guide.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingGuideDialog.m25574m4(this.f23077b);
            }
        }, 1, null);
        boolean zM102322d = C46392a.m102322d(C46894j.f104736a.m103238C(), false);
        C36787k c36787k3 = this.f23057q0;
        if (c36787k3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787k3 = null;
        }
        c36787k3.f80373q.setSelected(zM102322d);
        C36787k c36787k4 = this.f23057q0;
        if (c36787k4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36787k4 = null;
        }
        LinearLayoutCompat noReminderLl = c36787k4.f80374r;
        Intrinsics.checkNotNullExpressionValue(noReminderLl, "noReminderLl");
        C27046k.m66711z(noReminderLl, 0L, new Function0() { // from class: com.kubi.futures.guide.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingGuideDialog.m25575n4(this.f23078b);
            }
        }, 1, null);
        C36787k c36787k5 = this.f23057q0;
        if (c36787k5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36787k2 = c36787k5;
        }
        KcPrimaryButton joinBtn = c36787k2.f80372p;
        Intrinsics.checkNotNullExpressionValue(joinBtn, "joinBtn");
        C27046k.m66711z(joinBtn, 0L, new Function0() { // from class: com.kubi.futures.guide.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingGuideDialog.m25576o4(this.f23079b);
            }
        }, 1, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setCancelable(false);
    }
}
