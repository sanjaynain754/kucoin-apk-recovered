package com.kubi.futures.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.guide.FuturesAdGuide;
import com.kubi.p072ad.api.entity.ResAdEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36728a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.C4781a0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesAdDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/dialog/FuturesAdDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/ad/api/entity/ResAdEntity;", "getEntity", "()Lcom/kubi/ad/api/entity/ResAdEntity;", "entity$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogFuturesOpenrationBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesOpenrationBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "close", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesAdDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesAdDialog.kt\ncom/kubi/futures/dialog/FuturesAdDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,188:1\n143#2,20:189\n*S KotlinDebug\n*F\n+ 1 FuturesAdDialog.kt\ncom/kubi/futures/dialog/FuturesAdDialog\n*L\n50#1:189,20\n*E\n"})
public final class FuturesAdDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f22776q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesAdDialog.m25115p4(this.f22990b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f22777r0 = C45681e.m100799e(this, new Function1<FuturesAdDialog, C36728a0>() { // from class: com.kubi.futures.dialog.FuturesAdDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36728a0 invoke(@NotNull FuturesAdDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36728a0.m82305a(fragment.requireView());
        }
    }, new Function1<C36728a0, Unit>() { // from class: com.kubi.futures.dialog.FuturesAdDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36728a0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36728a0 c36728a0) {
            invoke(c36728a0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f22775t0 = {Reflection.property1(new PropertyReference1Impl(FuturesAdDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesOpenrationBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f22774s0 = new Companion(null);

    /* JADX INFO: compiled from: FuturesAdDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/dialog/FuturesAdDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/ad/api/entity/ResAdEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull ResAdEntity entity) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(entity, "entity");
            FuturesAdDialog futuresAdDialog = new FuturesAdDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", entity);
            futuresAdDialog.setArguments(bundle);
            futuresAdDialog.show(manager, "FuturesAdDialog");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 6;
    }

    /* JADX INFO: renamed from: o4 */
    private final void m25114o4() {
        FuturesAdGuide.f29104g.sendNextStep();
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m25116s4(ResAdEntity resAdEntity, FuturesAdDialog futuresAdDialog) {
        FuturesAdFrequencyManager.f22826a.m25276a(C27041f.m66668h(resAdEntity.getId()));
        futuresAdDialog.m25114o4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m25117t4(ResAdEntity resAdEntity, FuturesAdDialog futuresAdDialog) {
        FuturesAdFrequencyManager.f22826a.m25276a(C27041f.m66668h(resAdEntity.getId()));
        futuresAdDialog.m25114o4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m25119v4(ResAdEntity resAdEntity, DialogInterface dialogInterface) {
        FuturesAdFrequencyManager.f22826a.m25277b(C27041f.m66668h(resAdEntity.getId()));
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_futures_openration, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String nightImageUrl;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36728a0 c36728a0M25121r4 = m25121r4();
        if (c36728a0M25121r4 == null) {
            return;
        }
        int iM66658b = C27040e.m66658b(300);
        int iM66658b2 = C27040e.m66658b(373);
        final ResAdEntity resAdEntityM25120q4 = m25120q4();
        if (resAdEntityM25120q4 == null) {
            m25114o4();
            return;
        }
        ImageView ivClose = c36728a0M25121r4.f79673d;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.futures.dialog.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAdDialog.m25116s4(resAdEntityM25120q4, this);
            }
        }, 1, null);
        ConstraintLayout container = c36728a0M25121r4.f79671b;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        C27046k.m66711z(container, 0L, new Function0() { // from class: com.kubi.futures.dialog.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAdDialog.m25117t4(resAdEntityM25120q4, this);
            }
        }, 1, null);
        RoundImageView ivBg = c36728a0M25121r4.f79672c;
        Intrinsics.checkNotNullExpressionValue(ivBg, "ivBg");
        C27046k.m66711z(ivBg, 0L, new Function0() { // from class: com.kubi.futures.dialog.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAdDialog.m25118u4(resAdEntityM25120q4, this);
            }
        }, 1, null);
        if (DayNightThemeManager.f28592a.m33187l()) {
            nightImageUrl = resAdEntityM25120q4.getDayImageUrl();
            if (nightImageUrl == null) {
                nightImageUrl = resAdEntityM25120q4.getNightImageUrl();
            }
        } else {
            nightImageUrl = resAdEntityM25120q4.getNightImageUrl();
            if (nightImageUrl == null) {
                nightImageUrl = resAdEntityM25120q4.getDayImageUrl();
            }
        }
        C5313g c5313gMo92213o0 = ComponentCallbacks2C5309c.m6557u(c36728a0M25121r4.f79672c).mo6634v(C27041f.m66668h(nightImageUrl)).mo92213o0(new C4781a0(C27040e.m66658b(16)));
        int i11 = R$mipmap.bg_error_free_style;
        c5313gMo92213o0.mo92188b0(i11).mo92208m(i11).mo92186a0(iM66658b, iM66658b2).m6594E0(c36728a0M25121r4.f79672c);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.kubi.futures.dialog.b0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    FuturesAdDialog.m25119v4(resAdEntityM25120q4, dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final ResAdEntity m25120q4() {
        return (ResAdEntity) this.f22776q0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final C36728a0 m25121r4() {
        return (C36728a0) this.f22777r0.getValue(this, f22775t0[0]);
    }

    /* JADX INFO: renamed from: p4 */
    public static final ResAdEntity m25115p4(FuturesAdDialog futuresAdDialog) {
        Bundle arguments = futuresAdDialog.getArguments();
        if (arguments != null) {
            return (ResAdEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m25118u4(ResAdEntity resAdEntity, FuturesAdDialog futuresAdDialog) {
        String strM66668h = C27041f.m66668h(resAdEntity.getUrl());
        if (StringsKt.startsWith$default(strM66668h, "http", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) strM66668h, (CharSequence) "appNeedLang=true", false, 2, (Object) null)) {
            if (StringsKt.contains$default((CharSequence) strM66668h, (CharSequence) "?", false, 2, (Object) null)) {
                strM66668h = strM66668h + "&appNeedLang=true";
            } else {
                strM66668h = strM66668h + "?appNeedLang=true";
            }
        }
        Router.f46192a.m56184f(strM66668h).m4048k();
        FuturesAdFrequencyManager.f22826a.m25277b(C27041f.m66668h(resAdEntity.getId()));
        futuresAdDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
