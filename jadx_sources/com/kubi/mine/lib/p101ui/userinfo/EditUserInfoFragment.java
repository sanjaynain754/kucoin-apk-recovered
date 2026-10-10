package com.kubi.mine.lib.p101ui.userinfo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.material.textfield.TextInputEditText;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mine.R$color;
import com.kubi.mine.R$drawable;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.entity.QueryAuditInfoResponse;
import com.kubi.mine.lib.entity.UserCommitAuditResponse;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.mine.lib.view.AvatarStatus;
import com.kubi.mine.lib.view.UploadAvatarImageView;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37987h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: EditUserInfoFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0015H\u0014J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0015H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0012\u0010)\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020+H\u0002J\u001c\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130-2\u0006\u0010.\u001a\u00020\u0006H\u0002J\u0010\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0006H\u0002J\b\u00101\u001a\u00020\u0015H\u0002J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020+H\u0002J\b\u0010=\u001a\u00020\u0015H\u0002J\u0010\u0010>\u001a\u00020\u00152\u0006\u0010?\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006A"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIState;", "<init>", "()V", "lastNickname", "", "binding", "Lcom/kubi/mine/databinding/FragmentEditUserInfoBinding;", "getBinding", "()Lcom/kubi/mine/databinding/FragmentEditUserInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "disableScrollCapture", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "initViews", "initAvatarView", "initUpdateNicknameView", "initSaveButton", "checkSaveButtonEnable", "isImageChanged", "", "getLimitedTextAndLength", "Lkotlin/Pair;", "text", "uploadAvatarImage", "realPath", "pickPhoto", "goToAppDetail", "context", "Landroidx/fragment/app/FragmentActivity;", "handleAuditUserInfo", "queryAuditUserInfo", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$QueryAuditUserInfoEvent;", "handleCommitAuditUserInfo", "commitAuditUserInfo", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$CommitAuditUserInfoEvent;", "refreshNicknameEnabledState", "canAuditNickname", "showRetryQueryUserInfoDialog", "gotoCropActivity", "selectedImagePath", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditUserInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditUserInfoFragment.kt\ncom/kubi/mine/lib/ui/userinfo/EditUserInfoFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,441:1\n147#2,16:442\n153#3,7:458\n58#4,23:465\n93#4,3:488\n*S KotlinDebug\n*F\n+ 1 EditUserInfoFragment.kt\ncom/kubi/mine/lib/ui/userinfo/EditUserInfoFragment\n*L\n62#1:442,16\n113#1:458,7\n153#1:465,23\n153#1:488,3\n*E\n"})
public final class EditUserInfoFragment extends SimpleStateFragment<EditUserInfoContract$UIState> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public String f35373U = "";

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f35374V = C45681e.m100799e(this, new Function1<EditUserInfoFragment, C37987h>() { // from class: com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37987h invoke(@NotNull EditUserInfoFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37987h.m85849a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37987h, Unit>() { // from class: com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37987h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37987h c37987h) {
            invoke(c37987h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f35372X = {Reflection.property1(new PropertyReference1Impl(EditUserInfoFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/FragmentEditUserInfoBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f35371W = new Companion(null);

    /* JADX INFO: compiled from: EditUserInfoFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoFragment$Companion;", "", "<init>", "()V", "TAG", "", "MAX_NICKNAME_LENGTH", "", "PICK_IMAGE_REQUEST_CODE", "CROP_REQUEST_CODE", "PICK_IMAGE_MAX_COUNT", "SELECT_IMAGE_PATH", "CROPPED_IMAGE_PATH", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$a */
    /* JADX INFO: compiled from: TextView.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 EditUserInfoFragment.kt\ncom/kubi/mine/lib/ui/userinfo/EditUserInfoFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n154#2,9:98\n71#3:107\n77#4:108\n*E\n"})
    public static final class C19156a implements TextWatcher {
        public C19156a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            C27100x0.m66924e(new C19157b(s11, EditUserInfoFragment.this));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$b */
    /* JADX INFO: compiled from: EditUserInfoFragment.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19157b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Editable f35376b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EditUserInfoFragment f35377c;

        public C19157b(Editable editable, EditUserInfoFragment editUserInfoFragment) {
            this.f35376b = editable;
            this.f35377c = editUserInfoFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m42321a() {
            ImageView imageView;
            int length = String.valueOf(this.f35376b).length();
            C37987h c37987hM42318x3 = this.f35377c.m42318x3();
            if (c37987hM42318x3 != null && (imageView = c37987hM42318x3.f85472f) != null) {
                imageView.setVisibility(length > 0 ? 0 : 8);
            }
            EditUserInfoFragment.m42306v3(this.f35377c, false, 1, null);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m42321a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.EditUserInfoFragment$c */
    /* JADX INFO: compiled from: EditUserInfoFragment.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J*\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"com/kubi/mine/lib/ui/userinfo/EditUserInfoFragment$initUpdateNicknameView$2", "Landroid/text/TextWatcher;", "isEditing", "", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19159c implements TextWatcher {

        /* JADX INFO: renamed from: b */
        public boolean f35378b;

        public C19159c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            String string;
            BaseTextView baseTextView;
            TextInputEditText textInputEditText;
            TextInputEditText textInputEditText2;
            if (this.f35378b) {
                return;
            }
            if (s11 == null || (string = s11.toString()) == null) {
                string = "";
            }
            Pair pairM42319y3 = EditUserInfoFragment.this.m42319y3(string);
            String str = (String) pairM42319y3.component1();
            int iIntValue = ((Number) pairM42319y3.component2()).intValue();
            if (!Intrinsics.areEqual(string, str)) {
                this.f35378b = true;
                C37987h c37987hM42318x3 = EditUserInfoFragment.this.m42318x3();
                if (c37987hM42318x3 != null && (textInputEditText2 = c37987hM42318x3.f85470d) != null) {
                    textInputEditText2.setText(str);
                }
                C37987h c37987hM42318x4 = EditUserInfoFragment.this.m42318x3();
                if (c37987hM42318x4 != null && (textInputEditText = c37987hM42318x4.f85470d) != null) {
                    textInputEditText.setSelection(str.length());
                }
                this.f35378b = false;
            }
            C37987h c37987hM42318x5 = EditUserInfoFragment.this.m42318x3();
            if (c37987hM42318x5 == null || (baseTextView = c37987hM42318x5.f85475i) == null) {
                return;
            }
            baseTextView.setText(iIntValue + "/24");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: B3 */
    public final void m42308B3(C19164c c19164c) {
        C37987h c37987hM42318x3;
        BaseTextView baseTextView;
        TextInputEditText textInputEditText;
        C37987h c37987hM42318x4;
        BaseTextView baseTextView2;
        C37987h c37987hM42318x5;
        UploadAvatarImageView uploadAvatarImageView;
        C37987h c37987hM42318x6;
        UploadAvatarImageView uploadAvatarImageView2;
        BaseFragment.hideLoadingDialog$default(this, false, 1, null);
        if (c19164c.getF35382a()) {
            MineDepend.f35159a.m41832k();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        UserCommitAuditResponse f35383b = c19164c.getF35383b();
        String avatar = f35383b.getAvatar();
        if (avatar != null && avatar.length() != 0 && (c37987hM42318x6 = m42318x3()) != null && (uploadAvatarImageView2 = c37987hM42318x6.f85468b) != null) {
            UploadAvatarImageView.m42365m(uploadAvatarImageView2, f35383b.getAvatar(), false, false, 6, null);
        }
        if (f35383b.getCanAuditAvatar() != null && (c37987hM42318x5 = m42318x3()) != null && (uploadAvatarImageView = c37987hM42318x5.f85468b) != null) {
            uploadAvatarImageView.setAvatarStatus(Intrinsics.areEqual(f35383b.getCanAuditAvatar(), Boolean.TRUE) ? AvatarStatus.EDITABLE : AvatarStatus.LOCKED);
        }
        String avatarLimitMsg = f35383b.getAvatarLimitMsg();
        if (avatarLimitMsg != null && avatarLimitMsg.length() != 0 && (c37987hM42318x4 = m42318x3()) != null && (baseTextView2 = c37987hM42318x4.f85474h) != null) {
            baseTextView2.setText(f35383b.getAvatarLimitMsg());
        }
        String nickName = f35383b.getNickName();
        if (nickName != null && nickName.length() != 0) {
            this.f35373U = String.valueOf(f35383b.getNickName());
            C37987h c37987hM42318x7 = m42318x3();
            if (c37987hM42318x7 != null && (textInputEditText = c37987hM42318x7.f85470d) != null) {
                textInputEditText.setText(this.f35373U);
            }
        }
        if (f35383b.getCanAuditNickname() != null) {
            m42313K3(Intrinsics.areEqual(f35383b.getCanAuditNickname(), Boolean.TRUE));
        }
        String nickNameLimitMsg = f35383b.getNickNameLimitMsg();
        if (nickNameLimitMsg != null && nickNameLimitMsg.length() != 0 && (c37987hM42318x3 = m42318x3()) != null && (baseTextView = c37987hM42318x3.f85476j) != null) {
            baseTextView.setText(f35383b.getNickNameLimitMsg());
        }
        String f35384c = c19164c.getF35384c();
        if (f35384c != null && f35384c.length() != 0) {
            ToastCompat.m66441G(c19164c.getF35384c(), new Object[0]);
        }
        m42306v3(this, false, 1, null);
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m42296M3(EditUserInfoFragment editUserInfoFragment, DialogInterface dialogInterface, int i11) {
        editUserInfoFragment.sendIntent(new EditUserInfoContract$UIIntent.QueryAuditUserInfoIntent());
    }

    /* JADX INFO: renamed from: v3 */
    public static /* synthetic */ void m42306v3(EditUserInfoFragment editUserInfoFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        editUserInfoFragment.m42316u3(z11);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m42312J3() {
        ImagePickerHelper.m58397f(this, 1, 1001, null, 8, null);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m42314L3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_error).m54152I4(false).m54167X4(R$string.notice_prompt).m54169Z4(true).m54173d5(false).m54153J4(R$string.common_text_network_error).m54157N4(true).m54151H4(false).m54161R4(1).m54162S4(R$string.empty_click_retry, new DialogInterface.OnClickListener() { // from class: com.kubi.mine.lib.ui.userinfo.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                EditUserInfoFragment.m42296M3(this.f35388b, dialogInterface, i11);
            }
        }).m54159P4(R$string.exit, new DialogInterface.OnClickListener() { // from class: com.kubi.mine.lib.ui.userinfo.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                EditUserInfoFragment.m42297N3(this.f35389b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C19165d) {
            m42307A3((C19165d) singleEvent);
        } else if (singleEvent instanceof C19164c) {
            m42308B3((C19164c) singleEvent);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_edit_user_info;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<EditUserInfoVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(EditUserInfoVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m42317w3(view);
        m42295I3();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m42317w3(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            view.setScrollCaptureHint(5);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final C37987h m42318x3() {
        return (C37987h) this.f35374V.getValue(this, f35372X[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final void m42320z3(String str) {
        Intent intent = new Intent(getContext(), (Class<?>) AvatarCropActivity.class);
        intent.putExtra("select_image_path", str);
        startActivityForResult(intent, 1002);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX INFO: renamed from: D3 */
    public static final Unit m42292D3(EditUserInfoFragment editUserInfoFragment) {
        boolean zAreEqual;
        boolean z11;
        String string;
        BaseTextView baseTextView;
        CharSequence text;
        UploadAvatarImageView uploadAvatarImageView;
        UploadAvatarImageView uploadAvatarImageView2;
        C37987h c37987hM42318x3 = editUserInfoFragment.m42318x3();
        if (c37987hM42318x3 != null && (uploadAvatarImageView2 = c37987hM42318x3.f85468b) != null) {
            zAreEqual = Intrinsics.areEqual(uploadAvatarImageView2.getF35452e(), Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        C37987h c37987hM42318x4 = editUserInfoFragment.m42318x3();
        if (c37987hM42318x4 != null && (uploadAvatarImageView = c37987hM42318x4.f85468b) != null) {
            z11 = true;
            if (!uploadAvatarImageView.getF35453f()) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (zAreEqual && z11) {
            editUserInfoFragment.m42312J3();
        } else if (!zAreEqual) {
            C37987h c37987hM42318x5 = editUserInfoFragment.m42318x3();
            if (c37987hM42318x5 != null && (baseTextView = c37987hM42318x5.f85474h) != null && (text = baseTextView.getText()) != null) {
                string = text.toString();
            } else {
                string = null;
            }
            ToastCompat.m66441G(string, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m42293F3(EditUserInfoFragment editUserInfoFragment) {
        boolean zAreEqual;
        String strM66668h;
        String string;
        TextInputEditText textInputEditText;
        Editable text;
        String string2;
        TextInputEditText textInputEditText2;
        Editable text2;
        String string3;
        TextInputEditText textInputEditText3;
        String f35451d;
        UploadAvatarImageView uploadAvatarImageView;
        UploadAvatarImageView uploadAvatarImageView2;
        C37987h c37987hM42318x3 = editUserInfoFragment.m42318x3();
        boolean z11 = false;
        if (c37987hM42318x3 != null && (uploadAvatarImageView2 = c37987hM42318x3.f85468b) != null) {
            zAreEqual = Intrinsics.areEqual(uploadAvatarImageView2.getF35452e(), Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        String string4 = null;
        if (zAreEqual) {
            C37987h c37987hM42318x4 = editUserInfoFragment.m42318x3();
            if (c37987hM42318x4 != null && (uploadAvatarImageView = c37987hM42318x4.f85468b) != null) {
                f35451d = uploadAvatarImageView.getF35451d();
            } else {
                f35451d = null;
            }
            strM66668h = C27041f.m66668h(f35451d);
        } else {
            strM66668h = null;
        }
        C37987h c37987hM42318x5 = editUserInfoFragment.m42318x3();
        if (c37987hM42318x5 != null && (textInputEditText3 = c37987hM42318x5.f85470d) != null && textInputEditText3.isEnabled()) {
            z11 = true;
        }
        C37987h c37987hM42318x6 = editUserInfoFragment.m42318x3();
        if (c37987hM42318x6 != null && (textInputEditText2 = c37987hM42318x6.f85470d) != null && (text2 = textInputEditText2.getText()) != null && (string3 = text2.toString()) != null) {
            string = StringsKt.trim((CharSequence) string3).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        boolean zAreEqual2 = Intrinsics.areEqual(string, editUserInfoFragment.f35373U);
        if (z11 && !zAreEqual2) {
            C37987h c37987hM42318x7 = editUserInfoFragment.m42318x3();
            if (c37987hM42318x7 != null && (textInputEditText = c37987hM42318x7.f85470d) != null && (text = textInputEditText.getText()) != null && (string2 = text.toString()) != null) {
                string4 = StringsKt.trim((CharSequence) string2).toString();
            }
            if (string4 == null) {
                string4 = "";
            }
        }
        editUserInfoFragment.sendIntent(new EditUserInfoContract$UIIntent.CommitAuditUserInfoIntent(strM66668h, string4));
        editUserInfoFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m42294H3(EditUserInfoFragment editUserInfoFragment) {
        TextInputEditText textInputEditText;
        C37987h c37987hM42318x3 = editUserInfoFragment.m42318x3();
        if (c37987hM42318x3 != null && (textInputEditText = c37987hM42318x3.f85470d) != null) {
            textInputEditText.setText("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    private final void m42295I3() {
        m42309C3();
        m42311G3();
        m42310E3();
        sendIntent(new EditUserInfoContract$UIIntent.QueryAuditUserInfoIntent());
    }

    /* JADX INFO: renamed from: N3 */
    public static final void m42297N3(EditUserInfoFragment editUserInfoFragment, DialogInterface dialogInterface, int i11) {
        FragmentActivity activity = editUserInfoFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m42307A3(C19165d c19165d) {
        C37987h c37987hM42318x3;
        BaseTextView baseTextView;
        C37987h c37987hM42318x4;
        BaseTextView baseTextView2;
        TextInputEditText textInputEditText;
        UploadAvatarImageView uploadAvatarImageView;
        AvatarStatus avatarStatus;
        UploadAvatarImageView uploadAvatarImageView2;
        if (c19165d.getF35385a()) {
            QueryAuditInfoResponse f35386b = c19165d.getF35386b();
            C37987h c37987hM42318x5 = m42318x3();
            if (c37987hM42318x5 != null && (uploadAvatarImageView2 = c37987hM42318x5.f85468b) != null) {
                String avatar = f35386b.getAvatar();
                if (avatar == null) {
                    avatar = MineDepend.f35159a.m41826e().getAvatar();
                }
                UploadAvatarImageView.m42365m(uploadAvatarImageView2, avatar, false, false, 6, null);
            }
            C37987h c37987hM42318x6 = m42318x3();
            if (c37987hM42318x6 != null && (uploadAvatarImageView = c37987hM42318x6.f85468b) != null) {
                if (Intrinsics.areEqual(f35386b.getCanAuditAvatar(), Boolean.TRUE)) {
                    avatarStatus = AvatarStatus.EDITABLE;
                } else {
                    avatarStatus = AvatarStatus.LOCKED;
                }
                uploadAvatarImageView.setAvatarStatus(avatarStatus);
            }
            String nickName = f35386b.getNickName();
            if (nickName == null) {
                nickName = MineDepend.f35159a.m41826e().getNicknameShow();
            }
            this.f35373U = String.valueOf(nickName);
            C37987h c37987hM42318x7 = m42318x3();
            if (c37987hM42318x7 != null && (textInputEditText = c37987hM42318x7.f85470d) != null) {
                textInputEditText.setText(this.f35373U);
            }
            m42313K3(Intrinsics.areEqual(f35386b.getCanAuditNickname(), Boolean.TRUE));
            String avatarLimitMsg = f35386b.getAvatarLimitMsg();
            if (avatarLimitMsg != null && avatarLimitMsg.length() != 0 && (c37987hM42318x4 = m42318x3()) != null && (baseTextView2 = c37987hM42318x4.f85474h) != null) {
                baseTextView2.setText(f35386b.getAvatarLimitMsg());
            }
            String nickNameLimitMsg = f35386b.getNickNameLimitMsg();
            if (nickNameLimitMsg != null && nickNameLimitMsg.length() != 0 && (c37987hM42318x3 = m42318x3()) != null && (baseTextView = c37987hM42318x3.f85476j) != null) {
                baseTextView.setText(f35386b.getNickNameLimitMsg());
            }
            m42306v3(this, false, 1, null);
            return;
        }
        m42314L3();
    }

    /* JADX INFO: renamed from: C3 */
    public final void m42309C3() {
        UploadAvatarImageView uploadAvatarImageView;
        C37987h c37987hM42318x3 = m42318x3();
        if (c37987hM42318x3 != null && (uploadAvatarImageView = c37987hM42318x3.f85468b) != null) {
            C27046k.m66711z(uploadAvatarImageView, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.userinfo.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditUserInfoFragment.m42292D3(this.f35387b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final void m42310E3() {
        KcPrimaryButton kcPrimaryButton;
        C37987h c37987hM42318x3 = m42318x3();
        if (c37987hM42318x3 != null && (kcPrimaryButton = c37987hM42318x3.f85469c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.userinfo.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditUserInfoFragment.m42293F3(this.f35391b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final void m42311G3() {
        ImageView imageView;
        TextInputEditText textInputEditText;
        TextInputEditText textInputEditText2;
        C37987h c37987hM42318x3 = m42318x3();
        if (c37987hM42318x3 != null && (textInputEditText2 = c37987hM42318x3.f85470d) != null) {
            textInputEditText2.addTextChangedListener(new C19156a());
        }
        C37987h c37987hM42318x4 = m42318x3();
        if (c37987hM42318x4 != null && (textInputEditText = c37987hM42318x4.f85470d) != null) {
            textInputEditText.addTextChangedListener(new C19159c());
        }
        C37987h c37987hM42318x5 = m42318x3();
        if (c37987hM42318x5 != null && (imageView = c37987hM42318x5.f85472f) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.userinfo.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditUserInfoFragment.m42294H3(this.f35390b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public final void m42313K3(boolean z11) {
        ImageView imageView;
        int i11;
        TextInputEditText textInputEditText;
        int i12;
        TextInputEditText textInputEditText2;
        KcTextInputLayout kcTextInputLayout;
        int i13;
        KcTextInputLayout kcTextInputLayout2;
        BaseTextView baseTextView;
        int i14;
        C37987h c37987hM42318x3 = m42318x3();
        if (c37987hM42318x3 != null && (baseTextView = c37987hM42318x3.f85477k) != null) {
            C27017c c27017c = C27017c.f54310a;
            if (z11) {
                i14 = R$color.c_text;
            } else {
                i14 = R$color.c_text40;
            }
            baseTextView.setTextColor(c27017c.m66512a(i14));
        }
        C37987h c37987hM42318x4 = m42318x3();
        if (c37987hM42318x4 != null && (kcTextInputLayout2 = c37987hM42318x4.f85473g) != null) {
            kcTextInputLayout2.setEnabled(z11);
        }
        C37987h c37987hM42318x5 = m42318x3();
        if (c37987hM42318x5 != null && (kcTextInputLayout = c37987hM42318x5.f85473g) != null) {
            C27017c c27017c2 = C27017c.f54310a;
            if (z11) {
                i13 = R$color.c_overlay;
            } else {
                i13 = R$color.c_cover2;
            }
            kcTextInputLayout.setBoxBackgroundColor(c27017c2.m66512a(i13));
        }
        C37987h c37987hM42318x6 = m42318x3();
        if (c37987hM42318x6 != null && (textInputEditText2 = c37987hM42318x6.f85470d) != null) {
            textInputEditText2.setEnabled(z11);
        }
        C37987h c37987hM42318x7 = m42318x3();
        if (c37987hM42318x7 != null && (textInputEditText = c37987hM42318x7.f85470d) != null) {
            C27017c c27017c3 = C27017c.f54310a;
            if (z11) {
                i12 = R$color.c_text;
            } else {
                i12 = R$color.c_text40;
            }
            textInputEditText.setTextColor(c27017c3.m66512a(i12));
        }
        C37987h c37987hM42318x8 = m42318x3();
        if (c37987hM42318x8 != null && (imageView = c37987hM42318x8.f85472f) != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m42315O3(String str) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new EditUserInfoFragment$uploadAvatarImage$1(str, this, null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "event_update_avatar_image".length();
        }
        C12572a.m23692a(this, false, new C19158x3bef7ec2("event_update_avatar_image", null, this));
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 1001 && resultCode == -1) {
            String strM66668h = C27041f.m66668h(ImagePickerHelper.m58392a(data));
            if (strM66668h.length() > 0) {
                m42320z3(strM66668h);
            }
            C44128b.m97259c("EditUserAvatarFragment", "selected image path: " + strM66668h);
        }
        if (data != null && requestCode == 1002 && resultCode == -1) {
            String strM66668h2 = C27041f.m66668h(data.getStringExtra("cropped_image_path"));
            if (strM66668h2.length() > 0) {
                m42315O3(strM66668h2);
            }
            C44128b.m97259c("EditUserAvatarFragment", "cropped image path: " + strM66668h2);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m42316u3(boolean z11) {
        String string;
        boolean z12;
        boolean z13;
        boolean zAreEqual;
        boolean z14;
        KcPrimaryButton kcPrimaryButton;
        UploadAvatarImageView uploadAvatarImageView;
        TextInputEditText textInputEditText;
        TextInputEditText textInputEditText2;
        Editable text;
        String string2;
        C37987h c37987hM42318x3 = m42318x3();
        if (c37987hM42318x3 != null && (textInputEditText2 = c37987hM42318x3.f85470d) != null && (text = textInputEditText2.getText()) != null && (string2 = text.toString()) != null) {
            string = StringsKt.trim((CharSequence) string2).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        boolean z15 = true;
        if (string.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean zAreEqual2 = Intrinsics.areEqual(string, this.f35373U);
        C37987h c37987hM42318x4 = m42318x3();
        if (c37987hM42318x4 != null && (textInputEditText = c37987hM42318x4.f85470d) != null && textInputEditText.isEnabled()) {
            z13 = true;
        } else {
            z13 = false;
        }
        C37987h c37987hM42318x5 = m42318x3();
        if (c37987hM42318x5 != null && (uploadAvatarImageView = c37987hM42318x5.f85468b) != null) {
            zAreEqual = Intrinsics.areEqual(uploadAvatarImageView.getF35452e(), Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        if (z12 && !zAreEqual2 && z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z11 || !zAreEqual) {
            z15 = false;
        }
        C37987h c37987hM42318x6 = m42318x3();
        if (c37987hM42318x6 != null && (kcPrimaryButton = c37987hM42318x6.f85469c) != null) {
            if (!z15) {
                z12 = z14;
            }
            kcPrimaryButton.setEnabled(z12);
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final Pair<String, Integer> m42319y3(String str) {
        int i11;
        int length = str.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if ((19968 <= cCharAt && cCharAt < 40960) || (12352 <= cCharAt && cCharAt < 12544)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            i12 += i11;
            if (i12 > 24) {
                break;
            }
            i13++;
        }
        String strSubstring = str.substring(0, i13);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new Pair<>(strSubstring, Integer.valueOf(Math.min(i12, 24)));
    }
}
