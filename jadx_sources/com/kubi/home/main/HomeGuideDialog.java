package com.kubi.home.main;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.entity.AppGuidePopUpEntity;
import com.kubi.home.entity.HomeAppGuideEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteBizConfigKey;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeGuideDialog.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0016J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/main/HomeGuideDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "animatorSet", "Landroid/animation/AnimatorSet;", "getAnimatorSet$HomeLib_googleRelease", "()Landroid/animation/AnimatorSet;", "setAnimatorSet$HomeLib_googleRelease", "(Landroid/animation/AnimatorSet;)V", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeGuideDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeGuideDialog.kt\ncom/kubi/home/main/HomeGuideDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class HomeGuideDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public static final Companion f25729r0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public AnimatorSet f25730q0;

    /* JADX INFO: compiled from: HomeGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/main/HomeGuideDialog$Companion;", "", "<init>", "()V", "KEY_DATA", "", "instance", "Lcom/kubi/home/main/HomeGuideDialog;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/HomeAppGuideEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HomeGuideDialog instance(@NotNull HomeAppGuideEntity entity) {
            Intrinsics.checkNotNullParameter(entity, "entity");
            HomeGuideDialog homeGuideDialog = new HomeGuideDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.home_dialog_chop_guide);
            bundle.putInt("type", 9);
            bundle.putParcelable("HomeGuideDialog_Data", entity);
            homeGuideDialog.setArguments(bundle);
            return homeGuideDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeGuideDialog$onViewCreated$1 */
    /* JADX INFO: compiled from: HomeGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.main.HomeGuideDialog$onViewCreated$1", m90122f = "HomeGuideDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145941 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $btnView;
        int label;
        final /* synthetic */ HomeGuideDialog this$0;

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.$btnView, "scaleX", 1.0f, 1.05f, 1.0f);
            objectAnimatorOfFloat.setDuration(1100L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.$btnView, "scaleY", 1.0f, 1.05f, 1.0f);
            objectAnimatorOfFloat2.setDuration(1100L);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            HomeGuideDialog homeGuideDialog = this.this$0;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.start();
            homeGuideDialog.m29320l4(animatorSet);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C145941(View view, HomeGuideDialog homeGuideDialog, Continuation<? super C145941> continuation) {
            super(2, continuation);
            this.$btnView = view;
            this.this$0 = homeGuideDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C145941(this.$btnView, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C145941) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull final DialogFragmentHelper dialogFragmentHelper) {
        final HomeAppGuideEntity homeAppGuideEntity;
        String amount;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        Bundle arguments = getArguments();
        if (arguments == null || (homeAppGuideEntity = (HomeAppGuideEntity) RouteExKt.m56274t(arguments, "HomeGuideDialog_Data")) == null) {
            return;
        }
        int i11 = R$id.tvTitle;
        AppGuidePopUpEntity popUp = homeAppGuideEntity.getPopUp();
        viewHolder.setText(i11, popUp != null ? popUp.getTitle() : null);
        int i12 = R$id.tvSubTitle;
        AppGuidePopUpEntity popUp2 = homeAppGuideEntity.getPopUp();
        viewHolder.setText(i12, popUp2 != null ? popUp2.getSubtitle() : null);
        AppGuidePopUpEntity popUp3 = homeAppGuideEntity.getPopUp();
        if (popUp3 == null || (amount = popUp3.getAmount()) == null) {
            amount = "0";
        }
        String strM92640e = C42180b.m92640e(new BigDecimal(amount), null, 0, false, false, false, 0, null, 127, null);
        int i13 = R$id.tvAmount;
        TextView textView = (TextView) viewHolder.getView(i13);
        CharSequence charSequenceM58031c = C24129b.m58031c(SiteBizConfigKey.QuoteCurrency);
        int i14 = R$id.tvAmountUnit;
        viewHolder.setText(i14, charSequenceM58031c);
        int i15 = R$id.tvAmountUnitOverflow;
        viewHolder.setText(i15, charSequenceM58031c);
        if (strM92640e.length() <= 7) {
            viewHolder.setGone(i14, true);
            viewHolder.setGone(i15, false);
            textView.setTextSize(2, 36.0f);
        } else {
            viewHolder.setGone(i14, false);
            viewHolder.setGone(i15, true);
            textView.setTextSize(2, 30.0f);
        }
        viewHolder.setText(i13, strM92640e);
        int i16 = R$id.tvTips;
        AppGuidePopUpEntity popUp4 = homeAppGuideEntity.getPopUp();
        viewHolder.setText(i16, popUp4 != null ? popUp4.getTips() : null);
        int i17 = R$id.btnJoinNow;
        AppGuidePopUpEntity popUp5 = homeAppGuideEntity.getPopUp();
        viewHolder.setText(i17, popUp5 != null ? popUp5.getBtn() : null);
        View view = viewHolder.getView(i17);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.home.main.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeGuideDialog.m29318m4(homeAppGuideEntity, dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.home.main.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeGuideDialog.m29319n4(dialogFragmentHelper);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m29320l4(@Nullable AnimatorSet animatorSet) {
        this.f25730q0 = animatorSet;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R$id.btnJoinNow);
        if (viewFindViewById == null) {
            return;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C145941(viewFindViewById, this, null));
    }

    public HomeGuideDialog() {
        m54236e4(this);
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m29318m4(HomeAppGuideEntity homeAppGuideEntity, DialogFragmentHelper dialogFragmentHelper) {
        String jumpUrl = homeAppGuideEntity.getJumpUrl();
        if (jumpUrl != null) {
            Router.f46192a.m56184f(jumpUrl).m4048k();
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m29319n4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AnimatorSet animatorSet = this.f25730q0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f25730q0 = null;
    }
}
