package com.kubi.kumex.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p729wl.C45875l0;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: RiskEducationDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J&\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/dialog/RiskEducationDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "submitPreferencesSetting", "onDestroyView", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RiskEducationDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final Companion f28863q0 = new Companion(null);

    /* JADX INFO: renamed from: r0 */
    public static boolean f28864r0;

    /* JADX INFO: compiled from: RiskEducationDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/dialog/RiskEducationDialog$Companion;", "", "<init>", "()V", "isShowing", "", "showStopProfitAndLossRisk", "", "manager", "Landroidx/fragment/app/FragmentManager;", "resetStopProfitAndLossCount", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void resetStopProfitAndLossCount() {
            DataMapUtil.f54245a.m66378m("bkumex_risk_edu_order", 0);
        }

        public final void showStopProfitAndLossRisk(@NotNull FragmentManager manager) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            if (C46527h0.f104291a.m102685U()) {
                return;
            }
            DataMapUtil dataMapUtil = DataMapUtil.f54245a;
            int iM66371c = dataMapUtil.m66371c("bkumex_risk_edu_order_total_count", 0) + 1;
            if (iM66371c > 3) {
                return;
            }
            if (System.currentTimeMillis() - dataMapUtil.m66372e("bkumex_risk_edu_order_close_time", 0L) < 604800000) {
                return;
            }
            int iM66371c2 = dataMapUtil.m66371c("bkumex_risk_edu_order", 0) + 1;
            dataMapUtil.m66378m("bkumex_risk_edu_order", iM66371c2);
            if (RiskEducationDialog.f28864r0 || iM66371c2 >= 20) {
                dataMapUtil.m66378m("bkumex_risk_edu_order_total_count", iM66371c);
                RiskEducationDialog.f28864r0 = true;
                new RiskEducationDialog().show(manager.beginTransaction(), "RiskEducationDialog");
            }
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 4;
    }

    /* JADX INFO: renamed from: s4 */
    private final void m33540s4(View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_title);
        Intrinsics.checkNotNull(textView);
        ViewExKt.m36483i(textView);
        textView.setText(getString(R$string.bkumex_risk_edu_order_title));
        ((TextView) view.findViewById(R$id.tv_content)).setText(getString(R$string.bkumex_risk_edu_order_content));
        View viewFindViewById = view.findViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.dialog.d2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiskEducationDialog.m33541t4(this.f28898b, (View) obj);
            }
        });
        TextView textView2 = (TextView) view.findViewById(R$id.tv_action);
        textView2.setText(getString(R$string.bkumex_risk_edu_open));
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.m66575f(textView2, new Function1() { // from class: com.kubi.kumex.dialog.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiskEducationDialog.m33542u4(this.f28908b, (View) obj);
            }
        });
        TextView textView3 = (TextView) view.findViewById(R$id.tv_education);
        textView3.setText(getString(R$string.bkumex_risk_edu_order_tips));
        Intrinsics.checkNotNull(textView3);
        ViewExtKt.m66575f(textView3, new Function1() { // from class: com.kubi.kumex.dialog.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiskEducationDialog.m33543v4((View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m33541t4(RiskEducationDialog riskEducationDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        riskEducationDialog.dismissAllowingStateLoss();
        C43852m.m96595g(C17060n0.m36552b(), "TpLsGuide", "2", null, 8, null);
        DataMapUtil.f54245a.m66379n("bkumex_risk_edu_order_close_time", System.currentTimeMillis());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m33542u4(RiskEducationDialog riskEducationDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96595g(C17060n0.m36552b(), "TpLsGuide", null, null, 12, null);
        riskEducationDialog.m33547w4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m33543v4(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101339g0(), null, null, null, null, null, null, 126, null);
        C43852m.m96595g(C17060n0.m36552b(), "TpLsGuide", "3", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Object m33544x4(PreferencesEntity preferencesEntity) {
        return RepositoryServiceLocator.f19236a.m20290i().mo99992r(preferencesEntity);
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m33545y4(PreferencesEntity preferencesEntity, RiskEducationDialog riskEducationDialog, Object obj) {
        RepositoryServiceLocator.f19236a.m20290i().mo99986i(preferencesEntity);
        riskEducationDialog.dismissAllowingStateLoss();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_position_education, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m54191p3();
        C43852m.m96595g(C17060n0.m36552b(), "TpLsGuide", null, null, 12, null);
        m33540s4(view);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m33547w4() {
        final PreferencesEntity preferencesEntityMo99988m = RepositoryServiceLocator.f19236a.m20290i().mo99988m();
        preferencesEntityMo99988m.setStopProfitAndLoss(Boolean.TRUE);
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.kumex.dialog.g2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RiskEducationDialog.m33544x4(preferencesEntityMo99988m);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.dialog.h2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RiskEducationDialog.m33545y4(preferencesEntityMo99988m, this, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.dialog.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RiskEducationDialog.m33546z4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.dialog.j2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RiskEducationDialog.m33530A4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m33530A4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m33546z4(Throwable th2) {
        C44128b.m97261e("RiskEducationDialog", C27041f.m66668h(th2.getMessage()));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        f28864r0 = false;
    }
}
