package com.kubi.assets.overview;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.R$style;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44796j3;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: NewGuideDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR+\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/overview/NewGuideDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/DialogFragmentAssetv2NewguideBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogFragmentAssetv2NewguideBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mDepositFragment", "Lcom/kubi/assets/overview/NewGuideChildFragment;", "getMDepositFragment", "()Lcom/kubi/assets/overview/NewGuideChildFragment;", "mDepositFragment$delegate", "Lkotlin/Lazy;", "mBuyFragment", "getMBuyFragment", "mBuyFragment$delegate", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getTitleList", "()Ljava/util/ArrayList;", "titleList$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, TIMPushProvider.f75062n, "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "onStart", "init", "bottomAndWrapHeight", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewGuideDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewGuideDialogFragment.kt\ncom/kubi/assets/overview/NewGuideDialogFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,90:1\n143#2,20:91\n126#3,2:111\n*S KotlinDebug\n*F\n+ 1 NewGuideDialogFragment.kt\ncom/kubi/assets/overview/NewGuideDialogFragment\n*L\n23#1:91,20\n77#1:111,2\n*E\n"})
public final class NewGuideDialogFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ KProperty<Object>[] f18213u0 = {Reflection.property1(new PropertyReference1Impl(NewGuideDialogFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogFragmentAssetv2NewguideBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f18214q0 = C45681e.m100799e(this, new Function1<NewGuideDialogFragment, C44796j3>() { // from class: com.kubi.assets.overview.NewGuideDialogFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44796j3 invoke(@NotNull NewGuideDialogFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44796j3.m99111a(fragment.requireView());
        }
    }, new Function1<C44796j3, Unit>() { // from class: com.kubi.assets.overview.NewGuideDialogFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44796j3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44796j3 c44796j3) {
            invoke(c44796j3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f18215r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.x0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewGuideDialogFragment.m18345s4();
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f18216s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.y0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewGuideDialogFragment.m18344r4();
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f18217t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.z0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewGuideDialogFragment.m18346t4(this.f18558b);
        }
    });

    private final void init() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C27103z c27103z = new C27103z(childFragmentManager, CollectionsKt.arrayListOf(m18350p4(), m18349o4()), m18343q4());
        C44796j3 c44796j3M18348n4 = m18348n4();
        if (c44796j3M18348n4 != null) {
            c44796j3M18348n4.f100224c.setAdapter(c27103z);
            c44796j3M18348n4.f100223b.setViewPager(c44796j3M18348n4.f100224c);
            c44796j3M18348n4.f100223b.m55291w();
        }
        C46392a.m102328k(C42153h.f93593a.m92520j(), true);
    }

    /* JADX INFO: renamed from: q4 */
    private final ArrayList<CharSequence> m18343q4() {
        return (ArrayList) this.f18217t0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public static final NewGuideChildFragment m18344r4() {
        return NewGuideChildFragment.f18203X.newInstance(2);
    }

    /* JADX INFO: renamed from: s4 */
    public static final NewGuideChildFragment m18345s4() {
        return NewGuideChildFragment.f18203X.newInstance(1);
    }

    /* JADX INFO: renamed from: t4 */
    public static final ArrayList m18346t4(NewGuideDialogFragment newGuideDialogFragment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C27096v0().append(newGuideDialogFragment.getString(R$string.assets_overview_empyt_guide1)));
        arrayList.add(new C27096v0().append(newGuideDialogFragment.getString(R$string.otc_fast_in)));
        return arrayList;
    }

    /* JADX INFO: renamed from: m4 */
    public final void m18347m4() {
        Window window;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        WindowManager.LayoutParams attributes = window2.getAttributes();
        attributes.width = displayMetrics.widthPixels;
        attributes.windowAnimations = R$style.style_bottom_dialog;
        attributes.height = -2;
        attributes.gravity = 80;
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setAttributes(attributes);
    }

    /* JADX INFO: renamed from: n4 */
    public final C44796j3 m18348n4() {
        return (C44796j3) this.f18214q0.getValue(this, f18213u0[0]);
    }

    /* JADX INFO: renamed from: o4 */
    public final NewGuideChildFragment m18349o4() {
        return (NewGuideChildFragment) this.f18216s0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_fragment_assetv2_newguide, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    /* JADX INFO: renamed from: p4 */
    public final NewGuideChildFragment m18350p4() {
        return (NewGuideChildFragment) this.f18215r0.getValue();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        super.show(manager, tag);
        C43852m.m96595g("B1overview", "guidence", "0", null, 8, null);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog);
            if (dialog.getWindow() == null) {
                return;
            }
            m18347m4();
        }
    }
}
