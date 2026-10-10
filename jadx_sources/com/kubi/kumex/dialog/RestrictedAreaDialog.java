package com.kubi.kumex.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RestrictedAreaDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J&\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/dialog/RestrictedAreaDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initListener", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RestrictedAreaDialog extends DialogFragmentHelper {
    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 4;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m33526l4(RestrictedAreaDialog restrictedAreaDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        restrictedAreaDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33527k4(View view) {
        View viewFindViewById = view.findViewById(R$id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExKt.m36483i((TextView) viewFindViewById);
        ((TextView) view.findViewById(R$id.tv_desc)).setText(getString(R$string.contract_restricted_area_content));
        View viewFindViewById2 = view.findViewById(R$id.tv_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.dialog.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RestrictedAreaDialog.m33526l4(this.f28892b, (View) obj);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_restricted_area, container, false);
        Intrinsics.checkNotNull(viewInflate);
        m33527k4(viewInflate);
        return viewInflate;
    }
}
