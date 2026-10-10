package com.kubi.kyc.ui.kycv2.advance;

import ai.advance.sdk.global.iqa.GlobalIQAActivity;
import ai.advance.sdk.global.iqa.lib.IQAExtras;
import ai.advance.sdk.global.iqa.lib.UIExtras;
import ai.advance.sdk.global.iqa.lib.enums.CardSide;
import ai.advance.sdk.global.iqa.lib.enums.CardType;
import ai.advance.sdk.global.iqa.lib.enums.ScreenOrientation;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.ui.kycv2.ImagePreviewActivity;
import com.kubi.kyc.ui.kycv2.KycBridgeManager;
import com.kubi.kyc.ui.kycv2.UploadImageView3;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27052h0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p205dn.C36891k;
import p569qq.C43852m;
import p579r.C43890a;
import p611s.C44203a;
import p611s.C44206b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AdvancePreviewFragment.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0014J\b\u0010 \u001a\u00020\u0015H\u0014J\"\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/advance/AdvancePreviewFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/kyc/ui/kycv2/advance/AdvancePreviewContract$UIState;", "<init>", "()V", "advanceRequestCode", "", "kycJumpParams", "Lcom/kubi/kyc/ui/kycv2/advance/KycJumpParams;", "binding", "Lcom/kubi/kyc/databinding/KycFragmemtImageAdvanceBinding;", "getBinding", "()Lcom/kubi/kyc/databinding/KycFragmemtImageAdvanceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startAdvance", TtmlNode.TAG_REGION, "", "cardType", "Lai/advance/sdk/global/iqa/lib/enums/CardType;", "cardSide", "Lai/advance/sdk/global/iqa/lib/enums/CardSide;", "getLayout", "initView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAdvancePreviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvancePreviewFragment.kt\ncom/kubi/kyc/ui/kycv2/advance/AdvancePreviewFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n143#2,20:269\n158#3,2:289\n1#4:291\n*S KotlinDebug\n*F\n+ 1 AdvancePreviewFragment.kt\ncom/kubi/kyc/ui/kycv2/advance/AdvancePreviewFragment\n*L\n49#1:269,20\n62#1:289,2\n*E\n"})
public final class AdvancePreviewFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: V */
    @Nullable
    public KycJumpParams f31444V;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f31442Y = {Reflection.property1(new PropertyReference1Impl(AdvancePreviewFragment.class, "binding", "getBinding()Lcom/kubi/kyc/databinding/KycFragmemtImageAdvanceBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f31441X = new Companion(null);

    /* JADX INFO: renamed from: U */
    public final int f31443U = 1;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f31445W = C45681e.m100799e(this, new Function1<AdvancePreviewFragment, C36891k>() { // from class: com.kubi.kyc.ui.kycv2.advance.AdvancePreviewFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36891k invoke(@NotNull AdvancePreviewFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36891k.m82651a(fragment.requireView());
        }
    }, new Function1<C36891k, Unit>() { // from class: com.kubi.kyc.ui.kycv2.advance.AdvancePreviewFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36891k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36891k c36891k) {
            invoke(c36891k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: AdvancePreviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/advance/AdvancePreviewFragment$Companion;", "", "<init>", "()V", "TAG", "", "PAGE_ID", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.advance.AdvancePreviewFragment$onActivityResult$1 */
    /* JADX INFO: compiled from: AdvancePreviewFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.advance.AdvancePreviewFragment$onActivityResult$1", m90122f = "AdvancePreviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C171891 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C171891(Bitmap bitmap, Continuation<? super C171891> continuation) {
            super(1, continuation);
            this.$bitmap = bitmap;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AdvancePreviewFragment.this.new C171891(this.$bitmap, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C171891) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UploadImageView3 uploadImageView3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C36891k c36891kM37204q3 = AdvancePreviewFragment.this.m37204q3();
                if (c36891kM37204q3 != null && (uploadImageView3 = c36891kM37204q3.f81478c) != null) {
                    Bitmap bitmap = this.$bitmap;
                    Intrinsics.checkNotNull(bitmap);
                    uploadImageView3.m37194c(bitmap);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX INFO: renamed from: s3 */
    public static final Unit m37202s3(AdvancePreviewFragment advancePreviewFragment) {
        KycJumpParams kycJumpParams;
        Boolean boolValueOf;
        KycJumpParams kycJumpParams2;
        String frontId;
        KycJumpParams kycJumpParams3;
        String frontId2;
        JSONObject jSONObject = new JSONObject();
        KycJumpParams kycJumpParams4 = advancePreviewFragment.f31444V;
        C43852m.m96589a("B1KYC2IDPhotoScanCheck", "Confirm", "1", jSONObject.put("photo_side", kycJumpParams4 != null ? kycJumpParams4.getDirection() : null));
        KycJumpParams kycJumpParams5 = advancePreviewFragment.f31444V;
        if (C27025c.m66566d(kycJumpParams5 != null ? Boolean.valueOf(kycJumpParams5.isFront()) : null)) {
            KycJumpParams kycJumpParams6 = advancePreviewFragment.f31444V;
            if (C27025c.m66566d(kycJumpParams6 != null ? Boolean.valueOf(kycJumpParams6.isPassPort()) : null)) {
                kycJumpParams = advancePreviewFragment.f31444V;
                if (kycJumpParams != null) {
                    boolValueOf = Boolean.valueOf(kycJumpParams.isPassPort());
                } else {
                    boolValueOf = null;
                }
                if (C27025c.m66566d(boolValueOf)) {
                    if (kycJumpParams3 != null) {
                        frontId2 = kycJumpParams3.getFrontId();
                    } else {
                        frontId2 = null;
                    }
                    kycJumpParams3.setBackId(frontId2);
                }
                kycJumpParams2 = advancePreviewFragment.f31444V;
                if (kycJumpParams2 != null) {
                    frontId = kycJumpParams2.getFrontId();
                } else {
                    frontId = null;
                }
                KycJumpParams kycJumpParams7 = advancePreviewFragment.f31444V;
                C12572a.m23695d("com.kubi.kyc.event.KycEvent:lego_event", new ImagePreviewActivity.PhotoInfo(frontId, kycJumpParams7 != null ? kycJumpParams7.getBackId() : null, Boolean.TRUE, "ADVANCE"), 0L, 4, null);
                C12572a.m23695d("activity_finish", null, 0L, 6, null);
            } else {
                KycJumpParams kycJumpParams8 = advancePreviewFragment.f31444V;
                if (kycJumpParams8 != null) {
                    kycJumpParams8.setDirection(ConstantsKt.FACE_CAPTURE_MODE_BACK);
                }
                FragmentActivity activity = advancePreviewFragment.getActivity();
                if (activity != null) {
                    KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
                    Bundle bundleM66717a = new C27051h().m66721e("kyc_jump", advancePreviewFragment.f31444V).m66717a();
                    Intrinsics.checkNotNullExpressionValue(bundleM66717a, "getBundle(...)");
                    kycBridgeManager.m37188u(activity, bundleM66717a, advancePreviewFragment.getDestroyDisposable());
                }
            }
        } else {
            kycJumpParams = advancePreviewFragment.f31444V;
            if (kycJumpParams != null) {
                boolValueOf = Boolean.valueOf(kycJumpParams.isPassPort());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf) && (kycJumpParams3 = advancePreviewFragment.f31444V) != null) {
                if (kycJumpParams3 != null) {
                    frontId2 = kycJumpParams3.getFrontId();
                } else {
                    frontId2 = null;
                }
                kycJumpParams3.setBackId(frontId2);
            }
            kycJumpParams2 = advancePreviewFragment.f31444V;
            if (kycJumpParams2 != null) {
                frontId = kycJumpParams2.getFrontId();
            } else {
                frontId = null;
            }
            KycJumpParams kycJumpParams9 = advancePreviewFragment.f31444V;
            C12572a.m23695d("com.kubi.kyc.event.KycEvent:lego_event", new ImagePreviewActivity.PhotoInfo(frontId, kycJumpParams9 != null ? kycJumpParams9.getBackId() : null, Boolean.TRUE, "ADVANCE"), 0L, 4, null);
            C12572a.m23695d("activity_finish", null, 0L, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m37203t3(AdvancePreviewFragment advancePreviewFragment) {
        JSONObject jSONObject = new JSONObject();
        KycJumpParams kycJumpParams = advancePreviewFragment.f31444V;
        C43852m.m96589a("B1KYC2IDPhotoScanCheck", "Retake", "1", jSONObject.put("photo_side", kycJumpParams != null ? kycJumpParams.getDirection() : null));
        FragmentActivity activity = advancePreviewFragment.getActivity();
        if (activity != null) {
            KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
            Bundle bundleM66717a = new C27051h().m66721e("kyc_jump", advancePreviewFragment.f31444V).m66717a();
            Intrinsics.checkNotNullExpressionValue(bundleM66717a, "getBundle(...)");
            kycBridgeManager.m37188u(activity, bundleM66717a, advancePreviewFragment.getDestroyDisposable());
            FragmentActivity activity2 = advancePreviewFragment.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kyc_fragmemt_image_advance;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AdvancePreviewViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws JSONException {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.f31443U) {
            if (C44203a.m97441n()) {
                String strM97435h = C44203a.m97435h();
                Bitmap bitmapM97432e = C44203a.m97432e();
                String strM97438k = C44203a.m97438k();
                C44203a.m97431d();
                C44203a.m97436i();
                C44203a.m97437j();
                C44203a.m97439l();
                C44203a.m97440m();
                String str = TextUtils.equals(strM97438k, "takePhoto") ? ITokenLifecycleRefreshSPI.Companion.SOURCE_MANUAL : "ai_auto";
                MviExKt.m42519o(this, new C171891(bitmapM97432e, null));
                KycJumpParams kycJumpParams = this.f31444V;
                if (C27025c.m66566d(kycJumpParams != null ? Boolean.valueOf(kycJumpParams.isFront()) : null)) {
                    KycJumpParams kycJumpParams2 = this.f31444V;
                    if (kycJumpParams2 != null) {
                        kycJumpParams2.setFrontId(strM97435h);
                    }
                } else {
                    KycJumpParams kycJumpParams3 = this.f31444V;
                    if (kycJumpParams3 != null) {
                        kycJumpParams3.setBackId(strM97435h);
                    }
                }
                KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
                KycJumpParams kycJumpParams4 = this.f31444V;
                String direction = kycJumpParams4 != null ? kycJumpParams4.getDirection() : null;
                KycJumpParams kycJumpParams5 = this.f31444V;
                KycBridgeManager.m37155O(kycBridgeManager, "finish_get_photo", "success_get_photo", null, "advance_iqa_camera", direction, kycJumpParams5 != null ? kycJumpParams5.getType() : null, str, 4, null);
                return;
            }
            String strM97433f = C44203a.m97433f();
            String strM97434g = C44203a.m97434g();
            String strM97439l = C44203a.m97439l();
            C44128b.m97259c(getTAG(), "[onActivityResult] errorCode=" + strM97433f + ",errorMsg=" + strM97434g + ",transactionId=" + strM97439l);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            KycBridgeManager kycBridgeManager2 = KycBridgeManager.f31425a;
            KycJumpParams kycJumpParams6 = this.f31444V;
            String direction2 = kycJumpParams6 != null ? kycJumpParams6.getDirection() : null;
            KycJumpParams kycJumpParams7 = this.f31444V;
            KycBridgeManager.m37155O(kycBridgeManager2, "finish_get_photo", "failed_get_photo", "errorCode=" + strM97433f + ",errorMsg=" + strM97434g + ",transactionId=" + strM97439l, "advance_iqa_camera", direction2, kycJumpParams7 != null ? kycJumpParams7.getType() : null, null, 64, null);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final C36891k m37204q3() {
        return (C36891k) this.f31445W.getValue(this, f31442Y[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m37205u3(String str, CardType cardType, CardSide cardSide) throws JSONException {
        Intent intent = new Intent(getContext(), (Class<?>) GlobalIQAActivity.class);
        intent.putExtra("iqaExtras", new IQAExtras.C0352a(str, cardType, cardSide).m1353c(false).m1352b(false).m1351a());
        intent.putExtra("uiExtras", new UIExtras.C0355a().m1394b(50).m1395c(ScreenOrientation.PORTRAIT).m1393a());
        startActivityForResult(intent, this.f31443U);
        KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
        KycJumpParams kycJumpParams = this.f31444V;
        String direction = kycJumpParams != null ? kycJumpParams.getDirection() : null;
        KycJumpParams kycJumpParams2 = this.f31444V;
        KycBridgeManager.m37155O(kycBridgeManager, "start_get_photo", null, null, "advance_iqa_camera", direction, kycJumpParams2 != null ? kycJumpParams2.getType() : null, null, 70, null);
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m37201r3(AdvancePreviewFragment advancePreviewFragment) {
        String direction;
        FragmentActivity activity = advancePreviewFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        JSONObject jSONObject = new JSONObject();
        KycJumpParams kycJumpParams = advancePreviewFragment.f31444V;
        if (kycJumpParams != null) {
            direction = kycJumpParams.getDirection();
        } else {
            direction = null;
        }
        C43852m.m96589a("B1KYC2IDPhotoScanCheck", "Back", "1", jSONObject.put("photo_side", direction));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        Boolean boolValueOf;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        ImageView imageView;
        TextView textView5;
        super.initView();
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setVisibility(8);
        }
        KycJumpParams kycJumpParams = this.f31444V;
        Boolean boolValueOf2 = null;
        if (kycJumpParams != null) {
            boolValueOf = Boolean.valueOf(kycJumpParams.isPassPort());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            C36891k c36891kM37204q3 = m37204q3();
            if (c36891kM37204q3 != null && (textView5 = c36891kM37204q3.f81483h) != null) {
                textView5.setText(getString(R$string.kyc_passport_photo));
            }
        } else {
            KycJumpParams kycJumpParams2 = this.f31444V;
            if (kycJumpParams2 != null) {
                boolValueOf2 = Boolean.valueOf(kycJumpParams2.isFront());
            }
            if (C27025c.m66566d(boolValueOf2)) {
                C36891k c36891kM37204q4 = m37204q3();
                if (c36891kM37204q4 != null && (textView2 = c36891kM37204q4.f81483h) != null) {
                    textView2.setText(getString(R$string.kyc_caputure_frontsure));
                }
            } else {
                C36891k c36891kM37204q5 = m37204q3();
                if (c36891kM37204q5 != null && (textView = c36891kM37204q5.f81483h) != null) {
                    textView.setText(getString(R$string.kyc_caputure_backsure));
                }
            }
        }
        C36891k c36891kM37204q6 = m37204q3();
        if (c36891kM37204q6 != null && (imageView = c36891kM37204q6.f81477b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.advance.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancePreviewFragment.m37201r3(this.f31446b);
                }
            }, 1, null);
        }
        C36891k c36891kM37204q7 = m37204q3();
        if (c36891kM37204q7 != null && (textView4 = c36891kM37204q7.f81481f) != null) {
            C27046k.m66711z(textView4, 0L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.advance.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancePreviewFragment.m37202s3(this.f31447b);
                }
            }, 1, null);
        }
        C36891k c36891kM37204q8 = m37204q3();
        if (c36891kM37204q8 != null && (textView3 = c36891kM37204q8.f81482g) != null) {
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.kyc.ui.kycv2.advance.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvancePreviewFragment.m37203t3(this.f31448b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) throws JSONException {
        KycJumpParams kycJumpParams;
        String frontToken;
        String direction;
        String type;
        String type2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        CardType cardType;
        Boolean boolValueOf3;
        CardSide cardSide;
        String region;
        super.onCreate(savedInstanceState);
        setPageId("B1KYC2IDPhotoScanCheck");
        if (C12573b.f21598a.m23696a()) {
            "activity_finish".length();
        }
        String transactionId = null;
        C12572a.m23692a(this, false, new AdvancePreviewFragment$onCreate$$inlined$bindFlowEvent$1("activity_finish", null, this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            kycJumpParams = (KycJumpParams) arguments.getParcelable("kyc_jump");
        } else {
            kycJumpParams = null;
        }
        this.f31444V = kycJumpParams;
        if (kycJumpParams != null) {
            frontToken = kycJumpParams.getFrontToken();
        } else {
            frontToken = null;
        }
        String strM97450j = C44206b.m97450j(frontToken);
        C43890a.m96660a(C27052h0.m66729d(UserInfo.c().uid, 2));
        if (AppConstants.AB_TEST_SUCCESS.equals(strM97450j)) {
            CardType cardType2 = CardType.ID_CARD;
            CardSide cardSide2 = CardSide.FRONT;
            KycJumpParams kycJumpParams2 = this.f31444V;
            if (kycJumpParams2 != null) {
                boolValueOf = Boolean.valueOf(kycJumpParams2.isPassPort());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                cardType = CardType.PASSPORT;
                cardSide = CardSide.FRONT;
            } else {
                KycJumpParams kycJumpParams3 = this.f31444V;
                if (kycJumpParams3 != null) {
                    boolValueOf2 = Boolean.valueOf(kycJumpParams3.isIdCard());
                } else {
                    boolValueOf2 = null;
                }
                if (C27025c.m66566d(boolValueOf2)) {
                    cardType = CardType.ID_CARD;
                } else {
                    cardType = CardType.DRIVING_LICENSE;
                }
                KycJumpParams kycJumpParams4 = this.f31444V;
                if (kycJumpParams4 != null) {
                    boolValueOf3 = Boolean.valueOf(kycJumpParams4.isFront());
                } else {
                    boolValueOf3 = null;
                }
                if (C27025c.m66566d(boolValueOf3)) {
                    cardSide = CardSide.FRONT;
                } else {
                    cardSide = CardSide.BACK;
                }
            }
            KycJumpParams kycJumpParams5 = this.f31444V;
            if (kycJumpParams5 != null) {
                region = kycJumpParams5.getRegion();
            } else {
                region = null;
            }
            if (TextUtils.isEmpty(region)) {
                m37205u3("US", cardType, cardSide);
                return;
            }
            KycJumpParams kycJumpParams6 = this.f31444V;
            if (kycJumpParams6 != null) {
                transactionId = kycJumpParams6.getRegion();
            }
            m37205u3(C27041f.m66668h(transactionId), cardType, cardSide);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            KycBridgeManager kycBridgeManager = KycBridgeManager.f31425a;
            KycJumpParams kycJumpParams7 = this.f31444V;
            if (kycJumpParams7 != null) {
                type2 = kycJumpParams7.getType();
            } else {
                type2 = null;
            }
            KycBridgeManager.m37172x(kycBridgeManager, activity, null, type2, null, 10, null);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        KycBridgeManager kycBridgeManager2 = KycBridgeManager.f31425a;
        KycJumpParams kycJumpParams8 = this.f31444V;
        if (kycJumpParams8 != null) {
            direction = kycJumpParams8.getDirection();
        } else {
            direction = null;
        }
        KycJumpParams kycJumpParams9 = this.f31444V;
        if (kycJumpParams9 != null) {
            type = kycJumpParams9.getType();
        } else {
            type = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lisence error transactionId=");
        KycJumpParams kycJumpParams10 = this.f31444V;
        if (kycJumpParams10 != null) {
            transactionId = kycJumpParams10.getTransactionId();
        }
        sb2.append(transactionId);
        KycBridgeManager.m37155O(kycBridgeManager2, "finish_get_photo", "failed_get_photo", sb2.toString(), "advance_iqa_camera", direction, type, null, 64, null);
    }
}
