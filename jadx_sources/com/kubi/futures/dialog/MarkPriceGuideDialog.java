package com.kubi.futures.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.futures.dialog.position.LiqDescDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36776i0;
import f00.C37304a;
import g00.InterfaceC37752d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarkPriceGuideDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/dialog/MarkPriceGuideDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogMarkPriceGuideBinding;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "dismissRelatedDialogs", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarkPriceGuideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkPriceGuideDialog.kt\ncom/kubi/futures/dialog/MarkPriceGuideDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1869#2,2:70\n*S KotlinDebug\n*F\n+ 1 MarkPriceGuideDialog.kt\ncom/kubi/futures/dialog/MarkPriceGuideDialog\n*L\n61#1:70,2\n*E\n"})
public final class MarkPriceGuideDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f22778r0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public C36776i0 f22779q0;

    /* JADX INFO: compiled from: MarkPriceGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/futures/dialog/MarkPriceGuideDialog$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/kubi/futures/dialog/MarkPriceGuideDialog;", "symbol", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarkPriceGuideDialog newInstance(@Nullable String symbol) {
            MarkPriceGuideDialog markPriceGuideDialog = new MarkPriceGuideDialog();
            Bundle bundle = new Bundle();
            bundle.putString("data", symbol);
            markPriceGuideDialog.setArguments(bundle);
            return markPriceGuideDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36776i0 c36776i0M82410c = C36776i0.m82410c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36776i0M82410c, "inflate(...)");
        this.f22779q0 = c36776i0M82410c;
        if (c36776i0M82410c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36776i0M82410c = null;
        }
        LinearLayoutCompat root = c36776i0M82410c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36776i0 c36776i0 = this.f22779q0;
        C36776i0 c36776i1 = null;
        if (c36776i0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36776i0 = null;
        }
        KcSecondaryButton confirm = c36776i0.f80230b;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.dialog.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarkPriceGuideDialog.m25124m4(this.f22834b);
            }
        }, 1, null);
        C36776i0 c36776i2 = this.f22779q0;
        if (c36776i2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36776i1 = c36776i2;
        }
        KcPrimaryButton goSetting = c36776i1.f80231c;
        Intrinsics.checkNotNullExpressionValue(goSetting, "goSetting");
        C27046k.m66711z(goSetting, 0L, new Function0() { // from class: com.kubi.futures.dialog.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarkPriceGuideDialog.m25125n4(this.f22837b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m25124m4(MarkPriceGuideDialog markPriceGuideDialog) {
        markPriceGuideDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m25125n4(MarkPriceGuideDialog markPriceGuideDialog) {
        String string;
        Bundle arguments = markPriceGuideDialog.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        String strM66669i = C27041f.m66669i(string, C46527h0.f104291a.m102677L());
        markPriceGuideDialog.m25126l4();
        InterfaceC37752d.a.m85122a(C37304a.f82764a, strM66669i, null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public final void m25126l4() {
        List<Fragment> fragments = getParentFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : CollectionsKt.toList(fragments)) {
            if (fragment instanceof LiqDescDialog) {
                ((LiqDescDialog) fragment).dismissAllowingStateLoss();
            } else if (fragment instanceof MarkPriceGuideDialog) {
                ((MarkPriceGuideDialog) fragment).dismissAllowingStateLoss();
            }
        }
    }
}
