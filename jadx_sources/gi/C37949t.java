package gi;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.futures.trade.position.adapter.v0;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p640ti.C45030e;
import p640ti.InterfaceC45033h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: gi.t */
/* JADX INFO: compiled from: PositionShareAnimator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u000f\u0018\u00002\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0002J\"\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J \u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0012H\u0002J\u0018\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006("}, m90084d2 = {"Lcom/kubi/futures/share/PositionShareAnimator;", "", "<init>", "()V", "tag", "", "TIME_INTERVAL", "", "mAnimatorCache", "Ljava/util/HashMap;", "Lcom/kubi/futures/share/PositionShareAnimator$AnimatorTimeRecord;", "Lkotlin/collections/HashMap;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mScrollListener", "com/kubi/futures/share/PositionShareAnimator$mScrollListener$1", "Lcom/kubi/futures/share/PositionShareAnimator$mScrollListener$1;", "registerRecyclerViewScroll", "", "recyclerView", "clear", "onBindViewHolder", "itemView", "Landroid/view/View;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "onClick", "onStateOfIdle", "onStateOfScroll", "findRecyclerViewVisibleRange", "playAnimation", "isClick", "", "setImageTint", "shareView", "Landroidx/appcompat/widget/AppCompatImageView;", "record", "stopAnimator", "check", "AnimatorTimeRecord", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionShareAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionShareAnimator.kt\ncom/kubi/futures/share/PositionShareAnimator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1869#2,2:193\n*S KotlinDebug\n*F\n+ 1 PositionShareAnimator.kt\ncom/kubi/futures/share/PositionShareAnimator\n*L\n166#1:193,2\n*E\n"})
public final class C37949t {

    /* JADX INFO: renamed from: d */
    @Nullable
    public RecyclerView f85355d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f85352a = "PositionShareAnimator";

    /* JADX INFO: renamed from: b */
    public final long f85353b = 60000;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final HashMap<String, a> f85354c = new HashMap<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public final b f85356e = new b();

    /* JADX INFO: renamed from: gi.t$a */
    /* JADX INFO: compiled from: PositionShareAnimator.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/share/PositionShareAnimator$AnimatorTimeRecord;", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "animator", "Landroid/animation/ObjectAnimator;", "lastTime", "", "hasClick", "", "<init>", "(Landroid/view/View;Landroid/animation/ObjectAnimator;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "getAnimator", "()Landroid/animation/ObjectAnimator;", "setAnimator", "(Landroid/animation/ObjectAnimator;)V", "getLastTime", "()Ljava/lang/Long;", "setLastTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getHasClick", "()Ljava/lang/Boolean;", "setHasClick", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public View f85357a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public ObjectAnimator f85358b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Long f85359c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Boolean f85360d;

        public a(@NotNull View view, @Nullable ObjectAnimator objectAnimator, @Nullable Long l11, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f85357a = view;
            this.f85358b = objectAnimator;
            this.f85359c = l11;
            this.f85360d = bool;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ObjectAnimator getF85358b() {
            return this.f85358b;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getF85360d() {
            return this.f85360d;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getF85359c() {
            return this.f85359c;
        }

        /* JADX INFO: renamed from: d */
        public final void m85795d(@Nullable ObjectAnimator objectAnimator) {
            this.f85358b = objectAnimator;
        }

        /* JADX INFO: renamed from: e */
        public final void m85796e(@Nullable Boolean bool) {
            this.f85360d = bool;
        }

        /* JADX INFO: renamed from: f */
        public final void m85797f(@Nullable Long l11) {
            this.f85359c = l11;
        }

        public /* synthetic */ a(View view, ObjectAnimator objectAnimator, Long l11, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, (i11 & 2) != 0 ? null : objectAnimator, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : bool);
        }
    }

    /* JADX INFO: renamed from: gi.t$b */
    /* JADX INFO: compiled from: PositionShareAnimator.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/futures/share/PositionShareAnimator$mScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.OnScrollListener {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                C37949t.this.m85786h(recyclerView);
            } else {
                C37949t.this.m85787i(recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m85780k(C37949t c37949t, PositionEntity positionEntity, View view, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c37949t.m85788j(positionEntity, view, z11);
    }

    /* JADX INFO: renamed from: f */
    public final void m85784f(@NotNull View itemView, @NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(position, "position");
        RecyclerView recyclerView = this.f85355d;
        if (recyclerView == null || recyclerView.getScrollState() != 0) {
            return;
        }
        m85780k(this, position, itemView, false, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m85785g(@NotNull View itemView, @NotNull PositionEntity position) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(position, "position");
        m85788j(position, itemView, true);
    }

    /* JADX INFO: renamed from: j */
    public final void m85788j(PositionEntity positionEntity, View view, boolean z11) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R$id.share);
        if (appCompatImageView != null && C27046k.m66704s(appCompatImageView)) {
            a aVar = this.f85354c.get(C27041f.m66668h(positionEntity.getId()));
            if (aVar == null) {
                aVar = new a(appCompatImageView, null, null, null, 14, null);
            }
            if (z11) {
                aVar.m85796e(Boolean.TRUE);
                this.f85354c.put(C27041f.m66668h(positionEntity.getId()), aVar);
            }
            ObjectAnimator f85358b = aVar.getF85358b();
            if (f85358b != null) {
                f85358b.end();
            }
            if (!m85781c(aVar, positionEntity)) {
                m85790m(appCompatImageView, aVar, positionEntity);
                return;
            }
            appCompatImageView.setImageTintList(ColorStateList.valueOf(C27017c.f54310a.m66512a(R$color.primary)));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, "alpha", 1.0f, 0.3f, 1.0f, 0.3f, 1.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.start();
            HashMap<String, a> map = this.f85354c;
            String strM66668h = C27041f.m66668h(positionEntity.getId());
            aVar.m85795d(objectAnimatorOfFloat);
            aVar.m85797f(Long.valueOf(System.currentTimeMillis()));
            map.put(strM66668h, aVar);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m85789l(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f85355d = recyclerView;
        recyclerView.addOnScrollListener(this.f85356e);
    }

    /* JADX INFO: renamed from: n */
    public final void m85791n() {
        if (this.f85354c.isEmpty()) {
            return;
        }
        Set<Map.Entry<String, a>> setEntrySet = this.f85354c.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            ObjectAnimator f85358b = ((a) ((Map.Entry) it.next()).getValue()).getF85358b();
            if (f85358b != null) {
                f85358b.end();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85781c(a aVar, PositionEntity positionEntity) {
        if (!C27025c.m66566d(aVar.getF85360d()) && C27039d.m66656p(positionEntity.getUnrealisedRoePcnt()).compareTo(new BigDecimal("0.5")) >= 0 && System.currentTimeMillis() - C27039d.m66652l(aVar.getF85359c()) > this.f85353b) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m85782d() {
        m85791n();
        this.f85354c.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m85783e(RecyclerView recyclerView) {
        v0 v0Var;
        C45030e c45030e;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0) {
            v0 adapter = recyclerView.getAdapter();
            if (adapter instanceof v0) {
                v0Var = adapter;
            } else {
                v0Var = null;
            }
            if (v0Var != null) {
                if (iFindLastVisibleItemPosition > v0Var.getItemCount() - 1) {
                    iFindLastVisibleItemPosition = v0Var.getItemCount() - 1;
                }
                if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                    return;
                }
                while (true) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null) {
                        InterfaceC45033h interfaceC45033hL = v0Var.l(iFindFirstVisibleItemPosition);
                        if (interfaceC45033hL instanceof C45030e) {
                            c45030e = (C45030e) interfaceC45033hL;
                        } else {
                            c45030e = null;
                        }
                        if (c45030e != null) {
                            m85780k(this, c45030e.getF101404a(), viewFindViewByPosition, false, 4, null);
                        }
                    }
                    if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                        iFindFirstVisibleItemPosition++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m85786h(RecyclerView recyclerView) {
        m85783e(recyclerView);
    }

    /* JADX INFO: renamed from: i */
    public final void m85787i(RecyclerView recyclerView) {
        m85791n();
    }

    /* JADX INFO: renamed from: m */
    public final void m85790m(AppCompatImageView appCompatImageView, a aVar, PositionEntity positionEntity) {
        int i11;
        if (!C27025c.m66566d(aVar.getF85360d()) && this.f85354c.containsKey(C27041f.m66668h(positionEntity.getId()))) {
            i11 = R$color.primary;
        } else {
            i11 = R$color.c_icon;
        }
        appCompatImageView.setImageTintList(ColorStateList.valueOf(C27017c.f54310a.m66512a(i11)));
    }
}
