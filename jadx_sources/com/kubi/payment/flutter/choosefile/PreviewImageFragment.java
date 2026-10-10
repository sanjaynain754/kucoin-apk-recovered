package com.kubi.payment.flutter.choosefile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreviewImageFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/flutter/choosefile/PreviewImageFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "imagePath", "", "getImagePath", "()Ljava/lang/String;", "imagePath$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PreviewImageFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f39492V = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f39493U = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.flutter.choosefile.n
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreviewImageFragment.m48215l3(this.f39510b);
        }
    });

    /* JADX INFO: compiled from: PreviewImageFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/flutter/choosefile/PreviewImageFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "imagePath", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            companion.launch(context, str);
        }

        public final void launch(@NotNull Context context, @NotNull String imagePath) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            BaseFragmentActivity.m56574n0(context, "", PreviewImageFragment.class.getName(), new C27051h().m66724h("imagePath", imagePath).m66717a());
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final String m48216k3() {
        return (String) this.f39493U.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.botc_preview_image_fragment, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = (ImageView) findViewById(R$id.iv_image);
        if (imageView != null) {
            ComponentCallbacks2C5309c.m6558v(this).mo6634v(m48216k3()).m6594E0(imageView);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static final String m48215l3(PreviewImageFragment previewImageFragment) {
        String string;
        Bundle arguments = previewImageFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("imagePath");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }
}
