package com.kubi.component;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.component.BottomDialogHostFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradebase.R$id;
import com.tencent.qcloud.tuicore.TUIConstants;
import n30.C42736l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BottomDialogHostFragment.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\f\u001a\u00020\u0000\"\u0006\b\u0000\u0010\r\u0018\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112#\b\u0004\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u0011H\r¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\bø\u0001\u0000J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010\u0010\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\u001a\u0010#\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, m90084d2 = {"Lcom/kubi/component/BottomDialogHostFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradebase/databinding/KcBottomDialogHostFragmentLayoutBinding;", "screenHeight", "", "getScreenHeight", "()I", "screenHeight$delegate", "Lkotlin/Lazy;", "bindEventCallback", ExifInterface.GPS_DIRECTION_TRUE, "key", "", "onStart", "", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "isBottomSheet", "createAndAddFragment", "containerId", "Companion", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomDialogHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomDialogHostFragment.kt\ncom/kubi/component/BottomDialogHostFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n81#2,2:140\n1#3:142\n*S KotlinDebug\n*F\n+ 1 BottomDialogHostFragment.kt\ncom/kubi/component/BottomDialogHostFragment\n*L\n73#1:140,2\n*E\n"})
public final class BottomDialogHostFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f19596s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public C42736l f19597q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f19598r0 = LazyKt.lazy(new Function0() { // from class: ac.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BottomDialogHostFragment.m20437m4());
        }
    });

    /* JADX INFO: compiled from: BottomDialogHostFragment.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\n\u001a\u00020\u000b\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\tJ4\u0010\u0015\u001a\u00020\u0016\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/component/BottomDialogHostFragment$Companion;", "", "<init>", "()V", "KEY_FRAGMENT_CLASS", "", "KEY_ARGS", "KEY_HEIGHT_RATIO", "DEFAULT_HEIGHT_RATIO", "", "start", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/sdk/BaseFragment;", "context", "Landroid/content/Context;", "fragmentClass", "Ljava/lang/Class;", "args", "Landroid/os/Bundle;", "heightRatio", "newInstance", "Lcom/kubi/component/BottomDialogHostFragment;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, Class cls, Bundle bundle, float f11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            if ((i11 & 8) != 0) {
                f11 = 0.9f;
            }
            companion.start(context, cls, bundle, f11);
        }

        public final <T extends BaseFragment> void start(@NotNull Context context, @NotNull Class<T> fragmentClass, @Nullable Bundle args, float heightRatio) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            Bundle bundle = new Bundle();
            bundle.putString("key_fragment_class", fragmentClass.getName());
            bundle.putBundle("key_args", args);
            bundle.putFloat("key_height_ratio", heightRatio);
            Unit unit = Unit.INSTANCE;
            companion.launch(context, BottomDialogHostFragment.class, bundle);
        }

        public Companion() {
        }

        public static /* synthetic */ BottomDialogHostFragment newInstance$default(Companion companion, Class cls, Bundle bundle, float f11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            if ((i11 & 4) != 0) {
                f11 = 0.9f;
            }
            return companion.newInstance(cls, bundle, f11);
        }

        @NotNull
        public final <T extends BaseFragment> BottomDialogHostFragment newInstance(@NotNull Class<T> fragmentClass, @Nullable Bundle args, float heightRatio) {
            Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
            BottomDialogHostFragment bottomDialogHostFragment = new BottomDialogHostFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_fragment_class", fragmentClass.getName());
            bundle.putBundle("key_args", args);
            bundle.putFloat("key_height_ratio", heightRatio);
            bottomDialogHostFragment.setArguments(bundle);
            return bottomDialogHostFragment;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20438k4(Bundle bundle, int i11) {
        Bundle arguments;
        String string;
        if (bundle != null || (arguments = getArguments()) == null || (string = arguments.getString("key_fragment_class")) == null) {
            return;
        }
        Bundle arguments2 = getArguments();
        Bundle bundle2 = arguments2 != null ? arguments2.getBundle("key_args") : null;
        Context context = getContext();
        if (context != null) {
            Fragment fragmentInstantiate = getChildFragmentManager().getFragmentFactory().instantiate(context.getClassLoader(), string);
            fragmentInstantiate.setArguments(bundle2);
            Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "apply(...)");
            getChildFragmentManager().beginTransaction().replace(i11, fragmentInstantiate).commitNow();
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final int m20439l4() {
        return ((Number) this.f19598r0.getValue()).intValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C42736l c42736lM93645c = C42736l.m93645c(inflater, container, false);
        Bundle arguments = getArguments();
        c42736lM93645c.f94647b.setMinimumHeight((int) (m20439l4() * (arguments != null ? arguments.getFloat("key_height_ratio", 0.9f) : 0.9f)));
        this.f19597q0 = c42736lM93645c;
        return c42736lM93645c.getRoot();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42736l c42736l = this.f19597q0;
        if (c42736l == null || (frameLayout = c42736l.f94647b) == null) {
            return;
        }
        m20438k4(savedInstanceState, frameLayout.getId());
    }

    /* JADX INFO: renamed from: m4 */
    public static final int m20437m4() {
        return C5267e0.m6182d();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                Bundle arguments = getArguments();
                float f11 = 0.9f;
                if (arguments != null) {
                    f11 = arguments.getFloat("key_height_ratio", 0.9f);
                }
                bottomSheetBehaviorFrom.setPeekHeight((int) (m20439l4() * f11));
                bottomSheetBehaviorFrom.setState(3);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
            }
            dialog.setCanceledOnTouchOutside(true);
        }
    }
}
