package com.kubi.kyc.ui.kycv2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.event.api.C12572a;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.ui.DialogHelper;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p205dn.C36884d;
import p569qq.C43852m;
import p852kotlin.Metadata;
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
import w00.C45681e;
import xb0.C46126b;

/* JADX INFO: compiled from: ImagePreviewFragment.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020'H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/ImagePreviewFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/kyc/ui/kycv2/ImagePreviewContract$UiIntent;", "Lcom/kubi/kyc/ui/kycv2/ImagePreviewContract$UIState;", "Lcom/kubi/kyc/ui/kycv2/ImagePreviewViewModel;", "<init>", "()V", "binding", "Lcom/kubi/kyc/databinding/BusercenterFragmemtImagePreviewBinding;", "getBinding", "()Lcom/kubi/kyc/databinding/BusercenterFragmemtImagePreviewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromGallery", "", "realPath", "", "frontPath", "backPhotoPath", "type", "direction", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayout", "initView", "loadImage", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "isPassport", "pickPhoto", BridgeParamKeyKt.MAX_COUNT, "goToAppDetail", "context", "Landroidx/fragment/app/FragmentActivity;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImagePreviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePreviewFragment.kt\ncom/kubi/kyc/ui/kycv2/ImagePreviewFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,337:1\n147#2,16:338\n*S KotlinDebug\n*F\n+ 1 ImagePreviewFragment.kt\ncom/kubi/kyc/ui/kycv2/ImagePreviewFragment\n*L\n44#1:338,16\n*E\n"})
public final class ImagePreviewFragment extends BaseStateFragment<Object, UIState, ImagePreviewViewModel> {

    /* JADX INFO: renamed from: V */
    public boolean f31418V;

    /* JADX INFO: renamed from: a0 */
    public int f31423a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f31416c0 = {Reflection.property1(new PropertyReference1Impl(ImagePreviewFragment.class, "binding", "getBinding()Lcom/kubi/kyc/databinding/BusercenterFragmemtImagePreviewBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f31415b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f31417U = C45681e.m100799e(this, new Function1<ImagePreviewFragment, C36884d>() { // from class: com.kubi.kyc.ui.kycv2.ImagePreviewFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36884d invoke(@NotNull ImagePreviewFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36884d.m82637a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36884d, Unit>() { // from class: com.kubi.kyc.ui.kycv2.ImagePreviewFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36884d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36884d c36884d) {
            invoke(c36884d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f31419W = "";

    /* JADX INFO: renamed from: X */
    @NotNull
    public String f31420X = "";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f31421Y = "";

    /* JADX INFO: renamed from: Z */
    @NotNull
    public String f31422Z = "";

    /* JADX INFO: compiled from: ImagePreviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/ImagePreviewFragment$Companion;", "", "<init>", "()V", "PASSPORT", "", "newInstance", "Lcom/kubi/kyc/ui/kycv2/ImagePreviewFragment;", "frontPath", "backPhotoPath", "type", "fromGallery", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/kyc/ui/kycv2/ImagePreviewFragment;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ImagePreviewFragment newInstance(@Nullable String frontPath, @Nullable String backPhotoPath, @Nullable String type, @Nullable Boolean fromGallery) {
            ImagePreviewFragment imagePreviewFragment = new ImagePreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("frontPath", frontPath);
            bundle.putString("backPhotoPath", backPhotoPath);
            bundle.putString("type", type);
            bundle.putBoolean("fromGallery", C27025c.m66566d(fromGallery));
            imagePreviewFragment.setArguments(bundle);
            return imagePreviewFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.ImagePreviewFragment$a */
    /* JADX INFO: compiled from: ImagePreviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kyc/ui/kycv2/ImagePreviewFragment$initView$3$1", "Lcom/kubi/kyc/ui/kycv2/UploadImageView3$OnLoadListener;", "onComplete", "", "path", "", "onFailed", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17183a implements UploadImageView3.InterfaceC17185a {
        public C17183a() {
        }

        @Override // com.kubi.kyc.ui.kycv2.UploadImageView3.InterfaceC17185a
        /* JADX INFO: renamed from: a */
        public void mo37146a(String str) {
            ImagePreviewFragment.this.hideDialogLoading();
            ImagePreviewFragment.this.showContent();
        }

        @Override // com.kubi.kyc.ui.kycv2.UploadImageView3.InterfaceC17185a
        /* JADX INFO: renamed from: b */
        public void mo37147b(String str) throws JSONException {
            UploadImageView3 uploadImageView3;
            if (ImagePreviewFragment.this.getView() == null || ImagePreviewFragment.this.isDetached() || ImagePreviewFragment.this.isRemoving()) {
                return;
            }
            ImagePreviewFragment.this.hideDialogLoading();
            C36884d c36884dM37142B3 = ImagePreviewFragment.this.m37142B3();
            if (c36884dM37142B3 == null || (uploadImageView3 = c36884dM37142B3.f81447c) == null) {
                return;
            }
            if (ImagePreviewFragment.this.f31418V) {
                if (ImagePreviewFragment.this.f31423a0 != 0) {
                    C12572a.m23695d("com.kubi.kyc.event.KycEvent:lego_event", new ImagePreviewActivity.PhotoInfo(ImagePreviewFragment.this.f31420X, uploadImageView3.getF31432c(), Boolean.TRUE, "KUCOIN"), 0L, 4, null);
                    C12572a.m23695d("activity_finish", null, 0L, 6, null);
                    KycBridgeManager.m37155O(KycBridgeManager.f31425a, "finish_get_photo", "success_get_photo", null, "kucoin_album", ConstantsKt.FACE_CAPTURE_MODE_BACK, ImagePreviewFragment.this.f31422Z, null, 68, null);
                    return;
                } else if (!TextUtils.equals(ImagePreviewFragment.this.f31422Z, "passport")) {
                    ImagePreviewFragment.this.f31420X = String.valueOf(uploadImageView3.getF31432c());
                    ImagePreviewFragment.this.m37145I3(1, 1);
                    return;
                } else {
                    C12572a.m23695d("com.kubi.kyc.event.KycEvent:lego_event", new ImagePreviewActivity.PhotoInfo(uploadImageView3.getF31432c(), uploadImageView3.getF31432c(), Boolean.TRUE, "KUCOIN"), 0L, 4, null);
                    C12572a.m23695d("activity_finish", null, 0L, 6, null);
                    KycBridgeManager.m37155O(KycBridgeManager.f31425a, "finish_get_photo", "success_get_photo", null, "kucoin_album", ConstantsKt.FACE_CAPTURE_MODE_FRONT, ImagePreviewFragment.this.f31422Z, null, 68, null);
                    return;
                }
            }
            if (ImagePreviewFragment.this.f31423a0 != 0) {
                C12572a.m23695d("com.kubi.kyc.event.KycEvent:lego_event", new ImagePreviewActivity.PhotoInfo(ImagePreviewFragment.this.f31420X, uploadImageView3.getF31432c(), Boolean.TRUE, "KUCOIN"), 0L, 4, null);
                C12572a.m23695d("activity_finish", null, 0L, 6, null);
                KycBridgeManager.m37155O(KycBridgeManager.f31425a, "finish_get_photo", "success_get_photo", null, "kucoin_camera", ConstantsKt.FACE_CAPTURE_MODE_BACK, ImagePreviewFragment.this.f31422Z, null, 68, null);
            } else if (TextUtils.equals(ImagePreviewFragment.this.f31422Z, "passport")) {
                C12572a.m23695d("com.kubi.kyc.event.KycEvent:lego_event", new ImagePreviewActivity.PhotoInfo(uploadImageView3.getF31432c(), uploadImageView3.getF31432c(), Boolean.TRUE, "KUCOIN"), 0L, 4, null);
                KycBridgeManager.m37155O(KycBridgeManager.f31425a, "finish_get_photo", "success_get_photo", null, "kucoin_camera", ConstantsKt.FACE_CAPTURE_MODE_FRONT, ImagePreviewFragment.this.f31422Z, null, 68, null);
                C12572a.m23695d("activity_finish", null, 0L, 6, null);
            } else {
                Context context = ImagePreviewFragment.this.getContext();
                if (context != null) {
                    KycBridgeManager.m37172x(KycBridgeManager.f31425a, context, uploadImageView3.getF31432c(), null, null, 12, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C3 */
    private final void m37120C3(FragmentActivity fragmentActivity) {
        String string = fragmentActivity.getString(R$string.camera_authorization_tips, fragmentActivity.getString(R$string.camera_storage_authorization));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogHelper.m37110d(fragmentActivity, string, supportFragmentManager, null, null, 24, null);
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m37124J3(ImagePreviewFragment imagePreviewFragment, int i11, int i12, FragmentActivity fragmentActivity, boolean z11) {
        if (z11) {
            ImagePickerHelper.m58397f(imagePreviewFragment, i11, i12, null, 8, null);
        } else {
            imagePreviewFragment.m37120C3(fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final C36884d m37142B3() {
        return (C36884d) this.f31417U.getValue(this, f31416c0[0]);
    }

    /* JADX INFO: renamed from: G3 */
    public final boolean m37143G3() {
        return TextUtils.equals(this.f31422Z, "passport");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.busercenter_fragmemt_image_preview;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<ImagePreviewViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ImagePreviewViewModel.class);
    }

    public ImagePreviewFragment() {
        setPageId("B1KYC2IDPhotoCheck");
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m37121D3(ImagePreviewFragment imagePreviewFragment, String str) {
        C43852m.m96589a(C27041f.m66668h(imagePreviewFragment.getF26355e0()), "Retake", "1", new JSONObject().put("photo_side", str));
        if (imagePreviewFragment.f31418V) {
            imagePreviewFragment.m37145I3(1, 1);
        } else {
            FragmentActivity activity = imagePreviewFragment.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m37122E3(ImagePreviewFragment imagePreviewFragment, String str) {
        C43852m.m96589a(C27041f.m66668h(imagePreviewFragment.getF26355e0()), "Back", "1", new JSONObject().put("photo_side", str));
        FragmentActivity activity = imagePreviewFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m37123F3(ImagePreviewFragment imagePreviewFragment, String str) {
        UploadImageView3 uploadImageView3;
        imagePreviewFragment.showDialogLoading();
        C43852m.m96589a(C27041f.m66668h(imagePreviewFragment.getF26355e0()), "Confirm", "1", new JSONObject().put("photo_side", str));
        C36884d c36884dM37142B3 = imagePreviewFragment.m37142B3();
        if (c36884dM37142B3 != null && (uploadImageView3 = c36884dM37142B3.f81447c) != null) {
            uploadImageView3.m37195d(imagePreviewFragment.f31419W, 0, imagePreviewFragment.f31423a0, imagePreviewFragment.new C17183a());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m37125K3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m37126L3(ImagePreviewFragment imagePreviewFragment, FragmentActivity fragmentActivity, Throwable th2) {
        imagePreviewFragment.m37120C3(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m37127M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m37144H3() {
        String str;
        if (C24277v.m58537b(getContext()) && (str = this.f31419W) != null && str.length() != 0) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new ImagePreviewFragment$loadImage$1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m37145I3(final int i11, final int i12) {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(this), "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA");
            final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.kycv2.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImagePreviewFragment.m37124J3(this.f31437b, i11, i12, activity, ((Boolean) obj).booleanValue());
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.kyc.ui.kycv2.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ImagePreviewFragment.m37125K3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kyc.ui.kycv2.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImagePreviewFragment.m37126L3(this.f31450b, activity, (Throwable) obj);
                }
            };
            getDestroyDisposable().add(observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.kyc.ui.kycv2.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ImagePreviewFragment.m37127M3(function2, obj);
                }
            }));
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        TextView textView;
        TextView textView2;
        final String str;
        TextView textView3;
        ImageView imageView;
        TextView textView4;
        TextView textView5;
        super.initView();
        if (TextUtils.equals(this.f31422Z, "passport")) {
            if (!TextUtils.isEmpty(this.f31420X)) {
                C36884d c36884dM37142B3 = m37142B3();
                if (c36884dM37142B3 != null && (textView5 = c36884dM37142B3.f81452h) != null) {
                    textView5.setText(getString(R$string.kyc_passport_photo));
                }
                this.f31419W = this.f31420X;
                this.f31423a0 = 0;
            }
        } else if (TextUtils.isEmpty(this.f31421Y)) {
            C36884d c36884dM37142B4 = m37142B3();
            if (c36884dM37142B4 != null && (textView2 = c36884dM37142B4.f81452h) != null) {
                textView2.setText(getString(R$string.kyc_caputure_frontsure));
            }
            this.f31419W = this.f31420X;
            this.f31423a0 = 0;
        } else {
            C36884d c36884dM37142B5 = m37142B3();
            if (c36884dM37142B5 != null && (textView = c36884dM37142B5.f81452h) != null) {
                textView.setText(getString(R$string.kyc_caputure_backsure));
            }
            this.f31419W = this.f31421Y;
            this.f31423a0 = 1;
        }
        if (this.f31423a0 == 0) {
            str = ConstantsKt.FACE_CAPTURE_MODE_FRONT;
        } else {
            str = ConstantsKt.FACE_CAPTURE_MODE_BACK;
        }
        m37144H3();
        C36884d c36884dM37142B6 = m37142B3();
        if (c36884dM37142B6 != null && (textView4 = c36884dM37142B6.f81451g) != null) {
            C27046k.m66710y(textView4, 5000L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImagePreviewFragment.m37121D3(this.f31502b, str);
                }
            });
        }
        C36884d c36884dM37142B7 = m37142B3();
        if (c36884dM37142B7 != null && (imageView = c36884dM37142B7.f81446b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImagePreviewFragment.m37122E3(this.f31504b, str);
                }
            }, 1, null);
        }
        C36884d c36884dM37142B8 = m37142B3();
        if (c36884dM37142B8 != null && (textView3 = c36884dM37142B8.f81450f) != null) {
            C27046k.m66710y(textView3, 5000L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImagePreviewFragment.m37123F3(this.f31506b, str);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        FragmentActivity activity;
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null && this.f31420X.length() == 0 && this.f31418V && (activity = getActivity()) != null) {
            activity.finish();
        }
        if (data != null && resultCode == -1 && this.f31418V) {
            String strM66668h = C27041f.m66668h(ImagePickerHelper.m58392a(data));
            if (TextUtils.isEmpty(this.f31420X)) {
                this.f31420X = strM66668h;
                if (m37143G3()) {
                    C36884d c36884dM37142B3 = m37142B3();
                    if (c36884dM37142B3 != null && (textView3 = c36884dM37142B3.f81452h) != null) {
                        textView3.setText(getString(R$string.kyc_passport_photo));
                    }
                } else {
                    C36884d c36884dM37142B4 = m37142B3();
                    if (c36884dM37142B4 != null && (textView2 = c36884dM37142B4.f81452h) != null) {
                        textView2.setText(getString(R$string.kyc_caputure_frontsure));
                    }
                }
                this.f31419W = this.f31420X;
                this.f31423a0 = 0;
            } else {
                this.f31421Y = strM66668h;
                this.f31419W = strM66668h;
                C36884d c36884dM37142B5 = m37142B3();
                if (c36884dM37142B5 != null && (textView = c36884dM37142B5.f81452h) != null) {
                    textView.setText(getString(R$string.kyc_caputure_backsure));
                }
                this.f31423a0 = 1;
            }
            m37144H3();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Boolean boolValueOf = null;
        if (arguments != null) {
            string = arguments.getString("frontPath", "");
        } else {
            string = null;
        }
        this.f31420X = C27041f.m66668h(string);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("backPhotoPath", "");
        } else {
            string2 = null;
        }
        this.f31421Y = C27041f.m66668h(string2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string3 = arguments3.getString("type", "");
        } else {
            string3 = null;
        }
        this.f31422Z = C27041f.m66668h(string3);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            boolValueOf = Boolean.valueOf(arguments4.getBoolean("fromGallery"));
        }
        this.f31418V = C27025c.m66566d(boolValueOf);
        if (TextUtils.isEmpty(this.f31420X) && TextUtils.isEmpty(this.f31421Y) && this.f31418V) {
            m37145I3(1, 1);
        }
    }
}
