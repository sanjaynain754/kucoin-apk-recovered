package com.kubi.operation.lib.widgets.userstatus;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import at.C4388d;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.facebook.react.uimanager.PixelUtil;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.entity.CommonCardInfo;
import com.kubi.operation.lib.entity.UserStatusInfoResponseEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ws.C45918a;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: UserStatusGuideCardView.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 92\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0018\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0010\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0018\u0010,\u001a\u00020$2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(H\u0002J \u0010-\u001a\u00020$2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u001c\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010\u00102\b\u00103\u001a\u0004\u0018\u00010\"H\u0002J\u0010\u00104\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0018\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0018\u00107\u001a\u00020$2\u0006\u00106\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0018H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006:"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusGuideCardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ivArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "ivClose", "ivArtwork", "Lcom/kubi/resources/widget/round/widget/RoundImageView;", "tvTag", "Lcom/kubi/resources/widget/BaseTextView;", "tvTitle", "tvSubTitle", "btnAction", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "cardRoot", "Landroid/view/View;", "curData", "Lcom/kubi/operation/lib/entity/CommonCardInfo;", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "getRepo", "()Lcom/kubi/operation/lib/api/OperationRepo;", "repo$delegate", "Lkotlin/Lazy;", "getCloseCount", "Lcom/kubi/utils/storage/StorageId;", "bizID", "", "bindData", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "fragment", "Landroidx/fragment/app/Fragment;", "bindCard", "data", "onCardClick", "onClickClose", "deleteDynamicCard", "neverShowAgain", "", "bindTag", "bindTitle", "tv", "text", "bindAction", "bindBtnBg", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindActionClick", "bindArtwork", "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserStatusGuideCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStatusGuideCardView.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusGuideCardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,299:1\n1563#2:300\n1634#2,2:301\n1636#2:304\n1563#2:305\n1634#2,2:306\n1636#2:309\n470#3:303\n470#3:308\n470#3:313\n470#3:314\n67#4:310\n58#4,2:311\n*S KotlinDebug\n*F\n+ 1 UserStatusGuideCardView.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusGuideCardView\n*L\n152#1:300\n152#1:301,2\n152#1:304\n213#1:305\n213#1:306,2\n213#1:309\n152#1:303\n213#1:308\n263#1:313\n269#1:314\n117#1:310\n120#1:311,2\n*E\n"})
public final class UserStatusGuideCardView extends FrameLayout {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f36949l = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public AppCompatImageView f36950b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public AppCompatImageView f36951c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public RoundImageView f36952d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BaseTextView f36953e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public BaseTextView f36954f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BaseTextView f36955g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public KcPrimaryButton f36956h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public View f36957i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public CommonCardInfo f36958j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Lazy f36959k;

    /* JADX INFO: compiled from: UserStatusGuideCardView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusGuideCardView$Companion;", "", "<init>", "()V", "DELETE_ONE_DAY", "", "STORAGE_PREFIX", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusGuideCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusGuideCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public static final OperationRepo m43779A() {
        return new OperationRepo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OperationRepo getRepo() {
        return (OperationRepo) this.f36959k.getValue();
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m43792s(UserStatusGuideCardView userStatusGuideCardView, CommonCardInfo commonCardInfo, Fragment fragment) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", commonCardInfo.getBizId());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "guideCard", "close", jSONObject);
        StorageId<Integer> storageIdM43803w = userStatusGuideCardView.m43803w(commonCardInfo.getBizId());
        int iM102323e = C46392a.m102323e(storageIdM43803w, 0);
        if (iM102323e >= 1) {
            userStatusGuideCardView.m43805y(commonCardInfo, fragment);
            return Unit.INSTANCE;
        }
        C46392a.m102329l(storageIdM43803w, iM102323e + 1);
        userStatusGuideCardView.m43802v(fragment, commonCardInfo, false);
        C27046k.m66700o(userStatusGuideCardView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final void m43795j(View view, final CommonCardInfo commonCardInfo) {
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusGuideCardView.m43788k(commonCardInfo, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m43796l(CommonCardInfo commonCardInfo) {
        RoundImageView roundImageView = this.f36952d;
        if (roundImageView == null) {
            return;
        }
        String strShowCardBottomUrl = commonCardInfo.showCardBottomUrl();
        if (strShowCardBottomUrl == null || strShowCardBottomUrl.length() == 0) {
            C27046k.m66700o(roundImageView);
            return;
        }
        C5313g<Drawable> c5313gMo6634v = ComponentCallbacks2C5309c.m6557u(this).mo6634v(commonCardInfo.showCardBottomUrl());
        int i11 = R$color.c_transparent;
        c5313gMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(roundImageView);
        C27046k.m66685H(roundImageView);
    }

    /* JADX INFO: renamed from: p */
    public final void m43798p(final CommonCardInfo commonCardInfo) {
        Object objM103844constructorimpl;
        View view = this.f36957i;
        if (view == null) {
            return;
        }
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusGuideCardView.m43791q(this.f37044b, commonCardInfo);
            }
        }, 1, null);
        List<String> listShowCardBg = commonCardInfo.showCardBg();
        if (listShowCardBg == null || listShowCardBg.isEmpty()) {
            return;
        }
        List<String> listShowCardBg2 = commonCardInfo.showCardBg();
        CommonCardInfo commonCardInfo2 = this.f36958j;
        if (C45918a.m101369a(listShowCardBg2, commonCardInfo2 != null ? commonCardInfo2.showCardBg() : null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listShowCardBg, 10));
                Iterator<T> it = listShowCardBg.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
                }
                objM103844constructorimpl = Result.m103844constructorimpl(CollectionsKt.toIntArray(arrayList));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            int[] iArr = (int[]) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            if (iArr == null) {
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
            gradientDrawable.setCornerRadius(C27040e.m66658b(16));
            gradientDrawable.setStroke(RangesKt.coerceAtLeast(MathKt.roundToInt(PixelUtil.INSTANCE.dpToPx(0.5d)), 1), ContextCompat.getColor(getContext(), R$color.neutral));
            view.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43799r(@Nullable UserStatusInfoResponseEntity userStatusInfoResponseEntity, @NotNull final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (userStatusInfoResponseEntity == null || !userStatusInfoResponseEntity.showCommonCard()) {
            C27046k.m66700o(this);
            return;
        }
        C27046k.m66685H(this);
        final CommonCardInfo commonCardInfo = userStatusInfoResponseEntity.getCommonCardInfo();
        if (commonCardInfo == null) {
            return;
        }
        m43798p(commonCardInfo);
        m43801u(this.f36954f, commonCardInfo.getTitle());
        m43801u(this.f36955g, commonCardInfo.getSubTitle());
        m43794i(commonCardInfo);
        m43796l(commonCardInfo);
        m43800t(commonCardInfo);
        AppCompatImageView appCompatImageView = this.f36951c;
        if (appCompatImageView != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserStatusGuideCardView.m43792s(this.f37034b, commonCardInfo, fragment);
                }
            }, 1, null);
        }
        this.f36958j = commonCardInfo;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", commonCardInfo.getBizId());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "guideCard", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m43800t(CommonCardInfo commonCardInfo) {
        Object objM103844constructorimpl;
        BaseTextView baseTextView = this.f36953e;
        if (baseTextView == null) {
            return;
        }
        String cardName = commonCardInfo.getCardName();
        if (cardName == null || cardName.length() == 0) {
            C27046k.m66700o(baseTextView);
        } else {
            baseTextView.setText(commonCardInfo.getCardName());
            C4388d.m3998g(baseTextView, 0, 1, null);
            C27046k.m66685H(baseTextView);
        }
        List<String> listShowTagBg = commonCardInfo.showTagBg();
        if (listShowTagBg == null || listShowTagBg.isEmpty()) {
            return;
        }
        CommonCardInfo commonCardInfo2 = this.f36958j;
        if (C45918a.m101369a(listShowTagBg, commonCardInfo2 != null ? commonCardInfo2.showTagBg() : null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listShowTagBg, 10));
                Iterator<T> it = listShowTagBg.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
                }
                objM103844constructorimpl = Result.m103844constructorimpl(CollectionsKt.toIntArray(arrayList));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            int[] iArr = (int[]) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
            if (iArr == null) {
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
            gradientDrawable.setCornerRadius(C27040e.m66658b(6));
            baseTextView.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m43801u(BaseTextView baseTextView, String str) {
        if (baseTextView != null) {
            if ((str == null ? "" : str).length() == 0) {
                C27046k.m66700o(baseTextView);
                return;
            }
            if (str == null) {
                str = "";
            }
            baseTextView.setText(str);
            C4388d.m3998g(baseTextView, 0, 1, null);
            C27046k.m66685H(baseTextView);
        }
    }

    /* JADX INFO: renamed from: w */
    public final StorageId<Integer> m43803w(String str) {
        StorageId storageId = new StorageId("CATE_KV_HOME", "key_home_user_guide_dialog-" + str, null, false, 12, null);
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        return storageId.m102384f(strH);
    }

    /* JADX INFO: renamed from: y */
    public final void m43805y(final CommonCardInfo commonCardInfo, final Fragment fragment) {
        UserStatusCloseDialogManager.m43906e(commonCardInfo, new Function1() { // from class: com.kubi.operation.lib.widgets.userstatus.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserStatusGuideCardView.m43793z(this.f37039b, fragment, commonCardInfo, ((Boolean) obj).booleanValue());
            }
        }).m54193s3(fragment, "UserStatusCloseDialog");
    }

    public /* synthetic */ UserStatusGuideCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m43788k(CommonCardInfo commonCardInfo, UserStatusGuideCardView userStatusGuideCardView) throws JSONException {
        String btnUrl = commonCardInfo.getBtnUrl();
        if (btnUrl != null && btnUrl.length() != 0) {
            RouteExKt.m56217H(commonCardInfo.getBtnUrl());
        } else {
            userStatusGuideCardView.m43804x(commonCardInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m43789n(KcPrimaryButton kcPrimaryButton, String str) {
        kcPrimaryButton.setBackgroundColorInt(Color.parseColor(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m43790o(KcPrimaryButton kcPrimaryButton, String str) {
        kcPrimaryButton.setTextColor(Color.parseColor(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m43791q(UserStatusGuideCardView userStatusGuideCardView, CommonCardInfo commonCardInfo) throws JSONException {
        userStatusGuideCardView.m43804x(commonCardInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m43793z(UserStatusGuideCardView userStatusGuideCardView, Fragment fragment, CommonCardInfo commonCardInfo, boolean z11) {
        C27046k.m66700o(userStatusGuideCardView);
        userStatusGuideCardView.m43802v(fragment, commonCardInfo, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m43794i(CommonCardInfo commonCardInfo) {
        boolean z11;
        String btnTxt = commonCardInfo.getBtnTxt();
        if (btnTxt != null && !StringsKt.isBlank(btnTxt)) {
            z11 = false;
        } else {
            z11 = true;
        }
        View view = this.f36950b;
        if (view != null) {
            if (!z11) {
                C27046k.m66700o(view);
            } else {
                C27046k.m66685H(view);
            }
            m43795j(view, commonCardInfo);
        }
        KcPrimaryButton kcPrimaryButton = this.f36956h;
        if (kcPrimaryButton != null) {
            if (!z11) {
                C27046k.m66685H(kcPrimaryButton);
            } else {
                C27046k.m66700o(kcPrimaryButton);
            }
            CharSequence btnTxt2 = commonCardInfo.getBtnTxt();
            if (btnTxt2 == null) {
                btnTxt2 = "";
            }
            kcPrimaryButton.setText(btnTxt2);
            m43795j(kcPrimaryButton, commonCardInfo);
            m43797m(kcPrimaryButton, commonCardInfo);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m43797m(final KcPrimaryButton kcPrimaryButton, CommonCardInfo commonCardInfo) {
        String strShowBtnBgColor;
        final String strShowBtnBgColor2 = commonCardInfo.showBtnBgColor();
        String strShowBtnColor = null;
        if (strShowBtnBgColor2 != null && strShowBtnBgColor2.length() != 0) {
            CommonCardInfo commonCardInfo2 = this.f36958j;
            if (commonCardInfo2 != null) {
                strShowBtnBgColor = commonCardInfo2.showBtnBgColor();
            } else {
                strShowBtnBgColor = null;
            }
            if (!Intrinsics.areEqual(strShowBtnBgColor2, strShowBtnBgColor)) {
                C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserStatusGuideCardView.m43789n(kcPrimaryButton, strShowBtnBgColor2);
                    }
                });
            }
        }
        final String strShowBtnColor2 = commonCardInfo.showBtnColor();
        if (strShowBtnColor2 != null && strShowBtnColor2.length() != 0) {
            CommonCardInfo commonCardInfo3 = this.f36958j;
            if (commonCardInfo3 != null) {
                strShowBtnColor = commonCardInfo3.showBtnColor();
            }
            if (!Intrinsics.areEqual(strShowBtnColor2, strShowBtnColor)) {
                C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.m
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserStatusGuideCardView.m43790o(kcPrimaryButton, strShowBtnColor2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m43802v(Fragment fragment, CommonCardInfo commonCardInfo, boolean z11) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragment), C41782z0.m91392b(), null, new UserStatusGuideCardView$deleteDynamicCard$1(this, commonCardInfo, z11, null), 2, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m43804x(CommonCardInfo commonCardInfo) throws JSONException {
        RouteExKt.m56217H(commonCardInfo.getCardUrl());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", commonCardInfo.getBizId());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "guideCard", "actionBtn", jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusGuideCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36959k = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusGuideCardView.m43779A();
            }
        });
        LayoutInflater.from(context).inflate(R$layout.operation_view_user_status_guide_card, (ViewGroup) this, true);
        this.f36957i = findViewById(R$id.user_status_guide_card);
        this.f36956h = (KcPrimaryButton) findViewById(R$id.btnAction);
        this.f36950b = (AppCompatImageView) findViewById(R$id.ivArrow);
        this.f36952d = (RoundImageView) findViewById(R$id.ivArtwork);
        this.f36951c = (AppCompatImageView) findViewById(R$id.ivClose);
        this.f36953e = (BaseTextView) findViewById(R$id.tvTag);
        this.f36954f = (BaseTextView) findViewById(R$id.tvTitle);
        this.f36955g = (BaseTextView) findViewById(R$id.tvSubTitle);
    }
}
