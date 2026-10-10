package com.kubi.share.lib.shareui;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.share.R$id;
import com.kubi.share.R$layout;
import com.kubi.share.api.TextShareParam;
import com.kubi.share.lib.utils.C24634d;
import com.kubi.share.lib.utils.ShareChannel;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.share.lib.widget.ShareChannelView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextShareDialogFragment.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/TextShareDialogFragment;", "Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;", "<init>", "()V", "layoutShareContent", "Landroid/view/View;", "shareChannelView", "Lcom/kubi/share/lib/widget/ShareChannelView;", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "dismiss", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TextShareDialogFragment extends AbsShareDailogFragment {

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public static final Companion f49423v0 = new Companion(null);

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public View f49424t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public ShareChannelView f49425u0;

    /* JADX INFO: compiled from: TextShareDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/TextShareDialogFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "fm", "Landroidx/fragment/app/FragmentManager;", "param", "Lcom/kubi/share/api/TextShareParam;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull FragmentManager fm2, @NotNull TextShareParam param) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(param, "param");
            TextShareDialogFragment textShareDialogFragment = new TextShareDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.share_layout_text);
            bundle.putInt("type", 5);
            bundle.putParcelable("KEY_PARAMS", param);
            bundle.putBoolean("isAnimationEnabled", false);
            textShareDialogFragment.setArguments(bundle);
            textShareDialogFragment.m59726o4(fm2);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m59823u4(final TextShareDialogFragment textShareDialogFragment) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.shareui.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextShareDialogFragment.m59824v4(this.f49474b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m59826x4(final TextShareDialogFragment textShareDialogFragment, String str, TextShareParam textShareParam, ShareChannel shareChannel) {
        if (shareChannel == null) {
            textShareDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
        ShareDispatcher.m59807i(ShareDispatcher.f49422a, shareChannel, textShareDialogFragment, null, str, ShareExtKt.m59837J(textShareParam), new Function0() { // from class: com.kubi.share.lib.shareui.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextShareDialogFragment.m59827y4(this.f49484b);
            }
        }, 2, null);
        textShareDialogFragment.m59725n4(true);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.share.lib.shareui.AbsShareDailogFragment
    /* JADX INFO: renamed from: b3 */
    public void mo59724b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        Bundle arguments = getArguments();
        final TextShareParam textShareParam = arguments != null ? (TextShareParam) RouteExKt.m56274t(arguments, "KEY_PARAMS") : null;
        if (textShareParam == null) {
            return;
        }
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextShareDialogFragment.m59825w4(this.f49476b);
            }
        }, 1, null);
        String strM59837J = ShareExtKt.m59837J(textShareParam);
        String title = textShareParam.getTitle();
        if (title == null) {
            title = "";
        }
        String content = textShareParam.getContent();
        if (content == null) {
            content = "";
        }
        StringBuilder sb2 = new StringBuilder(content);
        if (strM59837J.length() > 0) {
            sb2.append('\n' + strM59837J);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        CharSequence charSequenceM59867z = ShareExtKt.m59867z(string);
        String content2 = textShareParam.getContent();
        String str = content2 != null ? content2 : "";
        int i11 = R$id.tvTitle;
        viewHolder.setGone(i11, title.length() > 0);
        viewHolder.setText(i11, title);
        int i12 = R$id.tvContent;
        viewHolder.setGone(i12, charSequenceM59867z.length() > 0);
        viewHolder.setText(i12, charSequenceM59867z);
        ((TextView) viewHolder.getView(i12)).setMovementMethod(new ScrollingMovementMethod());
        View view = viewHolder.getView(R$id.layoutShareContent);
        this.f49424t0 = view;
        if (view != null) {
            C24634d.m59878i(view, 300L);
        }
        StringBuilder sb3 = new StringBuilder(title);
        if (str.length() > 0) {
            sb3.append('\n' + str);
        }
        if (strM59837J.length() > 0) {
            sb3.append('\n' + strM59837J);
        }
        String string2 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        final String strM59867z = ShareExtKt.m59867z(string2);
        ShareChannelView shareChannelView = (ShareChannelView) viewHolder.getView(R$id.shareChannelView);
        if (shareChannelView == null) {
            return;
        }
        this.f49425u0 = shareChannelView;
        C24634d.m59873d(shareChannelView, 300L);
        ShareChannelView shareChannelView2 = this.f49425u0;
        if (shareChannelView2 != null) {
            shareChannelView2.m59927C(textShareParam, new Function1() { // from class: com.kubi.share.lib.shareui.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextShareDialogFragment.m59826x4(this.f49478b, strM59867z, textShareParam, (ShareChannel) obj);
                }
            });
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        View view = this.f49424t0;
        if (view != null) {
            C24634d.m59879j(view, 230L);
        }
        ShareChannelView shareChannelView = this.f49425u0;
        if (shareChannelView != null) {
            C24634d.m59875f(shareChannelView, 230L, new Function0() { // from class: com.kubi.share.lib.shareui.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextShareDialogFragment.m59823u4(this.f49472b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m59824v4(TextShareDialogFragment textShareDialogFragment) {
        super.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m59825w4(TextShareDialogFragment textShareDialogFragment) {
        textShareDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m59827y4(TextShareDialogFragment textShareDialogFragment) {
        textShareDialogFragment.dismiss();
        return Unit.INSTANCE;
    }
}
