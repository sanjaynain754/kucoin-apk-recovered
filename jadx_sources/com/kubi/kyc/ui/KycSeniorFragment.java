package com.kubi.kyc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.DrawableRes;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.kyc.KycKey;
import com.kubi.kyc.R$color;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.R$id;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$mipmap;
import com.kubi.kyc.R$string;
import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.api.KycReasonEntity;
import com.kubi.kyc.entity.UserKycWayEntity;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.ImagePickerHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.InterfaceC27079p;
import com.kubi.utils.InterfaceC27083r;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.C27035i;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.web.api.IWebService;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import me.drakeet.multitype.Items;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p017an.C0384b;
import p017an.InterfaceC0383a;
import p205dn.C36885e;
import p435ln.C42242b;
import p435ln.C42247d0;
import p435ln.C42259j0;
import p435ln.C42262l;
import p435ln.C42274w;
import p435ln.InfoCell;
import p435ln.LabelCell;
import p435ln.TipCell;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44127a;
import ro.C44128b;
import w00.C45681e;
import xb0.C46126b;

/* JADX INFO: compiled from: KycSeniorFragment.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 c2\u00020\u0001:\u0003cdeB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00105\u001a\u000202H\u0014J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010<\u001a\u0002072\u0006\u0010=\u001a\u000202H\u0002J\u0010\u0010>\u001a\u0002072\u0006\u0010=\u001a\u000202H\u0002J\u0010\u0010?\u001a\u0002072\u0006\u0010=\u001a\u000202H\u0002J\b\u0010@\u001a\u000207H\u0002J\b\u0010A\u001a\u000207H\u0002J\b\u0010B\u001a\u000207H\u0016J\b\u0010C\u001a\u00020DH\u0002J\u0016\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020(J#\u0010I\u001a\u0002072\n\b\u0003\u0010J\u001a\u0004\u0018\u0001022\b\b\u0001\u0010K\u001a\u000202H\u0002¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u000207H\u0002J\b\u0010N\u001a\u000207H\u0002J\b\u0010O\u001a\u000207H\u0002J\u001a\u0010P\u001a\u0002072\b\u0010Q\u001a\u0004\u0018\u00010(2\u0006\u0010R\u001a\u00020GH\u0002J\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u000207H\u0002J\b\u0010V\u001a\u00020\u0019H\u0016J\"\u0010W\u001a\u0002072\u0006\u0010=\u001a\u0002022\u0006\u0010X\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010/H\u0016J\u0010\u0010Z\u001a\u00020\u00192\u0006\u0010[\u001a\u00020(H\u0002J\u001c\u0010\\\u001a\u0004\u0018\u00010(2\u0006\u0010[\u001a\u00020(2\b\b\u0002\u0010]\u001a\u00020(H\u0002J\u0010\u0010^\u001a\u0002072\u0006\u0010=\u001a\u000202H\u0002J\b\u0010_\u001a\u000207H\u0016J\u0010\u0010`\u001a\u0002072\u0006\u0010a\u001a\u00020bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010*R\u0010\u0010,\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082.¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, m90084d2 = {"Lcom/kubi/kyc/ui/KycSeniorFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kyc/databinding/BusercenterFragmentKycBinding;", "getBinding", "()Lcom/kubi/kyc/databinding/BusercenterFragmentKycBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mApi", "Lcom/kubi/kyc/api/KycApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/kyc/api/KycApi;", "mApi$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/kubi/kyc/multitype/KycAdapter;", "getMAdapter", "()Lcom/kubi/kyc/multitype/KycAdapter;", "mAdapter$delegate", "mInfo", "Lcom/kubi/kyc/api/KycInfoEntity;", "mIsChecked", "", "mFrontCell", "Lcom/kubi/kyc/multitype/UploadCell;", "mBackCell", "mHandCell", "mFrontImage", "Lcom/kubi/kyc/ui/UploadImageView2;", "mBackImage", "mHandImage", "mCheckCell", "Lcom/kubi/kyc/multitype/CheckCell;", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "Lcom/kubi/kyc/ui/KycSeniorFragment$Signature;", "takePhotoError", "date", "", "getDate", "()Ljava/lang/String;", "date$delegate", "receiveReason", "startModifyKycPrimaryForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "startTakePhotoForResult", "type", "", "eKycOcrPicSource", "manualOcrPicSource", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "chooseEKycOrcPic", "requestCode", "chooseManualOrcPic", "startOrcCameraActivity", "getKycWay", "registerForActivityResult", "lazyLoad", "setFullName", "Landroid/text/SpannableString;", "getTime", "time", "", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "showBigPic", "imgBgId", "picId", "(Ljava/lang/Integer;I)V", "submitSeniorKyc", "showConfirmDialog", "submitSenior", "uploadTrack1", "errorMsg", "startTime", "getCheckTip", "Landroid/text/Spannable;", "checkEnable", "onBackPressed", "onActivityResult", "resultCode", "data", "contains", "key", "ofReason", "compatKey", "pickPhoto", "onDestroy", "goToAppDetail", "context", "Landroidx/fragment/app/FragmentActivity;", "Companion", "CellListener", "Signature", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKycSeniorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KycSeniorFragment.kt\ncom/kubi/kyc/ui/KycSeniorFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,756:1\n147#2,16:757\n*S KotlinDebug\n*F\n+ 1 KycSeniorFragment.kt\ncom/kubi/kyc/ui/KycSeniorFragment\n*L\n81#1:757,16\n*E\n"})
public final class KycSeniorFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: X */
    @Nullable
    public KycInfoEntity f31297X;

    /* JADX INFO: renamed from: Y */
    public boolean f31298Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public C42259j0 f31299Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public C42259j0 f31300a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public C42259j0 f31301b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public UploadImageView2 f31302c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public UploadImageView2 f31303d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public UploadImageView2 f31304e0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public C42242b f31305f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public Signature f31306g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f31307h0;

    /* JADX INFO: renamed from: j0 */
    @Nullable
    public String f31309j0;

    /* JADX INFO: renamed from: k0 */
    public ActivityResultLauncher<Intent> f31310k0;

    /* JADX INFO: renamed from: l0 */
    public ActivityResultLauncher<Intent> f31311l0;

    /* JADX INFO: renamed from: m0 */
    public int f31312m0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ KProperty<Object>[] f31293q0 = {Reflection.property1(new PropertyReference1Impl(KycSeniorFragment.class, "binding", "getBinding()Lcom/kubi/kyc/databinding/BusercenterFragmentKycBinding;", 0))};

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public static final Companion f31292p0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f31294U = C45681e.m100799e(this, new Function1<KycSeniorFragment, C36885e>() { // from class: com.kubi.kyc.ui.KycSeniorFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36885e invoke(@NotNull KycSeniorFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36885e.m82639a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36885e, Unit>() { // from class: com.kubi.kyc.ui.KycSeniorFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36885e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36885e c36885e) {
            invoke(c36885e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f31295V = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.y0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycSeniorFragment.m36887A4();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f31296W = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycSeniorFragment.m36976z4();
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f31308i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.ui.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycSeniorFragment.m36945i4(this.f31406b);
        }
    });

    /* JADX INFO: renamed from: n0 */
    public int f31313n0 = 1;

    /* JADX INFO: renamed from: o0 */
    public int f31314o0 = 1;

    /* JADX INFO: compiled from: KycSeniorFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kyc/ui/KycSeniorFragment$Companion;", "", "<init>", "()V", "TAG", "", "TYPE_DEFAULT", "", "TYPE_FACE", "PAGE_ID", "PAGE_ID_MANUAL", "TAKE_PIC_REQUEST_KEY", "TAKE_PIC_RESULT_KEY", "TAKE_PIC_ERROR", "PICK_FRONT_CODE", "PICK_BACK_CODE", "PICK_HAND_CODE", "PIC_SOURCE_GALLERY", "PIC_SOURCE_CAMERA", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.KycSeniorFragment$a */
    /* JADX INFO: compiled from: KycSeniorFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0017\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kyc/ui/KycSeniorFragment$CellListener;", "Lcom/kubi/kyc/ui/UploadImageView2$OnLoadListener;", "<init>", "(Lcom/kubi/kyc/ui/KycSeniorFragment;)V", "mCell", "Lcom/kubi/kyc/multitype/UploadCell;", "onComplete", "", "path", "", "onFailed", "setCell", "cell", "setCell$KycLib_googleRelease", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C17134a implements UploadImageView2.InterfaceC17146a {

        /* JADX INFO: renamed from: a */
        @Nullable
        public C42259j0 f31315a;

        public C17134a() {
        }

        @Override // com.kubi.kyc.ui.UploadImageView2.InterfaceC17146a
        /* JADX INFO: renamed from: a */
        public void mo36998a(@Nullable String str) {
            C42259j0 c42259j0 = this.f31315a;
            if (c42259j0 != null) {
                c42259j0.m92736k(C27041f.m66668h(str));
            }
            KycSeniorFragment.this.m36941e4();
        }

        @Override // com.kubi.kyc.ui.UploadImageView2.InterfaceC17146a
        /* JADX INFO: renamed from: b */
        public void mo36999b(@Nullable String str) {
            C42259j0 c42259j0 = this.f31315a;
            if (c42259j0 != null) {
                c42259j0.m92735j(false);
            }
            C42259j0 c42259j1 = this.f31315a;
            if (c42259j1 != null) {
                c42259j1.m92736k(C27041f.m66668h(str));
            }
            KycSeniorFragment.this.m36941e4();
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final UploadImageView2.InterfaceC17146a m37000c(@Nullable C42259j0 c42259j0) {
            this.f31315a = c42259j0;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.KycSeniorFragment$b, reason: from toString */
    /* JADX INFO: compiled from: KycSeniorFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kyc/ui/KycSeniorFragment$Signature;", "", KycKey.firstName, "", KycKey.lastName, "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "getLastName", "setLastName", "getCode", "setCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Signature {

        /* JADX INFO: renamed from: a, reason: from toString */
        @Nullable
        public String firstName;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public String lastName;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public String code;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Signature)) {
                return false;
            }
            Signature signature = (Signature) other;
            return Intrinsics.areEqual(this.firstName, signature.firstName) && Intrinsics.areEqual(this.lastName, signature.lastName) && Intrinsics.areEqual(this.code, signature.code);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: d */
        public final void m37004d(@Nullable String str) {
            this.firstName = str;
        }

        /* JADX INFO: renamed from: e */
        public final void m37005e(@Nullable String str) {
            this.lastName = str;
        }

        public int hashCode() {
            String str = this.firstName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Signature(firstName=" + this.firstName + ", lastName=" + this.lastName + ", code=" + this.code + ')';
        }

        public Signature(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.firstName = str;
            this.lastName = str2;
            this.code = str3;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.KycSeniorFragment$c */
    /* JADX INFO: compiled from: KycSeniorFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/ui/KycSeniorFragment$onViewCreated$9$1$1", "Lcom/kubi/kyc/multitype/KycAdapter$OnClickListener;", "onTvClick1", "", "onTvClick2", "gotoModify", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17136c implements C42274w.a {
        public C17136c() {
        }

        @Override // p435ln.C42274w.a
        /* JADX INFO: renamed from: a */
        public void mo37006a() {
            KycSeniorFragment.this.m36981c5(Integer.valueOf(R$drawable.shape_largecolor_4r), R$mipmap.example_photo_how_to_manual_kyc_big);
        }

        @Override // p435ln.C42274w.a
        /* JADX INFO: renamed from: b */
        public void mo37007b() {
            KycSeniorFragment.this.m36981c5(Integer.valueOf(R$drawable.shape_largecolor_4r), R$mipmap.example_signature_how_to_manual_kyc_big);
        }

        @Override // p435ln.C42274w.a
        /* JADX INFO: renamed from: c */
        public void mo37008c() {
            C44128b.m97261e(KycSeniorFragment.this.getTAG(), "gotoModify called");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.KycSeniorFragment$d */
    /* JADX INFO: compiled from: KycSeniorFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/ui/KycSeniorFragment$submitSenior$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17137d extends C24223c1 {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f31322e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17137d(long j11) {
            super(KycSeniorFragment.this);
            this.f31322e = j11;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws JSONException {
            String message;
            super.accept(th2);
            KycSeniorFragment kycSeniorFragment = KycSeniorFragment.this;
            if (th2 != null) {
                message = th2.getMessage();
            } else {
                message = null;
            }
            kycSeniorFragment.m36995r5(C27041f.m66668h(message), this.f31322e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public final void m36941e4() {
        Button button;
        Button button2;
        Button button3;
        boolean z11 = false;
        if (this.f31312m0 != 0) {
            C36885e c36885eM36986j4 = m36986j4();
            if (c36885eM36986j4 == null || (button = c36885eM36986j4.f81454b) == null) {
                return;
            }
            UploadImageView2 uploadImageView2 = this.f31302c0;
            String f31365c = uploadImageView2 != null ? uploadImageView2.getF31365c() : null;
            if (f31365c != null && f31365c.length() != 0) {
                UploadImageView2 uploadImageView3 = this.f31303d0;
                String f31365c2 = uploadImageView3 != null ? uploadImageView3.getF31365c() : null;
                if (f31365c2 != null && f31365c2.length() != 0 && this.f31298Y) {
                    z11 = true;
                }
            }
            button.setEnabled(z11);
            return;
        }
        KycInfoEntity kycInfoEntity = this.f31297X;
        if (C27025c.m66566d(kycInfoEntity != null ? Boolean.valueOf(kycInfoEntity.isPersonFail()) : null)) {
            C36885e c36885eM36986j5 = m36986j4();
            if (c36885eM36986j5 == null || (button3 = c36885eM36986j5.f81454b) == null) {
                return;
            }
            C42259j0 c42259j0 = this.f31299Z;
            if (!C27025c.m66566d(c42259j0 != null ? Boolean.valueOf(c42259j0.m92677a()) : null)) {
                C42259j0 c42259j1 = this.f31300a0;
                if (!C27025c.m66566d(c42259j1 != null ? Boolean.valueOf(c42259j1.m92677a()) : null)) {
                    C42259j0 c42259j2 = this.f31301b0;
                    if (!C27025c.m66566d(c42259j2 != null ? Boolean.valueOf(c42259j2.m92677a()) : null) && this.f31298Y) {
                        z11 = true;
                    }
                }
            }
            button3.setEnabled(z11);
            return;
        }
        C36885e c36885eM36986j6 = m36986j4();
        if (c36885eM36986j6 == null || (button2 = c36885eM36986j6.f81454b) == null) {
            return;
        }
        UploadImageView2 uploadImageView4 = this.f31302c0;
        String f31365c3 = uploadImageView4 != null ? uploadImageView4.getF31365c() : null;
        if (f31365c3 != null && f31365c3.length() != 0) {
            UploadImageView2 uploadImageView5 = this.f31303d0;
            String f31365c4 = uploadImageView5 != null ? uploadImageView5.getF31365c() : null;
            if (f31365c4 != null && f31365c4.length() != 0) {
                UploadImageView2 uploadImageView6 = this.f31304e0;
                String f31365c5 = uploadImageView6 != null ? uploadImageView6.getF31365c() : null;
                if (f31365c5 != null && f31365c5.length() != 0 && this.f31298Y) {
                    z11 = true;
                }
            }
        }
        button2.setEnabled(z11);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Button button;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.f31297X = arguments != null ? (KycInfoEntity) arguments.getParcelable("data") : null;
        Bundle arguments2 = getArguments();
        this.f31312m0 = arguments2 != null ? arguments2.getInt("type") : 0;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.kubi.kyc.ui.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                KycSeniorFragment.m36910M4(this.f31401a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f31311l0 = activityResultLauncherRegisterForActivityResult;
        m36991o4();
        m36979V4();
        m36992q4().m92781o().add(new InfoCell(getString(R$string.manual_kycupload_tip), null, null, null, 14, null));
        m36992q4().m92781o().add(new LabelCell(getString(R$string.kyc_upload_card), null, 2, null));
        m36992q4().m92781o().add(new C42262l());
        String str = this.f31312m0 == 0 ? "B1ManualKYC2Edit" : "B1personalKYC2Certificates";
        JSONObject jSONObject = new JSONObject();
        C0384b.m1522b(jSONObject, this.f31297X);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(str, "operation", "3", jSONObject);
        String string = getString(R$string.manual_photoformat);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R$string.manual_photoformat_highlight);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableString spannableStringM66638a = C27035i.m66638a(string, string2, getColorRes(R$color.complementary));
        Items itemsM92781o = m36992q4().m92781o();
        int i11 = R$color.emphasis60;
        itemsM92781o.add(new TipCell(spannableStringM66638a, getColorRes(i11), null, false, 12, null));
        if (this.f31312m0 == 0) {
            Bundle arguments3 = getArguments();
            this.f31309j0 = C27041f.m66668h(arguments3 != null ? arguments3.getString("receiveReason") : null);
            setPageId("B1ManualKYC2Edit");
            C42259j0 c42259j0M92735j = new C42259j0().m92738m(R$mipmap.busercenter_ic_example_front).m92739n(getString(R$string.card_front_pt)).m92737l(m36890C4(this, KycKey.frontPhoto, null, 2, null)).m92735j(m36985h4(KycKey.frontPhoto));
            KycInfoEntity kycInfoEntity = this.f31297X;
            this.f31299Z = c42259j0M92735j.m92741p(C27025c.m66566d(kycInfoEntity != null ? Boolean.valueOf(kycInfoEntity.isPersonFail()) : null)).m92740o(new View.OnClickListener() { // from class: com.kubi.kyc.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KycSeniorFragment.m36912N4(this.f31574b, view2);
                }
            });
        } else {
            C42259j0 c42259j0M92735j2 = new C42259j0().m92738m(R$mipmap.busercenter_ic_example_front).m92739n(getString(R$string.card_front_pt)).m92737l(m36890C4(this, KycKey.frontPhoto, null, 2, null)).m92735j(m36985h4(KycKey.frontPhoto));
            KycInfoEntity kycInfoEntity2 = this.f31297X;
            this.f31299Z = c42259j0M92735j2.m92741p(C27025c.m66566d(kycInfoEntity2 != null ? Boolean.valueOf(kycInfoEntity2.isPersonFail()) : null)).m92740o(new View.OnClickListener() { // from class: com.kubi.kyc.ui.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KycSeniorFragment.m36914O4(this.f31391b, view2);
                }
            });
        }
        m36992q4().m92781o().add(this.f31299Z);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setLeftOnclickListener(new View.OnClickListener() { // from class: com.kubi.kyc.ui.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KycSeniorFragment.m36916P4(this.f31549b, view2);
                }
            });
        }
        C42259j0 c42259j0M92735j3 = new C42259j0().m92738m(R$mipmap.busercenter_ic_example_back).m92739n(getString(R$string.card_back_pt)).m92737l(m36977B4(KycKey.backPhoto, KycKey.backendPhoto)).m92735j(m36985h4(KycKey.backPhoto) || m36985h4(KycKey.backendPhoto));
        KycInfoEntity kycInfoEntity3 = this.f31297X;
        this.f31300a0 = c42259j0M92735j3.m92741p(C27025c.m66566d(kycInfoEntity3 != null ? Boolean.valueOf(kycInfoEntity3.isPersonFail()) : null)).m92740o(new View.OnClickListener() { // from class: com.kubi.kyc.ui.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                KycSeniorFragment.m36894E4(this.f31575b, view2);
            }
        });
        m36992q4().m92781o().add(this.f31300a0);
        if (this.f31312m0 == 0) {
            m36992q4().m92781o().add(new LabelCell(getString(R$string.card_hand_pt), Integer.valueOf(C27029c.m66603f(this, 12))));
            String string3 = getString(R$string.manual_handledformat);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            m36992q4().m92781o().add(new TipCell(new SpannableString(C27041f.m66661a(string3, new Function1() { // from class: com.kubi.kyc.ui.u0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycSeniorFragment.m36896F4(this.f31579b, (InterfaceC27083r) obj);
                }
            })), getColorRes(i11), null, false, 12, null));
            m36992q4().m92781o().add(new TipCell(new SpannableString(getString(R$string.manual_second_confirm_des)), getColorRes(R$color.emphasis), Float.valueOf(13.0f), false, 8, null));
            String string4 = getString(R$string.manual_signature3, m36990n4());
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            m36992q4().m92781o().add(new TipCell(C27035i.m66638a(string4, m36990n4(), getColorRes(R$color.primary)), getColorRes(i11), null, true, 4, null));
            m36992q4().m92781o().add(new C42247d0());
            m36992q4().m92781o().add(new TipCell(new SpannableString(getString(R$string.manual_signature_tip)), getColorRes(R$color.secondary), Float.valueOf(13.0f), false, 8, null));
            C42259j0 c42259j0M92735j4 = new C42259j0().m92738m(R$mipmap.busercenter_ic_example_hand).m92739n(getString(R$string.kyc_upload_hand_card)).m92737l(m36890C4(this, KycKey.handlePhoto, null, 2, null)).m92735j(m36985h4(KycKey.handlePhoto));
            KycInfoEntity kycInfoEntity4 = this.f31297X;
            this.f31301b0 = c42259j0M92735j4.m92741p(C27025c.m66566d(kycInfoEntity4 != null ? Boolean.valueOf(kycInfoEntity4.isPersonFail()) : null)).m92740o(new View.OnClickListener() { // from class: com.kubi.kyc.ui.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    KycSeniorFragment.m36904J4(this.f31582b, view2);
                }
            });
            m36992q4().m92781o().add(this.f31301b0);
        }
        this.f31305f0 = new C42242b().m92686f(m36988k4()).m92685e(this.f31298Y).m92684d(new Consumer() { // from class: com.kubi.kyc.ui.w0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycSeniorFragment.m36906K4(this.f31587b, (Boolean) obj);
            }
        });
        m36992q4().m92781o().add(this.f31305f0);
        C36885e c36885eM36986j4 = m36986j4();
        if (c36885eM36986j4 != null && (recyclerView = c36885eM36986j4.f81455c) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            C42274w c42274wM36992q4 = m36992q4();
            c42274wM36992q4.setOnClickListener(new C17136c());
            recyclerView.setAdapter(c42274wM36992q4);
        }
        C36885e c36885eM36986j5 = m36986j4();
        if (c36885eM36986j5 == null || (button = c36885eM36986j5.f81454b) == null) {
            return;
        }
        C27046k.m66710y(button, 3000L, new Function0() { // from class: com.kubi.kyc.ui.x0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycSeniorFragment.m36908L4(this.f31590b);
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ String m36890C4(KycSeniorFragment kycSeniorFragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        return kycSeniorFragment.m36977B4(str, str2);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m36896F4(final KycSeniorFragment kycSeniorFragment, InterfaceC27083r buildSpannableString) {
        Intrinsics.checkNotNullParameter(buildSpannableString, "$this$buildSpannableString");
        String string = kycSeniorFragment.getString(R$string.manual_handledformat_highlight1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        buildSpannableString.mo66838a(string, new Function1() { // from class: com.kubi.kyc.ui.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycSeniorFragment.m36898G4(this.f31397b, (InterfaceC27079p) obj);
            }
        });
        String string2 = kycSeniorFragment.getString(R$string.manual_handledformat_highlight2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        buildSpannableString.mo66838a(string2, new Function1() { // from class: com.kubi.kyc.ui.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycSeniorFragment.m36900H4(this.f31399b, (InterfaceC27079p) obj);
            }
        });
        String string3 = kycSeniorFragment.getString(R$string.manual_handledformat_highlight3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        buildSpannableString.mo66838a(string3, new Function1() { // from class: com.kubi.kyc.ui.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycSeniorFragment.m36902I4(this.f31402b, (InterfaceC27079p) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m36898G4(KycSeniorFragment kycSeniorFragment, InterfaceC27079p highLightText) {
        Intrinsics.checkNotNullParameter(highLightText, "$this$highLightText");
        highLightText.mo66823b(kycSeniorFragment.getColorRes(R$color.complementary));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m36900H4(KycSeniorFragment kycSeniorFragment, InterfaceC27079p highLightText) {
        Intrinsics.checkNotNullParameter(highLightText, "$this$highLightText");
        highLightText.mo66823b(kycSeniorFragment.getColorRes(R$color.complementary));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m36902I4(KycSeniorFragment kycSeniorFragment, InterfaceC27079p highLightText) {
        Intrinsics.checkNotNullParameter(highLightText, "$this$highLightText");
        highLightText.mo66823b(kycSeniorFragment.getColorRes(R$color.complementary));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m36904J4(KycSeniorFragment kycSeniorFragment, View view) {
        kycSeniorFragment.f31304e0 = (UploadImageView2) view;
        kycSeniorFragment.m36978Q4(3);
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m36919R4(KycSeniorFragment kycSeniorFragment, int i11, FragmentActivity fragmentActivity, boolean z11) {
        if (z11) {
            ImagePickerHelper.m58397f(kycSeniorFragment, 1, i11, null, 8, null);
        } else {
            kycSeniorFragment.m36997t4(fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final void m36928W4(final KycSeniorFragment kycSeniorFragment, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C44128b.m97261e(kycSeniorFragment.getTAG(), "startModifyKycPrimaryForResult resultCode=" + result.getResultCode());
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            if (data != null ? data.getBooleanExtra("data_1", false) : false) {
                C44128b.m97261e(kycSeniorFragment.getTAG(), "startModifyKycPrimaryForResult modifySuccess, refresh KycInfoEntity");
                Observable<R> observableCompose = kycSeniorFragment.m36994r4().m1520h().compose(C24217a1.m58389m());
                final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.m0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KycSeniorFragment.m36930X4(this.f31540b, (Disposable) obj);
                    }
                };
                Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.kyc.ui.n0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KycSeniorFragment.m36932Y4(function1, obj);
                    }
                });
                final Function1 function2 = new Function1() { // from class: com.kubi.kyc.ui.o0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KycSeniorFragment.m36934Z4(this.f31546b, (KycInfoEntity) obj);
                    }
                };
                Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.kyc.ui.q0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KycSeniorFragment.m36936a5(function2, obj);
                    }
                }, new C24223c1(kycSeniorFragment));
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, kycSeniorFragment.getDestroyDisposable());
                Intent data2 = result.getData();
                KycInfoEntity kycInfoEntity = data2 != null ? (KycInfoEntity) data2.getParcelableExtra("data_2") : null;
                Signature signature = kycSeniorFragment.f31306g0;
                if (signature != null) {
                    signature.m37004d(kycInfoEntity != null ? kycInfoEntity.getFirstName() : null);
                }
                Signature signature2 = kycSeniorFragment.f31306g0;
                if (signature2 != null) {
                    signature2.m37005e(kycInfoEntity != null ? kycInfoEntity.getLastName() : null);
                }
                if (kycSeniorFragment.f31312m0 == 0) {
                    SpannableString spannableStringM36980b5 = kycSeniorFragment.m36980b5();
                    if (kycSeniorFragment.m36992q4().m92781o().size() > 11) {
                        Object obj = kycSeniorFragment.m36992q4().m92781o().get(11);
                        TipCell tipCell = obj instanceof TipCell ? (TipCell) obj : null;
                        if (tipCell != null) {
                            tipCell.m92723e(spannableStringM36980b5);
                        }
                        kycSeniorFragment.m36992q4().notifyItemChanged(11);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m36940d5(Integer num, int i11, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        if (num != null) {
            viewHolder.setBackgroundRes(R$id.ll_big_img, num.intValue());
        }
        viewHolder.setImageResource(R$id.iv_big_img, i11);
        viewHolder.setOnClickListener(R$id.iv_close_dialog, new View.OnClickListener() { // from class: com.kubi.kyc.ui.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KycSeniorFragment.m36942e5(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX INFO: renamed from: g5 */
    public static final Unit m36943g5(final KycSeniorFragment kycSeniorFragment, BaseViewHolder viewHolder, final DialogFragmentHelper fragment) {
        Signature signature;
        String lastName;
        Signature signature2;
        String firstName;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Signature signature3 = kycSeniorFragment.f31306g0;
        if (TextUtils.isEmpty(C27041f.m66668h(signature3 != null ? signature3.getLastName() : null))) {
            Signature signature4 = kycSeniorFragment.f31306g0;
            if (TextUtils.isEmpty(C27041f.m66668h(signature4 != null ? signature4.getFirstName() : null))) {
                View view = viewHolder.getView(R$id.tv_name);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                ViewExtKt.m66577h(view);
            } else {
                int i11 = R$id.tv_name;
                View view2 = viewHolder.getView(i11);
                Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
                ViewExtKt.m66594y(view2);
                TextView textView = (TextView) viewHolder.getView(i11);
                StringBuilder sb2 = new StringBuilder();
                signature = kycSeniorFragment.f31306g0;
                if (signature != null) {
                    lastName = signature.getLastName();
                } else {
                    lastName = null;
                }
                sb2.append(C27041f.m66668h(lastName));
                sb2.append(' ');
                signature2 = kycSeniorFragment.f31306g0;
                if (signature2 != null) {
                    firstName = signature2.getFirstName();
                } else {
                    firstName = null;
                }
                sb2.append(C27041f.m66668h(firstName));
                textView.setText(sb2.toString());
            }
        } else {
            int i12 = R$id.tv_name;
            View view3 = viewHolder.getView(i12);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            ViewExtKt.m66594y(view3);
            TextView textView2 = (TextView) viewHolder.getView(i12);
            StringBuilder sb3 = new StringBuilder();
            signature = kycSeniorFragment.f31306g0;
            if (signature != null) {
                lastName = signature.getLastName();
            } else {
                lastName = null;
            }
            sb3.append(C27041f.m66668h(lastName));
            sb3.append(' ');
            signature2 = kycSeniorFragment.f31306g0;
            if (signature2 != null) {
                firstName = signature2.getFirstName();
            } else {
                firstName = null;
            }
            sb3.append(C27041f.m66668h(firstName));
            textView2.setText(sb3.toString());
        }
        TextView textView3 = (TextView) viewHolder.getView(R$id.tv_code);
        Signature signature5 = kycSeniorFragment.f31306g0;
        textView3.setText(signature5 != null ? signature5.getCode() : null);
        ((TextView) viewHolder.getView(R$id.tv_date)).setText(kycSeniorFragment.m36996s4(System.currentTimeMillis(), "yyyy-MM-dd"));
        viewHolder.getView(R$id.tv_check_again).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.kyc.ui.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                KycSeniorFragment.m36944h5(fragment, view4);
            }
        });
        viewHolder.getView(R$id.tv_confirm).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.kyc.ui.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                KycSeniorFragment.m36946i5(this.f31407b, view4);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m36950l4(SpannableString spannableString, String str, final KycSeniorFragment kycSeniorFragment) {
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.kyc.ui.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KycSeniorFragment.m36953m4(this.f31537b, view);
            }
        }), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, str, 0, false, 6, (Object) null) + str.length(), 18);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m36953m4(KycSeniorFragment kycSeniorFragment, View view) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(MultiLanguageManager.m56979h() ? com.kubi.user.api.p.a.e() : com.kubi.user.api.p.a.f());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, C43852m.m96601m("B1personalKYC2Certificates", "operation", "1"), null, null, 110, null);
        if (kycSeniorFragment.f31312m0 == 0) {
            C42242b c42242b = kycSeniorFragment.f31305f0;
            if (c42242b != null) {
                c42242b.m92685e(true);
            }
            kycSeniorFragment.m36992q4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final Signature m36966u4(KycSeniorFragment kycSeniorFragment, KycInfoEntity kycInfoEntity, String code) {
        Intrinsics.checkNotNullParameter(kycInfoEntity, "kycInfoEntity");
        Intrinsics.checkNotNullParameter(code, "code");
        kycSeniorFragment.hideDialogLoading();
        return new Signature(kycInfoEntity.getFirstName(), kycInfoEntity.getLastName(), code);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m36968v4(KycSeniorFragment kycSeniorFragment, Signature signature) {
        kycSeniorFragment.f31306g0 = signature;
        SpannableString spannableStringM36980b5 = kycSeniorFragment.m36980b5();
        Items itemsM92781o = kycSeniorFragment.m36992q4().m92781o();
        int i11 = R$color.emphasis60;
        itemsM92781o.add(9, new TipCell(spannableStringM36980b5, kycSeniorFragment.getColorRes(i11), null, true, 4, null));
        kycSeniorFragment.m36992q4().notifyItemChanged(9);
        String string = kycSeniorFragment.getString(R$string.manual_signature2, signature.getCode());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        kycSeniorFragment.m36992q4().m92781o().add(10, new TipCell(C27035i.m66638a(string, C27041f.m66668h(signature.getCode()), kycSeniorFragment.getColorRes(R$color.primary)), kycSeniorFragment.getColorRes(i11), null, true, 4, null));
        kycSeniorFragment.m36992q4().notifyItemChanged(10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final C42274w m36976z4() {
        return new C42274w();
    }

    /* JADX INFO: renamed from: B4 */
    public final String m36977B4(String str, String str2) {
        KycInfoEntity kycInfoEntity;
        Map<String, KycReasonEntity> mapReasonMap;
        KycReasonEntity kycReasonEntity;
        Map<String, KycReasonEntity> mapReasonMap2;
        Map<String, KycReasonEntity> mapReasonMap3;
        KycReasonEntity kycReasonEntity2;
        Map<String, KycReasonEntity> mapReasonMap4;
        KycInfoEntity kycInfoEntity2 = this.f31297X;
        if (C27025c.m66566d((kycInfoEntity2 == null || (mapReasonMap4 = kycInfoEntity2.reasonMap()) == null) ? null : Boolean.valueOf(mapReasonMap4.containsKey(str)))) {
            KycInfoEntity kycInfoEntity3 = this.f31297X;
            if (kycInfoEntity3 == null || (mapReasonMap3 = kycInfoEntity3.reasonMap()) == null || (kycReasonEntity2 = mapReasonMap3.get(str)) == null) {
                return null;
            }
            return kycReasonEntity2.getDesc();
        }
        if (str2.length() > 0) {
            KycInfoEntity kycInfoEntity4 = this.f31297X;
            if (C27025c.m66566d((kycInfoEntity4 == null || (mapReasonMap2 = kycInfoEntity4.reasonMap()) == null) ? null : Boolean.valueOf(mapReasonMap2.containsKey(str2))) && (kycInfoEntity = this.f31297X) != null && (mapReasonMap = kycInfoEntity.reasonMap()) != null && (kycReasonEntity = mapReasonMap.get(str2)) != null) {
                return kycReasonEntity.getDesc();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: V4 */
    public final void m36979V4() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.kubi.kyc.ui.r
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                KycSeniorFragment.m36928W4(this.f31561a, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f31310k0 = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: b5 */
    public final SpannableString m36980b5() {
        int i11 = R$string.manual_signature1;
        StringBuilder sb2 = new StringBuilder();
        Signature signature = this.f31306g0;
        sb2.append(signature != null ? signature.getLastName() : null);
        sb2.append(' ');
        Signature signature2 = this.f31306g0;
        sb2.append(signature2 != null ? signature2.getFirstName() : null);
        String string = getString(i11, sb2.toString());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        StringBuilder sb3 = new StringBuilder();
        Signature signature3 = this.f31306g0;
        sb3.append(signature3 != null ? signature3.getLastName() : null);
        sb3.append(' ');
        Signature signature4 = this.f31306g0;
        sb3.append(signature4 != null ? signature4.getFirstName() : null);
        return C27035i.m66638a(string, sb3.toString(), getColorRes(R$color.primary));
    }

    /* JADX INFO: renamed from: c5 */
    public final void m36981c5(@DrawableRes final Integer num, @DrawableRes final int i11) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.busercenter_dialog_kyc_example, 1, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.kyc.ui.r0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KycSeniorFragment.m36940d5(num, i11, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, TIMPushProvider.f75062n);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m36982f4(int i11) {
        int i12 = this.f31313n0;
        if (i12 == 0) {
            m36978Q4(i11);
        } else {
            if (i12 != 1) {
                return;
            }
            m36987j5(i11);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final void m36983f5() {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.view_kyc_senior_confirm_dialog, 3, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.kyc.ui.u
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return KycSeniorFragment.m36943g5(this.f31578b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "asset_overview");
    }

    /* JADX INFO: renamed from: g4 */
    public final void m36984g4(int i11) {
        int i12 = this.f31314o0;
        if (i12 == 0) {
            m36978Q4(i11);
        } else {
            if (i12 != 1) {
                return;
            }
            m36987j5(i11);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.busercenter_fragment_kyc;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m36985h4(String str) {
        Map<String, KycReasonEntity> mapReasonMap;
        KycInfoEntity kycInfoEntity = this.f31297X;
        return C27025c.m66566d((kycInfoEntity == null || (mapReasonMap = kycInfoEntity.reasonMap()) == null) ? null : Boolean.valueOf(mapReasonMap.containsKey(str)));
    }

    /* JADX INFO: renamed from: j4 */
    public final C36885e m36986j4() {
        return (C36885e) this.f31294U.getValue(this, f31293q0[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final Spannable m36988k4() {
        final String string = getString(R$string.kyc_card_protocol);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final SpannableString spannableString = new SpannableString(getString(R$string.have_read_agree, string));
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kyc.ui.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycSeniorFragment.m36950l4(spannableString, string, this);
            }
        });
        return spannableString;
    }

    /* JADX INFO: renamed from: m5 */
    public final void m36989m5() {
        HashMap<String, String> map = new HashMap<>();
        map.put("verifyType", "0");
        UploadImageView2 uploadImageView2 = this.f31302c0;
        map.put(KycKey.frontPhoto, C27041f.m66668h(uploadImageView2 != null ? uploadImageView2.getF31365c() : null));
        UploadImageView2 uploadImageView3 = this.f31303d0;
        map.put(KycKey.backendPhoto, C27041f.m66668h(uploadImageView3 != null ? uploadImageView3.getF31365c() : null));
        UploadImageView2 uploadImageView4 = this.f31304e0;
        map.put(KycKey.handlePhoto, C27041f.m66668h(uploadImageView4 != null ? uploadImageView4.getF31365c() : null));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Observable<R> observableCompose = m36994r4().m1518f(map).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.v
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycSeniorFragment.m36955n5(this.f31581b, (Disposable) obj);
            }
        };
        addSubscription(observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.kyc.ui.w
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycSeniorFragment.m36957o5(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.kyc.ui.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                KycSeniorFragment.m36960p5(this.f31588b, jCurrentTimeMillis, obj);
            }
        }, new C17137d(jCurrentTimeMillis)));
    }

    /* JADX INFO: renamed from: n4 */
    public final String m36990n4() {
        return (String) this.f31308i0.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(getString(R$string.kyc_return_confirm)).m54159P4(R$string.cancel, null).m54162S4(R$string.determine, new DialogInterface.OnClickListener() { // from class: com.kubi.kyc.ui.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                KycSeniorFragment.m36892D4(this.f31553b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
        return true;
    }

    /* JADX INFO: renamed from: q4 */
    public final C42274w m36992q4() {
        return (C42274w) this.f31296W.getValue();
    }

    /* JADX INFO: renamed from: q5 */
    public final void m36993q5() {
        KycInfoEntity kycInfoEntity = this.f31297X;
        if (!C27025c.m66566d(kycInfoEntity != null ? Boolean.valueOf(kycInfoEntity.isPersonSeniorFail()) : null)) {
            m36983f5();
            return;
        }
        C42259j0 c42259j0 = this.f31301b0;
        if (C27025c.m66566d(c42259j0 != null ? Boolean.valueOf(c42259j0.m92677a()) : null)) {
            m36983f5();
        } else {
            m36989m5();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final InterfaceC0383a m36994r4() {
        return (InterfaceC0383a) this.f31295V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final String m36996s4(long j11, @NotNull String format) {
        Intrinsics.checkNotNullParameter(format, "format");
        String str = new SimpleDateFormat(format, Locale.getDefault()).format(Long.valueOf(j11));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: t4 */
    public final void m36997t4(FragmentActivity fragmentActivity) {
        String string = fragmentActivity.getString(R$string.camera_authorization_tips, fragmentActivity.getString(R$string.camera_storage_authorization));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        DialogHelper.m37110d(fragmentActivity, string, supportFragmentManager, null, null, 24, null);
    }

    public KycSeniorFragment() {
        setPageId("B1personalKYC2Certificates");
    }

    /* JADX INFO: renamed from: A4 */
    public static final InterfaceC0383a m36887A4() {
        return (InterfaceC0383a) C42597a.m93386b().create(InterfaceC0383a.class);
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m36892D4(KycSeniorFragment kycSeniorFragment, DialogInterface dialogInterface, int i11) {
        FragmentActivity activity = kycSeniorFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = kycSeniorFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m36894E4(KycSeniorFragment kycSeniorFragment, View view) {
        C43852m.m96591c(C27041f.m66668h(kycSeniorFragment.getF34283V()), "upload", "2", null, 8, null);
        kycSeniorFragment.f31303d0 = (UploadImageView2) view;
        int i11 = kycSeniorFragment.f31312m0;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            kycSeniorFragment.m36982f4(2);
            return;
        }
        kycSeniorFragment.m36984g4(2);
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m36906K4(KycSeniorFragment kycSeniorFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        kycSeniorFragment.f31298Y = bool.booleanValue();
        kycSeniorFragment.m36941e4();
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m36908L4(KycSeniorFragment kycSeniorFragment) throws JSONException {
        String strM66668h = C27041f.m66668h(kycSeniorFragment.getF34283V());
        JSONObject jSONObject = new JSONObject();
        C0384b.m1522b(jSONObject, kycSeniorFragment.f31297X);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(strM66668h, "operation", "2", jSONObject);
        if (kycSeniorFragment.f31312m0 == 0) {
            kycSeniorFragment.m36993q5();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m36910M4(KycSeniorFragment kycSeniorFragment, ActivityResult activityResult) {
        UploadImageView2 uploadImageView2;
        Intent data = activityResult.getData();
        if (data != null) {
            int intExtra = data.getIntExtra("take_pic_request_key", -1);
            String stringExtra = data.getStringExtra("take_pic_result_key");
            int i11 = 1;
            if (Intrinsics.areEqual(stringExtra, "TAKE_PIC_ERROR")) {
                kycSeniorFragment.m36978Q4(intExtra);
                kycSeniorFragment.f31307h0 = true;
                return;
            }
            int i12 = 0;
            if (intExtra != 1) {
                if (intExtra == 2 && (uploadImageView2 = kycSeniorFragment.f31303d0) != null) {
                    if (kycSeniorFragment.f31312m0 == 0) {
                        i12 = 1;
                    }
                    uploadImageView2.m37105i(stringExtra, i12, 1, kycSeniorFragment.new C17134a().m37000c(kycSeniorFragment.f31300a0));
                    return;
                }
                return;
            }
            UploadImageView2 uploadImageView3 = kycSeniorFragment.f31302c0;
            if (uploadImageView3 != null) {
                if (kycSeniorFragment.f31312m0 != 0) {
                    i11 = 0;
                }
                uploadImageView3.m37105i(stringExtra, i11, 0, kycSeniorFragment.new C17134a().m37000c(kycSeniorFragment.f31299Z));
            }
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m36912N4(KycSeniorFragment kycSeniorFragment, View view) {
        C43852m.m96591c(C27041f.m66668h(kycSeniorFragment.getF34283V()), "upload", "1", null, 8, null);
        kycSeniorFragment.f31302c0 = (UploadImageView2) view;
        kycSeniorFragment.m36984g4(1);
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m36914O4(KycSeniorFragment kycSeniorFragment, View view) {
        C43852m.m96591c(C27041f.m66668h(kycSeniorFragment.getF34283V()), "upload", "1", null, 8, null);
        kycSeniorFragment.f31302c0 = (UploadImageView2) view;
        kycSeniorFragment.m36982f4(1);
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m36916P4(KycSeniorFragment kycSeniorFragment, View view) {
        String str;
        String strM66668h = C27041f.m66668h(kycSeniorFragment.getF34283V());
        if (kycSeniorFragment.f31312m0 == 0) {
            str = "3";
        } else {
            str = "4";
        }
        C43852m.m96591c(strM66668h, "operation", str, null, 8, null);
        FragmentActivity activity = kycSeniorFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m36921S4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m36923T4(KycSeniorFragment kycSeniorFragment, FragmentActivity fragmentActivity, Throwable th2) {
        kycSeniorFragment.m36997t4(fragmentActivity);
        C44127a.m97246f(kycSeniorFragment.getTAG(), "pick image fail", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final void m36925U4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X4 */
    public static final Unit m36930X4(KycSeniorFragment kycSeniorFragment, Disposable disposable) {
        kycSeniorFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m36932Y4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m36934Z4(KycSeniorFragment kycSeniorFragment, KycInfoEntity kycInfoEntity) {
        int i11;
        kycSeniorFragment.hideDialogLoading();
        kycSeniorFragment.f31297X = kycInfoEntity;
        if (kycSeniorFragment.f31312m0 == 1) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        if (i11 < kycSeniorFragment.m36992q4().m92781o().size()) {
            kycSeniorFragment.m36992q4().m92781o().set(i11, kycSeniorFragment.f31297X);
            kycSeniorFragment.m36992q4().notifyItemChanged(i11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final void m36936a5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e5 */
    public static final void m36942e5(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m36944h5(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: i4 */
    public static final String m36945i4(KycSeniorFragment kycSeniorFragment) {
        return kycSeniorFragment.m36996s4(System.currentTimeMillis(), "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: i5 */
    public static final void m36946i5(KycSeniorFragment kycSeniorFragment, View view) {
        kycSeniorFragment.m36989m5();
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m36948k5(KycSeniorFragment kycSeniorFragment, int i11, FragmentActivity fragmentActivity, Boolean bool) {
        if (bool.booleanValue()) {
            Intent intent = new Intent(kycSeniorFragment.mContext, (Class<?>) OcrCameraActivity.class);
            intent.putExtra("take_pic_request_key", i11);
            ActivityResultLauncher<Intent> activityResultLauncher = kycSeniorFragment.f31311l0;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startTakePhotoForResult");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(intent);
        } else {
            String string = kycSeniorFragment.getString(R$string.camera_authorization_tips, kycSeniorFragment.getString(com.kubi.sdk.R$string.camera_storage_authorization));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            FragmentManager childFragmentManager = kycSeniorFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            DialogHelper.m37110d(fragmentActivity, string, childFragmentManager, null, null, 24, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m36951l5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m36955n5(KycSeniorFragment kycSeniorFragment, Disposable disposable) {
        kycSeniorFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final void m36957o5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m36959p4(KycSeniorFragment kycSeniorFragment, UserKycWayEntity userKycWayEntity) {
        int iIntValue;
        Integer electricKyc = userKycWayEntity.getElectricKyc();
        int iIntValue2 = 1;
        if (electricKyc != null) {
            iIntValue = electricKyc.intValue();
        } else {
            iIntValue = 1;
        }
        kycSeniorFragment.f31313n0 = iIntValue;
        Integer manualKyc = userKycWayEntity.getManualKyc();
        if (manualKyc != null) {
            iIntValue2 = manualKyc.intValue();
        }
        kycSeniorFragment.f31314o0 = iIntValue2;
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m36960p5(KycSeniorFragment kycSeniorFragment, long j11, Object obj) throws JSONException {
        kycSeniorFragment.hideDialogLoading();
        kycSeniorFragment.m36995r5(null, j11);
        IWebService.f54644a.get().mo36738a("onKycSuccess");
        C12572a.m23695d("MaunalResult", Boolean.TRUE, 0L, 4, null);
        FragmentActivity activity = kycSeniorFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = kycSeniorFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m36970w4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m36972x4(KycSeniorFragment kycSeniorFragment, Throwable th2) {
        kycSeniorFragment.hideDialogLoading();
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m36974y4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m36978Q4(final int i11) {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(this), "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA");
            final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycSeniorFragment.m36919R4(this.f31379b, i11, activity, ((Boolean) obj).booleanValue());
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.kyc.ui.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycSeniorFragment.m36921S4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kyc.ui.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycSeniorFragment.m36923T4(this.f31388b, activity, (Throwable) obj);
                }
            };
            getDestroyDisposable().add(observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.kyc.ui.f0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycSeniorFragment.m36925U4(function2, obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j5 */
    public final void m36987j5(final int i11) {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!this.f31307h0) {
                C46126b rxPermissions = getRxPermissions();
                Intrinsics.checkNotNullExpressionValue(rxPermissions, "getRxPermissions(...)");
                Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(rxPermissions, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
                final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.y
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KycSeniorFragment.m36948k5(this.f31591b, i11, activity, (Boolean) obj);
                    }
                };
                Disposable disposableSubscribe = observableM49936e.subscribe(new Consumer() { // from class: com.kubi.kyc.ui.z
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        KycSeniorFragment.m36951l5(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
                return;
            }
            m36978Q4(i11);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        if (this.f31312m0 == 0 && this.f31306g0 == null) {
            showDialogLoading();
            Observable observableZip = Observable.zip(m36994r4().m1517e().compose(C24217a1.m58389m()), m36994r4().m1515c().compose(C24217a1.m58389m()), new BiFunction() { // from class: com.kubi.kyc.ui.l
                @Override // io.reactivex.functions.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return KycSeniorFragment.m36966u4(this.f31536b, (KycInfoEntity) obj, (String) obj2);
                }
            });
            final Function1 function1 = new Function1() { // from class: com.kubi.kyc.ui.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycSeniorFragment.m36968v4(this.f31539b, (KycSeniorFragment.Signature) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.kyc.ui.n
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycSeniorFragment.m36970w4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.kyc.ui.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycSeniorFragment.m36972x4(this.f31545b, (Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableZip.subscribe(consumer, new Consumer() { // from class: com.kubi.kyc.ui.p
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycSeniorFragment.m36974y4(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m36991o4() {
        addSubscription(m36994r4().m1519g().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.kyc.ui.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycSeniorFragment.m36959p4(this.f31570b, (UserKycWayEntity) obj);
            }
        }, new C24223c1(this)));
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        UploadImageView2 uploadImageView2;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null) {
            String strM66668h = C27041f.m66668h(ImagePickerHelper.m58392a(data));
            int i11 = 0;
            int i12 = 1;
            if (requestCode != 1) {
                if (requestCode != 2) {
                    if (requestCode == 3 && (uploadImageView2 = this.f31304e0) != null) {
                        if (this.f31312m0 == 0) {
                            i11 = 1;
                        }
                        uploadImageView2.m37105i(strM66668h, i11, 2, new C17134a().m37000c(this.f31301b0));
                        return;
                    }
                    return;
                }
                UploadImageView2 uploadImageView3 = this.f31303d0;
                if (uploadImageView3 != null) {
                    if (this.f31312m0 == 0) {
                        i11 = 1;
                    }
                    uploadImageView3.m37105i(strM66668h, i11, 1, new C17134a().m37000c(this.f31300a0));
                    return;
                }
                return;
            }
            UploadImageView2 uploadImageView4 = this.f31302c0;
            if (uploadImageView4 != null) {
                if (this.f31312m0 != 0) {
                    i12 = 0;
                }
                uploadImageView4.m37105i(strM66668h, i12, 0, new C17134a().m37000c(this.f31299Z));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: renamed from: r5 */
    public final void m36995r5(String str, long j11) throws JSONException {
        String strM66668h = C27041f.m66668h(getF34283V());
        JSONObject jSONObject = new JSONObject();
        C0384b.m1522b(jSONObject, this.f31297X);
        C0384b.m1521a(jSONObject, str, j11);
        jSONObject.put("receive_reason", this.f31309j0);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM66668h, "operation", "1", jSONObject);
    }
}
