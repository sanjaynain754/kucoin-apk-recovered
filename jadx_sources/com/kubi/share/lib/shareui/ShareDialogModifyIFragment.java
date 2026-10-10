package com.kubi.share.lib.shareui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.share.R$drawable;
import com.kubi.share.R$id;
import com.kubi.share.R$layout;
import com.kubi.share.R$string;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.utils.C27057k;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ShareDialogModifyIFragment.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/ShareDialogModifyIFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "onConfirmed", "Lkotlin/Function1;", "", "", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareDialogModifyIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareDialogModifyIFragment.kt\ncom/kubi/share/lib/shareui/ShareDialogModifyIFragment\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,147:1\n58#2,23:148\n93#2,3:171\n*S KotlinDebug\n*F\n+ 1 ShareDialogModifyIFragment.kt\ncom/kubi/share/lib/shareui/ShareDialogModifyIFragment\n*L\n99#1:148,23\n99#1:171,3\n*E\n"})
public final class ShareDialogModifyIFragment extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f49414r0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public Function1<? super String, Unit> f49415q0;

    /* JADX INFO: compiled from: ShareDialogModifyIFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/ShareDialogModifyIFragment$Companion;", "", "<init>", "()V", "KEY_DEFAULT_LINK", "", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "defaultLink", "onConfirmed", "Lkotlin/Function1;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull String defaultLink, @NotNull Function1<? super String, Unit> onConfirmed) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(defaultLink, "defaultLink");
            Intrinsics.checkNotNullParameter(onConfirmed, "onConfirmed");
            ShareDialogModifyIFragment shareDialogModifyIFragment = new ShareDialogModifyIFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.share_layout_gallery_modify);
            bundle.putInt("type", 8);
            bundle.putString("default_link", defaultLink);
            bundle.putBoolean("isAnimationEnabled", false);
            shareDialogModifyIFragment.setArguments(bundle);
            shareDialogModifyIFragment.f49415q0 = onConfirmed;
            shareDialogModifyIFragment.show(manager, "modifyInviteLink");
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.ShareDialogModifyIFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ShareDialogModifyIFragment.kt\ncom/kubi/share/lib/shareui/ShareDialogModifyIFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n100#2,10:98\n71#3:108\n77#4:109\n*E\n"})
    public static final class C24578a implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f49416b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f49417c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ RadioButton f49418d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ EditText f49419e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f49420f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ View f49421g;

        public C24578a(TextView textView, View view, RadioButton radioButton, EditText editText, View view2, View view3) {
            this.f49416b = textView;
            this.f49417c = view;
            this.f49418d = radioButton;
            this.f49419e = editText;
            this.f49420f = view2;
            this.f49421g = view3;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            ShareDialogModifyIFragment.m59786G4(this.f49419e, this.f49420f, this.f49421g);
            ViewExtKt.m66577h(this.f49416b);
            this.f49417c.setBackgroundResource(this.f49418d.isChecked() ? R$drawable.share_shape_invite_link_input_selected_bg : R$drawable.share_shape_invite_link_input_bg);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m59783D4(RadioButton radioButton, EditText editText, TextView textView, BaseViewHolder baseViewHolder, View view, ShareDialogModifyIFragment shareDialogModifyIFragment, String str) {
        if (radioButton.isChecked() && StringsKt.trim((CharSequence) editText.getText().toString()).toString().length() == 0) {
            ViewExtKt.m66594y(textView);
            int i11 = R$id.tvCustomLinkError;
            int i12 = R$string.share_link_not_empty;
            baseViewHolder.setText(i11, i12);
            ToastCompat.m66437C(i12);
            view.setBackgroundResource(R$drawable.share_shape_invite_link_input_error_bg);
            return Unit.INSTANCE;
        }
        if (!radioButton.isChecked() || StringsKt.trim((CharSequence) editText.getText().toString()).toString().length() <= 0 || ShareExtKt.m59853l(editText.getText().toString())) {
            Function1<? super String, Unit> function1 = shareDialogModifyIFragment.f49415q0;
            if (function1 != null) {
                if (radioButton.isChecked()) {
                    str = StringsKt.trim((CharSequence) editText.getText().toString()).toString();
                }
                function1.invoke(str);
            }
            shareDialogModifyIFragment.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
        ViewExtKt.m66594y(textView);
        int i13 = R$id.tvCustomLinkError;
        int i14 = R$string.share_link_paste;
        baseViewHolder.setText(i13, i14);
        ToastCompat.m66437C(i14);
        view.setBackgroundResource(R$drawable.share_shape_invite_link_input_error_bg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m59784E4(RadioButton radioButton, RadioButton radioButton2, View view, EditText editText) {
        radioButton.setChecked(false);
        radioButton2.setChecked(true);
        view.setBackgroundResource(R$drawable.share_shape_invite_link_input_selected_bg);
        editText.requestFocus();
        KeyboardUtils.m6041m(editText);
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m59785F4(RadioButton radioButton, RadioButton radioButton2, EditText editText, TextView textView, View view) {
        radioButton.setChecked(true);
        radioButton2.setChecked(false);
        editText.clearFocus();
        KeyboardUtils.m6034f(editText);
        ViewExtKt.m66577h(textView);
        view.setBackgroundResource(R$drawable.share_shape_invite_link_input_bg);
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m59796s4(ShareDialogModifyIFragment shareDialogModifyIFragment, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        shareDialogModifyIFragment.m59803v4(viewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m59802z4(RadioButton radioButton, RadioButton radioButton2, View view, EditText editText, View view2, boolean z11) {
        if (z11) {
            m59784E4(radioButton, radioButton2, view, editText);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m59803v4(final BaseViewHolder baseViewHolder) {
        final RadioButton radioButton;
        final EditText editText;
        final TextView textView;
        final View view;
        View view2;
        View view3;
        final ShareDialogModifyIFragment shareDialogModifyIFragment;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("default_link") : null;
        if (string == null) {
            string = "";
        }
        final String str = string;
        final RadioButton radioButton2 = (RadioButton) baseViewHolder.getView(R$id.rbDefaultLink);
        if (radioButton2 == null || (radioButton = (RadioButton) baseViewHolder.getView(R$id.rbCustomLink)) == null || (editText = (EditText) baseViewHolder.getView(R$id.etCustomLink)) == null || (textView = (TextView) baseViewHolder.getView(R$id.tvCustomLinkError)) == null || (view = baseViewHolder.getView(R$id.layoutCustomLink)) == null || (view2 = baseViewHolder.getView(R$id.tvPaste)) == null || (view3 = baseViewHolder.getView(R$id.ivClearCustomLink)) == null) {
            return;
        }
        baseViewHolder.setText(R$id.tvDefaultLink, str);
        radioButton2.setChecked(true);
        C27046k.m66711z(radioButton2, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogModifyIFragment.m59799w4(radioButton2, radioButton, editText, textView, view);
            }
        }, 1, null);
        C27046k.m66711z(radioButton, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogModifyIFragment.m59800x4(radioButton2, radioButton, view, editText);
            }
        }, 1, null);
        C27046k.m66711z(editText, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogModifyIFragment.m59801y4(radioButton2, radioButton, view, editText);
            }
        }, 1, null);
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.share.lib.shareui.d0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z11) {
                ShareDialogModifyIFragment.m59802z4(radioButton2, radioButton, view, editText, view4, z11);
            }
        });
        editText.addTextChangedListener(new C24578a(textView, view, radioButton, editText, view2, view3));
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogModifyIFragment.m59780A4(editText, radioButton2, radioButton, view);
            }
        }, 1, null);
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogModifyIFragment.m59781B4(editText);
            }
        }, 1, null);
        View view4 = baseViewHolder.getView(R$id.ivClose);
        if (view4 != null) {
            shareDialogModifyIFragment = this;
            C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareDialogModifyIFragment.m59782C4(this.f49458b);
                }
            }, 1, null);
        } else {
            shareDialogModifyIFragment = this;
        }
        View view5 = baseViewHolder.getView(R$id.btnConfirm);
        if (view5 != null) {
            C27046k.m66711z(view5, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.h0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareDialogModifyIFragment.m59783D4(radioButton, editText, textView, baseViewHolder, view, shareDialogModifyIFragment, str);
                }
            }, 1, null);
        }
        m59785F4(radioButton2, radioButton, editText, textView, view);
        m59786G4(editText, view2, view3);
    }

    public ShareDialogModifyIFragment() {
        m54237f4(new Function2() { // from class: com.kubi.share.lib.shareui.z
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShareDialogModifyIFragment.m59796s4(this.f49505b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m59780A4(EditText editText, RadioButton radioButton, RadioButton radioButton2, View view) {
        String string;
        String string2;
        CharSequence charSequenceM66749e = C27057k.m66749e();
        if (charSequenceM66749e != null && (string2 = charSequenceM66749e.toString()) != null) {
            string = StringsKt.trim((CharSequence) string2).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return Unit.INSTANCE;
        }
        m59784E4(radioButton, radioButton2, view, editText);
        editText.requestFocus();
        editText.setText(string);
        editText.setSelection(editText.getText().length());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m59781B4(EditText editText) {
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m59782C4(ShareDialogModifyIFragment shareDialogModifyIFragment) {
        shareDialogModifyIFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m59786G4(EditText editText, View view, View view2) {
        Editable text = editText.getText();
        if (text != null && text.length() > 0) {
            ViewExtKt.m66577h(view);
            ViewExtKt.m66594y(view2);
        } else {
            ViewExtKt.m66594y(view);
            ViewExtKt.m66577h(view2);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m59799w4(RadioButton radioButton, RadioButton radioButton2, EditText editText, TextView textView, View view) {
        m59785F4(radioButton, radioButton2, editText, textView, view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m59800x4(RadioButton radioButton, RadioButton radioButton2, View view, EditText editText) {
        m59784E4(radioButton, radioButton2, view, editText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m59801y4(RadioButton radioButton, RadioButton radioButton2, View view, EditText editText) {
        m59784E4(radioButton, radioButton2, view, editText);
        return Unit.INSTANCE;
    }
}
