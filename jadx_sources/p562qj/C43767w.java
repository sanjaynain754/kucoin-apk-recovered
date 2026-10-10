package p562qj;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.home.R$mipmap;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.sdk.InnerViewHolder;
import com.kubi.utils.extensions.C27040e;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qj.w */
/* JADX INFO: compiled from: ShakeAnimationManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u001a\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u0007H\u0007J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\fH\u0007J\u0014\u0010\"\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0016\u0010#\u001a\u00020\u00172\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\fH\u0002J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0007H\u0002R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/ShakeAnimationManager;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "", "<init>", "()V", "value", "", "isShaking", "()Z", "shakeAnimators", "", "Landroid/view/View;", "Landroid/animation/ObjectAnimator;", "closeSize", "", ViewProps.MARGIN, "closeDrawable", "Landroid/graphics/drawable/Drawable;", "closeRect", "Landroid/graphics/Rect;", "cardViewTag", "startShakeAnimation", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", FirebaseAnalytics.Param.ITEMS, "", "selectedHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setShakeAnimationForView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "doShake", "checkShake", "stopShakeAnimation", "handleShakeStateForAttachedView", C33954u6.f72238i, "Lcom/kubi/sdk/InnerViewHolder;", "getItemAlpha", "", "data", "stopShakeForView", "startShakeForView", "updateDecorate", "shake", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShakeAnimationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShakeAnimationManager.kt\ncom/kubi/home/v2/container/ui/ShakeAnimationManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1869#2,2:217\n1#3:219\n*S KotlinDebug\n*F\n+ 1 ShakeAnimationManager.kt\ncom/kubi/home/v2/container/ui/ShakeAnimationManager\n*L\n99#1:217,2\n*E\n"})
public final class C43767w<T extends BaseCardDataV2> {

    /* JADX INFO: renamed from: a */
    public boolean f96772a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<View, ObjectAnimator> f96773b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final int f96774c;

    /* JADX INFO: renamed from: d */
    public final int f96775d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Drawable f96776e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Rect f96777f;

    /* JADX INFO: renamed from: g */
    public final int f96778g;

    /* JADX INFO: renamed from: g */
    public final void m96429g(View view) {
        m96432j(view, true);
        ObjectAnimator objectAnimator = this.f96773b.get(view);
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", -0.6f, 0.6f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setStartDelay((long) (Math.random() * ((double) 200)));
        this.f96773b.put(view, objectAnimatorOfFloat);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m96423e(C43767w c43767w, View view, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c43767w.m96427d(view, z11);
    }

    @UiThread
    /* JADX INFO: renamed from: a */
    public final boolean m96424a(@NotNull View view) {
        ObjectAnimator objectAnimator;
        Intrinsics.checkNotNullParameter(view, "view");
        return this.f96773b.containsKey(view) && (objectAnimator = this.f96773b.get(view)) != null && objectAnimator.isRunning();
    }

    /* JADX INFO: renamed from: b */
    public final float m96425b(BaseCardDataV2 baseCardDataV2) {
        return (!this.f96772a || baseCardDataV2.getDraggable()) ? 1.0f : 0.2f;
    }

    @UiThread
    /* JADX INFO: renamed from: c */
    public final void m96426c(@NotNull InnerViewHolder<T> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        T data = holder.m57940b().getData();
        if (data == null) {
            return;
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.setRotation(0.0f);
        itemView.setAlpha(m96425b(data));
        if (this.f96772a && data.getDraggable()) {
            m96429g(itemView);
        } else {
            m96431i(itemView);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: d */
    public final void m96427d(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f96772a) {
            if (z11) {
                m96429g(view);
            } else {
                m96431i(view);
            }
        }
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public final void m96428f(@NotNull RecyclerView recyclerView, @NotNull List<BaseCardDataV2> items, @Nullable RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(items, "items");
        if (this.f96772a) {
            return;
        }
        this.f96772a = true;
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
            int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
            if (bindingAdapterPosition != -1 && bindingAdapterPosition >= 0 && bindingAdapterPosition < items.size()) {
                BaseCardDataV2 baseCardDataV2 = items.get(bindingAdapterPosition);
                if (baseCardDataV2.getDraggable()) {
                    if (Intrinsics.areEqual(viewHolder, childViewHolder)) {
                        Intrinsics.checkNotNull(childAt);
                        m96432j(childAt, false);
                    } else {
                        Intrinsics.checkNotNull(childAt);
                        m96429g(childAt);
                    }
                }
                childAt.setAlpha(m96425b(baseCardDataV2));
            }
        }
    }

    @UiThread
    /* JADX INFO: renamed from: h */
    public final void m96430h(@Nullable RecyclerView recyclerView) {
        if (this.f96772a) {
            this.f96772a = false;
            Iterator<T> it = this.f96773b.values().iterator();
            while (it.hasNext()) {
                ((ObjectAnimator) it.next()).cancel();
            }
            this.f96773b.clear();
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    childAt.setRotation(0.0f);
                    childAt.setAlpha(1.0f);
                    Intrinsics.checkNotNull(childAt);
                    m96432j(childAt, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m96431i(View view) {
        ObjectAnimator objectAnimator = this.f96773b.get(view);
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f96773b.remove(view);
        view.setRotation(0.0f);
        m96432j(view, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m96432j(View view, boolean z11) {
        CardView cardView = (CardView) view.findViewWithTag(Integer.valueOf(this.f96778g));
        if (cardView == null) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            cardView = childAt instanceof CardView ? (CardView) childAt : null;
            if (cardView != null) {
                cardView.setTag(Integer.valueOf(this.f96778g));
            } else {
                cardView = null;
            }
        }
        if (this.f96776e == null) {
            this.f96776e = ContextCompat.getDrawable(view.getContext(), R$mipmap.home_card_delete_icon);
        }
        if (z11) {
            if (cardView != null) {
                C43766v.f96768a.m96422c(cardView, false);
                Drawable drawable = this.f96776e;
                if (drawable != null) {
                    drawable.setBounds(this.f96777f);
                    view.getOverlay().add(drawable);
                    return;
                }
                return;
            }
            return;
        }
        ViewOverlay overlay = view.getOverlay();
        if (overlay != null) {
            overlay.clear();
        }
        if (cardView != null) {
            if (this.f96772a) {
                C43766v.f96768a.m96422c(cardView, true);
            } else {
                cardView.setCardElevation(0.0f);
            }
        }
    }

    public C43767w() {
        int iM66658b = C27040e.m66658b(20);
        this.f96774c = iM66658b;
        int iM66658b2 = C27040e.m66658b(7);
        this.f96775d = iM66658b2;
        this.f96777f = new Rect(-iM66658b2, -iM66658b2, iM66658b - iM66658b2, iM66658b - iM66658b2);
        this.f96778g = View.generateViewId();
    }
}
