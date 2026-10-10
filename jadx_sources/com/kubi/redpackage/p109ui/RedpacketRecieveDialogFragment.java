package com.kubi.redpackage.p109ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.redpackage.R$drawable;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.R$style;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.RedPackageHelperKt;
import com.kubi.redpackage.entity.RedPacketErrorResourceEntity;
import com.kubi.redpackage.entity.RedpacketInfoEntity;
import com.kubi.redpackage.entity.RedpacketReceiveEntity;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.redpackage.utils.StringsExtKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24217a1;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27015b;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37767s;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p845zv.C46928a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RedpacketRecieveDialogFragment.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J0\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J8\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "api", "Lcom/kubi/redpackage/RedPackageApi;", "getApi", "()Lcom/kubi/redpackage/RedPackageApi;", "api$delegate", "Lkotlin/Lazy;", "redpacketCode", "", "info", "Lcom/kubi/redpackage/entity/RedpacketInfoEntity;", "getParams", "", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "showViewByStatus", "packetInfo", "tvOpen", "Landroid/widget/TextView;", "tvTips", "tvName", "tvHint", "onClickOpen", "helper", "handleApiError", "throwable", "Lcom/kubi/network/retrofit/exception/ApiException;", "startTimeOpen", "", "showRedPacketErrorResource", "code", "showToast", "Companion", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"SetTextI18n"})
public final class RedpacketRecieveDialogFragment extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f43196t0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f43197q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public String f43198r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public RedpacketInfoEntity f43199s0;

    /* JADX INFO: compiled from: RedpacketRecieveDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "KEY_INFO", "KEY_CODE", TIMPushProvider.f75062n, "Lcom/kubi/resources/dialog/BaseDialogFragment;", "fm", "Landroidx/fragment/app/FragmentManager;", "redpacketCode", "info", "Lcom/kubi/redpackage/entity/RedpacketInfoEntity;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BaseDialogFragment show(@NotNull FragmentManager fm2, @NotNull String redpacketCode, @NotNull RedpacketInfoEntity info) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(redpacketCode, "redpacketCode");
            Intrinsics.checkNotNullParameter(info, "info");
            RedpacketRecieveDialogFragment redpacketRecieveDialogFragment = new RedpacketRecieveDialogFragment();
            C27051h c27051h = new C27051h();
            c27051h.m66720d(TtmlNode.TAG_LAYOUT, R$layout.bredpackage_dialog_redpacket_receive);
            c27051h.m66720d("type", 4);
            c27051h.m66720d("anim", R$style.BRedPackage_DialogAnimation);
            c27051h.m66719c("isBottomSheet", false);
            c27051h.m66724h("redpacket_key_code", redpacketCode);
            c27051h.m66721e("redpacket_key_info", info);
            c27051h.m66718b(redpacketRecieveDialogFragment);
            redpacketRecieveDialogFragment.setCancelable(false);
            redpacketRecieveDialogFragment.show(fm2, redpacketCode);
            return redpacketRecieveDialogFragment;
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m54054D4(TextView textView, TextView textView2, ImageView imageView, boolean z11) {
        if (textView != null) {
            textView.setBackgroundResource(z11 ? R$drawable.shape_redpackage_text_bg_cover : 0);
        }
        if (textView2 != null) {
            textView2.setBackgroundResource(z11 ? R$drawable.shape_redpackage_text_bg_cover : 0);
        }
        imageView.setVisibility(z11 ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: B4 */
    public final void m54082B4(ApiException apiException, RedpacketInfoEntity redpacketInfoEntity, DialogFragmentHelper dialogFragmentHelper, TextView textView, TextView textView2, long j11) {
        String str = apiException.code;
        if (str != null) {
            switch (str.hashCode()) {
                case 1484801322:
                    if (str.equals("285009")) {
                        InterfaceC37767s.a.m85193b(C37304a.f82764a, C27041f.m66668h(redpacketInfoEntity.getSendRecordId()), null, null, null, null, null, null, 126, null);
                        dialogFragmentHelper.dismissAllowingStateLoss();
                        return;
                    }
                    break;
                case 1484801344:
                    if (str.equals("285010")) {
                        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new RedpacketRecieveDialogFragment$handleApiError$1(this, textView, textView2, null));
                        return;
                    }
                    break;
                case 1484801375:
                    if (str.equals("285020")) {
                        C27046k.m66703r(textView);
                        textView2.setText(R$string.redpacket_expired);
                        return;
                    }
                    break;
                case 1484801409:
                    if (str.equals("285033")) {
                        Object obj = apiException.data;
                        RedpacketReceiveEntity redpacketReceiveEntity = obj instanceof RedpacketReceiveEntity ? (RedpacketReceiveEntity) obj : null;
                        String resourceId = redpacketReceiveEntity != null ? redpacketReceiveEntity.getResourceId() : null;
                        if (resourceId == null || resourceId.length() == 0) {
                            m54085P4(apiException);
                            return;
                        } else {
                            m54084J4(resourceId, apiException);
                            return;
                        }
                    }
                    break;
            }
        }
        m54085P4(apiException);
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m54086Q4(RedpacketInfoEntity redpacketInfoEntity, TextView textView, TextView textView2, TextView textView3, TextView textView4) throws JSONException {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(redpacketInfoEntity.getCurrency()));
        Integer welfareStatus = redpacketInfoEntity.getWelfareStatus();
        if (welfareStatus != null && welfareStatus.intValue() == 3) {
            C27046k.m66703r(textView);
            textView2.setText(R$string.redpacket_expired);
            C46928a.m103398d(RedPkgCategory.RECEIVE_QUERY_EXPIRED, false, null, null, 7, null);
        } else if (C27025c.m66566d(redpacketInfoEntity.getReceive())) {
            C27046k.m66703r(textView);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R$string.received));
            sb2.append('\n');
            BigDecimal receiveAmount = redpacketInfoEntity.getReceiveAmount();
            sb2.append(receiveAmount != null ? C37885i.m85570i(receiveAmount, redpacketInfoEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
            sb2.append(' ');
            sb2.append(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null));
            textView2.setText(sb2.toString());
            C46928a.m103398d(RedPkgCategory.RECEIVE_QUERY_RECEIVED, false, null, null, 7, null);
        } else {
            textView2.setText(C27041f.m66668h(redpacketInfoEntity.getBestWishes()));
        }
        Integer receiveStatus = redpacketInfoEntity.getReceiveStatus();
        if (receiveStatus != null && receiveStatus.intValue() == 12) {
            C27046k.m66703r(textView);
            textView2.setText(getString(R$string.redpacket_return));
            C46928a.m103398d(RedPkgCategory.RECEIVE_QUERY_REBACK, false, null, null, 7, null);
        }
        textView3.setText(C27041f.m66668h(redpacketInfoEntity.getNickName()));
        textView4.setText(getString(R$string.donated_redpacket, C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public static final Unit m54055E4(DialogFragmentHelper dialogFragmentHelper) {
        C12572a.m23695d("com.kubi.redpackage_event:H5Result", RedPackageHelperKt.m53721j(null, -1, "cancelled", false, 9, null), 0L, 4, null);
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m54056F4(final RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, final TextView textView, final TextView textView2, final DialogFragmentHelper dialogFragmentHelper, final RedpacketInfoEntity redpacketInfoEntity) {
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.redpackage.ui.a4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54057G4(this.f43210b, textView, textView2, dialogFragmentHelper, redpacketInfoEntity);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m54059I4(RedpacketInfoEntity redpacketInfoEntity) {
        InterfaceC37767s.a.m85193b(C37304a.f82764a, C27041f.m66668h(redpacketInfoEntity.getSendRecordId()), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final RedPackageApi m54080y4() {
        return (RedPackageApi) RetrofitFlowExKt.m42820a(RedPackageApi.class);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m54083C4(final TextView textView, final TextView textView2, final DialogFragmentHelper dialogFragmentHelper, final RedpacketInfoEntity redpacketInfoEntity) {
        textView.startAnimation(C27015b.m66506a(new Animation.AnimationListener() { // from class: com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$onClickOpen$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                LifecycleOwnerKt.getLifecycleScope(this.f43200a).launchWhenStarted(new RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1(this.f43200a, animation, redpacketInfoEntity, dialogFragmentHelper, textView, textView2, System.currentTimeMillis(), null));
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        }));
    }

    /* JADX INFO: renamed from: J4 */
    public final void m54084J4(final String str, final ApiException apiException) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.redpackage.ui.b4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54060K4(str, this, apiException);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull final DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        m54081A4();
        final RedpacketInfoEntity redpacketInfoEntity = this.f43199s0;
        if (redpacketInfoEntity == null || (str = this.f43198r0) == null || str.length() == 0) {
            dialogFragmentHelper.dismissAllowingStateLoss();
            return;
        }
        final ImageView imageView = (ImageView) viewHolder.getView(R$id.iv_close);
        final TextView textView = (TextView) viewHolder.getView(R$id.tv_name);
        final TextView textView2 = (TextView) viewHolder.getView(R$id.tv_hint);
        final TextView textView3 = (TextView) viewHolder.getView(R$id.tv_tips);
        final TextView textView4 = (TextView) viewHolder.getView(R$id.tv_open);
        TextView textView5 = (TextView) viewHolder.getView(R$id.tv_view);
        LinearLayout linearLayout = (LinearLayout) viewHolder.getView(R$id.ll_new);
        ImageView imageView2 = (ImageView) viewHolder.getView(R$id.iv_cover);
        final ImageView imageView3 = (ImageView) viewHolder.getView(R$id.iv_cover_mask);
        boolean newBee = redpacketInfoEntity.getNewBee();
        Intrinsics.checkNotNull(linearLayout);
        if (newBee) {
            ViewExtKt.m66594y(linearLayout);
        } else {
            ViewExtKt.m66577h(linearLayout);
        }
        StringsExtKt.loadImage(imageView2, redpacketInfoEntity.getExtendUrl(), new Function1() { // from class: com.kubi.redpackage.ui.v3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedpacketRecieveDialogFragment.m54054D4(textView, textView2, imageView3, ((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNull(textView4);
        Intrinsics.checkNotNull(textView3);
        Intrinsics.checkNotNull(textView);
        Intrinsics.checkNotNull(textView2);
        m54086Q4(redpacketInfoEntity, textView4, textView3, textView, textView2);
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.redpackage.ui.w3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54055E4(dialogFragmentHelper);
            }
        }, 1, null);
        C27046k.m66711z(textView4, 0L, new Function0() { // from class: com.kubi.redpackage.ui.x3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54056F4(this.f43363b, textView4, textView3, dialogFragmentHelper, redpacketInfoEntity);
            }
        }, 1, null);
        Intrinsics.checkNotNull(textView5);
        C27046k.m66711z(textView5, 0L, new Function0() { // from class: com.kubi.redpackage.ui.y3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54058H4(textView4, imageView, redpacketInfoEntity);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z4 */
    public final RedPackageApi m54087z4() {
        return (RedPackageApi) this.f43197q0.getValue();
    }

    public RedpacketRecieveDialogFragment() {
        m54236e4(this);
        this.f43197q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.redpackage.ui.s3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54080y4();
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m54057G4(RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, TextView textView, TextView textView2, DialogFragmentHelper dialogFragmentHelper, RedpacketInfoEntity redpacketInfoEntity) {
        Intrinsics.checkNotNull(textView);
        Intrinsics.checkNotNull(textView2);
        redpacketRecieveDialogFragment.m54083C4(textView, textView2, dialogFragmentHelper, redpacketInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m54058H4(TextView textView, ImageView imageView, final RedpacketInfoEntity redpacketInfoEntity) {
        if (textView.getVisibility() != 0 && imageView != null) {
            imageView.performClick();
        }
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.redpackage.ui.z3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RedpacketRecieveDialogFragment.m54059I4(redpacketInfoEntity);
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m54060K4(final String str, final RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, final ApiException apiException) {
        Observable<R> observableCompose = ((RedPackageApi) C42597a.m93386b().create(RedPackageApi.class)).m53742r(str).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.redpackage.ui.c4
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedpacketRecieveDialogFragment.m54062M4(str, redpacketRecieveDialogFragment, apiException, (Map) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.redpackage.ui.d4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedpacketRecieveDialogFragment.m54063N4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.redpackage.ui.t3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RedpacketRecieveDialogFragment.m54064O4(this.f43342b, apiException, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.redpackage.ui.u3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RedpacketRecieveDialogFragment.m54061L4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, redpacketRecieveDialogFragment.getF43550U());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m54061L4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m54062M4(String str, RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, ApiException apiException, Map map) {
        RedPacketErrorResourceEntity redPacketErrorResourceEntity;
        Collection collection = (Collection) map.get(str);
        if (collection != null && !collection.isEmpty()) {
            if (redpacketRecieveDialogFragment.isAdded()) {
                List list = (List) map.get(str);
                if (list != null) {
                    redPacketErrorResourceEntity = (RedPacketErrorResourceEntity) CollectionsKt.firstOrNull(list);
                } else {
                    redPacketErrorResourceEntity = null;
                }
                if (redPacketErrorResourceEntity != null && redPacketErrorResourceEntity.isLegal()) {
                    RedPackageHelperKt.m53723l(redpacketRecieveDialogFragment.getChildFragmentManager(), (List) map.get(str));
                } else {
                    redpacketRecieveDialogFragment.m54085P4(apiException);
                }
            }
        } else {
            redpacketRecieveDialogFragment.m54085P4(apiException);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m54063N4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m54064O4(RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, ApiException apiException, Throwable th2) {
        redpacketRecieveDialogFragment.m54085P4(apiException);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m54081A4() {
        String strM56284y;
        Bundle arguments = getArguments();
        RedpacketInfoEntity redpacketInfoEntity = null;
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "redpacket_key_code");
        } else {
            strM56284y = null;
        }
        if (strM56284y == null) {
            strM56284y = "";
        }
        this.f43198r0 = strM56284y;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            redpacketInfoEntity = (RedpacketInfoEntity) RouteExKt.m56274t(arguments2, "redpacket_key_info");
        }
        this.f43199s0 = redpacketInfoEntity;
    }

    /* JADX INFO: renamed from: P4 */
    public final void m54085P4(ApiException apiException) {
        String message = apiException.getMessage();
        if (message != null && message.length() != 0) {
            ToastCompat.m66441G(apiException.getMessage(), new Object[0]);
        } else {
            ToastCompat.m66437C(R$string.system_error);
        }
    }
}
