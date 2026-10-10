package com.kubi.kucoin.home.cards.group;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.cardflow.R$color;
import com.kubi.cardflow.R$drawable;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.CardFlowParser;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.ICard;
import java.util.List;
import lb0.InterpolatorC42155b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GroupCard.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH\u0014J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/group/GroupCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "linearLayout", "Landroid/widget/LinearLayout;", "getParser", "Lcom/kubi/kucoin/home/cards/CardFlowParser;", "getLayout", "", "onCustomCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "initLP", "Landroid/widget/LinearLayout$LayoutParams;", "orientation", "index", "groupData", "Lcom/kubi/kucoin/home/cards/group/GroupCardData;", "onMoveStart", "onMoveStop", "releaseChildren", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGroupCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupCard.kt\ncom/kubi/kucoin/home/cards/group/GroupCard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n1#2:131\n1878#3,3:132\n1869#3,2:135\n1869#3,2:137\n1869#3,2:139\n*S KotlinDebug\n*F\n+ 1 GroupCard.kt\ncom/kubi/kucoin/home/cards/group/GroupCard\n*L\n59#1:132,3\n113#1:135,2\n120#1:137,2\n126#1:139,2\n*E\n"})
public abstract class GroupCard extends BaseCard {

    /* JADX INFO: renamed from: V */
    @Nullable
    public LinearLayout f27891V;

    @NotNull
    /* JADX INFO: renamed from: f3 */
    public abstract CardFlowParser mo29089f3();

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return 0;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) throws IllegalAccessException, InstantiationException {
        Class<?> clsM32216a;
        Intrinsics.checkNotNullParameter(data, "data");
        LinearLayout linearLayout = this.f27891V;
        if (linearLayout != null) {
            m32213h3();
            linearLayout.removeAllViews();
            GroupCardData groupCardData = data instanceof GroupCardData ? (GroupCardData) data : null;
            if (groupCardData != null) {
                linearLayout.setOrientation(groupCardData.getOrientation());
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = ExtensionKt.m32188n(groupCardData.getWidth());
                    layoutParams.height = ExtensionKt.m32188n(groupCardData.getHeight());
                }
                if (groupCardData.getBg()) {
                    linearLayout.setShowDividers(2);
                    linearLayout.setDividerDrawable(new ColorDrawable(linearLayout.getResources().getColor(R$color.c_divider8)));
                    linearLayout.setDividerPadding(InterpolatorC42155b.m92540c(16.0f));
                    linearLayout.setBackgroundResource(R$drawable.shape_overlay_8r);
                }
                List<BaseCardData> children = groupCardData.getChildren();
                if (children != null) {
                    int i11 = 0;
                    for (Object obj : children) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        BaseCardData baseCardData = (BaseCardData) obj;
                        int iGenerateViewId = View.generateViewId();
                        Context context = linearLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
                        fragmentContainerView.setId(iGenerateViewId);
                        linearLayout.addView(fragmentContainerView, m32212g3(linearLayout.getOrientation(), baseCardData, i11, groupCardData));
                        String type = baseCardData.getType();
                        if (type == null || type.length() == 0) {
                            Object objNewInstance = getClass().newInstance();
                            ((GroupCard) objNewInstance).m32166d3(baseCardData);
                            Unit unit = Unit.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(objNewInstance, "apply(...)");
                            ExtensionKt.m32187m(this, iGenerateViewId, (Fragment) objNewInstance, null, 4, null);
                        } else {
                            ClassMapping classMapping = mo29089f3().m32209k().get(baseCardData.getType());
                            Object objNewInstance2 = (classMapping == null || (clsM32216a = classMapping.m32216a()) == null) ? null : clsM32216a.newInstance();
                            BaseCard baseCard = objNewInstance2 instanceof BaseCard ? (BaseCard) objNewInstance2 : null;
                            if (baseCard != null) {
                                baseCard.m32166d3(baseCardData);
                                Unit unit2 = Unit.INSTANCE;
                                ExtensionKt.m32187m(this, iGenerateViewId, baseCard, null, 4, null);
                            }
                        }
                        i11 = i12;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final LinearLayout.LayoutParams m32212g3(int i11, BaseCardData baseCardData, int i12, GroupCardData groupCardData) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ExtensionKt.m32188n(baseCardData.getWidth()), ExtensionKt.m32188n(baseCardData.getHeight()));
        layoutParams.weight = baseCardData.getWeight();
        if (i11 == 1) {
            if (i12 > 0 && !groupCardData.getBg()) {
                layoutParams.topMargin = InterpolatorC42155b.m92540c(10.0f);
            }
            if (layoutParams.weight > 0.0f) {
                layoutParams.height = 0;
                return layoutParams;
            }
        } else {
            if (i12 > 0 && !groupCardData.getBg()) {
                layoutParams.setMarginStart(InterpolatorC42155b.m92540c(10.0f));
            }
            if (layoutParams.weight > 0.0f) {
                layoutParams.width = 0;
            }
        }
        return layoutParams;
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    @NotNull
    public View onCustomCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f27891V = linearLayout;
        return linearLayout;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        ICard iCard;
        super.mo28981P();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof ICard) {
                iCard = (ICard) activityResultCaller;
            } else {
                iCard = null;
            }
            if (iCard != null) {
                iCard.mo28981P();
            }
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        ICard iCard;
        super.mo28982Q();
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof ICard) {
                iCard = (ICard) activityResultCaller;
            } else {
                iCard = null;
            }
            if (iCard != null) {
                iCard.mo28982Q();
            }
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final void m32213h3() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (Fragment fragment : fragments) {
            Intrinsics.checkNotNull(fragment);
            ExtensionKt.m32185k(this, fragment);
        }
    }
}
