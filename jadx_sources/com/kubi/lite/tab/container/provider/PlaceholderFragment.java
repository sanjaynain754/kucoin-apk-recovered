package com.kubi.lite.tab.container.provider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.lite.tab.container.provider.PlaceholderFragment;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: NativeFragmentProvider.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/PlaceholderFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "text", "", "getText", "()Ljava/lang/String;", "text$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PlaceholderFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f32095V = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f32096U = LazyKt.lazy(new Function0() { // from class: co.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PlaceholderFragment.m37565l3(this.f5697b);
        }
    });

    /* JADX INFO: compiled from: NativeFragmentProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/lite/tab/container/provider/PlaceholderFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_TEXT", "newInstance", "Lcom/kubi/lite/tab/container/provider/PlaceholderFragment;", "text", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final PlaceholderFragment newInstance(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            PlaceholderFragment placeholderFragment = new PlaceholderFragment();
            Bundle bundle = new Bundle();
            bundle.putString("text", text);
            placeholderFragment.setArguments(bundle);
            return placeholderFragment;
        }
    }

    /* JADX INFO: renamed from: k3 */
    private final String m37564k3() {
        return (String) this.f32096U.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C44128b.m97259c(getTAG(), "Creating placeholder view: " + m37564k3());
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TextView textView = new TextView(requireContext());
        textView.setText(m37564k3());
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        frameLayout.addView(textView);
        return frameLayout;
    }

    /* JADX INFO: renamed from: l3 */
    public static final String m37565l3(PlaceholderFragment placeholderFragment) {
        String string;
        Bundle arguments = placeholderFragment.getArguments();
        if (arguments != null && (string = arguments.getString("text")) != null) {
            return string;
        }
        return "Placeholder";
    }
}
