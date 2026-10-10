package ld0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import java.util.Collection;
import md0.C42513d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import uc0.C45152a;

/* JADX INFO: renamed from: ld0.e */
/* JADX INFO: compiled from: GiftCategoryViewPagerManager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager;", "", "<init>", "()V", "giftClickListener", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$GiftClickListener;", "setGiftClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "createSingleCategoryView", "Landroid/view/View;", "context", "Landroid/content/Context;", "category", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "columns", "", "GiftClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42175e {

    /* JADX INFO: renamed from: a */
    @Nullable
    public a f93631a;

    /* JADX INFO: renamed from: ld0.e$a */
    /* JADX INFO: compiled from: GiftCategoryViewPagerManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$GiftClickListener;", "", "onClick", "", ViewProps.POSITION, "", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo79633a(int i11, @NotNull Gift gift);
    }

    /* JADX INFO: renamed from: ld0.e$b */
    /* JADX INFO: compiled from: GiftCategoryViewPagerManager.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"com/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager$createSingleCategoryView$1", "Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftPanelAdapter$OnItemClickListener;", "onItemClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", ViewProps.POSITION, "", "pageIndex", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements C42513d.a {
        public b() {
        }

        @Override // md0.C42513d.a
        /* JADX INFO: renamed from: a */
        public void mo92606a(View view, Gift gift, int i11, int i12) {
            Intrinsics.checkNotNullParameter(gift, "gift");
            a aVar = C42175e.this.f93631a;
            if (aVar != null) {
                aVar.mo79633a(i11, gift);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m92604b(@NotNull Context context, @NotNull GiftCategory category, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(category, "category");
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.gift_layout_category_content, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.rv_gifts);
        recyclerView.setLayoutManager(new GridLayoutManager(context, i11));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = C45152a.m99799a(228.0f);
        recyclerView.setLayoutParams(layoutParams);
        C42513d c42513d = new C42513d(0, CollectionsKt.toMutableList((Collection) category.getGiftList()), context);
        recyclerView.setAdapter(c42513d);
        c42513d.setOnItemClickListener(new b());
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public final void m92605c(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f93631a = listener;
    }
}
